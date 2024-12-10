package X;

import com.whatsapp.jid.UserJid;
import java.util.Map;

/* renamed from: X.9mB  reason: invalid class name and case insensitive filesystem */
public abstract class C191199mB {
    public final C187169fN A00;
    public final UserJid A01;
    public final Map A02;
    public final Map A03;

    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00cc, code lost:
        if (r3 != null) goto L_0x007f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A00() {
        /*
            r7 = this;
            java.util.Map r3 = r7.A03
            boolean r0 = r7 instanceof X.AnonymousClass9C8
            if (r0 == 0) goto L_0x00d1
            java.lang.String r1 = "product_ids"
        L_0x0008:
            java.lang.Object r2 = r3.get(r1)
            if (r2 != 0) goto L_0x0011
            X.0wS r3 = X.C18460wS.A00
        L_0x0010:
            return r3
        L_0x0011:
            boolean r0 = r2 instanceof java.lang.String
            if (r0 == 0) goto L_0x00c2
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r0 = "${data."
            r6 = 0
            boolean r0 = X.AnonymousClass1YE.A0A(r2, r0, r6)
            if (r0 == 0) goto L_0x00bd
            java.lang.String r0 = "}"
            X.C18070vi.A0d(r2, r6)
            r5 = 1
            boolean r0 = r2.endsWith(r0)
            if (r0 == 0) goto L_0x00bd
            int r1 = r2.length()
            int r1 = r1 - r5
            r0 = 7
            java.lang.String r0 = X.C108955ca.A0q(r0, r1, r2)
            java.lang.String r2 = X.AnonymousClass1YF.A0I(r0)
            java.lang.String[] r1 = new java.lang.String[r5]
            java.lang.String r0 = "."
            r1[r6] = r0
            java.util.List r4 = X.AnonymousClass1YF.A0S(r2, r1, r6)
            java.util.Map r1 = r7.A02
            java.lang.String r0 = "data"
            java.lang.Object r3 = r1.get(r0)
            boolean r0 = r3 instanceof java.util.Map
            if (r0 == 0) goto L_0x0054
            java.util.Map r3 = (java.util.Map) r3
            if (r3 != 0) goto L_0x0058
        L_0x0054:
            X.1CQ r3 = X.AnonymousClass1D7.A0I()
        L_0x0058:
            java.util.Iterator r2 = r4.iterator()
        L_0x005c:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x00ce
            int r1 = r6 + 1
            java.lang.Object r0 = r2.next()
            java.lang.Object r3 = r3.get(r0)
            if (r3 == 0) goto L_0x00ce
            int r0 = X.AnonymousClass3MX.A02(r4, r5)
            if (r6 != r0) goto L_0x00b3
            boolean r0 = r3 instanceof java.lang.String
            if (r0 == 0) goto L_0x00c6
            java.util.List r3 = java.util.Collections.singletonList(r3)
        L_0x007c:
            X.C18070vi.A0X(r3)
        L_0x007f:
            java.util.Map r1 = r7.A02
            java.lang.String r0 = "waba_id"
            java.lang.Object r5 = r1.get(r0)
            if (r5 == 0) goto L_0x0010
            java.util.ArrayList r4 = X.C29351c6.A0D(r3)
            java.util.Iterator r3 = r3.iterator()
        L_0x0091:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00ed
            java.lang.String r2 = X.C17880vN.A0v(r3)
            r1 = r5
            java.lang.String r1 = (java.lang.String) r1
            r0 = 0
            boolean r0 = X.AnonymousClass1YE.A0A(r2, r1, r0)
            if (r0 != 0) goto L_0x00af
            java.lang.StringBuilder r1 = X.C17890vO.A0f(r5)
            r0 = 45
            java.lang.String r2 = X.C17890vO.A0Z(r2, r1, r0)
        L_0x00af:
            r4.add(r2)
            goto L_0x0091
        L_0x00b3:
            boolean r0 = r3 instanceof java.util.Map
            if (r0 == 0) goto L_0x00ce
            java.util.Map r3 = (java.util.Map) r3
            if (r3 == 0) goto L_0x00ce
            r6 = r1
            goto L_0x005c
        L_0x00bd:
            java.util.List r3 = java.util.Collections.singletonList(r2)
            goto L_0x007c
        L_0x00c2:
            java.lang.Object r3 = r3.get(r1)
        L_0x00c6:
            boolean r0 = r3 instanceof java.util.List
            if (r0 == 0) goto L_0x00ce
            java.util.List r3 = (java.util.List) r3
            if (r3 != 0) goto L_0x007f
        L_0x00ce:
            X.0wS r3 = X.C18460wS.A00
            goto L_0x007f
        L_0x00d1:
            boolean r0 = r7 instanceof X.AnonymousClass9C7
            if (r0 == 0) goto L_0x00d9
            java.lang.String r1 = "category"
            goto L_0x0008
        L_0x00d9:
            boolean r0 = r7 instanceof X.AnonymousClass9C6
            if (r0 == 0) goto L_0x00e1
            java.lang.String r1 = "product_id"
            goto L_0x0008
        L_0x00e1:
            boolean r0 = r7 instanceof X.AnonymousClass9C5
            if (r0 == 0) goto L_0x00e9
            java.lang.String r1 = "should not used"
            goto L_0x0008
        L_0x00e9:
            java.lang.String r1 = "category_ids"
            goto L_0x0008
        L_0x00ed:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C191199mB.A00():java.util.List");
    }

    public C191199mB(C187169fN r1, UserJid userJid, Map map, Map map2) {
        this.A01 = userJid;
        this.A03 = map;
        this.A02 = map2;
        this.A00 = r1;
    }
}
