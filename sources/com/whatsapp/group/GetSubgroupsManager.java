package com.whatsapp.group;

import X.A2B;
import X.AnonymousClass00H;
import X.AnonymousClass11P;
import X.AnonymousClass126;
import X.AnonymousClass1EC;
import X.AnonymousClass1MG;
import X.AnonymousClass1MZ;
import X.AnonymousClass1OX;
import X.AnonymousClass1b2;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass4XG;
import X.AnonymousClass8BR;
import X.B30;
import X.C108945cZ;
import X.C146797Qq;
import X.C147157Sa;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C22193Az9;
import X.C22321B2y;
import X.C22322B2z;
import X.C29431cG;
import X.C29691ci;
import X.C30391dr;
import X.C34451kV;
import X.C34511kb;
import X.C41841x9;
import X.C42941yz;
import X.C61492pm;
import com.whatsapp.community.mex.GetSubgroupMemberCountGraphQlHandler;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class GetSubgroupsManager {
    public final AnonymousClass1MZ A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final GetSubgroupMemberCountGraphQlHandler A03;
    public final AnonymousClass11P A04;
    public final C34451kV A05;
    public final AnonymousClass4XG A06;
    public final C18030ve A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass1OX A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0060, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        X.CDX.A00(r3, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0064, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0067, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0068, code lost:
        X.CDX.A00(r4, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x006b, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A06(X.AnonymousClass1EC r11) {
        /*
            r10 = this;
            r0 = 0
            X.C18070vi.A0d(r11, r0)
            X.0ve r1 = r10.A07
            r0 = 8542(0x215e, float:1.197E-41)
            long r1 = X.AnonymousClass8BR.A05(r1, r0)
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
            long r8 = r0.toMillis(r1)
            X.11P r0 = r10.A04
            long r6 = X.AnonymousClass11P.A01(r0)
            X.1kV r0 = r10.A05
            r5 = 0
            X.1Lt r0 = r0.A00
            X.1at r4 = r0.get()
            r0 = r4
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x0065 }
            X.1Ev r3 = r0.A02     // Catch:{ all -> 0x0065 }
            java.lang.String r2 = "SELECT community_raw_jid, subgroup_member_count_poll_time FROM community_settings WHERE community_raw_jid = ?"
            java.lang.String[] r1 = X.C17880vN.A1Y()     // Catch:{ all -> 0x0065 }
            X.C17880vN.A1J(r11, r1, r5)     // Catch:{ all -> 0x0065 }
            java.lang.String r0 = "CommunitySettingsStore/getSubgroupMemberCountPollTime"
            android.database.Cursor r3 = r3.A0A(r2, r0, r1)     // Catch:{ all -> 0x0065 }
            boolean r0 = r3.moveToFirst()     // Catch:{ all -> 0x005e }
            r2 = 0
            if (r0 == 0) goto L_0x004c
            java.lang.String r0 = "subgroup_member_count_poll_time"
            int r1 = r3.getColumnIndexOrThrow(r0)     // Catch:{ all -> 0x005e }
            boolean r0 = r3.isNull(r1)     // Catch:{ all -> 0x005e }
            if (r0 != 0) goto L_0x004c
            java.lang.Long r2 = X.C17890vO.A0M(r3, r1)     // Catch:{ all -> 0x005e }
        L_0x004c:
            r3.close()     // Catch:{ all -> 0x0065 }
            r4.close()
            long r0 = X.C17900vP.A01(r2)
            long r6 = r6 - r0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            boolean r0 = X.AnonymousClass000.A1Q(r0)
            return r0
        L_0x005e:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0060 }
        L_0x0060:
            r0 = move-exception
            X.CDX.A00(r3, r1)     // Catch:{ all -> 0x0065 }
            throw r0     // Catch:{ all -> 0x0065 }
        L_0x0065:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x0067 }
        L_0x0067:
            r0 = move-exception
            X.CDX.A00(r4, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.GetSubgroupsManager.A06(X.1EC):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x006a A[Catch:{ Exception -> 0x00a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(X.C184519b5 r6, com.whatsapp.group.GetSubgroupsManager r7, X.AnonymousClass1EC r8, X.AnonymousClass1EC r9, X.C30391dr r10) {
        /*
            boolean r0 = r10 instanceof X.C21701AoU
            if (r0 == 0) goto L_0x0025
            r4 = r10
            X.AoU r4 = (X.C21701AoU) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0025
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r3 = r4.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0041
            if (r0 == r1) goto L_0x0030
            if (r0 != r2) goto L_0x002b
            java.lang.Object r6 = r4.L$0
            X.9b5 r6 = (X.C184519b5) r6
            goto L_0x008b
        L_0x0025:
            X.AoU r4 = new X.AoU
            r4.<init>(r7, r10)
            goto L_0x0012
        L_0x002b:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0030:
            java.lang.Object r6 = r4.L$3
            X.9b5 r6 = (X.C184519b5) r6
            java.lang.Object r9 = r4.L$2
            X.1EC r9 = (X.AnonymousClass1EC) r9
            java.lang.Object r8 = r4.L$1
            X.1EC r8 = (X.AnonymousClass1EC) r8
            java.lang.Object r7 = r4.L$0
            com.whatsapp.group.GetSubgroupsManager r7 = (com.whatsapp.group.GetSubgroupsManager) r7
            goto L_0x005d
        L_0x0041:
            X.C30691eM.A01(r3)
            X.00H r0 = r7.A09     // Catch:{ Exception -> 0x00a2 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x00a2 }
            com.whatsapp.protocol.groups.GetSubgroupsProtocolHelper r0 = (com.whatsapp.protocol.groups.GetSubgroupsProtocolHelper) r0     // Catch:{ Exception -> 0x00a2 }
            r4.L$0 = r7     // Catch:{ Exception -> 0x00a2 }
            r4.L$1 = r8     // Catch:{ Exception -> 0x00a2 }
            r4.L$2 = r9     // Catch:{ Exception -> 0x00a2 }
            r4.L$3 = r6     // Catch:{ Exception -> 0x00a2 }
            r4.label = r1     // Catch:{ Exception -> 0x00a2 }
            java.lang.Object r3 = r0.A01(r8, r9, r4)     // Catch:{ Exception -> 0x00a2 }
            if (r3 != r5) goto L_0x0064
            return r5
        L_0x005d:
            X.C30691eM.A01(r3)     // Catch:{ Exception -> 0x00a2 }
            X.1eK r3 = (X.C30671eK) r3     // Catch:{ Exception -> 0x00a2 }
            java.lang.Object r3 = r3.value     // Catch:{ Exception -> 0x00a2 }
        L_0x0064:
            boolean r0 = r3 instanceof X.AnonymousClass1IU     // Catch:{ Exception -> 0x00a2 }
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x00ac
            X.4XG r0 = r7.A06     // Catch:{ Exception -> 0x00a2 }
            boolean r0 = r0.A00()     // Catch:{ Exception -> 0x00a2 }
            if (r0 == 0) goto L_0x0091
            if (r9 == 0) goto L_0x0091
            X.C30691eM.A01(r3)     // Catch:{ Exception -> 0x00a2 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ Exception -> 0x00a2 }
            r4.L$0 = r6     // Catch:{ Exception -> 0x00a2 }
            r0 = 0
            r4.L$1 = r0     // Catch:{ Exception -> 0x00a2 }
            r4.L$2 = r0     // Catch:{ Exception -> 0x00a2 }
            r4.L$3 = r0     // Catch:{ Exception -> 0x00a2 }
            r4.label = r2     // Catch:{ Exception -> 0x00a2 }
            java.lang.Object r3 = r7.A03(r8, r9, r3, r4)     // Catch:{ Exception -> 0x00a2 }
            if (r3 != r5) goto L_0x008e
            return r5
        L_0x008b:
            X.C30691eM.A01(r3)     // Catch:{ Exception -> 0x00a2 }
        L_0x008e:
            java.util.List r3 = (java.util.List) r3     // Catch:{ Exception -> 0x00a2 }
            goto L_0x0096
        L_0x0091:
            X.C30691eM.A01(r3)     // Catch:{ Exception -> 0x00a2 }
            java.util.List r3 = (java.util.List) r3     // Catch:{ Exception -> 0x00a2 }
        L_0x0096:
            r0 = 0
            X.C18070vi.A0d(r3, r0)     // Catch:{ Exception -> 0x00a2 }
            com.whatsapp.group.GetSubgroupsManager r1 = r6.A00     // Catch:{ Exception -> 0x00a2 }
            X.1EC r0 = r6.A01     // Catch:{ Exception -> 0x00a2 }
            A04(r1, r0, r3)     // Catch:{ Exception -> 0x00a2 }
            goto L_0x00ac
        L_0x00a2:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GetSubgroupsProtocolHelper/sendGetSubgroupsRequest/error: "
            X.C17900vP.A0X(r2, r0, r1)
        L_0x00ac:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.GetSubgroupsManager.A00(X.9b5, com.whatsapp.group.GetSubgroupsManager, X.1EC, X.1EC, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00d8, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        X.CDX.A00(r4, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00dc, code lost:
        throw r1;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0062 A[Catch:{ 9LL -> 0x00dd }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00c4 A[Catch:{ all -> 0x00d8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.whatsapp.group.GetSubgroupsManager r14, X.AnonymousClass1EC r15, X.AnonymousClass1EC r16, java.util.List r17, X.C30391dr r18) {
        /*
            r4 = r18
            r0 = r17
            boolean r1 = r4 instanceof X.C21697AoQ
            if (r1 == 0) goto L_0x002e
            r5 = r4
            X.AoQ r5 = (X.C21697AoQ) r5
            int r3 = r5.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x002e
            int r3 = r3 - r2
            r5.label = r3
        L_0x0016:
            java.lang.Object r3 = r5.result
            X.1g4 r4 = X.C31751g4.COROUTINE_SUSPENDED
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L_0x0039
            if (r1 != r2) goto L_0x0034
            java.lang.Object r0 = r5.L$2
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r15 = r5.L$1
            com.whatsapp.jid.Jid r15 = (com.whatsapp.jid.Jid) r15
            java.lang.Object r14 = r5.L$0
            com.whatsapp.group.GetSubgroupsManager r14 = (com.whatsapp.group.GetSubgroupsManager) r14
            goto L_0x004f
        L_0x002e:
            X.AoQ r5 = new X.AoQ
            r5.<init>(r14, r4)
            goto L_0x0016
        L_0x0034:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0039:
            X.C30691eM.A01(r3)
            com.whatsapp.community.mex.GetSubgroupMemberCountGraphQlHandler r1 = r14.A03     // Catch:{ 9LL -> 0x00dd }
            r5.L$0 = r14     // Catch:{ 9LL -> 0x00dd }
            r5.L$1 = r15     // Catch:{ 9LL -> 0x00dd }
            r5.L$2 = r0     // Catch:{ 9LL -> 0x00dd }
            r5.label = r2     // Catch:{ 9LL -> 0x00dd }
            r2 = r16
            java.lang.Object r3 = r1.A00(r15, r2, r5)     // Catch:{ 9LL -> 0x00dd }
            if (r3 != r4) goto L_0x0052
            return r4
        L_0x004f:
            X.C30691eM.A01(r3)     // Catch:{ 9LL -> 0x00dd }
        L_0x0052:
            java.util.Map r3 = (java.util.Map) r3     // Catch:{ 9LL -> 0x00dd }
            java.util.ArrayList r1 = X.C29351c6.A0D(r0)     // Catch:{ 9LL -> 0x00dd }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ 9LL -> 0x00dd }
        L_0x005c:
            boolean r2 = r4.hasNext()     // Catch:{ 9LL -> 0x00dd }
            if (r2 == 0) goto L_0x008b
            java.lang.Object r5 = r4.next()     // Catch:{ 9LL -> 0x00dd }
            X.A2B r5 = (X.A2B) r5     // Catch:{ 9LL -> 0x00dd }
            com.whatsapp.jid.GroupJid r6 = r5.A02     // Catch:{ 9LL -> 0x00dd }
            java.lang.Number r2 = X.C108945cZ.A1E(r6, r3)     // Catch:{ 9LL -> 0x00dd }
            if (r2 == 0) goto L_0x0087
            int r2 = r2.intValue()     // Catch:{ 9LL -> 0x00dd }
            java.lang.Integer r8 = X.AnonymousClass3MW.A0v(r2)     // Catch:{ 9LL -> 0x00dd }
            java.lang.String r10 = r5.A06     // Catch:{ 9LL -> 0x00dd }
            long r12 = r5.A01     // Catch:{ 9LL -> 0x00dd }
            int r11 = r5.A00     // Catch:{ 9LL -> 0x00dd }
            java.lang.Integer r7 = r5.A03     // Catch:{ 9LL -> 0x00dd }
            java.lang.Long r9 = r5.A05     // Catch:{ 9LL -> 0x00dd }
            X.A2B r5 = new X.A2B     // Catch:{ 9LL -> 0x00dd }
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)     // Catch:{ 9LL -> 0x00dd }
        L_0x0087:
            r1.add(r5)     // Catch:{ 9LL -> 0x00dd }
            goto L_0x005c
        L_0x008b:
            X.00H r2 = r14.A01     // Catch:{ 9LL -> 0x00dd }
            X.1kb r4 = X.AnonymousClass3MW.A0Z(r2)     // Catch:{ 9LL -> 0x00dd }
            X.11P r2 = r14.A04     // Catch:{ 9LL -> 0x00dd }
            long r2 = X.AnonymousClass11P.A01(r2)     // Catch:{ 9LL -> 0x00dd }
            r7 = 0
            X.C18070vi.A0d(r15, r7)     // Catch:{ 9LL -> 0x00dd }
            X.1kV r4 = r4.A04     // Catch:{ 9LL -> 0x00dd }
            X.1Lt r4 = r4.A00     // Catch:{ 9LL -> 0x00dd }
            X.1au r4 = r4.A06()     // Catch:{ 9LL -> 0x00dd }
            r6 = 1
            android.content.ContentValues r9 = new android.content.ContentValues     // Catch:{ all -> 0x00d6 }
            r9.<init>(r6)     // Catch:{ all -> 0x00d6 }
            java.lang.String r5 = "subgroup_member_count_poll_time"
            X.C17880vN.A19(r9, r5, r2)     // Catch:{ all -> 0x00d6 }
            r2 = r4
            X.1av r2 = (X.C28801av) r2     // Catch:{ all -> 0x00d6 }
            X.1Ev r8 = r2.A02     // Catch:{ all -> 0x00d6 }
            java.lang.String r10 = "community_settings"
            java.lang.String r11 = "community_raw_jid = ?"
            java.lang.String[] r13 = new java.lang.String[r6]     // Catch:{ all -> 0x00d6 }
            X.C17880vN.A1J(r15, r13, r7)     // Catch:{ all -> 0x00d6 }
            java.lang.String r12 = "CommunitySettingsStore/updateMemberCountPollTime"
            int r2 = r8.A02(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x00d6 }
            if (r2 != 0) goto L_0x00d2
            java.lang.String r3 = "community_raw_jid"
            java.lang.String r2 = r15.getRawString()     // Catch:{ all -> 0x00d6 }
            r9.put(r3, r2)     // Catch:{ all -> 0x00d6 }
            java.lang.String r2 = "CommunitySettingsStore/insertMemberCountPollTime"
            r8.A05(r10, r2, r9)     // Catch:{ all -> 0x00d6 }
        L_0x00d2:
            r4.close()     // Catch:{ 9LL -> 0x00dd }
            return r1
        L_0x00d6:
            r2 = move-exception
            throw r2     // Catch:{ all -> 0x00d8 }
        L_0x00d8:
            r1 = move-exception
            X.CDX.A00(r4, r2)     // Catch:{ 9LL -> 0x00dd }
            throw r1     // Catch:{ 9LL -> 0x00dd }
        L_0x00dd:
            r1 = move-exception
            int r3 = r1.errorCode
            r1 = -1
            if (r3 == r1) goto L_0x0108
            r1 = 400(0x190, float:5.6E-43)
            if (r3 == r1) goto L_0x0101
            r1 = 500(0x1f4, float:7.0E-43)
            if (r3 == r1) goto L_0x0101
            r1 = 403(0x193, float:5.65E-43)
            if (r3 == r1) goto L_0x0101
            r1 = 404(0x194, float:5.66E-43)
            if (r3 == r1) goto L_0x0101
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "GetSubgroupMemberCountGraphQlHandler/fetch/unknown error: "
        L_0x00f9:
            X.C17900vP.A0i(r1, r2, r3)
            java.util.List r0 = X.C29431cG.A0t(r0)
            return r0
        L_0x0101:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "GetSubgroupMemberCountGraphQlHandler/fetch/server error: "
            goto L_0x00f9
        L_0x0108:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "GetSubgroupMemberCountGraphQlHandler/handleData/empty response: "
            goto L_0x00f9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.GetSubgroupsManager.A01(com.whatsapp.group.GetSubgroupsManager, X.1EC, X.1EC, java.util.List, X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0076 A[Catch:{ 9LK -> 0x00cb }, LOOP:0: B:21:0x0070->B:23:0x0076, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x008a A[Catch:{ 9LK -> 0x00cb }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00b5 A[Catch:{ 9LK -> 0x00cb }, LOOP:1: B:33:0x00af->B:35:0x00b5, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(com.whatsapp.group.GetSubgroupsManager r7, X.AnonymousClass1EC r8, X.AnonymousClass1EC r9, X.C30391dr r10) {
        /*
            boolean r0 = r10 instanceof X.C21698AoR
            if (r0 == 0) goto L_0x002d
            r4 = r10
            X.AoR r4 = (X.C21698AoR) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002d
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r3 = r4.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r5 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0045
            if (r0 == r1) goto L_0x0038
            if (r0 != r5) goto L_0x0033
            java.lang.Object r1 = r4.L$2
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r8 = r4.L$1
            X.1EC r8 = (X.AnonymousClass1EC) r8
            java.lang.Object r7 = r4.L$0
            com.whatsapp.group.GetSubgroupsManager r7 = (com.whatsapp.group.GetSubgroupsManager) r7
            goto L_0x009c
        L_0x002d:
            X.AoR r4 = new X.AoR
            r4.<init>(r7, r10)
            goto L_0x0012
        L_0x0033:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0038:
            java.lang.Object r9 = r4.L$2
            X.1EC r9 = (X.AnonymousClass1EC) r9
            java.lang.Object r8 = r4.L$1
            X.1EC r8 = (X.AnonymousClass1EC) r8
            java.lang.Object r7 = r4.L$0
            com.whatsapp.group.GetSubgroupsManager r7 = (com.whatsapp.group.GetSubgroupsManager) r7
            goto L_0x005f
        L_0x0045:
            X.C30691eM.A01(r3)
            X.00H r0 = r7.A08     // Catch:{ 9LK -> 0x00cb }
            java.lang.Object r0 = r0.get()     // Catch:{ 9LK -> 0x00cb }
            com.whatsapp.community.mex.GetSubgroupsGraphQlHandler r0 = (com.whatsapp.community.mex.GetSubgroupsGraphQlHandler) r0     // Catch:{ 9LK -> 0x00cb }
            r4.L$0 = r7     // Catch:{ 9LK -> 0x00cb }
            r4.L$1 = r8     // Catch:{ 9LK -> 0x00cb }
            r4.L$2 = r9     // Catch:{ 9LK -> 0x00cb }
            r4.label = r1     // Catch:{ 9LK -> 0x00cb }
            java.lang.Object r3 = r0.A00(r8, r9, r4)     // Catch:{ 9LK -> 0x00cb }
            if (r3 != r2) goto L_0x0062
            return r2
        L_0x005f:
            X.C30691eM.A01(r3)     // Catch:{ 9LK -> 0x00cb }
        L_0x0062:
            java.util.List r3 = (java.util.List) r3     // Catch:{ 9LK -> 0x00cb }
            r0 = 0
            X.C18070vi.A0d(r3, r0)     // Catch:{ 9LK -> 0x00cb }
            java.util.ArrayList r6 = X.C29351c6.A0D(r3)     // Catch:{ 9LK -> 0x00cb }
            java.util.Iterator r1 = r3.iterator()     // Catch:{ 9LK -> 0x00cb }
        L_0x0070:
            boolean r0 = r1.hasNext()     // Catch:{ 9LK -> 0x00cb }
            if (r0 == 0) goto L_0x0082
            java.lang.Object r0 = r1.next()     // Catch:{ 9LK -> 0x00cb }
            X.2lc r0 = (X.C59012lc) r0     // Catch:{ 9LK -> 0x00cb }
            X.A2B r0 = r0.A00     // Catch:{ 9LK -> 0x00cb }
            r6.add(r0)     // Catch:{ 9LK -> 0x00cb }
            goto L_0x0070
        L_0x0082:
            X.4XG r0 = r7.A06     // Catch:{ 9LK -> 0x00cb }
            boolean r0 = r0.A00()     // Catch:{ 9LK -> 0x00cb }
            if (r0 == 0) goto L_0x00a3
            r4.L$0 = r7     // Catch:{ 9LK -> 0x00cb }
            r4.L$1 = r8     // Catch:{ 9LK -> 0x00cb }
            r4.L$2 = r3     // Catch:{ 9LK -> 0x00cb }
            r4.label = r5     // Catch:{ 9LK -> 0x00cb }
            java.lang.Object r0 = r7.A03(r8, r9, r6, r4)     // Catch:{ 9LK -> 0x00cb }
            if (r0 == r2) goto L_0x009b
            r1 = r3
            r3 = r0
            goto L_0x009f
        L_0x009b:
            return r2
        L_0x009c:
            X.C30691eM.A01(r3)     // Catch:{ 9LK -> 0x00cb }
        L_0x009f:
            r6 = r3
            java.util.List r6 = (java.util.List) r6     // Catch:{ 9LK -> 0x00cb }
            r3 = r1
        L_0x00a3:
            X.00H r0 = r7.A02     // Catch:{ 9LK -> 0x00cb }
            java.lang.Object r5 = r0.get()     // Catch:{ 9LK -> 0x00cb }
            X.126 r5 = (X.AnonymousClass126) r5     // Catch:{ 9LK -> 0x00cb }
            java.util.Iterator r4 = r3.iterator()     // Catch:{ 9LK -> 0x00cb }
        L_0x00af:
            boolean r0 = r4.hasNext()     // Catch:{ 9LK -> 0x00cb }
            if (r0 == 0) goto L_0x00c7
            java.lang.Object r3 = r4.next()     // Catch:{ 9LK -> 0x00cb }
            X.2lc r3 = (X.C59012lc) r3     // Catch:{ 9LK -> 0x00cb }
            X.1M9 r2 = r5.A08     // Catch:{ 9LK -> 0x00cb }
            X.A2B r0 = r3.A00     // Catch:{ 9LK -> 0x00cb }
            com.whatsapp.jid.GroupJid r1 = r0.A02     // Catch:{ 9LK -> 0x00cb }
            boolean r0 = r3.A01     // Catch:{ 9LK -> 0x00cb }
            r2.A0d(r1, r0)     // Catch:{ 9LK -> 0x00cb }
            goto L_0x00af
        L_0x00c7:
            A04(r7, r8, r6)     // Catch:{ 9LK -> 0x00cb }
            goto L_0x00ea
        L_0x00cb:
            r0 = move-exception
            int r2 = r0.errorCode
            r0 = -1
            if (r2 == r0) goto L_0x00f4
            r0 = 400(0x190, float:5.6E-43)
            if (r2 == r0) goto L_0x00ed
            r0 = 500(0x1f4, float:7.0E-43)
            if (r2 == r0) goto L_0x00ed
            r0 = 403(0x193, float:5.65E-43)
            if (r2 == r0) goto L_0x00ed
            r0 = 404(0x194, float:5.66E-43)
            if (r2 == r0) goto L_0x00ed
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GetSubgroupsGraphQlHandler/fetch/unknown error: "
        L_0x00e7:
            X.C17900vP.A0i(r0, r1, r2)
        L_0x00ea:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x00ed:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GetSubgroupsGraphQlHandler/fetch/server error: "
            goto L_0x00e7
        L_0x00f4:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "GetSubgroupsGraphQlHandler/handleData/empty response: "
            goto L_0x00e7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.group.GetSubgroupsManager.A02(com.whatsapp.group.GetSubgroupsManager, X.1EC, X.1EC, X.1dr):java.lang.Object");
    }

    public static final void A04(GetSubgroupsManager getSubgroupsManager, AnonymousClass1EC r8, List list) {
        AnonymousClass126 r4 = (AnonymousClass126) getSubgroupsManager.A02.get();
        Log.i("groupChatManger/onSubGroupsChanged");
        C34511kb A0Z = AnonymousClass3MW.A0Z(r4.A0m);
        C18070vi.A0h(r8, list);
        AnonymousClass1MG r6 = A0Z.A08;
        r6.A04();
        ArrayList A052 = r6.A00.A05(r8, list);
        Map map = r6.A01;
        C61492pm r7 = (C61492pm) map.get(r8);
        if (r7 == null) {
            r7 = new C61492pm();
        }
        C61492pm r3 = new C61492pm(r7.A00, r7.A01, AnonymousClass8BR.A12(A052));
        for (A2B a2b : r7.A02) {
            r6.A02.remove(a2b.A02);
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r6.A02.put(((A2B) it.next()).A02, r8);
        }
        map.put(r8, r3);
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            A2B a2b2 = (A2B) it2.next();
            C29691ci A0A2 = r4.A0I.A0A(a2b2.A02);
            if (A0A2 != null) {
                A0A2.A03 = a2b2.A00;
            }
        }
        r4.A04.CGP(new C146797Qq(r4, r8, 47));
    }

    public final void A05(AnonymousClass1EC r9) {
        C42941yz r0 = AnonymousClass1EC.A01;
        AnonymousClass1EC A002 = C42941yz.A00(AnonymousClass3MW.A0Z(this.A01).A02(r9));
        boolean A052 = C18020vd.A05(C18040vf.A02, this.A07, 7598);
        AnonymousClass3MX.A1Q(new GetSubgroupsManager$fetchSubgroups$1(this, r9, A002, (C30391dr) null, A052), this.A0A);
    }

    public GetSubgroupsManager(GetSubgroupMemberCountGraphQlHandler getSubgroupMemberCountGraphQlHandler, AnonymousClass11P r2, C34451kV r3, AnonymousClass1MZ r4, AnonymousClass4XG r5, C18030ve r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass1OX r11) {
        C18070vi.A0w(r11, r2, r6, r7, r3);
        C18070vi.A0x(r8, r4, r9, r10, r5);
        this.A0A = r11;
        this.A04 = r2;
        this.A07 = r6;
        this.A01 = r7;
        this.A05 = r3;
        this.A02 = r8;
        this.A00 = r4;
        this.A08 = r9;
        this.A09 = r10;
        this.A06 = r5;
        this.A03 = getSubgroupMemberCountGraphQlHandler;
    }

    private final Object A03(AnonymousClass1EC r5, AnonymousClass1EC r6, List list, C30391dr r8) {
        if (!A06(r5)) {
            if (!C108945cZ.A1U(C41841x9.A06(AnonymousClass1b2.A08(AnonymousClass1b2.A0C(B30.A00, AnonymousClass1b2.A09(C22322B2z.A00, C29431cG.A0V(AnonymousClass3MW.A0Z(this.A01).A07(r5))))), AnonymousClass1b2.A08(new C147157Sa(new C22193Az9(this), AnonymousClass1b2.A0C(C22321B2y.A00, C29431cG.A0V(list)), false))))) {
                return list;
            }
        }
        return A01(this, r5, r6, list, r8);
    }
}
