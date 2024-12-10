package X;

import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.1Dz  reason: invalid class name and case insensitive filesystem */
public abstract class C22971Dz {
    public static boolean A00;

    public static AnonymousClass1EC A02(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append('@');
        sb.append("g.us");
        String obj = sb.toString();
        Jid A02 = Jid.Companion.A02(obj);
        if (A0W(A02)) {
            return (AnonymousClass1EC) A02;
        }
        throw new AnonymousClass11T(obj);
    }

    public static UserJid A05(String str) {
        AnonymousClass1E5 r1 = AnonymousClass1E5.A00;
        if ("".equals(str) || r1.getRawString().equals(str)) {
            return r1;
        }
        return UserJid.Companion.A04(str);
    }

    public static String A06(Jid jid) {
        if (jid == null) {
            return null;
        }
        return jid.getRawString();
    }

    public static String A07(String str) {
        Class<Jid> cls = Jid.class;
        Jid A02 = Jid.Companion.A02(str);
        if (A02 == null || !cls.isAssignableFrom(A02.getClass())) {
            return str;
        }
        return A02.toString();
    }

    public static String A09(String[] strArr) {
        if (strArr == null) {
            return "null";
        }
        int length = strArr.length - 1;
        if (length == -1) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('[');
        int i = 0;
        while (true) {
            sb.append(A07(strArr[i]));
            if (i == length) {
                sb.append(']');
                return sb.toString();
            }
            sb.append(", ");
            i++;
        }
    }

