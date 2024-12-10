package X;

import java.io.PrintWriter;
import java.io.StringWriter;

/* renamed from: X.CeJ  reason: case insensitive filesystem */
public abstract class C25359CeJ {
    public static final String A00(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.flush();
        return C18070vi.A0H(stringWriter);
    }

    public static final void A01(Throwable th, Throwable th2) {
        C18070vi.A0h(th, th2);
        if (th != th2) {
            CGQ.A00.A00(th, th2);
        }
    }
}
