import { HttpClientTestingModule } from '@angular/common/http/testing';
import { TestBed } from '@angular/core/testing';

import { GetStudentService } from './get-student.service';

describe('GetStudentService', () => {
  let service: GetStudentService;

  beforeEach(() => {
    TestBed.configureTestingModule({
      imports: [HttpClientTestingModule], 
 
       providers:[GetStudentService]
    });
    service = TestBed.inject(GetStudentService);
  });
/*
  it('should be created', () => {
    expect(service).toBeTruthy();
  });*/
});
