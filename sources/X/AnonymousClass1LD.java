package X;

/* renamed from: X.1LD  reason: invalid class name */
public class AnonymousClass1LD extends AnonymousClass11D {
    public final AnonymousClass11C A00;
    public volatile Boolean A01;

    public void A00(boolean z) {
        if (this.A01 == null || z != this.A01.booleanValue()) {
            this.A01 = Boolean.valueOf(z);
            notifyAllObservers(new AnonymousClass7KY(this, 17));
        }
    }

    public boolean A01() {
        if (this.A01 == null) {
            this.A01 = Boolean.valueOf(C30841eb.A00(this.A00));
        }
        return this.A01.booleanValue();
    }

    public AnonymousClass1LD(AnonymousClass11C r1, AnonymousClass00H r2) {
        super(r2);
        this.A00 = r1;
    }
}
