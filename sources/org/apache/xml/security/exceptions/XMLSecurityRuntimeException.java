package org.apache.xml.security.exceptions;

import X.BE7;
import X.BE8;
import X.BE9;
import X.C17890vO;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.text.MessageFormat;
import org.apache.xml.security.utils.I18n;

public class XMLSecurityRuntimeException extends RuntimeException {
    public Exception a;
    public String b;

    public XMLSecurityRuntimeException() {
        super("Missing message string");
        this.b = null;
        this.a = null;
    }

    public XMLSecurityRuntimeException(String str, Exception exc) {
        super(I18n.a(str, exc));
        this.b = str;
        this.a = exc;
    }

    public XMLSecurityRuntimeException(String str, Object[] objArr, Exception exc) {
        super(MessageFormat.format(I18n.b(str), objArr));
        this.b = str;
        this.a = exc;
    }

    public void printStackTrace() {
        PrintStream printStream = System.err;
        synchronized (printStream) {
            super.printStackTrace(printStream);
            Exception exc = this.a;
            if (exc != null) {
                exc.printStackTrace(printStream);
            }
        }
    }

    public void printStackTrace(PrintStream printStream) {
        super.printStackTrace(printStream);
        Exception exc = this.a;
        if (exc != null) {
            exc.printStackTrace(printStream);
        }
    }

    public void printStackTrace(PrintWriter printWriter) {
        super.printStackTrace(printWriter);
        Exception exc = this.a;
        if (exc != null) {
            exc.printStackTrace(printWriter);
        }
    }

    public String toString() {
        String A0U = C17890vO.A0U(this);
        String localizedMessage = super.getLocalizedMessage();
        if (localizedMessage != null) {
            A0U = BE9.A0p(": ", localizedMessage, BE8.A0i(A0U));
        }
        if (this.a == null) {
            return A0U;
        }
        StringBuffer A0i = BE8.A0i(A0U);
        A0i.append("\nOriginal Exception was ");
        return BE7.A0n(this.a.toString(), A0i);
    }
}
