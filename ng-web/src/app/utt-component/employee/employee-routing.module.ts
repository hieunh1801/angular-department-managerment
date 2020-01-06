import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";
import { EmployeeIndexComponent } from "./employee.component";

const routes: Routes = [
  {
    path: "",
    component: EmployeeIndexComponent,
    pathMatch: "prefix"
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class EmployeeRoutingModule {}
