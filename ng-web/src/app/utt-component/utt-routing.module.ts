import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";

const routes: Routes = [
  {
    path: "user",
    loadChildren: "./user/user.module#UserModule"
  },

  {
    path: "user-info",
    loadChildren: "./user-info/user-info.module#UserInfoModule"
  },
  {
    path: "employee",
    loadChildren: "./employee/employee.module#EmployeeModule"
  }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class UttRoutingModule {}
