package com.whatsapp.community.mex;

import X.AnonymousClass1PY;
import X.C18070vi;

public final class GetSubgroupMemberCountGraphQlHandler {
    public final AnonymousClass1PY A00;

    public GetSubgroupMemberCountGraphQlHandler(AnonymousClass1PY r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007d A[Catch:{ 1Uc -> 0x00c0 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass1EC r9, X.AnonymousClass1EC r10, X.C30391dr r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof X.C21643AnY
            if (r0 == 0) goto L_0x001e
            r4 = r11
            X.AnY r4 = (X.C21643AnY) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x001e
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r2 = r4.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r4.label
            r6 = 1
            if (r0 == 0) goto L_0x0029
            if (r0 != r6) goto L_0x0024
            goto L_0x006a
        L_0x001e:
            X.AnY r4 = new X.AnY
            r4.<init>(r8, r11)
            goto L_0x0012
        L_0x0024:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0029:
            X.C30691eM.A01(r2)
            X.1PY r7 = r8.A00     // Catch:{ 1Uc -> 0x00c0 }
            X.A7K r3 = X.A7K.A00()     // Catch:{ 1Uc -> 0x00c0 }
            com.whatsapp.infra.graphql.generated.groups.calls.XWA2GroupQueryInput r2 = new com.whatsapp.infra.graphql.generated.groups.calls.XWA2GroupQueryInput     // Catch:{ 1Uc -> 0x00c0 }
            r2.<init>()     // Catch:{ 1Uc -> 0x00c0 }
            java.lang.String r1 = r9.getRawString()     // Catch:{ 1Uc -> 0x00c0 }
            java.lang.String r0 = "group_id"
            r2.A05(r0, r1)     // Catch:{ 1Uc -> 0x00c0 }
            java.lang.String r1 = r10.getRawString()     // Catch:{ 1Uc -> 0x00c0 }
            java.lang.String r0 = "sub_group_hint"
            r2.A05(r0, r1)     // Catch:{ 1Uc -> 0x00c0 }
            java.lang.String r1 = "INTERACTIVE"
            java.lang.String r0 = "query_context"
            r2.A05(r0, r1)     // Catch:{ 1Uc -> 0x00c0 }
            java.lang.String r0 = "input"
            r3.A04(r2, r0)     // Catch:{ 1Uc -> 0x00c0 }
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySubgroupParticipantCountResponseImpl> r1 = com.whatsapp.infra.graphql.generated.groups.QuerySubgroupParticipantCountResponseImpl.class
            java.lang.String r0 = "QuerySubgroupParticipantCount"
            X.A2g r1 = X.AIj.A01(r3, r7, r1, r0)     // Catch:{ 1Uc -> 0x00c0 }
            r4.L$0 = r8     // Catch:{ 1Uc -> 0x00c0 }
            r4.label = r6     // Catch:{ 1Uc -> 0x00c0 }
            X.B33 r0 = X.B33.A00     // Catch:{ 1Uc -> 0x00c0 }
            java.lang.Object r2 = r1.A01(r4, r0)     // Catch:{ 1Uc -> 0x00c0 }
            if (r2 != r5) goto L_0x006d
            return r5
        L_0x006a:
            X.C30691eM.A01(r2)     // Catch:{ 1Uc -> 0x00c0 }
        L_0x006d:
            X.A8k r2 = (X.C20125A8k) r2     // Catch:{ 1Uc -> 0x00c0 }
            r0 = 0
            X.C18070vi.A0d(r2, r0)     // Catch:{ 1Uc -> 0x00c0 }
            java.lang.String r1 = "xwa2_group_query_by_id"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySubgroupParticipantCountResponseImpl$Xwa2GroupQueryById> r0 = com.whatsapp.infra.graphql.generated.groups.QuerySubgroupParticipantCountResponseImpl.Xwa2GroupQueryById.class
            X.A8k r0 = r2.A09(r0, r1)     // Catch:{ 1Uc -> 0x00c0 }
            if (r0 == 0) goto L_0x00bd
            org.json.JSONObject r3 = r0.A00     // Catch:{ 1Uc -> 0x00c0 }
            int r1 = X.AnonymousClass8BT.A03(r3)     // Catch:{ 1Uc -> 0x00c0 }
            r0 = -1008570490(0xffffffffc3e26f86, float:-452.87128)
            if (r1 != r0) goto L_0x00bd
            com.whatsapp.infra.graphql.generated.groups.QuerySubgroupParticipantCountResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup r2 = new com.whatsapp.infra.graphql.generated.groups.QuerySubgroupParticipantCountResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup     // Catch:{ 1Uc -> 0x00c0 }
            r2.<init>(r3)     // Catch:{ 1Uc -> 0x00c0 }
            java.lang.String r1 = "sub_groups"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySubgroupParticipantCountResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup$SubGroups> r0 = com.whatsapp.infra.graphql.generated.groups.QuerySubgroupParticipantCountResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityGroup.SubGroups.class
            X.A8k r2 = r2.A09(r0, r1)     // Catch:{ 1Uc -> 0x00c0 }
            if (r2 == 0) goto L_0x00bd
            java.lang.String r1 = "edges"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySubgroupParticipantCountResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup$SubGroups$Edges> r0 = com.whatsapp.infra.graphql.generated.groups.QuerySubgroupParticipantCountResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityGroup.SubGroups.Edges.class
            X.1IX r2 = X.C108955ca.A0J(r2, r0, r1)     // Catch:{ 1Uc -> 0x00c0 }
            X.C18070vi.A0X(r2)     // Catch:{ 1Uc -> 0x00c0 }
            r0 = 4
            X.4so r1 = new X.4so     // Catch:{ 1Uc -> 0x00c0 }
            r1.<init>(r2, r0)     // Catch:{ 1Uc -> 0x00c0 }
            X.B25 r0 = X.B25.A00     // Catch:{ 1Uc -> 0x00c0 }
            X.7Sa r1 = X.AnonymousClass1b2.A09(r0, r1)     // Catch:{ 1Uc -> 0x00c0 }
            X.B26 r0 = X.B26.A00     // Catch:{ 1Uc -> 0x00c0 }
            X.1b3 r0 = X.AnonymousClass1b2.A0C(r0, r1)     // Catch:{ 1Uc -> 0x00c0 }
            java.util.Set r0 = X.AnonymousClass1b2.A08(r0)     // Catch:{ 1Uc -> 0x00c0 }
        L_0x00b8:
            java.util.Map r0 = X.AnonymousClass1D7.A0D(r0)     // Catch:{ 1Uc -> 0x00c0 }
            return r0
        L_0x00bd:
            X.1Om r0 = X.C25511Om.A00     // Catch:{ 1Uc -> 0x00c0 }
            goto L_0x00b8
        L_0x00c0:
            r2 = move-exception
            X.A6Z r0 = r2.error
            int r1 = X.A6Z.A00(r0)
            X.9LL r0 = new X.9LL
            r0.<init>(r1, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.mex.GetSubgroupMemberCountGraphQlHandler.A00(X.1EC, X.1EC, X.1dr):java.lang.Object");
    }
}
