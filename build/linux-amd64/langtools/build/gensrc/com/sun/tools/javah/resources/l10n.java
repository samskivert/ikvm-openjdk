package com.sun.tools.javah.resources;

import java.util.ListResourceBundle;

public final class l10n extends java.util.ListResourceBundle {
    protected final Object[][] getContents() {
        return new Object[][] {
            { "at.args.cant.read", "Can''t read command line arguments from file {1}." },
            { "at.args.io.exception", "The following I/O problem was encountered when processing an @ argument on the command line: {0}." },
            { "cant.create.dir", "The directory {0} could not be create for output." },
            { "class.not.found", "Class {0} could not be found." },
            { "dir.file.mixed", "Can''t mix options -d and -o.  Try -help." },
            { "encoding.iso8859_1.not.found", "ISO8859_1 converter was not found for output.  This is probably due to an error in the installation installation." },
            { "invalid.method.signature", "Invalid method signature: {0}" },
            { "io.exception", "Can''t recover from an I/O error with the following message: {0}." },
            { "javah.version", "javah version \"{0}\"" },
            { "jni.llni.mixed", "Can''t mix options -jni and -llni.  Try -help." },
            { "jni.no.stubs", "JNI does not require stubs, please refer to the JNI documentation." },
            { "jni.unknown.type", "An unknown type encountered (JNI)." },
            { "no.bootclasspath.specified", "No bootclasspath was specified on the command line.  Try -help." },
            { "no.classes.specified", "No classes were specified on the command line.  Try -help." },
            { "no.classpath.specified", "No classpath was specified on the command line.  Try -help." },
            { "no.outputdir.specified", "No output directory was specified on the command line.  Try -help." },
            { "no.outputfile.specified", "No outputfile was specified on the command line.  Try -help." },
            { "old.jni.mixed", "Can''t mix options -jni and -old.  Try -help." },
            { "old.llni.mixed", "Can''t mix options -old and -llni.  Try -help." },
            { "old.not.supported", "Option -old not supported by this version of javah." },
            { "super.class.not.found", "A required super class {0} could not be found." },
            { "tracing.not.supported", "Warning: Tracing is no longer supported.  Instead, use-verbose:jni option of the virtual machine." },
            { "tried.to.define.non.static", "Tried to generate #define for non-static field." },
            { "unknown.array.type", "An unknown array type encountered when generating old style headers." },
            { "unknown.option", "{0} is an illegal argument\n" },
            { "unknown.type.for.field", "An unknown type encountered when generating old style headers." },
            { "unknown.type.in.method.signature", "An unknown type eccountered when generating old style stubs." },
            { "usage", "Usage: javah [options] <classes>\n\nwhere [options] include:\n\n\t-help                 Print this help message and exit\n\t-classpath <path>     Path from which to load classes\n\t-bootclasspath <path> Path from which to load bootstrap classes\n\t-d <dir>              Output directory\n\t-o <file>             Output file (only one of -d or -o may be used)\n\t-jni                  Generate JNI-style header file (default)\n\t-version              Print version information\n\t-verbose              Enable verbose output\n\t-force\t\t      Always write output files\n\n<classes> are specified with their fully qualified names (for\ninstance, java.lang.Object).\n" },
        };
    }
}
