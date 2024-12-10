package com.whatsapp.community.mex;

import X.AnonymousClass00H;
import X.C18030ve;
import X.C18070vi;

public final class GetSubgroupsGraphQlHandler {
    public final C18030ve A00;
    public final AnonymousClass00H A01;

    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0141, code lost:
        if (X.C20125A8k.A00(r6, "total_count") <= 0) goto L_0x0143;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008b A[Catch:{ 1Uc -> 0x023b }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00e8 A[Catch:{ 1Uc -> 0x023b }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0233 A[Catch:{ 1Uc -> 0x023b }] */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x023a A[Catch:{ 1Uc -> 0x023b }, RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass1EC r22, X.AnonymousClass1EC r23, X.C30391dr r24) {
        /*
            r21 = this;
            r4 = r24
            boolean r0 = r4 instanceof X.C21644AnZ
            r1 = r21
            if (r0 == 0) goto L_0x0026
            r5 = r4
            X.AnZ r5 = (X.C21644AnZ) r5
            int r3 = r5.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r3 & r2
            if (r0 == 0) goto L_0x0026
            int r3 = r3 - r2
            r5.label = r3
        L_0x0016:
            java.lang.Object r7 = r5.result
            X.1g4 r2 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r5.label
            r4 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 != r4) goto L_0x002c
            java.lang.Object r1 = r5.L$0
            com.whatsapp.community.mex.GetSubgroupsGraphQlHandler r1 = (com.whatsapp.community.mex.GetSubgroupsGraphQlHandler) r1
            goto L_0x0078
        L_0x0026:
            X.AnZ r5 = new X.AnZ
            r5.<init>(r1, r4)
            goto L_0x0016
        L_0x002c:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0031:
            X.C30691eM.A01(r7)
            X.00H r0 = r1.A01     // Catch:{ 1Uc -> 0x023b }
            java.lang.Object r8 = r0.get()     // Catch:{ 1Uc -> 0x023b }
            X.1PY r8 = (X.AnonymousClass1PY) r8     // Catch:{ 1Uc -> 0x023b }
            X.A7K r7 = X.A7K.A00()     // Catch:{ 1Uc -> 0x023b }
            com.whatsapp.infra.graphql.generated.groups.calls.XWA2GroupQueryInput r6 = new com.whatsapp.infra.graphql.generated.groups.calls.XWA2GroupQueryInput     // Catch:{ 1Uc -> 0x023b }
            r6.<init>()     // Catch:{ 1Uc -> 0x023b }
            java.lang.String r3 = r22.getRawString()     // Catch:{ 1Uc -> 0x023b }
            java.lang.String r0 = "group_id"
            r6.A05(r0, r3)     // Catch:{ 1Uc -> 0x023b }
            java.lang.String r3 = r23.getRawString()     // Catch:{ 1Uc -> 0x023b }
            java.lang.String r0 = "sub_group_hint"
            r6.A05(r0, r3)     // Catch:{ 1Uc -> 0x023b }
            java.lang.String r3 = "INTERACTIVE"
            java.lang.String r0 = "query_context"
            r6.A05(r0, r3)     // Catch:{ 1Uc -> 0x023b }
            java.lang.String r0 = "group_input"
            r7.A04(r6, r0)     // Catch:{ 1Uc -> 0x023b }
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl> r3 = com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl.class
            java.lang.String r0 = "QuerySubgroups"
            X.A2g r3 = X.AIj.A01(r7, r8, r3, r0)     // Catch:{ 1Uc -> 0x023b }
            r5.L$0 = r1     // Catch:{ 1Uc -> 0x023b }
            r5.label = r4     // Catch:{ 1Uc -> 0x023b }
            X.B33 r0 = X.B33.A00     // Catch:{ 1Uc -> 0x023b }
            java.lang.Object r7 = r3.A01(r5, r0)     // Catch:{ 1Uc -> 0x023b }
            if (r7 != r2) goto L_0x007b
            return r2
        L_0x0078:
            X.C30691eM.A01(r7)     // Catch:{ 1Uc -> 0x023b }
        L_0x007b:
            X.A8k r7 = (X.C20125A8k) r7     // Catch:{ 1Uc -> 0x023b }
            java.util.ArrayList r2 = X.C72463Mc.A0s(r7)     // Catch:{ 1Uc -> 0x023b }
            java.lang.String r6 = "xwa2_group_query_by_id"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl$Xwa2GroupQueryById> r5 = com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl.Xwa2GroupQueryById.class
            X.A8k r0 = r7.A09(r5, r6)     // Catch:{ 1Uc -> 0x023b }
            if (r0 == 0) goto L_0x00e2
            org.json.JSONObject r9 = r0.A00     // Catch:{ 1Uc -> 0x023b }
            int r3 = X.AnonymousClass8BT.A03(r9)     // Catch:{ 1Uc -> 0x023b }
            r0 = -1008570490(0xffffffffc3e26f86, float:-452.87128)
            if (r3 != r0) goto L_0x00e2
            com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup r8 = new com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup     // Catch:{ 1Uc -> 0x023b }
            r8.<init>(r9)     // Catch:{ 1Uc -> 0x023b }
            java.lang.String r3 = "default_sub_group"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup$DefaultSubGroup> r0 = com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityGroup.DefaultSubGroup.class
            X.A8k r11 = X.C108985cd.A0I(r8, r0, r3)     // Catch:{ 1Uc -> 0x023b }
            r3 = 0
            X.1yz r0 = X.AnonymousClass1EC.A01     // Catch:{ 1Uc -> 0x023b }
            java.lang.String r0 = "id"
            java.lang.String r0 = X.C72453Mb.A0z(r11, r0)     // Catch:{ 1Uc -> 0x023b }
            X.1EC r12 = X.C42941yz.A01(r0)     // Catch:{ 1Uc -> 0x023b }
            java.lang.String r10 = "subject"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup$DefaultSubGroup$Subject> r9 = com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityGroup.DefaultSubGroup.Subject.class
            X.A8k r8 = r11.A09(r9, r10)     // Catch:{ 1Uc -> 0x023b }
            if (r8 == 0) goto L_0x0226
            java.lang.String r0 = "value"
            java.lang.String r16 = X.C72453Mb.A0z(r8, r0)     // Catch:{ 1Uc -> 0x023b }
        L_0x00c0:
            X.A8k r8 = r11.A09(r9, r10)     // Catch:{ 1Uc -> 0x023b }
            if (r8 == 0) goto L_0x0223
            java.lang.String r0 = "creation_time"
            java.lang.String r0 = r8.A0F(r0)     // Catch:{ 1Uc -> 0x023b }
        L_0x00cc:
            long r18 = X.C20099A7c.A02(r0)     // Catch:{ 1Uc -> 0x023b }
            r13 = 0
            r17 = 3
            X.A2B r11 = new X.A2B     // Catch:{ 1Uc -> 0x023b }
            r15 = r13
            r14 = r13
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)     // Catch:{ 1Uc -> 0x023b }
            X.2lc r0 = new X.2lc     // Catch:{ 1Uc -> 0x023b }
            r0.<init>(r11, r3)     // Catch:{ 1Uc -> 0x023b }
            r2.add(r0)     // Catch:{ 1Uc -> 0x023b }
        L_0x00e2:
            X.A8k r0 = r7.A09(r5, r6)     // Catch:{ 1Uc -> 0x023b }
            if (r0 == 0) goto L_0x022d
            org.json.JSONObject r6 = r0.A00     // Catch:{ 1Uc -> 0x023b }
            int r3 = X.AnonymousClass8BT.A03(r6)     // Catch:{ 1Uc -> 0x023b }
            r0 = -1008570490(0xffffffffc3e26f86, float:-452.87128)
            if (r3 != r0) goto L_0x022d
            com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup r5 = new com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup     // Catch:{ 1Uc -> 0x023b }
            r5.<init>(r6)     // Catch:{ 1Uc -> 0x023b }
            java.lang.String r3 = "sub_groups"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup$SubGroups> r0 = com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityGroup.SubGroups.class
            X.A8k r5 = r5.A09(r0, r3)     // Catch:{ 1Uc -> 0x023b }
            if (r5 == 0) goto L_0x022d
            java.lang.String r3 = "edges"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup$SubGroups$Edges> r0 = com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityGroup.SubGroups.Edges.class
            X.1IX r0 = X.C108955ca.A0J(r5, r0, r3)     // Catch:{ 1Uc -> 0x023b }
            java.util.ArrayList r3 = X.C108965cb.A0t(r0)     // Catch:{ 1Uc -> 0x023b }
            java.util.Iterator r11 = r0.iterator()     // Catch:{ 1Uc -> 0x023b }
        L_0x0112:
            boolean r0 = r11.hasNext()     // Catch:{ 1Uc -> 0x023b }
            if (r0 == 0) goto L_0x022a
            X.A8k r7 = X.C108945cZ.A0V(r11)     // Catch:{ 1Uc -> 0x023b }
            X.0ve r6 = r1.A00     // Catch:{ 1Uc -> 0x023b }
            r5 = 7180(0x1c0c, float:1.0061E-41)
            X.0vf r0 = X.C18040vf.A02     // Catch:{ 1Uc -> 0x023b }
            boolean r6 = X.C18020vd.A05(r0, r6, r5)     // Catch:{ 1Uc -> 0x023b }
            java.lang.String r5 = "node"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup$SubGroups$Edges$Node> r0 = com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityGroup.SubGroups.Edges.Node.class
            X.A8k r0 = X.C108985cd.A0I(r7, r0, r5)     // Catch:{ 1Uc -> 0x023b }
            if (r6 == 0) goto L_0x01a4
            java.lang.String r6 = "membership_approval_requests"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup$SubGroups$Edges$Node$MembershipApprovalRequests> r5 = com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityGroup.SubGroups.Edges.Node.MembershipApprovalRequests.class
            X.A8k r6 = r0.A09(r5, r6)     // Catch:{ 1Uc -> 0x023b }
            if (r6 == 0) goto L_0x0143
            java.lang.String r5 = "total_count"
            int r5 = X.C20125A8k.A00(r6, r5)     // Catch:{ 1Uc -> 0x023b }
            r10 = 1
            if (r5 > 0) goto L_0x0144
        L_0x0143:
            r10 = 0
        L_0x0144:
            X.1yz r5 = X.AnonymousClass1EC.A01     // Catch:{ 1Uc -> 0x023b }
            java.lang.String r5 = "id"
            java.lang.String r5 = X.C72453Mb.A0z(r0, r5)     // Catch:{ 1Uc -> 0x023b }
            X.1EC r13 = X.C42941yz.A01(r5)     // Catch:{ 1Uc -> 0x023b }
            java.lang.String r8 = "subject"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup$SubGroups$Edges$Node$Subject> r7 = com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityGroup.SubGroups.Edges.Node.Subject.class
            X.A8k r6 = r0.A09(r7, r8)     // Catch:{ 1Uc -> 0x023b }
            if (r6 == 0) goto L_0x0185
            java.lang.String r5 = "value"
            java.lang.String r17 = X.C72453Mb.A0z(r6, r5)     // Catch:{ 1Uc -> 0x023b }
        L_0x0160:
            X.A8k r6 = r0.A09(r7, r8)     // Catch:{ 1Uc -> 0x023b }
            if (r6 == 0) goto L_0x0183
            java.lang.String r5 = "creation_time"
            java.lang.String r5 = r6.A0F(r5)     // Catch:{ 1Uc -> 0x023b }
        L_0x016c:
            long r19 = X.C20099A7c.A02(r5)     // Catch:{ 1Uc -> 0x023b }
            java.lang.String r7 = "properties"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup$SubGroups$Edges$Node$Properties> r6 = com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityGroup.SubGroups.Edges.Node.Properties.class
            X.A8k r8 = X.C108985cd.A0I(r0, r6, r7)     // Catch:{ 1Uc -> 0x023b }
            java.lang.String r5 = "general_chat"
            boolean r5 = r8.A0G(r5)     // Catch:{ 1Uc -> 0x023b }
            r18 = 2
            if (r5 == 0) goto L_0x018a
            goto L_0x0188
        L_0x0183:
            r5 = 0
            goto L_0x016c
        L_0x0185:
            java.lang.String r17 = ""
            goto L_0x0160
        L_0x0188:
            r18 = 6
        L_0x018a:
            X.A8k r8 = X.C108985cd.A0I(r0, r6, r7)     // Catch:{ 1Uc -> 0x023b }
            java.lang.String r5 = "membership_approval_mode_enabled"
            boolean r9 = r8.A0G(r5)     // Catch:{ 1Uc -> 0x023b }
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r10)     // Catch:{ 1Uc -> 0x023b }
            r8 = 0
            if (r9 == 0) goto L_0x0203
            r8 = 1
            boolean r5 = X.C18070vi.A19(r5, r4)     // Catch:{ 1Uc -> 0x023b }
            if (r5 == 0) goto L_0x0203
            r8 = 2
            goto L_0x0203
        L_0x01a4:
            X.1yz r5 = X.AnonymousClass1EC.A01     // Catch:{ 1Uc -> 0x023b }
            java.lang.String r5 = "id"
            java.lang.String r5 = X.C72453Mb.A0z(r0, r5)     // Catch:{ 1Uc -> 0x023b }
            X.1EC r13 = X.C42941yz.A01(r5)     // Catch:{ 1Uc -> 0x023b }
            java.lang.String r8 = "subject"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup$SubGroups$Edges$Node$Subject> r7 = com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityGroup.SubGroups.Edges.Node.Subject.class
            X.A8k r6 = r0.A09(r7, r8)     // Catch:{ 1Uc -> 0x023b }
            if (r6 == 0) goto L_0x01e5
            java.lang.String r5 = "value"
            java.lang.String r17 = X.C72453Mb.A0z(r6, r5)     // Catch:{ 1Uc -> 0x023b }
        L_0x01c0:
            X.A8k r6 = r0.A09(r7, r8)     // Catch:{ 1Uc -> 0x023b }
            if (r6 == 0) goto L_0x01e3
            java.lang.String r5 = "creation_time"
            java.lang.String r5 = r6.A0F(r5)     // Catch:{ 1Uc -> 0x023b }
        L_0x01cc:
            long r19 = X.C20099A7c.A02(r5)     // Catch:{ 1Uc -> 0x023b }
            java.lang.String r7 = "properties"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup$SubGroups$Edges$Node$Properties> r6 = com.whatsapp.infra.graphql.generated.groups.QuerySubgroupsResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityGroup.SubGroups.Edges.Node.Properties.class
            X.A8k r8 = X.C108985cd.A0I(r0, r6, r7)     // Catch:{ 1Uc -> 0x023b }
            java.lang.String r5 = "general_chat"
            boolean r5 = r8.A0G(r5)     // Catch:{ 1Uc -> 0x023b }
            r18 = 2
            if (r5 == 0) goto L_0x01ea
            goto L_0x01e8
        L_0x01e3:
            r5 = 0
            goto L_0x01cc
        L_0x01e5:
            java.lang.String r17 = ""
            goto L_0x01c0
        L_0x01e8:
            r18 = 6
        L_0x01ea:
            r14 = 0
            X.A2B r12 = new X.A2B     // Catch:{ 1Uc -> 0x023b }
            r16 = r14
            r15 = r14
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ 1Uc -> 0x023b }
            X.A8k r5 = X.C108985cd.A0I(r0, r6, r7)     // Catch:{ 1Uc -> 0x023b }
            java.lang.String r0 = "hidden_group"
            boolean r0 = r5.A0G(r0)     // Catch:{ 1Uc -> 0x023b }
            X.2lc r5 = new X.2lc     // Catch:{ 1Uc -> 0x023b }
            r5.<init>(r12, r0)     // Catch:{ 1Uc -> 0x023b }
            goto L_0x021e
        L_0x0203:
            java.lang.Integer r14 = java.lang.Integer.valueOf(r8)     // Catch:{ 1Uc -> 0x023b }
            r15 = 0
            X.A2B r12 = new X.A2B     // Catch:{ 1Uc -> 0x023b }
            r16 = r15
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)     // Catch:{ 1Uc -> 0x023b }
            X.A8k r5 = X.C108985cd.A0I(r0, r6, r7)     // Catch:{ 1Uc -> 0x023b }
            java.lang.String r0 = "hidden_group"
            boolean r0 = r5.A0G(r0)     // Catch:{ 1Uc -> 0x023b }
            X.2lc r5 = new X.2lc     // Catch:{ 1Uc -> 0x023b }
            r5.<init>(r12, r0)     // Catch:{ 1Uc -> 0x023b }
        L_0x021e:
            r3.add(r5)     // Catch:{ 1Uc -> 0x023b }
            goto L_0x0112
        L_0x0223:
            r0 = 0
            goto L_0x00cc
        L_0x0226:
            java.lang.String r16 = ""
            goto L_0x00c0
        L_0x022a:
            r2.addAll(r3)     // Catch:{ 1Uc -> 0x023b }
        L_0x022d:
            boolean r0 = r2.isEmpty()     // Catch:{ 1Uc -> 0x023b }
            if (r0 == 0) goto L_0x023a
            r1 = -1
            X.9LK r0 = new X.9LK     // Catch:{ 1Uc -> 0x023b }
            r0.<init>(r1)     // Catch:{ 1Uc -> 0x023b }
            throw r0     // Catch:{ 1Uc -> 0x023b }
        L_0x023a:
            return r2
        L_0x023b:
            r0 = move-exception
            X.A6Z r0 = r0.error
            int r1 = X.A6Z.A00(r0)
            X.9LK r0 = new X.9LK
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.mex.GetSubgroupsGraphQlHandler.A00(X.1EC, X.1EC, X.1dr):java.lang.Object");
    }

    public GetSubgroupsGraphQlHandler(C18030ve r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }
}
