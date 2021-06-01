package com.springboot.web;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
//import java.io.FileNotFoundException;
//import java.io.IOException;
import java.util.List;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.apache.commons.io.IOUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.WebContext;
import javax.servlet.ServletContext;

import com.springboot.model.Experience;
import com.springboot.model.Favoris;
import com.springboot.model.Logement;
import com.springboot.model.Reclamation;
import com.springboot.model.ReclamationTraite;
import com.springboot.model.Reservation;
import com.springboot.repository.ExperienceRepository;
import com.springboot.repository.FavorisRepository;
import com.springboot.repository.LogementRepository;
import com.springboot.repository.ReclamationRepository;
import com.springboot.repository.ReservationRepository;
import com.springboot.repository.MailRepository;
import com.springboot.repository.RecTraiteRepository;
import com.springboot.model.Mail;
import com.itextpdf.html2pdf.ConverterProperties;
import com.itextpdf.html2pdf.HtmlConverter;
import com.itextpdf.io.source.ByteArrayOutputStream;
import com.springboot.RegistrationLoginSpringBootSecurityThymeleafApplication;
@Controller
public class MainController {
	@Autowired 
	private RegistrationLoginSpringBootSecurityThymeleafApplication registrationLoginSpringBootSecurityThymeleafApplication;
	@Autowired
	private MailRepository mailRepository;
	@Autowired
	private LogementRepository logementRepository;

	@Autowired
	private ReservationRepository reservationRepository;
	@Autowired
	private ReclamationRepository reclamationRepository;
	@Autowired
	private FavorisRepository favorisRepository;
	@Autowired
	private RecTraiteRepository recTraiteRepository;

	
	TemplateEngine templateEngine;
	ServletContext servletContext;
//	    @RequestMapping("/")
//	    public String index() {
//	        return "org";
//	    }
	
	
	  @Value("${x}") private String imageDir;
	  
	//repondre reclamation
	  @RequestMapping(value="/repondreR",method=RequestMethod.GET)
		 public String FormRepondre(@Valid ReclamationTraite tr,@Valid Reclamation rec,Model model,Long id,String email,String objet,String message) {
			 model.addAttribute("mail",new Mail(email,objet));
			 recTraiteRepository.save(new ReclamationTraite(email,objet,message));
			 supprimerR(id);
			 //reclamationRepository.deleteById(id);
			 
		
			
		 return "mail";
		 }
			
