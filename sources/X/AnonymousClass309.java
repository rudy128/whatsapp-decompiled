package X;

import java.util.LinkedHashSet;

/* renamed from: X.309  reason: invalid class name */
public final class AnonymousClass309 implements C72113Kr {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;

    public void Bqf() {
        C18020vd A0P = C17880vN.A0P(this.A02);
        C18040vf r2 = C18040vf.A02;
        if (C18020vd.A05(r2, A0P, 11231)) {
            LinkedHashSet A14 = C17880vN.A14();
            AnonymousClass00H r1 = this.A00;
            Boolean A002 = C63182se.A00((C63182se) r1.get());
            if (A002 != null && A002.booleanValue()) {
                A14.add(C49522Qu.AXOLOTL_SENDER_KEY_TABLE);
            }
            Boolean A012 = C63182se.A01((C63182se) r1.get());
            if (A012 != null && A012.booleanValue()) {
                A14.add(C49522Qu.AXOLOTL_SESSIONS_TABLE);
            }
            AnonymousClass308 r4 = (AnonymousClass308) this.A01.get();
            int A003 = C18020vd.A00(r2, r4.A00, 8586);
            if (A003 != 0 && A003 == C20099A7c.A01(r4.A01.A0K("LID_CHAT_BACKFILL_STATUS"), 0)) {
                A14.add(C49522Qu.CHAT_THREAD_CTWA_ORIGIN_BACK_FILL);
            }
            C46382Ei r3 = new C46382Ei();
            r3.A00 = C29431cG.A0h(",", A14, new C99234sU(23));
            ((AnonymousClass18K) this.A03.get()).CC7(r3);
        }
    }

    public AnonymousClass309(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0s(r1, r2, r3, r4);
        this.A02 = r1;
        this.A03 = r2;
        this.A00 = r3;
        this.A01 = r4;
    }
}
