package military_elite.interfaces;

import military_elite.abstraction.Private;

import java.util.Set;

public interface LeutenantGeneral_Interface extends Private_Interface{

    void addElement(Private p);
    Set<Private> getPrivateSet();
}