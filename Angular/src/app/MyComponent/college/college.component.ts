import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-college',
  templateUrl: './college.component.html',
  styleUrls: ['./college.component.css']
})
export class CollegeComponent implements OnInit {

  collegename: string;
  collegeid: number;
  strength:number;
  constructor(private http:HttpClient) { }

  ngOnInit(): void {
  }

  onSubmit(){
    
    if(this.collegename==null || this.collegeid==null || this.strength==null)
         alert("All fields are mandatory fields");
    else {  
      const data=
          {
          "collegeid": this.collegeid ,
          "name": this.collegename,
          "strength": this.strength
          }
        
         this.http.post('http://localhost:8080/addCollege',data).subscribe(result => {

          console.log(JSON.stringify(result));
         });

         console.log(data);
    }    
  }
}
