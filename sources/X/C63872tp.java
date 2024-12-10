package X;

import android.util.Base64;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.2tp  reason: invalid class name and case insensitive filesystem */
public class C63872tp {
    public int A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public final C56652ho A05 = new C56652ho();
    public final AnonymousClass1E9 A06;
    public final Object A07 = C17880vN.A0p();
    public final Map A08 = new ConcurrentHashMap();
    public final Map A09 = new ConcurrentHashMap();
    public final Object A0A = C17880vN.A0p();
    public volatile boolean A0B = false;

    public static C63312sr A00(C63872tp r10, UserJid userJid, Collection collection, int i, long j, boolean z, boolean z2) {
        UserJid userJid2 = userJid;
        C63312sr A0D = r10.A0D(userJid, false);
        int i2 = i;
        long j2 = j;
        boolean z3 = z;
        if (A0D != null) {
            A0D.A01 = i;
            A0D.A03 = z3;
            A0D.A02 = j;
        } else {
            A0D = new C63312sr(userJid2, A02(collection), i2, j2, z3);
            if (C22971Dz.A0Y(userJid)) {
                C56652ho r2 = r10.A05;
                Map map = r10.A09;
                r2.A00(userJid, map.size());
                A0D.A00 = map.size();
                map.put(userJid, A0D);
            }
            if (C22971Dz.A0T(userJid) && r10.A00 != 0) {
                C56652ho r22 = r10.A05;
                Map map2 = r10.A08;
                r22.A00(userJid, map2.size());
                A0D.A00 = map2.size();
                map2.put(userJid, A0D);
            }
            r10.A0B = true;
            if (z2) {
                r10.A0O();
                return A0D;
            }
        }
        return A0D;
    }

    public C54072dY A0E(C199410f r10, UserJid userJid) {
        C63312sr A0D = A0D(userJid, false);
        boolean z = false;
        if (A0D == null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("GroupParticipants/refreshDevices/participant ");
            A10.append(userJid);
            C17890vO.A1B(A10, " doesn't exist");
            return new C54072dY(false, false, false);
        }
        ConcurrentHashMap concurrentHashMap = A0D.A05;
        C199410f copyOf = C199410f.copyOf((Collection) concurrentHashMap.keySet());
        C18070vi.A0X(copyOf);
        AnonymousClass1IZ it = r10.iterator();
        boolean z2 = false;
        while (it.hasNext()) {
            DeviceJid A0R = C17880vN.A0R(it);
            if (!copyOf.contains(A0R)) {
                this.A0B = true;
                C59232ly r2 = new C59232ly(A0R, false, false);
                DeviceJid deviceJid = r2.A02;
                if (!concurrentHashMap.containsKey(deviceJid)) {
                    concurrentHashMap.put(deviceJid, r2);
                }
                z2 = true;
            }
        }
        AnonymousClass1IZ it2 = copyOf.iterator();
        boolean z3 = false;
        boolean z4 = false;
        while (it2.hasNext()) {
            Object next = it2.next();
            if (!r10.contains(next)) {
                C18070vi.A0d(next, 0);
                C59232ly r0 = (C59232ly) concurrentHashMap.remove(next);
                if (r0 != null) {
                    z4 |= r0.A01;
                }
                z3 = true;
            }
        }
        if (z2 || z3) {
            A05(this);
            if (z3 && z4) {
                z = true;
                A03();
            }
        }
        return new C54072dY(z2, z3, z);
    }

