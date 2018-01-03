select * from academic_kpi;
select * from person_pbp where academic_year=2559;

select * from buckwauser;

select max(person_id) from person_pbp;

select count(*) from person_pbp;



SELECT * FROM academic_year a;

SELECT * FROM academic_evaluate_round a;



INSERT INTO person_pbp (thai_name,thai_surname,rate_no,employee_type,max_education,email,picture,person_type,status,create_by,create_date,update_by,update_date,department_desc,title_name,academic_rank,faculty_desc,is_president,is_dean,is_head,academic_year,faculty_code,department_code,reg_id,working_date,birth_date,citizen_id,is_presedent,is_dean,is_head,dean_faculty,head_department)
select thai_name,thai_surname,rate_no,employee_type,max_education,email,picture,person_type,status,create_by,create_date,update_by,update_date,department_desc,title_name,academic_rank,faculty_desc,is_president,is_dean,is_head,'2559',faculty_code,department_code,reg_id,working_date,birth_date,citizen_id,is_presedent,is_dean,is_head,dean_faculty,head_department
from person_pbp ;

delete from person_pbp where academic_year=2559;



update person_pbp set academic_year ='2559'
where person_id>22336;


-- Department,Faculty

SELECT * FROM faculty f;
select max(faculty_id) from faculty;


INSERT INTO faculty (name,code,description,status,academic_year,enable,dean_user_name,icl_code,thai_name,eng_name,abbreviation,person_type)
select name,code,description,status,academic_year,enable,dean_user_name,icl_code,thai_name,eng_name,abbreviation
from faculty;

update faculty set academic_year ='2559'
where faculty_id>379;



SELECT * FROM department d;
select max(department_id) from department;


INSERT INTO department (name,code,description,faculty_id,academic_year,enable,faculty_code,status,head_user_name,eng_name)
select name,code,description,faculty_id,academic_year,enable,faculty_code,status,head_user_name,eng_name
from department;

update department set academic_year ='2559'
where department_id>1074;


-- WorkType

select * from pbp_work_type;
select max(work_type_id) from pbp_work_type;

insert into pbp_work_type (name,code,min_hour,max_hour,academic_year,limit_base,faculty_code,min_hour_cal,max_hour_cal)
select name,code,min_hour,max_hour,academic_year,limit_base,faculty_code,min_hour_cal,max_hour_cal from pbp_work_type where academic_year ='2558';

update pbp_work_type set academic_year ='2559' where work_type_id >128;

-- Academic KPI

select * from academic_kpi;
select max(academic_kpi_id) from academic_kpi;

INSERT INTO academic_kpi(code,name,unit_code,academic_year,rule_code,mark,work_type_code,order_no,special_p1,special_p2,special_p3,special_p4,from_reg,faculty_code)

SELECT code,name,unit_code,academic_year,rule_code,mark,work_type_code,order_no,special_p1,special_p2,special_p3,special_p4,from_reg,faculty_code FROM academic_kpi WHERE academic_year ='2558';

update academic_kpi set academic_year ='2559' where academic_kpi_id >193610;


 delete from academic_kpi where academic_kpi_id >193610;



select * from person_pbp;

select email,thai_name,dean_faculty from  person_pbp where academic_year =2558 and is_dean='Y';

select email,thai_name,dean_faculty from  person_pbp where academic_year =2559 and is_dean='Y';


select email,thai_name,head_department from  person_pbp where academic_year =2558 and is_head='Y';

select email,thai_name,head_department from  person_pbp where academic_year =2559 and is_head='Y';


SELECT * FROM academic_kpi_attribute a;


select *  from pbp_work_type where academic_year ='2559' and faculty_code='01' order by code;


select * from person_pbp;
