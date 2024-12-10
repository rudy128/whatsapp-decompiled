package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7Eg  reason: invalid class name and case insensitive filesystem */
public final class C143657Eg implements C1605388w {
    public final C24921Me A00;
    public final C132336mc A01;
    public final List A02;

    public boolean BLC(AnonymousClass1BI r11) {
        long j;
        C18070vi.A0d(r11, 0);
        C132336mc r8 = this.A01;
        Map map = r8.A01;
        Map map2 = map;
        if (map == null) {
            synchronized (r8) {
                Map map3 = r8.A01;
                LinkedHashMap linkedHashMap = map3;
                if (map3 == null) {
                    List A002 = r8.A00();
                    ArrayList A13 = AnonymousClass000.A13();
                    for (Object next : A002) {
                        if (((AnonymousClass1E7) next).A0J != null) {
                            A13.add(next);
                        }
                    }
                    LinkedHashMap A132 = C17880vN.A13();
                    Iterator it = A13.iterator();
                    while (it.hasNext()) {
                        AnonymousClass1E7 A0O = C17880vN.A0O(it);
                        AnonymousClass1BI r5 = A0O.A0J;
                        if (r5 != null) {
                            AnonymousClass1E7 r0 = (AnonymousClass1E7) A132.get(r5);
                            if (r0 != null) {
                                j = r0.A0C;
                            } else {
                                j = 0;
                            }
                            if (j < A0O.A0C) {
                                A132.put(r5, A0O);
                            }
                        }
                    }
                    linkedHashMap = A132;
                }
                r8.A01 = linkedHashMap;
                map2 = linkedHashMap;
            }
        }
        AnonymousClass1E7 r2 = (AnonymousClass1E7) map2.get(r11);
        if (r2 == null || !this.A00.A0l(r2, this.A02)) {
            return false;
        }
        return true;
    }

    public C143657Eg(C24921Me r1, C132336mc r2, List list) {
        this.A02 = list;
        this.A00 = r1;
        this.A01 = r2;
    }

    public /* synthetic */ Set BYj() {
        return C25511Om.A00;
    }
}
