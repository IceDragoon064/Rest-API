import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'serviceApp';


  userLink = '';
  newURL = '';
  submitLink()
  {
    userLink = document.getElementById("userLink").value;
    newURL = angular.element(document.getElementById('TinyUrlController')).scrambleURL(userLink);
  }
}
