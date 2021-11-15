import { BrowserModule } from '@angular/platform-browser';
import { CUSTOM_ELEMENTS_SCHEMA, NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { CollegeComponent } from './MyComponent/college/college.component';
import { StudentComponent } from './MyComponent/student/student.component';
import { ViewComponent } from './MyComponent/view/view.component';
import { NavComponent } from './MyComponent/nav/nav.component';
import { FooterComponent } from './MyComponent/footer/footer.component';
import { HomeComponent } from './MyComponent/home/home.component';
import { FormsModule } from '@angular/forms';
import { GetCollegeService } from './Service/get-college.service';
import { GetStudentService } from './Service/get-student.service';
import { DragDropModule } from '@angular/cdk/drag-drop';

@NgModule({
  declarations: [
    AppComponent,
    CollegeComponent,
    StudentComponent,
    ViewComponent,
    NavComponent,
    FooterComponent,
    HomeComponent,
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    HttpClientModule,
    DragDropModule
  ],
  schemas: [ CUSTOM_ELEMENTS_SCHEMA ],
  
  providers: [GetCollegeService,GetStudentService],
  bootstrap: [AppComponent]
})
export class AppModule { }
