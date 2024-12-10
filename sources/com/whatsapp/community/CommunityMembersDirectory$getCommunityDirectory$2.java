package com.whatsapp.community;

import X.AnonymousClass1EC;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.CommunityMembersDirectory$getCommunityDirectory$2", f = "CommunityMembersDirectory.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class CommunityMembersDirectory$getCommunityDirectory$2 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1EC $parentJid;
    public int label;
    public final /* synthetic */ CommunityMembersDirectory this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommunityMembersDirectory$getCommunityDirectory$2(CommunityMembersDirectory communityMembersDirectory, AnonymousClass1EC r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = communityMembersDirectory;
        this.$parentJid = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new CommunityMembersDirectory$getCommunityDirectory$2(this.this$0, this.$parentJid, r5);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.1EC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.1EC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v23, resolved type: com.whatsapp.jid.GroupJid} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: X.1EC} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v11, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v12, resolved type: java.util.LinkedHashMap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: java.util.LinkedHashMap} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0185 A[LOOP:2: B:47:0x017e->B:49:0x0185, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x01a2  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x01b3 A[LOOP:3: B:54:0x01ad->B:56:0x01b3, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01d4  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x01f0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            int r0 = r9.label
            if (r0 != 0) goto L_0x01f5
            X.C30691eM.A01(r10)
            com.whatsapp.community.CommunityMembersDirectory r4 = r9.this$0
            X.1EC r3 = r9.$parentJid
            X.1CJ r0 = r4.A05
            int r1 = r0.A06(r3)
            r0 = 1
            if (r1 != r0) goto L_0x0038
            X.1MZ r2 = r4.A06
            boolean r0 = r2.A0K(r3)
            if (r0 != 0) goto L_0x0038
            X.00H r0 = r4.A09
            java.lang.Object r0 = r0.get()
            X.1kb r0 = (X.C34511kb) r0
            X.A2B r0 = r0.A01(r3)
            if (r0 == 0) goto L_0x0038
            com.whatsapp.jid.GroupJid r1 = r0.A02
            boolean r0 = r2.A0J(r1)
            if (r0 == 0) goto L_0x0038
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.jid.PermanentGroupJid"
            X.C18070vi.A0z(r1, r0)
            r3 = r1
        L_0x0038:
            com.whatsapp.community.CommunityMembersDirectory r0 = r9.this$0
            X.1MZ r0 = r0.A06
            boolean r6 = r0.A0I(r3)
            com.whatsapp.community.CommunityMembersDirectory r0 = r9.this$0
            X.1MZ r0 = r0.A06
            X.1MW r0 = r0.A08
            X.2tp r0 = r0.A0B(r3)
            X.10f r2 = r0.A0A()
            X.C18070vi.A0X(r2)
            r0 = 4
            X.4so r1 = new X.4so
            r1.<init>(r2, r0)
            X.3Io r0 = X.C71843Io.A00
            X.7Sa r2 = X.AnonymousClass1b2.A09(r0, r1)
            com.whatsapp.community.CommunityMembersDirectory r1 = r9.this$0
            X.3IZ r0 = new X.3IZ
            r0.<init>(r1, r6)
            X.7Sa r0 = X.AnonymousClass1b2.A0A(r0, r2)
            java.util.Map r4 = X.AnonymousClass1D7.A0H(r0)
            com.whatsapp.community.CommunityMembersDirectory r0 = r9.this$0
            X.1MZ r1 = r0.A06
            X.1EC r0 = r9.$parentJid
            boolean r0 = r1.A0K(r0)
            com.whatsapp.community.CommunityMembersDirectory r5 = r9.this$0
            if (r0 == 0) goto L_0x00ee
            X.1MY r3 = r5.A07
            X.1EC r0 = r9.$parentJid
            monitor-enter(r3)
            java.util.ArrayList r2 = X.AnonymousClass1MY.A00(r3, r0)     // Catch:{ all -> 0x00eb }
            int r0 = r2.size()     // Catch:{ all -> 0x00eb }
            if (r0 != 0) goto L_0x008e
            java.util.ArrayList r2 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x00eb }
            goto L_0x009e
        L_0x008e:
            X.1DL r1 = r3.A00     // Catch:{ all -> 0x00eb }
            java.lang.Class<com.whatsapp.jid.UserJid> r0 = com.whatsapp.jid.UserJid.class
            java.util.HashMap r0 = r1.A0F(r0, r2)     // Catch:{ all -> 0x00eb }
            java.util.Collection r0 = r0.values()     // Catch:{ all -> 0x00eb }
            java.util.ArrayList r2 = X.C17880vN.A10(r0)     // Catch:{ all -> 0x00eb }
        L_0x009e:
            monitor-exit(r3)
            com.whatsapp.community.CommunityMembersDirectory r0 = r9.this$0
            X.00H r0 = r0.A0C
            java.lang.Object r1 = r0.get()
            X.1Ln r1 = (X.C24751Ln) r1
            java.util.Set r0 = X.C29431cG.A12(r2)
            java.util.LinkedHashMap r0 = r1.A0G(r0)
            if (r6 == 0) goto L_0x00e6
            java.util.Set r0 = r0.keySet()
        L_0x00b7:
            X.4so r1 = X.C29431cG.A0V(r0)
            X.3IK r0 = new X.3IK
            r0.<init>(r4)
            X.7Sa r1 = X.AnonymousClass1b2.A09(r0, r1)
            X.3Ip r0 = X.C71853Ip.A00
            X.1b3 r0 = X.AnonymousClass1b2.A0C(r0, r1)
            java.util.LinkedHashMap r3 = X.C17880vN.A13()
            X.1b4 r2 = new X.1b4
            r2.<init>(r0)
        L_0x00d3:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01eb
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.2sr r0 = (X.C63312sr) r0
            com.whatsapp.jid.UserJid r0 = r0.A04
            r3.put(r0, r1)
            goto L_0x00d3
        L_0x00e6:
            java.util.Collection r0 = r0.values()
            goto L_0x00b7
        L_0x00eb:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x00ee:
            X.1EC r2 = r9.$parentJid
            X.1M9 r0 = r5.A02
            X.1E7 r1 = r0.A0H(r2)
            X.00H r0 = r5.A0D
            java.lang.Object r0 = r0.get()
            X.1xo r0 = (X.C42211xo) r0
            boolean r0 = r0.A00(r1)
            if (r0 == 0) goto L_0x0126
            X.0wS r0 = X.C18460wS.A00
        L_0x0106:
            java.util.Collection r0 = (java.util.Collection) r0
        L_0x0108:
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r0.iterator()
        L_0x0110:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0174
            java.lang.Object r1 = r2.next()
            boolean r0 = r4.containsKey(r1)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0110
            r3.add(r1)
            goto L_0x0110
        L_0x0126:
            X.00H r0 = r5.A09
            java.lang.Object r0 = r0.get()
            X.1kb r0 = (X.C34511kb) r0
            java.util.HashSet r0 = r0.A08(r2)
            X.4so r1 = X.C29431cG.A0V(r0)
            X.3Iq r0 = X.C71863Iq.A00
            X.7Sa r1 = X.AnonymousClass1b2.A09(r0, r1)
            X.3IL r0 = new X.3IL
            r0.<init>(r5)
            X.1b3 r3 = X.AnonymousClass1b2.A0C(r0, r1)
            X.3Ir r2 = X.C71873Ir.A00
            r0 = 1
            X.C18070vi.A0d(r2, r0)
            X.3Gz r0 = X.AnonymousClass3Gz.A00
            X.7Sb r1 = new X.7Sb
            r1.<init>(r2, r0, r3)
            X.3Is r0 = X.C71883Is.A00
            X.1b3 r2 = X.AnonymousClass1b2.A0C(r0, r1)
            X.00H r0 = r5.A0C
            java.lang.Object r1 = r0.get()
            X.1Ln r1 = (X.C24751Ln) r1
            java.util.Set r0 = X.AnonymousClass1b2.A08(r2)
            java.util.LinkedHashMap r0 = r1.A0G(r0)
            if (r6 == 0) goto L_0x016f
            java.util.Set r0 = r0.keySet()
            goto L_0x0106
        L_0x016f:
            java.util.Collection r0 = r0.values()
            goto L_0x0108
        L_0x0174:
            r8 = 10
            java.util.ArrayList r7 = X.C29351c6.A0E(r3)
            java.util.Iterator r3 = r3.iterator()
        L_0x017e:
            boolean r0 = r3.hasNext()
            r5 = 0
            if (r0 == 0) goto L_0x0196
            com.whatsapp.jid.UserJid r2 = X.C17880vN.A0T(r3)
            java.util.HashSet r1 = X.C17880vN.A12()
            X.2sr r0 = new X.2sr
            r0.<init>((com.whatsapp.jid.UserJid) r2, (java.util.Set) r1, (int) r5, (boolean) r5)
            r7.add(r0)
            goto L_0x017e
        L_0x0196:
            int r0 = X.C29351c6.A0C(r7, r8)
            int r1 = X.C200610r.A03(r0)
            r0 = 16
            if (r1 >= r0) goto L_0x01a4
            r1 = 16
        L_0x01a4:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r1)
            java.util.Iterator r2 = r7.iterator()
        L_0x01ad:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x01c0
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.2sr r0 = (X.C63312sr) r0
            com.whatsapp.jid.UserJid r0 = r0.A04
            r3.put(r0, r1)
            goto L_0x01ad
        L_0x01c0:
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.community.CommunityMembersDirectory r0 = r9.this$0
            X.11S r0 = r0.A01
            if (r6 == 0) goto L_0x01f0
            X.1E2 r0 = r0.A09()
        L_0x01cc:
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            com.whatsapp.jid.UserJid r2 = X.C22941Dw.A01(r0)
            if (r2 == 0) goto L_0x01eb
            java.lang.Object r0 = r3.get(r2)
            if (r0 != 0) goto L_0x01eb
            java.util.HashSet r1 = X.C17880vN.A12()
            X.2sr r0 = new X.2sr
            r0.<init>((com.whatsapp.jid.UserJid) r2, (java.util.Set) r1, (int) r5, (boolean) r5)
            X.1D6 r0 = X.AnonymousClass1D6.A01(r2, r0)
            java.util.Map r3 = X.AnonymousClass1D7.A0G(r3, r0)
        L_0x01eb:
            java.util.LinkedHashMap r0 = X.AnonymousClass1D7.A09(r4, r3)
            return r0
        L_0x01f0:
            com.whatsapp.jid.PhoneUserJid r0 = X.AnonymousClass11S.A00(r0)
            goto L_0x01cc
        L_0x01f5:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.CommunityMembersDirectory$getCommunityDirectory$2.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommunityMembersDirectory$getCommunityDirectory$2) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
