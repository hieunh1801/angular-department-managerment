import { NgModule } from "@angular/core";
import { CommonModule } from "@angular/common";
import { HttpClientModule } from "@angular/common/http";
import { EmployeeIndexComponent } from "./employee.component";
import { EmployeeRoutingModule } from "./employee-routing.module";
import { EmployeeFormComponent } from "./employee-form/employee-form.component";
import { EmployeeSearchComponent } from "./employee-search/employee-search.component";
import { ReactiveFormsModule } from "@angular/forms";
import { EmployeeListComponent } from './employee-list/employee-list.component';

@NgModule({
  declarations: [
    EmployeeIndexComponent,
    EmployeeFormComponent,
    EmployeeSearchComponent,
    EmployeeListComponent
  ],
  imports: [CommonModule, EmployeeRoutingModule, ReactiveFormsModule]
})
export class EmployeeModule {}
