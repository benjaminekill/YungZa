-- INSERT INTO academic_kpi(code,name,unit_code,academic_year,rule_code,mark,work_type_code,order_no,special_p1,special_p2,special_p3,special_p4,from_reg,faculty_code)

select max(academic_kpi_id) from academic_kpi;
INSERT INTO academic_kpi(name, code,work_type_code,mark,academic_year,unit_code,rule_code,order_no,description,faculty_code,special_p1,special_p2,special_p3,special_p4,total_student_from,total_student_to,from_reg)

SELECT name, code,work_type_code,mark,'2559',unit_code,rule_code,order_no,description,faculty_code,special_p1,special_p2,special_p3,special_p4,total_student_from,total_student_to,from_reg FROM academic_kpi WHERE faculty_code='01' and academic_year ='2558';

update academic_kpi set faculty_code ='13' where academic_kpi_id >193451;




insert into pbp_work_type (name,code,min_hour,max_hour,academic_year,limit_base,faculty_code,min_hour_cal,max_hour_cal)
select name,code,min_hour,max_hour,academic_year,limit_base,faculty_code,min_hour_cal,max_hour_cal from pbp_work_type where academic_year ='2558' and faculty_code='01';

update pbp_work_type set faculty_code ='13' where work_type_id >123;
