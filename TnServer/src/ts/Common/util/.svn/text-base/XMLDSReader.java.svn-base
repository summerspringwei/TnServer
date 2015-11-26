package ts.Common.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
/**
 * @author jiangjun
 * 时间：2013-09-22
 */
public class XMLDSReader {

	private String xmlName;		//配置文件名称
	private String nodeName;		//接点名称
	private Element connection;	//根接点
	private Element node;			//子接点
	
	public XMLDSReader(String xmlName,String nodeName){
		this.xmlName=xmlName;
		this.nodeName=nodeName;
		this.getDocument();
	}
	
	/*
	 * 得到配置文件路径 ***********************************************************
	 */
	public String getFileURL(){
		/* //非windows系统   
        if(File.separator.equals("/")){   
        	//----用于linux环境-----
    		String sd = XMLDSReader.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        	String opt = sd.substring(0,sd.indexOf("classes"))+"applicationContext.xml";
    		return opt;
        }else{
        	//------用于windows环境-----
    		String sd = XMLDSReader.class.getProtectionDomain().getCodeSource().getLocation().getPath();
        	*/String opt = "E:\\Program Files\\Apache Software Foundation\\Tomcat 6.0\\webapps\\TnServer\\WEB-INF\\applicationContext.xml";
    		return opt;
        //}
		
	}
	
	/*
	 * 得到配置文件根接点 *********************************************************
	 */
	public void getDocument(){
		/*SAXBuilder builder=new SAXBuilder();
		try {
			System.out.println("datasource file path======="+this.getFileURL());
			Document document=builder.build(this.getFileURL());
			this.connection=document.detachRootElement();
			System.out.println("this.connection============="+this.connection);
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}*/
	}
	
	/*
	 * 得到配置文件子接点 *********************************************************
	 */
	public void getNodeByName(Element element,String nodeName) {
		/*System.out.println("element===="+element+"===nodeName==="+nodeName);
		List list = element.getChildren();
		for (Iterator iter = list.iterator(); iter.hasNext();) {
			Element et = (Element) iter.next();
			if (et.getName().equals(nodeName)){
				this.node=et;
				break;
			}
			if (et instanceof Element) {
				getNodeByName(et, nodeName);
			}
		}	*/
	}

	/*
	 * 得到配置文件信息bean类 *****************************************************
	 */
	public ConfigBean getConfig(){
		//this.getNodeByName(this.connection, this.nodeName);
		String encoding="GBK";
		File fl=new File(getFileURL());
        String lineTxt = null;
        int i = 0;
		try {
			 InputStreamReader read = new InputStreamReader(new FileInputStream(fl),encoding);
		        BufferedReader bufferedReader = new BufferedReader(read);
		        while(i<33){
		        	lineTxt += bufferedReader.readLine();
		        	i++;
		        }
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		lineTxt=lineTxt.replaceAll(" ", "");
		lineTxt=lineTxt.replaceAll("\n", "");
		lineTxt=lineTxt.replaceAll("\t", "");
		lineTxt = lineTxt.substring(lineTxt.indexOf("driverClassName\"value=\"")+23);
		String driver = lineTxt.substring(0,lineTxt.indexOf("\">"));
		lineTxt = lineTxt.substring(lineTxt.indexOf("url\"value=")+11);
		String url = lineTxt.substring(0,lineTxt.indexOf("\">"));
		lineTxt = lineTxt.substring(lineTxt.indexOf("username\"value=")+16);
		String username = lineTxt.substring(0,lineTxt.indexOf("\">"));
		lineTxt = lineTxt.substring(lineTxt.indexOf("password\"value=")+16);
		String password = lineTxt.substring(0,lineTxt.indexOf("\">"));
		ConfigBean bean=new ConfigBean();
		bean.setUsername(username);
		bean.setPassword(password);
		bean.setDriver(driver);
		bean.setUrl(url);
		return bean;
	}
	
	/*
	 * xml配置文件bean类(内部类)
	 */
	public class ConfigBean {
		
		private String username;
		private String password;
		private String driver;
		private String url;
		public String getDriver() {
			return driver;
		}
		public void setDriver(String driver) {
			this.driver = driver;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
	}
	
	public static void main(String[] args) {
		XMLDSReader reader=new XMLDSReader("datasource.xml","jdbc_default");
		System.out.println(reader.getConfig().getUsername());
		System.out.println(reader.getConfig().getPassword());
		System.out.println(reader.getConfig().getDriver());
		System.out.println(reader.getConfig().getUrl());
	}
}

