package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.163  reason: invalid class name */
public abstract class AnonymousClass163 {
    public Map A00;
    public final Map A01 = new HashMap();

    public final Object A00() {
        Map map = this.A00;
        if (map == null || map.isEmpty()) {
            return null;
        }
        return A01((Object) null, this.A00);
    }

    public Object A01(Object obj, Map map) {
        ArrayList arrayList;
        if (this instanceof AnonymousClass2JH) {
            C18070vi.A0d(map, 0);
            arrayList = new ArrayList(map.size());
            for (Map.Entry value : map.entrySet()) {
                arrayList.add(value.getValue().toString());
            }
        } else if (this instanceof AnonymousClass2JG) {
            C18070vi.A0d(map, 0);
            arrayList = new ArrayList(map.size());
            for (Map.Entry value2 : map.entrySet()) {
                arrayList.add(value2.getValue().toString());
            }
        } else if (this instanceof AnonymousClass16V) {
            C18070vi.A0d(map, 0);
            int i = 4;
            if (!map.containsKey(2498024)) {
                i = 3;
                if (!map.containsKey(2498023)) {
                    if (!map.containsKey(2498022)) {
                        return null;
                    }
                    i = 2;
                }
            }
            return Integer.valueOf(i);
        } else if ((this instanceof AnonymousClass164) || (this instanceof AnonymousClass2JF) || (this instanceof AnonymousClass2JE) || (this instanceof AnonymousClass2JD)) {
            return null;
        } else {
            if (this instanceof AnonymousClass2JC) {
                C18070vi.A0d(map, 0);
                arrayList = new ArrayList(map.size());
                for (Map.Entry value3 : map.entrySet()) {
                    arrayList.add(value3.getValue().toString());
                }
            } else if (this instanceof AnonymousClass2JB) {
                C18070vi.A0d(map, 0);
                arrayList = new ArrayList(map.size());
                for (Map.Entry value4 : map.entrySet()) {
                    arrayList.add(value4.getValue().toString());
                }
            } else if (this instanceof AnonymousClass2JA) {
                C18070vi.A0d(map, 0);
                arrayList = new ArrayList(map.size());
                for (Map.Entry value5 : map.entrySet()) {
                    arrayList.add(value5.getValue().toString());
                }
            } else if (this instanceof AnonymousClass2J9) {
                C18070vi.A0d(map, 0);
                arrayList = new ArrayList(map.size());
                for (Map.Entry value6 : map.entrySet()) {
                    arrayList.add(value6.getValue().toString());
                }
            } else if (this instanceof AnonymousClass2J8) {
                C18070vi.A0d(map, 0);
                arrayList = new ArrayList(map.size());
                for (Map.Entry value7 : map.entrySet()) {
                    arrayList.add(value7.getValue().toString());
                }
            } else if (this instanceof AnonymousClass2J7) {
                C18070vi.A0d(map, 0);
                arrayList = new ArrayList(map.size());
                for (Map.Entry value8 : map.entrySet()) {
                    arrayList.add(value8.getValue().toString());
                }
            } else if (this instanceof AnonymousClass2J6) {
                C18070vi.A0d(map, 0);
                arrayList = new ArrayList(map.size());
                for (Map.Entry value9 : map.entrySet()) {
                    arrayList.add(value9.getValue().toString());
                }
            } else if (this instanceof AnonymousClass2J5) {
                return null;
            } else {
                if (this instanceof AnonymousClass2J4) {
                    return 1;
                }
                if (this instanceof AnonymousClass17I) {
                    return ((AnonymousClass17I) this).A03((C187029f9) obj, map);
                }
                return null;
            }
        }
        return C29431cG.A0g("\n", "", "", arrayList, (C22821Di) null);
    }

    public Object A02(Object obj, Map map) {
        if (!(this instanceof AnonymousClass17I)) {
            return null;
        }
        C187029f9 r4 = (C187029f9) obj;
        if (!map.containsKey(190)) {
            return null;
        }
        r4.A00 = 8;
        return ((C1404571m) map.get(190)).A05;
    }
}
