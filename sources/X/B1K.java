package X;

import com.whatsapp.infra.graphql.BaseMexCallback;

public final class B1K extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ BaseMexCallback $debugCallback;
    public final /* synthetic */ int $params;
    public final /* synthetic */ C186759ei this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B1K(C186759ei r2, BaseMexCallback baseMexCallback, int i) {
        super(1);
        this.this$0 = r2;
        this.$params = i;
        this.$debugCallback = baseMexCallback;
    }

    /* JADX WARNING: type inference failed for: r10v2, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARNING: type inference failed for: r4v2, types: [X.A8k, com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2GroupRegularGroup] */
    /* JADX WARNING: type inference failed for: r4v3, types: [X.A8k, com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2CommunitySubGroup] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r64) {
        /*
            r63 = this;
            r9 = r64
            r0 = 0
            X.C18070vi.A0d(r9, r0)
            r8 = r63
            X.9ei r0 = r8.this$0
            X.126 r1 = r0.A01
            java.lang.String r0 = "GroupChatManager/onGroupSyncResponseReceived/setGroupFetchInProgress false"
            com.whatsapp.util.Log.e((java.lang.String) r0)
            X.00H r0 = r1.A12
            r0.get()
            X.A8k r9 = (X.C20125A8k) r9
            java.lang.String r1 = "xwa2_group_query_participating_groups"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups> r0 = com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl.Xwa2GroupQueryParticipatingGroups.class
            X.1IX r0 = r9.A0A(r0, r1)
            if (r0 == 0) goto L_0x047c
            X.9ei r11 = r8.this$0
            java.util.ArrayList r10 = X.AnonymousClass000.A13()
            java.util.Iterator r13 = r0.iterator()
        L_0x002c:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x047e
            X.A8k r0 = X.C108945cZ.A0V(r13)
            boolean r26 = X.AnonymousClass8BU.A1W(r0)
            r16 = 0
            org.json.JSONObject r2 = r0.A00     // Catch:{ 11T -> 0x0470 }
            int r1 = X.AnonymousClass8BT.A03(r2)     // Catch:{ 11T -> 0x0470 }
            r0 = -431104815(0xffffffffe64ddcd1, float:-2.4303962E23)
            if (r1 == r0) goto L_0x0073
            int r1 = X.AnonymousClass8BT.A03(r2)     // Catch:{ 11T -> 0x0470 }
            r0 = -334477582(0xffffffffec1046f2, float:-6.976814E26)
            if (r1 == r0) goto L_0x035f
            int r1 = X.AnonymousClass8BT.A03(r2)     // Catch:{ 11T -> 0x0470 }
            r0 = -1340324424(0xffffffffb01c45b8, float:-5.6851546E-10)
            if (r1 == r0) goto L_0x023b
            int r1 = X.AnonymousClass8BT.A03(r2)     // Catch:{ 11T -> 0x0470 }
            r0 = 357610951(0x1550b5c7, float:4.2148663E-26)
            if (r1 == r0) goto L_0x0144
            int r1 = X.AnonymousClass8BT.A03(r2)     // Catch:{ 11T -> 0x0470 }
            r0 = -1008570490(0xffffffffc3e26f86, float:-452.87128)
            if (r1 == r0) goto L_0x00b4
            java.lang.String r0 = "GetParticipatingGroupsMexHelper/parseTruncatedOrFullGroupEnvelope invalid group type"
            X.11T r1 = new X.11T     // Catch:{ 11T -> 0x0470 }
            r1.<init>((java.lang.String) r0)     // Catch:{ 11T -> 0x0470 }
        L_0x0072:
            throw r1     // Catch:{ 11T -> 0x0470 }
        L_0x0073:
            com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2TruncatedGroup r1 = new com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2TruncatedGroup     // Catch:{ 11T -> 0x0470 }
            r1.<init>(r2)     // Catch:{ 11T -> 0x0470 }
            X.1yz r0 = X.AnonymousClass1EC.A01     // Catch:{ 11T -> 0x0470 }
            java.lang.String r4 = "jid"
            org.json.JSONObject r3 = r1.A00     // Catch:{ 11T -> 0x0470 }
            java.lang.String r0 = r3.optString(r4)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.jid.GroupJid r0 = X.C36321nh.A01(r0)     // Catch:{ 11T -> 0x0470 }
            X.1EC r2 = X.C42941yz.A00(r0)     // Catch:{ 11T -> 0x0470 }
            if (r2 == 0) goto L_0x0099
            java.lang.String r0 = "total_participants_count"
            java.lang.Integer r0 = X.AnonymousClass8BT.A0k(r0, r3)     // Catch:{ 11T -> 0x0470 }
            X.A1t r1 = new X.A1t     // Catch:{ 11T -> 0x0470 }
            r1.<init>(r2, r0)     // Catch:{ 11T -> 0x0470 }
            goto L_0x046b
        L_0x0099:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 11T -> 0x0470 }
            java.lang.String r0 = "GetParticipatingGroupsMexHelper/parseTruncatedGroup Invalid Jid: "
            r1.append(r0)     // Catch:{ 11T -> 0x0470 }
            java.lang.String r0 = r3.optString(r4)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.jid.GroupJid r0 = X.C36321nh.A01(r0)     // Catch:{ 11T -> 0x0470 }
            java.lang.String r0 = X.C17890vO.A0V(r0, r1)     // Catch:{ 11T -> 0x0470 }
            X.11T r1 = new X.11T     // Catch:{ 11T -> 0x0470 }
            r1.<init>((java.lang.String) r0)     // Catch:{ 11T -> 0x0470 }
            goto L_0x0072
        L_0x00b4:
            com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2CommunityGroup r0 = new com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2CommunityGroup     // Catch:{ 11T -> 0x0470 }
            r0.<init>(r2)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.infra.graphql.generated.groups.GroupCommonFragmentImpl r3 = X.C20125A8k.A03(r0)     // Catch:{ 11T -> 0x0470 }
            X.1EC r6 = X.A95.A04(r3)     // Catch:{ 11T -> 0x0470 }
            java.lang.Integer r5 = X.C20125A8k.A07(r3)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.jid.UserJid r19 = X.A95.A07(r3)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.jid.PhoneUserJid r17 = X.A95.A05(r3)     // Catch:{ 11T -> 0x0470 }
            long r31 = X.A95.A02(r3)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.infra.graphql.generated.groups.GroupCommonFragmentImpl$Subject r2 = r3.A0I()     // Catch:{ 11T -> 0x0470 }
            if (r2 == 0) goto L_0x0141
            java.lang.String r1 = "value"
            java.lang.String r23 = X.C72453Mb.A0z(r2, r1)     // Catch:{ 11T -> 0x0470 }
        L_0x00dd:
            com.whatsapp.jid.UserJid r20 = X.A95.A08(r3)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.jid.PhoneUserJid r18 = X.A95.A06(r3)     // Catch:{ 11T -> 0x0470 }
            long r33 = X.A95.A03(r3)     // Catch:{ 11T -> 0x0470 }
            long r35 = X.C20125A8k.A01(r3)     // Catch:{ 11T -> 0x0470 }
            X.1yX r21 = X.A95.A09(r3)     // Catch:{ 11T -> 0x0470 }
            boolean r41 = X.A95.A0E(r3)     // Catch:{ 11T -> 0x0470 }
            X.2sm r15 = X.AnonymousClass8BV.A0E()     // Catch:{ 11T -> 0x0470 }
            java.util.LinkedHashMap r25 = X.A95.A0D(r3)     // Catch:{ 11T -> 0x0470 }
            java.lang.String r2 = "properties"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2CommunityGroup$Properties> r1 = com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl.Xwa2GroupQueryParticipatingGroups.InlineXWA2CommunityGroup.Properties.class
            X.A8k r4 = X.C108985cd.A0I(r0, r1, r2)     // Catch:{ 11T -> 0x0470 }
            java.lang.String r3 = "closed_by_membership_approval_mode"
            boolean r28 = r4.A0G(r3)     // Catch:{ 11T -> 0x0470 }
            X.A8k r1 = X.C108985cd.A0I(r0, r1, r2)     // Catch:{ 11T -> 0x0470 }
            java.lang.String r0 = "allow_non_admin_sub_group_creation"
            boolean r46 = r1.A0G(r0)     // Catch:{ 11T -> 0x0470 }
            r27 = 1
            java.lang.String r24 = "pn"
            X.A2S r14 = new X.A2S     // Catch:{ 11T -> 0x0470 }
            r30 = r26
            r37 = r26
            r38 = r26
            r39 = r26
            r40 = r26
            r42 = r26
            r43 = r26
            r45 = r26
            r47 = r26
            r48 = r26
            r49 = r26
            r22 = r16
            r29 = r26
            r44 = r27
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r33, r35, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)     // Catch:{ 11T -> 0x0470 }
            X.A1t r1 = new X.A1t     // Catch:{ 11T -> 0x0470 }
            r1.<init>(r14, r6, r5)     // Catch:{ 11T -> 0x0470 }
            goto L_0x046b
        L_0x0141:
            r23 = 0
            goto L_0x00dd
        L_0x0144:
            com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2CommunityDefaultSubGroup r0 = new com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2CommunityDefaultSubGroup     // Catch:{ 11T -> 0x0470 }
            r0.<init>(r2)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.infra.graphql.generated.groups.GroupCommonFragmentImpl r12 = X.C20125A8k.A03(r0)     // Catch:{ 11T -> 0x0470 }
            X.1EC r7 = X.A95.A04(r12)     // Catch:{ 11T -> 0x0470 }
            java.lang.Integer r6 = X.C20125A8k.A07(r12)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.jid.UserJid r32 = X.A95.A07(r12)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.jid.PhoneUserJid r30 = X.A95.A05(r12)     // Catch:{ 11T -> 0x0470 }
            long r44 = X.A95.A02(r12)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.infra.graphql.generated.groups.GroupCommonFragmentImpl$Subject r2 = r12.A0I()     // Catch:{ 11T -> 0x0470 }
            if (r2 == 0) goto L_0x0198
            java.lang.String r1 = "value"
            java.lang.String r36 = X.C72453Mb.A0z(r2, r1)     // Catch:{ 11T -> 0x0470 }
        L_0x016d:
            com.whatsapp.jid.UserJid r33 = X.A95.A08(r12)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.jid.PhoneUserJid r31 = X.A95.A06(r12)     // Catch:{ 11T -> 0x0470 }
            long r46 = X.A95.A03(r12)     // Catch:{ 11T -> 0x0470 }
            long r48 = X.C20125A8k.A01(r12)     // Catch:{ 11T -> 0x0470 }
            X.1yX r34 = X.A95.A09(r12)     // Catch:{ 11T -> 0x0470 }
            boolean r54 = X.A95.A0E(r12)     // Catch:{ 11T -> 0x0470 }
            java.lang.String r2 = "properties"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2CommunityDefaultSubGroup$Properties> r1 = com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl.Xwa2GroupQueryParticipatingGroups.InlineXWA2CommunityDefaultSubGroup.Properties.class
            X.A8k r3 = X.C20125A8k.A02(r0, r1, r2)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2CommunityDefaultSubGroup$Properties r3 = (com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl.Xwa2GroupQueryParticipatingGroups.InlineXWA2CommunityDefaultSubGroup.Properties) r3     // Catch:{ 11T -> 0x0470 }
            java.lang.String r5 = "growth_locked2"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2CommunityDefaultSubGroup$Properties$GrowthLocked2> r4 = com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl.Xwa2GroupQueryParticipatingGroups.InlineXWA2CommunityDefaultSubGroup.Properties.GrowthLocked2.class
            X.A8k r3 = r3.A09(r4, r5)     // Catch:{ 11T -> 0x0470 }
            goto L_0x019b
        L_0x0198:
            r36 = 0
            goto L_0x016d
        L_0x019b:
            if (r3 == 0) goto L_0x019e
            goto L_0x01a0
        L_0x019e:
            r3 = 0
            goto L_0x01aa
        L_0x01a0:
            java.lang.String r4 = "locked"
            boolean r3 = r3.A0G(r4)     // Catch:{ 11T -> 0x0470 }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)     // Catch:{ 11T -> 0x0470 }
        L_0x01aa:
            X.1cn r35 = X.A95.A0A(r3)     // Catch:{ 11T -> 0x0470 }
            X.A8k r3 = X.C20125A8k.A02(r0, r1, r2)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2CommunityDefaultSubGroup$Properties r3 = (com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl.Xwa2GroupQueryParticipatingGroups.InlineXWA2CommunityDefaultSubGroup.Properties) r3     // Catch:{ 11T -> 0x0470 }
            java.lang.String r5 = "ephemeral"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2CommunityDefaultSubGroup$Properties$Ephemeral> r4 = com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl.Xwa2GroupQueryParticipatingGroups.InlineXWA2CommunityDefaultSubGroup.Properties.Ephemeral.class
            X.A8k r3 = r3.A09(r4, r5)     // Catch:{ 11T -> 0x0470 }
            if (r3 == 0) goto L_0x0238
            java.lang.String r4 = "expiration_time_in_sec"
            int r39 = X.C20125A8k.A00(r3, r4)     // Catch:{ 11T -> 0x0470 }
        L_0x01c4:
            X.2sm r28 = X.AnonymousClass8BV.A0E()     // Catch:{ 11T -> 0x0470 }
            X.1yz r3 = X.AnonymousClass1EC.A01     // Catch:{ 11T -> 0x0470 }
            X.A8k r3 = X.C20125A8k.A02(r0, r1, r2)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2CommunityDefaultSubGroup$Properties r3 = (com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl.Xwa2GroupQueryParticipatingGroups.InlineXWA2CommunityDefaultSubGroup.Properties) r3     // Catch:{ 11T -> 0x0470 }
            X.1EC r29 = X.C20125A8k.A06(r3)     // Catch:{ 11T -> 0x0470 }
            java.util.LinkedHashMap r38 = X.A95.A0D(r12)     // Catch:{ 11T -> 0x0470 }
            X.A8k r3 = X.C20125A8k.A02(r0, r1, r2)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2CommunityDefaultSubGroup$Properties r3 = (com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl.Xwa2GroupQueryParticipatingGroups.InlineXWA2CommunityDefaultSubGroup.Properties) r3     // Catch:{ 11T -> 0x0470 }
            java.lang.String r5 = "lid_migration_state"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2CommunityDefaultSubGroup$Properties$LidMigrationState> r4 = com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl.Xwa2GroupQueryParticipatingGroups.InlineXWA2CommunityDefaultSubGroup.Properties.LidMigrationState.class
            X.A8k r3 = r3.A09(r4, r5)     // Catch:{ 11T -> 0x0470 }
            if (r3 == 0) goto L_0x0236
            com.whatsapp.infra.graphql.generated.groups.enums.GraphQLXWA2GroupAddressingMode r5 = com.whatsapp.infra.graphql.generated.groups.enums.GraphQLXWA2GroupAddressingMode.UNSET_OR_UNRECOGNIZED_ENUM_VALUE     // Catch:{ 11T -> 0x0470 }
            java.lang.String r4 = "addressing_mode"
            java.lang.Enum r3 = r3.A0E(r5, r4)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.infra.graphql.generated.groups.enums.GraphQLXWA2GroupAddressingMode r3 = (com.whatsapp.infra.graphql.generated.groups.enums.GraphQLXWA2GroupAddressingMode) r3     // Catch:{ 11T -> 0x0470 }
        L_0x01f2:
            java.lang.String r37 = X.A95.A0B(r3)     // Catch:{ 11T -> 0x0470 }
            X.A8k r3 = X.C20125A8k.A02(r0, r1, r2)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2CommunityDefaultSubGroup$Properties r3 = (com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl.Xwa2GroupQueryParticipatingGroups.InlineXWA2CommunityDefaultSubGroup.Properties) r3     // Catch:{ 11T -> 0x0470 }
            int r42 = X.A95.A00(r3)     // Catch:{ 11T -> 0x0470 }
            X.A8k r0 = X.C20125A8k.A02(r0, r1, r2)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2CommunityDefaultSubGroup$Properties r0 = (com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl.Xwa2GroupQueryParticipatingGroups.InlineXWA2CommunityDefaultSubGroup.Properties) r0     // Catch:{ 11T -> 0x0470 }
            java.lang.String r1 = "ack"
            boolean r57 = r0.A0G(r1)     // Catch:{ 11T -> 0x0470 }
            r52 = 1
            r40 = 3
            X.A2S r0 = new X.A2S     // Catch:{ 11T -> 0x0470 }
            r43 = r26
            r50 = r26
            r51 = r26
            r53 = r26
            r56 = r26
            r58 = r26
            r59 = r26
            r60 = r26
            r61 = r26
            r62 = r26
            r27 = r0
            r41 = r26
            r55 = r52
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r46, r48, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62)     // Catch:{ 11T -> 0x0470 }
            X.A1t r1 = new X.A1t     // Catch:{ 11T -> 0x0470 }
            r1.<init>(r0, r7, r6)     // Catch:{ 11T -> 0x0470 }
            goto L_0x046b
        L_0x0236:
            r3 = 0
            goto L_0x01f2
        L_0x0238:
            r39 = 0
            goto L_0x01c4
        L_0x023b:
            com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2CommunitySubGroup r4 = new com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2CommunitySubGroup     // Catch:{ 11T -> 0x0470 }
            r4.<init>(r2)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.infra.graphql.generated.groups.GroupCommonFragmentImpl r7 = X.C20125A8k.A03(r4)     // Catch:{ 11T -> 0x0470 }
            X.1EC r6 = X.A95.A04(r7)     // Catch:{ 11T -> 0x0470 }
            java.lang.Integer r5 = X.C20125A8k.A07(r7)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.jid.UserJid r32 = X.A95.A07(r7)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.jid.PhoneUserJid r30 = X.A95.A05(r7)     // Catch:{ 11T -> 0x0470 }
            long r44 = X.A95.A02(r7)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.infra.graphql.generated.groups.GroupCommonFragmentImpl$Subject r1 = r7.A0I()     // Catch:{ 11T -> 0x0470 }
            if (r1 == 0) goto L_0x029d
            java.lang.String r0 = "value"
            java.lang.String r36 = X.C72453Mb.A0z(r1, r0)     // Catch:{ 11T -> 0x0470 }
        L_0x0264:
            com.whatsapp.jid.UserJid r33 = X.A95.A08(r7)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.jid.PhoneUserJid r31 = X.A95.A06(r7)     // Catch:{ 11T -> 0x0470 }
            long r46 = X.A95.A03(r7)     // Catch:{ 11T -> 0x0470 }
            long r48 = X.C20125A8k.A01(r7)     // Catch:{ 11T -> 0x0470 }
            X.1yX r34 = X.A95.A09(r7)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2CommunitySubGroup$Properties r0 = r4.A0H()     // Catch:{ 11T -> 0x0470 }
            java.lang.String r1 = "locked"
            boolean r51 = r0.A0G(r1)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2CommunitySubGroup$Properties r2 = r4.A0H()     // Catch:{ 11T -> 0x0470 }
            java.lang.String r0 = "announcement"
            boolean r52 = r2.A0G(r0)     // Catch:{ 11T -> 0x0470 }
            boolean r54 = X.A95.A0E(r7)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2CommunitySubGroup$Properties r3 = r4.A0H()     // Catch:{ 11T -> 0x0470 }
            java.lang.String r2 = "growth_locked2"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2CommunitySubGroup$Properties$GrowthLocked2> r0 = com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl.Xwa2GroupQueryParticipatingGroups.InlineXWA2CommunitySubGroup.Properties.GrowthLocked2.class
            X.A8k r0 = r3.A09(r0, r2)     // Catch:{ 11T -> 0x0470 }
            goto L_0x02a0
        L_0x029d:
            r36 = 0
            goto L_0x0264
        L_0x02a0:
            if (r0 == 0) goto L_0x02a3
            goto L_0x02a5
        L_0x02a3:
            r0 = 0
            goto L_0x02ad
        L_0x02a5:
            boolean r0 = r0.A0G(r1)     // Catch:{ 11T -> 0x0470 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 11T -> 0x0470 }
        L_0x02ad:
            X.1cn r35 = X.A95.A0A(r0)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2CommunitySubGroup$Properties r2 = r4.A0H()     // Catch:{ 11T -> 0x0470 }
            java.lang.String r1 = "ephemeral"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2CommunitySubGroup$Properties$Ephemeral> r0 = com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl.Xwa2GroupQueryParticipatingGroups.InlineXWA2CommunitySubGroup.Properties.Ephemeral.class
            X.A8k r0 = r2.A09(r0, r1)     // Catch:{ 11T -> 0x0470 }
            if (r0 == 0) goto L_0x02d8
            java.lang.String r1 = "expiration_time_in_sec"
            int r39 = X.C20125A8k.A00(r0, r1)     // Catch:{ 11T -> 0x0470 }
        L_0x02c5:
            X.2sm r28 = X.AnonymousClass8BV.A0E()     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2CommunitySubGroup$Properties r1 = r4.A0H()     // Catch:{ 11T -> 0x0470 }
            java.lang.String r0 = "general_chat"
            boolean r0 = r1.A0G(r0)     // Catch:{ 11T -> 0x0470 }
            r40 = 2
            if (r0 == 0) goto L_0x02dd
            goto L_0x02db
        L_0x02d8:
            r39 = 0
            goto L_0x02c5
        L_0x02db:
            r40 = 6
        L_0x02dd:
            X.1yz r0 = X.AnonymousClass1EC.A01     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2CommunitySubGroup$Properties r0 = r4.A0H()     // Catch:{ 11T -> 0x0470 }
            X.1EC r29 = X.C20125A8k.A06(r0)     // Catch:{ 11T -> 0x0470 }
            java.util.LinkedHashMap r38 = X.A95.A0D(r7)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2CommunitySubGroup$Properties r1 = r4.A0H()     // Catch:{ 11T -> 0x0470 }
            java.lang.String r0 = "membership_approval_mode_enabled"
            boolean r56 = r1.A0G(r0)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2CommunitySubGroup$Properties r2 = r4.A0H()     // Catch:{ 11T -> 0x0470 }
            java.lang.String r1 = "lid_migration_state"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2CommunitySubGroup$Properties$LidMigrationState> r0 = com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl.Xwa2GroupQueryParticipatingGroups.InlineXWA2CommunitySubGroup.Properties.LidMigrationState.class
            X.A8k r0 = r2.A09(r0, r1)     // Catch:{ 11T -> 0x0470 }
            if (r0 == 0) goto L_0x035d
            com.whatsapp.infra.graphql.generated.groups.enums.GraphQLXWA2GroupAddressingMode r2 = com.whatsapp.infra.graphql.generated.groups.enums.GraphQLXWA2GroupAddressingMode.UNSET_OR_UNRECOGNIZED_ENUM_VALUE     // Catch:{ 11T -> 0x0470 }
            java.lang.String r1 = "addressing_mode"
            java.lang.Enum r0 = r0.A0E(r2, r1)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.infra.graphql.generated.groups.enums.GraphQLXWA2GroupAddressingMode r0 = (com.whatsapp.infra.graphql.generated.groups.enums.GraphQLXWA2GroupAddressingMode) r0     // Catch:{ 11T -> 0x0470 }
        L_0x030d:
            java.lang.String r37 = X.A95.A0B(r0)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2CommunitySubGroup$Properties r0 = r4.A0H()     // Catch:{ 11T -> 0x0470 }
            int r42 = X.A95.A00(r0)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2CommunitySubGroup$Properties r1 = r4.A0H()     // Catch:{ 11T -> 0x0470 }
            java.lang.String r0 = "ack"
            boolean r57 = r1.A0G(r0)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2CommunitySubGroup$Properties r1 = r4.A0H()     // Catch:{ 11T -> 0x0470 }
            java.lang.String r0 = "allow_admin_reports"
            boolean r58 = r1.A0G(r0)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2CommunitySubGroup$Properties r1 = r4.A0H()     // Catch:{ 11T -> 0x0470 }
            java.lang.String r0 = "auto_add_disabled"
            boolean r61 = r1.A0G(r0)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2CommunitySubGroup$Properties r1 = r4.A0H()     // Catch:{ 11T -> 0x0470 }
            java.lang.String r0 = "hidden_group"
            boolean r62 = r1.A0G(r0)     // Catch:{ 11T -> 0x0470 }
            X.A2S r0 = new X.A2S     // Catch:{ 11T -> 0x0470 }
            r43 = r26
            r50 = r26
            r53 = r26
            r55 = r26
            r59 = r26
            r60 = r26
            r27 = r0
            r41 = r26
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r46, r48, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62)     // Catch:{ 11T -> 0x0470 }
            X.A1t r1 = new X.A1t     // Catch:{ 11T -> 0x0470 }
            r1.<init>(r0, r6, r5)     // Catch:{ 11T -> 0x0470 }
            goto L_0x046b
        L_0x035d:
            r0 = 0
            goto L_0x030d
        L_0x035f:
            com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2GroupRegularGroup r4 = new com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2GroupRegularGroup     // Catch:{ 11T -> 0x0470 }
            r4.<init>(r2)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.infra.graphql.generated.groups.GroupCommonFragmentImpl r7 = X.C20125A8k.A03(r4)     // Catch:{ 11T -> 0x0470 }
            X.1EC r6 = X.A95.A04(r7)     // Catch:{ 11T -> 0x0470 }
            java.lang.Integer r5 = X.C20125A8k.A07(r7)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.jid.UserJid r32 = X.A95.A07(r7)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.jid.PhoneUserJid r30 = X.A95.A05(r7)     // Catch:{ 11T -> 0x0470 }
            long r44 = X.A95.A02(r7)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.infra.graphql.generated.groups.GroupCommonFragmentImpl$Subject r1 = r7.A0I()     // Catch:{ 11T -> 0x0470 }
            if (r1 == 0) goto L_0x03cb
            java.lang.String r0 = "value"
            java.lang.String r36 = X.C72453Mb.A0z(r1, r0)     // Catch:{ 11T -> 0x0470 }
        L_0x0388:
            com.whatsapp.jid.UserJid r33 = X.A95.A08(r7)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.jid.PhoneUserJid r31 = X.A95.A06(r7)     // Catch:{ 11T -> 0x0470 }
            long r46 = X.A95.A03(r7)     // Catch:{ 11T -> 0x0470 }
            long r48 = X.C20125A8k.A01(r7)     // Catch:{ 11T -> 0x0470 }
            X.1yX r34 = X.A95.A09(r7)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2GroupRegularGroup$Properties r1 = r4.A0H()     // Catch:{ 11T -> 0x0470 }
            java.lang.String r0 = "support"
            boolean r50 = r1.A0G(r0)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2GroupRegularGroup$Properties r0 = r4.A0H()     // Catch:{ 11T -> 0x0470 }
            java.lang.String r1 = "locked"
            boolean r51 = r0.A0G(r1)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2GroupRegularGroup$Properties r2 = r4.A0H()     // Catch:{ 11T -> 0x0470 }
            java.lang.String r0 = "announcement"
            boolean r52 = r2.A0G(r0)     // Catch:{ 11T -> 0x0470 }
            boolean r54 = X.A95.A0E(r7)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2GroupRegularGroup$Properties r3 = r4.A0H()     // Catch:{ 11T -> 0x0470 }
            java.lang.String r2 = "growth_locked2"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2GroupRegularGroup$Properties$GrowthLocked2> r0 = com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl.Xwa2GroupQueryParticipatingGroups.InlineXWA2GroupRegularGroup.Properties.GrowthLocked2.class
            X.A8k r0 = r3.A09(r0, r2)     // Catch:{ 11T -> 0x0470 }
            goto L_0x03ce
        L_0x03cb:
            r36 = 0
            goto L_0x0388
        L_0x03ce:
            if (r0 == 0) goto L_0x03d1
            goto L_0x03d3
        L_0x03d1:
            r0 = 0
            goto L_0x03db
        L_0x03d3:
            boolean r0 = r0.A0G(r1)     // Catch:{ 11T -> 0x0470 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ 11T -> 0x0470 }
        L_0x03db:
            X.1cn r35 = X.A95.A0A(r0)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2GroupRegularGroup$Properties r2 = r4.A0H()     // Catch:{ 11T -> 0x0470 }
            java.lang.String r1 = "ephemeral"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2GroupRegularGroup$Properties$Ephemeral> r0 = com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl.Xwa2GroupQueryParticipatingGroups.InlineXWA2GroupRegularGroup.Properties.Ephemeral.class
            X.A8k r0 = r2.A09(r0, r1)     // Catch:{ 11T -> 0x0470 }
            if (r0 == 0) goto L_0x0468
            java.lang.String r1 = "expiration_time_in_sec"
            int r39 = X.C20125A8k.A00(r0, r1)     // Catch:{ 11T -> 0x0470 }
        L_0x03f3:
            X.2sm r28 = X.AnonymousClass8BV.A0E()     // Catch:{ 11T -> 0x0470 }
            java.util.LinkedHashMap r38 = X.A95.A0D(r7)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2GroupRegularGroup$Properties r1 = r4.A0H()     // Catch:{ 11T -> 0x0470 }
            java.lang.String r0 = "membership_approval_mode_enabled"
            boolean r56 = r1.A0G(r0)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2GroupRegularGroup$Properties r2 = r4.A0H()     // Catch:{ 11T -> 0x0470 }
            java.lang.String r1 = "lid_migration_state"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2GroupRegularGroup$Properties$LidMigrationState> r0 = com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl.Xwa2GroupQueryParticipatingGroups.InlineXWA2GroupRegularGroup.Properties.LidMigrationState.class
            X.A8k r0 = r2.A09(r0, r1)     // Catch:{ 11T -> 0x0470 }
            if (r0 == 0) goto L_0x0466
            com.whatsapp.infra.graphql.generated.groups.enums.GraphQLXWA2GroupAddressingMode r2 = com.whatsapp.infra.graphql.generated.groups.enums.GraphQLXWA2GroupAddressingMode.UNSET_OR_UNRECOGNIZED_ENUM_VALUE     // Catch:{ 11T -> 0x0470 }
            java.lang.String r1 = "addressing_mode"
            java.lang.Enum r0 = r0.A0E(r2, r1)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.infra.graphql.generated.groups.enums.GraphQLXWA2GroupAddressingMode r0 = (com.whatsapp.infra.graphql.generated.groups.enums.GraphQLXWA2GroupAddressingMode) r0     // Catch:{ 11T -> 0x0470 }
        L_0x041d:
            java.lang.String r37 = X.A95.A0B(r0)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2GroupRegularGroup$Properties r0 = r4.A0H()     // Catch:{ 11T -> 0x0470 }
            int r42 = X.A95.A00(r0)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2GroupRegularGroup$Properties r1 = r4.A0H()     // Catch:{ 11T -> 0x0470 }
            java.lang.String r0 = "ack"
            boolean r57 = r1.A0G(r0)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2GroupRegularGroup$Properties r1 = r4.A0H()     // Catch:{ 11T -> 0x0470 }
            java.lang.String r0 = "allow_admin_reports"
            boolean r58 = r1.A0G(r0)     // Catch:{ 11T -> 0x0470 }
            com.whatsapp.infra.graphql.generated.groups.QueryParticipatingGroupsResponseImpl$Xwa2GroupQueryParticipatingGroups$InlineXWA2GroupRegularGroup$Properties r1 = r4.A0H()     // Catch:{ 11T -> 0x0470 }
            java.lang.String r0 = "capi"
            boolean r43 = r1.A0G(r0)     // Catch:{ 11T -> 0x0470 }
            X.A2S r0 = new X.A2S     // Catch:{ 11T -> 0x0470 }
            r41 = r26
            r53 = r26
            r55 = r26
            r59 = r26
            r60 = r26
            r61 = r26
            r62 = r26
            r27 = r0
            r29 = r16
            r40 = r26
            r27.<init>(r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r46, r48, r50, r51, r52, r53, r54, r55, r56, r57, r58, r59, r60, r61, r62)     // Catch:{ 11T -> 0x0470 }
            X.A1t r1 = new X.A1t     // Catch:{ 11T -> 0x0470 }
            r1.<init>(r0, r6, r5)     // Catch:{ 11T -> 0x0470 }
            goto L_0x046b
        L_0x0466:
            r0 = 0
            goto L_0x041d
        L_0x0468:
            r39 = 0
            goto L_0x03f3
        L_0x046b:
            r10.add(r1)
            goto L_0x002c
        L_0x0470:
            r3 = move-exception
            X.190 r2 = r11.A00
            java.lang.String r1 = "invalid-jid-received"
            java.lang.String r0 = "GetParticipatingGroupsMexHelper/handleInvalidJidReceived"
            r2.A0E(r0, r1, r3)
            goto L_0x002c
        L_0x047c:
            X.0wS r10 = X.C18460wS.A00
        L_0x047e:
            X.9ei r3 = r8.this$0
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            java.util.Iterator r2 = r10.iterator()
        L_0x0488:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x049b
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.A1t r0 = (X.C19983A1t) r0
            boolean r0 = r0.A03
            X.AnonymousClass3MZ.A1V(r1, r4, r0)
            goto L_0x0488
        L_0x049b:
            java.util.ArrayList r2 = X.AnonymousClass000.A13()
            java.util.Iterator r1 = r4.iterator()
        L_0x04a3:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x04b7
            java.lang.Object r0 = r1.next()
            X.A1t r0 = (X.C19983A1t) r0
            X.A2S r0 = r0.A00
            if (r0 == 0) goto L_0x04a3
            r2.add(r0)
            goto L_0x04a3
        L_0x04b7:
            java.util.Iterator r2 = r2.iterator()
        L_0x04bb:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x04cd
            java.lang.Object r1 = r2.next()
            X.A2S r1 = (X.A2S) r1
            X.126 r0 = r3.A01
            r0.A0S(r1)
            goto L_0x04bb
        L_0x04cd:
            X.9ei r0 = r8.this$0
            X.9zs r3 = r0.A02
            int r2 = r8.$params
            X.9Hx r1 = X.C179429Hx.GET_PARTICIPATING_GROUPS_PAGINATED
            r0 = 0
            r3.A01(r1, r10, r0, r2)
            com.whatsapp.infra.graphql.BaseMexCallback r0 = r8.$debugCallback
            if (r0 == 0) goto L_0x04e0
            r0.A02(r9)
        L_0x04e0:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.B1K.invoke(java.lang.Object):java.lang.Object");
    }
}
