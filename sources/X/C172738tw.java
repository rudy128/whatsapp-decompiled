package X;

import com.whatsapp.infra.graphql.BaseMexCallback;

/* renamed from: X.8tw  reason: invalid class name and case insensitive filesystem */
public class C172738tw extends BaseMexCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C172738tw(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = obj3;
        this.A02 = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:0x0155 A[Catch:{ 11T -> 0x02f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0222 A[Catch:{ 11T -> 0x02f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0285 A[Catch:{ 11T -> 0x02f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x029a A[Catch:{ 11T -> 0x02f8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A02(X.C20125A8k r52) {
        /*
            r51 = this;
            r1 = r52
            r2 = r51
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x003c;
                case 1: goto L_0x0071;
                case 2: goto L_0x0319;
                default: goto L_0x0009;
            }
        L_0x0009:
            r5 = 0
            X.C18070vi.A0d(r1, r5)
            java.lang.Object r4 = r2.A03
            X.9es r4 = (X.C186859es) r4
            X.00H r0 = r4.A03
            r0.get()
            java.lang.String r3 = "xwa2_newsletter_unmute_v2"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterUnmuteResponseImpl$Xwa2NewsletterUnmuteV2> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterUnmuteResponseImpl.Xwa2NewsletterUnmuteV2.class
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMutationResponseFragmentImpl r0 = X.C20125A8k.A04(r1, r0, r3)
            boolean r1 = X.C20131A8r.A09(r0)
            X.00H r0 = r4.A02
            java.lang.Object r4 = r0.get()
            X.A6V r4 = (X.A6V) r4
            if (r1 != 0) goto L_0x0069
            java.lang.Integer r3 = X.AnonymousClass00R.A01
            java.lang.Object r2 = r2.A02
            X.1ch r2 = (X.C29681ch) r2
            r1 = 0
            X.8xw r0 = new X.8xw
            r0.<init>(r1, r5)
            r4.A04(r2, r3, r0)
        L_0x003b:
            return
        L_0x003c:
            com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl r1 = (com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl) r1
            java.lang.Object r4 = r2.A01
            X.12M r4 = (X.AnonymousClass12M) r4
            java.lang.Object r0 = r2.A02
            X.1EC r0 = (X.AnonymousClass1EC) r0
            java.lang.Object r3 = r2.A03
            X.2sm r3 = (X.C63262sm) r3
            X.AnonymousClass12M.A01(r3, r4, r0)
            X.00H r2 = r4.A06
            java.lang.Object r0 = r2.get()
            X.126 r0 = (X.AnonymousClass126) r0
            boolean r0 = r0.A0m()
            if (r0 == 0) goto L_0x003b
            X.2nA r1 = X.AnonymousClass1ME.A00(r3, r1)
            java.lang.Object r0 = r2.get()
            X.126 r0 = (X.AnonymousClass126) r0
            r0.A0T(r1)
            return
        L_0x0069:
            java.lang.Object r0 = r2.A02
            X.1ch r0 = (X.C29681ch) r0
            r4.A05(r0, r5)
            return
        L_0x0071:
            java.lang.Object r0 = r2.A01     // Catch:{ 11T -> 0x02f8 }
            X.12M r0 = (X.AnonymousClass12M) r0     // Catch:{ 11T -> 0x02f8 }
            X.11S r0 = r0.A01     // Catch:{ 11T -> 0x02f8 }
            com.whatsapp.jid.PhoneUserJid r11 = X.AnonymousClass11S.A01(r0)     // Catch:{ 11T -> 0x02f8 }
            boolean r45 = X.C18070vi.A17(r11, r1)     // Catch:{ 11T -> 0x02f8 }
            java.lang.String r10 = "xwa2_group_query_by_id"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoByCodeResponseImpl$Xwa2GroupQueryById> r9 = com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoByCodeResponseImpl.Xwa2GroupQueryById.class
            X.A8k r0 = r1.A09(r9, r10)     // Catch:{ 11T -> 0x02f8 }
            r15 = 0
            if (r0 == 0) goto L_0x02f3
            com.whatsapp.infra.graphql.generated.groups.GroupCommonFragmentImpl r12 = X.C20125A8k.A03(r0)     // Catch:{ 11T -> 0x02f8 }
            X.1EC r14 = X.A95.A04(r12)     // Catch:{ 11T -> 0x02f8 }
            com.whatsapp.jid.UserJid r16 = X.A95.A07(r12)     // Catch:{ 11T -> 0x02f8 }
            long r24 = X.A95.A02(r12)     // Catch:{ 11T -> 0x02f8 }
            com.whatsapp.infra.graphql.generated.groups.GroupCommonFragmentImpl$Subject r3 = r12.A0I()     // Catch:{ 11T -> 0x02f8 }
            if (r3 == 0) goto L_0x00b9
            java.lang.String r0 = "value"
            java.lang.String r18 = X.C72453Mb.A0z(r3, r0)     // Catch:{ 11T -> 0x02f8 }
        L_0x00a6:
            long r26 = X.A95.A03(r12)     // Catch:{ 11T -> 0x02f8 }
            java.util.LinkedHashMap r43 = X.A95.A0D(r12)     // Catch:{ 11T -> 0x02f8 }
            java.lang.String r0 = "total_participants_count"
            int r21 = X.C20125A8k.A00(r12, r0)     // Catch:{ 11T -> 0x02f8 }
            X.A8k r0 = r1.A09(r9, r10)     // Catch:{ 11T -> 0x02f8 }
            goto L_0x00bc
        L_0x00b9:
            r18 = r15
            goto L_0x00a6
        L_0x00bc:
            if (r0 == 0) goto L_0x013c
            org.json.JSONObject r3 = r0.A00     // Catch:{ 11T -> 0x02f8 }
            int r4 = X.AnonymousClass8BT.A03(r3)     // Catch:{ 11T -> 0x02f8 }
            r0 = -334477582(0xffffffffec1046f2, float:-6.976814E26)
            if (r4 != r0) goto L_0x013c
            com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoByCodeResponseImpl$Xwa2GroupQueryById$InlineXWA2GroupRegularGroup r4 = new com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoByCodeResponseImpl$Xwa2GroupQueryById$InlineXWA2GroupRegularGroup     // Catch:{ 11T -> 0x02f8 }
            r4.<init>(r3)     // Catch:{ 11T -> 0x02f8 }
            java.lang.String r3 = "properties"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoByCodeResponseImpl$Xwa2GroupQueryById$InlineXWA2GroupRegularGroup$Properties> r0 = com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoByCodeResponseImpl.Xwa2GroupQueryById.InlineXWA2GroupRegularGroup.Properties.class
            X.A8k r3 = X.C108985cd.A0I(r4, r0, r3)     // Catch:{ 11T -> 0x02f8 }
            java.lang.String r0 = "membership_approval_mode_enabled"
            boolean r0 = r3.A0G(r0)     // Catch:{ 11T -> 0x02f8 }
            if (r0 != 0) goto L_0x00df
            goto L_0x0134
        L_0x00df:
            java.lang.String r5 = "membership_approval_requests"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoByCodeResponseImpl$Xwa2GroupQueryById$InlineXWA2GroupRegularGroup$MembershipApprovalRequests> r3 = com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoByCodeResponseImpl.Xwa2GroupQueryById.InlineXWA2GroupRegularGroup.MembershipApprovalRequests.class
            X.A8k r0 = r4.A09(r3, r5)     // Catch:{ 11T -> 0x02f8 }
            if (r0 == 0) goto L_0x00f4
            java.lang.String r6 = "total_count"
            int r0 = X.C20125A8k.A00(r0, r6)     // Catch:{ 11T -> 0x02f8 }
            if (r0 != 0) goto L_0x00f4
            r23 = 1
            goto L_0x0136
        L_0x00f4:
            X.A8k r4 = r4.A09(r3, r5)     // Catch:{ 11T -> 0x02f8 }
            if (r4 == 0) goto L_0x0132
            java.lang.String r3 = "edges"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoByCodeResponseImpl$Xwa2GroupQueryById$InlineXWA2GroupRegularGroup$MembershipApprovalRequests$Edges> r0 = com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoByCodeResponseImpl.Xwa2GroupQueryById.InlineXWA2GroupRegularGroup.MembershipApprovalRequests.Edges.class
            X.1IX r0 = X.C108955ca.A0J(r4, r0, r3)     // Catch:{ 11T -> 0x02f8 }
            X.C18070vi.A0X(r0)     // Catch:{ 11T -> 0x02f8 }
            java.lang.Object r4 = X.C29431cG.A0c(r0)     // Catch:{ 11T -> 0x02f8 }
            X.A8k r4 = (X.C20125A8k) r4     // Catch:{ 11T -> 0x02f8 }
            if (r4 == 0) goto L_0x0132
            java.lang.String r3 = "node"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoByCodeResponseImpl$Xwa2GroupQueryById$InlineXWA2GroupRegularGroup$MembershipApprovalRequests$Edges$Node> r0 = com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoByCodeResponseImpl.Xwa2GroupQueryById.InlineXWA2GroupRegularGroup.MembershipApprovalRequests.Edges.Node.class
            X.A8k r4 = X.C108985cd.A0I(r4, r0, r3)     // Catch:{ 11T -> 0x02f8 }
            java.lang.String r3 = "user"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoByCodeResponseImpl$Xwa2GroupQueryById$InlineXWA2GroupRegularGroup$MembershipApprovalRequests$Edges$Node$User> r0 = com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoByCodeResponseImpl.Xwa2GroupQueryById.InlineXWA2GroupRegularGroup.MembershipApprovalRequests.Edges.Node.User.class
            X.A8k r0 = X.C108985cd.A0I(r4, r0, r3)     // Catch:{ 11T -> 0x02f8 }
            java.lang.String r3 = "jid"
            org.json.JSONObject r0 = r0.A00     // Catch:{ 11T -> 0x02f8 }
            java.lang.String r0 = r0.optString(r3)     // Catch:{ 11T -> 0x02f8 }
            com.whatsapp.jid.UserJid r0 = X.AnonymousClass8BR.A0X(r0)     // Catch:{ 11T -> 0x02f8 }
        L_0x0129:
            boolean r0 = X.C18070vi.A18(r0, r11)     // Catch:{ 11T -> 0x02f8 }
            int r23 = X.AnonymousClass8BU.A01(r0)
            goto L_0x0136
        L_0x0132:
            r0 = r15
            goto L_0x0129
        L_0x0134:
            r23 = 0
        L_0x0136:
            if (r43 != 0) goto L_0x0139
            goto L_0x013e
        L_0x0139:
            r20 = r43
            goto L_0x0142
        L_0x013c:
            r13 = r15
            goto L_0x014f
        L_0x013e:
            X.1CQ r20 = X.AnonymousClass1D7.A0I()     // Catch:{ 11T -> 0x02f8 }
        L_0x0142:
            X.1yX r17 = X.A95.A09(r12)     // Catch:{ 11T -> 0x02f8 }
            r22 = 0
            X.9tw r13 = new X.9tw     // Catch:{ 11T -> 0x02f8 }
            r19 = r15
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r26)     // Catch:{ 11T -> 0x02f8 }
        L_0x014f:
            X.A8k r0 = r1.A09(r9, r10)     // Catch:{ 11T -> 0x02f8 }
            if (r0 == 0) goto L_0x021c
            org.json.JSONObject r4 = r0.A00     // Catch:{ 11T -> 0x02f8 }
            int r3 = X.AnonymousClass8BT.A03(r4)     // Catch:{ 11T -> 0x02f8 }
            r0 = -1340324424(0xffffffffb01c45b8, float:-5.6851546E-10)
            if (r3 != r0) goto L_0x021c
            com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoByCodeResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunitySubGroup r0 = new com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoByCodeResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunitySubGroup     // Catch:{ 11T -> 0x02f8 }
            r0.<init>(r4)     // Catch:{ 11T -> 0x02f8 }
            java.lang.String r5 = "properties"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoByCodeResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunitySubGroup$Properties> r3 = com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoByCodeResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunitySubGroup.Properties.class
            X.A8k r6 = X.C108985cd.A0I(r0, r3, r5)     // Catch:{ 11T -> 0x02f8 }
            java.lang.String r4 = "membership_approval_mode_enabled"
            boolean r4 = r6.A0G(r4)     // Catch:{ 11T -> 0x02f8 }
            if (r4 != 0) goto L_0x0176
            goto L_0x01cb
        L_0x0176:
            java.lang.String r7 = "membership_approval_requests"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoByCodeResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunitySubGroup$MembershipApprovalRequests> r6 = com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoByCodeResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunitySubGroup.MembershipApprovalRequests.class
            X.A8k r4 = r0.A09(r6, r7)     // Catch:{ 11T -> 0x02f8 }
            if (r4 == 0) goto L_0x018b
            java.lang.String r8 = "total_count"
            int r4 = X.C20125A8k.A00(r4, r8)     // Catch:{ 11T -> 0x02f8 }
            if (r4 != 0) goto L_0x018b
            r38 = 1
            goto L_0x01cd
        L_0x018b:
            X.A8k r4 = r0.A09(r6, r7)     // Catch:{ 11T -> 0x02f8 }
            if (r4 == 0) goto L_0x01c9
            java.lang.String r7 = "edges"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoByCodeResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunitySubGroup$MembershipApprovalRequests$Edges> r6 = com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoByCodeResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunitySubGroup.MembershipApprovalRequests.Edges.class
            X.1IX r4 = X.C108955ca.A0J(r4, r6, r7)     // Catch:{ 11T -> 0x02f8 }
            X.C18070vi.A0X(r4)     // Catch:{ 11T -> 0x02f8 }
            java.lang.Object r4 = X.C29431cG.A0c(r4)     // Catch:{ 11T -> 0x02f8 }
            X.A8k r4 = (X.C20125A8k) r4     // Catch:{ 11T -> 0x02f8 }
            if (r4 == 0) goto L_0x01c9
            java.lang.String r7 = "node"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoByCodeResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunitySubGroup$MembershipApprovalRequests$Edges$Node> r6 = com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoByCodeResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunitySubGroup.MembershipApprovalRequests.Edges.Node.class
            X.A8k r7 = X.C108985cd.A0I(r4, r6, r7)     // Catch:{ 11T -> 0x02f8 }
            java.lang.String r6 = "user"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoByCodeResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunitySubGroup$MembershipApprovalRequests$Edges$Node$User> r4 = com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoByCodeResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunitySubGroup.MembershipApprovalRequests.Edges.Node.User.class
            X.A8k r4 = X.C108985cd.A0I(r7, r4, r6)     // Catch:{ 11T -> 0x02f8 }
            java.lang.String r6 = "jid"
            org.json.JSONObject r4 = r4.A00     // Catch:{ 11T -> 0x02f8 }
            java.lang.String r4 = r4.optString(r6)     // Catch:{ 11T -> 0x02f8 }
            com.whatsapp.jid.UserJid r4 = X.AnonymousClass8BR.A0X(r4)     // Catch:{ 11T -> 0x02f8 }
        L_0x01c0:
            boolean r4 = X.C18070vi.A18(r4, r11)     // Catch:{ 11T -> 0x02f8 }
            int r38 = X.AnonymousClass8BU.A01(r4)
            goto L_0x01cd
        L_0x01c9:
            r4 = r15
            goto L_0x01c0
        L_0x01cb:
            r38 = 0
        L_0x01cd:
            if (r43 != 0) goto L_0x01d0
            goto L_0x01d3
        L_0x01d0:
            r35 = r43
            goto L_0x01d7
        L_0x01d3:
            X.1CQ r35 = X.AnonymousClass1D7.A0I()     // Catch:{ 11T -> 0x02f8 }
        L_0x01d7:
            X.1yX r32 = X.A95.A09(r12)     // Catch:{ 11T -> 0x02f8 }
            X.A8k r6 = X.C108985cd.A0I(r0, r3, r5)     // Catch:{ 11T -> 0x02f8 }
            java.lang.String r4 = "general_chat"
            boolean r4 = r6.A0G(r4)     // Catch:{ 11T -> 0x02f8 }
            r37 = 2
            if (r4 == 0) goto L_0x01eb
            r37 = 6
        L_0x01eb:
            X.1yz r4 = X.AnonymousClass1EC.A01     // Catch:{ 11T -> 0x02f8 }
            X.A8k r4 = X.C108985cd.A0I(r0, r3, r5)     // Catch:{ 11T -> 0x02f8 }
            X.1EC r30 = X.C20125A8k.A06(r4)     // Catch:{ 11T -> 0x02f8 }
            X.A8k r4 = X.C108985cd.A0I(r0, r3, r5)     // Catch:{ 11T -> 0x02f8 }
            java.lang.String r3 = "parent_group_subject"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoByCodeResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunitySubGroup$Properties$ParentGroupSubject> r0 = com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoByCodeResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunitySubGroup.Properties.ParentGroupSubject.class
            X.A8k r0 = r4.A09(r0, r3)     // Catch:{ 11T -> 0x02f8 }
            if (r0 == 0) goto L_0x0233
            java.lang.String r3 = "value"
            java.lang.String r34 = X.C72453Mb.A0z(r0, r3)     // Catch:{ 11T -> 0x02f8 }
        L_0x0209:
            X.9tw r13 = new X.9tw     // Catch:{ 11T -> 0x02f8 }
            r28 = r13
            r29 = r14
            r31 = r16
            r33 = r18
            r36 = r21
            r39 = r24
            r41 = r26
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r41)     // Catch:{ 11T -> 0x02f8 }
        L_0x021c:
            X.A8k r0 = r1.A09(r9, r10)     // Catch:{ 11T -> 0x02f8 }
            if (r0 == 0) goto L_0x027f
            org.json.JSONObject r4 = r0.A00     // Catch:{ 11T -> 0x02f8 }
            int r3 = X.AnonymousClass8BT.A03(r4)     // Catch:{ 11T -> 0x02f8 }
            r0 = 357610951(0x1550b5c7, float:4.2148663E-26)
            if (r3 != r0) goto L_0x027f
            com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoByCodeResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityDefaultSubGroup r0 = new com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoByCodeResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityDefaultSubGroup     // Catch:{ 11T -> 0x02f8 }
            r0.<init>(r4)     // Catch:{ 11T -> 0x02f8 }
            goto L_0x0236
        L_0x0233:
            r34 = r15
            goto L_0x0209
        L_0x0236:
            if (r43 != 0) goto L_0x0239
            goto L_0x023c
        L_0x0239:
            r35 = r43
            goto L_0x0240
        L_0x023c:
            X.1CQ r35 = X.AnonymousClass1D7.A0I()     // Catch:{ 11T -> 0x02f8 }
        L_0x0240:
            X.1yX r32 = X.A95.A09(r12)     // Catch:{ 11T -> 0x02f8 }
            X.1yz r3 = X.AnonymousClass1EC.A01     // Catch:{ 11T -> 0x02f8 }
            java.lang.String r4 = "properties"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoByCodeResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityDefaultSubGroup$Properties> r3 = com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoByCodeResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityDefaultSubGroup.Properties.class
            X.A8k r5 = X.C108985cd.A0I(r0, r3, r4)     // Catch:{ 11T -> 0x02f8 }
            X.1EC r30 = X.C20125A8k.A06(r5)     // Catch:{ 11T -> 0x02f8 }
            X.A8k r4 = X.C108985cd.A0I(r0, r3, r4)     // Catch:{ 11T -> 0x02f8 }
            java.lang.String r3 = "parent_group_subject"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoByCodeResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityDefaultSubGroup$Properties$ParentGroupSubject> r0 = com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoByCodeResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityDefaultSubGroup.Properties.ParentGroupSubject.class
            X.A8k r0 = r4.A09(r0, r3)     // Catch:{ 11T -> 0x02f8 }
            if (r0 == 0) goto L_0x0266
            java.lang.String r3 = "value"
            java.lang.String r15 = X.C72453Mb.A0z(r0, r3)     // Catch:{ 11T -> 0x02f8 }
        L_0x0266:
            r37 = 3
            X.9tw r13 = new X.9tw     // Catch:{ 11T -> 0x02f8 }
            r38 = 0
            r28 = r13
            r29 = r14
            r31 = r16
            r33 = r18
            r34 = r15
            r36 = r21
            r39 = r24
            r41 = r26
            r28.<init>(r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r41)     // Catch:{ 11T -> 0x02f8 }
        L_0x027f:
            X.A8k r0 = r1.A09(r9, r10)     // Catch:{ 11T -> 0x02f8 }
            if (r0 == 0) goto L_0x0298
            org.json.JSONObject r3 = r0.A00     // Catch:{ 11T -> 0x02f8 }
            int r1 = X.AnonymousClass8BT.A03(r3)     // Catch:{ 11T -> 0x02f8 }
            r0 = -1008570490(0xffffffffc3e26f86, float:-452.87128)
            if (r1 != r0) goto L_0x0298
            com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoByCodeResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup r1 = new com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoByCodeResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup     // Catch:{ 11T -> 0x02f8 }
            r1.<init>(r3)     // Catch:{ 11T -> 0x02f8 }
            if (r43 != 0) goto L_0x02a6
            goto L_0x02a2
        L_0x0298:
            if (r13 != 0) goto L_0x02c7
            java.lang.String r0 = "Not all group types are supported yet"
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException     // Catch:{ 11T -> 0x02f8 }
            r1.<init>(r0)     // Catch:{ 11T -> 0x02f8 }
            goto L_0x02f7
        L_0x02a2:
            X.1CQ r43 = X.AnonymousClass1D7.A0I()     // Catch:{ 11T -> 0x02f8 }
        L_0x02a6:
            java.lang.String r0 = "num_sub_groups"
            int r44 = X.C20125A8k.A00(r1, r0)     // Catch:{ 11T -> 0x02f8 }
            X.1yX r40 = X.A95.A09(r12)     // Catch:{ 11T -> 0x02f8 }
            r38 = 0
            X.9tw r13 = new X.9tw     // Catch:{ 11T -> 0x02f8 }
            r46 = 0
            r36 = r13
            r37 = r14
            r39 = r16
            r41 = r18
            r42 = r38
            r47 = r24
            r49 = r26
            r36.<init>(r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r49)     // Catch:{ 11T -> 0x02f8 }
        L_0x02c7:
            java.lang.Object r11 = r2.A03     // Catch:{ 11T -> 0x02f8 }
            X.BC2 r11 = (X.BC2) r11     // Catch:{ 11T -> 0x02f8 }
            X.1EC r12 = r13.A05     // Catch:{ 11T -> 0x02f8 }
            com.whatsapp.jid.UserJid r14 = r13.A07     // Catch:{ 11T -> 0x02f8 }
            long r0 = r13.A03     // Catch:{ 11T -> 0x02f8 }
            java.lang.String r8 = r13.A0A     // Catch:{ 11T -> 0x02f8 }
            java.util.Map r7 = r13.A0B     // Catch:{ 11T -> 0x02f8 }
            int r6 = r13.A02     // Catch:{ 11T -> 0x02f8 }
            X.1yX r15 = r13.A08     // Catch:{ 11T -> 0x02f8 }
            int r5 = r13.A01     // Catch:{ 11T -> 0x02f8 }
            int r4 = r13.A00     // Catch:{ 11T -> 0x02f8 }
            java.lang.String r3 = r13.A09     // Catch:{ 11T -> 0x02f8 }
            X.1EC r13 = r13.A06     // Catch:{ 11T -> 0x02f8 }
            r17 = r3
            r18 = r7
            r19 = r6
            r20 = r5
            r21 = r4
            r22 = r0
            r16 = r8
            r11.BvM(r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)     // Catch:{ 11T -> 0x02f8 }
            goto L_0x0313
        L_0x02f3:
            java.lang.IllegalStateException r1 = X.C17880vN.A0g()     // Catch:{ 11T -> 0x02f8 }
        L_0x02f7:
            throw r1     // Catch:{ 11T -> 0x02f8 }
        L_0x02f8:
            r3 = move-exception
            java.lang.Object r1 = r2.A03
            X.BC2 r1 = (X.BC2) r1
            r0 = 800(0x320, float:1.121E-42)
            r1.onError(r0)
            java.lang.Object r0 = r2.A01
            X.12M r0 = (X.AnonymousClass12M) r0
            java.lang.String r4 = "Connection/handleInvalidJidReceived"
            com.whatsapp.util.Log.e(r4, r3)
            X.190 r3 = r0.A00
            java.lang.String r1 = "invalid-jid-received"
            r0 = 1
            r3.A0G(r4, r1, r0)
        L_0x0313:
            java.lang.Object r0 = r2.A02
            X.AnonymousClass8BU.A1G(r0)
            return
        L_0x0319:
            r5 = 0
            X.C18070vi.A0d(r1, r5)
            java.lang.Object r4 = r2.A03
            X.9es r4 = (X.C186859es) r4
            X.00H r0 = r4.A03
            r0.get()
            java.lang.String r3 = "xwa2_newsletter_mute_v2"
            java.lang.Class<com.whatsapp.infra.graphql.generated.newsletter.NewsletterMuteResponseImpl$Xwa2NewsletterMuteV2> r0 = com.whatsapp.infra.graphql.generated.newsletter.NewsletterMuteResponseImpl.Xwa2NewsletterMuteV2.class
            com.whatsapp.infra.graphql.generated.newsletter.NewsletterMutationResponseFragmentImpl r0 = X.C20125A8k.A04(r1, r0, r3)
            boolean r1 = X.C20131A8r.A09(r0)
            X.00H r0 = r4.A02
            if (r1 != 0) goto L_0x034c
            java.lang.Object r4 = r0.get()
            X.A6V r4 = (X.A6V) r4
            java.lang.Integer r3 = X.AnonymousClass00R.A00
            java.lang.Object r2 = r2.A02
            X.1ch r2 = (X.C29681ch) r2
            r1 = 0
            X.8xw r0 = new X.8xw
            r0.<init>(r1, r5)
            r4.A04(r2, r3, r0)
            return
        L_0x034c:
            java.lang.Object r3 = r0.get()
            X.A6V r3 = (X.A6V) r3
            java.lang.Object r1 = r2.A02
            X.1ch r1 = (X.C29681ch) r1
            r0 = 1
            r3.A05(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C172738tw.A02(X.A8k):void");
    }

    public boolean A05(A6Z a6z) {
        A6V a6v;
        Integer num;
        switch (this.A00) {
            case 0:
                AnonymousClass12M.A02((C63262sm) this.A03, (AnonymousClass12M) this.A01, (AnonymousClass1EC) this.A02, A6Z.A00(a6z));
                return false;
            case 1:
                ((BC2) this.A03).onError(A6Z.A00(a6z));
                AnonymousClass8BU.A1G(this.A02);
                return false;
            case 2:
                C18070vi.A0d(a6z, 0);
                ((C192449oP) this.A01).A00(A6Z.A00(a6z));
                a6v = (A6V) ((C186859es) this.A03).A02.get();
                num = AnonymousClass00R.A00;
                break;
            default:
                C18070vi.A0d(a6z, 0);
                ((C192449oP) this.A01).A00(A6Z.A00(a6z));
                a6v = (A6V) ((C186859es) this.A03).A02.get();
                num = AnonymousClass00R.A01;
                break;
        }
        a6v.A04((C29681ch) this.A02, num, C181499Qs.A00(a6z));
        return false;
    }
}
