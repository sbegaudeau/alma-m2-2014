
## Sirius Project

The goal of this project will be the creation of a full fledged graphical Designer. In order to realize this designer, you can reuse your work for realized during the tutorial or you can use your own dedicated Ecore meta-model. A good starting point would be to use the Dart Designer [metamodel](https://github.com/dartdesigner/Dart-Designer/tree/master/bundles/org.obeonetwork.dsl.dart) (dart.ecore in the model folder of the project) or a custom one. You can improve the family metamodel if you want.

Your designer must contain the following features :

1 - One viewpoint containing a Diagram representation. This representation should contain a default layer with a node mapping, a container mapping, a bordered node mapping and a list container mapping with some child nodes.

2 - This representation should contain an additional layer showing new node mappings.

3 - Create two different kinds of edge mapping

4 - Add a validation rule

5 - Add a filter to hide the bordered node mapping

6 - Add mapping and edge creation tools and a direct edit tool for one of your mapping.

7 - Add an additional diagram representation and create a representation navigation and representation creation tool (triggered by a double click on a node mapping for example).

8 - Add conditional styles

9 - Convert one of your node mapping to be an unsynchronized node mapping and add an action to add existing elements

10 - Add a tree based representation to your viewpoint