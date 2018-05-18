class Z2monitorMain {
    public static void main(String[] args){
        Z2monitor monitor = new Z2monitor();
        monitor.marka="Philips";
        monitor.cale=20.5;
        monitor.czySprawny=true;

        Z2monitor monitor2 = new Z2monitor();
        monitor2.marka="Samsung";
        monitor2.cale=22;
        monitor2.czySprawny=false;

        System.out.println(monitor.marka+" "+monitor.cale+" "+monitor.czySprawny);
        System.out.println(monitor2.marka+" "+monitor2.cale+" "+monitor2.czySprawny);

    }
}
