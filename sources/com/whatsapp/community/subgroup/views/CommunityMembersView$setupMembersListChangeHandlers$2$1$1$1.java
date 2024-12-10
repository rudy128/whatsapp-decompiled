package com.whatsapp.community.subgroup.views;

import X.AnonymousClass1OS;
import X.AnonymousClass27B;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.subgroup.views.CommunityMembersView$setupMembersListChangeHandlers$2$1$1$1", f = "CommunityMembersView.kt", i = {}, l = {177}, m = "invokeSuspend", n = {}, s = {})
public final class CommunityMembersView$setupMembersListChangeHandlers$2$1$1$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $participants;
    public int label;
    public final /* synthetic */ AnonymousClass27B this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CommunityMembersView$setupMembersListChangeHandlers$2$1$1$1(AnonymousClass27B r2, List list, C30391dr r4) {
        super(2, r4);
        this.this$0 = r2;
        this.$participants = list;
    }

    public final C30391dr create(Object obj, C30391dr r5) {
        return new CommunityMembersView$setupMembersListChangeHandlers$2$1$1$1(this.this$0, this.$participants, r5);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003f, code lost:
        if (r1 != 2) goto L_0x007f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0090 A[LOOP:1: B:31:0x008a->B:33:0x0090, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00c9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r10.label
            r0 = 1
            if (r1 == 0) goto L_0x0019
            if (r1 != r0) goto L_0x0116
            X.C30691eM.A01(r11)
        L_0x000c:
            X.27B r0 = r10.this$0
            X.3XL r4 = r0.A07
            if (r4 != 0) goto L_0x0027
            java.lang.String r0 = "communityMembersAdapter"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x0019:
            X.C30691eM.A01(r11)
            r10.label = r0
            r0 = 500(0x1f4, double:2.47E-321)
            java.lang.Object r0 = X.C62882s9.A00(r10, r0)
            if (r0 != r2) goto L_0x000c
            return r2
        L_0x0027:
            java.util.List r5 = r10.$participants
            r6 = 0
            X.C18070vi.A0d(r5, r6)
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            X.4SF r0 = r4.A00
            if (r0 == 0) goto L_0x007f
            int r1 = r0.A00
            r8 = 1
            if (r1 == r8) goto L_0x0041
            r0 = 2
            if (r1 != r0) goto L_0x007f
        L_0x0041:
            com.whatsapp.jid.GroupJid r9 = r4.A0A
            if (r9 == 0) goto L_0x0086
            int r1 = r5.size()
            X.1MW r0 = r4.A08
            int r0 = r0.A09(r9)
            if (r8 == 0) goto L_0x0086
            if (r1 <= r0) goto L_0x0081
            java.util.ArrayList r3 = X.AnonymousClass000.A13()
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            java.util.Iterator r8 = r5.iterator()
        L_0x005f:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L_0x00d1
            java.lang.Object r7 = r8.next()
            X.4SF r7 = (X.AnonymousClass4SF) r7
            X.1MZ r1 = r4.A07
            com.whatsapp.jid.PhoneUserJid r0 = r7.A03
            X.2sr r0 = r1.A05(r9, r0)
            if (r0 == 0) goto L_0x005f
            r1 = 2
            X.4TE r0 = new X.4TE
            r0.<init>(r1, r7)
            r2.add(r0)
            goto L_0x005f
        L_0x007f:
            r8 = 0
            goto L_0x0041
        L_0x0081:
            X.4TE r0 = r4.A02
            r3.add(r0)
        L_0x0086:
            java.util.Iterator r5 = r5.iterator()
        L_0x008a:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x009e
            java.lang.Object r2 = r5.next()
            r1 = 2
            X.4TE r0 = new X.4TE
            r0.<init>(r1, r2)
            r7.add(r0)
            goto L_0x008a
        L_0x009e:
            int r1 = r7.size()
            r0 = 11
            if (r1 <= r0) goto L_0x00c9
            r1 = 10
            java.util.List r0 = r7.subList(r6, r1)
            java.util.ArrayList r0 = X.C17880vN.A10(r0)
            r3.addAll(r0)
            int r0 = r7.size()
            int r0 = r0 - r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 3
            X.4TE r0 = new X.4TE
            r0.<init>(r1, r2)
        L_0x00c2:
            r3.add(r0)
        L_0x00c5:
            X.1KB r1 = r4.A01
            r0 = 3
            goto L_0x0100
        L_0x00c9:
            r3.addAll(r7)
            if (r8 != 0) goto L_0x00c5
            X.4TE r0 = r4.A04
            goto L_0x00c2
        L_0x00d1:
            int r1 = r2.size()
            r0 = 11
            if (r1 <= r0) goto L_0x0106
            r1 = 10
            java.util.List r0 = r2.subList(r6, r1)
            java.util.ArrayList r0 = X.C17880vN.A10(r0)
            r3.addAll(r0)
            int r0 = r2.size()
            int r0 = r0 - r1
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            r1 = 3
            X.4TE r0 = new X.4TE
            r0.<init>(r1, r2)
        L_0x00f5:
            r3.add(r0)
        L_0x00f8:
            X.4TE r0 = r4.A02
            r3.add(r6, r0)
            X.1KB r1 = r4.A01
            r0 = 5
        L_0x0100:
            X.C98804rk.A00(r1, r4, r3, r0)
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0106:
            r3.addAll(r2)
            int r1 = r2.size()
            int r0 = r5.size()
            if (r1 >= r0) goto L_0x00f8
            X.4TE r0 = r4.A05
            goto L_0x00f5
        L_0x0116:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.subgroup.views.CommunityMembersView$setupMembersListChangeHandlers$2$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((CommunityMembersView$setupMembersListChangeHandlers$2$1$1$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
