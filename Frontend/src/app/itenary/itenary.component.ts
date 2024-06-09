import { Component } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { PackageServiceService } from '../services/package-service.service';

@Component({
  selector: 'app-itenary',
  templateUrl: './itenary.component.html',
  styleUrl: './itenary.component.css'
})
export class ItenaryComponent {
  packageId: number = 0;
  packageData : any | null =null;

  constructor(private route: ActivatedRoute,private packageServiceService: PackageServiceService) { }

  ngOnInit(): void {
    // Retrieve the ID parameter from the URL
    this.route.params.subscribe(params => {
      this.packageId = params['id'];
      this.packageServiceService.getItenaryData(this.packageId).subscribe(
        (data: any) => {
          this.packageData = data;
        },
        (error: any) => {
          console.error('Error fetching package data:', error);
        }
      );
    });
  }
}
