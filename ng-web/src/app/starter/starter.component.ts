import { Component, AfterViewInit, OnInit } from '@angular/core';

@Component({
  selector: 'app-starter',
  templateUrl: './starter.component.html',
  styleUrls: ['./starter.component.scss']
})
export class StarterComponent implements AfterViewInit, OnInit {

  public dataEvaluate: any;
  public dataAverageScore: any;

  public yeuE = [];
  public kemE = [];
  public trungbinhE = [];
  public khaE = [];
  public gioiE = [];
  public xuatsacE = [];

  public yeuAS = [];
  public trungbinhAS = [];
  public khaAS = [];
  public gioiAS = [];

  constructor(
  ) {
  }

  ngOnInit() {

  }

  ngAfterViewInit() {
  }
}
