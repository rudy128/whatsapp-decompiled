package X;

import android.os.SystemClock;

/* renamed from: X.2sQ  reason: invalid class name and case insensitive filesystem */
public final class C63052sQ {
    public static final C50102Td A02 = new Object();
    public static volatile C63052sQ A03;
    public C28472E2n A00;
    public final C680231t A01;

    public C63052sQ(C680231t r1) {
        this.A00 = r1;
        this.A01 = r1;
    }

    public static void A00(String str) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Fixie Marker ");
        A10.append(str);
        A10.append(": ");
        C17890vO.A16(A10, SystemClock.uptimeMillis());
    }
}
