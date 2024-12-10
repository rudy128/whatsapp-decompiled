package X;

import android.content.Context;

/* renamed from: X.4ZQ  reason: invalid class name */
public final class AnonymousClass4ZQ {
    public static final AnonymousClass4ZQ A00 = new Object();

    public final void A01(Context context, AnonymousClass5a3 r5, int i) {
        C18070vi.A0d(context, 0);
        C73203Rj A002 = AnonymousClass4a6.A00(context);
        A002.A0D(i);
        C73203Rj.A0A(A002, r5, 18, 2131899286);
        AnonymousClass3MY.A1G(A002);
    }

    public static final Object A00(C30391dr r3, long j, long j2) {
        Object A002;
        long currentTimeMillis = System.currentTimeMillis() - j;
        if (currentTimeMillis >= j2 || (A002 = C62882s9.A00(r3, j2 - currentTimeMillis)) != C31751g4.COROUTINE_SUSPENDED) {
            return C27621Wu.A00;
        }
        return A002;
    }
}