		@RequestMapping(value="/sendemail",method=RequestMethod.POST)
		public String save(@Valid ReclamationTraite tr,@Valid Mail mail,BindingResult bindingResult) {
			  if(bindingResult.hasErrors()) {
				  return "mail"; }
			  mailRepository.save(mail);
			  //recTraiteRepository.save(tr);
			 
			  registrationLoginSpringBootSecurityThymeleafApplication.sendEmail(mail);
			  return "redirect:indexR"; 
			}
//		@RequestMapping(value="/pdf",method=RequestMethod.POST)
//		public String pdf(Model model) throws IOException{
//
//			HtmlConverter.convertToPdf(new File(""
//					+ "C:\\Users\\Pc\\Desktop\\ApplicationLocation\\src\\main\\resources\\templates\\confirmation.html"),
//					new File("confirmation.pdf"));
//			return "redirect:confirmation";
//			}
<<<<<<< HEAD
		

=======
<<<<<<< HEAD
		

=======
	
>>>>>>> branch 'main' of https://github.com/EMI-PI-s4-grp8/ApplicationLocation.git
>>>>>>> branch 'main' of https://github.com/EMI-PI-s4-grp8/ApplicationLocation.git
//		@RequestMapping(path = "/")
//	    public String getOrderPage(Model model) throws IOException {
////	        Order order = OrderHelper.getOrder()
////	        model.addAttribute("orderEntry", order);
////	        return "order";
//			Logement logement=new Logement();
//			 model.addAttribute("logement", logement);
//			        return "logement";
//	    }
		@RequestMapping(path = "/pdf")
	    public ResponseEntity<?> getPDF(HttpServletRequest request, HttpServletResponse response) throws IOException {

	        /* Do Business Logic*/

//	        //Order order = OrderHelper.getOrder();
//			Logement logement=new Logement();
//
//	        /* Create HTML using Thymeleaf template Engine */
//
//        WebContext context = new WebContext(request, response, servletContext);
//        context.setVariable("logement", logement);
//	        String orderHtml = templateEngine.process("confirmation", context);

	        /* Setup Source and target I/O streams */

	        ByteArrayOutputStream target = new ByteArrayOutputStream();

	        /*Setup converter properties. */
	        ConverterProperties converterProperties = new ConverterProperties();
	        converterProperties.setBaseUri("http://localhost:8084");

	        /* Call convert method */
	       // HtmlConverter.convertToPdf(orderHtml, target, converterProperties);  
//	        HtmlConverter.convertToPdf(new File(
//	        		"C:\\Users\\Pc\\Desktop\\ApplicationLocation\\src\\main\\resources\\templates\\confirmation.html"),
////					new File("confirmation.pdf"));
	        HtmlConverter.convertToPdf(new File(
	        		"C:\\Users\\Pc\\Desktop\\ApplicationLocation\\src\\main\\resources\\templates\\confirmation.html"),
					new File("confirmation.pdf"));
	        //HtmlConverter.convertToPdf(orderHtml,target, converterProperties);
	        /* extract output as bytes */
	        byte[] bytes = target.toByteArray();


	        /* Send the response as downloadable PDF */

	        return ResponseEntity.ok()
	                .contentType(MediaType.APPLICATION_PDF)
	                .body(bytes);

	    }
<<<<<<< HEAD

=======
<<<<<<< HEAD

=======
	 
>>>>>>> branch 'main' of https://github.com/EMI-PI-s4-grp8/ApplicationLocation.git
>>>>>>> branch 'main' of https://github.com/EMI-PI-s4-grp8/ApplicationLocation.git
		public String dispo(Model model,
				
					@RequestParam(name="page",defaultValue="0")int p,
					@RequestParam(name="size",defaultValue="3")int s,
					@RequestParam(name="motCle",defaultValue="")String mc) {
		  
		  model.addAttribute("reservation", new Reservation());
				if (mc==null) {
					Page<Logement> pageLogements=logementRepository.findAll(PageRequest.of(p, s));
					model.addAttribute("listLogements",pageLogements.getContent());
					int[] pages=new int[pageLogements.getTotalPages()];
					model.addAttribute("pages",pages);
					model.addAttribute("size",s);
					model.addAttribute("pageCourante",p);
					return "dispo";
					}
				else {

				}
					List<Logement> pageLogements=
							logementRepository.chercher("%"+mc+"%");
					model.addAttribute("listLogements",pageLogements);
							model.addAttribute("motCle",mc);
			
				return "dispo";
			
			
		}

	  @GetMapping("/shopMap")
		public String getShopMap(Model model) {
			model.addAttribute("contents", "shopMap :: shop_map");
			return "homeLayout";
		}
	
