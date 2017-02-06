import javax.swing.*;

/*0-6 år åker gratis
7-19 år (Barn) åker för 14 kr
20-25 år (Ungdom) åker för 28 kr
26-64 år (Vuxen) åker för 34 kr
65 + (Pensionär) åker för 28 kr
*/
public class javanumberone {

    //Tar in åldern och om den inte är ett tal så blir talen 999
    public static int inputage() {
        int age = 0;
        String ageST = JOptionPane.showInputDialog(null, "vad är din ålder");
        try {
            age = Integer.parseInt(ageST);
        } catch (NumberFormatException e) {
            age = 999;
        }
        return age;
    }

    //Hur mycket man ska betala för sin biljet.
    public static int biljetpris(int age) {
        int pris = 0;

        if ((age >= 0) && (age <= 6)) {
            pris = 0;
        } else if ((age > 7) && (age <= 19)) {
            pris = 14;
        } else if ((age > 19) && (age <= 25)) {
            pris = 28;
        } else if ((age > 25) && (age <= 64)) {
            pris = 34;
        } else if ((age > 65) && (age < 200)) {
            pris = 28;
        } else {
            //Om pris kommer hit så tilldelas den 999 och får ett felmedelande
            pris = 999;
            JOptionPane.showMessageDialog(null, "Felaktig ålder, starta om för ett nytt försök");

        }
        return pris;
    }


    public static void main(String[] args) {
        int prisFinal;
        prisFinal = biljetpris(inputage());


        //Om den inte kostar något så är den gratis
        //Om priset inte är 999, så visar den en ruta för priset
        if (prisFinal == 0) {
            JOptionPane.showMessageDialog(null, "Din resa är gratis");
        } else if (prisFinal != 999) {
            JOptionPane.showMessageDialog(null, "Din resa kostar " + prisFinal);
        }

    }
}

