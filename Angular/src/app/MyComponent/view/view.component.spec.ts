import { HttpClientModule } from '@angular/common/http';
import { HttpClientTestingModule } from '@angular/common/http/testing';
import { CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { ComponentFixture, TestBed } from '@angular/core/testing';
import { FormsModule } from '@angular/forms';
import { GetCollegeService } from 'src/app/Service/get-college.service';
import { GetStudentService } from 'src/app/Service/get-student.service';

import { ViewComponent } from './view.component';

describe('ViewComponent', () => {
  let component: ViewComponent;
  let fixture: ComponentFixture<ViewComponent>;
  let college: GetCollegeService;
  let student: GetStudentService;

  beforeEach(async () => {
    await TestBed.configureTestingModule({

      imports: [HttpClientTestingModule,
      FormsModule
      ], 

      declarations: [ ViewComponent,],
      schemas: [ CUSTOM_ELEMENTS_SCHEMA ],
      providers:[ GetCollegeService, GetStudentService ]
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewComponent);

    college=TestBed.get( GetCollegeService);
    student=TestBed.get(GetStudentService);

    component = fixture.componentInstance;
    fixture.detectChanges();
  });


  //  it('Service testing', () => {
  //    let college1:any
    
  //    component.ngOnInit()

  //   console.log(college1);
    
  //    expect(component.onSubmit()).toBeDefined();
  //  //  expect(student.getStudent()).toHaveBeenCalled();

  //  }); 



});



