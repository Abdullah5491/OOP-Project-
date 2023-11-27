//package com.example.bookthebus;
//
//public class Main {
//    public static void main(String[] args) {
//        Bus b1=new Bus("Faisal Movers","Fa 123","4:00","13:00","10/10/2023",Terminals.Lahore,Terminals.Karachi, BusCategory.Gold);
//        Bus b3=new Bus("Faisal Movers","fa 124","6:00","14:00","10/10/2023",Terminals.Multan,Terminals.Karachi, BusCategory.Gold);
//        PremiumBus b4=new PremiumBus("Faisal Movers","Fa 125","2:00","13:00","10/10/2023",Terminals.Karachi,Terminals.Islamabad, BusCategory.Premium);
//        Passenger p1=new Passenger ("Ali","a@gmail.com","36401","male","123456","123456");
//       // Passenger p2=new Passenger("Alina","232","Female");
//        Bus b2=new Bus("Daewoo","Da 125","2:00","13:00","10/10/2023",Terminals.Karachi,Terminals.Islamabad, BusCategory.Gold);
//        BusStaff staff=new BusStaff("Ahmad","231",StaffRoles.Manager,500,"0321-1234567","ali@gmail.com","123456");
//
//        BusManagement M1=new BusManagement();
//
//     M1.buses.add(b4);
//       M1.buses.add(b1);
//       M1.buses.add(b2);
//         M1.buses.add(b3);
//       M1.passengers.add(p1);
//       //M1.passengers.add(p2);
//        M1.busStaff.add(staff);
//      //M1.displayBuses();
//       //M1.displayPassengers();
//        M1.addDiscount("abc",0.2);
//
//     M1.bookTicket(1,"2323","Fa 123","abc");
//      // M1.bookTicket(2,2323,"Fa 125","abd");
//     //  M1.bookTicket(3,2323,"Fa 125","abc");
////        M1.bookTicket(3,233,"Fa 124");
////        M1.bookTicket(4,2323,"Fa 123");
//
//     //  M1.showAvailableBuses("Lahore","Karachi");
//        // M1.showTicketDetails(2323);
////M1.getBusDetails("Fa 125");
//M1.showTicketDetails("2323");
//
//        System.out.printf("Total discount: %.2f\n",b1.Discounts.get(0));
//
//
//
//    }
//}