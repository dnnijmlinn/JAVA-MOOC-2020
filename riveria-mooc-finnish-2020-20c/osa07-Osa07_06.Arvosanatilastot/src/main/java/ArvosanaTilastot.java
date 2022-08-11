import java.util.ArrayList;

public class ArvosanaTilastot {

    private ArrayList<Integer> points;

    public ArvosanaTilastot() {
        this.points = new ArrayList<>();
    }

    public void lisaa(int point) {
        this.points.add(point);
    }

    public double keskiArvo() {
        double summa = 0.0;
        for (Integer point : points) {
            summa += point;
        }
        return summa / this.points.size();
    }

    public double lapiKeskiArvo() {
        double lapSumma = 0.0;
        int amountOfLap = 0;
        for (Integer point : points) {
            if (point >= 50) {
                lapSumma += point;
                amountOfLap++;
            }
        }
        if (amountOfLap != 0) {
            return lapSumma / amountOfLap;
        }
        return 0.0;
    }

    public double lapiProsentti() {
        int amountOfLap = 0;
        for (Integer point : points) {
            if (point >= 50) {
                amountOfLap++;
            }
        }
        return ((1.0 * amountOfLap) / this.points.size()) * 100;
    }

    public void arvJakauma() {
        ArrayList<Integer> arvosanat = new ArrayList<>();
        for (Integer point : points) {
            if (point < 50) {
                arvosanat.add(0);
            } else if (point < 60) {
                arvosanat.add(1);
            } else if (point < 70) {
                arvosanat.add(2);
            } else if (point < 80) {
                arvosanat.add(3);
            } else if (point < 90) {
                arvosanat.add(4);
            } else {
                arvosanat.add(5);
            }
        }
        for (int i = 5; i >= 0; i--) {
            System.out.println(i + ": " + tahdet(arvosanat,i));
        }
    }

    private String tahdet(ArrayList<Integer> arvosanat, int number) {
        String tahti = "";
        for (Integer arvosana : arvosanat) {
            if(arvosana==number) {
                tahti+="*";
            }
        }
        return tahti;
    }

    public double passingPointsAverage() {
        double sumOfPassingPoints = 0.0;
        int countOfPassingPoints = 0;
        for (Integer point : points) {
            if (point >= 50) {
                sumOfPassingPoints += point;
                countOfPassingPoints++;
            }
        }
        if (countOfPassingPoints != 0) {
            return sumOfPassingPoints / countOfPassingPoints;
        }
        return 0.0;
    }

}