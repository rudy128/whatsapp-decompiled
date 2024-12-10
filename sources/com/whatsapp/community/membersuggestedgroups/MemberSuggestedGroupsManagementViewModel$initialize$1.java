package com.whatsapp.community.membersuggestedgroups;

import X.AnonymousClass1OS;
import X.C27621Wu;
import X.C30391dr;
import X.C30431dv;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$initialize$1", f = "MemberSuggestedGroupsManagementViewModel.kt", i = {}, l = {145, 147, 151, 152}, m = "invokeSuspend", n = {}, s = {})
public final class MemberSuggestedGroupsManagementViewModel$initialize$1 extends C30431dv implements AnonymousClass1OS {
    public int label;
    public final /* synthetic */ MemberSuggestedGroupsManagementViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MemberSuggestedGroupsManagementViewModel$initialize$1(MemberSuggestedGroupsManagementViewModel memberSuggestedGroupsManagementViewModel, C30391dr r3) {
        super(2, r3);
        this.this$0 = memberSuggestedGroupsManagementViewModel;
    }

    public final C30391dr create(Object obj, C30391dr r4) {
        return new MemberSuggestedGroupsManagementViewModel$initialize$1(this.this$0, r4);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return new MemberSuggestedGroupsManagementViewModel$initialize$1(this.this$0, (C30391dr) obj2).invokeSuspend(C27621Wu.A00);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0118, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0119, code lost:
        X.CDX.A00(r8, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x011c, code lost:
        throw r0;
     */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00cf A[Catch:{ all -> 0x0118 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x010d A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            r6 = r17
            int r0 = r6.label
            r4 = 4
            r2 = 3
            r9 = 2
            r7 = 1
            if (r0 == 0) goto L_0x0019
            if (r0 == r7) goto L_0x003a
            if (r0 == r9) goto L_0x0061
            if (r0 == r2) goto L_0x00f6
            if (r0 == r4) goto L_0x010e
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0019:
            X.C30691eM.A01(r18)
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r1 = r6.this$0
            r6.label = r7
            X.1G4 r3 = r1.A0B
            X.1kb r0 = r1.A01
            X.1EC r1 = r1.A06
            X.1MZ r0 = r0.A06
            boolean r0 = r0.A0K(r1)
            if (r0 == 0) goto L_0x0037
            X.4CT r0 = X.AnonymousClass4CT.ADMIN
        L_0x0030:
            java.lang.Object r0 = r3.BJt(r0, r6)
            if (r0 != r5) goto L_0x003d
            return r5
        L_0x0037:
            X.4CT r0 = X.AnonymousClass4CT.MEMBER
            goto L_0x0030
        L_0x003a:
            X.C30691eM.A01(r18)
        L_0x003d:
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r8 = r6.this$0
            X.1kb r0 = r8.A01
            X.1EC r3 = r8.A06
            com.whatsapp.jid.GroupJid r1 = r0.A02(r3)
            X.1EC r1 = (X.AnonymousClass1EC) r1
            if (r1 == 0) goto L_0x005b
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r0 = r8.A02
            r0.A05(r3, r1)
        L_0x0050:
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r0 = r6.this$0
            r6.label = r9
            java.lang.Object r0 = com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel.A04(r0, r6)
            if (r0 != r5) goto L_0x0064
            return r5
        L_0x005b:
            java.lang.String r0 = "MemberSuggestedGroupsManagementViewModel/fetchUpdatedSuggestionList/failed to find hint group"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0050
        L_0x0061:
            X.C30691eM.A01(r18)
        L_0x0064:
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r0 = r6.this$0
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel.A06(r0)
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r3 = r6.this$0
            X.1R3 r0 = r3.A05
            X.1EC r1 = r3.A06
            r9 = 1
            X.206 r0 = r0.A06(r1, r7)
            if (r0 == 0) goto L_0x0089
            boolean r0 = X.AnonymousClass25A.A0q(r0)
            if (r0 == 0) goto L_0x0089
            X.1CJ r0 = r3.A04
            X.1ci r1 = r0.A0A(r1)
            if (r1 == 0) goto L_0x0089
            X.1kb r0 = r3.A01
            r0.A0G(r1)
        L_0x0089:
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r0 = r6.this$0
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r7 = r0.A02
            X.1EC r3 = r0.A06
            X.00H r0 = r7.A07
            java.lang.Object r11 = r0.get()
            X.1kV r11 = (X.C34451kV) r11
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MILLISECONDS
            X.11P r0 = r7.A05
            long r0 = X.AnonymousClass11P.A01(r0)
            long r0 = r8.toSeconds(r0)
            r10 = 0
            android.content.ContentValues r12 = new android.content.ContentValues
            r12.<init>(r9)
            java.lang.String r8 = "suggested_groups_view_time_seconds"
            X.C17880vN.A19(r12, r8, r0)
            X.1Lt r0 = r11.A00
            X.1au r8 = r0.A06()
            r0 = r8
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0116 }
            X.1Ev r11 = r0.A02     // Catch:{ all -> 0x0116 }
            java.lang.String r13 = "community_settings"
            java.lang.String r14 = "community_raw_jid = ?"
            java.lang.String[] r1 = new java.lang.String[r9]     // Catch:{ all -> 0x0116 }
            java.lang.String r0 = r3.getRawString()     // Catch:{ all -> 0x0116 }
            r1[r10] = r0     // Catch:{ all -> 0x0116 }
            java.lang.String r15 = "CommunitySettingsStore/updateSuggestedGroupsViewTime"
            r16 = r1
            int r0 = r11.A02(r12, r13, r14, r15, r16)     // Catch:{ all -> 0x0116 }
            if (r0 != 0) goto L_0x00dd
            java.lang.String r1 = "community_raw_jid"
            java.lang.String r0 = r3.getRawString()     // Catch:{ all -> 0x0116 }
            r12.put(r1, r0)     // Catch:{ all -> 0x0116 }
            java.lang.String r0 = "CommunitySettingsStore/insertSuggestedGroupsViewTime"
            r11.A05(r13, r0, r12)     // Catch:{ all -> 0x0116 }
        L_0x00dd:
            r8.close()
            X.1KB r1 = r7.A00
            r0 = 32
            X.C98804rk.A00(r1, r7, r3, r0)
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r0 = r6.this$0
            X.1G4 r1 = r0.A0A
            X.4CS r0 = X.AnonymousClass4CS.READY
            r6.label = r2
            java.lang.Object r0 = r1.BJt(r0, r6)
            if (r0 != r5) goto L_0x00f9
            return r5
        L_0x00f6:
            X.C30691eM.A01(r18)
        L_0x00f9:
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel r3 = r6.this$0
            com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManager r0 = r3.A02
            X.1G1 r2 = r0.A0D
            r1 = 3
            X.4sj r0 = new X.4sj
            r0.<init>(r3, r1)
            r6.label = r4
            java.lang.Object r0 = r2.BFC(r6, r0)
            if (r0 != r5) goto L_0x0111
            return r5
        L_0x010e:
            X.C30691eM.A01(r18)
        L_0x0111:
            X.7Sr r0 = X.AnonymousClass3MW.A13()
            throw r0
        L_0x0116:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0118 }
        L_0x0118:
            r0 = move-exception
            X.CDX.A00(r8, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.membersuggestedgroups.MemberSuggestedGroupsManagementViewModel$initialize$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
