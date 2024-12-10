package X;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import java.util.List;

/* renamed from: X.CnY  reason: case insensitive filesystem */
public abstract class C25865CnY {
    public static final C28604E9v A01(DOZ doz, DFL dfl) {
        C26742DBv dBv;
        C26741DBu dBu;
        C18070vi.A0d(doz, 0);
        E8A A0A = dfl.A0A(44);
        if (A0A != null) {
            dBv = new C26742DBv(doz, dfl, A0A);
        } else {
            dBv = null;
        }
        if (!AnonymousClass000.A1a(BE7.A0s(dfl, 133)) || (dBu = (C26741DBu) C26272CwJ.A04(doz, dfl)) == null) {
            return dBv;
        }
        if (dBv == null) {
            return dBu;
        }
        C26741DBu dBu2 = new C26741DBu();
        List list = dBu2.A00;
        list.add(dBv);
        list.add(dBu);
        return dBu2;
    }

    public static final C22825BRd A02(DOZ doz, DFL dfl) {
        PointF pointF;
        EBA eba;
        C24256ByE byE;
        Drawable A00;
        int A01;
        boolean A17 = C18070vi.A17(doz, dfl);
        Context context = doz.A00;
        boolean A0I = dfl.A0I(66, false);
        DFL A09 = dfl.A09(61);
        if (A09 != null) {
            pointF = new PointF(A09.A03(35, 0.5f), A09.A03(36, 0.5f));
        } else {
            pointF = null;
        }
        C22824BRc bRc = new C22824BRc(C22825BRd.A0Z);
        String A0g = BE7.A0g(dfl);
        if (pointF != null) {
            eba = EBA.A0A;
        } else {
            if (A0g != null) {
                try {
                    int A0E = BE6.A0E(A90.A08(A0g), CES.A00);
                    if (A0E != A17) {
                        if (A0E == 2) {
                            eba = EBA.A04;
                        } else if (A0E == 3) {
                            eba = EBA.A08;
                        }
                    }
                } catch (AnonymousClass9HX e) {
                    C25913CoX.A00((DOZ) null, "ImageNodeHelper", AnonymousClass001.A1H("Error parsing image scale type: ", A0g, AnonymousClass000.A10()), e);
                }
            }
            eba = EBA.A01;
        }
        bRc.A0H = eba;
        DFL A0O = BE7.A0O(dfl);
        PorterDuffColorFilter porterDuffColorFilter = null;
        if (!(A0O == null || (A01 = C25340Cdz.A01(doz, A0O, 0)) == 0)) {
            porterDuffColorFilter = new PorterDuffColorFilter(A01, PorterDuff.Mode.SRC_ATOP);
        }
        bRc.A06 = porterDuffColorFilter;
        bRc.A0Q = A17;
        bRc.A0T = false;
        bRc.A0Y = A0I;
        bRc.A0X = A0I;
        bRc.A0W = dfl.A0I(69, false);
        DFL A092 = dfl.A09(46);
        if (A092 == null || !A092.A0I(41, false)) {
            byE = C24256ByE.DEFAULT;
        } else {
            byE = C24256ByE.SMALL;
        }
        bRc.A01 = byE;
        bRc.A09 = pointF;
        DFL A093 = dfl.A09(65);
        if (A093 != null) {
            bRc.A0P = Integer.valueOf(C25340Cdz.A01(doz, A093, 0));
            bRc.A03 = 0;
            bRc.A0C = null;
        }
        if (C18070vi.A18(dfl.A0D(67), "fade")) {
            bRc.A01 = 100;
        }
        if (dfl.A0I(76, false)) {
            bRc.A0L = C25786Clx.A03;
        }
        if (dfl.A0I(48, false) && (A00 = C24261Jm.A00(context, 2131233012)) != null) {
            bRc.A0D = new BFH(A00);
        }
        return new C22825BRd(bRc);
    }

    public static final Uri A00(DOZ doz, DFL dfl) {
        String str;
        boolean A15 = C18070vi.A15(doz, dfl);
        String A0D = dfl.A0D(36);
        String A0D2 = dfl.A0D(41);
        if (A0D == null || !doz.A03) {
            A0D = A0D2;
        }
        String str2 = null;
        if (A0D == null) {
            return null;
        }
        try {
            C20030A3z a3z = C20030A3z.A01;
            Uri A01 = C26215Cuu.A01(A0D);
            C18070vi.A0X(A01);
            return AnonymousClass9OR.A00(A01, A15);
        } catch (SecurityException e) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Parse uri \"");
            A10.append(A0D);
            C25913CoX.A00(doz, "UriParser", AnonymousClass000.A0y("\" failed.", A10), e);
            return null;
        } catch (Exception e2) {
            try {
                Object A00 = DFL.A00(dfl, 36);
                Object A002 = DFL.A00(dfl, 41);
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("Error getting urls - darkUrl: ");
                if (A00 != null) {
                    str = A00.toString();
                } else {
                    str = null;
                }
                A102.append(str);
                A102.append(", url: ");
                if (A002 != null) {
                    str2 = A002.toString();
                }
                C25913CoX.A00(doz, "ImageNodeHelper", AnonymousClass000.A0y(str2, A102), e2);
            } catch (Exception unused) {
            }
            throw e2;
        }
    }
}
