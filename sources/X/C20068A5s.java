package X;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: X.A5s  reason: case insensitive filesystem */
public abstract class C20068A5s {
    public static final String[] A00 = new String[0];

    public static String[] A01(AnonymousClass1BI r4, AnonymousClass205 r5, String[] strArr) {
        String str;
        String[] strArr2 = new String[5];
        strArr2[0] = strArr[0];
        AnonymousClass1BI r0 = r5.A00;
        C17960vV.A07(r0);
        C17880vN.A1J(r0, strArr2, 1);
        strArr2[2] = r5.A01;
        strArr2[3] = AnonymousClass8BS.A0b(r5.A02 ? 1 : 0);
        if (r4 != null) {
            str = r4.getRawString();
        } else {
            str = "0";
        }
        strArr2[4] = str;
        return strArr2;
    }

    public static Boolean A00(String str) {
        boolean z;
        if ("1".equals(str)) {
            z = true;
        } else if (!"0".equals(str)) {
            return null;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public static String[] A02(Collection collection) {
        LinkedHashSet A14 = C17880vN.A14();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            A14.add(((C20126A8l) it.next()).A0A());
        }
        return (String[]) A14.toArray(A00);
    }
}
