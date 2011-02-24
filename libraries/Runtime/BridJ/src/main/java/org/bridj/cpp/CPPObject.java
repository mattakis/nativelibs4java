/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.bridj.cpp;

import java.util.Stack;

import org.bridj.NativeObject;
import org.bridj.Pointer;
import org.bridj.StructObject;
import org.bridj.ann.Runtime;
import org.bridj.cpp.mfc.MFCRuntime;
import org.bridj.BridJ;


/**
 * Base class for C++ structs and classes.
 * @author Olivier
 */
@Runtime(CPPRuntime.class)
public abstract class CPPObject extends StructObject {
	protected CPPObject() {}
    protected CPPObject(Pointer<? extends CPPObject> peer) {
        super(peer);
    }
    protected CPPObject(int constructorId, Object... args) {
        super(constructorId, args);
    }
    /*
    @Override
    protected void finalize() throws Throwable {
    		BridJ.deallocate(this);
    }*/
}
