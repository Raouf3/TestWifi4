package com.example.raouf.testwifi4;

/**
 * Created by Raouf on 15/03/2017.
 */


import org.alljoyn.bus.BusException;
import org.alljoyn.bus.annotation.BusInterface;
import org.alljoyn.bus.annotation.BusMethod;
import org.alljoyn.bus.annotation.BusSignal;

/*
 * The BusInterface annotation is used to tell the code that this interface is an AllJoyn interface.
 *
 * The 'name' value is used to specify by which name this interface will be known.  If the name is
 * not given the fully qualified name of the Java interface is be used.  In most instances its best
 * to assign an interface name since it helps promote code reuse.
 */
@BusInterface(name = "org.alljoyn.bus.samples.simple.SimpleInterface")
public interface SimpleInterface {

    @BusMethod
    String Ping(String inStr) throws BusException;

    @BusSignal
    public void playerPosition(int x, int y, int z) throws BusException;
}
