package X;

import android.content.Context;

/* renamed from: X.1wK  reason: invalid class name and case insensitive filesystem */
public class C41401wK {
    public static final C41401wK A01 = new C41401wK();
    public C41411wL A00 = null;

    public static C41411wL A00(Context context) {
        C41411wL r0;
        C41401wK r1 = A01;
        synchronized (r1) {
            r0 = r1.A00;
            if (r0 == null) {
                if (context.getApplicationContext() != null) {
                    context = context.getApplicationContext();
                }
                r0 = new C41411wL(context);
                r1.A00 = r0;
            }
        }
        return r0;
    }
}
