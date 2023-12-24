package com.user.registration;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import org.jasypt.encryption.pbe.StandardPBEStringEncryptor;

/**
 * Servlet implementation class EncryptingURLServlet
 */
@WebServlet("/registrationServlet")
public class EncryptingURLServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Get parameters from the request
        String name = request.getParameter("name");
        String phone = request.getParameter("phone");
        String city = request.getParameter("city");
        String emailId = request.getParameter("emailId");
        
     // Encrypt parameters using Jasypt
        String encryptedName = encrypt(name);
        String encryptedPhone = encrypt(phone);
        String encryptedCity = encrypt(city);
        String encryptedEmailId = encrypt(emailId);
        
        System.out.println("Decrypted Name: " + decrypt(encryptedName));
        System.out.println("Decrypted Phone: " + decrypt(encryptedPhone));
        System.out.println("Decrypted City: " + decrypt(encryptedCity));
        System.out.println("Decrypted EmailId: " + decrypt(encryptedEmailId));
        
        private String encrypt(String value) {
            StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
            encryptor.setPassword("yourEncryptionPassword");
            return encryptor.encrypt(value);
        }

        
        private String decrypt(String encryptedValue) {
            StandardPBEStringEncryptor encryptor = new StandardPBEStringEncryptor();
            encryptor.setPassword("yourEncryptionPassword");
            return encryptor.decrypt(encryptedValue);
        }
        
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
