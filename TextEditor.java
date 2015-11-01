// This is not a Java implementation but my rough answer.

/**
	Questions:
	Describe a design for a texteditor. Describe the classes, interface, and so on that you would use and how you would organize them.	
 */

/*
Sample Answer:

There are so many possible answers to this problem that it would be difficult to say that one answer is the best.
Look to make sure that they make classes ot set up a text editor (classes for the GUI, formatting, saving/loading files, handling input, etc.).
Using inheritance (subclassing in object-oriented programming) where it makes sense ia also good for reusability and extendability.
Using design patterns (such as Model-View-Contoroler, Listner/Observer, or the Singleton pattern) is also a good thing.
The main point is for them to get used to thinking about how they would design a system. 
Most importantly, they need to think about simplicity, reusability, and extendability in their design.

A text editor design question is slightly different from other design questions in that programmers often have strong feelings about how a text editor should work.
Programmers often want the ability to greatly modify the behaviour of their editor and want to be able to write extensions that add functionality to it.
The major text editors used by programmers today, such as Emacs, Vim, Eclipse, and Visual Studio have this ability.
A discussion about how their text editor would accomplish this (especially with how the deisng would include a place for extensions and how input would be handled) woudl be good.

My Answer:

Architecture, Class[Class Components]: Ui[InputHandler, OutputDisplayer], Logic[ContentMapper, ContentFormatter], StorageManager, FileStorage
Design Pattern: 
	- Model-View-Controller: Modle (FilStorage), View (Ui), Controller (Logic, StorageManager)
	- Singleton: There can be only one instance of TextEditor

How is my design simple?
	- It is using Single Responsibility Principle to increase cohesion by making a specific class be in charge of responsibility over a single part of the functionality.
	- It is broken down into logical and intuitive components.
	- On architectural level, everyone can understand by looking at the major components as blakc boxes.

How is my design reusable?
	- It is broken down into separate components. Therefore, if needed, a single part can be taken out to be reused.

How is my design extendable?
	- It is made up of classes which can have subclasses and can be extended to ahcieve other features.
*/