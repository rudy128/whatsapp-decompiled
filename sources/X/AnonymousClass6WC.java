package X;

import java.util.List;

/* renamed from: X.6WC  reason: invalid class name */
public abstract class AnonymousClass6WC {
    public static void A00(List list, List list2, int i) {
        Object obj;
        float size;
        list2.clear();
        if (i == list.size()) {
            list2.addAll(list);
        } else if (i == 0) {
        } else {
            if (list.isEmpty()) {
                for (int i2 = 0; i2 < i; i2++) {
                    list2.add(Float.valueOf(0.0f));
                }
                return;
            }
            int size2 = list.size();
            boolean isEmpty = list2.isEmpty();
            if (i > size2) {
                C17960vV.A0C(isEmpty);
                if (list.size() == 1) {
                    size = 0.0f;
                } else {
                    size = 1.0f / (((((float) (i - list.size())) * 1.0f) / ((float) AnonymousClass3MX.A02(list, 1))) + 1.0f);
                }
                for (int i3 = 0; i3 < i - 1; i3++) {
                    float f = ((float) i3) * size;
                    double d = (double) f;
                    int floor = (int) Math.floor(d);
                    int ceil = (int) Math.ceil(d);
                    float A04 = AnonymousClass000.A04(list.get(floor));
                    list2.add(Float.valueOf(A04 + ((AnonymousClass000.A04(list.get(ceil)) - A04) * (f - ((float) floor)))));
                }
                if (i >= 2) {
                    obj = list.get(AnonymousClass3MX.A02(list, 1));
                } else {
                    return;
                }
            } else {
                C17960vV.A0C(isEmpty);
                float size3 = (((float) i) * 1.0f) / ((float) list.size());
                int i4 = 0;
                float f2 = 0.0f;
                float f3 = 0.0f;
                for (Object A042 : list) {
                    f2 += AnonymousClass000.A04(A042);
                    i4++;
                    f3 += size3;
                    if (f3 >= 1.0f) {
                        list2.add(Float.valueOf(f2 / ((float) i4)));
                        f3 -= 1.0f;
                        i4 = 0;
                        f2 = 0.0f;
                    }
                }
                if (i4 > 0) {
                    obj = Float.valueOf(f2 / ((float) i4));
                } else {
                    return;
                }
            }
            list2.add(obj);
        }
    }
}