	@GetMapping("/app")
	public String home() {
		return "app";
	}
	
//	//repondre reclamation
//		@RequestMapping(value="/repondreR",method=RequestMethod.GET)
//		 public String FormRepondre(Model model,String email,String objet) {
//			 model.addAttribute("mail",new Mail(email,objet));
//		 return "mail";
//		 }
//			
//		@RequestMapping(value="/sendemail",method=RequestMethod.POST)
//		public String save(@Valid Mail mail,BindingResult bindingResult) {
//			  if(bindingResult.hasErrors()) {
//				  return "mail"; }
//			  mailRepository.save(mail);
//			  registrationLoginSpringBootSecurityThymeleafApplication.sendEmail(mail);
//			  return "redirect:indexR"; 
//			}	 
		
//////////////////////reclamation
@RequestMapping(value="/formR",method=RequestMethod.GET)
 	public String FormReclamation(Model model) {
	model.addAttribute("reclamation",new Reclamation());
	return "reclamation";
}

@RequestMapping(value="/saveR",method=RequestMethod.POST)
public String save(@Valid Reclamation reclamation,BindingResult bindingResult) {
if(bindingResult.hasErrors()) {
	return "reclamation"; }
reclamationRepository.save(reclamation);
return "reclamation"; }	 

@RequestMapping(value="/indexR")
public String indexR(Model model,
		@RequestParam(name="page",defaultValue="0")int p,
		@RequestParam(name="size",defaultValue="30")int s
		) {
	
		Page<Reclamation> pageReclamations=reclamationRepository.findAll(PageRequest.of(p, s));
		model.addAttribute("listReclamations",pageReclamations.getContent());
		
		//
		List<ReclamationTraite> pageReclamationTraite=recTraiteRepository.chercherRT();
		model.addAttribute("listReclamationTraite",pageReclamationTraite);
//		int[] pageT=new int[pageReclamations.getTotalPages()];
//		model.addAttribute("pages",pageT);
//		model.addAttribute("size",s);
//		model.addAttribute("pageCourante",p);
		//List<ReclamationTraite> listRT=recTraiteRepository.chercherRT();
		//model.addAttribute("listReclamationTraite",listRT);
		int[] pages=new int[pageReclamations.getTotalPages()];
		model.addAttribute("pages",pages);
		model.addAttribute("size",s);
		model.addAttribute("pageCourante",p);
		return "rechercheR";
		}
@RequestMapping(value="/supprimerR")
public String supprimerR(Long id) {
reclamationRepository.deleteById(id);
return "redirect:indexR";
}
@RequestMapping(value="/supprimerRT")
public String supprimerRT(Long id) {
	recTraiteRepository.deleteById(id);
	return "redirect:indexR";
}	

	
	@GetMapping("/accueil")
	public String accueil() {
		return "accueil";
	}
	@RequestMapping(value="/")
	public String test(Model model,
			@RequestParam(name="page",defaultValue="0")int p,
			@RequestParam(name="size",defaultValue="3")int s,
			@RequestParam(name="motCle",defaultValue="")String mc) {
		model.addAttribute("reservation", new Reservation());
		if (mc==null) {
			Page<Logement> pageLogements=logementRepository.findAll(PageRequest.of(p, s));
			model.addAttribute("listLogements",pageLogements.getContent());
			int[] pages=new int[pageLogements.getTotalPages()];
			model.addAttribute("pages",pages);
			model.addAttribute("size",s);
			model.addAttribute("pageCourante",p);
			return "affichageLog";
			}
		else {
			List<Logement> pageLogements=
					logementRepository.chercher("%"+mc+"%");
			model.addAttribute("listLogements",pageLogements);
					model.addAttribute("motCle",mc);
			return "org";
			
		}
		
	}
	@RequestMapping(value="/log",method=RequestMethod.GET)
	public String formtest(Model model) {
		model.addAttribute("reservation", new Reservation());
		return "log";
	}

	/*
	 * @GetMapping("/") public String test(Model model) {
	 * 
	 * model.addAttribute("reservation", new Reservation()); return "index"; }
	 */

	@RequestMapping(value="/form",method=RequestMethod.GET)
	public String formLogement(Model model) {
		model.addAttribute("logement", new Logement());
		return "logement";
	}

				
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public String savePic(@Valid Logement logement,@RequestParam(name="picture")MultipartFile file,BindingResult bindingResult) throws Exception{
		if(bindingResult.hasErrors()) {
			return "logement"; }
		if(!(file.isEmpty())) {
			logement.setImage(file.getOriginalFilename());
			logementRepository.save(logement);
			registrationLoginSpringBootSecurityThymeleafApplication.sendConfirm(logement);
			 file.transferTo(new File(imageDir+logement.getId())); 
						}
		
		return "confirmation";
	}

	
	
	  @RequestMapping(value="/getPhoto",produces=MediaType.IMAGE_JPEG_VALUE)
	  
	  @ResponseBody public byte[] getPhoto(Long id) throws Exception { 
		  File f=new File(imageDir+id);
		  return IOUtils.toByteArray(new FileInputStream(f)); }
	  
	
	@RequestMapping(value="/affichageLog")
	public String affichageLog(Model model,
			@RequestParam(name="page",defaultValue="0")int p,
			@RequestParam(name="size",defaultValue="3")int s,
			@RequestParam(name="motCle",defaultValue="")String mc) {
		if (mc==null) {
			Page<Logement> pageLogements=logementRepository.findAll(PageRequest.of(p, s));
			model.addAttribute("listLogements",pageLogements.getContent());
			int[] pages=new int[pageLogements.getTotalPages()];
			model.addAttribute("pages",pages);
			model.addAttribute("size",s);
			model.addAttribute("pageCourante",p);
			return "affichageLog";
			}
		else {
			List<Logement> pageLogements=
					logementRepository.chercher("%"+mc+"%");
			model.addAttribute("listLogements",pageLogements);
					model.addAttribute("motCle",mc);
			return "affichageLog";
			
		}
		
	}
	 @GetMapping("/edit")
	  public String edit(Model model ,Long id) {
		  Logement logement=logementRepository.findById(id).get();
		  model.addAttribute("logement",logement);
		  return "logementEditf"; 
	  }
	  

	  
	  

