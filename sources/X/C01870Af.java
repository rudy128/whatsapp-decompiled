package X;

/* renamed from: X.0Af  reason: invalid class name and case insensitive filesystem */
public final class C01870Af extends C01880Ag {
    public final /* synthetic */ AnonymousClass0BQ A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C01870Af(AnonymousClass0BQ r1) {
        super(r1);
        this.A00 = r1;
    }

    public int A0a(C04280Mo r4) {
        int i;
        Number number = (Number) A0q().A0c().get(r4);
        if (number != null) {
            i = number.intValue();
        } else {
            i = Integer.MIN_VALUE;
        }
        A0s().put(r4, Integer.valueOf(i));
        return i;
    }

    public void A0t() {
        AnonymousClass0AL r0 = A0p().A0Q.A04;
        C18070vi.A0b(r0);
        r0.A0e();
    }

    public int Bj9(int i) {
        return A0p().A0P.A03(i);
    }

    public int BjC(int i) {
        return A0p().A0P.A04(i);
    }

    public AnonymousClass0XJ Bjb(long j) {
        A0X(j);
        AnonymousClass0XV A0p = A0p();
        C06970a9 A0F = A0p.A0F();
        int i = A0F.A00;
        if (i > 0) {
            Object[] objArr = A0F.A01;
            int i2 = 0;
            do {
                AnonymousClass0AL r1 = ((AnonymousClass0XV) objArr[i2]).A0Q.A04;
                C18070vi.A0b(r1);
                r1.A02 = AnonymousClass00R.A0C;
                i2++;
            } while (i2 < i);
        }
        A01(A0p.A06.BjZ(this, A0p.A0P(), j));
        return this;
    }

    public int Bjv(int i) {
        return A0p().A0P.A07(i);
    }

    public int Bjy(int i) {
        return A0p().A0P.A08(i);
    }
}
