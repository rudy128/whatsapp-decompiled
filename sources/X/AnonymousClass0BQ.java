package X;

import android.graphics.Paint;

/* renamed from: X.0BQ  reason: invalid class name */
public final class AnonymousClass0BQ extends C01850Ad {
    public static final C16790tE A02;
    public C01880Ag A00;
    public final C014208k A01;

    static {
        AnonymousClass0WR r2 = new AnonymousClass0WR();
        r2.CIO(C05100Qk.A03);
        r2.A01.setStrokeWidth(1.0f);
        r2.A01.setStyle(Paint.Style.STROKE);
        A02 = r2;
    }

    public int A0a(C04280Mo r2) {
        C01880Ag r0 = this.A00;
        if (r0 != null) {
            return r0.A0a(r2);
        }
        Number number = (Number) A0u().A0c().get(r2);
        if (number != null) {
            return number.intValue();
        }
        return Integer.MIN_VALUE;
    }

    public void A17() {
        if (this.A00 == null) {
            this.A00 = new C01870Af(this);
        }
    }

    public void A1E(C06850Zx r13, C16720su r14, long j, boolean z, boolean z2) {
        boolean z3 = z2;
        AnonymousClass0XV A0t = A0t();
        C16720su r5 = r14;
        if (r14.CM2(A0t)) {
            long j2 = j;
            boolean z4 = z;
            if (!A1N(j2)) {
                if (z) {
                    float A0m = A0m(j2, A0n());
                    if (!Float.isInfinite(A0m) && !Float.isNaN(A0m)) {
                        z3 = false;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            C06850Zx r6 = r13;
            int A012 = r13.A01;
            C06970a9 A0E = A0t.A0E();
            int i = A0E.A00;
            if (i > 0) {
                int i2 = i - 1;
                Object[] objArr = A0E.A01;
                do {
                    AnonymousClass0XV r7 = (AnonymousClass0XV) objArr[i2];
                    if (r7.A0Q.A0G.A08) {
                        r5.BEo(r6, r7, j2, z4, z3);
                        if (r13.A0E()) {
                            if (!r7.A0K().A1M()) {
                                break;
                            }
                            r13.A0A();
                        }
                    }
                    i2--;
                } while (i2 >= 0);
            }
            r13.A01 = A012;
        }
    }

    public AnonymousClass0BQ(AnonymousClass0XV r2) {
        super(r2);
        C01870Af r0;
        C014208k r02 = new C014208k();
        this.A01 = r02;
        r02.A0H(this);
        if (r2.A07 != null) {
            r0 = new C01870Af(this);
        } else {
            r0 = null;
        }
        this.A00 = r0;
    }

    public void A0Z(C22821Di r2, float f, long j) {
        super.A0Z(r2, f, j);
        if (!A0j()) {
            A15();
            A0t().A0Q.A0G.A0e();
        }
    }

    public /* bridge */ /* synthetic */ AnonymousClass0XW A0r() {
        return this.A01;
    }

    public C01880Ag A0v() {
        return this.A00;
    }

    public void A1B(C16960tV r7) {
        AnonymousClass0XV A0t = A0t();
        C17140to A002 = AnonymousClass0O0.A00(A0t);
        C06970a9 A0E = A0t.A0E();
        int i = A0E.A00;
        if (i > 0) {
            Object[] objArr = A0E.A01;
            int i2 = 0;
            do {
                AnonymousClass0XV r1 = (AnonymousClass0XV) objArr[i2];
                if (r1.A0Q.A0G.A08) {
                    r1.A0e(r7);
                }
                i2++;
            } while (i2 < i);
        }
        if (A002.getShowLayoutBounds()) {
            A1C(r7, A02);
        }
    }

    public C014208k A1O() {
        return this.A01;
    }

    public int Bj9(int i) {
        return A0t().A0P.A01(i);
    }

    public int BjC(int i) {
        return A0t().A0P.A02(i);
    }

    public AnonymousClass0XJ Bjb(long j) {
        A0X(j);
        AnonymousClass0XV A0t = A0t();
        C06970a9 A0F = A0t.A0F();
        int i = A0F.A00;
        if (i > 0) {
            Object[] objArr = A0F.A01;
            int i2 = 0;
            do {
                ((AnonymousClass0XV) objArr[i2]).A0Q.A0G.A05 = AnonymousClass00R.A0C;
                i2++;
            } while (i2 < i);
        }
        A1D(A0t.A06.BjZ(this, A0t.A0Q.A0G.A0b(), j));
        A14();
        return this;
    }

    public int Bjv(int i) {
        return A0t().A0P.A05(i);
    }

    public int Bjy(int i) {
        return A0t().A0P.A06(i);
    }
}