		@RequestMapping(value="/formReserv",method=RequestMethod.GET)
		public String formReservation(Model model,Long id) {
			Logement logement=logementRepository.findById(id).get();
			model.addAttribute("logement", new Logement());

			model.addAttribute("reservation", new Reservation());
			return "reservationLogement";
		}
		
	
		@RequestMapping(value="/paiement",method=RequestMethod.POST)
		public String save(Model model,Reservation reservation) throws MessagingException, IOException {
			registrationLoginSpringBootSecurityThymeleafApplication.sendConfirmReser(reservation);
			reservationRepository.save(reservation);
			return "home";//confirmation
		}
		
		@RequestMapping(value="/Confirm",method=RequestMethod.GET)
		public String confirm(Model model,Long id) {
			Logement logement=logementRepository.findById(id).get();
			model.addAttribute("logement", new Logement());

			model.addAttribute("reservation", new Reservation());
			return "reservationConfirm";
		}
		
		@RequestMapping(value="/AffichageReserv")
		public String Affichage(Model model,
				@RequestParam(name="page",defaultValue="0")int pa,
				@RequestParam(name="size",defaultValue="3")int si)
				{
				Page<Reservation> pageReservations=reservationRepository.findAll(PageRequest.of(pa, si));
				model.addAttribute("listReservs",pageReservations.getContent());
				int[] pages=new int[pageReservations.getTotalPages()];
				model.addAttribute("pages",pages);
				model.addAttribute("size",si);
				model.addAttribute("pageCourante",pa);
				return "AffichageReserv";
				}
	  
		 @GetMapping("/deleteReserv")
		  public String deleteReserv(Long id) {
			  reservationRepository.deleteById(id);
			  return "redirect:/AffichageReserv"; 
		  }
		  
		  @GetMapping("/editReserv")
		  public String editReserv(Model model ,Long id) {
			  Reservation reservation=reservationRepository.findById(id).get();
			  model.addAttribute("reservation",reservation);
			  return "reservationEdit"; 
		  }
//		  @RequestMapping(value="/index1")
//			public String index(Model model,
//					@RequestParam(name="page",defaultValue="0")int p,
//					@RequestParam(name="size",defaultValue="3")int s,
//					@RequestParam(name="motCle",defaultValue="")String mc) {
//				if (mc==null) {
//					Page<Logement> pageLogements=logementRepository.findAll(PageRequest.of(p, s));
//					model.addAttribute("listProduits",pageLogements.getContent());
//					int[] pages=new int[pageLogements.getTotalPages()];
//					model.addAttribute("pages",pages);
//					model.addAttribute("size",s);
//					model.addAttribute("pageCourante",p);
//					return "recherche";
//					}
//				else {
//					List<Logement> pageLogements=
//							logementRepository.chercher("%"+mc+"%");
//					model.addAttribute("listLogements",pageLogements);
//					//int[] pages=new int[pageProduits.getTotalPages()];
//					//model.addAttribute("pages",pages);
//					//model.addAttribute("size",s);
//					//model.addAttribute("pageCourante",p);
//					model.addAttribute("motCle",mc);
//					return "recherche";
//					
//				}
//			
//			}

		  
		  @GetMapping("/delete")
		  public String delete(Long id) {
			  logementRepository.deleteById(id);
			  return "redirect:/index1"; 
		  
	
}
//		  @RequestMapping(value="/",method=RequestMethod.GET)
//			public String formReservation(Model model,Long id) {
//				Logement logement=logementRepository.findById(id).get();
//				model.addAttribute("logement", new Logement());
//
//				model.addAttribute("favoris", new Favoris());
//				return "redirect:/index";
//			}
//			
//		
//			@RequestMapping(value="/",method=RequestMethod.POST)
//			public String save(Model model,Favoris favoris) {
//					
//				reservationRepository.save(favoris);
//				return "redirect:/index";//confirmation
//			}
//		  

