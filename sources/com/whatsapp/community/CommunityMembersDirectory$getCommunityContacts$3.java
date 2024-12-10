package com.whatsapp.community;

import X.AnonymousClass1EC;
import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.CommunityMembersDirectory$getCommunityContacts$3", f = "CommunityMembersDirectory.kt", i = {0}, l = {346}, m = "invokeSuspend", n = {"communityContacts"}, s = {"L$0"})
public final class CommunityMembersDirectory$getCommunityContacts$3 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ AnonymousClass1EC $parentJid;
    public Object L$0;
    public int label;
    public final /* synthetic */ CommunityMembersDirectory this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommunityMembersDirectory$getCommunityContacts$3(CommunityMembersDirectory communityMembersDirectory, AnonymousClass1EC r3, C30391dr r4) {
        super(2, r4);
        this.this$0 = communityMembersDirectory;
        this.$parentJid = r3;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new CommunityMembersDirectory$getCommunityContacts$3(this.this$0, this.$parentJid, r5);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: X.1g4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: X.1g4} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: java.util.TreeSet} */
    /* JADX WARNING: type inference failed for: r3v5, types: [java.util.AbstractCollection] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r4 = 1
            if (r0 == 0) goto L_0x003c
            if (r0 != r4) goto L_0x005f
            java.lang.Object r3 = r5.L$0
            java.util.AbstractCollection r3 = (java.util.AbstractCollection) r3
            X.C30691eM.A01(r6)
        L_0x0010:
            java.util.Map r6 = (java.util.Map) r6
            java.util.Set r1 = r6.keySet()
            com.whatsapp.community.CommunityMembersDirectory r0 = r5.this$0
            X.1M9 r0 = r0.A02
            java.util.HashMap r0 = r0.A0Q(r1)
            java.util.Iterator r4 = X.C17890vO.A0j(r0)
        L_0x0022:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0064
            X.1E7 r2 = X.C17880vN.A0O(r4)
            com.whatsapp.community.CommunityMembersDirectory r0 = r5.this$0
            X.11S r1 = r0.A01
            X.1BI r0 = r2.A0J
            boolean r0 = r1.A0O(r0)
            if (r0 != 0) goto L_0x0022
            r3.add(r2)
            goto L_0x0022
        L_0x003c:
            X.C30691eM.A01(r6)
            com.whatsapp.community.CommunityMembersDirectory r0 = r5.this$0
            X.1Me r2 = r0.A03
            X.0vb r1 = r0.A04
            X.7Rj r0 = new X.7Rj
            r0.<init>(r2, r1)
            java.util.TreeSet r2 = new java.util.TreeSet
            r2.<init>(r0)
            com.whatsapp.community.CommunityMembersDirectory r1 = r5.this$0
            X.1EC r0 = r5.$parentJid
            r5.L$0 = r2
            r5.label = r4
            java.lang.Object r6 = r1.BOz(r0, r5)
            if (r6 == r3) goto L_0x0064
            r3 = r2
            goto L_0x0010
        L_0x005f:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0064:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.CommunityMembersDirectory$getCommunityContacts$3.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommunityMembersDirectory$getCommunityContacts$3) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
