package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* renamed from: X.2s5  reason: invalid class name and case insensitive filesystem */
public abstract class C62842s5 {
    public static boolean A02(AnonymousClass206 r3) {
        int i;
        if (r3.A0v.A02) {
            return false;
        }
        if (!(r3.A09 == 1 || (i = r3.A0u) == 81 || AnonymousClass25A.A0I(i) || i == 78 || i == 82)) {
            if (i != 2) {
                return false;
            }
            if (!r3.A0w() && AnonymousClass9RY.A00(r3) == null) {
                return false;
            }
        }
        int A0D = r3.A0D();
        if (A0D == 9 || A0D == 10) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: java.lang.Long[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: java.lang.String[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.util.HashSet A00(java.util.HashMap r8) {
        /*
            java.util.HashSet r7 = X.C17880vN.A12()
            java.util.Iterator r8 = X.C17890vO.A0i(r8)
        L_0x0008:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x005d
            java.util.Map$Entry r1 = X.AnonymousClass000.A16(r8)
            java.lang.Object r0 = r1.getKey()
            X.2kt r0 = (X.C58562kt) r0
            X.1BI r6 = r0.A00
            java.lang.Object r0 = r1.getKey()
            X.2kt r0 = (X.C58562kt) r0
            X.1BI r5 = r0.A01
            java.lang.Object r4 = r1.getValue()
            java.util.List r4 = (java.util.List) r4
            int r0 = r4.size()
            java.lang.Long[] r3 = new java.lang.Long[r0]
            int r0 = r4.size()
            java.lang.String[] r2 = new java.lang.String[r0]
            r1 = 0
        L_0x0035:
            int r0 = r4.size()
            if (r1 >= r0) goto L_0x0052
            java.lang.Object r0 = r4.get(r1)
            X.2kk r0 = (X.C58472kk) r0
            java.lang.Object r0 = r0.A00
            r3[r1] = r0
            java.lang.Object r0 = r4.get(r1)
            X.2kk r0 = (X.C58472kk) r0
            java.lang.Object r0 = r0.A01
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x0035
        L_0x0052:
            if (r6 == 0) goto L_0x0008
            X.2jU r0 = new X.2jU
            r0.<init>(r6, r5, r3, r2)
            r7.add(r0)
            goto L_0x0008
        L_0x005d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C62842s5.A00(java.util.HashMap):java.util.HashSet");
    }

    public static HashSet A01(Set set) {
        HashMap A11 = C17880vN.A11();
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C57692jU r6 = (C57692jU) it.next();
            int i = 0;
            C58562kt r4 = new C58562kt(r6.A01, r6.A00, false);
            ArrayList A13 = AnonymousClass000.A13();
            while (true) {
                Long[] lArr = r6.A02;
                if (i >= lArr.length) {
                    break;
                }
                A13.add(new C58472kk(lArr[i], r6.A03[i]));
                i++;
            }
            if (A11.containsKey(r4)) {
                List list = (List) A11.get(r4);
                list.getClass();
                list.addAll(A13);
            } else {
                A11.put(r4, A13);
            }
        }
        return A00(A11);
    }
}
