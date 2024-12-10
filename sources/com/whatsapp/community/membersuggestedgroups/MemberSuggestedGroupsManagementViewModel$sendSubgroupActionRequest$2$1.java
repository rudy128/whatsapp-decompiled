package com.whatsapp.community.membersuggestedgroups;

import X.AnonymousClass1G4;
import X.AnonymousClass1OS;
import X.C22821Di;
import X.C27621Wu;
import X.C30391dr;
import X.C30411dt;
import X.C30431dv;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$sendSubgroupActionRequest$2$1", f = "MemberSuggestedGroupsManagementViewModel.kt", i = {}, l = {456, 459, 461, 468}, m = "invokeSuspend", n = {}, s = {})
public final class MemberSuggestedGroupsManagementViewModel$sendSubgroupActionRequest$2$1 extends C30431dv implements AnonymousClass1OS {
    public final /* synthetic */ List $groupsToUpdate;
    public final /* synthetic */ C22821Di $networkCall;
    public final /* synthetic */ AnonymousClass1G4 $this_apply;
    public int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemberSuggestedGroupsManagementViewModel$sendSubgroupActionRequest$2$1(List list, C30391dr r3, C22821Di r4, AnonymousClass1G4 r5) {
        super(2, r3);
        this.$networkCall = r4;
        this.$this_apply = r5;
        this.$groupsToUpdate = list;
    }

    public final C30391dr create(Object obj, C30391dr r6) {
        return new MemberSuggestedGroupsManagementViewModel$sendSubgroupActionRequest$2$1(this.$groupsToUpdate, r6, this.$networkCall, this.$this_apply);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0050 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r10.label
            r3 = 4
            r8 = 3
            r9 = 2
            r7 = 1
            if (r0 == 0) goto L_0x0017
            if (r0 == r7) goto L_0x0025
            if (r0 == r9) goto L_0x0093
            if (r0 == r8) goto L_0x0093
            if (r0 == r3) goto L_0x0093
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0017:
            X.C30691eM.A01(r11)
            X.1Di r0 = r10.$networkCall
            r10.label = r7
            java.lang.Object r11 = r0.invoke(r10)
            if (r11 != r5) goto L_0x0028
            return r5
        L_0x0025:
            X.C30691eM.A01(r11)
        L_0x0028:
            X.4L3 r11 = (X.AnonymousClass4L3) r11
            boolean r0 = r11 instanceof X.C77223pg
            if (r0 == 0) goto L_0x0078
            X.3pg r11 = (X.C77223pg) r11
            java.util.List r6 = r11.A00
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x0051
            X.1G4 r2 = r10.$this_apply
            java.lang.Integer r1 = X.AnonymousClass3MW.A0v(r9)
            java.util.List r0 = r10.$groupsToUpdate
            X.1D6 r0 = X.AnonymousClass1D6.A01(r1, r0)
            java.util.Map r0 = X.C200610r.A04(r0)
            r10.label = r9
        L_0x004a:
            java.lang.Object r0 = r2.BJt(r0, r10)
        L_0x004e:
            if (r0 != r5) goto L_0x0096
            return r5
        L_0x0051:
            X.1G4 r4 = r10.$this_apply
            X.1D6[] r3 = new X.AnonymousClass1D6[r9]
            java.lang.Integer r2 = X.AnonymousClass3MW.A0v(r9)
            java.util.List r1 = r10.$groupsToUpdate
            java.util.Set r0 = X.C29431cG.A12(r6)
            java.util.List r0 = X.C29431cG.A0w(r1, r0)
            X.C72463Mc.A1H(r2, r0, r3)
            java.lang.Integer r0 = X.AnonymousClass3MW.A0v(r7)
            X.AnonymousClass1D6.A03(r0, r6, r3, r7)
            java.util.LinkedHashMap r0 = X.AnonymousClass1D7.A0B(r3)
            r10.label = r8
            java.lang.Object r0 = r4.BJt(r0, r10)
            goto L_0x004e
        L_0x0078:
            X.3ph r0 = X.C77233ph.A00
            boolean r0 = X.C18070vi.A18(r11, r0)
            if (r0 == 0) goto L_0x0096
            X.1G4 r2 = r10.$this_apply
            java.lang.Integer r1 = X.AnonymousClass3MW.A0v(r7)
            java.util.List r0 = r10.$groupsToUpdate
            X.1D6 r0 = X.AnonymousClass1D6.A01(r1, r0)
            java.util.Map r0 = X.C200610r.A04(r0)
            r10.label = r3
            goto L_0x004a
        L_0x0093:
            X.C30691eM.A01(r11)
        L_0x0096:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$sendSubgroupActionRequest$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((MemberSuggestedGroupsManagementViewModel$sendSubgroupActionRequest$2$1) C30411dt.A04(obj2, obj, this)).invokeSuspend(C27621Wu.A00);
    }
}
