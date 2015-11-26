package com.spring.logic;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import javax.mail.Part;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;

import ts.Common.util.Common;

import com.hibernate.bean.Usertb;
import com.hibernate.bean.Yzxxb;
import com.hibernate.daoEXP.UsertbDAOEXP;
import com.hibernate.daoEXP.YzxxbDAOEXP;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


public class login extends ActionSupport implements
ServletRequestAware,ServletResponseAware {
/**
*
*/
private static final int BUFFER_SIZE = 16 * 1024;
private static final long serialVersionUID = 1L;
private UsertbDAOEXP usertbDAO;
private HttpServletRequest request;
private HttpServletResponse response;
private File user;
private String userFileName;
private String userContentType;
private File pic;
private String picFileName;
private String picContentType;


public File getPic() {
	return pic;
}

public void setPic(File pic) {
	this.pic = pic;
}

public UsertbDAOEXP getUsertbDAO() {
	return usertbDAO;
}

public void setUsertbDAO(UsertbDAOEXP usertbDAO) {
	this.usertbDAO = usertbDAO;
}

public  File getUser() {
	return user;
}

public void setUser(File user) {
	this.user = user;
}

public String getUserFileName() {
	return userFileName;
}

public void setUserFileName(String userFileName) {
	this.userFileName = userFileName;
}

public String getUserContentType() {
	return userContentType;
}

public void setUserContentType(String userContentType) {
	this.userContentType = userContentType;
}

public void setServletRequest(HttpServletRequest request) {
this.request=request;
}

public void setServletResponse(HttpServletResponse response) {
this.response=response;
}
public void on() throws IOException{
		
		
		//获得用户名
		String name = request.getParameter("username");
		//获得密码
		String pwd = request.getParameter("password");
		System.out.println(name+"  "+pwd);
		//Usertb usertb =new Usertb();
		//usertb.setUsername(name);
		List<Usertb> list = usertbDAO.findByUsername(name);
		if(list.size()!=0){
			Usertb tb = list.get(0);
			String b = tb.getUsername();
			//if(b.equals(name) && pwd1.equals(pwd)){
				//生成安全码
				response.setCharacterEncoding("utf-8");
				response.getWriter().write("00");
				response.getWriter().flush();
				response.getWriter().close();
			//}
			
		}
	  }

	public void scwj() throws IOException{
		System.out.println("connect successful!!!");
		File file = getPic();
		File userfile =getUser();
        String u="e:\\user.txt";
		String s ="e:\\pic.jpg";

		//String s =ServletActionContext.getServletContext().getRealPath("\\"+"pic.jpg");
        File user1 = new File(u);
		File afile = new File(s);
		afile.getName();
        user1.getName();
		InputStream in;
		OutputStream out;
		try {
			in=new FileInputStream(file);
			out =new FileOutputStream(afile);
			
			byte [] buffer = new byte [BUFFER_SIZE];
			
				while(in.read(buffer)>0){
					out.write(buffer);
				}
				in.close();
				out.close();}catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

		try{
            InputStreamReader read = new InputStreamReader(new FileInputStream(userfile),"utf-8");       
            BufferedReader reader=new BufferedReader(read);     
			OutputStreamWriter write = new OutputStreamWriter(new FileOutputStream(user1),"utf-8");      
	        BufferedWriter writer=new BufferedWriter(write); 
			//byte [] buffer = new byte [BUFFER_SIZE];
			String line;
				while ((line = reader.readLine()) != null )  {
					writer.write(line);

				}
				reader.close();
				writer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} 
	public void arraydp() throws IOException{
		String fileTypes=request.getParameter("fileTypes");
		String[]typeArray=fileTypes.substring(1).split("\\.");//将文件类型字符串拆分成String数组
		
		try {
			Iterator<javax.servlet.http.Part>iterator=request.getParts().iterator();
			int count=0;
			while (iterator.hasNext()) {//遍历客户端上传的所有文件				
				if (count>=typeArray.length)break;//如果超出文件类型数组的大小则跳出循环		
				Part part = (Part) iterator.next();				
//						System.out.println("part.getSize()"+part.getSize());//获取上传文件的大小
//						System.out.println("part.getName()"+part.getName());//获取上传文件的名及添加数据时的key名
				File file=new File("E:\\upload\\"+count+"."+typeArray[count++]);
				InputStream inputStream=part.getInputStream();
				FileOutputStream fos=new FileOutputStream(file);
				byte[]buffer=new byte[1024];
				int len=0;
				while ((len=inputStream.read(buffer))!=-1) {
					fos.write(buffer,0, len);
				}
				inputStream.close();
				fos.close();					
			}
		}catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();}
	}
	public void register() throws IOException{
		String username=request.getParameter("username");
		String pswd =request.getParameter("pswd");
		String dhhm=request.getParameter("dhhm");
		String sex=request.getParameter("sex");
		String mail=request.getParameter("mail");
		Usertb usertb =new Usertb();
		usertb.setUsername(username);
		usertb.setPwd(pswd);
		usertb.setMailad(mail);
		usertb.setDhhm(dhhm);
		usertbDAO.save(usertb);
		List<Usertb> list=usertbDAO.findByUsername(username);
		String username1=list.get(0).getUsername();
		
		if(!username.equals(""))
		{
			response.setCharacterEncoding("utf-8");
			response.getWriter().write("01");
			response.getWriter().flush();
			response.getWriter().close();
			System.out.println("注册成功");
			
		}
		
		
		
		
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
			
		
		
	  }
	

	
		
		
		
		
		
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
		
			
		
		
	  
	private YzxxbDAOEXP yzxxbDAO;
	
	public YzxxbDAOEXP getYzxxbDAO() {
		return yzxxbDAO;
	}
	
	public void setYzxxbDAO(YzxxbDAOEXP yzxxbDAO) {
		this.yzxxbDAO = yzxxbDAO;
	}

}
