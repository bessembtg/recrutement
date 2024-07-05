import { Component } from '@angular/core';
import {CvService} from "../cv.service";
import {ListDeCv} from "../list-de-cv";
@Component({
  selector: 'app-table',
  templateUrl: './table.component.html',
  styleUrls: ['./table.component.css']
})
export class TableComponent {
  cv:ListDeCv[]=[];

  constructor(private _CvService:CvService) {

}
showtable(){
    this._CvService.getcv().subscribe((data)=>{

      this.cv=data;
      console.log(data);
    })
}
}
