package com.sun.tools.javah.resources;

import java.util.ListResourceBundle;

public final class win32_x86 extends java.util.ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "dll.export", "__declspec(dllexport)" },
            { "pack.pragma.end", "#pragma pack()\n" },
            { "pack.pragma.start", "#pragma pack(4)\n" },
        };
    }
}
