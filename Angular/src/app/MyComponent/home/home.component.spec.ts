import { CUSTOM_ELEMENTS_SCHEMA, DebugElement } from '@angular/core';
import { ComponentFixture, TestBed } from '@angular/core/testing';
import { By } from '@angular/platform-browser';

import { HomeComponent } from './home.component';

describe('HomeComponent', () => {
  let component: HomeComponent;
  let fixture: ComponentFixture<HomeComponent>;
  let el: DebugElement;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ HomeComponent ],
     
    })
    .compileComponents();

   
  });

  beforeEach(() => {
    fixture = TestBed.createComponent(HomeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
    el=fixture.debugElement;
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });


  it(' FirstAngularApp Heading', async() => {
    
    const fixture = TestBed.createComponent(HomeComponent);
    //const app = fixture.componentInstance;
    const boldText = el.query(By.css('.welcome')).nativeElement;
    console.log(boldText.textContent)
    expect(boldText.textContent).toEqual('Welcome to the FirstAngularApp');
    // expect(heading).toEqual('Welcome to the FirstAngularApp');

  });

});
