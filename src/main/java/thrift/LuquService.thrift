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

service ProcessStudent{
	LuquResultStudent supplyInquiry(1:StudentInfo studentinfo)
}


service

