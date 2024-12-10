package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.2im  reason: invalid class name and case insensitive filesystem */
public final class C57252im {
    public List A00;
    public final AnonymousClass00H A01;

    public C57252im(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
    }

    public final List A00() {
        ArrayList arrayList;
        synchronized (this) {
            List list = this.A00;
            arrayList = list;
            if (list == null) {
                Set<C72443Lz> set = (Set) C18070vi.A0E(this.A01);
                LinkedHashMap A13 = C17880vN.A13();
                LinkedHashMap A132 = C17880vN.A13();
                LinkedHashMap A133 = C17880vN.A13();
                Iterator it = set.iterator();
                while (true) {
                    boolean z = false;
                    if (it.hasNext()) {
                        C72443Lz r1 = (C72443Lz) it.next();
                        AnonymousClass9IM Ba7 = r1.Ba7();
                        if (A13.get(Ba7) == null) {
                            A13.put(Ba7, r1);
                            C17880vN.A1P(Ba7, A133, 0);
                            A132.put(Ba7, C17880vN.A14());
                        } else {
                            throw AnonymousClass000.A0k(AnonymousClass001.A1E(Ba7, "Duplicate contributor tag: ", AnonymousClass000.A10()));
                        }
                    } else {
                        for (C72443Lz r11 : set) {
                            AnonymousClass9IM Ba72 = r11.Ba7();
                            Set set2 = (Set) A132.get(Ba72);
                            if (set2 != null) {
                                Set CGK = r11.CGK();
                                ArrayList A134 = AnonymousClass000.A13();
                                for (Object next : CGK) {
                                    if (A13.containsKey(next)) {
                                        A134.add(next);
                                    }
                                }
                                set2.addAll(A134);
                            }
                            for (Object obj : r11.CGJ()) {
                                Set set3 = (Set) A132.get(obj);
                                if (set3 != null) {
                                    set3.add(Ba72);
                                }
                            }
                        }
                        Iterator A0l = C17890vO.A0l(A132);
                        while (A0l.hasNext()) {
                            for (Object next2 : (Set) A0l.next()) {
                                Object obj2 = A133.get(next2);
                                C17960vV.A07(obj2);
                                C17880vN.A1P(next2, A133, AnonymousClass000.A0M(obj2) + 1);
                            }
                        }
                        LinkedList linkedList = new LinkedList();
                        Iterator A15 = AnonymousClass000.A15(A133);
                        while (A15.hasNext()) {
                            Map.Entry A16 = AnonymousClass000.A16(A15);
                            Object key = A16.getKey();
                            if (AnonymousClass000.A0M(A16.getValue()) == 0) {
                                linkedList.add(key);
                            }
                        }
                        ArrayList A135 = AnonymousClass000.A13();
                        while (AnonymousClass000.A1a(linkedList)) {
                            Object remove = linkedList.remove();
                            Object obj3 = A13.get(remove);
                            C17960vV.A07(obj3);
                            C18070vi.A0X(obj3);
                            A135.add(obj3);
                            Object obj4 = A132.get(remove);
                            C17960vV.A07(obj4);
                            for (Object next3 : (Set) obj4) {
                                Object obj5 = A133.get(next3);
                                C17960vV.A07(obj5);
                                C17880vN.A1P(next3, A133, AnonymousClass000.A0M(obj5) - 1);
                                Integer num = (Integer) A133.get(next3);
                                if (num != null && num.intValue() == 0) {
                                    linkedList.add(next3);
                                }
                            }
                        }
                        if (A135.size() == set.size()) {
                            z = true;
                        }
                        C17960vV.A0H(z, "The contributor graph is not created correctly");
                        this.A00 = A135;
                        arrayList = A135;
                    }
                }
            }
        }
        return arrayList;
    }
}
