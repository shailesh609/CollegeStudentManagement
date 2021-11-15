import { HttpClientTestingModule, HttpTestingController } from '@angular/common/http/testing';
import { CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { ComponentFixture, TestBed } from '@angular/core/testing';
import { FormsModule } from '@angular/forms';
import { GetCollegeService } from 'src/app/Service/get-college.service';
import { GetStudentService } from 'src/app/Service/get-student.service';

import { StudentComponent } from './student.component';

describe('StudentComponent', () => {
  let component: StudentComponent;
  let fixture: ComponentFixture<StudentComponent>;
  let college: GetCollegeService;
  let controller:HttpTestingController;

  beforeEach(async () => {
  
    await TestBed.configureTestingModule({

      imports:[
        HttpClientTestingModule,
        FormsModule
      ],

      declarations: [ StudentComponent ],
      schemas: [ CUSTOM_ELEMENTS_SCHEMA ],
      providers:[ GetCollegeService, GetStudentService ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(StudentComponent);

    college= TestBed.get( GetCollegeService);
    controller= TestBed.get(HttpTestingController)

    component = fixture.componentInstance;
    fixture.detectChanges();
  });



   it('should create Service', () => {


      component.getCollegeinfo();

   // const req= college.getCollege();

   // expect(req.cancelled).toBeFalsy();

   // expect(req.request.responseType).toEqual('json')

    //     console.log(colg);
    //  expect(colg ).toContain('ABCD');


   }); 


});
