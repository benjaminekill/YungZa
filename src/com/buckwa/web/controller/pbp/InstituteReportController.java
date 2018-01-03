package com.buckwa.web.controller.pbp;

import java.io.FileInputStream;
import java.net.URLEncoder;
import java.util.List;

import javax.mail.internet.MimeUtility;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.buckwa.domain.common.BuckWaRequest;
import com.buckwa.domain.common.BuckWaResponse;
import com.buckwa.domain.pbp.AcademicPerson;
import com.buckwa.domain.pbp.Department;
import com.buckwa.domain.pbp.Faculty;
import com.buckwa.domain.pbp.FacultyWrapper;
import com.buckwa.service.intf.pbp.FacultyService;
import com.buckwa.service.intf.pbp.InstituteService;
import com.buckwa.service.intf.util.PathUtil;
import com.buckwa.util.BuckWaConstants;
import com.buckwa.util.school.SchoolUtil;
import com.buckwa.web.util.AcademicYearUtil;

@Controller
@RequestMapping("/pbp/institute/report")
@SessionAttributes({"facultyWrapper","faculty","department"} ) 
public class InstituteReportController {	
	private static Logger logger = Logger.getLogger(InstituteReportController.class);	 
	@Autowired
	private FacultyService facultyService;	
	
	@Autowired
	private InstituteService instituteService;
	
	@Autowired
	private SchoolUtil schoolUtil;
	
	@Autowired
    private PathUtil pathUtil;
 
	@Autowired
	private AcademicYearUtil academicYearUtil;
	
	
	@RequestMapping(value="initRecal.htm", method = RequestMethod.GET)
	public ModelAndView recalAllByYear() {
		logger.info(" Start  ");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("instituteRecal");
		try{
			
			BuckWaRequest request = new BuckWaRequest();
			String academicYear =schoolUtil.getCurrentAcademicYear();
			request.put("academicYear",academicYear);
			BuckWaResponse response = facultyService.getByAcademicYear(request);
			if(response.getStatus()==BuckWaConstants.SUCCESS){	
				FacultyWrapper facultyWrapper = (FacultyWrapper)response.getResObj("facultyWrapper");
				
				List<Faculty> facList =facultyWrapper.getFacultyList();
				for(Faculty facTmp:facList){
					
					String facCode  = facTmp.getCode();
					String facName = facTmp.getName();
					
					System.out.println(facCode+":"+facName);
					
					List<Department> departmentList =facTmp.getDepartmentList();
					for(Department depTmp:departmentList){
						
						String depCode  = depTmp.getCode();
						String depName = depTmp.getName();
						System.out.println("   "+depCode+":"+depName);
					}
					
				}
			 
				facultyWrapper.setAcademicYear(academicYear);
				facultyWrapper.setAcademicYearSelect(academicYear);
				mav.addObject("facultyWrapper", facultyWrapper);	
				facultyWrapper.setAcademicYearList(academicYearUtil.getAcademicYearList());
			}	
			
			 
		}catch(Exception ex){
			ex.printStackTrace();
			mav.addObject("errorCode", "E001"); 
		}
		return mav;
	}	
	
	
	@RequestMapping(value="recal.htm", method = RequestMethod.GET)
	public ModelAndView recal(@RequestParam("academicYear") String academicYear) {
		logger.info(" Start  ");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("instituteRecal");
		try{
			
			BuckWaRequest request = new BuckWaRequest();
		 
			request.put("academicYear","2558");
			BuckWaResponse response = instituteService.recalAllByYear(request);
 	
			 
		}catch(Exception ex){
			ex.printStackTrace();
			mav.addObject("errorCode", "E001"); 
		}
		return mav;
	}	
	
	
	
	
	@RequestMapping(value="initExportExcel.htm", method = RequestMethod.GET)
	public ModelAndView initExportExcel() {
		logger.info(" Start  ");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("initExportExcel");
		try{
			
			BuckWaRequest request = new BuckWaRequest();
			String academicYear =schoolUtil.getCurrentAcademicYear();
			request.put("academicYear",academicYear);
			BuckWaResponse response = facultyService.getByAcademicYear(request);
			if(response.getStatus()==BuckWaConstants.SUCCESS){	
				FacultyWrapper facultyWrapper = (FacultyWrapper)response.getResObj("facultyWrapper");
				
				List<Faculty> facList =facultyWrapper.getFacultyList();
				for(Faculty facTmp:facList){
					
					String facCode  = facTmp.getCode();
					String facName = facTmp.getName();
					
					System.out.println(facCode+":"+facName);
					
					List<Department> departmentList =facTmp.getDepartmentList();
					for(Department depTmp:departmentList){
						
						String depCode  = depTmp.getCode();
						String depName = depTmp.getName();
						System.out.println("   "+depCode+":"+depName);
					}
					
				}
			 
				facultyWrapper.setAcademicYear(academicYear);
				facultyWrapper.setAcademicYearSelect(academicYear);
				mav.addObject("facultyWrapper", facultyWrapper);	
				facultyWrapper.setAcademicYearList(academicYearUtil.getAcademicYearList());
			}	
			
			 
		}catch(Exception ex){
			ex.printStackTrace();
			mav.addObject("errorCode", "E001"); 
		}
		return mav;
	}	
	
