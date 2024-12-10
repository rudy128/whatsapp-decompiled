package X;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class A71 {
    public static final List A02;
    public final AnonymousClass1KB A00;
    public final AnonymousClass00H A01;

    public static final HashMap A01(A71 a71, C29621ca r9) {
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2 = null;
        AnonymousClass1MD[] A0S = r9.A0S();
        if (A0S != null) {
            linkedHashMap = new LinkedHashMap(AnonymousClass8BX.A00(r3));
            for (AnonymousClass1MD r0 : A0S) {
                linkedHashMap.put(r0.A02, r0.A03);
            }
        } else {
            linkedHashMap = null;
        }
        C29621ca[] r4 = r9.A02;
        if (r4 != null) {
            linkedHashMap2 = new LinkedHashMap(AnonymousClass8BX.A00(r3));
            for (C29621ca r02 : r4) {
                linkedHashMap2.put(r02.A00, A01(a71, r02));
            }
        }
        AnonymousClass1D6[] r42 = new AnonymousClass1D6[2];
        AnonymousClass1D6.A03("properties", C196539vE.A01(linkedHashMap), r42, 0);
        HashMap A11 = C17880vN.A11();
        if (linkedHashMap2 != null) {
            Iterator A15 = AnonymousClass000.A15(linkedHashMap2);
            while (A15.hasNext()) {
                C108985cd.A1R(A11, AnonymousClass000.A16(A15));
            }
        }
        C108985cd.A1G("children", A11, r42);
        LinkedHashMap A0B = AnonymousClass1D7.A0B(r42);
        HashMap A112 = C17880vN.A11();
        Iterator A152 = AnonymousClass000.A15(A0B);
        while (A152.hasNext()) {
            C108985cd.A1R(A112, AnonymousClass000.A16(A152));
        }
        return A112;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0041, code lost:
        if (r1 != null) goto L_0x0023;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C29621ca A00(X.A71 r5, X.C184699bN r6, java.lang.String r7, java.util.Map r8) {
        /*
            java.lang.String r0 = "properties"
            java.util.Map r1 = X.AnonymousClass8BS.A0u(r0, r8)
            java.lang.String r0 = "children"
            java.util.Map r4 = X.AnonymousClass8BS.A0u(r0, r8)
            java.lang.String r0 = "accept_pay"
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0041
            if (r1 == 0) goto L_0x0044
            java.lang.String r0 = "merchant"
            boolean r0 = r1.containsKey(r0)
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = "merchant-fees"
            r1.containsKey(r0)
        L_0x0023:
            java.util.ArrayList r3 = X.C72453Mb.A11(r1)
            java.util.Iterator r2 = X.AnonymousClass000.A15(r1)
        L_0x002b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0045
            java.util.Map$Entry r0 = X.AnonymousClass000.A16(r2)
            java.lang.String r1 = X.C17880vN.A0x(r0)
            java.lang.String r0 = X.AnonymousClass8BR.A10(r0)
            X.C17890vO.A11(r1, r0, r3)
            goto L_0x002b
        L_0x0041:
            if (r1 == 0) goto L_0x0044
            goto L_0x0023
        L_0x0044:
            r3 = 0
        L_0x0045:
            r2 = 0
            if (r3 == 0) goto L_0x0052
            X.1MD[] r0 = new X.AnonymousClass1MD[r2]
            java.lang.Object[] r1 = r3.toArray(r0)
            X.1MD[] r1 = (X.AnonymousClass1MD[]) r1
            if (r1 != 0) goto L_0x0054
        L_0x0052:
            X.1MD[] r1 = new X.AnonymousClass1MD[r2]
        L_0x0054:
            X.1ca[] r0 = r5.A02(r6, r4)
            X.1ca r0 = X.AnonymousClass8BR.A0l(r7, r1, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.A71.A00(X.A71, X.9bN, java.lang.String, java.util.Map):X.1ca");
    }

    private final C29621ca[] A02(C184699bN r5, Map map) {
        ArrayList arrayList;
        C29621ca[] A1Y;
        if (map != null) {
            arrayList = C72453Mb.A11(map);
            Iterator A15 = AnonymousClass000.A15(map);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                arrayList.add(A00(this, r5, C17880vN.A0x(A16), (Map) A16.getValue()));
            }
        } else {
            arrayList = null;
        }
        if (arrayList == null || (A1Y = C17890vO.A1Y(arrayList, 0)) == null) {
            return new C29621ca[0];
        }
        return A1Y;
    }

    static {
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "urn:xmpp:whatsapp:account";
        A02 = C18070vi.A0O("w:pay", A1Z, 1);
    }

    public A71(AnonymousClass1KB r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
