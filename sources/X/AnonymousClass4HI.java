package X;

import android.content.Context;

/* renamed from: X.4HI  reason: invalid class name */
public abstract class AnonymousClass4HI {
    public static final C88284Zb A00(Context context, AnonymousClass4DO r5, AnonymousClass4DP r6) {
        AnonymousClass4D8 r2;
        AnonymousClass4D7 r0;
        if (r5 == null || r6 == null || r6 == AnonymousClass4DP.PLAIN) {
            return null;
        }
        AnonymousClass4PQ r3 = C88284Zb.A02;
        int ordinal = r6.ordinal();
        if (ordinal == 0) {
            r2 = AnonymousClass4D8.BORDERLESS;
        } else if (ordinal == 1) {
            r2 = AnonymousClass4D8.FILLED;
        } else if (ordinal == 2) {
            r2 = AnonymousClass4D8.TONAL;
        } else {
            throw AnonymousClass3MW.A14();
        }
        int ordinal2 = r5.ordinal();
        if (ordinal2 == 1) {
            r0 = AnonymousClass4D7.DESTRUCTIVE;
        } else if (ordinal2 == 2) {
            r0 = AnonymousClass4D7.WARNING;
        } else if (ordinal2 == 0) {
            r0 = AnonymousClass4D7.NORMAL;
        } else {
            throw AnonymousClass3MW.A14();
        }
        return r3.A00(context, r0, r2);
    }
}
