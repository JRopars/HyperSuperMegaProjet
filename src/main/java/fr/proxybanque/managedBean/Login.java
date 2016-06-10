package fr.proxybanque.managedBean;
 

import java.io.Serializable;
import java.sql.SQLException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import com.sun.tools.ws.processor.model.Request;

import fr.proxybanque.dao.GerantDAO;
import fr.proxybanque.dao.IClientDAO;
import fr.proxybanque.dao.conseillerDAO;
import fr.proxybanque.model.Conseiller;
 
@ManagedBean(name="Login")
@SessionScoped
public class Login implements Serializable {

	private String pwd;
    private String user;
 
//    @Autowired
//	private conseillerDAO conseillerDAO;
//    @Autowired
//	private GerantDAO gerantDAO;
 
    public String getPwd() {
        return pwd;
    }
 
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
 
    public String getUser() {
        return user;
    }
 
    public void setUser(String user) {
        this.user = user;
    }
 
    //validate login
    public String validateGerant() throws SQLException {
    	
    	FacesContext context = FacesContext.getCurrentInstance();
    	
         GerantDAO gerantDAO = new GerantDAO();
        boolean valid = gerantDAO.isExistGerant(user, pwd);
        System.out.println("--------------------------------------------------------------->"+valid);
        if (valid==true) {
        	
        	System.out.println("*************************************************111111");
        	
        	context.getExternalContext().getSessionMap().put("login", user);
        	context.getExternalContext().getSessionMap().put("password", pwd);
        	System.out.println("*************************************************2222222");
//            HttpSession session = SessionBean.getSession();
//            session.setAttribute("username", user);
            return "test1";
        } else {
            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Incorrect Username and Passowrd",
                            "Please enter correct username and Password"));
            return "index";
        }
    }
    
    public String validateConseiller() throws SQLException {
    	
    	FacesContext context = FacesContext.getCurrentInstance();
    	
        conseillerDAO conseillerDAO = new conseillerDAO();
        boolean valid = conseillerDAO.isExistConseiller(user, pwd);
        if (valid==true) {
        	
        	context.getExternalContext().getSessionMap().put("login", user);
        	context.getExternalContext().getSessionMap().put("password", pwd);
//            HttpSession session = SessionBean.getSession();
//            session.setAttribute("username", user);
            return "test2";
        } else {
            FacesContext.getCurrentInstance().addMessage(
                    null,
                    new FacesMessage(FacesMessage.SEVERITY_WARN,
                            "Incorrect Username and Passowrd",
                            "Please enter correct username and Password"));
            return "index";
        }
    }
    
    //logout event, invalidate session
    public String logout() {
    	 FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
//        HttpSession session = SessionBean.getSession();
//        session.invalidate();
        return "index";
    }

}