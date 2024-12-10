package com.whatsapp.community.membersuggestedgroups;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import X.C82904Cp;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$onSubgroupAction$1", f = "MemberSuggestedGroupsManagementViewModel.kt", i = {}, l = {306, 314, 318, 322}, m = "invokeSuspend", n = {}, s = {})
public final class MemberSuggestedGroupsManagementViewModel$onSubgroupAction$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ C82904Cp $action;
    public final /* synthetic */ boolean $skipConfirm;
    public final /* synthetic */ List $suggestions;
    public int label;
    public final /* synthetic */ MemberSuggestedGroupsManagementViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemberSuggestedGroupsManagementViewModel$onSubgroupAction$1(MemberSuggestedGroupsManagementViewModel memberSuggestedGroupsManagementViewModel, C82904Cp r3, List list, C30391dr r5, boolean z) {
        super(2, r5);
        this.this$0 = memberSuggestedGroupsManagementViewModel;
        this.$action = r3;
        this.$suggestions = list;
        this.$skipConfirm = z;
    }

    public final C30391dr create(Object obj, C30391dr r8) {
        return new MemberSuggestedGroupsManagementViewModel$onSubgroupAction$1(this.this$0, this.$action, this.$suggestions, r8, this.$skipConfirm);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            X.1g4 r3 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r13.label
            r8 = 4
            r9 = 1
            r10 = 0
            r7 = 3
            r6 = 2
            if (r0 == 0) goto L_0x0018
            if (r0 == r9) goto L_0x0113
            if (r0 == r6) goto L_0x0113
            if (r0 == r7) goto L_0x0113
            if (r0 == r8) goto L_0x0113
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0018:
            X.C30691eM.A01(r14)
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r0 = r13.this$0
            X.11E r0 = r0.A03
            boolean r0 = r0.A09()
            if (r0 != 0) goto L_0x0034
            X.3pp r1 = X.C77313pp.A00
        L_0x0027:
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r0 = r13.this$0
            X.5bm r0 = r0.A08
            r13.label = r9
            java.lang.Object r0 = r0.CHH(r1, r13)
        L_0x0031:
            if (r0 != r3) goto L_0x0116
            return r3
        L_0x0034:
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r0 = r13.this$0
            X.4Cp r2 = r13.$action
            X.1G4 r0 = r0.A0B
            java.lang.Object r1 = r0.getValue()
            X.4CT r0 = X.AnonymousClass4CT.MEMBER
            if (r1 != r0) goto L_0x0049
            X.4Cp r0 = X.C82904Cp.CANCEL
            if (r2 == r0) goto L_0x0049
            X.3po r1 = X.C77303po.A00
            goto L_0x0027
        L_0x0049:
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r1 = r13.this$0
            java.util.List r0 = r13.$suggestions
            int r4 = r0.size()
            X.4Cp r2 = r13.$action
            boolean r5 = r13.$skipConfirm
            X.1G1 r11 = r1.A0D
            java.lang.Object r0 = r11.getValue()
            X.1D6 r0 = (X.AnonymousClass1D6) r0
            int r12 = X.AnonymousClass3MZ.A04(r0)
            int r12 = r12 + r4
            java.lang.Object r0 = r11.getValue()
            X.1D6 r0 = (X.AnonymousClass1D6) r0
            java.lang.Object r0 = r0.second
            int r0 = X.AnonymousClass000.A0M(r0)
            int r12 = r12 - r0
            if (r12 <= 0) goto L_0x009a
            X.4Cp r0 = X.C82904Cp.APPROVE
            if (r2 != r0) goto L_0x009a
            java.lang.Object r0 = r11.getValue()
            X.1D6 r0 = (X.AnonymousClass1D6) r0
            int r1 = X.AnonymousClass3MZ.A04(r0)
            java.lang.Object r0 = r11.getValue()
            X.1D6 r0 = (X.AnonymousClass1D6) r0
            java.lang.Object r0 = r0.second
            int r0 = X.AnonymousClass000.A0M(r0)
            if (r1 < r0) goto L_0x0090
            X.3pn r1 = X.C77293pn.A00
            goto L_0x0027
        L_0x0090:
            if (r5 != 0) goto L_0x009a
            int r0 = r4 - r12
            X.3pi r1 = new X.3pi
            r1.<init>(r2, r4, r0)
            goto L_0x0027
        L_0x009a:
            java.util.List r0 = r13.$suggestions
            java.util.ArrayList r4 = X.C29351c6.A0E(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x00a4:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x00b6
            java.lang.Object r0 = r1.next()
            X.2mu r0 = (X.C59802mu) r0
            X.1EC r0 = r0.A02
            r4.add(r0)
            goto L_0x00a4
        L_0x00b6:
            java.util.List r0 = r13.$suggestions
            java.util.ArrayList r5 = X.C29351c6.A0E(r0)
            java.util.Iterator r11 = r0.iterator()
        L_0x00c0:
            boolean r0 = r11.hasNext()
            if (r0 == 0) goto L_0x00d9
            java.lang.Object r0 = r11.next()
            X.2mu r0 = (X.C59802mu) r0
            X.1EC r2 = r0.A02
            com.whatsapp.jid.UserJid r1 = r0.A04
            X.4TG r0 = new X.4TG
            r0.<init>(r2, r1)
            r5.add(r0)
            goto L_0x00c0
        L_0x00d9:
            X.4Cp r0 = r13.$action
            int r0 = r0.ordinal()
            r2 = 0
            if (r0 == r10) goto L_0x0104
            if (r0 == r9) goto L_0x00f5
            if (r0 != r6) goto L_0x0116
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r1 = r13.this$0
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$onSubgroupAction$1$4 r0 = new com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$onSubgroupAction$1$4
            r0.<init>(r4, r2)
            r13.label = r8
            X.1g4 r0 = com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel.A05(r1, r4, r13, r0, r8)
            goto L_0x0031
        L_0x00f5:
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r1 = r13.this$0
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$onSubgroupAction$1$3 r0 = new com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$onSubgroupAction$1$3
            r0.<init>(r5, r2)
            r13.label = r7
            X.1g4 r0 = com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel.A05(r1, r4, r13, r0, r7)
            goto L_0x0031
        L_0x0104:
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r1 = r13.this$0
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$onSubgroupAction$1$2 r0 = new com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$onSubgroupAction$1$2
            r0.<init>(r5, r2)
            r13.label = r6
            X.1g4 r0 = com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel.A05(r1, r4, r13, r0, r6)
            goto L_0x0031
        L_0x0113:
            X.C30691eM.A01(r14)
        L_0x0116:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$onSubgroupAction$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MemberSuggestedGroupsManagementViewModel$onSubgroupAction$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
