/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jdyncall;

/**
 *
 * @author Olivier
 */
public class CPPObject implements PointerRefreshable {
    private Pointer<?> pointer;

    public CPPObject(Void v) {}

    @Override
    public CPPObject setPointer(Pointer<?> pointer) {
        this.pointer = pointer;
        return null;
    }

    @Override
    public Pointer<?> getReference() {
        return pointer;
    }


}