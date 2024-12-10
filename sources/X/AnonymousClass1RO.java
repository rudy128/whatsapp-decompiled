package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.1RO  reason: invalid class name */
public final class AnonymousClass1RO {
    public static final C18180vt A08 = new C18180vt(1, 1);
    public final AnonymousClass11S A00;
    public final AnonymousClass10I A01;
    public final AnonymousClass190 A02;
    public final AnonymousClass11P A03;
    public final AnonymousClass1MZ A04;
    public final C18030ve A05;
    public final AnonymousClass1RN A06;
    public final C24421Kg A07;

    public void A03(C1409173o r9, Integer num, String str) {
        if (C18020vd.A05(C18040vf.A02, this.A05, 8867)) {
            C1409173o r4 = r9;
            Integer num2 = num;
            String str2 = str;
            if (C22781De.A03()) {
                this.A01.CGF(new C21456AkN(this, r4, num2, str2, 33));
            } else {
                A01(r9, this, num, str);
            }
        }
    }

    public static void A01(C1409173o r1, AnonymousClass1RO r2, Integer num, String str) {
        boolean z;
        Integer num2;
        int i;
        if (num != null) {
            r2.A06.A00(str, num);
            return;
        }
        if (r1 == null || !((i = r1.A01) == 0 || i == 34)) {
            z = false;
        } else {
            z = true;
        }
        AnonymousClass1RN r12 = r2.A06;
        if (z) {
            num2 = AnonymousClass00R.A01;
        } else {
            num2 = AnonymousClass00R.A00;
        }
        r12.A00(str, num2);
    }

    public static boolean A02(String str) {
        if (str == null) {
            return false;
        }
        if (str.contains("express") || str.contains("express-optimistic")) {
            return true;
        }
        return false;
    }

    public boolean A04(AnonymousClass1BI r7) {
        C36321nh r0 = GroupJid.Companion;
        GroupJid A002 = C36321nh.A00(r7);
        if (A002 == null) {
            return false;
        }
        C18030ve r3 = this.A05;
        C18040vf r2 = C18040vf.A01;
        if (C18020vd.A00(r2, r3, 7654) < this.A04.A08.A0B(A002).A06() || !C18020vd.A05(r2, r3, 7568)) {
            return false;
        }
        return true;
    }

    public boolean A05(C26551So r10, boolean z) {
        C58142kD r0;
        String A032;
        C59912n5 A0B = this.A07.A0B();
        if (A0B == null) {
            return false;
        }
        C18030ve r7 = this.A05;
        AnonymousClass11P r6 = this.A03;
        String str = r10.A02;
        List list = A0B.A0C;
        C58142kD A002 = C696437z.A00("fallback", str, (String) null, list, z);
        if ((z || (((A032 = C696437z.A03(r6, r7, (String) null, str, false)) == null || (r0 = C696437z.A00("primary", str, A032, list, false)) == null) && (r0 = C696437z.A00("primary", str, "0", list, false)) == null)) && (r0 = C696437z.A00("primary", str, (String) null, list, z)) == null) {
            r0 = A002;
            if (A002 == null) {
                return false;
            }
        }
        if (r0.A0C) {
            return true;
        }
        return false;
    }

    public AnonymousClass1RO(AnonymousClass190 r1, AnonymousClass11S r2, AnonymousClass11P r3, AnonymousClass1MZ r4, C18030ve r5, AnonymousClass1RN r6, C24421Kg r7, AnonymousClass10I r8) {
        this.A03 = r3;
        this.A02 = r1;
        this.A01 = r8;
        this.A05 = r5;
        this.A00 = r2;
        this.A07 = r7;
        this.A04 = r4;
        this.A06 = r6;
    }

    public static C26551So A00(String str) {
        if (!A02(str)) {
            StringBuilder sb = new StringBuilder();
            sb.append("ExpressPathUtils/getMmsTypeFromExpressPathUrl Receive non express path url in media notify message. url = ");
            sb.append(str);
            Log.e(sb.toString());
        } else if (str.contains("/document/")) {
            return C26551So.A0B;
        } else {
            if (str.contains("/image/")) {
                return C26551So.A0E;
            }
            if (str.contains("/video/")) {
                return C26551So.A0q;
            }
            if (str.contains("/audio/")) {
                return C26551So.A05;
            }
            if (str.contains("/gif/")) {
                return C26551So.A04;
            }
            if (str.contains("/sticker/")) {
                return C26551So.A0j;
            }
        }
        return null;
    }

    public boolean A06(List list) {
        if (list.size() != 1) {
            return false;
        }
        AnonymousClass1BI r1 = ((AnonymousClass206) list.get(0)).A0v.A00;
        if ((!C22971Dz.A0Y(r1) || this.A00.A0O(r1)) && !A04(r1)) {
            return false;
        }
        return true;
    }
}
