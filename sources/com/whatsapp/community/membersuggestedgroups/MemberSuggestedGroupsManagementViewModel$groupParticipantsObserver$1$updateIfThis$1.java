package com.whatsapp.community.membersuggestedgroups;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$groupParticipantsObserver$1$updateIfThis$1", f = "MemberSuggestedGroupsManagementViewModel.kt", i = {}, l = {131, 132}, m = "invokeSuspend", n = {}, s = {})
public final class MemberSuggestedGroupsManagementViewModel$groupParticipantsObserver$1$updateIfThis$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ MemberSuggestedGroupsManagementViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemberSuggestedGroupsManagementViewModel$groupParticipantsObserver$1$updateIfThis$1(MemberSuggestedGroupsManagementViewModel memberSuggestedGroupsManagementViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = memberSuggestedGroupsManagementViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new MemberSuggestedGroupsManagementViewModel$groupParticipantsObserver$1$updateIfThis$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new MemberSuggestedGroupsManagementViewModel$groupParticipantsObserver$1$updateIfThis$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0040 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r5.label
            r3 = 2
            r0 = 1
            if (r1 == 0) goto L_0x0012
            if (r1 == r0) goto L_0x0033
            if (r1 != r3) goto L_0x0041
            X.C30691eM.A01(r6)
        L_0x000f:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0012:
            X.C30691eM.A01(r6)
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r1 = r5.this$0
            r5.label = r0
            X.1G4 r2 = r1.A0B
            X.1kb r0 = r1.A01
            X.1EC r1 = r1.A06
            X.1MZ r0 = r0.A06
            boolean r0 = r0.A0K(r1)
            if (r0 == 0) goto L_0x0030
            X.4CT r0 = X.AnonymousClass4CT.ADMIN
        L_0x0029:
            java.lang.Object r0 = r2.BJt(r0, r5)
            if (r0 != r4) goto L_0x0036
            return r4
        L_0x0030:
            X.4CT r0 = X.AnonymousClass4CT.MEMBER
            goto L_0x0029
        L_0x0033:
            X.C30691eM.A01(r6)
        L_0x0036:
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r0 = r5.this$0
            r5.label = r3
            java.lang.Object r0 = com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel.A04(r0, r5)
            if (r0 != r4) goto L_0x000f
            return r4
        L_0x0041:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$groupParticipantsObserver$1$updateIfThis$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
