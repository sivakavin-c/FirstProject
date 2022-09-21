import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }
  firstname:string='Sivakavin';
  lastname:string='C';
  email:string='siva@gmail.com';
  password:string='siva@123';
}
