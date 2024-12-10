package X;

/* renamed from: X.0Ol  reason: invalid class name and case insensitive filesystem */
public final class C04710Ol {
    public long A00;
    public C16960tV A01;
    public C28644ECa A02;
    public C24246By4 A03;

    public /* synthetic */ C04710Ol(C16960tV r7, C28644ECa eCa, C24246By4 by4, AnonymousClass1Y1 r10, long j) {
        this(r7, eCa, by4, j);
    }

    public final C28644ECa A00() {
        return this.A02;
    }

    public final C24246By4 A02() {
        return this.A03;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C04710Ol) {
                C04710Ol r9 = (C04710Ol) obj;
                if (C18070vi.A18(this.A02, r9.A02) && this.A03 == r9.A03 && C18070vi.A18(this.A01, r9.A01)) {
                    long j = this.A00;
                    long j2 = r9.A00;
                    long j3 = AnonymousClass0QG.A02;
                    if (j == j2) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        int A0N = AnonymousClass000.A0N(this.A01, AnonymousClass000.A0N(this.A03, AnonymousClass000.A0L(this.A02)));
        long j = this.A00;
        long j2 = AnonymousClass0QG.A02;
        return AnonymousClass001.A0J(j, A0N);
    }

    public C04710Ol(C16960tV r1, C28644ECa eCa, C24246By4 by4, long j) {
        this.A02 = eCa;
        this.A03 = by4;
        this.A01 = r1;
        this.A00 = j;
    }

    public final C28644ECa A01() {
        return this.A02;
    }

    public final C24246By4 A03() {
        return this.A03;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("DrawParams(density=");
        A10.append(this.A02);
        A10.append(", layoutDirection=");
        A10.append(this.A03);
        A10.append(", canvas=");
        A10.append(this.A01);
        A10.append(", size=");
        return AnonymousClass001.A1F(AnonymousClass0QG.A03(this.A00), A10);
    }

    public final void A04(C28644ECa eCa) {
        this.A02 = eCa;
    }

    public final void A05(C24246By4 by4) {
        this.A03 = by4;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.0tV, java.lang.Object] */
    public /* synthetic */ C04710Ol() {
        this(new Object(), AnonymousClass0M3.A00(), C24246By4.Ltr, (AnonymousClass1Y1) null, AnonymousClass0QG.A02);
    }
}
