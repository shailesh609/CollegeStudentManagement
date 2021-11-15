import { Component, OnInit } from '@angular/core';
import { GetCollegeService } from 'src/app/Service/get-college.service';
import { GetStudentService } from 'src/app/Service/get-student.service';

@Component({
  selector: 'app-view',
  templateUrl: './view.component.html',
  styleUrls: ['./view.component.css']
})
export class ViewComponent implements OnInit {
  college:any;
  collegeid:number;
  student: any;

  constructor(private api:GetCollegeService, private studentapi:GetStudentService ) { }

  ngOnInit(): void {

    this.api.getCollege().subscribe(data =>{
      this.college=data;
      console.log(this.college);
      // for(let colg of this.college){
      //  console.log(colg.collegeid);
      // }

    });
  }

  onSubmit(){
      
    this.studentapi.getStudent(this.collegeid).subscribe(data =>{
       this.student=data;

       console.log(data);

       console.log(data[0].age);

    });
   // console.log(this.collegeid);




  }



}
