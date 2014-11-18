food-facilities-finder
======================
Description: Create a service that tells the user what types of food trucks might be found near a specific location on a map.

Solution focuses on back-end.

I have used the Spring MVC framework for this project. While I wanted to take this opportunity to get familiar with the Spring framework, after using it, I can say that it's a simple and a productive model. Also testing an application is much easier using Spring framework. MVC was to ensure separation of concerns.

The decision of using MongoDB was well thought. An application such as the "Food Truck" could grow beyond a city. Scaling such an application would be easier with MongoDB as you could easily shard. Also MongoDB provides GeoSpatial features which has been applied here. 

* I had never used the Spring framework or MongoDB prior to this. I was able to put this up in about 15 hours, however due to lack of time, I have been unable to host this on AWS. Apart from many other features that could be added, I was hoping to add atleast the 2 features stated below:

1. Display food facilities based on their schedule.
2. Ability to search based on the food items a user wants to eat.
