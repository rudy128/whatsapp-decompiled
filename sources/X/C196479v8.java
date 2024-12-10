package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.9v8  reason: invalid class name and case insensitive filesystem */
public abstract class C196479v8 {
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: X.9rM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: X.9rM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: X.9rM} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: X.9rM} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final long A00(X.C20287AEv r8, java.util.List r9) {
        /*
            X.C18070vi.A0h(r8, r9)
            int r0 = X.C200510q.A00(r9)
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>(r0)
            java.util.Iterator r2 = r9.iterator()
        L_0x0010:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0025
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.9rM r0 = (X.C194209rM) r0
            X.AEv r0 = r0.A01
            java.lang.String r0 = r0.A0H
            r5.put(r0, r1)
            goto L_0x0010
        L_0x0025:
            java.lang.String r7 = r8.A0H
            java.lang.Object r1 = r5.get(r7)
            X.9rM r1 = (X.C194209rM) r1
            boolean r0 = r8.A03()
            r2 = 0
            if (r0 != 0) goto L_0x003a
            if (r1 == 0) goto L_0x0039
            long r2 = r1.A00
        L_0x0039:
            return r2
        L_0x003a:
            X.AE6 r0 = r8.A05
            r6 = 0
            if (r0 == 0) goto L_0x007a
            X.ADW r0 = r0.A00
            if (r0 == 0) goto L_0x007a
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x007a
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x007a
            X.AE6 r0 = r8.A05
            if (r0 == 0) goto L_0x0039
            X.ADW r0 = r0.A00
            if (r0 == 0) goto L_0x0039
            java.util.List r0 = r0.A00
            if (r0 == 0) goto L_0x0039
            java.util.Iterator r4 = r0.iterator()
        L_0x005d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0039
            java.lang.Object r0 = r4.next()
            X.ADo r0 = (X.C20256ADo) r0
            java.lang.String r0 = r0.A00
            java.lang.Object r0 = r5.get(r0)
            X.9rM r0 = (X.C194209rM) r0
            if (r0 == 0) goto L_0x0077
            long r0 = r0.A00
        L_0x0075:
            long r2 = r2 + r0
            goto L_0x005d
        L_0x0077:
            r0 = 0
            goto L_0x0075
        L_0x007a:
            if (r1 != 0) goto L_0x00b9
            java.util.Iterator r4 = r9.iterator()
        L_0x0080:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0096
            java.lang.Object r1 = r4.next()
            r0 = r1
            X.9rM r0 = (X.C194209rM) r0
            java.util.Set r0 = r0.A02
            boolean r0 = r0.contains(r7)
            if (r0 == 0) goto L_0x0080
            r6 = r1
        L_0x0096:
            X.9rM r6 = (X.C194209rM) r6
            if (r6 == 0) goto L_0x0039
        L_0x009a:
            java.util.Set r0 = r6.A02
            java.util.Iterator r4 = r0.iterator()
        L_0x00a0:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0039
            java.lang.Object r0 = r4.next()
            java.lang.Object r0 = r5.get(r0)
            X.9rM r0 = (X.C194209rM) r0
            if (r0 == 0) goto L_0x00b6
            long r0 = r0.A00
        L_0x00b4:
            long r2 = r2 + r0
            goto L_0x00a0
        L_0x00b6:
            r0 = 0
            goto L_0x00b4
        L_0x00b9:
            r6 = r1
            goto L_0x009a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C196479v8.A00(X.AEv, java.util.List):long");
    }

    public static final void A01(C189889k1 r1, A8S a8s, Jid jid) {
        try {
            List list = (List) a8s.A08(jid).get();
            if (list == null || list.isEmpty()) {
                r1.A00(jid);
            }
        } catch (Exception e) {
            Log.e("CartUtil/cleanPromotionIfCartIsEmpty", e);
        }
    }
}
