package com.whatsapp.community.mex;

import X.AnonymousClass00H;
import X.C18070vi;

public final class GetSuggestedGroupsGraphQlHandler {
    public final AnonymousClass00H A00;

    public GetSuggestedGroupsGraphQlHandler(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0091 A[Catch:{ 1Uc -> 0x0168 }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass1EC r21, X.AnonymousClass1EC r22, X.C30391dr r23) {
        /*
            r20 = this;
            r3 = r23
            r9 = r21
            boolean r0 = r3 instanceof X.C100654ur
            r7 = r20
            if (r0 == 0) goto L_0x0028
            r6 = r3
            X.4ur r6 = (X.C100654ur) r6
            int r2 = r6.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0028
            int r2 = r2 - r1
            r6.label = r2
        L_0x0018:
            java.lang.Object r2 = r6.result
            X.1g4 r5 = X.C31751g4.COROUTINE_SUSPENDED
            int r0 = r6.label
            r3 = 1
            if (r0 == 0) goto L_0x0033
            if (r0 != r3) goto L_0x002e
            java.lang.Object r9 = r6.L$0
            X.1EC r9 = (X.AnonymousClass1EC) r9
            goto L_0x0082
        L_0x0028:
            X.4ur r6 = new X.4ur
            r6.<init>(r7, r3)
            goto L_0x0018
        L_0x002e:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        L_0x0033:
            X.C30691eM.A01(r2)
            X.00H r0 = r7.A00     // Catch:{ 1Uc -> 0x0168 }
            java.lang.Object r8 = r0.get()     // Catch:{ 1Uc -> 0x0168 }
            X.1PY r8 = (X.AnonymousClass1PY) r8     // Catch:{ 1Uc -> 0x0168 }
            X.A7K r4 = new X.A7K     // Catch:{ 1Uc -> 0x0168 }
            r4.<init>()     // Catch:{ 1Uc -> 0x0168 }
            com.whatsapp.infra.graphql.generated.groups.calls.XWA2GroupQueryInput r2 = new com.whatsapp.infra.graphql.generated.groups.calls.XWA2GroupQueryInput     // Catch:{ 1Uc -> 0x0168 }
            r2.<init>()     // Catch:{ 1Uc -> 0x0168 }
            java.lang.String r1 = r9.getRawString()     // Catch:{ 1Uc -> 0x0168 }
            java.lang.String r0 = "group_id"
            r2.A05(r0, r1)     // Catch:{ 1Uc -> 0x0168 }
            java.lang.String r1 = r22.getRawString()     // Catch:{ 1Uc -> 0x0168 }
            java.lang.String r0 = "sub_group_hint"
            r2.A05(r0, r1)     // Catch:{ 1Uc -> 0x0168 }
            java.lang.String r1 = "INTERACTIVE"
            java.lang.String r0 = "query_context"
            r2.A05(r0, r1)     // Catch:{ 1Uc -> 0x0168 }
            java.lang.String r0 = "group_input"
            r4.A04(r2, r0)     // Catch:{ 1Uc -> 0x0168 }
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl> r2 = com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl.class
            java.lang.String r1 = "QuerySuggestedGroups"
            X.AIj r0 = new X.AIj     // Catch:{ 1Uc -> 0x0168 }
            r0.<init>(r4, r2, r1)     // Catch:{ 1Uc -> 0x0168 }
            X.A2g r1 = r8.A01(r0)     // Catch:{ 1Uc -> 0x0168 }
            r6.L$0 = r9     // Catch:{ 1Uc -> 0x0168 }
            r6.L$1 = r7     // Catch:{ 1Uc -> 0x0168 }
            r6.label = r3     // Catch:{ 1Uc -> 0x0168 }
            X.B33 r0 = X.B33.A00     // Catch:{ 1Uc -> 0x0168 }
            java.lang.Object r2 = r1.A01(r6, r0)     // Catch:{ 1Uc -> 0x0168 }
            if (r2 != r5) goto L_0x0085
            return r5
        L_0x0082:
            X.C30691eM.A01(r2)     // Catch:{ 1Uc -> 0x0168 }
        L_0x0085:
            X.A8k r2 = (X.C20125A8k) r2     // Catch:{ 1Uc -> 0x0168 }
            java.lang.String r1 = "xwa2_group_query_by_id"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl$Xwa2GroupQueryById> r0 = com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl.Xwa2GroupQueryById.class
            X.A8k r1 = r2.A09(r0, r1)     // Catch:{ 1Uc -> 0x0168 }
            if (r1 == 0) goto L_0x0161
            java.lang.String r0 = "__typename"
            org.json.JSONObject r4 = r1.A00     // Catch:{ 1Uc -> 0x0168 }
            java.lang.String r0 = r4.optString(r0)     // Catch:{ 1Uc -> 0x0168 }
            int r1 = r0.hashCode()     // Catch:{ 1Uc -> 0x0168 }
            r0 = -1008570490(0xffffffffc3e26f86, float:-452.87128)
            if (r1 != r0) goto L_0x0161
            com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup r2 = new com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup     // Catch:{ 1Uc -> 0x0168 }
            r2.<init>(r4)     // Catch:{ 1Uc -> 0x0168 }
            java.lang.String r1 = "sub_group_suggestions"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup$SubGroupSuggestions> r0 = com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityGroup.SubGroupSuggestions.class
            X.A8k r2 = r2.A09(r0, r1)     // Catch:{ 1Uc -> 0x0168 }
            X.C199610h.A04(r2)     // Catch:{ 1Uc -> 0x0168 }
            X.C18070vi.A0X(r2)     // Catch:{ 1Uc -> 0x0168 }
            java.lang.String r1 = "edges"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup$SubGroupSuggestions$Edges> r0 = com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityGroup.SubGroupSuggestions.Edges.class
            X.1IX r0 = r2.A0A(r0, r1)     // Catch:{ 1Uc -> 0x0168 }
            X.C199610h.A04(r0)     // Catch:{ 1Uc -> 0x0168 }
            X.C18070vi.A0X(r0)     // Catch:{ 1Uc -> 0x0168 }
            java.util.ArrayList r2 = X.AnonymousClass000.A13()     // Catch:{ 1Uc -> 0x0168 }
            java.util.Iterator r7 = r0.iterator()     // Catch:{ 1Uc -> 0x0168 }
        L_0x00cb:
            boolean r0 = r7.hasNext()     // Catch:{ 1Uc -> 0x0168 }
            if (r0 == 0) goto L_0x0160
            java.lang.Object r4 = r7.next()     // Catch:{ 1Uc -> 0x0168 }
            X.A8k r4 = (X.C20125A8k) r4     // Catch:{ 1Uc -> 0x0168 }
            java.lang.String r1 = "node"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup$SubGroupSuggestions$Edges$Node> r0 = com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityGroup.SubGroupSuggestions.Edges.Node.class
            X.A8k r5 = r4.A09(r0, r1)     // Catch:{ 1Uc -> 0x0168 }
            X.C199610h.A04(r5)     // Catch:{ 1Uc -> 0x0168 }
            X.C18070vi.A0X(r5)     // Catch:{ 1Uc -> 0x0168 }
            X.C18070vi.A0d(r9, r3)     // Catch:{ 1Uc -> 0x0168 }
            X.1yz r0 = X.AnonymousClass1EC.A01     // Catch:{ 1Uc -> 0x0168 }
            java.lang.String r6 = "id"
            org.json.JSONObject r1 = r5.A00     // Catch:{ 1Uc -> 0x0168 }
            java.lang.String r0 = r1.optString(r6)     // Catch:{ 1Uc -> 0x0168 }
            X.C18070vi.A0X(r0)     // Catch:{ 1Uc -> 0x0168 }
            X.1EC r10 = X.C42941yz.A01(r0)     // Catch:{ 1Uc -> 0x0168 }
            java.lang.String r4 = "subject"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup$SubGroupSuggestions$Edges$Node$Subject> r0 = com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityGroup.SubGroupSuggestions.Edges.Node.Subject.class
            X.A8k r4 = r5.A09(r0, r4)     // Catch:{ 1Uc -> 0x0168 }
            r13 = 0
            if (r4 == 0) goto L_0x015e
            java.lang.String r0 = "value"
            java.lang.String r12 = X.C72453Mb.A0z(r4, r0)     // Catch:{ 1Uc -> 0x0168 }
        L_0x010a:
            java.lang.String r4 = "description"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup$SubGroupSuggestions$Edges$Node$Description> r0 = com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityGroup.SubGroupSuggestions.Edges.Node.Description.class
            X.A8k r4 = r5.A09(r0, r4)     // Catch:{ 1Uc -> 0x0168 }
            if (r4 == 0) goto L_0x011a
            java.lang.String r0 = "value"
            java.lang.String r13 = X.C72453Mb.A0z(r4, r0)     // Catch:{ 1Uc -> 0x0168 }
        L_0x011a:
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion     // Catch:{ 1Uc -> 0x0168 }
            java.lang.String r4 = "creator"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup$SubGroupSuggestions$Edges$Node$Creator> r0 = com.whatsapp.infra.graphql.generated.groups.QuerySuggestedGroupsResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityGroup.SubGroupSuggestions.Edges.Node.Creator.class
            X.A8k r0 = r5.A09(r0, r4)     // Catch:{ 1Uc -> 0x0168 }
            X.C199610h.A04(r0)     // Catch:{ 1Uc -> 0x0168 }
            X.C18070vi.A0X(r0)     // Catch:{ 1Uc -> 0x0168 }
            java.lang.String r0 = r0.A0F(r6)     // Catch:{ 1Uc -> 0x0168 }
            com.whatsapp.jid.UserJid r11 = X.C22941Dw.A03(r0)     // Catch:{ 1Uc -> 0x0168 }
            java.lang.String r0 = "creation_time"
            java.lang.String r0 = r1.optString(r0)     // Catch:{ 1Uc -> 0x0168 }
            X.C18070vi.A0X(r0)     // Catch:{ 1Uc -> 0x0168 }
            long r14 = java.lang.Long.parseLong(r0)     // Catch:{ 1Uc -> 0x0168 }
            java.lang.String r0 = "total_participants_count"
            int r0 = r1.optInt(r0)     // Catch:{ 1Uc -> 0x0168 }
            long r0 = (long) r0     // Catch:{ 1Uc -> 0x0168 }
            java.lang.String r4 = "is_existing_group"
            boolean r18 = r5.A0G(r4)     // Catch:{ 1Uc -> 0x0168 }
            java.lang.String r4 = "hidden_group"
            boolean r19 = r5.A0G(r4)     // Catch:{ 1Uc -> 0x0168 }
            X.2mu r8 = new X.2mu     // Catch:{ 1Uc -> 0x0168 }
            r16 = r0
            r8.<init>(r9, r10, r11, r12, r13, r14, r16, r18, r19)     // Catch:{ 1Uc -> 0x0168 }
            r2.add(r8)     // Catch:{ 1Uc -> 0x0168 }
            goto L_0x00cb
        L_0x015e:
            r12 = r13
            goto L_0x010a
        L_0x0160:
            return r2
        L_0x0161:
            r1 = -1
            X.4Dx r0 = new X.4Dx     // Catch:{ 1Uc -> 0x0168 }
            r0.<init>(r1)     // Catch:{ 1Uc -> 0x0168 }
            throw r0     // Catch:{ 1Uc -> 0x0168 }
        L_0x0168:
            r0 = move-exception
            X.A6Z r0 = r0.error
            X.BC4 r0 = r0.A02()
            int r1 = r0.BOq()
            X.4Dx r0 = new X.4Dx
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.community.mex.GetSuggestedGroupsGraphQlHandler.A00(X.1EC, X.1EC, X.1dr):java.lang.Object");
    }
}
