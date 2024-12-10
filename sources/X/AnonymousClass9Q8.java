package X;

/* renamed from: X.9Q8  reason: invalid class name */
public abstract class AnonymousClass9Q8 {
    public static final void A00(AnonymousClass1RX r1, AnonymousClass1BI r2) {
        C22559BCs bCs;
        C18070vi.A0d(r1, 0);
        if (!r1.A01) {
            bCs = r1.A00;
            if (bCs != null && !bCs.isFinishing()) {
                if (r2 != null && !r2.equals(bCs.getChatJid())) {
                    return;
                }
            } else {
                return;
            }
        } else if (r2 == null || r2.equals(r1.A00().getChatJid())) {
            bCs = r1.A00();
        } else {
            return;
        }
        bCs.Bc0();
    }
}
