public enum Aweek {
MANDAY("duishombi", ""),
TUESDAY("sheishembi", "практика и ангилиский"),
    WEDNESDAY("sharshembi", "технический урок"),
    THURSDAY("beishembi", " практика"),
    FRIDAY("juma", "жавв тех"),
    SATURDAY("ishembi", "практика "),
    SUNDAY("jekshembi", "вых");

    private String nema;
    private String lesson;



    Aweek(String nema, String s) {
        this.nema = nema;
        this.lesson = lesson;
    }
        public void metod(){
        System.out.println("java");


    }

    @Override
    public String toString() {
        return "Aweek{" +
                "nema='" + nema + '\'' +
                ", lesson='" + lesson + '\'' +
                '}';
    }
}


