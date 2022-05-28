package registration;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class Registration {

    public static void main(String[] args) {
        Registration_Form form=new Registration_Form();
        try
        {
        UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        form.setVisible(true);
        
    }
    
}
