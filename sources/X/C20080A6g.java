package X;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.A6g  reason: case insensitive filesystem */
public final class C20080A6g {
    public HashSet A00;
    public final AnonymousClass118 A01;
    public final C18030ve A02;
    public final AnonymousClass1QD A03;
    public final Set A04;
    public final AnonymousClass190 A05;
    public final AnonymousClass1KI A06;

    public int A03(String str, String str2, List list, boolean z, boolean z2) {
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < list.size(); i3++) {
            C20284AEs A0Q = AnonymousClass8BR.A0Q(list, i3);
            C170278pb r0 = A0Q.A08;
            C17960vV.A07(r0);
            boolean A09 = A09(A0Q, str2, z2, z);
            if (C20063A5m.A03(((AnonymousClass8pS) r0).A0A) && !A09) {
                i = i3;
            } else if (A0Q.A01 == 2) {
                i2 = i3;
            }
        }
        if (i == -1 && i2 == -1) {
            this.A05.A0G("india-upi-invalid-default-method-index", (String) null, false);
            i2 = 0;
        }
        if (str.equals("p2m")) {
            if (i == -1) {
                return i2;
            }
            return i;
        } else if (!str.equals("p2p") || i2 == -1) {
            return 0;
        } else {
            return i2;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r0 = (X.AnonymousClass8pS) r5.A08;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A08(X.AnonymousClass8pN r5) {
        /*
            r4 = this;
            r3 = 0
            if (r5 == 0) goto L_0x001a
            X.0ve r2 = r4.A02
            r1 = 5724(0x165c, float:8.021E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x001a
            X.8pb r0 = r5.A08
            X.8pS r0 = (X.AnonymousClass8pS) r0
            if (r0 == 0) goto L_0x001a
            boolean r0 = r0.A0H
            if (r0 == 0) goto L_0x001a
            r3 = 1
        L_0x001a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20080A6g.A08(X.8pN):boolean");
    }

    public boolean A0B(List list) {
        String str;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                AnonymousClass8pS r0 = (AnonymousClass8pS) AnonymousClass8BR.A0P(it).A08;
                if (r0 != null && ((str = r0.A0A) == null || this.A04.contains(str))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String A01(C20284AEs aEs) {
        Object obj = aEs.A09.A00;
        C17960vV.A07(obj);
        String str = (String) obj;
        if (C20063A5m.A02(aEs)) {
            return str.replaceAll("X{8}", "••");
        }
        return A8e.A04(str);
    }

    public static boolean A02(C20284AEs aEs, String str) {
        C170278pb r4 = aEs.A08;
        if (!(r4 instanceof AnonymousClass8pS)) {
            return false;
        }
        boolean equals = "p2m".equals(str);
        if ((!"OD_UNSECURED".equals(((AnonymousClass8pS) r4).A0A)) || equals) {
            return false;
        }
        return true;
    }

    public AnonymousClass1KN A04(String str, String str2, String str3) {
        BigDecimal bigDecimal;
        AnonymousClass1KJ A012 = this.A06.A01("INR");
        if (!TextUtils.isEmpty(str)) {
            bigDecimal = new BigDecimal(str);
        } else if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return ((AnonymousClass1KL) A012).A00;
        } else {
            bigDecimal = new BigDecimal(str3);
        }
        return AnonymousClass8BU.A0H(A012, bigDecimal);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a3, code lost:
        r0 = r3.equals(r0);
        r3 = 2131897420;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c8, code lost:
        if (r0 != false) goto L_0x0016;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00cc A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A06(X.C20284AEs r7, java.util.List r8, boolean r9) {
        /*
            r6 = this;
            X.8pb r2 = r7.A08
            X.8pS r2 = (X.AnonymousClass8pS) r2
            if (r2 == 0) goto L_0x00cd
            X.118 r1 = r6.A01
            java.lang.String r3 = r2.A0A
            if (r3 == 0) goto L_0x0013
            int r0 = r3.hashCode()
            switch(r0) {
                case -1704036199: goto L_0x0080;
                case -240997565: goto L_0x008a;
                case 77569: goto L_0x008d;
                case 77579: goto L_0x0097;
                case 358786314: goto L_0x00a1;
                case 1844922713: goto L_0x00ab;
                case 1878996346: goto L_0x00b5;
                case 1996005113: goto L_0x00bf;
                default: goto L_0x0013;
            }
        L_0x0013:
            r3 = 2131888265(0x7f120889, float:1.941116E38)
        L_0x0016:
            java.lang.String r5 = r1.A01(r3)
            X.77e r0 = r2.A04
            if (r0 == 0) goto L_0x007c
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            java.lang.Object r0 = r0.A00
            boolean r0 = r3.equals(r0)
            if (r0 != 0) goto L_0x007c
            if (r9 == 0) goto L_0x0042
            r0 = 2131893672(0x7f121da8, float:1.9422127E38)
        L_0x002d:
            java.lang.String r2 = r1.A01(r0)
        L_0x0031:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x00cc
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r5)
            java.lang.String r0 = " • "
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r2, r1)
            return r0
        L_0x0042:
            boolean r0 = r2.A0G
            if (r0 == 0) goto L_0x004a
            r0 = 2131897449(0x7f122c69, float:1.9429788E38)
            goto L_0x002d
        L_0x004a:
            if (r8 == 0) goto L_0x006f
            java.util.Iterator r4 = r8.iterator()
        L_0x0050:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x006f
            X.AEs r0 = X.AnonymousClass8BR.A0P(r4)
            X.8pb r3 = r0.A08
            X.8pS r3 = (X.AnonymousClass8pS) r3
            if (r3 == 0) goto L_0x0050
            boolean r0 = r3.A0G
            if (r0 == 0) goto L_0x0050
            java.lang.String r0 = r3.A0A
            boolean r0 = X.C20063A5m.A03(r0)
            if (r0 == 0) goto L_0x0050
        L_0x006c:
            java.lang.String r2 = ""
            goto L_0x0031
        L_0x006f:
            boolean r0 = r2.A08
            if (r0 != 0) goto L_0x0078
            int r2 = r7.A01
            r0 = 2
            if (r2 != r0) goto L_0x006c
        L_0x0078:
            r0 = 2131893842(0x7f121e52, float:1.9422472E38)
            goto L_0x002d
        L_0x007c:
            r0 = 2131896068(0x7f122704, float:1.9426987E38)
            goto L_0x002d
        L_0x0080:
            java.lang.String r0 = "SAVINGS"
            boolean r0 = r3.equals(r0)
            r3 = 2131897421(0x7f122c4d, float:1.9429731E38)
            goto L_0x00c8
        L_0x008a:
            java.lang.String r0 = "OD_SECURED"
            goto L_0x00a3
        L_0x008d:
            java.lang.String r0 = "NRE"
            boolean r0 = r3.equals(r0)
            r3 = 2131897397(0x7f122c35, float:1.9429682E38)
            goto L_0x00c8
        L_0x0097:
            java.lang.String r0 = "NRO"
            boolean r0 = r3.equals(r0)
            r3 = 2131897398(0x7f122c36, float:1.9429684E38)
            goto L_0x00c8
        L_0x00a1:
            java.lang.String r0 = "OD_UNSECURED"
        L_0x00a3:
            boolean r0 = r3.equals(r0)
            r3 = 2131897420(0x7f122c4c, float:1.942973E38)
            goto L_0x00c8
        L_0x00ab:
            java.lang.String r0 = "CURRENT"
            boolean r0 = r3.equals(r0)
            r3 = 2131897419(0x7f122c4b, float:1.9429727E38)
            goto L_0x00c8
        L_0x00b5:
            java.lang.String r0 = "CREDIT_LINE"
            boolean r0 = r3.equals(r0)
            r3 = 2131897396(0x7f122c34, float:1.942968E38)
            goto L_0x00c8
        L_0x00bf:
            java.lang.String r0 = "CREDIT"
            boolean r0 = r3.equals(r0)
            r3 = 2131888261(0x7f120885, float:1.9411152E38)
        L_0x00c8:
            if (r0 != 0) goto L_0x0016
            goto L_0x0013
        L_0x00cc:
            return r5
        L_0x00cd:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20080A6g.A06(X.AEs, java.util.List, boolean):java.lang.String");
    }

    public String A07(String str) {
        String str2 = "CREDIT";
        if (!str2.equals(str)) {
            str2 = "CREDIT_LINE";
            if (!str2.equals(str)) {
                if (C18020vd.A05(C18040vf.A02, this.A02, 10971)) {
                    return "SAVINGS";
                }
                return null;
            }
        }
        return str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0087 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A09(X.C20284AEs r5, java.lang.String r6, boolean r7, boolean r8) {
        /*
            r4 = this;
            X.8pb r1 = r5.A08
            boolean r0 = r1 instanceof X.AnonymousClass8pS
            if (r0 == 0) goto L_0x009e
            X.8pS r1 = (X.AnonymousClass8pS) r1
            java.lang.String r0 = r1.A0A
            boolean r0 = X.C20063A5m.A03(r0)
            if (r0 == 0) goto L_0x009e
            java.lang.String r3 = r1.A0A
            X.0ve r2 = r4.A02
            r0 = 4638(0x121e, float:6.499E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x0026
            java.lang.String r0 = "CREDIT"
            boolean r0 = r0.equals(r3)
            if (r0 != 0) goto L_0x0036
        L_0x0026:
            r0 = 7974(0x1f26, float:1.1174E-41)
            boolean r0 = X.C18020vd.A05(r1, r2, r0)
            if (r0 == 0) goto L_0x009b
            java.lang.String r0 = "CREDIT_LINE"
            boolean r0 = r0.equals(r3)
            if (r0 == 0) goto L_0x009b
        L_0x0036:
            java.util.HashSet r0 = r4.A00
            if (r0 != 0) goto L_0x0066
            r0 = 5210(0x145a, float:7.301E-42)
            java.lang.String r0 = r2.A0I(r0)
            if (r0 != 0) goto L_0x0096
            r0 = 5
            java.lang.String[] r2 = new java.lang.String[r0]
            r1 = 0
            java.lang.String r0 = "7409"
            r2[r1] = r0
            r1 = 1
            java.lang.String r0 = "7408"
            r2[r1] = r0
            r1 = 2
            java.lang.String r0 = "6211"
            r2[r1] = r0
            r1 = 3
            java.lang.String r0 = "6012"
            r2[r1] = r0
            r1 = 4
            java.lang.String r0 = "7407"
            java.util.List r0 = X.AnonymousClass8BR.A15(r0, r2, r1)
        L_0x0060:
            java.util.HashSet r0 = X.AnonymousClass8BR.A12(r0)
            r4.A00 = r0
        L_0x0066:
            boolean r0 = r0.contains(r6)
            if (r0 == 0) goto L_0x0089
            java.lang.Integer r1 = X.AnonymousClass00R.A01
        L_0x006e:
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0087
            java.lang.Integer r0 = X.AnonymousClass00R.A0C
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0087
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            boolean r1 = r1.equals(r0)
            r0 = 0
            if (r1 == 0) goto L_0x0088
        L_0x0087:
            r0 = 1
        L_0x0088:
            return r0
        L_0x0089:
            if (r8 != 0) goto L_0x0091
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L_0x0093
        L_0x0091:
            if (r7 == 0) goto L_0x009e
        L_0x0093:
            java.lang.Integer r1 = X.AnonymousClass00R.A0C
            goto L_0x006e
        L_0x0096:
            java.util.List r0 = X.AnonymousClass8BW.A0t(r0)
            goto L_0x0060
        L_0x009b:
            java.lang.Integer r1 = X.AnonymousClass00R.A0N
            goto L_0x006e
        L_0x009e:
            java.lang.Integer r1 = X.AnonymousClass00R.A0Y
            goto L_0x006e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20080A6g.A09(X.AEs, java.lang.String, boolean, boolean):boolean");
    }

    public boolean A0A(String str) {
        C18030ve r3 = this.A02;
        String A0I = r3.A0I(7843);
        C18040vf r2 = C18040vf.A02;
        if (C18020vd.A05(r2, r3, 4638) && (str == null || A0I.contains(str))) {
            return true;
        }
        String A0I2 = r3.A0I(7975);
        if (!C18020vd.A05(r2, r3, 7974)) {
            return false;
        }
        if (str == null || A0I2.contains(str)) {
            return true;
        }
        return false;
    }

    public C20080A6g(AnonymousClass190 r4, AnonymousClass118 r5, AnonymousClass1KI r6, C18030ve r7, AnonymousClass1QD r8) {
        String[] strArr = new String[4];
        strArr[0] = "CURRENT";
        strArr[1] = "SAVINGS";
        strArr[2] = "NRE";
        this.A04 = C17900vP.A0I("NRO", strArr, 3);
        this.A02 = r7;
        this.A05 = r4;
        this.A01 = r5;
        this.A03 = r8;
        this.A06 = r6;
    }

    public static View A00(LayoutInflater layoutInflater, ViewGroup viewGroup, C20284AEs aEs, int i, boolean z) {
        if (C20063A5m.A02(aEs)) {
            return layoutInflater.inflate(2131626761, viewGroup, z);
        }
        View inflate = layoutInflater.inflate(2131625680, viewGroup, z);
        if (i == 0) {
            return inflate;
        }
        AnonymousClass3MW.A0G(inflate, 2131434229).setImageResource(i);
        return inflate;
    }

    public String A05(C20284AEs aEs) {
        String str;
        String A012 = A01(aEs);
        String str2 = aEs.A0B;
        if (str2 == null) {
            str2 = "";
        }
        boolean A022 = C20063A5m.A02(aEs);
        Object[] A1b = AnonymousClass3MX.A1b(str2, 0);
        A1b[1] = A012;
        if (A022) {
            str = "%s %s";
        } else {
            str = "%s ••%s";
        }
        return String.format(str, A1b);
    }
}
