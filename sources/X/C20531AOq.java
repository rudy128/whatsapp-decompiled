package X;

import java.util.HashMap;

/* renamed from: X.AOq  reason: case insensitive filesystem */
public class C20531AOq implements BAW {
    public AnonymousClass8FJ A00;
    public BAa A01;
    public C190599lD A02;
    public boolean A03;
    public final C192699op A04;
    public final C173738ve A05;
    public final C19989A2b A06;
    public final AM5 A07;
    public final AM5 A08;
    public final AM7 A09;
    public final A5L A0A;
    public final C219217x A0B;
    public final AnonymousClass1XN A0C;
    public final AnonymousClass10I A0D;

    public void A07(C185719d2 r10) {
        if (this.A03) {
            this.A03 = false;
            AnonymousClass8FJ r2 = this.A00;
            if (r2.A00 == 1) {
                r2.A02.removeCallbacks(r2.A09);
            }
            C19989A2b a2b = this.A06;
            a2b.A03("gps_request_end");
            this.A04.A01(r10.A01, this, a2b, r10.A02, "device", r10.A00);
            return;
        }
        A5L a5l = this.A0A;
        C20079A6f A022 = a5l.A02();
        if (A022 != null && "device".equals(A022.A08)) {
            if (AnonymousClass8BX.A0D(C20079A6f.A00(A022), "origin").distanceTo(AnonymousClass8BX.A0D(r10.A01, "destination")) > 800.0f) {
                a5l.A01 = true;
                a5l.A00 = null;
                this.A01.BxG();
            }
        }
    }

    public int A01() {
        C20079A6f a6f = this.A00.A01;
        if (a6f == null) {
            return 2;
        }
        return a6f.A03();
    }

    public void A02() {
        C19989A2b a2b = this.A06;
        a2b.A02();
        a2b.A03("gps_request_start");
        this.A03 = true;
    }

    public void A03() {
        AM5 am5;
        int i;
        Integer num;
        int i2;
        AnonymousClass8FJ r2 = this.A00;
        int i3 = r2.A00;
        if (!(i3 == 0 || i3 == 2)) {
            if (i3 == 4) {
                am5 = this.A07;
                i = r2.A0G();
                num = A00(this);
                i2 = 27;
                am5.A06(num, i2, i);
            } else if (i3 != 7) {
                return;
            }
        }
        am5 = this.A07;
        i = r2.A0G();
        num = A00(this);
        i2 = 26;
        am5.A06(num, i2, i);
    }

    public void A04() {
        AnonymousClass8FJ r2 = this.A00;
        A5L a5l = r2.A04;
        C20041A4k a4k = r2.A05;
        C20079A6f A022 = a5l.A02();
        if (A022 == null) {
            A022 = a4k.A02();
        }
        AnonymousClass8FJ.A01(A022, r2);
        AnonymousClass8FJ.A02(r2);
    }

    public void A05() {
        AnonymousClass8FJ r2 = this.A00;
        r2.A00 = 3;
        r2.A02.removeCallbacks(r2.A09);
        r2.A0E(AnonymousClass8FJ.A00(r2));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0019, code lost:
        if (r2 == 7) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08(X.C190599lD r6, int r7) {
        /*
            r5 = this;
            if (r6 == 0) goto L_0x0028
            X.AM7 r4 = r5.A09
            java.lang.String r0 = "imprecise_location_tile"
            java.util.HashMap r3 = r6.A00(r0)
            int r2 = r6.A00
            r1 = 28
            if (r2 == 0) goto L_0x001d
            r0 = 1
            if (r2 == r0) goto L_0x001b
            r0 = 4
            if (r2 == r0) goto L_0x001b
            r0 = 7
            r1 = 27
            if (r2 != r0) goto L_0x001d
        L_0x001b:
            r1 = 29
        L_0x001d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            int r0 = r0.intValue()
            r4.BiG(r3, r7, r0)
        L_0x0028:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20531AOq.A08(X.9lD, int):void");
    }

    public boolean A09() {
        int i = this.A00.A00;
        if (i == 2 || i == 0 || i == 7) {
            return true;
        }
        return false;
    }

    public void Bvo(C190599lD r4, int i) {
        this.A02 = r4;
        AnonymousClass8FJ r2 = this.A00;
        if (r2.A00 == 1) {
            int i2 = 6;
            if (i == -1) {
                i2 = 5;
            }
            r2.A00 = i2;
            r2.A02.removeCallbacks(r2.A09);
            r2.A0F(AnonymousClass8FJ.A00(r2));
        }
        if (i == 4) {
            this.A01.Bvn();
        }
        this.A06.A00();
    }

    public void Bvp(C20079A6f a6f) {
        AnonymousClass8FJ r2 = this.A00;
        if (r2.A00 == 1) {
            r2.A02.removeCallbacks(r2.A09);
            C21451AkI.A01(r2.A08, r2, a6f, 46);
        }
        this.A06.A01();
    }

    public C20531AOq(C189319it r10, C189329iu r11, AM5 am5, AM5 am52, AM7 am7, C173738ve r15, A5L a5l, C20041A4k a4k, C22426B7i b7i, BAa bAa, C22495BAc bAc, C219217x r21, AnonymousClass1XN r22, AnonymousClass7CB r23, AnonymousClass10I r24) {
        AnonymousClass10I r8 = r24;
        this.A0D = r8;
        this.A07 = am5;
        C219217x r6 = r21;
        this.A0B = r6;
        AnonymousClass1XN r7 = r22;
        this.A0C = r7;
        this.A04 = r11.A00(r23, am52);
        this.A05 = r15;
        A5L a5l2 = a5l;
        this.A0A = a5l2;
        this.A06 = r10.A00(871839723);
        this.A00 = new AnonymousClass8FJ(r15, a5l2, a4k, b7i, bAc, r6, r7, r8);
        this.A01 = bAa;
        this.A08 = am52;
        this.A09 = am7;
    }

    public static Integer A00(C20531AOq aOq) {
        return Integer.valueOf(aOq.A01());
    }

    public void A06(int i) {
        HashMap A11 = C17880vN.A11();
        A11.put("error_type", "location_error");
        A11.put("error_description", "System location providers - GPS and Network providers - are not available");
        this.A09.BiG(A11, i, 51);
        this.A06.A00();
    }
}
