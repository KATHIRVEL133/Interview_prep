class Devices
{
    public void showTemp(String temp)
    {
        System.out.println("Temperature is: "+temp);
    }
}


class WithoutObserver
{
    private String temp;
    private Devices device;
    public WithoutObserver(Devices device)
    {
        this.device = device;
    }
    public void setTemp(String temp)
    {
        this.temp = temp;
        notifyDevice(temp);
    }
    public void notifyDevice(String temp)
    {
        device.showTemp(temp);
    }
}
public class MainObserver {
    

    public static void main(String[] args) {
        WithoutObserver withoutObserver = new WithoutObserver(new Devices());
        withoutObserver.setTemp("30C");
        withoutObserver.setTemp("32C");
    }
}
