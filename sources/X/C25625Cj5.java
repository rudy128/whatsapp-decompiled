package X;

import java.util.concurrent.CancellationException;

/* renamed from: X.Cj5  reason: case insensitive filesystem */
public final class C25625Cj5 {
    public int A00;
    public int A01;
    public int A02;
    public BTZ A03;
    public C25603Cii A04;
    public Integer A05 = AnonymousClass00R.A00;
    public C22821Di A06;
    public AnonymousClass1OB A07;
    public boolean A08;
    public final double A09;
    public final double A0A;
    public final double A0B;
    public final int A0C;
    public final int A0D;
    public final int A0E;
    public final int A0F;
    public final int A0G;
    public final long A0H;
    public final String A0I;
    public final String A0J;
    public final C18100vl A0K = AnonymousClass1DF.A01(new C27521Dgo(this));
    public final C18100vl A0L = AnonymousClass1DF.A01(new C27522Dgp(this));

    public C25625Cj5(BTZ btz, C25603Cii cii, String str, String str2, C22821Di r7, double d, double d2, double d3, int i, int i2, int i3, int i4, int i5, long j) {
        C18070vi.A0d(r7, 14);
        this.A03 = btz;
        this.A0H = j;
        this.A09 = d;
        this.A0E = i;
        this.A0G = i2;
        this.A0D = i3;
        this.A0J = str;
        this.A0I = str2;
        this.A0B = d2;
        this.A0F = i4;
        this.A0A = d3;
        this.A0C = i5;
        this.A04 = cii;
        this.A06 = r7;
    }

    public static final void A00(C25625Cj5 cj5) {
        AnonymousClass1OB r1 = cj5.A07;
        if (r1 != null) {
            r1.BEM((CancellationException) null);
            cj5.A07 = null;
        }
        cj5.A00 = ((C25269CcE) cj5.A0K.getValue()).A01(cj5.A03.A00);
        cj5.A01 = 0;
        cj5.A02 = 0;
        C25603Cii cii = cj5.A04;
        cii.A00 = 0;
        cii.A02 = Long.MAX_VALUE;
        cii.A01 = 0;
        cii.A06.set(false);
    }
}
