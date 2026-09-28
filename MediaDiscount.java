import javax.swing.JOptionPane;
public class MediaDiscount {
    public static void main(String[] args) {
        String strCost=JOptionPane.showInputDialog("Enter the cost of the media:");
        double Cost =Double.parseDouble(strCost);
        if (Cost>20) {
            System.out.println("Discouted");
        } else {
            System.out.println("full price");
        }


    }
    
}
