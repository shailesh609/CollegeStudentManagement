import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';


@Injectable({
  providedIn: 'root'
})
export class GetStudentService {

  constructor(private http:HttpClient) { }

  getStudent(collegeid){
    
   // console.log("dsdsdsdsdSD         "+collegeid);

    const studenturl = " http://localhost:8080/getStudent?colg="+collegeid ;

    return this.http.get(studenturl);
    
  }


  createStudent(data){
     this.http.post('http://localhost:8080/addCollege',data).subscribe(result => {

      return JSON.stringify(result);
     });
  }

}
