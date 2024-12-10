package X;

import java.util.Collection;

/* renamed from: X.5SK  reason: invalid class name */
public final class AnonymousClass5SK extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ Collection $favoriteChatJids;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5SK(Collection collection) {
        super(1);
        this.$favoriteChatJids = collection;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        if (r2.$favoriteChatJids.contains(r3) != false) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r3) {
        /*
            r2 = this;
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            boolean r0 = r3 instanceof X.AnonymousClass1EC
            if (r0 != 0) goto L_0x0010
            boolean r0 = r3 instanceof X.AnonymousClass1E2
            if (r0 != 0) goto L_0x0010
            boolean r0 = r3 instanceof com.whatsapp.jid.PhoneUserJid
            if (r0 == 0) goto L_0x0019
        L_0x0010:
            java.util.Collection r0 = r2.$favoriteChatJids
            boolean r1 = r0.contains(r3)
            r0 = 1
            if (r1 == 0) goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass5SK.invoke(java.lang.Object):java.lang.Object");
    }
}
