import { Component, EventEmitter, OnInit, Output, } from '@angular/core';
import { FormGroup, FormBuilder } from '@angular/forms';
import { Link } from './models/link.model';
import { AppserviceService } from './services/appservice.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'not a tinyurl site';

  @Output() public onFormGroupSubmit = new EventEmitter<Link>();
  newLinkForm!: FormGroup;
  newLinkData: Link;
  appService: AppserviceService;

  //Validate user url
  urlRegEx = '[-a-zA-Z0-9@:%_+.~#?&//=]{2,256}(.[a-z]{2,4})?\b(/[-a-zA-Z0-9@:%_+.~#?&//=]*)?';

  constructor(private fb: FormBuilder){ }

  ngOnInit(): void {
    this.initializeForm();
  }

  initializeForm(): void {
    this.newLinkForm = this.fb.group({
      id: 0,
      original_link: '',
      tiny_link: ''
    });
  }

  onSubmit(): void{
    console.log(this.newLinkForm.value);
    //this.newLinkData = {original_link:this.newLinkForm}
  }
}
