C4Q Access 3.3 Grocery Store

We are going to be building a Grocery store. The store will have 8 sections, each manned by a separate team of high tech grocery connoisseurs, which happen to also be your pair programming groups. Wisely, the team has decided to model the grocery store interactions in software before building an actual location.

All groups will build a class that represents their section of the store. The class must implement the interface that is provided for you. When we run the program, a Customer will browse through several sections of the store, and finally proceed to checkout, where all information will be displayed.

Each group will be responsible for the following sections of the store:

#Checkout
Instructor - Responsible for collection all information from the Grocery Cart, and displaying it to the customer.

#Bakery
Group 1 - Responsible for a medley of cakes, each with various toppings
* Stack of BakedGood
* Enum Type { Pie, Cake, Brownie}
* BakedGood { enum Type, int slicesPerUnit)


#Butcher
Group 2 - Responsible for a selection of meats, and various cuts of each
* Stack of Meat
* Enum Animal { Cow, Pig, Goat}
* Enum Cut { Flank, Shoulder }
* Meat{ enum Animal, enum Cut}

#Cold Case
Group 3 - Responsible for an assortment of lunch meats, each with a suggested recipe and ingredients list
* Stack of ChilledItem
* Enum Type { Drink, Snack}
* ChilledItem { enum Type, int temp)

#Hot Bar
Group 4 - Responsible for variety of prepared meals, each with a weight, and price per unit
* Stack of HotFood
* Enum Type { Sweet, Savory, Spicy}
* HotFood { enum Type, int servesHowMany)

#Pizzeria
Group 5 - Responsible for several prepared pizzas, each with a fixed amount available and price per slice
* Stack of PizzaSlice
* Enum Type { Pepperoni, Sausage, Cheese}
* Enum Crust { Thin, Regular, Cheese }
* PizzaSlice { enum Type, enum Crust)

#Frozen Food Aisle
Group 6 - Responsible for a diverse array of frozen food items
* Stack of FrozenFood
* Enum Appliance { microwave, toaster oven}
* FrozenFood{ enum Appliance, int Time }

#Sushi
Group 7 - Responsible for an amalgamation of prepared sushi rolls, each with an fixed amount available and price per roll.
* Stack of SushiRoll
* Enum Type { Salmon, Tuna,  Snapper}
* Enum Sauce { Wasabi, Soy }
* SushiRoll{ enum Type, enum Sauce }


#Bagels
Group 8 - Responsible for hot Bagels
* Stack of Bagel
* Enum Browning { Light, Dark, Burnt}
* enum Spreads {Cream cheese, jelly, butter, Cheese}
* Bagel { enum Browning, enum Spreads}
