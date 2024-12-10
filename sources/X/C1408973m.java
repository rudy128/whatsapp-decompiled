package X;

/* renamed from: X.73m  reason: invalid class name and case insensitive filesystem */
public class C1408973m {
    public long A00 = 0;
    public long A01 = 0;
    public long A02 = 0;
    public long A03 = 0;
    public long A04 = 0;
    public long A05 = 0;
    public final AnonymousClass18K A06;
    public final AnonymousClass19T A07;
    public final boolean A08;
    public final AnonymousClass11P A09;

    public static void A01(C1408973m r2, Integer num, int i, int i2) {
        String str;
        String str2;
        AnonymousClass19T r22 = r2.A07;
        if (num.intValue() == 0) {
            str = "api_1";
        } else {
            str = "api_2";
        }
        r22.markerAnnotate(i, "camera_api", str);
        if (i2 == 1) {
            str2 = "camera_core";
        } else {
            str2 = "wa";
        }
        r22.markerAnnotate(i, "camera_type", str2);
    }

    public static void A04(C1408973m r2, String str, String str2) {
        if (r2.A08) {
            AnonymousClass19T r22 = r2.A07;
            if (!r22.BfT(554251647)) {
                r22.markerStart(554251647, "startup_type", str);
                r22.markerAnnotate(554251647, "origin", str2);
            }
        }
    }

    public void A05(short s) {
        if (this.A08) {
            this.A07.markerEnd(554251647, s);
        }
    }

    public C1408973m(AnonymousClass11P r3, C18030ve r4, AnonymousClass18K r5, AnonymousClass19T r6) {
        this.A09 = r3;
        this.A06 = r5;
        this.A07 = r6;
        this.A08 = C18020vd.A05(C18040vf.A02, r4, 980);
    }

    public static void A00(C1408973m r2, int i, int i2) {
        String str;
        Integer valueOf = Integer.valueOf(i2);
        if (valueOf == null || (str = valueOf.toString()) == null) {
            str = "";
        }
        r2.A07.markerAnnotate(i, "camera_facing", str);
    }

    public static void A02(C1408973m r2, String str, int i) {
        String A0y = AnonymousClass000.A0y("_end", AnonymousClass000.A11(str));
        if (r2.A08) {
            r2.A07.markerPoint(i, A0y);
        }
    }

    public static void A03(C1408973m r2, String str, int i) {
        String A0y = AnonymousClass000.A0y("_start", AnonymousClass000.A11(str));
        if (r2.A08) {
            r2.A07.markerPoint(i, A0y);
        }
    }
}
