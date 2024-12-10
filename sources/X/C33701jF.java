package X;

/* renamed from: X.1jF  reason: invalid class name and case insensitive filesystem */
public class C33701jF implements C33691jE {
    public boolean A00;
    public final AnonymousClass1QS A01;
    public final C33681jD A02;
    public final AnonymousClass1QO A03;
    public final AnonymousClass1QE A04 = AnonymousClass1QE.A00("PaymentsLifecycleManager", "network", "COMMON");
    public final AnonymousClass00H A05;

    public synchronized void A00() {
        if (this.A00) {
            this.A04.A06("payments was already initialized");
        } else if (this.A03.A03()) {
            this.A04.A06("initializing payments");
            C33681jD r3 = this.A02;
            synchronized (r3) {
                r3.A00 = true;
                r3.A02.A0J(new C21425Ajs((Object) r3, 38));
            }
            ((C22881Do) this.A05.get()).registerObserver(this);
            this.A00 = true;
        }
    }

    public synchronized void A01(boolean z, boolean z2) {
        this.A04.A06("reinitializing payments");
        this.A00 = false;
        this.A01.A09(z, z2);
        ((C22881Do) this.A05.get()).unregisterObserver(this);
        C33681jD r3 = this.A02;
        synchronized (r3) {
            r3.A00 = false;
            r3.A02.A0J(new C21425Ajs((Object) r3, 37));
        }
        A00();
    }

    public void BxO(boolean z) {
        if (z) {
            this.A01.A09(true, false);
        }
    }

    public C33701jF(C33681jD r4, AnonymousClass1QO r5, AnonymousClass1QS r6, AnonymousClass00H r7, AnonymousClass00H r8) {
        this.A05 = r7;
        this.A01 = r6;
        this.A03 = r5;
        this.A02 = r4;
        ((C33711jG) r8.get()).A00 = this;
    }
}
