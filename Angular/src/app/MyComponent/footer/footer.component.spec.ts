import { CUSTOM_ELEMENTS_SCHEMA } from '@angular/core';
import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FooterComponent } from './footer.component';

describe('FooterComponent', () => {
  let component: FooterComponent;
  let fixture: ComponentFixture<FooterComponent>;
  let currentVal=0;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ FooterComponent ],
      schemas: [ CUSTOM_ELEMENTS_SCHEMA ],
    })
    .compileComponents();
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(FooterComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  afterEach(function() {

    currentVal = 5;
    
    });

  // it('should create', () => {
  //   expect(component).toBeTruthy();
  // });

  fit("first call ",async () => {

    expect(currentVal).toBe(0);
    
  
    });
    
    it("second call ",async function() {
    
    expect(currentVal).toEqual(5);
    
    });

});
