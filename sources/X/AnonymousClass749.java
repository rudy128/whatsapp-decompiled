package X;

import android.content.Intent;
import java.lang.ref.WeakReference;

/* renamed from: X.749  reason: invalid class name */
public final class AnonymousClass749 {
    public static final C005702m A0J = new C005702m(-1, (Intent) null);
    public C135356s4 A00;
    public C136516tw A01;
    public final AnonymousClass1L9 A02;
    public final AnonymousClass1KB A03;
    public final AnonymousClass11P A04;
    public final C18030ve A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;
    public final AnonymousClass00H A0C;
    public final AnonymousClass00H A0D;
    public final C18100vl A0E = AnonymousClass1DF.A01(new C152577o8(this));
    public final C18100vl A0F = AnonymousClass1DF.A01(new C152587o9(this));
    public final C18100vl A0G = AnonymousClass1DF.A01(new C152647oF(this));
    public final C18100vl A0H = AnonymousClass1DF.A01(new C152657oG(this));
    public final C35681md A0I;

    public static final void A02(AnonymousClass1FU r8, C1601087d r9, AnonymousClass749 r10, Integer num, Integer num2) {
        Integer num3;
        AnonymousClass749 r3 = r10;
        AnonymousClass00H r1 = r10.A0B;
        C1601087d r6 = r9;
        if (((C139966zj) r1.get()).A03()) {
            r9.BzB(num2, false);
            return;
        }
        AnonymousClass1FU r5 = r8;
        C145337Kw r4 = new C145337Kw(r5, r6, (C18090vk) null, (C18090vk) null, (C18090vk) null, (C18090vk) null);
        C152637oE r102 = new C152637oE(r6);
        C156467uP r2 = new C156467uP(r5, r3);
        int A012 = A01(r3, num);
        C139966zj r92 = (C139966zj) r1.get();
        try {
            int A022 = r92.A00.A02.A02(A012);
            if (A022 < 1 || A022 >= 400) {
                num3 = AnonymousClass00R.A01;
            } else {
                num3 = AnonymousClass00R.A00;
            }
        } catch (IllegalArgumentException unused) {
            num3 = AnonymousClass00R.A0C;
        }
        int intValue = num3.intValue();
        if (intValue == 0 || intValue == 2) {
            r92.A02(r5, r4, r102, A012);
            return;
        }
        AnonymousClass82T r42 = new AnonymousClass82T(new AnonymousClass7wZ(r5, r4, r92, r102, A012), r2);
        WeakReference A0z = AnonymousClass3MW.A0z(r5);
        r5.CNA(2131891797);
        r92.A01.CGF(new C21365Aiu(r92, A0z, r42, A012, 47));
    }

    public static final void A04(AnonymousClass1FU r9, AnonymousClass749 r10, C18090vk r11, int i, boolean z) {
        WeakReference A0z = AnonymousClass3MW.A0z(r9);
        Integer valueOf = Integer.valueOf(i);
        ((C37291pH) r10.A06.get()).A02(r9, C138126wZ.A05, new C145337Kw(r9, new AnonymousClass7KG(r10, A0z, 0, z), r11, new C152617oC(r10), new C152627oD(r10), (C18090vk) null), valueOf, (String) null);
    }