    public boolean A0V(C199410f r6, UserJid userJid) {
        C63312sr A0D = A0D(userJid, false);
        if (A0D == null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("GroupParticipants/removeDevices/participant ");
            A10.append(userJid);
            C17890vO.A1B(A10, " doesn't exist");
            return false;
        }
        boolean z = false;
        AnonymousClass1IZ it = r6.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C18070vi.A0d(next, 0);
            C59232ly r0 = (C59232ly) A0D.A05.remove(next);
            if (r0 != null) {
                z |= r0.A01;
            }
        }
        if (r6.isEmpty()) {
            return z;
        }
        if (z) {
            A03();
        }
        A05(this);
        return z;
    }

    public int hashCode() {
        Object[] objArr = new Object[5];
        objArr[0] = this.A06;
        objArr[1] = this.A09;
        objArr[2] = this.A08;
        objArr[3] = A0G();
        return AnonymousClass000.A0P(A0I(), objArr, 4);
    }

    private void A03() {
        Iterator A0l = C17890vO.A0l(this.A09);
        while (A0l.hasNext()) {
            Iterator A0j = C17890vO.A0j(((C63312sr) A0l.next()).A05);
            while (A0j.hasNext()) {
                ((C59232ly) A0j.next()).A01 = false;
            }
        }
        Iterator A0l2 = C17890vO.A0l(this.A08);
        while (A0l2.hasNext()) {
            Iterator A0j2 = C17890vO.A0j(((C63312sr) A0l2.next()).A05);
            while (A0j2.hasNext()) {
                ((C59232ly) A0j2.next()).A01 = false;
            }
        }
    }

    public static void A05(C63872tp r2) {
        synchronized (r2.A0A) {
            r2.A04 = C63442t5.A03(r2.A0M());
            r2.A03 = C63442t5.A03(r2.A0L());
            r2.A0I();
            r2.A0G();
        }
    }

    public int A06() {
        Map map;
        if (this.A00 != 0) {
            map = this.A08;
        } else {
            map = this.A09;
        }
        return map.size();
    }

    public C199410f A07() {
        if (this.A00 != 0) {
            return C199410f.copyOf((Collection) this.A08.keySet());
        }
        return A0C();
    }

    public C199410f A08() {
        if (this.A00 != 0) {
            return C199410f.copyOf(this.A08.values());
        }
        return A0B();
    }

    public C199410f A0A() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap(this.A09);
        Iterator A15 = AnonymousClass000.A15(this.A08);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            concurrentHashMap.putIfAbsent(A16.getKey(), A16.getValue());
        }
        return C199410f.copyOf(concurrentHashMap.values());
    }

    public C199410f A0B() {
        return C199410f.copyOf(this.A09.values());
    }

    public C199410f A0C() {
        return C199410f.copyOf((Collection) this.A09.keySet());
    }

    public C63312sr A0D(UserJid userJid, boolean z) {
        Map map;
        if (userJid == null) {
            return null;
        }
        if (!C22971Dz.A0T(userJid) || (this.A00 == 0 && !z)) {
            map = this.A09;
        } else {
            map = this.A08;
        }
        return (C63312sr) map.get(userJid);
    }

    public String A0F() {
        if (AnonymousClass000.A1T(2, this.A00)) {
            return A0H();
        }
        return A0J();
    }

    public String A0G() {
        String str;
        synchronized (this.A0A) {
            str = this.A03;
            C17960vV.A07(str);
        }
        return str;
    }

    public String A0H() {
        String str;
        synchronized (this.A07) {
            str = this.A01;
            if (str == null) {
                str = A01(this.A08.keySet());
                this.A01 = str;
            }
            C17960vV.A07(str);
        }
        return str;
    }

    public String A0I() {
        String str;
        synchronized (this.A0A) {
            str = this.A04;
            C17960vV.A07(str);
        }
        return str;
    }

    public String A0J() {
        String str;
        synchronized (this.A07) {
            str = this.A02;
            if (str == null) {
                str = A01(this.A09.keySet());
                this.A02 = str;
            }
            C17960vV.A07(str);
        }
        return str;
    }

    public void A0P(UserJid userJid, Collection collection, int i, boolean z) {
        A00(this, userJid, collection, i, 0, z, true);
    }

    public void A0S(ConcurrentHashMap concurrentHashMap) {
        if (this.A00 != 0) {
            Map map = this.A08;
            map.clear();
            Iterator A0i = C17890vO.A0i(concurrentHashMap);
            while (A0i.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A0i);
                if (C22971Dz.A0T((Jid) A16.getKey())) {
                    map.put(A16.getKey(), A16.getValue());
                } else {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("GroupParticipants/setLidParticipants trying to add a non lid number participant into the lid participant list ");
                    A10.append(A16.getKey());
                    C17890vO.A0w(A10);
                }
            }
        }
    }

    public void A0T(ConcurrentHashMap concurrentHashMap) {
        Map map = this.A09;
        map.clear();
        Iterator A0i = C17890vO.A0i(concurrentHashMap);
        while (A0i.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A0i);
            if (C22971Dz.A0Y((Jid) A16.getKey())) {
                map.put(A16.getKey(), A16.getValue());
            } else {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("GroupParticipants/setPnParticipants trying to add a lid participant into the pn participant list ");
                A10.append(A16.getKey());
                C17890vO.A0w(A10);
            }
        }
    }

    public boolean A0U() {
        return AnonymousClass000.A1T(2, this.A00);
    }

    public boolean A0W(AnonymousClass11S r3) {
        UserJid A002;
        if (this.A00 != 0) {
            A002 = r3.A09();
        } else {
            A002 = AnonymousClass11S.A00(r3);
        }
        if (A002 == null || A0D(A002, false) == null) {
            return false;
        }
        return true;
    }

    public boolean A0X(AnonymousClass11S r3) {
        UserJid A002;
        C63312sr A0D;
        if (this.A00 != 0) {
            A002 = r3.A09();
        } else {
            A002 = AnonymousClass11S.A00(r3);
        }
        if (A002 == null || (A0D = A0D(A002, false)) == null || A0D.A01 == 0) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C63872tp r4 = (C63872tp) obj;
            if (this.A06.equals(r4.A06) && this.A09.equals(r4.A09) && C42171xk.A00(A0G(), r4.A0G()) && this.A08.equals(r4.A08)) {
                return C42171xk.A00(A0I(), r4.A0I());
            }
        }
        return false;
    }

    public C63872tp(AnonymousClass1E9 r2, int i) {
        C17960vV.A07(r2);
        this.A06 = r2;
        this.A00 = i;
    }

    public static String A01(Collection collection) {
        ArrayList A0z = C17880vN.A0z(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            A0z.add(C17880vN.A0S(it).getRawString());
        }
        Collections.sort(A0z);
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA1");
            Iterator it2 = A0z.iterator();
            while (it2.hasNext()) {
                instance.update(C17880vN.A0v(it2).getBytes());
            }
            byte[] digest = instance.digest();
            byte[] bArr = new byte[6];
            System.arraycopy(digest, 0, bArr, 0, 6);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("1:");
            return AnonymousClass000.A0y(Base64.encodeToString(bArr, 2), A10);
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public static HashSet A02(Collection collection) {
        C17960vV.A0D(!collection.isEmpty());
        HashSet hashSet = new HashSet(collection.size());
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            hashSet.add(new C59232ly(C17880vN.A0R(it), false, false));
        }
        return hashSet;
    }

    public static void A04(AnonymousClass190 r3, C63872tp r4, List list) {
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (C22971Dz.A0T(((C63312sr) it.next()).A04)) {
                if (r4.A00 == 0) {
                    r3.A0G("addParticipants/group with lid", "trying to add a lid participant when is not an incognito CAG", false);
                }
            }
        }
        r4.A0Q(list);
    }

    public C199410f A09() {
        HashSet A12 = C17880vN.A12();
        A12.addAll(this.A09.keySet());
        A12.addAll(this.A08.keySet());
        return C199410f.copyOf((Collection) A12);
    }

    public ArrayList A0K() {
        ArrayList A13 = AnonymousClass000.A13();
        AnonymousClass1IZ it = A08().iterator();
        while (it.hasNext()) {
            C63312sr r1 = (C63312sr) it.next();
            if (r1.A01 != 0) {
                A13.add(r1);
            }
        }
        return A13;
    }

    public HashSet A0L() {
        HashSet A12 = C17880vN.A12();
        Iterator A15 = AnonymousClass000.A15(this.A08);
        while (A15.hasNext()) {
            AnonymousClass1IZ it = ((C63312sr) C17890vO.A0P(A15)).A00().iterator();
            while (it.hasNext()) {
                A12.add(((C59232ly) it.next()).A02);
            }
        }
        return A12;
    }

    public HashSet A0M() {
        HashSet A12 = C17880vN.A12();
        Iterator A15 = AnonymousClass000.A15(this.A09);
        while (A15.hasNext()) {
            AnonymousClass1IZ it = ((C63312sr) C17890vO.A0P(A15)).A00().iterator();
            while (it.hasNext()) {
                A12.add(((C59232ly) it.next()).A02);
            }
        }
        return A12;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0051, code lost:
        if (X.C18020vd.A00(r2, r9, 7820) != 0) goto L_0x0063;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.HashSet A0N(X.AnonymousClass11S r8, X.C18030ve r9, X.C63182se r10, boolean r11) {
        /*
            r7 = this;
            java.util.HashSet r3 = X.C17880vN.A12()
            if (r11 == 0) goto L_0x0066
            java.util.Map r0 = r7.A08
        L_0x0008:
            java.util.Iterator r6 = X.AnonymousClass000.A15(r0)
        L_0x000c:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0069
            java.lang.Object r0 = X.C17890vO.A0P(r6)
            X.2sr r0 = (X.C63312sr) r0
            X.10f r0 = r0.A00()
            X.1IZ r5 = r0.iterator()
        L_0x0020:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x000c
            java.lang.Object r4 = r5.next()
            X.2ly r4 = (X.C59232ly) r4
            if (r11 == 0) goto L_0x0063
            int r1 = r7.A00
            r0 = 2
            boolean r0 = X.AnonymousClass000.A1T(r0, r1)
            if (r0 != 0) goto L_0x0063
            X.C18070vi.A0h(r9, r10)
            boolean r0 = r10.A02()
            if (r0 == 0) goto L_0x0053
            r0 = 7821(0x1e8d, float:1.096E-41)
            X.0vf r2 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r2, r9, r0)
            r1 = 0
            if (r0 == r1) goto L_0x0053
            r0 = 7820(0x1e8c, float:1.0958E-41)
            int r0 = X.C18020vd.A00(r2, r9, r0)
            if (r0 != r1) goto L_0x0063
        L_0x0053:
            boolean r2 = r4.A00
        L_0x0055:
            com.whatsapp.jid.DeviceJid r1 = r4.A02
            boolean r0 = r8.A0Q(r1)
            if (r0 != 0) goto L_0x0020
            if (r2 != 0) goto L_0x0020
            r3.add(r1)
            goto L_0x0020
        L_0x0063:
            boolean r2 = r4.A01
            goto L_0x0055
        L_0x0066:
            java.util.Map r0 = r7.A09
            goto L_0x0008
        L_0x0069:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C63872tp.A0N(X.11S, X.0ve, X.2se, boolean):java.util.HashSet");
    }

    public void A0O() {
        A05(this);
        synchronized (this.A07) {
            this.A02 = A01(this.A09.keySet());
            this.A01 = A01(this.A08.keySet());
        }
    }

    public void A0Q(Collection collection) {
        Iterator it = collection.iterator();
        while (true) {
            if (it.hasNext()) {
                C63312sr r1 = (C63312sr) it.next();
                UserJid userJid = r1.A04;
                C199410f copyOf = C199410f.copyOf((Collection) r1.A05.keySet());
                C18070vi.A0X(copyOf);
                A00(this, userJid, copyOf, r1.A01, r1.A02, r1.A03, false);
            } else {
                A0O();
                return;
            }
        }
    }

    public void A0R(Collection collection) {
        boolean z = false;
        for (Object next : collection) {
            if (this.A09.remove(next) != null || this.A08.remove(next) != null) {
                z = true;
            }
        }
        if (z) {
            A0O();
        }
    }

    public boolean A0Y(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C63312sr A0D = A0D(C17880vN.A0T(it), false);
            if (A0D != null) {
                AnonymousClass1IZ it2 = A0D.A00().iterator();
                while (it2.hasNext()) {
                    if (((C59232ly) it2.next()).A01) {
                        return true;
                    }
                }
                continue;
            }
        }
        return false;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GroupParticipants{groupJid='");
        A10.append(this.A06);
        A10.append('\'');
        A10.append(", pnParticipants=");
        A10.append(this.A09.size());
        A10.append(", pnParticipantHashV1='");
        A10.append(A0I());
        A10.append('\'');
        A10.append(", lidParticipants=");
        A10.append(this.A08.size());
        A10.append(", lidParticipantHashV1='");
        A10.append(A0G());
        A10.append('\'');
        return C17890vO.A0b(A10);
    }
}