		  @RequestMapping(value="/AffichageFavoris")
			public String AffichageFavoris(Model model,
					@RequestParam(name="page",defaultValue="0")int pag,
					@RequestParam(name="size",defaultValue="3")int siz)
					{
					Page<Favoris> pageFavoris=favorisRepository.findAll(PageRequest.of(pag, siz));
					model.addAttribute("ListFavoris",pageFavoris.getContent());
					int[] pages=new int[pageFavoris.getTotalPages()];
					model.addAttribute("pages",pages);
					model.addAttribute("size",siz);
					model.addAttribute("pageCourante",pag);
					return "ListFavoris";
					}


		  @GetMapping("/deleteFavoris")
		  public String deleteFavois(Long id) {
			  favorisRepository.deleteById(id);
			  return "redirect:/AffichageFavoris"; 
		  }
		  @GetMapping("/homePRO")
		  public String homePRO(){
			
			  return "homePRO"; 
		  }
		  

		  @RequestMapping(value="/index1")
			public String index(Model model,
					@RequestParam(name="page",defaultValue="0")int p,
					@RequestParam(name="size",defaultValue="3")int s,
					@RequestParam(name="motCle",defaultValue="")String mc) {
				if (mc==null) {
					Page<Logement> pageLogements=logementRepository.findAll(PageRequest.of(p, s));
					model.addAttribute("listProduits",pageLogements.getContent());
					int[] pages=new int[pageLogements.getTotalPages()];
					model.addAttribute("pages",pages);
					model.addAttribute("size",s);
					model.addAttribute("pageCourante",p);
					return "proprietairehome";
					}
				else {
					List<Logement> pageLogements=
							logementRepository.chercher("%"+mc+"%");
					model.addAttribute("listLogements",pageLogements);
					//int[] pages=new int[pageProduits.getTotalPages()];
					//model.addAttribute("pages",pages);
					//model.addAttribute("size",s);
					//model.addAttribute("pageCourante",p);
					model.addAttribute("motCle",mc);
					return "proprietairehome";
					
				}
			
			}
		 

		  
//		  @GetMapping("/delete")
//		  public String delete(Long id) {
//			  logementRepository.deleteById(id);
//			  return "redirect:/index1"; 
//		  
//	
//}
//		  

		  
//////////////////////Experiences
@Autowired
ExperienceRepository experienceRepository ;

@RequestMapping(value="/formExp",method=RequestMethod.GET)
public String FormExperience(Model model) {
model.addAttribute("experience",new Experience());
return "experience";
}

@RequestMapping(value="/saveExp")
public String save(Model model , @Valid Experience experience,BindingResult bindingResult) {
if(bindingResult.hasErrors()) {
return "experience"; }


experienceRepository.save(experience);

return "redirect:indexExp"; }	 

@RequestMapping(value="/indexExp")
public String indexExp(Model model,
@RequestParam(name="page",defaultValue="0")int p,
@RequestParam(name="size",defaultValue="30")int s
) {

Page<Experience> pageExperiences=experienceRepository.findAll(PageRequest.of(p, s));
model.addAttribute("listExperiences",pageExperiences.getContent());
int[] pages=new int[pageExperiences.getTotalPages()];
model.addAttribute("pages",pages);
model.addAttribute("size",s);
model.addAttribute("pageCourante",p);
return "rechercheExp";
}

@RequestMapping(value="/supprimerExp")
public String supprimerExp(Long id) {
experienceRepository.deleteById(id);
return "redirect:indexExp";
}

@GetMapping("/modifierExp")
public String modifierExp(Model model ,Long id) {

//public String modifierExp(@Valid Experience experience,BindingResult bindingResult) {
//if(bindingResult.hasErrors()) {
//return "experience"; }
//experienceRepository.save(experience);
//return "experience"; 

Experience experience=experienceRepository.findById(id).get();

//  Logement logement=logementRepository.findById(id).get();

model.addAttribute("experience",experience);
return "ExperienceEdit"; 
}


@RequestMapping(value="/supprimerttExp")
public String supprimerttExp() {
experienceRepository.deleteAll();;
return "redirect:indexExp";
}




}