    public static final void A05(AnonymousClass1FU r7, AnonymousClass749 r8, boolean z) {
        Integer num;
        AnonymousClass749 r4 = r8;
        AnonymousClass74D r1 = (AnonymousClass74D) r8.A08.get();
        C18070vi.A0X(r1);
        r1.A0A(2, true);
        A6Q a6q = (A6Q) r8.A0A.get();
        C18030ve r12 = a6q.A01;
        C18040vf r2 = C18040vf.A02;
        if (C18020vd.A05(r2, r12, 11284)) {
            num = A6Q.A01(a6q, 0);
        } else {
            num = null;
        }
        r4.A03.A0J(new AnonymousClass7Q6(r7, r4, num, 2, z, C18020vd.A05(r2, r8.A05, 6618)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0037, code lost:
        if (r16 == false) goto L_0x003f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0039, code lost:
        if (r5 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x003b, code lost:
        r5.C9i();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003f, code lost:
        if (r5 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        X.C108955ca.A1S(r12.A06);
        r0 = r13.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0048, code lost:
        if (r0 == null) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x004a, code lost:
        r1 = r0.getExtras();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        if (r1 == null) goto L_0x0068;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0050, code lost:
        r1 = java.lang.Integer.valueOf(r1.getInt("returned_result"));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005c, code lost:
        if (r13.A00 == 0) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005e, code lost:
        if (r1 == null) goto L_0x011c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0060, code lost:
        X.AnonymousClass71X.A00(r5, r1.intValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0067, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0068, code lost:
        r1 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006b, code lost:
        r1 = X.C72453Mb.A0I(r12.A0E);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0071, code lost:
        if (r4 == null) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0077, code lost:
        if (r4.intValue() != r1) goto L_0x008c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0079, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007a, code lost:
        r7 = new X.AnonymousClass7KG(r14, r12, 1, r3);
        r9 = new X.C152597oA(r12);
        r10 = new X.C152607oB(r12);
        r11 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x008c, code lost:
        r8 = new X.AnonymousClass7w3(r14, r12, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e6, code lost:
        r5 = new X.C145337Kw(r6, r7, r8, r9, r10, r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0110, code lost:
        r5 = new X.C145337Kw(r6, r7, (X.C18090vk) null, r9, r10, (X.C18090vk) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011c, code lost:
        r5.C9l();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x011f, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0092  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00ed  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0101  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A06(X.C005702m r13, X.AnonymousClass1FU r14, int r15, boolean r16) {
        /*
            r12 = this;
            r0 = 0
            r3 = 0
            if (r16 != 0) goto L_0x0019
            X.00H r0 = r12.A06
            X.C108955ca.A1S(r0)
            android.content.Intent r0 = r13.A01
            if (r0 == 0) goto L_0x0119
            android.os.Bundle r1 = r0.getExtras()
            if (r1 == 0) goto L_0x0119
            java.lang.String r0 = "disclosure_id"
            int r0 = r1.getInt(r0)
        L_0x0019:
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L_0x001d:
            X.6tw r2 = r12.A01
            r5 = 0
            r12.A01 = r5
            r6 = r14
            switch(r15) {
                case 66001: goto L_0x006b;
                case 66002: goto L_0x006a;
                case 66003: goto L_0x0092;
                case 66004: goto L_0x00ae;
                case 66005: goto L_0x00ed;
                case 66006: goto L_0x0101;
                default: goto L_0x0026;
            }
        L_0x0026:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "NewsletterLauncher/Unhandled callback for Code: "
            r1.append(r0)
            r1.append(r15)
            java.lang.String r0 = " Notice Id: "
            X.C17900vP.A0X(r4, r0, r1)
        L_0x0037:
            if (r16 == 0) goto L_0x003f
            if (r5 == 0) goto L_0x003e
            r5.C9i()
        L_0x003e:
            return
        L_0x003f:
            if (r5 == 0) goto L_0x003e
            X.00H r0 = r12.A06
            X.C108955ca.A1S(r0)
            android.content.Intent r0 = r13.A01
            if (r0 == 0) goto L_0x0068
            android.os.Bundle r1 = r0.getExtras()
            if (r1 == 0) goto L_0x0068
            java.lang.String r0 = "returned_result"
            int r0 = r1.getInt(r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r0)
        L_0x005a:
            int r0 = r13.A00
            if (r0 == 0) goto L_0x011c
            if (r1 == 0) goto L_0x011c
            int r0 = r1.intValue()
            X.AnonymousClass71X.A00(r5, r0)
            return
        L_0x0068:
            r1 = 0
            goto L_0x005a
        L_0x006a:
            r3 = 1
        L_0x006b:
            X.0vl r0 = r12.A0E
            int r1 = X.C72453Mb.A0I(r0)
            if (r4 == 0) goto L_0x008c
            int r0 = r4.intValue()
            if (r0 != r1) goto L_0x008c
            r8 = r5
        L_0x007a:
            r0 = 1
            X.7KG r7 = new X.7KG
            r7.<init>(r14, r12, r0, r3)
            X.7oA r9 = new X.7oA
            r9.<init>(r12)
            X.7oB r10 = new X.7oB
            r10.<init>(r12)
            r11 = 0
            goto L_0x00e6
        L_0x008c:
            X.7w3 r8 = new X.7w3
            r8.<init>(r14, r12, r3)
            goto L_0x007a
        L_0x0092:
            if (r2 != 0) goto L_0x009b
            r0 = 2131892810(0x7f121a4a, float:1.9420379E38)
            r14.BhQ(r0)
            return
        L_0x009b:
            r12.A01 = r5
            r0 = 1
            X.7KH r7 = new X.7KH
            r7.<init>(r2, r12, r14, r0)
            X.7uG r9 = new X.7uG
            r9.<init>(r14, r12)
            X.7uH r10 = new X.7uH
            r10.<init>(r14, r12)
            goto L_0x0110
        L_0x00ae:
            if (r2 == 0) goto L_0x003e
            java.lang.String r1 = r2.A05
            if (r1 == 0) goto L_0x003e
            X.00H r0 = r12.A07
            java.lang.Object r0 = r0.get()
            X.6cH r0 = (X.C126156cH) r0
            java.util.Map r0 = r0.A00
            java.lang.Object r0 = r0.get(r1)
            X.2an r0 = (X.C52362an) r0
            if (r0 == 0) goto L_0x003e
            X.00H r0 = r0.A00
            java.lang.Object r1 = X.C18070vi.A0E(r0)
            X.1kh r1 = (X.C34561kh) r1
            if (r1 == 0) goto L_0x003e
            r0 = 2
            X.7KH r7 = new X.7KH
            r7.<init>(r2, r1, r14, r0)
            X.7uI r9 = new X.7uI
            r9.<init>(r14, r12)
            X.7uJ r10 = new X.7uJ
            r10.<init>(r14, r1)
            X.7uK r11 = new X.7uK
            r11.<init>(r14, r1)
            r8 = 0
        L_0x00e6:
            X.7Kw r5 = new X.7Kw
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x0037
        L_0x00ed:
            X.6s4 r0 = r12.A00
            r12.A00 = r0
            X.7KH r7 = new X.7KH
            r7.<init>(r14, r0, r12, r3)
            X.7uL r9 = new X.7uL
            r9.<init>(r14, r12)
            X.7uM r10 = new X.7uM
            r10.<init>(r14, r12)
            goto L_0x0110
        L_0x0101:
            X.7KF r7 = new X.7KF
            r7.<init>(r14, r12, r3)
            X.7uN r9 = new X.7uN
            r9.<init>(r14, r12)
            X.7uO r10 = new X.7uO
            r10.<init>(r14, r12)
        L_0x0110:
            r8 = 0
            X.7Kw r5 = new X.7Kw
            r11 = r8
            r5.<init>(r6, r7, r8, r9, r10, r11)
            goto L_0x0037
        L_0x0119:
            r4 = 0
            goto L_0x001d
        L_0x011c:
            r5.C9l()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass749.A06(X.02m, X.1FU, int, boolean):void");
    }

    public final void A07(AnonymousClass1FU r6, int i, int i2, boolean z) {
        Integer num;
        AnonymousClass7w4 r1;
        C18070vi.A0d(r6, 0);
        if (i2 == -1 || !C139966zj.A00(this)) {
            AnonymousClass00H r4 = this.A0B;
            try {
                int A022 = ((C139966zj) r4.get()).A00.A02.A02(i);
                if (A022 < 1 || A022 >= 400) {
                    num = AnonymousClass00R.A01;
                } else {
                    num = AnonymousClass00R.A00;
                }
            } catch (IllegalArgumentException unused) {
                num = AnonymousClass00R.A0C;
            }
            int intValue = num.intValue();
            if (!(intValue == 1 || intValue == 2)) {
                if (intValue == 0) {
                    int intValue2 = ((C139966zj) r4.get()).A01(i).intValue();
                    if (intValue2 != 1) {
                        if (intValue2 == 2) {
                            r6.BhQ(2131892810);
                            return;
                        } else if (intValue2 != 0) {
                            return;
                        } else {
                            if (i != C72453Mb.A0I(this.A0E)) {
                                A07(r6, i2, -1, z);
                                return;
                            }
                        }
                    }
                } else {
                    return;
                }
            }
            WeakReference A0z = AnonymousClass3MW.A0z(r6);
            if (i == C72453Mb.A0I(this.A0E)) {
                r1 = null;
            } else {
                r1 = new AnonymousClass7w4(this, A0z, z);
            }
            if (C72453Mb.A1a(this.A0G)) {
                int i3 = 66002;
                if (!z) {
                    i3 = 66001;
                }
                A03(r6, this, i, i3);
                return;
            }
            A04(r6, this, r1, i, z);
            return;
        }
        A07(r6, i2, -1, z);
    }

    public final void A08(AnonymousClass1FU r7, C46162Dk r8, int i) {
        C18070vi.A0d(r7, 0);
        if (r8.A0D > 0) {
            A09(r7, r8.A0M(), (String) null, i);
            return;
        }
        this.A0I.A03(r8, new AnonymousClass7wY(r8, this, AnonymousClass3MW.A0z(r7), i));
    }

    public final void A0A(AnonymousClass1FU r10, String str, String str2, int i, boolean z) {
        C1601087d r3;
        int A012;
        boolean A002;
        int i2;
        C18070vi.A0d(r10, 0);
        if (!C18020vd.A05(C18040vf.A02, this.A05, 7685) || !z) {
            String str3 = str;
            String str4 = str2;
            int i3 = i;
            if (C72453Mb.A1a(this.A0H)) {
                this.A00 = new C135356s4(str, str2, i);
                A012 = A01(this, AnonymousClass00R.A01);
                A002 = C139966zj.A00(this);
                i2 = 66005;
            } else {
                r3 = new AnonymousClass7KI(this, str3, str4, AnonymousClass3MW.A0z(r10), i3);
                A02(r10, r3, this, AnonymousClass00R.A01, ((A6Q) this.A0A.get()).A03(0));
                return;
            }
        } else {
            WeakReference A0z = AnonymousClass3MW.A0z(r10);
            if (C72453Mb.A1a(this.A0H)) {
                A012 = A01(this, AnonymousClass00R.A01);
                A002 = C139966zj.A00(this);
                i2 = 66006;
            } else {
                r3 = new AnonymousClass7KF(this, A0z, 1);
                A02(r10, r3, this, AnonymousClass00R.A01, ((A6Q) this.A0A.get()).A03(0));
                return;
            }
        }
        if (A002) {
            A06(A0J, r10, i2, true);
        } else {
            A03(r10, this, A012, i2);
        }
    }

    public static final int A00(AnonymousClass749 r0) {
        return C72453Mb.A0I(r0.A0E);
    }

    public static final int A01(AnonymousClass749 r1, Integer num) {
        int i;
        int intValue = num.intValue();
        C18030ve r12 = ((C52352am) r1.A09.get()).A00;
        if (intValue != 1) {
            i = 6498;
        } else {
            i = 3810;
        }
        return Integer.parseInt(C108955ca.A0v(r12, i));
    }

    public static final void A03(AnonymousClass1FU r6, AnonymousClass749 r7, int i, int i2) {
        Integer valueOf = Integer.valueOf(i);
        C138126wZ r1 = C138126wZ.A05;
        C18070vi.A0g(r6, 2, r1);
        C108955ca.A1S(((C37291pH) C18070vi.A0E(r7.A06)).A04);
        r6.A3p(AnonymousClass1LU.A0V(r6, r1, valueOf, (String) null, true), "newsletter_handler", i2);
    }

    public final void A09(AnonymousClass1FU r21, C29681ch r22, String str, int i) {
        Integer num;
        Integer num2;
        AnonymousClass1FU r2 = r21;
        C29681ch r5 = r22;
        C18070vi.A0h(r2, r5);
        int i2 = i;
        Integer A032 = ((A6Q) this.A0A.get()).A03(AnonymousClass6X2.A00(i2));
        String str2 = str;
        if (C72453Mb.A1a(this.A0H)) {
            C136516tw r4 = new C136516tw(r5, A032, (String) null, str2, (String) null, (String) null, (String) null, i2, 0);
            C29681ch r7 = r4.A02;
            if (r7 != null) {
                int i3 = r4.A00;
                if (i3 == 12) {
                    num2 = AnonymousClass00R.A0C;
                } else {
                    num2 = AnonymousClass00R.A01;
                }
                if (C139966zj.A00(this)) {
                    int i4 = i3;
                    AnonymousClass1FU r6 = r2;
                    this.A03.A0J(new AnonymousClass3CT(this, r6, r7, r4.A03, r4.A07, i4, 2, true));
                    return;
                }
                this.A01 = r4;
                A03(r2, this, A01(this, num2), 66003);
                return;
            }
            throw AnonymousClass000.A0n("Invalid argument for newsletter missing code and jid");
        }
        AnonymousClass7KJ r13 = new AnonymousClass7KJ(r5, this, A032, str2, AnonymousClass3MW.A0z(r2), i2);
        if (i2 == 12) {
            num = AnonymousClass00R.A0C;
        } else {
            num = AnonymousClass00R.A01;
        }
        A02(r2, r13, this, num, A032);
    }

    public AnonymousClass749(AnonymousClass1L9 r2, AnonymousClass1KB r3, AnonymousClass11P r4, C18030ve r5, C35681md r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12, AnonymousClass00H r13, AnonymousClass00H r14) {
        C18070vi.A0w(r5, r4, r2, r7, r6);
        C18070vi.A0x(r3, r8, r9, r10, r11);
        C18070vi.A0r(r12, r13, r14);
        this.A05 = r5;
        this.A04 = r4;
        this.A02 = r2;
        this.A06 = r7;
        this.A0I = r6;
        this.A03 = r3;
        this.A08 = r8;
        this.A0C = r9;
        this.A0B = r10;
        this.A0D = r11;
        this.A0A = r12;
        this.A07 = r13;
        this.A09 = r14;
    }
}
