import { TestBed } from '@angular/core/testing';
import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { GetCollegeService } from './get-college.service';
import { exitCode } from 'process';
import { NgModule } from '@angular/core';

describe('GetCollegeService', () => {
  let service: GetCollegeService;
  let client: HttpClientTestingModule;
  let controller: HttpTestingController;

  beforeEach(() => {
    TestBed.configureTestingModule({
     
      imports: [HttpClientTestingModule,
                   
      ], 

      providers: [GetCollegeService]
    
    });
    service = TestBed.get(GetCollegeService);
    controller=TestBed.get(HttpTestingController)
    
  });

  it('should be created', () => {
    let data1:any=
     [
      {
          "collegeid": 85,
          "name": "ABCD",
          "strength": 1250,
          "student": []
      },

      {
          "collegeid": 3,
          "name": "ABES",
          "strength": 1680,
          "student": [
              {
                  "id": 13,
                  "name": "Vidhi Saxena",
                  "age": 22,
                  "gender": "female"
              },
              {
                  "id": 23,
                  "name": "Sagar",
                  "age": 22,
                  "gender": "male"
              },
              {
                  "id": 45,
                  "name": "Ram ",
                  "age": 22,
                  "gender": "male"
              },
              {
                  "id": 96,
                  "name": "Ritk",
                  "age": 22,
                  "gender": "male"
              }
          ]
      },
      {
          "collegeid": 5,
          "name": "BBDIT",
          "strength": 980,
          "student": [
              {
                  "id": 36,
                  "name": "Ayush Verma",
                  "age": 20,
                  "gender": "male"
              },
              {
                  "id": 40,
                  "name": "Sumit",
                  "age": 23,
                  "gender": "male"
              }
          ]
      },
      {
          "collegeid": 7,
          "name": "HRIT",
          "strength": 850,
          "student": [
              {
                  "id": 43,
                  "name": "Nikhil",
                  "age": 20,
                  "gender": "male"
              },
              {
                  "id": 46,
                  "name": "Robin",
                  "age": 20,
                  "gender": "male"
              }
          ]
      },
      {
          "collegeid": 6,
          "name": "KIET",
          "strength": 1850,
          "student": [
              {
                  "id": 30,
                  "name": "Ritik Sharma",
                  "age": 22,
                  "gender": "male"
              },
              {
                  "id": 32,
                  "name": "Shiva Tyagi",
                  "age": 22,
                  "gender": "male"
              },
              {
                  "id": 56,
                  "name": "Ajay",
                  "age": 22,
                  "gender": "female"
              }
          ]
      },
      {
          "collegeid": 33,
          "name": "MIET",
          "strength": 1280,
          "student": [
              {
                  "id": 60,
                  "name": "Nikhil",
                  "age": 21,
                  "gender": "male"
              },
              {
                  "id": 62,
                  "name": "Vivek",
                  "age": 20,
                  "gender": "male"
              }
          ]
      },
      {
          "collegeid": 4,
          "name": "RDEC",
          "strength": 1580,
          "student": [
              {
                  "id": 15,
                  "name": "Shivani Chauhan",
                  "age": 21,
                  "gender": "female"
              },
              {
                  "id": 20,
                  "name": "Aditi Tyagi",
                  "age": 21,
                  "gender": "female"
              },
              {
                  "id": 25,
                  "name": "Boby Pal",
                  "age": 22,
                  "gender": "male"
              },
              {
                  "id": 26,
                  "name": "Vineet chaudhary",
                  "age": 22,
                  "gender": "male"
              },
              {
                  "id": 50,
                  "name": "Shivam Sharma",
                  "age": 21,
                  "gender": "male"
              }
          ]
      },
      {
          "collegeid": 2,
          "name": "RKGIT",
          "strength": 1500,
          "student": [
              {
                  "id": 12,
                  "name": "Shailesh Sharma",
                  "age": 22,
                  "gender": "male"
              },
              {
                  "id": 39,
                  "name": "Mohit ",
                  "age": 22,
                  "gender": "male"
              },
              {
                  "id": 41,
                  "name": "Rajat Chaudhary",
                  "age": 23,
                  "gender": "male"
              },
              {
                  "id": 42,
                  "name": "Dinesh Shishodia",
                  "age": 22,
                  "gender": "male"
              }
          ]
      },
      {
          "collegeid": 2323,
          "name": "Raj",
          "strength": 1,
          "student": [
              {
                  "id": 17,
                  "name": "Mohit kumar",
                  "age": 23,
                  "gender": "male"
              }
          ]
      }
  ];

    service.getCollege().subscribe(data=>{
     expect(data).toBe(data1)
    })

    const req= controller.expectOne('http://localhost:8080/view');

    expect(req.cancelled).toBeFalsy();

    expect(req.request.responseType).toEqual('json')

    req.flush(data1);
    controller.verify();

  });
   


});
