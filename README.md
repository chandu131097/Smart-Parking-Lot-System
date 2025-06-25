# Smart-Parking-Lot-System


vehicle
ticket : has vehicle no , ticket no

exit panel : parking lot has multiple exit panels
entry panel : parking lot has multiple entry panels
parking lot :

Check in :

1. lot.parkVehicle(vehicle,entryPanel) -> entryPanel.getAvailableFloor -> 

   availableFloor.getAvailableParkingSpot -> availableParkingSpot.parkVehicle(vehicle)

2. entryPanel.generateTicket()

Log entry

Check out :

lot.unparkingVehicle(exitPanel, vehicle , ticket) -> ticket.floor.deallocateParkingSpot(ticket.parkingSpot) 

-> ticketParkingSpot.unparkVehicle()

fee calculator(ticket)

Update Log entry by adding Log out time, exit Panel no

parking floor 
parking spot
Display panel
Enum of vehicle type

Payment interface

Payment modes implementing Payment interface

Fee Calculator inside exit panel

Parking fee Interface

Parking fee methods implementing Parking Interface

Parking Transactions to log the parking like : datetimestamp , vehicle no, ticket no, floor, time in, time out, spot , exitPanel , entryPanel
