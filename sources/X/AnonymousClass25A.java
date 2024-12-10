package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.facebook.common.dextricks.StringTreeSet;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.25A  reason: invalid class name */
public abstract class AnonymousClass25A {
    public static AnonymousClass205 A09(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        AnonymousClass1BI A02 = AnonymousClass1BI.A00.A02(bundle.getString("message_key_jid"));
        boolean z = bundle.getBoolean("message_key_from_me");
        String string = bundle.getString("message_key_id");
        if (A02 == null || string == null) {
            return null;
        }
        return new AnonymousClass205(A02, string, z);
    }

    public static String A0B(int i) {
        if (i != 0) {
            if (i == 7) {
                return "system";
            }
            if (i == 1 || i == 25 || i == 42) {
                return "image";
            }
            if (i == 82) {
                return "ptt";
            }
            if (i == 2) {
                return "audio";
            }
            if (i == 3 || i == 28 || i == 43) {
                return "video";
            }
            if (i != 13) {
                if (i == 4) {
                    return "vcard";
                }
                if (i != 5) {
                    if (i == 16) {
                        return "livelocation";
                    }
                    if (i != 9) {
                        if (i == 20) {
                            return "sticker";
                        }
                        if (i == 105) {
                            return "sticker_pack";
                        }
                        if (i == 23) {
                            return "product";
                        }
                        if (i == 37) {
                            return "catalog";
                        }
                        if (i == 24) {
                            return "invite";
                        }
                        if (i != 26) {
                            if (i != 29) {
                                if (i != 30) {
                                    if (i == 45) {
                                        return "list";
                                    }
                                    if (i == 46) {
                                        return "list_response";
                                    }
                                    if (i == 52) {
                                        return "product_list";
                                    }
                                    if (i == 81) {
                                        return "ptv";
                                    }
                                    if (i == 99) {
                                        return "collection";
                                    }
                                }
                            }
                        }
                    }
                    return "document";
                }
                return "location";
            }
            return "gif";
        }
        return null;
    }

    public static boolean A0F(int i) {
        return i == 12 || i == 127 || i == 79 || i == 20 || i == 126 || i == 123 || i == 90 || i == 93 || i == 106 || i == 124 || i == 144 || i == 149;
    }

    public static boolean A0G(int i) {
        return i == 1 || i == 25 || i == 57 || i == 42;
    }

    public static boolean A0H(int i) {
        return i == 1 || i == 23 || i == 37 || i == 2 || i == 3 || i == 81 || i == 13 || i == 9 || i == 20 || i == 25 || i == 26 || i == 28 || i == 29 || i == 57 || i == 62 || i == 63 || i == 105;
    }

    public static boolean A0I(int i) {
        return i == 42 || i == 43;
    }

    public static boolean A0K(int i) {
        return i == 1 || i == 3 || i == 81 || i == 13 || i == 9 || i == 5 || i == 16 || i == 23 || i == 37 || i == 24 || i == 44 || i == 20 || i == 25 || i == 26 || i == 28 || i == 29 || i == 30 || i == 42 || i == 43 || i == 45 || i == 52 || i == 54 || i == 55 || i == 57 || i == 62 || i == 63 || i == 85 || i == 97 || i == 94 || i == 105;
    }

    public static long A01(C18030ve r3, AnonymousClass206 r4) {
        if (!(r4 instanceof AnonymousClass22A) || r4.A0C() != 0) {
            return 86400000;
        }
        long A00 = ((long) C18020vd.A00(C18040vf.A02, r3, 4042)) * 1000;
        if (A00 < 300000) {
            return 300000;
        }
        return A00;
    }

    public static long A02(AnonymousClass206 r5) {
        if (r5 == null || r5.A0x == 0) {
            return 1;
        }
        return r5.A0x;
    }

    public static long A03(AnonymousClass206 r5) {
        if (r5 == null || r5.A0x == 0) {
            return Long.MIN_VALUE;
        }
        return r5.A0y;
    }

