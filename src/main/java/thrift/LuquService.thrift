struct LuquResultStudent{
    1:i32 status,
    2:string school,
    3:string department
}

struct StudentPlan{
    1:string province,
    2:string school,
    3:list<string> major,
    4:bool adjust
}
struct StudentInfo{
    1:i32 id,
    2:string name,
    3:bool sex,
    4:double score_big,
    5:double score_small,
    6:string district,
    7:string graduate_school,
    8:list<StudentPlan> plans
}

struct SchoolInfo{
    1:i32 priority,
    2:i32 id,
    3:string name,
    4:i32 reputation,
    5:i32 type,
    6:string belongto,
    7:map<string, i32> departPlan,
    8:string province,
    9:string city,
    10:i32 money,
    11:i32 sex,
    12:i32 year,
    13:string language
}

struct NeedAndReal{
    1:string department,
    2:i32 need,
    3:i32 real
}
struct LuquResultSchool{
    1:list<StudentInfo> students,
    2:list<NeedAndReal> schoolResult
}
service LuquService{
	LuquResultStudent modifyStudent(1:StudentInfo studentinfo)
	LuquResultSchool modifySchool(1:SchoolInfo schoolinfo)
}


