package X;

import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.73z  reason: invalid class name and case insensitive filesystem */
public final class C1410273z {
    public int A00;
    public Map A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final int A09;
    public final int A0A;
    public final int A0B;
    public final int A0C;
    public final AnonymousClass00H A0D;
    public final AnonymousClass00H A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G;
    public final AnonymousClass00H A0H;
    public final AnonymousClass00H A0I;
    public final C18100vl A0J;
    public final C18100vl A0K;
    public final int A0L;
    public final int A0M;
    public final AnonymousClass6nM A0N;
    public final AnonymousClass00H A0O;
    public final boolean A0P;

    public static final boolean A05(AnonymousClass1BI r1) {
        C18070vi.A0d(r1, 0);
        if (!C22971Dz.A0d(r1) || C22971Dz.A0Z(r1) || C42701yb.A01(r1) || C22971Dz.A0b(r1) || C22971Dz.A0e(r1)) {
            return false;
        }
        return true;
    }

    private final void A02(List list, Map map, int i) {
        if (i != 0) {
            ArrayList A13 = AnonymousClass000.A13();
            for (Object next : list) {
                AnonymousClass1BI r1 = (AnonymousClass1BI) next;
                C18070vi.A0d(r1, 0);
                if (A05(r1) || C22971Dz.A0e(r1)) {
                    A13.add(next);
                }
            }
            int i2 = 0;
            for (Object next2 : A13) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    AnonymousClass1ZU.A0B();
                    throw null;
                }
                Jid jid = (Jid) next2;
                if (C22971Dz.A0e(jid) && (jid instanceof GroupJid) && jid != null) {
                    int i4 = i;
                    int i5 = this.A0C;
                    if (i2 < i5) {
                        i4 = i * ((i5 - i2) + 1);
                    }
                    C17880vN.A1P(jid, map, C72463Mc.A0B(C108945cZ.A1E(jid, map)) + i4);
                }
                i2 = i3;
            }
        }
    }

    private final void A03(List list, Map map, int i) {
        if (i != 0) {
            ArrayList A13 = AnonymousClass000.A13();
            for (Object next : list) {
                A01((AnonymousClass1BI) next, next, A13);
            }
            int i2 = 0;
            for (Object next2 : A13) {
                int i3 = i2 + 1;
                if (i2 < 0) {
                    AnonymousClass1ZU.A0B();
                    throw null;
                }
                int i4 = i;
                int i5 = this.A0C;
                if (i2 < i5) {
                    i4 = i * ((i5 - i2) + 1);
                }
                C17880vN.A1P(next2, map, C72463Mc.A0B(C108945cZ.A1E(next2, map)) + i4);
                i2 = i3;
            }
        }
    }

    private final void A04(Map map, Map map2, Map map3) {
        int i;
        int i2 = this.A0M;
        if (i2 != 0) {
            Iterator A15 = AnonymousClass000.A15(map);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                int A0M2 = AnonymousClass000.A0M(A16.getValue());
                ArrayList A13 = AnonymousClass000.A13();
                C199410f A0B2 = ((AnonymousClass1MW) this.A0G.get()).A0B((AnonymousClass1E9) A16.getKey()).A0B();
                ArrayList<C63312sr> A0t = C108965cb.A0t(A0B2);
                for (Object next : A0B2) {
                    A01(((C63312sr) next).A04, next, A0t);
                }
                for (C63312sr r0 : A0t) {
                    A13.add(r0.A04);
                }
                List<Object> A0t2 = C29431cG.A0t(A13);
                if (!A0t2.isEmpty() && A0M2 != 0 && A0t2.size() <= this.A0L) {
                    if (this.A0P) {
                        i = 0;
                        for (Object A1E : A0t2) {
                            i += C72463Mc.A0B(C108945cZ.A1E(A1E, map3));
                        }
                    } else {
                        i = 0;
                    }
                    int size = ((A0M2 + i) * i2) / A0t2.size();
                    for (Object next2 : A0t2) {
                        C17880vN.A1P(next2, map2, C72463Mc.A0B(C108945cZ.A1E(next2, map2)) + size);
                    }
                }
            }
        }
    }

    public final Map A07(boolean z) {
        int i;
        Collection values;
        Number number;
        String A022;
        if (z) {
            LinkedHashMap A002 = A00();
            this.A0N.A00(A002);
            this.A01 = A002;
        }
        Map map = this.A01;
        if (map == null || map.isEmpty()) {
            AnonymousClass6nM r6 = this.A0N;
            long A012 = AnonymousClass11P.A01(r6.A00);
            C24621La r3 = r6.A01;
            AbstractMap abstractMap = null;
            if (r3.A01("status_ranking_map_expiration", 0) >= A012 && (A022 = r3.A02("status_ranking_map")) != null) {
                try {
                    JSONObject A16 = C17880vN.A16(A022);
                    Iterator<String> keys = A16.keys();
                    AbstractMap A11 = C17880vN.A11();
                    while (keys.hasNext()) {
                        String A0v = C17880vN.A0v(keys);
                        AnonymousClass1BI A0l = AnonymousClass3MX.A0l(A0v);
                        if (A0l != null) {
                            C17890vO.A0z(A0l, A11, A16.getInt(A0v));
                        }
                    }
                    abstractMap = A11;
                } catch (JSONException unused) {
                    Log.e("Unable to fetch the ranking map");
                }
            }
            if (abstractMap == null) {
                abstractMap = A00();
                r6.A00(abstractMap);
            }
            this.A01 = abstractMap;
        }
        Map map2 = this.A01;
        if (map2 == null || (values = map2.values()) == null || (number = (Number) C29431cG.A0W(values)) == null) {
            i = 0;
        } else {
            i = number.intValue();
        }
        this.A00 = i;
        return this.A01;
    }

    public String toString() {
        Map map = this.A01;
        if (map == null) {
            return "";
        }
        ArrayList A11 = C72453Mb.A11(map);
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append(A16.getKey());
            A10.append(": ");
            A11.add(C17880vN.A0t(A10, AnonymousClass000.A0M(A16.getValue())));
        }
        return C108995ce.A0X("\n ", A11);
    }

    public C1410273z(C18030ve r4, AnonymousClass6nM r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12) {
        C18070vi.A0w(r4, r6, r7, r8, r9);
        C108965cb.A1P(r10, 6, r11);
        C18070vi.A0d(r12, 9);
        this.A0I = r6;
        this.A0O = r7;
        this.A0E = r8;
        this.A0D = r9;
        this.A0F = r10;
        this.A0N = r5;
        this.A0G = r11;
        this.A0H = r12;
        C18040vf r1 = C18040vf.A02;
        this.A02 = C18020vd.A00(r1, r4, 6463);
        this.A09 = C18020vd.A00(r1, r4, 6464);
        this.A04 = C18020vd.A00(r1, r4, 6465);
        this.A0B = C18020vd.A00(r1, r4, 6466);
        this.A0C = C18020vd.A00(r1, r4, 6467);
        this.A03 = C18020vd.A00(r1, r4, 9184);
        this.A08 = C18020vd.A00(r1, r4, 9185);
        this.A0A = C18020vd.A00(r1, r4, 9183);
        Integer num = AnonymousClass00R.A0C;
        this.A0J = AnonymousClass1DF.A00(num, new C153747q1(this));
        this.A0K = AnonymousClass1DF.A00(num, new C153757q2(this));
        this.A0P = C18020vd.A05(r1, r4, 9419);
        this.A05 = C18020vd.A00(r1, r4, 9416);
        this.A07 = C18020vd.A00(r1, r4, 9420);
        this.A06 = C18020vd.A00(r1, r4, 9417);
        this.A0M = C18020vd.A00(r1, r4, 9418);
        this.A0L = C18020vd.A00(r1, r4, 9415);
    }

    private final LinkedHashMap A00() {
        List A062;
        List A012;
        List list;
        List list2;
        List list3;
        LinkedHashMap A13 = C17880vN.A13();
        int i = this.A0B;
        if (i == 0 && this.A07 == 0) {
            A062 = C18460wS.A00;
        } else {
            A062 = ((C25161Nd) this.A0E.get()).A06();
            C18070vi.A0b(A062);
        }
        int i2 = this.A04;
        if (i2 == 0 && this.A05 == 0) {
            A012 = C18460wS.A00;
        } else {
            A012 = ((C26051Qq) this.A0F.get()).A01(false, false);
            C18070vi.A0b(A012);
        }
        A03(A062, A13, i);
        A03(A012, A13, i2);
        int i3 = this.A09;
        if (i3 != 0) {
            Set keySet = AnonymousClass1Nb.A05((AnonymousClass1Nb) this.A0D.get(), true).keySet();
            C18070vi.A0b(keySet);
            ArrayList A132 = AnonymousClass000.A13();
            for (Object next : keySet) {
                A01((AnonymousClass1BI) next, next, A132);
            }
            int i4 = this.A0C;
            int size = A132.size();
            if (size > i4) {
                size = i4;
            }
            int i5 = (i4 - size) + 1;
            Iterator it = A132.iterator();
            while (it.hasNext()) {
                UserJid A002 = C22941Dw.A00(C17880vN.A0S(it));
                if (A002 != null) {
                    C17880vN.A1P(A002, A13, C72463Mc.A0B(C108945cZ.A1D(A002, A13)) + (i3 * i5));
                }
            }
        }
        int i6 = this.A02;
        if (i6 != 0) {
            ArrayList A0A2 = ((C24661Le) this.A0I.get()).A0A();
            ArrayList A133 = AnonymousClass000.A13();
            Iterator it2 = A0A2.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                AnonymousClass1BI r0 = (AnonymousClass1BI) next2;
                C18070vi.A0b(r0);
                A01(r0, next2, A133);
            }
            int i7 = this.A0C;
            int size2 = A133.size();
            if (size2 > i7) {
                size2 = i7;
            }
            int i8 = (i7 - size2) + 1;
            for (Object next3 : A133) {
                C18070vi.A0b(next3);
                C17880vN.A1P(next3, A13, C72463Mc.A0B(C108945cZ.A1D(next3, A13)) + (i6 * i8));
            }
        }
        int i9 = this.A03;
        if (i9 == 0) {
            list = C18460wS.A00;
        } else {
            ArrayList A092 = ((C24661Le) this.A0I.get()).A09();
            ArrayList A134 = AnonymousClass000.A13();
            Iterator it3 = A092.iterator();
            while (it3.hasNext()) {
                Object next4 = it3.next();
                UserJid userJid = ((C63372sx) next4).A0A;
                C18070vi.A0X(userJid);
                A01(userJid, next4, A134);
            }
            List A003 = C147027Rn.A00(A134, 39);
            ArrayList A0D2 = C29351c6.A0D(A003);
            Iterator it4 = A003.iterator();
            while (it4.hasNext()) {
                C108985cd.A1N(A0D2, it4);
            }
            list = A0D2;
        }
        A03(list, A13, i9);
        int i10 = this.A08;
        if (i10 == 0) {
            list2 = C18460wS.A00;
        } else {
            ArrayList A093 = ((C24661Le) this.A0I.get()).A09();
            ArrayList A135 = AnonymousClass000.A13();
            Iterator it5 = A093.iterator();
            while (it5.hasNext()) {
                Object next5 = it5.next();
                UserJid userJid2 = ((C63372sx) next5).A0A;
                C18070vi.A0X(userJid2);
                A01(userJid2, next5, A135);
            }
            List A004 = C147027Rn.A00(A135, 38);
            ArrayList A0D3 = C29351c6.A0D(A004);
            Iterator it6 = A004.iterator();
            while (it6.hasNext()) {
                C108985cd.A1N(A0D3, it6);
            }
            list2 = A0D3;
        }
        A03(list2, A13, i10);
        int i11 = this.A0A;
        if (i11 == 0) {
            list3 = C18460wS.A00;
        } else {
            ArrayList A094 = ((C24661Le) this.A0I.get()).A09();
            ArrayList A136 = AnonymousClass000.A13();
            Iterator it7 = A094.iterator();
            while (it7.hasNext()) {
                Object next6 = it7.next();
                UserJid userJid3 = ((C63372sx) next6).A0A;
                C18070vi.A0X(userJid3);
                A01(userJid3, next6, A136);
            }
            List A0u = C29431cG.A0u(A136);
            Collections.shuffle(A0u);
            ArrayList A0D4 = C29351c6.A0D(A0u);
            Iterator it8 = A0u.iterator();
            while (it8.hasNext()) {
                C108985cd.A1N(A0D4, it8);
            }
            list3 = A0D4;
        }
        A03(list3, A13, i11);
        LinkedHashMap A137 = C17880vN.A13();
        LinkedHashMap A138 = C17880vN.A13();
        LinkedHashMap A139 = C17880vN.A13();
        LinkedHashMap A1310 = C17880vN.A13();
        A02(A062, A138, this.A07);
        A02(A012, A139, this.A05);
        int i12 = this.A06;
        if (i12 != 0) {
            Set keySet2 = AnonymousClass1Nb.A05((AnonymousClass1Nb) this.A0D.get(), true).keySet();
            C18070vi.A0b(keySet2);
            ArrayList A1311 = AnonymousClass000.A13();
            for (Object next7 : keySet2) {
                AnonymousClass1BI r1 = (AnonymousClass1BI) next7;
                C18070vi.A0d(r1, 0);
                if (A05(r1) || C22971Dz.A0e(r1)) {
                    A1311.add(next7);
                }
            }
            int i13 = this.A0C;
            int size3 = A1311.size();
            if (size3 > i13) {
                size3 = i13;
            }
            int i14 = (i13 - size3) + 1;
            for (Object next8 : A1311) {
                if ((next8 instanceof GroupJid) && next8 != null) {
                    C17880vN.A1P(next8, A1310, C72463Mc.A0B(C108945cZ.A1D(next8, A1310)) + (i12 * i14));
                }
            }
        }
        A04(A138, A137, A13);
        A04(A139, A137, A13);
        A04(A1310, A137, A13);
        Iterator A15 = AnonymousClass000.A15(A137);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            Object key = A16.getKey();
            C17880vN.A1P(key, A13, C72463Mc.A0B(C108945cZ.A1D(key, A13)) + AnonymousClass000.A0M(A16.getValue()));
        }
        return A13;
    }

    public static void A01(AnonymousClass1BI r0, Object obj, AbstractCollection abstractCollection) {
        if (A05(r0)) {
            abstractCollection.add(obj);
        }
    }

    public final List A06(List list) {
        ArrayList A0D2 = C29351c6.A0D(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C63372sx A062 = ((C63372sx) it.next()).A06();
            AnonymousClass206 A032 = ((AnonymousClass1TG) this.A0O.get()).A03(A062.A0A);
            if (A032 != null) {
                A062.A0C(A032);
            }
            A0D2.add(A062);
        }
        return A0D2;
    }
}
