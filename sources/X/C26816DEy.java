package X;

/* renamed from: X.DEy  reason: case insensitive filesystem */
public class C26816DEy implements E7d {
    public final CKF A00;
    public final C25203Caw A01;
    public final C28502E4k A02;
    public volatile int A03;
    public volatile E9T A04;
    public volatile Boolean A05;

    public void BDG() {
        this.A01.A00();
    }

    public /* bridge */ /* synthetic */ Object BYK() {
        if (this.A05 == null) {
            throw AnonymousClass000.A0n("Configure Preview operation hasn't completed yet.");
        } else if (this.A05.booleanValue()) {
            return this.A04;
        } else {
            throw new C27223Da2("Failed to configure preview.");
        }
    }

    public C26816DEy(CKF ckf) {
        this.A03 = 0;
        DES des = new DES(this, 1);
        this.A02 = des;
        this.A00 = ckf;
        C25203Caw caw = new C25203Caw();
        this.A01 = caw;
        caw.A00 = des;
    }

    public C26816DEy() {
        this((CKF) null);
    }
}
