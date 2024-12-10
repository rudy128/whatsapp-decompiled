package X;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.4aF  reason: invalid class name and case insensitive filesystem */
public final class C88624aF {
    public Map A00;
    public List A01;
    public Map A02;
    public final AnonymousClass118 A03;
    public final Set A04;

    private final void A01(C108635c2 r4) {
        String BWI;
        Map map = this.A00;
        if (map != null) {
            C108635c2 r0 = (C108635c2) map.get(r4.BTj());
            if (r0 != null && (BWI = r0.BWI()) != null && BWI.length() == 0) {
                Map map2 = this.A00;
                if (map2 != null) {
                    C108635c2 r2 = (C108635c2) map2.get(r4.BWD());
                    if (r2 != null) {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append(r4.BWI());
                        r4.CJs(AnonymousClass000.A0y(r2.BWI(), A10));
                        String BWI2 = r4.BWI();
                        if (BWI2.length() > 0) {
                            r4.CJs(AnonymousClass000.A0y(" > ", AnonymousClass000.A11(BWI2)));
                        }
                        StringBuilder A102 = AnonymousClass000.A10();
                        A102.append(r4.BWI());
                        r4.CJs(AnonymousClass000.A0y(r2.BXZ(), A102));
                        return;
                    }
                    return;
                }
            } else {
                return;
            }
        }
        C18070vi.A11("allSettingsMap");
        throw null;
    }

    public static final void A02(C88624aF r5, String str, String str2, List list) {
        Map map = r5.A02;
        if (map == null) {
            C18070vi.A11("groupedSettings");
            throw null;
        }
        List<C108635c2> list2 = (List) map.get(str2);
        if (list2 != null) {
            for (C108635c2 r3 : list2) {
                r5.A01(r3);
                if (!AnonymousClass1YF.A0Y(r3.BXZ(), str, true)) {
                    List BMb = r3.BMb();
                    if (!(BMb instanceof Collection) || !BMb.isEmpty()) {
                        Iterator it = BMb.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (AnonymousClass1YF.A0Y(C17880vN.A0v(it), str, true)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    A02(r5, str, r3.BTj(), list);
                } else {
                    list.add(r3);
                    r5.A03(r3.BTj(), list);
                }
            }
        }
    }

    private final void A03(String str, List list) {
        Map map = this.A02;
        if (map == null) {
            C18070vi.A11("groupedSettings");
            throw null;
        }
        List<C108635c2> list2 = (List) map.get(str);
        if (list2 != null) {
            for (C108635c2 r0 : list2) {
                A01(r0);
                list.add(r0);
                A03(r0.BTj(), list);
            }
        }
    }

    public final void A04() {
        Set set = this.A04;
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : set) {
            if (((C108635c2) next).Bh4()) {
                A13.add(next);
            }
        }
        this.A01 = A13;
        LinkedHashMap A132 = C17880vN.A13();
        for (Object next2 : A13) {
            ((List) C72473Md.A0h(((C108635c2) next2).BWD(), A132)).add(next2);
        }
        this.A02 = A132;
        List list = this.A01;
        if (list == null) {
            C18070vi.A11("filteredSettings");
            throw null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(C200510q.A00(list));
        for (Object next3 : list) {
            linkedHashMap.put(((C108635c2) next3).BTj(), next3);
        }
        this.A00 = linkedHashMap;
    }

    public C88624aF(AnonymousClass118 r1, Set set) {
        C18070vi.A0j(set, r1);
        this.A04 = set;
        this.A03 = r1;
    }

    public static final C108635c2 A00(C108635c2 r2, C88624aF r3) {
        while (!C18070vi.A18(r2.BWD(), "")) {
            Map map = r3.A00;
            if (map != null) {
                C108635c2 r0 = (C108635c2) map.get(r2.BWD());
                if (r0 == null) {
                    break;
                }
                r2 = r0;
            } else {
                C18070vi.A11("allSettingsMap");
                throw null;
            }
        }
        return r2;
    }
}
