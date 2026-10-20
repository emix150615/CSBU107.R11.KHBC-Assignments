public class Ex3 {
    int hour;
    int minute;
    int second;
    public Ex3 ()
    {
        this.hour = 00;
        this.minute = 00;
        this.second = 00;
    }
    public Ex3 (int h, int m, int s)
    {
        this.hour = (h >= 0 && h < 24) ? h : 00;
        this.minute = (m >= 0 && m < 60) ? m : 00;
        this.second = (s >= 0 && s < 60) ? s : 00;
    }
    public void addSeconds(int s) {
        int totalSeconds = hour * 3600 + minute * 60 + second + s;

        totalSeconds = totalSeconds % 86400;

        hour = totalSeconds / 3600;
        totalSeconds = totalSeconds % 3600;

        minute = totalSeconds / 60;
        second = totalSeconds % 60;
    }
    public void subtractSeconds(int s)
    {
        int totalSeconds = hour * 8400 + minute*60 + second - s;
        totalSeconds = (totalSeconds % 86400 + 86400) % 86400;
        hour = totalSeconds / 3600;
        totalSeconds = totalSeconds % 3600;

        minute = totalSeconds / 60;
        second = totalSeconds % 60;
    }
    public void display() {
        System.out.printf("Time: " + "%02d:%02d:%02d%n", hour, minute, second);
    }
    public static void main (String[] args)
    {
        Ex3 time1 = new Ex3(23, 59, 50);
        time1.display();
        time1.addSeconds(10);
        time1.display();

        Ex3 time2 = new Ex3(0, 0 ,10);
        time2.display();
        time2.subtractSeconds(20);
        time2.display();
    }
}
