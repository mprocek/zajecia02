class Z2monitorMain {
    public static void main(String[] args){
        Z2monitor monitor = new Z2monitor("Philips", 20.5, true);
        Z2monitor monitor2 = new Z2monitor("Samsung", 22, false);

        System.out.println(monitor.marka+" "+monitor.cale+" "+monitor.czySprawny);
        System.out.println(monitor2.marka+" "+monitor2.cale+" "+monitor2.czySprawny);

    }
}
