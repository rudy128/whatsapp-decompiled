package X;

import android.view.View;

/* renamed from: X.4VI  reason: invalid class name */
public final class AnonymousClass4VI {
    public C107495Zx A00;
    public final View A01;
    public final AnonymousClass1FU A02;
    public final AnonymousClass1KB A03;
    public final AnonymousClass18O A04;
    public final C18000vb A05;
    public final AnonymousClass4QE A06;
    public final AnonymousClass1EC A07;
    public final C25011Mn A08;
    public final AnonymousClass11E A09;
    public final AnonymousClass1M9 A0A;
    public final C24921Me A0B;
    public final AnonymousClass1NN A0C;
    public final AnonymousClass1MZ A0D;
    public final AnonymousClass126 A0E;
    public final AnonymousClass12M A0F;

    public final void A00(String str) {
        String str2 = str;
        C18070vi.A0d(str, 0);
        AnonymousClass1M9 r0 = this.A0A;
        AnonymousClass1EC r5 = this.A07;
        AnonymousClass1E7 A0H = r0.A0H(r5);
        if (A02(false) && !C18070vi.A18(this.A0B.A0I(A0H), str) && A01(str)) {
            View view = this.A01;
            if (view != null) {
                view.setVisibility(0);
            }
            this.A0F.A0E(new AnonymousClass40h(this.A0C, this, this.A0E, r5, str2));
        }
    }

    public final boolean A01(String str) {
        int A002 = C137186v3.A00(str);
        int A042 = this.A04.A04(AnonymousClass18O.A1O);
        if (A002 <= A042) {
            return true;
        }
        AnonymousClass1KB r5 = this.A03;
        Object[] objArr = new Object[1];
        C17880vN.A1T(objArr, A042, 0);
        r5.A0G(this.A05.A0K(objArr, 2131755175, (long) A042), 0);
        return false;
    }

    public AnonymousClass4VI(View view, AnonymousClass1FU r5, AnonymousClass1KB r6, AnonymousClass18O r7, AnonymousClass11E r8, AnonymousClass1M9 r9, C24921Me r10, C18000vb r11, AnonymousClass1NN r12, AnonymousClass1MZ r13, AnonymousClass126 r14, AnonymousClass4QE r15, AnonymousClass12M r16, AnonymousClass1EC r17, C25011Mn r18) {
        AnonymousClass1EC r2 = r17;
        C18070vi.A0p(r2, r5, r6);
        C25011Mn r1 = r18;
        C18070vi.A0d(r1, 5);
        C18070vi.A0x(r7, r11, r10, r9, r14);
        AnonymousClass12M r0 = r16;
        C18070vi.A0y(r0, r8, r12, r15, r13);
        this.A01 = view;
        this.A07 = r2;
        this.A02 = r5;
        this.A03 = r6;
        this.A08 = r1;
        this.A04 = r7;
        this.A05 = r11;
        this.A0B = r10;
        this.A0A = r9;
        this.A0E = r14;
        this.A0F = r0;
        this.A09 = r8;
        this.A0C = r12;
        this.A06 = r15;
        this.A0D = r13;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r1.A13 == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A02(boolean r6) {
        /*
            r5 = this;
            X.1M9 r0 = r5.A0A
            X.1EC r2 = r5.A07
            X.1E7 r1 = r0.A0H(r2)
            X.1MZ r0 = r5.A0D
            boolean r4 = r0.A0J(r2)
            boolean r0 = r0.A0K(r2)
            r3 = 1
            r2 = 0
            if (r0 != 0) goto L_0x001b
            boolean r1 = r1.A13
            r0 = 1
            if (r1 != 0) goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            if (r4 != 0) goto L_0x002c
            X.1FU r1 = r5.A02
            r0 = 2131890329(0x7f121099, float:1.9415347E38)
            if (r6 == 0) goto L_0x0028
            r0 = 2131890325(0x7f121095, float:1.9415339E38)
        L_0x0028:
            r1.BhQ(r0)
            return r2
        L_0x002c:
            if (r0 == 0) goto L_0x0039
            X.1FU r1 = r5.A02
            r0 = 2131890328(0x7f121098, float:1.9415345E38)
            if (r6 == 0) goto L_0x0028
            r0 = 2131890326(0x7f121096, float:1.941534E38)
            goto L_0x0028
        L_0x0039:
            X.11E r0 = r5.A09
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x004f
            X.1KB r1 = r5.A03
            r0 = 2131892941(0x7f121acd, float:1.9420644E38)
            if (r6 == 0) goto L_0x004b
            r0 = 2131889611(0x7f120dcb, float:1.941389E38)
        L_0x004b:
            r1.A09(r0, r2)
            return r2
        L_0x004f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4VI.A02(boolean):boolean");
    }
}
