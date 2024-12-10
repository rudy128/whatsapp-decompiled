package X;

import android.util.Log;

public class DBI implements E4L {
    public final /* synthetic */ C24777CJu A00;
    public final /* synthetic */ C9B A01;

    public DBI(C24777CJu cJu, C9B c9b) {
        this.A00 = cJu;
        this.A01 = c9b;
    }

    public void CFN(C25979Cps cps, Throwable th) {
        String str;
        String stackTraceString;
        Object A012 = cps.A01();
        if (A012 != null) {
            str = C17890vO.A0U(A012);
        } else {
            str = "<value is null>";
        }
        Object[] A1a = BE6.A1a();
        AnonymousClass000.A1L(A1a, System.identityHashCode(this));
        AnonymousClass000.A1M(A1a, System.identityHashCode(cps));
        A1a[2] = str;
        if (th == null) {
            stackTraceString = "";
        } else {
            stackTraceString = Log.getStackTraceString(th);
        }
        A1a[3] = stackTraceString;
        C26265CwA.A06("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", A1a);
    }
}
