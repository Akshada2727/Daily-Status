// import { Component } from '@angular/core';
// import { MatMenuTrigger } from '@angular/material/menu';
// import { Router } from '@angular/router';
// import { ScoreService } from '../score.service';
// @Component({
//   selector: 'app-dashboard',
//   templateUrl: './dashboard.component.html',
//   styleUrls: ['./dashboard.component.css']
// })
// export class DashboardComponent {

//   totalScores: { [bookName: string]: number } = {};

  

//   cards=[

//     {title:'Total Points',content:'Points scored by subscription',value:'1',route:'/page',clickable:false},
//     {title:'Book Subscribed',content:'Number of books read', value:'2',route:'/page',clickable:false},
//     {title:'Active Subscription',content:'Number of books currently reading',value:'3',route:'/layout/active-subscription',clickable:true},
//     {title:'Top Subscribers by Points',content:'Content of card 4',route:'/page',clickable:false},
//     {title:'Trend Chart',content:'Content of card 5',route:'/page',clickable:false},
//   ];
//   constructor(private router: Router,private scoreService: ScoreService) {}

//   navigateToPage(route: string) {
//     this.router.navigate([route]);
//   }


//   ngOnInit() {
//     this.updateTotalScores();
//   }

//   updateTotalScores() {
//     this.totalScores = {}; 
//     for (const card of this.cards) {
//       if (card.clickable) {
//         const bookName = card.title;
//         this.totalScores[bookName] = this.scoreService.getScore(bookName);
//       }
//     }
//   }
// }
// import { Component } from '@angular/core';
// import { Router } from '@angular/router';
// import { ScoreService } from '../score.service';

// @Component({
//   selector: 'app-dashboard',
//   templateUrl: './dashboard.component.html',
//   styleUrls: ['./dashboard.component.css']
// })
// export class DashboardComponent {
//   cards = [
    
//     { title: 'Book Subscribed', content: 'Number of books read', value: '2', route: '/page', clickable: false },
//     { title: 'Active Subscription', content: 'Number of books currently reading', value: '3', route: '/layout/active-subscription', clickable: true },
//     { title: 'Top Subscribers by Points', content: 'Content of card 4', route: '/page', clickable: false },
//     { title: 'Trend Chart', content: 'Content of card 5', route: '/page', clickable: false },
//   ];

//   constructor(private router: Router, private scoreService: ScoreService) {}

//   navigateToPage(route: string) {
//     this.router.navigate([route]);
//   }

//   ngOnInit() {
//     this.updateTotalScore();
//   }

//   updateTotalScore() {
//     this.cards[0].totalScore = this.scoreService.getScore('Total Points');
//   }
// }
// import { Component } from '@angular/core';
// import { Router } from '@angular/router';
// import { ScoreService } from '../score.service';

// @Component({
//   selector: 'app-dashboard',
//   templateUrl: './dashboard.component.html',
//   styleUrls: ['./dashboard.component.css']
// })
// export class DashboardComponent {
//   cards = [
//     { 
//       title: 'Total Points', 
//       content: 'Points scored by subscription', 
//       value: 0, // Use a different property name
//       route: '/page', 
//       clickable: false
//     },
//     { title: 'Book Subscribed', content: 'Number of books read', value: '2', route: '/page', clickable: false },
//     { title: 'Active Subscription', content: 'Number of books currently reading', value: '3', route: '/layout/active-subscription', clickable: true },
//     { title: 'Top Subscribers by Points', content: 'Content of card 4', route: '/page', clickable: false },
//     { title: 'Trend Chart', content: 'Content of card 5', route: '/page', clickable: false }
//   ];

//   constructor(private router: Router, private scoreService: ScoreService) {}

//   navigateToPage(route: string) {
//     this.router.navigate([route]);
//   }

//   ngOnInit() {
//     this.updateTotalScore();
//   }

  
//   updateTotalScore() {
//     const totalScore = this.scoreService.getScore('Total Points');
//     console.log('Total Score:', totalScore);
//     this.cards[0].totalScore = totalScore;
//   }
  
// }
import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { ScoreService } from '../score.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})
export class DashboardComponent {
  cards = [
    { 
      title: 'Total Points', 
      content: 'Points scored by subscription', 
      value: 0, // Use a numeric value for totalScore
      route: '/page', 
      clickable: false
    },
    { title: 'Book Subscribed', content: 'Number of books read', value: 2, route: '/page', clickable: false },
    { title: 'Active Subscription', content: 'Number of books currently reading', value: 3, route: '/layout/active-subscription', clickable: true },
    // { title: 'Top Subscribers by Points', content: 'Content of card 4', value: 0, route: '/page', clickable: false },
    // { title: 'Trend Chart', content: 'Content of card 5', value: 0, route: '/page', clickable: false }
  ];

  constructor(private router: Router, private scoreService: ScoreService) {}

 
  

  ngOnInit() {
    console.log('DashboardComponent initialized');
    this.updateTotalScore();
  }

  navigateToPage(route: string) {
    this.router.navigate([route]);
  }

  updateTotalScore() {
    
    const totalPointsCard = this.cards.find(card => card.title === 'Total Points');
    if (totalPointsCard) {
      totalPointsCard.value = this.scoreService.getScore('Total Points');
    }
    console.log(`Total Points score updated to ${this.cards[0].value}`);
  }
}
