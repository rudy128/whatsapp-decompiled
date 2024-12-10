package X;

import android.os.SystemClock;

/* renamed from: X.4Yq  reason: invalid class name and case insensitive filesystem */
public class C88184Yq {
    public long A00;
    public C81613zW A01;
    public final AnonymousClass1MZ A02;
    public final C26521Sl A03;
    public final AnonymousClass11P A04;
    public final C18030ve A05;
    public final AnonymousClass18K A06;

    public static void A00(C88184Yq r6) {
        C81613zW r5 = r6.A01;
        C17960vV.A07(r5);
        long j = r6.A00;
        long j2 = 0;
        if (j != 0) {
            j2 = SystemClock.elapsedRealtime() - j;
        }
        r5.A06 = Long.valueOf(j2);
        r6.A00 = SystemClock.elapsedRealtime();
    }

    public void A01() {
        C81613zW r1 = this.A01;
        C17960vV.A07(r1);
        this.A06.CC7(r1);
    }

    public void A02(int i) {
        C81613zW r1 = this.A01;
        if (r1 != null && r1.A03.intValue() == i) {
            r1.A02 = C17880vN.A0j();
            A00(this);
            A01();
            if (C18020vd.A05(C18040vf.A02, this.A05, 3223)) {
                this.A01.A03 = C17880vN.A0h();
                return;
            }
            this.A00 = 0;
            if (this.A01 != null) {
                this.A01 = null;
            }
        }
    }

    public void A03(int i) {
        C81613zW r1 = this.A01;
        if (r1 != null && r1.A03.intValue() == i) {
            r1.A02 = C17880vN.A0i();
            A00(this);
            A01();
            this.A00 = 0;
            if (this.A01 != null) {
                this.A01 = null;
            }
        }
    }

    public void A04(AnonymousClass1BI r4) {
        this.A00 = 0;
        if (this.A01 != null) {
            this.A01 = null;
        }
        C81613zW r2 = new C81613zW();
        this.A01 = r2;
        if (r4 != null) {
            boolean A0e = C22971Dz.A0e(r4);
            r2.A00 = Boolean.valueOf(A0e);
            if (A0e) {
                r2.A04 = Integer.valueOf(C64002u3.A03(this.A02.A08.A09((AnonymousClass1E9) r4)));
            }
        }
        A00(this);
        C81613zW r1 = this.A01;
        Integer A0h = C17880vN.A0h();
        r1.A02 = A0h;
        r1.A03 = A0h;
        A01();
    }

    public void A05(String str, Integer num) {
        int i;
        C81613zW r1 = this.A01;
        if (r1 != null && str != null) {
            switch (str.hashCode()) {
                case -1367751899:
                    if (str.equals("camera")) {
                        i = 3;
                        break;
                    } else {
                        return;
                    }
                case -1275762953:
                    if (str.equals("quick reply")) {
                        i = AnonymousClass3MY.A0h();
                        break;
                    } else {
                        return;
                    }
                case -786681338:
                    if (str.equals("payment")) {
                        i = 11;
                        break;
                    } else {
                        return;
                    }
                case -309474065:
                    if (str.equals("product")) {
                        i = 14;
                        break;
                    } else {
                        return;
                    }
                case -196315310:
                    if (str.equals("gallery")) {
                        i = 5;
                        break;
                    } else {
                        return;
                    }
                case -171914408:
                    if (str.equals("calllink")) {
                        i = 19;
                        break;
                    } else {
                        return;
                    }
                case 3446719:
                    if (str.equals("poll")) {
                        i = 10;
                        break;
                    } else {
                        return;
                    }
                case 93166550:
                    if (str.equals("audio")) {
                        i = 7;
                        break;
                    } else {
                        return;
                    }
                case 96891546:
                    if (str.equals("event")) {
                        i = 18;
                        break;
                    } else {
                        return;
                    }
                case 861720859:
                    if (str.equals("document")) {
                        i = 2;
                        break;
                    } else {
                        return;
                    }
                case 951526432:
                    if (str.equals("contact")) {
                        i = 9;
                        break;
                    } else {
                        return;
                    }
                case 1566438421:
                    if (str.equals("imagine sheet")) {
                        i = 17;
                        break;
                    } else {
                        return;
                    }
                case 1901043637:
                    if (str.equals("location")) {
                        i = 8;
                        break;
                    } else {
                        return;
                    }
                default:
                    return;
            }
            A00(this);
            r1.A02 = C17880vN.A0h();
            r1.A03 = i;
            if (num != null) {
                r1.A01 = num;
            }
            A01();
        }
    }

    public C88184Yq(AnonymousClass11P r1, AnonymousClass1MZ r2, C18030ve r3, AnonymousClass18K r4, C26521Sl r5) {
        this.A04 = r1;
        this.A05 = r3;
        this.A06 = r4;
        this.A03 = r5;
        this.A02 = r2;
    }
}
