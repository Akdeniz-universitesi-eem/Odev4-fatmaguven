import java.awt.Component;

import javax.swing.JOptionPane;

public class soru3 {


	public static void main(String[] args) {
		
			JOptionPane.showMessageDialog(null,"Enter a password below");
			String password=JOptionPane.showInputDialog(args);
			String errorMessage = null;
			
			if (password.length() < 8) {
	            errorMessage = "Şifre en az 8 karakter olmalıdır.";
	        } else if (password.length() > 95) {
	            errorMessage = "Şifre 95 karakterden uzun olamaz.";
	        } else if (!password.matches(".*[a-zA-Z].*")) {
	            errorMessage = "Şifre en az 1 harf içermelidir.";
	        } else if (!password.matches(".*\\d.*")) {
	            errorMessage = "Şifre en az 1 rakam içermelidir.";
	        } else if (password.startsWith(" ") || password.endsWith(" ")) {
	            errorMessage = "Şifre başlangıçta veya sonunda boşluk içeremez.";
	        } else if (!password.matches(".*[!@#$%^&*()_+\\-=\\[\\]{};':\",.<>/?].*")) {
	            errorMessage = "Şifre en az 1 özel karakter içermelidir.";
	        }
			
	        if (errorMessage == null) {
	            JOptionPane.showMessageDialog(null, "Şifre geçerlidir.");
	        } else {
	            JOptionPane.showMessageDialog(null, errorMessage);
	        }
		
			
		
		
		

	}

}
