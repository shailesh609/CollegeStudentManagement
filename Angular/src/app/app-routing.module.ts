import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CollegeComponent } from './MyComponent/college/college.component';
import { HomeComponent } from './MyComponent/home/home.component';
import { StudentComponent } from './MyComponent/student/student.component';
import { ViewComponent } from './MyComponent/view/view.component';

const routes: Routes = [
  {path: '', redirectTo: 'home', pathMatch: 'full'},
  
  { path: 'home', component: HomeComponent },
  { path: 'college', component: CollegeComponent },
  { path: 'view', component: ViewComponent },
  { path: 'student', component: StudentComponent }
 
];
@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
