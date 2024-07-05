import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class CvService {

  constructor(private _HttpClient:HttpClient) { }

  getcv():Observable<any>{
    return this._HttpClient.get("http://localhost:8081/table")


  }
}
