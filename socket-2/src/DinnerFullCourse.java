public class DinnerFullCourse {

    private Dish[] list = new Dish[5]; // [0]-[4]の計5個

    public static void main(String[] args) {
        DinnerFullCourse fullcourse = new DinnerFullCourse();
        fullcourse.eatAll();
    }

    DinnerFullCourse() {
        list[0] = new Dish();
        list[0].setName("大トロマグロ");
        list[0].setValune(180);
        list[1] = new Dish();
        list[1].setName("炙りチーズサーモン");
        list[1].setValune(120);
        list[2] = new Dish();
        list[2].setName("いくら");
        list[2].setValune(180);
        list[3] = new Dish();
        list[3].setName("えび");
        list[3].setValune(120);
        list[4] = new Dish();
        list[4].setName("天ぷらそば");
        list[4].setValune(300);
    }

    void eatAll() {
        String str = "";

        for (Dish element : list) {
            str += element.getName() + "（" + element.getValune() + "円）";
        }

        System.out.println("いらっしゃいませ！ご注文は以下の通りです。" + str + "です。");
    }
}
