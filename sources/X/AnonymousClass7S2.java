package X;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;

/* renamed from: X.7S2  reason: invalid class name */
public class AnonymousClass7S2 implements C18080vj, C18090vk {
    public final int A00;

    public AnonymousClass7S2(int i) {
        this.A00 = i;
    }

    public static C18110vm A01(int i) {
        return AnonymousClass1DF.A01(new AnonymousClass7S2(i));
    }

    public final Object invoke() {
        AnonymousClass1D6[] r3;
        Double d;
        double d2;
        switch (this.A00) {
            case 2:
                C135296ry[] r4 = new C135296ry[6];
                r4[0] = new C135296ry(0, 2131890404, (String) null);
                r4[1] = new C135296ry(1, 2131890405, "filter_pop.png");
                r4[2] = new C135296ry(2, 2131890400, "filter_bw.png");
                r4[3] = new C135296ry(3, 2131890402, "filter_cool.png");
                r4[4] = new C135296ry(4, 2131890401, "filter_chrome.png");
                return C18070vi.A0O(new C135296ry(5, 2131890403, "filter_film.png"), r4, 5);
            case 3:
                List A11 = AnonymousClass3MW.A11(C137726vv.A00);
                LinkedHashMap linkedHashMap = new LinkedHashMap(C200510q.A00(A11));
                for (Object next : A11) {
                    linkedHashMap.put(((C135296ry) next).A02, next);
                }
                return linkedHashMap;
            case 4:
            case 5:
                return C17880vN.A13();
            case 7:
                r3 = new AnonymousClass1D6[11];
                C72463Mc.A1H(Double.valueOf(0.0d), Double.valueOf(112.0d), r3);
                C108985cd.A1G(Double.valueOf(0.1d), Double.valueOf(128.0d), r3);
                C72463Mc.A1I(Double.valueOf(0.2d), Double.valueOf(144.0d), r3);
                C72463Mc.A1J(Double.valueOf(0.3d), Double.valueOf(161.0d), r3);
                r3[4] = A00(Double.valueOf(0.4d), 209.0d);
                r3[5] = A00(Double.valueOf(0.5d), 319.0d);
                r3[6] = A00(Double.valueOf(0.6d), 435.0d);
                r3[7] = A00(Double.valueOf(0.7d), 677.0d);
                r3[8] = A00(Double.valueOf(0.8d), 935.0d);
                r3[9] = A00(Double.valueOf(0.9d), 1631.0d);
                d = Double.valueOf(1.0d);
                d2 = 16383.0d;
                break;
            case 8:
                r3 = new AnonymousClass1D6[11];
                C72463Mc.A1H(Double.valueOf(0.0d), Double.valueOf(27.0d), r3);
                C108985cd.A1G(Double.valueOf(0.1d), Double.valueOf(31.0d), r3);
                C72463Mc.A1I(Double.valueOf(0.2d), Double.valueOf(33.0d), r3);
                Double valueOf = Double.valueOf(0.3d);
                Double valueOf2 = Double.valueOf(37.0d);
                C72463Mc.A1J(valueOf, valueOf2, r3);
                r3[4] = AnonymousClass1D6.A01(Double.valueOf(0.4d), valueOf2);
                r3[5] = A00(Double.valueOf(0.5d), 38.0d);
                r3[6] = A00(Double.valueOf(0.6d), 42.0d);
                r3[7] = A00(Double.valueOf(0.7d), 47.0d);
                r3[8] = A00(Double.valueOf(0.8d), 48.0d);
                r3[9] = A00(Double.valueOf(0.9d), 50.0d);
                d = Double.valueOf(1.0d);
                d2 = 85.0d;
                break;
            case 9:
                return AnonymousClass000.A0i();
            default:
                return C17890vO.A0D();
        }
        r3[10] = A00(d, d2);
        TreeMap treeMap = new TreeMap();
        AnonymousClass1D7.A0K(treeMap, r3);
        return new C126376cd(treeMap);
    }

    public static AnonymousClass1D6 A00(Object obj, double d) {
        return new AnonymousClass1D6(obj, Double.valueOf(d));
    }
}
