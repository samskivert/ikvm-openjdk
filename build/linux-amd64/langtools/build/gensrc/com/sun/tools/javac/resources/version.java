package com.sun.tools.javac.resources;

import java.util.ListResourceBundle;

public final class version extends java.util.ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "full", "1.6.0-internal-jeroen_01_mar_2011_11_51-b00" },
            { "jdk", "1.6.0" },
            { "release", "1.6.0-internal" },
        };
    }
}
