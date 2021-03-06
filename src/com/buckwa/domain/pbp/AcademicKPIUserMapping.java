package com.buckwa.domain.pbp;

import java.math.BigDecimal;
import java.util.List;

import com.buckwa.domain.BaseDomain;
import com.buckwa.domain.webboard.Message;

public class AcademicKPIUserMapping   extends BaseDomain{
	
	private Long kpiUserMappingId;
	private Long academicKPIId;
	private String academicYear;
	private String userName;
	private String academicKPICode;
	private String workTypeCode;
	private String calResultStr;

	private List<AcademicKPIAttributeValue>  academicKPIAttributeValueList;
	private List<AcademicKPIAttachFile> academicKPIAttachFileList;
	
	private String isCoTeach;
	private String fromSource;
	private String fromSourceText;
	private String thaiName;
	private String thaiSurname;
	
	private String fac_code;
	private String fac_name;
	private String dep_code;
	private String dep_name;
	private String kpi_unit;
	private String work_name;
	
	private String fullName;
	
	
	
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getWork_name() {
		return work_name;
	}
	public void setWork_name(String work_name) {
		this.work_name = work_name;
	}
	public String getFromSourceText() {
		String returnStr ="";
		 if(this.fromSource==null||this.fromSource.trim().length()==0){
			 returnStr ="M";
		 }else{
			 returnStr ="A";
		 }
		 return returnStr;
	}
	public void setFromSourceText(String fromSourceText) {
		this.fromSourceText = fromSourceText;
	}
	public String getFromSource() {
		return fromSource;
	}
	public void setFromSource(String fromSource) {
		this.fromSource = fromSource;
	}
	private List <Message> messageList;
	//new field by tum 19/07/2014
	private Integer ratio;
	
	  private BigDecimal totalInMapping = new BigDecimal(0.0);
	  private BigDecimal totalPercentInMapping = new BigDecimal(0.0);
	
	private AcademicKPI academicKPI;
	private AcademicKPIAttributeValue academicKPIAttributeValue;
	
	private List<AcademicKPIAttribute >  academicKPIAttributeList;
	
	public String getIsCoTeach() {
		return isCoTeach;
	}
	public void setIsCoTeach(String isCoTeach) {
		this.isCoTeach = isCoTeach;
	}
	public List<AcademicKPIAttribute> getAcademicKPIAttributeList() {
		return academicKPIAttributeList;
	}
	public void setAcademicKPIAttributeList(
			List<AcademicKPIAttribute> academicKPIAttributeList) {
		this.academicKPIAttributeList = academicKPIAttributeList;
	}
	public AcademicKPI getAcademicKPI() {
		return academicKPI;
	}
	public void setAcademicKPI(AcademicKPI academicKPI) {
		this.academicKPI = academicKPI;
	}
	
	public String getCalResultStr() {
		return calResultStr;
	}
	public void setCalResultStr(String calResultStr) {
		this.calResultStr = calResultStr;
	}
	public AcademicKPIAttributeValue getAcademicKPIAttributeValue() {
		return academicKPIAttributeValue;
	}
	public void setAcademicKPIAttributeValue(
			AcademicKPIAttributeValue academicKPIAttributeValue) {
		this.academicKPIAttributeValue = academicKPIAttributeValue;
	}
	public String getWorkTypeCode() {
		return workTypeCode;
	}
	public void setWorkTypeCode(String workTypeCode) {
		this.workTypeCode = workTypeCode;
	}
	public Long getAcademicKPIId() {
		return academicKPIId;
	}
	public void setAcademicKPIId(Long academicKPIId) {
		this.academicKPIId = academicKPIId;
	}
	public Long getKpiUserMappingId() {
		return kpiUserMappingId;
	}
	public void setKpiUserMappingId(Long kpiUserMappingId) {
		this.kpiUserMappingId = kpiUserMappingId;
	}
	public String getAcademicYear() {
		return academicYear;
	}
	public void setAcademicYear(String academicYear) {
		this.academicYear = academicYear;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAcademicKPICode() {
		return academicKPICode;
	}
	public void setAcademicKPICode(String academicKPICode) {
		this.academicKPICode = academicKPICode;
	}
	public List<AcademicKPIAttributeValue> getAcademicKPIAttributeValueList() {
		return academicKPIAttributeValueList;
	}
	public void setAcademicKPIAttributeValueList(
			List<AcademicKPIAttributeValue> academicKPIAttributeValueList) {
		this.academicKPIAttributeValueList = academicKPIAttributeValueList;
	}
	public List<AcademicKPIAttachFile> getAcademicKPIAttachFileList() {
		return academicKPIAttachFileList;
	}
	public void setAcademicKPIAttachFileList(
			List<AcademicKPIAttachFile> academicKPIAttachFileList) {
		this.academicKPIAttachFileList = academicKPIAttachFileList;
	}
 
	public List<Message> getMessageList() {
		return messageList;
	}
	public void setMessageList(List<Message> messageList) {
		this.messageList = messageList;
	}
	public BigDecimal getTotalInMapping() {
		return totalInMapping;
	}
	public void setTotalInMapping(BigDecimal totalInMapping) {
		this.totalInMapping = totalInMapping;
	}
	public BigDecimal getTotalPercentInMapping() {
		return totalPercentInMapping;
	}
	public void setTotalPercentInMapping(BigDecimal totalPercentInMapping) {
		this.totalPercentInMapping = totalPercentInMapping;
	}
	public Integer getRatio() {
		return ratio;
	}
	public void setRatio(Integer ratio) {
		this.ratio = ratio;
	}
	
	
	public String getThaiName() {
		return thaiName;
	}
	public void setThaiName(String thaiName) {
		this.thaiName = thaiName;
	}
	public String getThaiSurname() {
		return thaiSurname;
	}
	public void setThaiSurname(String thaiSurname) {
		this.thaiSurname = thaiSurname;
	}
	public String getFac_code() {
		return fac_code;
	}
	public void setFac_code(String fac_code) {
		this.fac_code = fac_code;
	}
	public String getFac_name() {
		return fac_name;
	}
	public void setFac_name(String fac_name) {
		this.fac_name = fac_name;
	}
	public String getDep_code() {
		return dep_code;
	}
	public void setDep_code(String dep_code) {
		this.dep_code = dep_code;
	}
	public String getDep_name() {
		return dep_name;
	}
	public void setDep_name(String dep_name) {
		this.dep_name = dep_name;
	}
	public String getKpi_unit() {
		return kpi_unit;
	}
	public void setKpi_unit(String kpi_unit) {
		this.kpi_unit = kpi_unit;
	}

}
