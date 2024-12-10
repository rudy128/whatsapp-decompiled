package X;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@Deprecated
/* renamed from: X.ChH  reason: case insensitive filesystem */
public class C25519ChH {
    public final Map A00 = C17880vN.A11();
    public final Map A01;

    public static void A00(C27581Wq r5, AnonymousClass1F9 r6, Object obj, List list) {
        Method method;
        Object[] objArr;
        if (list != null) {
            int size = list.size();
            while (true) {
                size--;
                if (size >= 0) {
                    CY9 cy9 = (CY9) list.get(size);
                    try {
                        int i = cy9.A00;
                        if (i == 0) {
                            method = cy9.A01;
                            objArr = new Object[0];
                        } else if (i != 1) {
                            method = cy9.A01;
                            objArr = C108945cZ.A1a(r6, r5, 2, 1);
                        } else {
                            method = cy9.A01;
                            objArr = new Object[]{r6};
                        }
                        method.invoke(obj, objArr);
                    } catch (InvocationTargetException e) {
                        throw BE6.A0o("Failed to call observer method", e.getCause());
                    } catch (IllegalAccessException e2) {
                        throw AnonymousClass8BR.A0x(e2);
                    }
                } else {
                    return;
                }
            }
        }
    }

    public C25519ChH(Map map) {
        this.A01 = map;
        Iterator A15 = AnonymousClass000.A15(map);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            Object value = A16.getValue();
            List A0t = AnonymousClass8BS.A0t(value, this.A00);
            if (A0t == null) {
                A0t = AnonymousClass000.A13();
                this.A00.put(value, A0t);
            }
            A0t.add(A16.getKey());
        }
    }
}
