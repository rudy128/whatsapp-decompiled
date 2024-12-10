package X;

import android.database.Cursor;

/* renamed from: X.385  reason: invalid class name */
public class AnonymousClass385 implements C1602787v {
    public final AnonymousClass1LW A00;
    public final AnonymousClass1QB A01;
    public final AnonymousClass1Cd A02;

    public Cursor BUo(C42621yT r12, C34141jz r13) {
        AnonymousClass26f r0;
        AnonymousClass1QB r4 = this.A01;
        long BS5 = r4.BS5();
        AnonymousClass1BI r8 = r13.A03;
        String l = Long.toString(this.A00.A09(r8));
        C28781at A04 = this.A02.get();
        if (BS5 == 1) {
            try {
                r0 = ((C28801av) A04).A02.A0C(r12, C51002Wp.A01, "GET_LINK_MESSAGE_FTS_DEPRECATED_SQL", C17880vN.A1b(l, r4.A0G(r13.A02()), 2, 1));
            } catch (Throwable th) {
                AnonymousClass0DT.A00(th, th);
                throw th;
            }
        } else {
            if (!AnonymousClass000.A1a(r13.A04())) {
                r13.A03 = r8;
                r13.A0G = true;
                r13.A0F = false;
            }
            r13.A02 = AnonymousClass74N.A03;
            String A0C = r4.A0C(r12, r13, (Integer) null);
            r0 = ((C28801av) A04).A02.A0C(r12, C51002Wp.A02, "GET_LINK_MESSAGE_FTS_SQL", new String[]{A0C});
        }
        A04.close();
        return r0;
    }

    public AnonymousClass385(AnonymousClass1LW r1, AnonymousClass1QB r2, AnonymousClass1Cd r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
