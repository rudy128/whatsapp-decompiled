package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* renamed from: X.DNr  reason: case insensitive filesystem */
public class C26969DNr implements C22415B6x {
    public final C22415B6x A00;

    public C26969DNr(C22415B6x b6x) {
        this.A00 = b6x;
    }

    public Object BKe(C199029zJ r9, C25681CkC ckC, String str) {
        int i = 0;
        switch (str.hashCode()) {
            case -1882328740:
                if (str.equals("bk.action.f32.Sqrt")) {
                    return C25343Ce2.A00(Math.sqrt(AnonymousClass8BR.A00(r9.A00(0))));
                }
                break;
            case -1666855539:
                if (str.equals("bk.action.string.ToUpperCase")) {
                    return AnonymousClass8BT.A0t(r9, 0).toUpperCase(Locale.ROOT);
                }
                break;
            case -1606945202:
                if (str.equals("bk.action.array.Reduce")) {
                    List list = r9.A00;
                    List list2 = (List) list.get(0);
                    C25488Cgj cgj = (C25488Cgj) r9.A00(1);
                    Object obj = list.get(2);
                    if (list2 != null) {
                        int i2 = 0;
                        while (i2 < list2.size()) {
                            C20046A4p A0Q = BE7.A0Q(obj);
                            A0Q.A03(list2.get(i2), 1);
                            try {
                                obj = CCJ.A00(BE7.A0R(A0Q, Integer.valueOf(i2), 2), cgj.A00, ckC);
                                i2++;
                            } catch (C27230Da9 e) {
                                throw AnonymousClass8BR.A0x(e);
                            }
                        }
                    }
                    return obj;
                }
                break;
            case -1225336055:
                if (str.equals("bk.action.string.Contains")) {
                    return Boolean.valueOf(((String) r9.A00(0)).contains((String) r9.A00(1)));
                }
                break;
            case -965327084:
                if (str.equals("bk.action.string.Join")) {
                    List list3 = r9.A00;
                    String A0w = C17880vN.A0w(list3, 0);
                    list3.get(1);
                    List list4 = (List) list3.get(1);
                    if (A0w != null) {
                        StringBuilder A10 = AnonymousClass000.A10();
                        while (i < list4.size()) {
                            String A0w2 = C17880vN.A0w(list4, i);
                            if (A0w2 != null) {
                                A10.append(A0w2);
                                if (i < AnonymousClass3MX.A02(list4, 1)) {
                                    A10.append(A0w);
                                }
                                i++;
                            } else {
                                throw AnonymousClass000.A0k("element must not be null");
                            }
                        }
                        return A10.toString();
                    }
                    throw AnonymousClass000.A0k("delimeter must not be null");
                }
                break;
            case -240276909:
                if (str.equals("bk.action.map.Merge")) {
                    HashMap A11 = C17880vN.A11();
                    while (true) {
                        List list5 = r9.A00;
                        if (i >= list5.size()) {
                            return A11;
                        }
                        Map map = (Map) list5.get(i);
                        if (map != null) {
                            A11.putAll(map);
                        }
                        i++;
                    }
                }
                break;
            case 944474301:
                if (str.equals("bk.action.map.Filter")) {
                    C25488Cgj cgj2 = (C25488Cgj) r9.A00(1);
                    HashMap A112 = C17880vN.A11();
                    Iterator A15 = AnonymousClass000.A15((Map) r9.A00(0));
                    while (A15.hasNext()) {
                        Map.Entry A16 = AnonymousClass000.A16(A15);
                        C20046A4p a4p = new C20046A4p();
                        a4p.A03(A16.getKey(), 0);
                        try {
                            if (C25343Ce2.A01(CCJ.A00(BE7.A0R(a4p, A16.getValue(), 1), cgj2.A00, ckC))) {
                                C108985cd.A1R(A112, A16);
                            }
                        } catch (C27230Da9 e2) {
                            throw AnonymousClass8BR.A0x(e2);
                        }
                    }
                    return A112;
                }
                break;
            case 975567453:
                if (str.equals("bk.action.string.ValueOfNumberInBase")) {
                    long A05 = C17880vN.A05(r9.A00(0));
                    long A0M = (long) AnonymousClass000.A0M(r9.A00(1));
                    if (A0M >= 2 && A0M <= 36) {
                        return Long.toString(A05, (int) A0M);
                    }
                    throw AnonymousClass000.A0k("radix parameter of string.ValueOfNumberInBase must be between 2 and 36");
                }
                break;
            case 1377663097:
                if (str.equals("bk.action.map.Keys")) {
                    return C17880vN.A10(((Map) r9.A00(0)).keySet());
                }
                break;
            case 1395153511:
                if (str.equals("bk.action.map.Values")) {
                    return C17880vN.A10(((Map) r9.A00(0)).values());
                }
                break;
            case 1740388232:
                if (str.equals("bk.action.f32.Log")) {
                    return C25343Ce2.A00(Math.log(AnonymousClass8BR.A00(r9.A00(0))));
                }
                break;
            case 1740392092:
                if (str.equals("bk.action.f32.Pow")) {
                    return C25343Ce2.A00(Math.pow(AnonymousClass8BR.A00(r9.A00(0)), AnonymousClass8BR.A00(r9.A00(1))));
                }
                break;
            case 1867263777:
                if (str.equals("bk.action.string.StartsWith")) {
                    List list6 = r9.A00;
                    return Boolean.valueOf(C17880vN.A0w(list6, 0).startsWith(C17880vN.A0w(list6, 1)));
                }
                break;
            case 1890080876:
                if (str.equals("bk.action.string.ToLowerCase")) {
                    return AnonymousClass8BT.A0t(r9, 0).toLowerCase(Locale.ROOT);
                }
                break;
        }
        C22415B6x b6x = this.A00;
        if (b6x != null) {
            return b6x.BKe(r9, ckC, str);
        }
        throw new C21583AmX(AnonymousClass001.A1H("unknown function ", str, AnonymousClass000.A10()));
    }
}
