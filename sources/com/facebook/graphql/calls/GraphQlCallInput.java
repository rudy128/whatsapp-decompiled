package com.facebook.graphql.calls;

import X.AnonymousClass000;
import X.AnonymousClass8BS;
import X.C108975cc;
import X.C162468Kw;
import X.C162478Kx;
import X.C17880vN;
import X.C189819ju;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public abstract class GraphQlCallInput {
    public static final C189819ju A02 = new C189819ju();
    public C162478Kx A00 = null;
    public C189819ju A01 = A02;

    private Object A00(Object obj) {
        ArrayList arrayList;
        String str;
        if (obj == null) {
            return null;
        }
        if (obj instanceof C162468Kw) {
            ArrayList arrayList2 = ((C162468Kw) obj).A00;
            if (arrayList2.size() > 0 && (AnonymousClass8BS.A0Y(arrayList2) instanceof C162478Kx)) {
                ArrayList A0g = C108975cc.A0g(arrayList2);
                for (int i = 0; i < arrayList2.size(); i++) {
                    if (arrayList2.get(i) != null) {
                        A0g.add(A00(arrayList2.get(i)));
                    }
                }
                arrayList = A0g;
            } else if (arrayList2.size() <= 0 || !(AnonymousClass8BS.A0Y(arrayList2) instanceof C162468Kw)) {
                ArrayList A0g2 = C108975cc.A0g(arrayList2);
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    Object obj2 = arrayList2.get(i2);
                    if (obj2 == null) {
                        str = null;
                        A0g2.add(str);
                    } else if (obj2 instanceof Number) {
                        A0g2.add(obj2);
                    } else {
                        str = obj2.toString();
                        A0g2.add(str);
                    }
                }
                arrayList = A0g2;
            } else {
                ArrayList A0g3 = C108975cc.A0g(arrayList2);
                for (int i3 = 0; i3 < arrayList2.size(); i3++) {
                    if (arrayList2.get(i3) != null) {
                        A0g3.add(A00(arrayList2.get(i3)));
                    }
                }
                arrayList = A0g3;
            }
        } else {
            boolean z = obj instanceof C162478Kx;
            arrayList = obj;
            if (z) {
                TreeMap treeMap = new TreeMap();
                A01((C162478Kx) obj, this, treeMap);
                return treeMap;
            }
        }
        return arrayList;
    }

    public static void A01(C162478Kx r4, GraphQlCallInput graphQlCallInput, Map map) {
        if (r4 != null) {
            int i = 0;
            while (true) {
                int i2 = r4.A00;
                if (i >= i2) {
                    return;
                }
                if (i >= 0 && i < i2) {
                    ArrayList arrayList = r4.A01;
                    Object obj = arrayList.get(i * 2);
                    if (i < r4.A00) {
                        map.put(obj, graphQlCallInput.A00(arrayList.get((i * 2) + 1)));
                        i++;
                    } else {
                        throw new ArrayIndexOutOfBoundsException(i);
                    }
                }
            }
            throw new ArrayIndexOutOfBoundsException(i);
        }
    }

    public C162478Kx A02() {
        C162478Kx r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        C162478Kx A002 = this.A01.A00();
        this.A00 = A002;
        return A002;
    }

    public void A03(C162468Kw r5, List list) {
        if (list != null && !list.isEmpty()) {
            for (Object next : list) {
                if (next != null) {
                    if (next instanceof List) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            List list2 = (List) it.next();
                            C189819ju r1 = r5.A01;
                            C162468Kw r0 = (C162468Kw) r1.A00.BAf();
                            if (r0 == null) {
                                r0 = new C162468Kw();
                            }
                            r0.A05(r1);
                            r5.A06(r0);
                            A03(r0, list2);
                        }
                        return;
                    } else if (next instanceof String) {
                        for (Object A002 : list) {
                            C162468Kw.A00(r5, A002);
                        }
                        return;
                    } else if (next instanceof Boolean) {
                        for (Object A003 : list) {
                            C162468Kw.A00(r5, A003);
                        }
                        return;
                    } else if (next instanceof Number) {
                        for (Object A004 : list) {
                            C162468Kw.A00(r5, A004);
                        }
                        return;
                    } else if (next instanceof Enum) {
                        for (Object obj : list) {
                            C162468Kw.A00(r5, obj.toString());
                        }
                        return;
                    } else if (next instanceof GraphQlCallInput) {
                        Iterator it2 = list.iterator();
                        while (it2.hasNext()) {
                            r5.A06(((GraphQlCallInput) it2.next()).A02());
                        }
                        return;
                    } else if (next instanceof Map) {
                        Iterator it3 = list.iterator();
                        while (it3.hasNext()) {
                            C162478Kx A005 = r5.A01.A00();
                            r5.A06(A005);
                            A04(A005, (Map) it3.next());
                        }
                        return;
                    } else {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("List value type is not supported: ");
                        A10.append(next.getClass());
                        throw AnonymousClass000.A0j(A10);
                    }
                }
            }
        }
    }

    public void A04(C162478Kx r6, Map map) {
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            String A0x = C17880vN.A0x(A16);
            String value = A16.getValue();
            if (value != null) {
                if (value instanceof Boolean) {
                    value = AnonymousClass000.A1Y(value) ? "true" : "false";
                } else if (!(value instanceof Number) && !(value instanceof String)) {
                    if (value instanceof Enum) {
                        value = value.toString();
                    } else if (value instanceof GraphQlCallInput) {
                        r6.A06(((GraphQlCallInput) value).A02(), A0x);
                    } else if (value instanceof List) {
                        C189819ju r1 = r6.A01;
                        C162468Kw r0 = (C162468Kw) r1.A00.BAf();
                        if (r0 == null) {
                            r0 = new C162468Kw();
                        }
                        r0.A05(r1);
                        r6.A06(r0, A0x);
                        A03(r0, (List) value);
                    } else if (value instanceof Map) {
                        C162478Kx A002 = r6.A01.A00();
                        r6.A06(A002, A0x);
                        A04(A002, (Map) value);
                    } else {
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("Unexpected object value type ");
                        A10.append(value.getClass());
                        throw AnonymousClass000.A0j(A10);
                    }
                }
                C162478Kx.A01(r6, value, A0x);
            }
        }
    }

    public void A05(String str, String str2) {
        C162478Kx.A01(A02(), str2, str);
    }

    public void A06(String str, List list) {
        C162478Kx A022 = A02();
        C189819ju r1 = A022.A01;
        C162468Kw r0 = (C162468Kw) r1.A00.BAf();
        if (r0 == null) {
            r0 = new C162468Kw();
        }
        r0.A05(r1);
        A022.A06(r0, str);
        A03(r0, list);
    }
}