    public static ArrayList A0A(Class cls, Iterable iterable) {
        ArrayList arrayList = new ArrayList();
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Jid A02 = Jid.Companion.A02((String) it.next());
                if (cls.isInstance(A02)) {
                    arrayList.add(cls.cast(A02));
                }
            }
        }
        return arrayList;
    }

    public static ArrayList A0C(String[] strArr) {
        Class<UserJid> cls = UserJid.class;
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            if (str != null) {
                Jid A02 = Jid.Companion.A02(str);
                if (cls.isInstance(A02)) {
                    arrayList.add(cls.cast(A02));
                }
            }
        }
        return arrayList;
    }

    public static void A0G(Class cls, Collection collection, Collection collection2) {
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                Jid A02 = Jid.Companion.A02((String) it.next());
                if (cls.isInstance(A02)) {
                    collection2.add(cls.cast(A02));
                }
            }
        }
    }

    public static void A0H(Iterable iterable, Collection collection) {
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Jid jid = (Jid) it.next();
                if (jid != null) {
                    collection.add(jid.getRawString());
                }
            }
        }
    }

    public static void A0I(Iterable iterable, Collection collection) {
        Jid A02;
        if (iterable != null) {
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!(str == null || (A02 = Jid.Companion.A02(str)) == null)) {
                    collection.add(A02);
                }
            }
        }
    }

    public static boolean A0J(AnonymousClass1BI r2) {
        if (A00) {
            if (r2 == null) {
                return false;
            }
            if (r2.getType() == 22 || r2.getType() == 28) {
                return true;
            }
            return false;
        } else if ((r2 instanceof AnonymousClass1ED) || (r2 instanceof C173418v2)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean A0L(Jid jid) {
        if (jid == null) {
            return false;
        }
        int type = jid.getType();
        if (type == 0 || type == 1 || type == 18 || type == 22 || type == 3 || type == 7 || type == 21 || type == 26) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0M(com.whatsapp.jid.Jid r3) {
        /*
            boolean r0 = A00
            r2 = 0
            if (r0 == 0) goto L_0x0015
            if (r3 == 0) goto L_0x0014
            int r1 = r3.getType()
            r0 = 26
            if (r1 == r0) goto L_0x0013
            r0 = 27
            if (r1 != r0) goto L_0x0014
        L_0x0013:
            r2 = 1
        L_0x0014:
            return r2
        L_0x0015:
            boolean r0 = r3 instanceof X.C42711yc
            if (r0 != 0) goto L_0x0013
            boolean r0 = r3 instanceof X.C47702Jn
            if (r0 == 0) goto L_0x0014
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22971Dz.A0M(com.whatsapp.jid.Jid):boolean");
    }

    public static boolean A0N(Jid jid) {
        if (!A00) {
            return jid instanceof C29661cf;
        }
        if (jid == null) {
            return false;
        }
        int type = jid.getType();
        if (type == 3 || type == 5 || type == 6) {
            return true;
        }
        return false;
    }

    public static boolean A0O(Jid jid) {
        if (!A00) {
            return jid instanceof C47712Jo;
        }
        if (jid == null || jid.getType() != 3) {
            return false;
        }
        return true;
    }

    public static boolean A0P(Jid jid) {
        if (jid == null) {
            return false;
        }
        int type = jid.getType();
        if (type == 10 || type == 0 || type == 17 || type == 20 || type == 18 || type == 19 || type == 26 || type == 27) {
            return true;
        }
        return false;
    }

    public static boolean A0Q(Jid jid) {
        if (!A00) {
            return jid instanceof DeviceJid;
        }
        if (jid == null) {
            return false;
        }
        int type = jid.getType();
        if (type == 17 || type == 24 || type == 25 || type == 19 || type == 23) {
            return true;
        }
        return false;
    }

    public static boolean A0R(Jid jid) {
        if (!A00) {
            return jid instanceof AnonymousClass688;
        }
        if (jid == null || jid.getType() != 9) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0013 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0S(com.whatsapp.jid.Jid r3) {
        /*
            boolean r0 = A00
            r2 = 0
            if (r0 == 0) goto L_0x0015
            if (r3 == 0) goto L_0x0014
            int r1 = r3.getType()
            r0 = 22
            if (r1 == r0) goto L_0x0013
            r0 = 23
            if (r1 != r0) goto L_0x0014
        L_0x0013:
            r2 = 1
        L_0x0014:
            return r2
        L_0x0015:
            boolean r0 = r3 instanceof X.AnonymousClass1ED
            if (r0 != 0) goto L_0x0013
            boolean r0 = r3 instanceof X.AnonymousClass1EF
            if (r0 == 0) goto L_0x0014
            goto L_0x0013
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22971Dz.A0S(com.whatsapp.jid.Jid):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0017 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0T(com.whatsapp.jid.Jid r3) {
        /*
            boolean r0 = A00
            r2 = 0
            if (r0 == 0) goto L_0x0019
            if (r3 == 0) goto L_0x0018
            int r1 = r3.getType()
            r0 = 18
            if (r1 == r0) goto L_0x0017
            r0 = 19
            if (r1 == r0) goto L_0x0017
            r0 = 25
            if (r1 != r0) goto L_0x0018
        L_0x0017:
            r2 = 1
        L_0x0018:
            return r2
        L_0x0019:
            boolean r0 = r3 instanceof X.AnonymousClass1E2
            if (r0 != 0) goto L_0x0017
            boolean r0 = r3 instanceof X.C42521yJ
            if (r0 == 0) goto L_0x0018
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22971Dz.A0T(com.whatsapp.jid.Jid):boolean");
    }

    public static boolean A0U(Jid jid) {
        if (!A00) {
            return jid instanceof AnonymousClass1E2;
        }
        if (jid == null || jid.getType() != 18) {
            return false;
        }
        return true;
    }

    public static boolean A0V(Jid jid) {
        if (!A00) {
            return jid instanceof C29681ch;
        }
        if (jid == null || jid.getType() != 21) {
            return false;
        }
        return true;
    }

    public static boolean A0W(Jid jid) {
        if (!A00) {
            return jid instanceof AnonymousClass1EC;
        }
        if (jid == null || jid.getType() != 1) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0011 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0X(com.whatsapp.jid.Jid r3) {
        /*
            boolean r0 = A00
            r2 = 0
            if (r0 == 0) goto L_0x0013
            if (r3 == 0) goto L_0x0012
            int r1 = r3.getType()
            if (r1 == 0) goto L_0x0011
            r0 = 17
            if (r1 != r0) goto L_0x0012
        L_0x0011:
            r2 = 1
        L_0x0012:
            return r2
        L_0x0013:
            boolean r0 = r3 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 != 0) goto L_0x0011
            boolean r0 = r3 instanceof X.AnonymousClass1E3
            if (r0 == 0) goto L_0x0012
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22971Dz.A0X(com.whatsapp.jid.Jid):boolean");
    }

    public static boolean A0Y(Jid jid) {
        if (!A00) {
            return jid instanceof PhoneUserJid;
        }
        if (jid == null || jid.getType() != 0) {
            return false;
        }
        return true;
    }

    public static boolean A0Z(Jid jid) {
        if (!A00) {
            return jid instanceof C42541yL;
        }
        if (jid == null || jid.getType() != 7) {
            return false;
        }
        return true;
    }

    public static boolean A0a(Jid jid) {
        if (!A00) {
            return jid instanceof C29671cg;
        }
        if (jid == null || jid.getType() != 5) {
            return false;
        }
        return true;
    }

    public static boolean A0b(Jid jid) {
        if (A00) {
            if (jid == null || jid.getType() != 11) {
                return false;
            }
        } else if ((jid instanceof C173468v7) || (jid instanceof AnonymousClass1E5)) {
            return true;
        } else {
            return false;
        }
        return true;
    }

    public static boolean A0c(Jid jid) {
        if (!A00) {
            return jid instanceof AnonymousClass1EB;
        }
        if (jid == null || jid.getType() != 2) {
            return false;
        }
        return true;
    }

    public static boolean A0d(Jid jid) {
        if (!A00) {
            return jid instanceof UserJid;
        }
        if (jid == null) {
            return false;
        }
        int type = jid.getType();
        if (type == 0 || type == 11 || type == 18 || type == 22 || type == 26 || type == 7 || type == 24 || type == 25) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:6:0x0011 A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0e(com.whatsapp.jid.Jid r4) {
        /*
            boolean r0 = A00
            r3 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0013
            if (r4 == 0) goto L_0x0012
            int r1 = r4.getType()
            r0 = 2
            if (r1 == r0) goto L_0x0011
            if (r1 != r2) goto L_0x0012
        L_0x0011:
            r3 = 1
        L_0x0012:
            return r3
        L_0x0013:
            boolean r0 = r4 instanceof X.AnonymousClass1EB
            if (r0 != 0) goto L_0x0011
            boolean r0 = r4 instanceof X.AnonymousClass1EC
            if (r0 == 0) goto L_0x0012
            goto L_0x0011
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C22971Dz.A0e(com.whatsapp.jid.Jid):boolean");
    }

    public static boolean A0f(AnonymousClass206 r0) {
        return A0e(r0.A0v.A00);
    }

    public static boolean A0g(AnonymousClass206 r0) {
        return A0a(r0.A0v.A00);
    }

    public static AnonymousClass1BI A00(Jid jid) {
        if (A0Q(jid)) {
            return ((DeviceJid) jid).userJid;
        }
        C22931Dv r0 = AnonymousClass1BI.A00;
        return C22931Dv.A00(jid);
    }

    public static AnonymousClass1BI A01(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass1BI r1 = (AnonymousClass1BI) it.next();
            if (A0a(r1)) {
                return r1;
            }
        }
        return null;
    }

    public static UserJid A03(UserJid userJid) {
        boolean A0M = A0M(userJid);
        StringBuilder sb = new StringBuilder();
        sb.append("Jids/convertBotJidtoPnJid botJid must be bot jid type:");
        sb.append(userJid.getType());
        C17960vV.A0F(A0M, sb.toString());
        String A002 = C60882ol.A00(userJid.user);
        if (A002 != null) {
            return new PhoneUserJid(A002);
        }
        return userJid;
    }

    public static UserJid A04(UserJid userJid) {
        boolean A0X = A0X(userJid);
        StringBuilder sb = new StringBuilder();
        sb.append("Jids/convertPNJidtoBotJidIfExists pnJid must be phone jid type:");
        sb.append(userJid.getType());
        C17960vV.A0F(A0X, sb.toString());
        String str = userJid.user;
        Map map = C60882ol.A00;
        C18070vi.A0d(str, 0);
        String str2 = (String) C60882ol.A00.get(str);
        if (str2 != null) {
            return new C42711yc(str2);
        }
        return userJid;
    }

    public static String A08(String str, String str2, int i) {
        String obj;
        if (TextUtils.isEmpty(str)) {
            return str2;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        if (i == 0) {
            obj = "";
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(":");
            sb2.append(i);
            obj = sb2.toString();
        }
        sb.append(obj);
        sb.append('@');
        sb.append(str2);
        return sb.toString();
    }

    public static ArrayList A0B(Collection collection) {
        ArrayList arrayList = new ArrayList(collection.size());
        A0H(collection, arrayList);
        return arrayList;
    }

    public static Set A0D(AnonymousClass190 r2, Set set) {
        HashSet hashSet = new HashSet(set.size());
        A0F(r2, set, hashSet);
        return hashSet;
    }

    public static void A0E(AnonymousClass190 r0, C62162qt r1, Set set) {
        r1.A02 = A0D(r0, set).size();
        r1.A00 = set.size();
    }

    public static void A0F(AnonymousClass190 r4, Iterable iterable, Collection collection) {
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            DeviceJid deviceJid = (DeviceJid) it.next();
            if (deviceJid == null) {
                r4.A0G("Jids/deviceJidsToUserJids/null-jid", (String) null, true);
            } else {
                collection.add(deviceJid.userJid);
            }
        }
    }

    public static boolean A0K(Jid jid) {
        if (!A0L(jid) || A0Z(jid) || A0M(jid)) {
            return false;
        }
        return true;
    }

    public static boolean A0h(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (A0V((Jid) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean A0i(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!A0a((Jid) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static String[] A0j(Collection collection) {
        return (String[]) A0B(collection).toArray(new String[0]);
    }
}
