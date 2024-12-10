package X;

/* renamed from: X.1RX  reason: invalid class name */
public final class AnonymousClass1RX {
    public final C22559BCs A00;
    public final boolean A01;
    public final AnonymousClass1LD A02;

    public C22559BCs A00() {
        C22559BCs bCs;
        if (this.A01 && (bCs = this.A00) != null) {
            return bCs;
        }
        throw new AssertionError("no active session");
    }

    public boolean A01(AnonymousClass1BI r3) {
        C22559BCs bCs;
        if (!this.A01 || (bCs = this.A00) == null || !C42171xk.A00(bCs.getChatJid(), r3) || this.A02.A01()) {
            return false;
        }
        return true;
    }

    public AnonymousClass1RX(C22559BCs bCs, AnonymousClass1LD r2, boolean z) {
        this.A00 = bCs;
        this.A01 = z;
        this.A02 = r2;
    }
}
