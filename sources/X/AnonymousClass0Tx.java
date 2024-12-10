package X;

/* renamed from: X.0Tx  reason: invalid class name */
public final class AnonymousClass0Tx implements C17180uF {
    public final int A00;
    public final int A01;
    public final C16020ra A02;

    public /* bridge */ /* synthetic */ C16830tI CRk(C16590sg r5) {
        return new AnonymousClass0UC(this.A02, this.A01, this.A00);
    }

    public /* bridge */ /* synthetic */ C17200uH CRl(C16590sg r5) {
        return new AnonymousClass0UC(this.A02, this.A01, this.A00);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AnonymousClass0Tx)) {
            return false;
        }
        AnonymousClass0Tx r4 = (AnonymousClass0Tx) obj;
        if (r4.A01 == this.A01 && r4.A00 == this.A00 && C18070vi.A18(r4.A02, this.A02)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return AnonymousClass000.A0N(this.A02, this.A01 * 31) + this.A00;
    }

    public AnonymousClass0Tx(C16020ra r1, int i, int i2) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = r1;
    }

    public AnonymousClass0Tx() {
        this(C02980Gd.A01, 300, 0);
    }
}
