package com.course.action;

import java.util.*;

import javax.annotation.Resource;

import java.io.*;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import java.util.List;

import com.course.entity.Coursetype;
import com.course.service.ICoursetypeManage;
import com.course.util.ExportExcelUtil;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;


public class CoursetypeAction extends ActionSupport  {
	
	private InputStream excelFile;
	private Coursetype coursetype;
	private List<Coursetype> coursetypes;
	
	@Resource
	private ICoursetypeManage coursetypeManage;
		
	public Coursetype getCoursetype() {
		return coursetype;
	}

	public void setCoursetype(Coursetype coursetype) {
		this.coursetype = coursetype;
	}

	public List<Coursetype> getCoursetypes() {
		return coursetypes;
	}

	public void setCoursetypes(List<Coursetype> coursetypes) {
		this.coursetypes = coursetypes;
	}

	public ICoursetypeManage getCoursetypeManage() {
		return coursetypeManage;
	}

	public void setCoursetypeManage(ICoursetypeManage coursetypeManage) {
		this.coursetypeManage = coursetypeManage;
	}
	

	public String addCoursetype()
	{
		System.out.println("-------CoursetypeAction add------");
		if(coursetypeManage!=null){
			coursetypeManage.addCoursetype(coursetype);
		}
		else{
			System.out.println("coursetypeManage is null");
		}
		return "success";
	}
	
	public String deleteCoursetype()
	{
		coursetypeManage.deleteCoursetype(coursetype);
		return "success";
	}
	
	public String modifyCoursetype()
	{
		coursetypeManage.modifyCoursetype(coursetype);
		return "success";
	}
	
	public String getAllCoursetypes(){
		coursetypes = coursetypeManage.getAllCoursetypes();
		return "allcoursetype";
	}
	
	
	public String QueryCoursetypeOutputToExcel(){
		coursetypes = new ArrayList<Coursetype>();
		coursetypes = coursetypeManage.getAllCoursetypes();
		
		ExportExcelUtil ex = new ExportExcelUtil();
        String title = "�γ����"; 
        String[] headers = { "���","�γ������","�γ����","�γ�����","�Ƿ���Ҫ�ؿ�","�Ƿ���Ҫ����"};
        List<String[]> dataset = new ArrayList<String[]>(); 
        for(int i=0;i<coursetypes.size();i++) {
        	Coursetype temp = coursetypes.get(i); 
        	dataset.add(new String[]{temp.getId() + "",temp.getTypecore()+ "",temp.getType()+ "",temp.getQuality()+ "",temp.getReexamine()+ "",temp.getRetake()});
        }
        /*
        OutputStream out = null;
		try {
			out = new FileOutputStream("C://output.xls");
			ex.exportExcel(title,headers, dataset, out);
		    out.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		*/
        HttpServletResponse response = null;//����һ��HttpServletResponse���� 
		OutputStream out = null;//����һ����������� 
		try { 
			response = ServletActionContext.getResponse();//��ʼ��HttpServletResponse���� 
			out = response.getOutputStream();//
			response.setHeader("Content-disposition","attachment; filename="+"Coursetype.xls");//filename�����ص�xls���������������Ӣ�� 
			response.setContentType("application/msexcel;charset=UTF-8");//�������� 
			response.setHeader("Pragma","No-cache");//����ͷ 
			response.setHeader("Cache-Control","no-cache");//����ͷ 
			response.setDateHeader("Expires", 0);//��������ͷ  
			String rootPath = ServletActionContext.getServletContext().getRealPath("/");
			ex.exportExcel(rootPath,title,headers, dataset, out);
			out.flush();
		} catch (IOException e) { 
			e.printStackTrace(); 
		}finally{
			try{
				if(out!=null){ 
					out.close(); 
				}
			}catch(IOException e){ 
				e.printStackTrace(); 
			} 
		}
		return null;
	}
}