    public static Bundle A04(AnonymousClass205 r3) {
        if (r3 == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("message_key_jid", C22971Dz.A06(r3.A00));
        bundle.putBoolean("message_key_from_me", r3.A02);
        bundle.putString("message_key_id", r3.A01);
        return bundle;
    }

    public static AnonymousClass1E7 A05(C25181Nf r2, AnonymousClass206 r3) {
        AnonymousClass1BI r1 = r3.A0v.A00;
        if (C22971Dz.A0e(r1) || C22971Dz.A0a(r1)) {
            r1 = r3.A0H();
        }
        if (r1 != null) {
            return r2.A01(r1);
        }
        return null;
    }

    public static AnonymousClass1EC A07(AnonymousClass206 r1) {
        if (!(r1 instanceof AnonymousClass23W)) {
            return null;
        }
        AnonymousClass1BI r12 = r1.A0v.A00;
        Parcelable.Creator creator = AnonymousClass1EC.CREATOR;
        return C42941yz.A00(r12);
    }

    public static UserJid A08(AnonymousClass11S r1, AnonymousClass206 r2) {
        if (!r2.A0v.A02) {
            return r2.A0I();
        }
        r1.A0I();
        return r1.A0E;
    }

    public static String A0C(C18000vb r3, long j) {
        if (j <= 0) {
            return "";
        }
        return C88584aA.A02(r3, j);
    }

    public static String A0D(AnonymousClass206 r3) {
        StringBuilder sb = new StringBuilder();
        sb.append("fmsg/status:");
        sb.append(r3.A0D());
        sb.append("/type:");
        sb.append(r3.A0u);
        AnonymousClass205 r1 = r3.A0v;
        if (C22971Dz.A0e(r1.A00) && (r3 instanceof C436420i)) {
            sb.append("/grp_action:");
            sb.append(((C436420i) r3).A00);
        }
        sb.append("/rmt-src:");
        sb.append(r3.A0H());
        sb.append(" ");
        sb.append(r1.toString());
        return sb.toString();
    }

    public static boolean A0M(AnonymousClass11S r2, AnonymousClass206 r3) {
        AnonymousClass205 r1 = r3.A0v;
        if (r1.A02 || A0p(r3) || !C22971Dz.A0e(r1.A00)) {
            return false;
        }
        List list = r3.A0h;
        if (list != null && AnonymousClass4aJ.A05(r2, list)) {
            return true;
        }
        AnonymousClass206 A0K = r3.A0K();
        if (A0K == null || !A0K.A0v.A02) {
            return false;
        }
        return true;
    }

    public static boolean A0N(AnonymousClass11S r2, AnonymousClass206 r3) {
        boolean A0O;
        int i = r3.A0u;
        if (i == 15) {
            A0O = r3.A0v.A02;
        } else if (i == 64) {
            A0O = r2.A0O(((AnonymousClass23O) r3).A00);
        } else if (i != 83 || r2.A0O(r3.A0K)) {
            return false;
        } else {
            return true;
        }
        if (!A0O || r3.A19) {
            return true;
        }
        return false;
    }

    public static boolean A0O(AnonymousClass11S r2, AnonymousClass206 r3) {
        if (!(r3 instanceof C436420i)) {
            return false;
        }
        int i = ((C436420i) r3).A00;
        if (A0F(i) || i == 52) {
            List list = ((C48392Mh) r3).A01;
            r2.A0I();
            PhoneUserJid phoneUserJid = r2.A0E;
            C17960vV.A07(phoneUserJid);
            return list.contains(phoneUserJid);
        } else if (i == 4) {
            return r2.A0O(r3.A0H());
        } else {
            return false;
        }
    }

    public static boolean A0P(AnonymousClass11S r2, AnonymousClass206 r3) {
        if (r3.A01 != 8) {
            return r3.A0v.A02;
        }
        AnonymousClass1BI A0H = r3.A0H();
        if (A0H == null || r2.A0O(A0H)) {
            return true;
        }
        return false;
    }

    public static boolean A0Q(AnonymousClass11S r3, AnonymousClass206 r4) {
        if (r4.A0v.A02) {
            if (!(r4 instanceof C436420i)) {
                return true;
            }
            int i = ((C436420i) r4).A00;
            if (!(i == 4 || i == 5 || i == 6 || i == 11 || i == 12 || i == 137 || i == 138)) {
                if (i != 143) {
                    if (!(i == 144 || i == 167 || i == 168)) {
                        switch (i) {
                            case 1:
                            case 14:
                            case 17:
                            case 27:
                            case 90:
                            case 99:
                            case 106:
                            case 118:
                            case 131:
                            case 173:
                            case 177:
                                break;
                            case 20:
                            case 79:
                            case 101:
                                break;
                            default:
                                switch (i) {
                                    case 123:
                                    case 125:
                                    case 126:
                                        break;
                                    case 124:
                                    case StringTreeSet.OFFSET_BASE_ENCODING /*127*/:
                                        break;
                                    default:
                                        switch (i) {
                                            case 149:
                                            case 150:
                                            case 151:
                                            case 152:
                                                break;
                                        }
                                }
                        }
                    }
                }
                List list = ((C48392Mh) r4).A01;
                r3.A0I();
                PhoneUserJid phoneUserJid = r3.A0E;
                C17960vV.A07(phoneUserJid);
                return list.contains(phoneUserJid);
            }
            return r3.A0O(r4.A0H());
        }
        return false;
    }

    public static boolean A0R(AnonymousClass11S r2, AnonymousClass206 r3) {
        if (r3.A0v.A02 || r3.A0u != 64 || !r2.A0O(((AnonymousClass23O) r3).A00) || r3.A19) {
            return false;
        }
        return true;
    }

    public static boolean A0T(AnonymousClass11S r3, AnonymousClass206 r4) {
        AnonymousClass205 r2 = r4.A0v;
        if (!r2.A02 || r4.A0D() == 6 || !r3.A0O(r2.A00)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (((java.util.AbstractCollection) r5.A02.getValue()).contains(r1) != false) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0X(X.C26061Qr r5, X.AnonymousClass206 r6, boolean r7) {
        /*
            java.lang.Integer r1 = r6.A0S
            if (r1 == 0) goto L_0x0013
            X.0vl r0 = r5.A02
            java.lang.Object r0 = r0.getValue()
            java.util.AbstractCollection r0 = (java.util.AbstractCollection) r0
            boolean r0 = r0.contains(r1)
            r2 = 0
            if (r0 == 0) goto L_0x0014
        L_0x0013:
            r2 = 1
        L_0x0014:
            boolean r0 = A0c(r6)
            if (r0 == 0) goto L_0x001c
            if (r7 == 0) goto L_0x006d
        L_0x001c:
            int r1 = r6.A0u
            r0 = 24
            if (r1 != r0) goto L_0x00fe
            X.205 r0 = r6.A0v
            boolean r0 = r0.A02
            if (r0 == 0) goto L_0x002a
            if (r7 == 0) goto L_0x006d
        L_0x002a:
            if (r2 == 0) goto L_0x006d
            boolean r0 = A0f(r6)
            if (r0 != 0) goto L_0x006d
            boolean r0 = A0n(r6)
            if (r0 != 0) goto L_0x006d
            boolean r0 = A0h(r6)
            if (r0 != 0) goto L_0x006d
            boolean r0 = A0i(r6)
            if (r0 != 0) goto L_0x006d
            X.205 r2 = r6.A0v
            boolean r5 = r2.A02
            if (r5 == 0) goto L_0x006f
            boolean r0 = A0r(r6)
            if (r0 == 0) goto L_0x006f
            r0 = r6
            X.20i r0 = (X.C436420i) r0
            int r1 = r0.A00
            r0 = 50
            if (r1 == r0) goto L_0x006d
            r0 = 49
            if (r1 == r0) goto L_0x006d
            r0 = 47
            if (r1 == r0) goto L_0x006d
            r0 = 48
            if (r1 == r0) goto L_0x006d
            r0 = 46
            if (r1 == r0) goto L_0x006d
            r0 = 55
            if (r1 != r0) goto L_0x006f
        L_0x006d:
            r0 = 0
            return r0
        L_0x006f:
            boolean r0 = A0u(r6)
            if (r0 != 0) goto L_0x006d
            boolean r0 = A0g(r6)
            if (r0 == 0) goto L_0x008c
            if (r7 == 0) goto L_0x006d
            X.1BI r1 = r2.A00
            if (r1 == 0) goto L_0x006d
            r0 = r6
            X.2MN r0 = (X.AnonymousClass2MN) r0
            com.whatsapp.jid.UserJid r0 = r0.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x006d
        L_0x008c:
            boolean r0 = r6 instanceof X.AnonymousClass2MI
            if (r0 != 0) goto L_0x006d
            boolean r0 = r6 instanceof X.AnonymousClass97d
            if (r0 != 0) goto L_0x006d
            boolean r0 = r6 instanceof X.C1771297j
            if (r0 != 0) goto L_0x006d
            boolean r0 = A0d(r6)
            if (r0 != 0) goto L_0x006d
            boolean r0 = r6 instanceof X.C1771197i
            if (r0 != 0) goto L_0x006d
            boolean r0 = r6 instanceof X.AnonymousClass988
            if (r0 != 0) goto L_0x006d
            boolean r0 = r6 instanceof X.C436420i
            if (r0 == 0) goto L_0x00bd
            r0 = r6
            X.20i r0 = (X.C436420i) r0
            int r0 = r0.A00
            long r3 = (long) r0
            r1 = 62
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x006d
            r1 = 63
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x00bd
            goto L_0x006d
        L_0x00bd:
            boolean r0 = X.C83574Fq.A00(r6)
            if (r0 != 0) goto L_0x006d
            X.36i r0 = X.AnonymousClass2UX.A00(r6)
            if (r0 == 0) goto L_0x00d2
            X.36i r0 = X.AnonymousClass2UX.A00(r6)
            X.9Ij r0 = r0.A00
            if (r0 == 0) goto L_0x00d2
            goto L_0x006d
        L_0x00d2:
            boolean r0 = r6 instanceof X.C1770797c
            if (r0 != 0) goto L_0x006d
            boolean r0 = A0b(r6)
            if (r0 != 0) goto L_0x006d
            boolean r0 = A0s(r6)
            if (r0 != 0) goto L_0x006d
            boolean r0 = A0o(r6)
            if (r0 != 0) goto L_0x006d
            if (r5 == 0) goto L_0x0104
            boolean r0 = A0r(r6)
            if (r0 == 0) goto L_0x0104
            boolean r0 = r6 instanceof X.AnonymousClass97W
            if (r0 == 0) goto L_0x0104
            X.20i r6 = (X.C436420i) r6
            int r1 = r6.A00
            r0 = 180(0xb4, float:2.52E-43)
            if (r1 != r0) goto L_0x0104
            goto L_0x006d
        L_0x00fe:
            r0 = 8
            if (r1 == r0) goto L_0x006d
            goto L_0x002a
        L_0x0104:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass25A.A0X(X.1Qr, X.206, boolean):boolean");
    }

    public static boolean A0Z(AnonymousClass206 r3) {
        int i = r3.A0u;
        if ((i == 2 && (r3.A09 == 1 || r3.A0w() || AnonymousClass9RY.A00(r3) != null)) || A0I(i) || i == 82 || i == 78 || i == 81) {
            return true;
        }
        return false;
    }

    public static boolean A0b(AnonymousClass206 r1) {
        if (!r1.A0v.A02 || !A0r(r1)) {
            return false;
        }
        int i = ((C436420i) r1).A00;
        if (i == 147 || i == 155) {
            return true;
        }
        return false;
    }

    public static boolean A0c(AnonymousClass206 r1) {
        if (r1.A0l) {
            AnonymousClass205 r12 = r1.A0v;
            if (!r12.A02 || C22971Dz.A0N(r12.A00)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean A0d(AnonymousClass206 r6) {
        if (!(r6 instanceof C436420i)) {
            return false;
        }
        long j = (long) ((C436420i) r6).A00;
        if (j == 61 || j == 69) {
            return true;
        }
        return false;
    }

    public static boolean A0e(AnonymousClass206 r4) {
        C20285AEt BPK;
        C20277AEk aEk;
        C20285AEt BPK2;
        boolean z = false;
        if ((r4 instanceof AnonymousClass21K) && (BPK2 = ((AnonymousClass21K) r4).BPK()) != null && BPK2.A06 != null && BPK2.A00 == 5) {
            z = true;
        }
        if (!(!z || (BPK = ((AnonymousClass21K) r4).BPK()) == null || (aEk = BPK.A06) == null)) {
            for (C20253ADl aDl : aEk.A03) {
                if ("call_permission_request".equals(aDl.A01.A02)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean A0f(AnonymousClass206 r2) {
        if (!r2.A0v.A02 || !A0r(r2) || ((C436420i) r2).A00 != 67) {
            return false;
        }
        return true;
    }

    public static boolean A0g(AnonymousClass206 r1) {
        if (!r1.A0v.A02 || !A0r(r1)) {
            return false;
        }
        int i = ((C436420i) r1).A00;
        if (i == 28 || i == 10) {
            return true;
        }
        return false;
    }

    public static boolean A0h(AnonymousClass206 r2) {
        if (!r2.A0v.A02 || !A0r(r2) || ((C436420i) r2).A00 != 57) {
            return false;
        }
        return true;
    }

    public static boolean A0i(AnonymousClass206 r2) {
        if (!r2.A0v.A02 || !A0r(r2) || ((C436420i) r2).A00 != 71) {
            return false;
        }
        return true;
    }

    public static boolean A0j(AnonymousClass206 r2) {
        if (((r2 instanceof AnonymousClass210) || (r2 instanceof AnonymousClass21V) || r2.A0u == 92) && r2.A11(131072)) {
            return true;
        }
        return false;
    }

    public static boolean A0k(AnonymousClass206 r2) {
        if (r2.A0u == 36) {
            return true;
        }
        if (!r2.A0v.A02 || !A0r(r2) || !(r2 instanceof C436420i) || ((C436420i) r2).A00 != 59) {
            return false;
        }
        return true;
    }

    public static boolean A0l(AnonymousClass206 r4) {
        C20285AEt BPK;
        C20277AEk aEk;
        int i;
        if ((r4 instanceof AnonymousClass21K) && (BPK = ((AnonymousClass21K) r4).BPK()) != null && (aEk = BPK.A06) != null && ((i = BPK.A00) == 5 || i == 9)) {
            for (C20253ADl aDl : aEk.A03) {
                if ("galaxy_message".equals(aDl.A01.A02)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean A0m(AnonymousClass206 r2) {
        if (r2.A06 >= 127) {
            return true;
        }
        return false;
    }

    public static boolean A0n(AnonymousClass206 r2) {
        if (!r2.A0v.A02 || !A0r(r2) || ((C436420i) r2).A00 != 18) {
            return false;
        }
        return true;
    }

    public static boolean A0o(AnonymousClass206 r2) {
        if (!r2.A0v.A02 || !A0r(r2)) {
            return false;
        }
        if ((r2 instanceof AnonymousClass97Z) && ((C436420i) r2).A00 == 178) {
            return true;
        }
        if (!(r2 instanceof AnonymousClass97Y) || ((C436420i) r2).A00 != 179) {
            return false;
        }
        return true;
    }

    public static boolean A0p(AnonymousClass206 r2) {
        int i = r2.A0u;
        if (i == 15 || i == 64 || i == 83) {
            return true;
        }
        return false;
    }

    public static boolean A0q(AnonymousClass206 r3) {
        if (!(r3 instanceof C48392Mh) || ((C436420i) r3).A00 != 145) {
            return false;
        }
        return true;
    }

    public static boolean A0r(AnonymousClass206 r3) {
        int i = r3.A0u;
        int A0D = r3.A0D();
        Integer valueOf = Integer.valueOf(A0D);
        if (i == 0) {
            if (valueOf == null || A0D != 6) {
                return false;
            }
            return true;
        } else if (i == 7) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean A0s(AnonymousClass206 r2) {
        if (!r2.A0v.A02 || !A0r(r2) || !(r2 instanceof AnonymousClass97X) || ((C436420i) r2).A00 != 176) {
            return false;
        }
        return true;
    }

    public static boolean A0t(AnonymousClass206 r1) {
        if (!(r1 instanceof AnonymousClass210)) {
            return false;
        }
        AnonymousClass210 r12 = (AnonymousClass210) r1;
        String str = r12.A06;
        String str2 = r12.A05;
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(str2)) {
            return true;
        }
        return false;
    }

    public static boolean A0u(AnonymousClass206 r6) {
        if (!(r6 instanceof C436420i)) {
            return false;
        }
        long j = (long) ((C436420i) r6).A00;
        if (j == 22 || j == 34 || j == 35 || j == 36 || j == 23 || j == 24 || j == 25 || j == 26 || j == 46 || j == 47 || j == 48 || j == 49 || j == 50 || j == 55) {
            return true;
        }
        return false;
    }

    public static boolean A0v(AnonymousClass206 r5) {
        AnonymousClass205 r2 = r5.A0v;
        AnonymousClass1BI r1 = r2.A00;
        if ((r5 instanceof C436420i) || !r2.A02 || ((!C22971Dz.A0d(r1) && !(r1 instanceof AnonymousClass1E9)) || C22971Dz.A0S(r1) || ((r5.A0G != 0 && !(r5 instanceof AnonymousClass23N)) || r5.A13 != null || r5.A0B != 0))) {
            return false;
        }
        return true;
    }

    public static boolean A0y(AnonymousClass206 r3, long j) {
        if (r3.A05 <= 0) {
            return false;
        }
        Long l = r3.A0U;
        C17960vV.A07(l);
        if (l.longValue() >= j || r3.A0C() == 1) {
            return false;
        }
        return true;
    }

    public static boolean A10(AnonymousClass21V r3) {
        int i = r3.A0u;
        if (i == 2) {
            if (r3.A09 == 1) {
                return true;
            }
        } else if (i == 20) {
            return true;
        }
        if (A0I(i) || i == 82) {
            return true;
        }
        return false;
    }

    public static boolean A11(AnonymousClass21V r1) {
        C62572rc r12 = r1.A02;
        C17960vV.A07(r12);
        if (!r12.A0f || r12.A0d) {
            return false;
        }
        return true;
    }

    public static int A00(AnonymousClass21V r1) {
        if (A11(r1)) {
            if (AnonymousClass4H3.A00(r1)) {
                return 1;
            }
            return 0;
        } else if (A12(r1)) {
            return 2;
        } else {
            if (AnonymousClass4H3.A00(r1)) {
                return 4;
            }
            return 3;
        }
    }

    public static AnonymousClass1BI A06(Collection collection) {
        Object obj;
        Iterator it = collection.iterator();
        if (it.hasNext()) {
            obj = it.next();
        } else {
            obj = null;
        }
        AnonymousClass206 r0 = (AnonymousClass206) obj;
        if (r0 == null) {
            return null;
        }
        return r0.A0v.A00;
    }

    public static AnonymousClass205 A0A(AnonymousClass206 r2) {
        if (A0j(r2)) {
            C691536c A00 = C60492o7.A00(r2);
            if (A00 != null) {
                return A00.A02;
            }
            C17960vV.A0F(false, "FMessageUtil/getOriginalMessageKeyIfEdited messageEditInfo missing for edited message");
        }
        return r2.A0v;
    }

    public static void A0E(AnonymousClass11S r0, AnonymousClass1CJ r1, AnonymousClass206 r2) {
        C29691ci A0A;
        if (A0M(r0, r2) && (A0A = r1.A0A(r2.A0v.A00)) != null) {
            synchronized (A0A) {
                int i = A0A.A08;
                if (i > 0) {
                    A0A.A08 = i - 1;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("chatInfo/decrementUnseenImportantMessageCount ");
                sb.append(A0A.A0B());
                Log.i(sb.toString());
            }
        }
    }

    public static boolean A0J(int i) {
        if (A0I(i) || i == 82 || i == 78) {
            return true;
        }
        return false;
    }

    public static boolean A0L(AnonymousClass190 r4, AnonymousClass11S r5, AnonymousClass1CJ r6, AnonymousClass1MZ r7, AnonymousClass206 r8) {
        int i;
        if (A0P(r5, r8) || (i = r8.A0u) == 64 || i == 83) {
            AnonymousClass1BI r3 = r8.A0v.A00;
            if (!(r3 instanceof GroupJid) || (r8 instanceof AnonymousClass23Q) || (r8 instanceof AnonymousClass212) || (r8 instanceof C436420i) || (r8 instanceof AnonymousClass23U) || r8.A11(16777216) || !r6.A0R(r3) || r7.A0K((GroupJid) r3)) {
                return true;
            }
            Log.e("SendMessageMethods/only admins can send message to CAGs");
            r4.A0G("SendMessageMethods/prohibited send to CAG", (String) null, false);
        }
        return false;
    }

    public static boolean A0S(AnonymousClass11S r2, AnonymousClass206 r3) {
        if ((A0q(r3) || (!(r3 instanceof AnonymousClass98B) ? (r3 instanceof AnonymousClass98N) : ((C436420i) r3).A00 == 88)) && !r2.A0O(r3.A0H())) {
            return true;
        }
        return false;
    }

    public static boolean A0U(AnonymousClass11P r5, C18030ve r6, AnonymousClass206 r7) {
        if (AnonymousClass11P.A01(r5) - r7.A0I <= ((long) C18020vd.A00(C18040vf.A02, r6, 2983)) * 1000 || r7.A0w() || (r7 instanceof C445823z)) {
            return true;
        }
        return false;
    }

    public static boolean A0V(AnonymousClass1CJ r2, AnonymousClass206 r3) {
        if (r3.A0v()) {
            return true;
        }
        if (r3.A11(16777216) && C60472o5.A00(r3) != null) {
            return true;
        }
        if (!(r3 instanceof AnonymousClass212) && r2.A0R(r3.A0v.A00)) {
            return true;
        }
        if (!r3.A0q() || r3.A06 != 0) {
            return false;
        }
        return true;
    }

    public static boolean A0W(AnonymousClass1CJ r2, AnonymousClass206 r3, AnonymousClass00H r4) {
        if (((C139546z1) r4.get()).A02(r3)) {
            AnonymousClass205 r1 = r3.A0v;
            if (r1.A02 || r2.A0R(r1.A00)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public static boolean A0Y(AnonymousClass1c4 r2, AnonymousClass206 r3) {
        if (!r3.A0w() || !"video".equals(A0B(r3.A0u))) {
            return false;
        }
        if (AnonymousClass1c4.A00(r2, 2) || AnonymousClass1c4.A00(r2, 3)) {
            return true;
        }
        return false;
    }

    public static boolean A0a(AnonymousClass206 r2) {
        int A0D = r2.A0D();
        if (A0D == 7 || A0D == 20 || A0D == 21) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0018 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0x(X.AnonymousClass206 r4) {
        /*
            boolean r0 = A0m(r4)
            r3 = 0
            if (r0 != 0) goto L_0x0019
            X.205 r0 = r4.A0v
            boolean r2 = r0.A02
            r1 = 1
            int r0 = r4.A06
            if (r2 == 0) goto L_0x001a
            int r1 = java.lang.Math.max(r1, r0)
            r0 = 127(0x7f, float:1.78E-43)
            if (r1 != r0) goto L_0x0019
        L_0x0018:
            r3 = 1
        L_0x0019:
            return r3
        L_0x001a:
            int r0 = r0 + 1
            int r1 = java.lang.Math.max(r1, r0)
            r0 = 5
            if (r1 < r0) goto L_0x0019
            goto L_0x0018
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass25A.A0x(X.206):boolean");
    }

    public static boolean A0z(AnonymousClass21V r6) {
        int[] A07;
        C693436v A17 = r6.A17();
        if (A17 == null || !A17.A05() || (A07 = A17.A07()) == null || A07.length < 4) {
            return false;
        }
        long j = (long) (A07[0] + A07[1] + A07[2]);
        C62572rc r0 = r6.A02;
        C17960vV.A07(r0);
        if (r0.A09 >= j) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0015, code lost:
        if (r4.A0v.A02 != false) goto L_0x0017;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A12(X.AnonymousClass21V r4) {
        /*
            boolean r0 = X.C50302Tx.A00(r4)
            r3 = 0
            if (r0 != 0) goto L_0x0031
            X.2rc r2 = r4.A02
            X.C17960vV.A07(r2)
            boolean r0 = r2.A0c
            if (r0 == 0) goto L_0x0017
            X.205 r0 = r4.A0v
            boolean r0 = r0.A02
            r1 = 1
            if (r0 == 0) goto L_0x0018
        L_0x0017:
            r1 = 0
        L_0x0018:
            boolean r0 = r2.A0V
            if (r0 == 0) goto L_0x001e
            if (r1 == 0) goto L_0x0030
        L_0x001e:
            boolean r0 = r4.A0l
            if (r0 == 0) goto L_0x0031
            X.205 r1 = r4.A0v
            boolean r0 = r1.A02
            if (r0 == 0) goto L_0x0031
            X.1BI r0 = r1.A00
            boolean r0 = X.C22971Dz.A0N(r0)
            if (r0 != 0) goto L_0x0031
        L_0x0030:
            r3 = 1
        L_0x0031:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass25A.A12(X.21V):boolean");
    }

    public static boolean A0w(AnonymousClass206 r6) {
        if (1531267200000L <= r6.A0I && r6.A11(1)) {
            if (!C20097A7a.A05(r6)) {
                int i = r6.A0u;
                if (i != 0) {
                    if (!(i == 1 || i == 2 || i == 3 || i == 4 || i == 5 || i == 9 || i == 23 || i == 32 || i == 37 || i == 52 || i == 55 || i == 57 || i == 85 || i == 99 || i == 13 || i == 14 || i == 62 || i == 63 || i == 105 || i == 106)) {
                        switch (i) {
                            case 25:
                            case 26:
                            case 27:
                            case 28:
                            case 29:
                            case 30:
                                break;
                        }
                    }
                } else if (AnonymousClass25B.A00(r6) == null) {
                    return true;
                }
            }
            return true;
        }
        return false;
    }
}
