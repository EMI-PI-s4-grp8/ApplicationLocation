package com.springboot;


import com.springboot.model.Reservation;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;

import com.springboot.model.Logement;
import com.springboot.model.Mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.mail.javamail.JavaMailSender;
import java.io.File;
import java.io.IOException;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.FileSystemResource;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

@SpringBootApplication
public class RegistrationLoginSpringBootSecurityThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistrationLoginSpringBootSecurityThymeleafApplication.class, args);
	}
	@Autowired
    private JavaMailSender javaMailSender;
	
//	public void sendEmail(Mail mail) {
//
//        SimpleMailMessage msg = new SimpleMailMessage();
//        msg.setTo(mail.getEmail());
//
//        msg.setSubject(mail.getObjet());
//        msg.setText(mail.getText());
//
//        javaMailSender.send(msg);
//
//    }
	public void sendEmail(Mail mail) {

        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo(mail.getEmail());

        msg.setSubject(mail.getObjet());
        msg.setText(mail.getText());

        javaMailSender.send(msg);

    }
	public void sendConfirmA(Logement logement) {
		
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setTo("zakariabouaouda1@gmail.com");
        
        msg.setSubject(logement.getIntitule());
        String htmlCode="<h1>Confirmation de votre annonce de logement</h1>"
        		+ "<p>merci pour votre confiance</p>";
        //msg.setContent(htmlCode,"text/html");
        msg.setText("vous avez bien enregistré votre logement"+logement.getIntitule());

        javaMailSender.send(msg);

    }

	public void sendConfirm(Logement logement) throws MessagingException, IOException {

        MimeMessage msg = javaMailSender.createMimeMessage();

        // true = multipart message
        MimeMessageHelper helper = new MimeMessageHelper(msg, true);

        helper.setTo("zakariabouaouda1@gmail.com");

        helper.setSubject("Confirmation d'ajout de votre annonce: ");

        // default = text/plain
        //helper.setText("Check attachment for image!");

        // true = text/html
        helper.setText("<h1>Félications! vous avez ajouté une nouvelle annonce !</br>"
        		+ "Vous etes maintenant un locataire dans Fintbat !"
        		+ "</h1>"
        		
        		+ "<!DOCTYPE html>\r\n" + 
        		"<html xmlns=\"http://www.w3.org/1999/xhtml\"\r\n" + 
        		"    xmlns:th=\"http://www.thymeleaf.org\"\r\n" + 
        		"    xmlns:sec=\"http://www.thymeleaf.org\">\r\n" + 
        		"<head>\r\n" + 
        		"<meta charset=\"UTF-8\">\r\n" + 
        		"<title>Confirmation</title>  \r\n" + 
        		"<!-- Bootstrap CSS -->\r\n" + 
        		"    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" \r\n" + 
        		"    integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" \r\n" + 
        		"    crossorigin=\"anonymous\">\r\n" + 
        		"    \r\n" + 
        		"<body style=\"background-color: #ededed;\">\r\n" 
        		+ 
        		
        		"    <div class=\"jumbotron\">\r\n" + 
        		"        <div class=\"container\">\r\n" + 
        		"          <h1 class=\"display-3\">Opération reussi!</h1>\r\n" + 
        		"          <p>l'enregistrement de votre annonce a été bien effectué !</p>\r\n" + 
        		"          <p><a class="+"btn btn-primary btn-lg"+" href=\"https://location-app-monolithic.herokuapp.com/login\" role=\"button\">ajouter nouvelle annonce</a></p>\r\n" + 
        		"        </div>\r\n" + 
        		"      </div>\r\n" + 
        		"	\r\n" + 
        		"				\r\n" + 
        		"<!-- START THE FEATURETTES -->\r\n" + 
        		"<div class=\"container\">\r\n" + 
        		"	\r\n" + 
        		"          <div class=\"col\">\r\n" + 
        		"              <div class=\"card-body\">\r\n" + 
        		"                <h5 class=\"card-title\">Informations de l'annonce:</h5>\r\n" + 
        		"                <div>\r\n" 
        		+ 
        		"          <div >\r\n" + 
        		"            <label class=\"control-label\">Intitulé de logement:</label>\r\n" + 
        		"            <label><b> " +logement.getIntitule()+"</b></label>\r\n" + 
        		"          </div>\r\n" + 
        		"          <div >\r\n" + 
        		"            <label class=\"control-label\">Description:</label>\r\n" + 
        		"            <label > <b>"+logement.getDescription()+"</b></label>\r\n" + 
        		"          </div>\r\n" + 
        		"          <div >\r\n" + 
        		"            <label class=\"control-label\">Prix:</label>\r\n" + 
        		"            <label> <b>"+logement.getPrix()+"</b></label>\r\n" + 
        		"          </div>\r\n" + 
        		"          <div >\r\n" + 
        		"            <label class=\"control-label\">Adresse:</label>\r\n" + 
        		"            <label> <b>"+logement.getAdresse()+"</b></label>\r\n" + 
        		"          </div>\r\n" + 
        		"          <div class=\"form-group\">\r\n" + 
        		"            <label class=\"control-label\">Capacite:</label>\r\n" + 
        		"            <label> <b>"+logement.getCapacite()+"</b></label>\r\n" + 
        		"          </div>\r\n" + 
        		"          \r\n" + 
        		"              </div>\r\n" + 
        		"            </div>\r\n" + 
        		"          </div>\r\n" + 
        		 
        		"            <label class=\"control-label\">FinTbat</label>\r\n" + 
        		"            <label  class=\"control-label\">"+"<svg class=\"bd-placeholder-img card-img-top\" width=\"100%\" height=\"100%\" xmlns=\"http://www.w3.org/2000/svg\" \r\n" + 
        				"              role=\"img\" aria-label=\"Placeholder: Image cap\" preserveAspectRatio=\"xMidYMid slice\" focusable=\"false\">\r\n" + 
        				"             <img class=\"img-thumbnail\" th:src=\"@{getPhoto(id=${logement.id})}\" /></svg>"+"</label>\r\n" + 
        		"          </div>\r\n"+
        		"</div>", true);

		// hard coded a file path
       // FileSystemResource file = new FileSystemResource(new File("‪C:/Users/Pc/Pictures/bane.PNG"));

       // helper.addAttachment("bane.PNG", file);

        javaMailSender.send(msg);

    }
	public void sendConfirmReser(Reservation reservation) throws MessagingException, IOException {

        MimeMessage msg = javaMailSender.createMimeMessage();

        // true = multipart message
        MimeMessageHelper helper = new MimeMessageHelper(msg, true);

        helper.setTo(reservation.getEmail());

        helper.setSubject("Confirmation de reservation : ");

        // default = text/plain
        //helper.setText("Check attachment for image!");

        // true = text/html
        helper.setText("<h1>Félications! vous avez réservé un logement !</br>"
        		+ "Vous etes maintenant un client dans Fintbat !"
        		+ "</h1>"
        + "<!DOCTYPE html>\r\n" + 
		"<html xmlns=\"http://www.w3.org/1999/xhtml\"\r\n" + 
		"    xmlns:th=\"http://www.thymeleaf.org\"\r\n" + 
		"    xmlns:sec=\"http://www.thymeleaf.org\">\r\n" + 
		"<head>\r\n" + 
		"<meta charset=\"UTF-8\">\r\n" + 
		"<title>Confirmation de reservation:</title>  \r\n" + 
		"<!-- Bootstrap CSS -->\r\n" + 
		"    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\" \r\n" + 
		"    integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" \r\n" + 
		"    crossorigin=\"anonymous\">\r\n" + 
		"    \r\n" + 
		"<body style=\"background-color: #ededed;\">\r\n" 
		+ 
		
		"    <div class=\"jumbotron\">\r\n" + 
		"        <div class=\"container\">\r\n" + 
		"          <h1 class=\"display-3\">Opération reussi!</h1>\r\n" + 
		"          <p>l'enregistrement de votre annonce a été bien effectué !</p>\r\n" + 
		"          <p><a class="+"btn btn-primary btn-lg"+" href=\"https://location-app-monolithic.herokuapp.com/login\" role=\"button\">Retourner à FinTbat</a></p>\r\n" + 
		"        </div>\r\n" + 
		"      </div>\r\n" + 
		"	\r\n" + 
		"				\r\n" + 
		"<!-- START THE FEATURETTES -->\r\n" + 
		"<div class=\"container\">\r\n" + 
		"	\r\n" + 
		"          <div class=\"col\">\r\n" + 
		"              <div class=\"card-body\">\r\n" + 
		"                <h5 class=\"card-title\">Informations de Reservation:</h5>\r\n" + 
		"                <div>\r\n" 
		+ 
		"          <div >\r\n" + 
		"            <label >Nombre de personnes:</label>" + 
		"            <label><b> " +reservation.getNumber_of_room()+"</b></label>\r\n" + 
		"          </div>\r\n" + 
		"          <div >\r\n" + 
		"            <label >Tel :</label>\r\n" + 
		"            <label > <b>"+reservation.getNumero_telephone()+"</b></label>\r\n" + 
		"          </div>\r\n" + 
		"          <div >\r\n" + 
"            <label >Date arrivée :</label>\r\n" + 
"            <label> <b>"+reservation.getArrival_date()+"</b></label>\r\n" + 
"          </div>\r\n" + 

"          <div >\r\n" + 
"            <label >Date départ :</label>\r\n" + 
"            <label> <b>"+reservation.getDeparture_date()+"</b></label>\r\n" + 
"          </div>\r\n" + 
	
		"              </div>\r\n" + 
		"            </div>\r\n" + 
		"          </div>\r\n" + 
		 
		"            <label >FinTbat</label>\r\n" + 
		
		"</div>", true);

// hard coded a file path
// FileSystemResource file = new FileSystemResource(new File("‪C:/Users/Pc/Pictures/bane.PNG"));

// helper.addAttachment("bane.PNG", file);

javaMailSender.send(msg);

    }
}
