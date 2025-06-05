package com.prem.javaoneseven.sealedclasses.sealed;

//todo:: The only thing to do is to add the sealed keyword to the Fruit class and indicate with the
// permits keyword which classes may extend this Sealed Class. The subclasses need to indicate whether
// they are final, sealed or non-sealed. The super class cannot control whether a subclass may be extended and how it may be extended
public abstract sealed class FruitSealed permits AppleSealed, PearSealed {
}
