package X;

/* renamed from: X.6GZ  reason: invalid class name */
public final class AnonymousClass6GZ extends AnonymousClass6Ga {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;

    public void A0F() {
        this.A04 = 0;
        this.A01 = 0;
        this.A00 = 0.0f;
        super.A0F();
        AnonymousClass70X r2 = this.A04;
        if (r2 != null) {
            r2.A08 = new C146077Ns(this, 2);
        }
    }

    public static final int A00(AnonymousClass6GZ r3, long j) {
        if (r3.A04 instanceof C122066Mq) {
            return 1;
        }
        if (j == 0) {
            return 3;
        }
        return (int) Math.max(3, 6000 / j);
    }

    public long A0A() {
        int i = this.A02;
        if (i > 0) {
            return (long) (i * this.A03);
        }
        long A0A = super.A0A();
        return A0A * ((long) A00(this, A0A));
    }

    public void A0G() {
        AnonymousClass70X r1 = this.A04;
        if (r1 != null) {
            r1.A08 = null;
        }
        super.A0G();
    }
}
