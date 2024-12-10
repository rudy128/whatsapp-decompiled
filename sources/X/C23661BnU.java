package X;

import com.google.protobuf.UnsafeUtil;
import java.util.AbstractList;
import java.util.List;

/* renamed from: X.BnU  reason: case insensitive filesystem */
public final class C23661BnU extends C25037CUq {
    public static final Class A00 = BE9.A0f();

    public static List A00(Object obj, long j, int i) {
        AbstractList bm8;
        List list = (List) C25856CnK.A00(obj, j);
        if (list.isEmpty()) {
            if (list instanceof EE5) {
                EE5 ee5 = C23578Bm8.A01;
                list = new C23578Bm8(C17880vN.A0z(i));
            } else if (!(list instanceof C28460E2b) || !(list instanceof EE9)) {
                list = C17880vN.A0z(i);
            } else {
                list = ((EE9) list).Bk8(i);
            }
            UnsafeUtil.A05(obj, j, list);
        } else {
            if (BE7.A1W(A00, list)) {
                bm8 = BE9.A0y(list, i);
            } else if (list instanceof C27297DbS) {
                EE5 ee52 = C23578Bm8.A01;
                bm8 = new C23578Bm8(BE9.A0y(list, i));
            } else if ((list instanceof C28460E2b) && (list instanceof EE9)) {
                EE9 ee9 = (EE9) list;
                if (!((C27296DbR) ee9).A00) {
                    EE9 Bk8 = ee9.Bk8(list.size() + i);
                    UnsafeUtil.A05(obj, j, Bk8);
                    return Bk8;
                }
            }
            bm8.addAll(list);
            UnsafeUtil.A05(obj, j, bm8);
            return bm8;
        }
        return list;
    }
}