	@RequestMapping(value="instituteExportExcel.htm", method = RequestMethod.GET)
	public ModelAndView instituteExportExcel(@RequestParam("academicYear") String academicYear,HttpServletRequest httpRequest, HttpServletResponse httpResponse) {	
		logger.info(" Start  ");
		ModelAndView mav = new ModelAndView();
		mav.setViewName("initExportExcel");
		try{
			
			BuckWaRequest request = new BuckWaRequest();
			//String academicYear =schoolUtil.getCurrentAcademicYear();
			request.put("academicYear","2558");
			BuckWaResponse response = facultyService.getInstituteAllMarkByAcademicYear(request);
			if(response.getStatus()==BuckWaConstants.SUCCESS){	
				FacultyWrapper facultyWrapper = (FacultyWrapper)response.getResObj("facultyWrapper");
			 
				facultyWrapper.setAcademicYear(academicYear);
				facultyWrapper.setAcademicYearSelect(academicYear);
				mav.addObject("facultyWrapper", facultyWrapper);	
				facultyWrapper.setAcademicYearList(academicYearUtil.getAcademicYearList());
	 
			
			
			 
			try{
				String filePath =pathUtil.getDocPath();
				
				 String fileName ="รายงานคะแนนบุคลากรแต่ละด้านทั้งสถาบัน.xlsx";
				 String fileNameOut ="รายงานคะแนนบุคลากรแต่ละด้านทั้งสถาบัน_out.xlsx";
				String fullPath =  filePath+fileName;
				String fullPathtOut = filePath+fileNameOut;				
				
				XSSFWorkbook workbook = new XSSFWorkbook(new FileInputStream(fullPath));
			 
				//HSSFWorkbook workbook = new  HSSFWorkbook(fs, true);
		
				XSSFSheet sheet = workbook.getSheetAt(0);
				

				 
			 // FileInputStream inputStream = new FileInputStream(new File(fullPath));

		        // create data rows
		        int rowCount = 2;
		        int indexofRow =1;
		        
				List<Faculty> facList =facultyWrapper.getFacultyList();
				for(Faculty facTmp:facList){
					
					String facCode  = facTmp.getCode();
					String facName = facTmp.getName();
					
		            

 
					System.out.println(facCode+":"+facName);
					
					List<Department> departmentList =facTmp.getDepartmentList();
					for(Department depTmp:departmentList){
						
						List<AcademicPerson> personList =depTmp.getAcademicPersonList();
						
						for(AcademicPerson personTmp :personList){
							XSSFRow aRow = sheet.getRow(rowCount++);
							String depCode  = depTmp.getCode();
							String depName = depTmp.getName();
							System.out.println("   "+depCode+":"+depName);
				            aRow.getCell(0).setCellValue(indexofRow++);
				            aRow.getCell(1).setCellValue(facName);
				            aRow.getCell(2).setCellValue(depName);	
				            aRow.getCell(3).setCellValue(personTmp.getThaiName()+" "+personTmp.getThaiSurname());
				            aRow.getCell(4).setCellValue(personTmp.getEmail());
				            aRow.getCell(5).setCellValue(personTmp.getEmployeeType());	
				            
				            
				            aRow.getCell(6).setCellValue(personTmp.getMark1());	
				            aRow.getCell(7).setCellValue(personTmp.getMark2());	
				            aRow.getCell(8).setCellValue(personTmp.getMark3());	
				            aRow.getCell(9).setCellValue(personTmp.getMark4());	
				            aRow.getCell(10).setCellValue(personTmp.getMark5());	
				            
						}

			  
					}
					
				}
		         

		
		 
				
				// Check For IE OR NOT for Encoder fileName !
				String user_agent = httpRequest.getHeader("user-agent");
				boolean isInternetExplorer = (user_agent.indexOf(BuckWaConstants.BROWSER_MSIE) > -1);
				if (isInternetExplorer) {
					 
					httpResponse.setHeader("Content-disposition", "attachment; filename=\"" + URLEncoder.encode(fileName, "utf-8") + "\"");
				} else {
					 
					httpResponse.setHeader("Content-disposition", "attachment; filename=\"" + MimeUtility.encodeWord(fileName) + "\"");
				}
				
			     
				  workbook.write(httpResponse.getOutputStream());
				 
				
			//	httpResponse.flushBuffer();
				
				
				
				
			}catch(Exception ex){
				ex.printStackTrace();
			}
			
			
		}
			
			 
		}catch(Exception ex){
			ex.printStackTrace();
			mav.addObject("errorCode", "E001"); 
		}
		return mav;
	}	
	
	

	
}
