# NATURAL DISASTER RESOURCE DATABASE
In the wake of a natural disaster like a severe thunderstorm, hurricane, or otherwise, many residents require immediate aid (food, water, shelter, medicinal) but are unable to contact authorities or are unable to relay information concerning their specific needs. This app functions as a location database for both service providers and survivors of natural disasters, and is also able to match a survivor with a service that they need based on closest location. If implemented into the real world, the app would likely function on a satellite database that would reduce downtime as much as possible - but this connection implementation is outside of the scope of the project.

## IMPLEMENTED CLASSES/INTERFACES
User Interface -
Location methods, name/age getters and setters, setters for notes and survivor id identification methods.
Survivor - Has A:
Location, age/related medical information, and specific needs that are matched with provider class in later methods, boolean Satisfied, Survivor ID. Implements User interface.
Provider - Has A:
Location, service provided, clarifying information (notes, etc. ), stock of service information, boolean Exhausted, Provider ID. Implements User interface.
ProviderList - Has A:
ArrayList of Providers, methods to get, set, and edit the list, and matching methods with Survivor need/location inputs.
SurvivorList - Has A:
Arraylist of Providers, methods to get, set, and edit the list.
DisasterEval - Has A:
Methods to loop through provider and survivor to check satisfied/exhausted counts, overall disaster level from 1-5. Abstract, all methods static.
PrioritySurvivor - Extends Survivor - Has A:
(extended), notes for priority, int priorityLevel.
PriorityProvider - Extends Provider - Has A:
(extended), notes for priority, int priorityLevel.
ZipCode - Has A:
Stores zip information (code, lat/long) for easier access without index shenanigans, with a calculateDistance method.
ZipList - Has A:
List of ZipCode objects as taken from the csv, with matching methods to get lat/long when searching. Extends ZipMethods.
ZipMethods - Has A:
ReadCSV method, and abstract methods setting up the search and get/setters for ZipList. Abstract.

## USER INTERFACE/PACKAGES
JFrame with buttons, input text dialogs, and images (of Google Maps, if packages allow, if not lat-long will be used).
Zip Code database for lat-long coordinates
CSV reader package for zip codes and lat-long conversion.

## DATA STORAGE DETAILS
CSV will store int/double data depending on the CSV chosen for conversion.
Users will each have String, int, and boolean data values.
ArrayList of Survivor and Provider class instances in each SurvivorList and ProviderList, but no primitive/String objects are required to be stored in lists by themselves (i.e, not as an instance variable of a class).

