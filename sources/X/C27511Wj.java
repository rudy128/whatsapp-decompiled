package X;

/* renamed from: X.1Wj  reason: invalid class name and case insensitive filesystem */
public class C27511Wj {
    public final AnonymousClass18K A00;
    public final AnonymousClass195 A01;
    public final C23651Hc A02;
    public final C18030ve A03;

    public static void A00(C27511Wj r5, int i, int i2, int i3, int i4, long j, boolean z, boolean z2) {
        C47052Gx r3 = new C47052Gx();
        r3.A08 = Long.valueOf(j);
        r3.A04 = Integer.valueOf(i);
        r3.A07 = Long.valueOf((long) i3);
        r3.A05 = Integer.valueOf(i2);
        if (r5.A01.A00) {
            r3.A03 = 1;
        } else {
            r3.A03 = 2;
        }
        r3.A02 = Boolean.valueOf(r5.A02.A02());
        r3.A01 = Boolean.valueOf(z);
        r3.A09 = Long.valueOf((long) i4);
        if (z2) {
            r3.A06 = 0;
        } else {
            r3.A06 = 1;
        }
        if (C18020vd.A05(C18040vf.A02, r5.A03, 3157)) {
            r3.A00 = true;
            r5.A00.CC0(r3, new C18180vt(1, 1), true);
            return;
        }
        r5.A00.CC7(r3);
    }

    public void A01(int i, long j, long j2, long j3) {
        C46902Gi r3 = new C46902Gi();
        r3.A04 = Integer.valueOf(i);
        r3.A05 = Long.valueOf(j);
        r3.A07 = Long.valueOf(j2);
        r3.A06 = Long.valueOf(j3);
        if (this.A01.A00) {
            r3.A02 = 1;
        } else {
            r3.A02 = 2;
        }
        r3.A01 = Boolean.valueOf(this.A02.A02());
        r3.A03 = 1;
        this.A00.CC7(r3);
    }

    public C27511Wj(AnonymousClass195 r1, C23651Hc r2, C18030ve r3, AnonymousClass18K r4) {
        this.A00 = r4;
        this.A02 = r2;
        this.A01 = r1;
        this.A03 = r3;
    }
}
