import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { GetCollegeService } from 'src/app/Service/get-college.service';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrls: ['./student.component.css']
})
export class StudentComponent implements OnInit {
 
  studentid:number;
  studentname: string;
  age:number;
  gender:string;
  collegeid:number;
  college:any;

  constructor(private api:GetCollegeService,private http:HttpClient) { }

  ngOnInit(): void {
    // this.api.getCollege().subscribe(data =>{
    //   this.college=data;
    //   console.log(this.college);
    //    for(let colg of this.college){
    //     console.log(colg.collegeid);
    //    }

    // });
    this.getCollegeinfo();

  }

  getCollegeinfo(){
    this.api.getCollege().subscribe(data =>{
      this.college=data;
      console.log(this.college);
      // for(let colg of this.college){
      //  console.log(colg.collegeid);
      // }

    });
  }
 
  onSubmit(){
    if(this.studentname==null || this.studentid==null || this.age==null || this.gender == null || this.collegeid==null)
         alert("All fields are mandatory fields");
         else {  
          const data=
          {
            "id":this.studentid,
            "name":this.studentname,
            "age":this.age,
            "gender":this.gender,
            "colg":
            {
               "collegeid":this.collegeid
            }
            
        }
            
             this.http.post('http://localhost:8080/addStudent',data).subscribe(result => {
    
              console.log(JSON.stringify(result));
             });
    
             console.log(data);
        }    
  }


}
