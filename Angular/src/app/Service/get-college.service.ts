import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class GetCollegeService {

  constructor(private http:HttpClient) { }

  getCollege(){

    return this.http.get('http://localhost:8080/view');
    
  }

}
