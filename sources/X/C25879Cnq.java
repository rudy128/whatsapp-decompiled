package X;

import com.google.protobuf.CodedOutputStream;
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Cnq  reason: case insensitive filesystem */
public class C25879Cnq {
    public static int A00(Object obj, Object obj2, int i) {
        AbstractMap abstractMap = (AbstractMap) obj;
        CQE cqe = (CQE) obj2;
        int i2 = 0;
        if (!abstractMap.isEmpty()) {
            Iterator A0i = C17890vO.A0i(abstractMap);
            while (A0i.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A0i);
                Object key = A16.getKey();
                Object value = A16.getValue();
                int A05 = C25878Cnp.A05(i);
                C24952CRc cRc = cqe.A00;
                int A00 = C26201CuW.A00(cRc.A00, key, 1) + C26201CuW.A00(cRc.A01, value, 2);
                boolean z = CodedOutputStream.A01;
                i2 += A05 + BEB.A02(A00) + A00;
            }
        }
        return i2;
    }

    public static C27328Dbz A01(Object obj, Object obj2) {
        C27328Dbz dbz = (C27328Dbz) obj;
        AbstractMap abstractMap = (AbstractMap) obj2;
        if (!abstractMap.isEmpty()) {
            if (!dbz.isMutable) {
                dbz = dbz.A01();
            }
            if (!dbz.isMutable) {
                throw C17880vN.A0y();
            } else if (!abstractMap.isEmpty()) {
                dbz.putAll(abstractMap);
            }
        }
        return dbz;
    }
}
