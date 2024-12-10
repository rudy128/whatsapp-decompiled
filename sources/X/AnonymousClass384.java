package X;

import android.database.Cursor;

/* renamed from: X.384  reason: invalid class name */
public class AnonymousClass384 implements C1602787v {
    public final AnonymousClass1LW A00;
    public final AnonymousClass1QB A01;
    public final AnonymousClass1Cd A02;

    public Cursor BUo(C42621yT r12, C34141jz r13) {
        AnonymousClass26f r0;
        AnonymousClass1BI r4 = r13.A03;
        if (r4 == null) {
            return null;
        }
        AnonymousClass1QB r3 = this.A01;
        long BS5 = r3.BS5();
        C28781at A04 = this.A02.get();
        try {
            if (AnonymousClass000.A1a(r13.A04())) {
                r13.A02();
                if (BS5 == 1) {
                    String A0G = r3.A0G(r13.A02());
                    C23141Ev r32 = ((C28801av) A04).A02;
                    String str = C51002Wp.A00;
                    String[] A1Z = C17880vN.A1Z();
                    A1Z[0] = A0G;
                    AnonymousClass1LW.A03(this.A00, r4, A1Z, 1);
                    r0 = r32.A0C(r12, str, "GET_DOCUMENT_MESSAGES_FTS_DEPRECATED_SQL", A1Z);
                } else {
                    C17960vV.A0F(AnonymousClass000.A1P((BS5 > 5 ? 1 : (BS5 == 5 ? 0 : -1))), "unknown fts version");
                    r13.A02 = 100;
                    String A0C = r3.A0C(r12, r13, (Integer) null);
                    r0 = ((C28801av) A04).A02.A0C(r12, C51002Wp.A03, "GET_MATCH_TYPE_MESSAGES_FTS_SQL", new String[]{A0C});
                }
            } else {
                C23141Ev r33 = ((C28801av) A04).A02;
                String str2 = AnonymousClass203.A04;
                String[] strArr = new String[1];
                AnonymousClass1LW.A03(this.A00, r4, strArr, 0);
                r0 = r33.A0C(r12, str2, "GET_DOCUMENT_MESSAGES", strArr);
            }
            A04.close();
            return r0;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
            throw th;
        }
    }

    public AnonymousClass384(AnonymousClass1LW r1, AnonymousClass1QB r2, AnonymousClass1Cd r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
