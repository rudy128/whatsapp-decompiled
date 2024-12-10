package X;

import java.util.List;

/* renamed from: X.3IN  reason: invalid class name */
public final class AnonymousClass3IN extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ List $suggestionsKeys;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3IN(List list) {
        super(1);
        this.$suggestionsKeys = list;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        r4 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r6) {
        /*
            r5 = this;
            X.2mu r6 = (X.C59802mu) r6
            java.util.List r1 = r5.$suggestionsKeys
            boolean r0 = r1 instanceof java.util.Collection
            r4 = 0
            if (r0 == 0) goto L_0x0014
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0014
        L_0x000f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            return r0
        L_0x0014:
            java.util.Iterator r3 = r1.iterator()
        L_0x0018:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x000f
            java.lang.Object r2 = r3.next()
            X.2m5 r2 = (X.C59302m5) r2
            X.1EC r1 = r2.A00
            X.1EC r0 = r6.A02
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 == 0) goto L_0x0018
            com.whatsapp.jid.UserJid r1 = r2.A01
            if (r1 == 0) goto L_0x003a
            com.whatsapp.jid.UserJid r0 = r6.A04
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0018
        L_0x003a:
            r4 = 1
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3IN.invoke(java.lang.Object):java.lang.Object");
    }
}
