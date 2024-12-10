package X;

/* renamed from: X.1ME  reason: invalid class name */
public final class AnonymousClass1ME {
    /* JADX WARNING: type inference failed for: r0v2, types: [X.A8k, com.whatsapp.infra.graphql.generated.groups.GroupCommonFragmentImpl] */
    /* JADX WARNING: type inference failed for: r3v3, types: [X.A8k, com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityDefaultSubGroup] */
    /* JADX WARNING: type inference failed for: r4v3, types: [X.A8k, com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunitySubGroup] */
    /* JADX WARNING: type inference failed for: r1v56, types: [X.A8k, com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2GroupRegularGroup] */
    /* JADX WARNING: type inference failed for: r4v4, types: [X.A8k] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x0196  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0276  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.C59962nA A00(X.C63262sm r73, com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl r74) {
        /*
            r11 = 0
            r9 = r74
            X.C18070vi.A0d(r9, r11)
            r25 = 1
            java.lang.String r8 = "xwa2_group_query_by_id"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById> r7 = com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl.Xwa2GroupQueryById.class
            X.A8k r0 = r9.A09(r7, r8)
            r15 = 0
            if (r0 == 0) goto L_0x04d0
            org.json.JSONObject r1 = r0.A00
            X.C18070vi.A0W(r1)
            com.whatsapp.infra.graphql.generated.groups.GroupCommonFragmentImpl r0 = new com.whatsapp.infra.graphql.generated.groups.GroupCommonFragmentImpl
            r0.<init>(r1)
            X.1EC r14 = X.A95.A04(r0)
            com.whatsapp.jid.UserJid r16 = X.A95.A07(r0)
            long r29 = X.A95.A02(r0)
            com.whatsapp.infra.graphql.generated.groups.GroupCommonFragmentImpl$Subject r1 = r0.A0I()
            if (r1 == 0) goto L_0x0142
            java.lang.String r19 = r1.A0H()
        L_0x0034:
            long r31 = X.A95.A03(r0)
            java.lang.String r1 = "announcement_version"
            java.lang.String r3 = r0.A0F(r1)
            r1 = 0
            long r33 = X.C20099A7c.A04(r3, r1)
            java.lang.String r2 = "total_participants_count"
            org.json.JSONObject r1 = r0.A00
            int r23 = r1.optInt(r2)
            X.1yX r17 = X.A95.A09(r0)
            boolean r39 = X.A95.A0E(r0)
            com.whatsapp.infra.graphql.generated.groups.GroupCommonFragmentImpl$Participants r1 = r0.A0H()
            java.util.LinkedHashMap r21 = X.A95.A0C(r1)
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.String r2 = "creator"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.GroupCommonFragmentImpl$Creator> r1 = com.whatsapp.infra.graphql.generated.groups.GroupCommonFragmentImpl.Creator.class
            X.A8k r1 = r0.A09(r1, r2)
            if (r1 == 0) goto L_0x008b
            java.lang.String r3 = "id"
            java.lang.String r5 = r1.A0F(r3)
            java.lang.String r3 = "lid"
            java.lang.String r4 = r1.A0F(r3)
            java.lang.String r3 = "pn"
            java.lang.String r3 = r1.A0F(r3)
            X.7PS r1 = new X.7PS
            r1.<init>(r5, r4, r3)
            r6.add(r1)
        L_0x008b:
            com.whatsapp.infra.graphql.generated.groups.GroupCommonFragmentImpl$Subject r1 = r0.A0I()
            if (r1 == 0) goto L_0x00b3
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.GroupCommonFragmentImpl$Subject$Creator> r3 = com.whatsapp.infra.graphql.generated.groups.GroupCommonFragmentImpl.Subject.Creator.class
            X.A8k r1 = r1.A09(r3, r2)
            if (r1 == 0) goto L_0x00b3
            java.lang.String r3 = "id"
            java.lang.String r5 = r1.A0F(r3)
            java.lang.String r3 = "lid"
            java.lang.String r4 = r1.A0F(r3)
            java.lang.String r3 = "pn"
            java.lang.String r3 = r1.A0F(r3)
            X.7PS r1 = new X.7PS
            r1.<init>(r5, r4, r3)
            r6.add(r1)
        L_0x00b3:
            java.lang.String r3 = "description"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.GroupCommonFragmentImpl$Description> r1 = com.whatsapp.infra.graphql.generated.groups.GroupCommonFragmentImpl.Description.class
            X.A8k r0 = r0.A09(r1, r3)
            if (r0 == 0) goto L_0x00df
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.GroupCommonFragmentImpl$Description$Creator> r1 = com.whatsapp.infra.graphql.generated.groups.GroupCommonFragmentImpl.Description.Creator.class
            X.A8k r0 = r0.A09(r1, r2)
            if (r0 == 0) goto L_0x00df
            java.lang.String r1 = "id"
            java.lang.String r3 = r0.A0F(r1)
            java.lang.String r1 = "lid"
            java.lang.String r2 = r0.A0F(r1)
            java.lang.String r1 = "pn"
            java.lang.String r1 = r0.A0F(r1)
            X.7PS r0 = new X.7PS
            r0.<init>(r3, r2, r1)
            r6.add(r0)
        L_0x00df:
            java.util.Iterator r5 = r6.iterator()
        L_0x00e3:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0146
            java.lang.Object r0 = r5.next()
            X.7PS r0 = (X.AnonymousClass7PS) r0
            java.lang.Object r2 = r0.first
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r0.second
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r0 = r0.third
            java.lang.String r0 = (java.lang.String) r0
            if (r2 == 0) goto L_0x00e3
            X.1Dw r3 = com.whatsapp.jid.UserJid.Companion
            com.whatsapp.jid.UserJid r2 = r3.A04(r2)
            if (r2 == 0) goto L_0x00e3
            int r4 = r2.getType()
            r3 = 18
            if (r4 != r3) goto L_0x012b
            if (r0 == 0) goto L_0x00e3
            X.1Dx r1 = com.whatsapp.jid.PhoneUserJid.Companion
            com.whatsapp.jid.PhoneUserJid r3 = r1.A04(r0)
            if (r3 == 0) goto L_0x00e3
            java.lang.String r0 = r2.user
            X.1E2 r1 = new X.1E2
            r1.<init>(r0)
            X.1D6 r0 = new X.1D6
            r0.<init>(r3, r1)
        L_0x0123:
            java.lang.Object r1 = r0.second
            java.lang.Object r0 = r0.first
            r10.put(r1, r0)
            goto L_0x00e3
        L_0x012b:
            if (r1 == 0) goto L_0x00e3
            X.1yH r0 = X.AnonymousClass1E2.A01
            X.1E2 r3 = r0.A03(r1)
            if (r3 == 0) goto L_0x00e3
            java.lang.String r0 = r2.user
            com.whatsapp.jid.PhoneUserJid r1 = new com.whatsapp.jid.PhoneUserJid
            r1.<init>(r0)
            X.1D6 r0 = new X.1D6
            r0.<init>(r1, r3)
            goto L_0x0123
        L_0x0142:
            r19 = r15
            goto L_0x0034
        L_0x0146:
            X.A8k r0 = r9.A09(r7, r8)
            if (r0 == 0) goto L_0x0273
            java.lang.String r1 = "__typename"
            org.json.JSONObject r0 = r0.A00
            java.lang.String r1 = r0.optString(r1)
            int r2 = r1.hashCode()
            r1 = -334477582(0xffffffffec1046f2, float:-6.976814E26)
            if (r2 == r1) goto L_0x026c
            r4 = 0
        L_0x015e:
            X.A8k r0 = r9.A09(r7, r8)
            if (r0 == 0) goto L_0x0269
            java.lang.String r1 = "__typename"
            org.json.JSONObject r0 = r0.A00
            java.lang.String r1 = r0.optString(r1)
            int r2 = r1.hashCode()
            r1 = -334477582(0xffffffffec1046f2, float:-6.976814E26)
            if (r2 != r1) goto L_0x0269
            com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2GroupRegularGroup r1 = new com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2GroupRegularGroup
            r1.<init>(r0)
            com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2GroupRegularGroup$Properties r0 = r1.A0H()
            if (r0 == 0) goto L_0x0269
            java.lang.String r1 = "capi"
            boolean r0 = r0.A0G(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x018a:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r25)
            boolean r28 = X.C18070vi.A18(r0, r1)
            r13 = r73
            if (r4 == 0) goto L_0x0276
            com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2GroupRegularGroup$Properties r1 = r4.A0H()
            java.lang.String r0 = "support"
            boolean r63 = r1.A0G(r0)
            com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2GroupRegularGroup$Properties r0 = r4.A0H()
            java.lang.String r1 = "locked"
            boolean r64 = r0.A0G(r1)
            com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2GroupRegularGroup$Properties r2 = r4.A0H()
            java.lang.String r0 = "announcement"
            boolean r65 = r2.A0G(r0)
            com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2GroupRegularGroup$Properties r3 = r4.A0H()
            java.lang.String r2 = "growth_locked2"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2GroupRegularGroup$Properties$GrowthLocked2> r0 = com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl.Xwa2GroupQueryById.InlineXWA2GroupRegularGroup.Properties.GrowthLocked2.class
            X.A8k r0 = r3.A09(r0, r2)
            if (r0 == 0) goto L_0x0266
            boolean r0 = r0.A0G(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x01cb:
            X.1cn r46 = X.A95.A0A(r0)
            com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2GroupRegularGroup$Properties r2 = r4.A0H()
            java.lang.String r1 = "ephemeral"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2GroupRegularGroup$Properties$Ephemeral> r0 = com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl.Xwa2GroupQueryById.InlineXWA2GroupRegularGroup.Properties.Ephemeral.class
            X.A8k r0 = r2.A09(r0, r1)
            if (r0 == 0) goto L_0x0263
            java.lang.String r1 = "expiration_time_in_sec"
            org.json.JSONObject r0 = r0.A00
            int r52 = r0.optInt(r1)
        L_0x01e5:
            com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2GroupRegularGroup$Properties r1 = r4.A0H()
            java.lang.String r0 = "membership_approval_mode_enabled"
            boolean r69 = r1.A0G(r0)
            com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2GroupRegularGroup$Properties r2 = r4.A0H()
            java.lang.String r1 = "lid_migration_state"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2GroupRegularGroup$Properties$LidMigrationState> r0 = com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl.Xwa2GroupQueryById.InlineXWA2GroupRegularGroup.Properties.LidMigrationState.class
            X.A8k r0 = r2.A09(r0, r1)
            if (r0 == 0) goto L_0x0207
            com.whatsapp.infra.graphql.generated.groups.enums.GraphQLXWA2GroupAddressingMode r2 = com.whatsapp.infra.graphql.generated.groups.enums.GraphQLXWA2GroupAddressingMode.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "addressing_mode"
            java.lang.Enum r15 = r0.A0E(r2, r1)
            com.whatsapp.infra.graphql.generated.groups.enums.GraphQLXWA2GroupAddressingMode r15 = (com.whatsapp.infra.graphql.generated.groups.enums.GraphQLXWA2GroupAddressingMode) r15
        L_0x0207:
            java.lang.String r48 = X.A95.A0B(r15)
            com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2GroupRegularGroup$Properties r2 = r4.A0H()
            com.whatsapp.infra.graphql.generated.groups.enums.GraphQLXWA2GroupMemberAddMode r1 = com.whatsapp.infra.graphql.generated.groups.enums.GraphQLXWA2GroupMemberAddMode.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "member_add_mode"
            java.lang.Enum r0 = r2.A0E(r1, r0)
            com.whatsapp.infra.graphql.generated.groups.enums.GraphQLXWA2GroupMemberAddMode r0 = (com.whatsapp.infra.graphql.generated.groups.enums.GraphQLXWA2GroupMemberAddMode) r0
            int r55 = X.A95.A01(r0)
            com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2GroupRegularGroup$Properties r1 = r4.A0H()
            java.lang.String r0 = "ack"
            boolean r70 = r1.A0G(r0)
            com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2GroupRegularGroup$Properties r1 = r4.A0H()
            java.lang.String r0 = "allow_admin_reports"
            boolean r71 = r1.A0G(r0)
            r43 = 0
            X.2nA r12 = new X.2nA
            r54 = r11
            r66 = r11
            r68 = r11
            r72 = r11
            r73 = r11
            r74 = r11
            r40 = r12
            r41 = r13
            r42 = r14
            r44 = r16
            r45 = r17
            r47 = r19
            r49 = r21
            r50 = r10
            r51 = r23
            r53 = r11
            r56 = r28
            r57 = r29
            r59 = r31
            r61 = r33
            r67 = r39
            r40.<init>(r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r59, r61, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74)
            return r12
        L_0x0263:
            r52 = 0
            goto L_0x01e5
        L_0x0266:
            r0 = r15
            goto L_0x01cb
        L_0x0269:
            r0 = 0
            goto L_0x018a
        L_0x026c:
            com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2GroupRegularGroup r4 = new com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2GroupRegularGroup
            r4.<init>(r0)
            goto L_0x015e
        L_0x0273:
            r4 = r15
            goto L_0x015e
        L_0x0276:
            X.A8k r0 = r9.A09(r7, r8)
            if (r0 == 0) goto L_0x0387
            java.lang.String r1 = "__typename"
            org.json.JSONObject r0 = r0.A00
            java.lang.String r1 = r0.optString(r1)
            int r2 = r1.hashCode()
            r1 = -1340324424(0xffffffffb01c45b8, float:-5.6851546E-10)
            if (r2 != r1) goto L_0x0387
            com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunitySubGroup r4 = new com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunitySubGroup
            r4.<init>(r0)
            com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunitySubGroup$Properties r0 = r4.A0H()
            java.lang.String r1 = "locked"
            boolean r64 = r0.A0G(r1)
            com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunitySubGroup$Properties r2 = r4.A0H()
            java.lang.String r0 = "announcement"
            boolean r65 = r2.A0G(r0)
            com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunitySubGroup$Properties r3 = r4.A0H()
            java.lang.String r2 = "growth_locked2"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunitySubGroup$Properties$GrowthLocked2> r0 = com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunitySubGroup.Properties.GrowthLocked2.class
            X.A8k r0 = r3.A09(r0, r2)
            if (r0 == 0) goto L_0x0384
            boolean r0 = r0.A0G(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x02bc:
            X.1cn r46 = X.A95.A0A(r0)
            com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunitySubGroup$Properties r2 = r4.A0H()
            java.lang.String r1 = "ephemeral"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunitySubGroup$Properties$Ephemeral> r0 = com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunitySubGroup.Properties.Ephemeral.class
            X.A8k r0 = r2.A09(r0, r1)
            if (r0 == 0) goto L_0x0380
            java.lang.String r1 = "expiration_time_in_sec"
            org.json.JSONObject r0 = r0.A00
            int r52 = r0.optInt(r1)
        L_0x02d6:
            com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunitySubGroup$Properties r1 = r4.A0H()
            java.lang.String r0 = "general_chat"
            boolean r0 = r1.A0G(r0)
            r53 = 2
            if (r0 == 0) goto L_0x02e6
            r53 = 6
        L_0x02e6:
            android.os.Parcelable$Creator r0 = X.AnonymousClass1EC.CREATOR
            com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunitySubGroup$Properties r0 = r4.A0H()
            java.lang.String r1 = "parent_group_jid"
            org.json.JSONObject r0 = r0.A00
            java.lang.String r0 = r0.optString(r1)
            com.whatsapp.jid.GroupJid r0 = X.C36321nh.A01(r0)
            X.1EC r43 = X.C42941yz.A00(r0)
            com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunitySubGroup$Properties r1 = r4.A0H()
            java.lang.String r0 = "membership_approval_mode_enabled"
            boolean r69 = r1.A0G(r0)
            com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunitySubGroup$Properties r2 = r4.A0H()
            java.lang.String r1 = "lid_migration_state"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunitySubGroup$Properties$LidMigrationState> r0 = com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunitySubGroup.Properties.LidMigrationState.class
            X.A8k r0 = r2.A09(r0, r1)
            if (r0 == 0) goto L_0x031e
            com.whatsapp.infra.graphql.generated.groups.enums.GraphQLXWA2GroupAddressingMode r2 = com.whatsapp.infra.graphql.generated.groups.enums.GraphQLXWA2GroupAddressingMode.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "addressing_mode"
            java.lang.Enum r15 = r0.A0E(r2, r1)
            com.whatsapp.infra.graphql.generated.groups.enums.GraphQLXWA2GroupAddressingMode r15 = (com.whatsapp.infra.graphql.generated.groups.enums.GraphQLXWA2GroupAddressingMode) r15
        L_0x031e:
            java.lang.String r48 = X.A95.A0B(r15)
            com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunitySubGroup$Properties r2 = r4.A0H()
            com.whatsapp.infra.graphql.generated.groups.enums.GraphQLXWA2GroupMemberAddMode r1 = com.whatsapp.infra.graphql.generated.groups.enums.GraphQLXWA2GroupMemberAddMode.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "member_add_mode"
            java.lang.Enum r0 = r2.A0E(r1, r0)
            com.whatsapp.infra.graphql.generated.groups.enums.GraphQLXWA2GroupMemberAddMode r0 = (com.whatsapp.infra.graphql.generated.groups.enums.GraphQLXWA2GroupMemberAddMode) r0
            int r55 = X.A95.A01(r0)
            com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunitySubGroup$Properties r1 = r4.A0H()
            java.lang.String r0 = "ack"
            boolean r70 = r1.A0G(r0)
            com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunitySubGroup$Properties r1 = r4.A0H()
            java.lang.String r0 = "allow_admin_reports"
            boolean r71 = r1.A0G(r0)
            com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunitySubGroup$Properties r1 = r4.A0H()
            java.lang.String r0 = "hidden_group"
            boolean r74 = r1.A0G(r0)
            X.2nA r12 = new X.2nA
            r63 = r11
            r66 = r11
            r68 = r11
            r72 = r11
            r73 = r11
            r40 = r12
            r41 = r13
            r42 = r14
            r44 = r16
            r45 = r17
            r47 = r19
            r49 = r21
            r50 = r10
            r51 = r23
            r54 = r11
            r56 = r28
            r57 = r29
            r59 = r31
            r61 = r33
            r67 = r39
            r40.<init>(r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r59, r61, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74)
            return r12
        L_0x0380:
            r52 = 0
            goto L_0x02d6
        L_0x0384:
            r0 = r15
            goto L_0x02bc
        L_0x0387:
            X.A8k r0 = r9.A09(r7, r8)
            if (r0 == 0) goto L_0x0464
            java.lang.String r1 = "__typename"
            org.json.JSONObject r0 = r0.A00
            java.lang.String r1 = r0.optString(r1)
            int r2 = r1.hashCode()
            r1 = 357610951(0x1550b5c7, float:4.2148663E-26)
            if (r2 != r1) goto L_0x0464
            com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityDefaultSubGroup r3 = new com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityDefaultSubGroup
            r3.<init>(r0)
            com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityDefaultSubGroup$Properties r2 = r3.A0H()
            java.lang.String r1 = "growth_locked2"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityDefaultSubGroup$Properties$GrowthLocked2> r0 = com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityDefaultSubGroup.Properties.GrowthLocked2.class
            X.A8k r0 = r2.A09(r0, r1)
            if (r0 == 0) goto L_0x0461
            java.lang.String r1 = "locked"
            boolean r0 = r0.A0G(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x03bb:
            X.1cn r46 = X.A95.A0A(r0)
            com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityDefaultSubGroup$Properties r2 = r3.A0H()
            java.lang.String r1 = "ephemeral"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityDefaultSubGroup$Properties$Ephemeral> r0 = com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityDefaultSubGroup.Properties.Ephemeral.class
            X.A8k r0 = r2.A09(r0, r1)
            if (r0 == 0) goto L_0x045d
            java.lang.String r1 = "expiration_time_in_sec"
            org.json.JSONObject r0 = r0.A00
            int r52 = r0.optInt(r1)
        L_0x03d5:
            android.os.Parcelable$Creator r0 = X.AnonymousClass1EC.CREATOR
            com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityDefaultSubGroup$Properties r0 = r3.A0H()
            java.lang.String r1 = "parent_group_jid"
            org.json.JSONObject r0 = r0.A00
            java.lang.String r0 = r0.optString(r1)
            com.whatsapp.jid.GroupJid r0 = X.C36321nh.A01(r0)
            X.1EC r43 = X.C42941yz.A00(r0)
            com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityDefaultSubGroup$Properties r2 = r3.A0H()
            java.lang.String r1 = "lid_migration_state"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityDefaultSubGroup$Properties$LidMigrationState> r0 = com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityDefaultSubGroup.Properties.LidMigrationState.class
            X.A8k r0 = r2.A09(r0, r1)
            if (r0 == 0) goto L_0x0403
            com.whatsapp.infra.graphql.generated.groups.enums.GraphQLXWA2GroupAddressingMode r2 = com.whatsapp.infra.graphql.generated.groups.enums.GraphQLXWA2GroupAddressingMode.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r1 = "addressing_mode"
            java.lang.Enum r15 = r0.A0E(r2, r1)
            com.whatsapp.infra.graphql.generated.groups.enums.GraphQLXWA2GroupAddressingMode r15 = (com.whatsapp.infra.graphql.generated.groups.enums.GraphQLXWA2GroupAddressingMode) r15
        L_0x0403:
            java.lang.String r48 = X.A95.A0B(r15)
            com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityDefaultSubGroup$Properties r2 = r3.A0H()
            com.whatsapp.infra.graphql.generated.groups.enums.GraphQLXWA2GroupMemberAddMode r1 = com.whatsapp.infra.graphql.generated.groups.enums.GraphQLXWA2GroupMemberAddMode.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "member_add_mode"
            java.lang.Enum r0 = r2.A0E(r1, r0)
            com.whatsapp.infra.graphql.generated.groups.enums.GraphQLXWA2GroupMemberAddMode r0 = (com.whatsapp.infra.graphql.generated.groups.enums.GraphQLXWA2GroupMemberAddMode) r0
            int r55 = X.A95.A01(r0)
            com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityDefaultSubGroup$Properties r1 = r3.A0H()
            java.lang.String r0 = "ack"
            boolean r70 = r1.A0G(r0)
            r53 = 3
            X.2nA r12 = new X.2nA
            r63 = r11
            r64 = r11
            r66 = r11
            r68 = r25
            r69 = r11
            r71 = r11
            r72 = r11
            r73 = r11
            r74 = r11
            r40 = r12
            r41 = r13
            r42 = r14
            r44 = r16
            r45 = r17
            r47 = r19
            r49 = r21
            r50 = r10
            r51 = r23
            r54 = r11
            r56 = r28
            r57 = r29
            r59 = r31
            r61 = r33
            r65 = r25
            r67 = r39
            r40.<init>(r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54, r55, r56, r57, r59, r61, r63, r64, r65, r66, r67, r68, r69, r70, r71, r72, r73, r74)
            return r12
        L_0x045d:
            r52 = 0
            goto L_0x03d5
        L_0x0461:
            r0 = r15
            goto L_0x03bb
        L_0x0464:
            X.A8k r0 = r9.A09(r7, r8)
            if (r0 == 0) goto L_0x04c8
            java.lang.String r2 = "__typename"
            org.json.JSONObject r1 = r0.A00
            java.lang.String r0 = r1.optString(r2)
            int r2 = r0.hashCode()
            r0 = -1008570490(0xffffffffc3e26f86, float:-452.87128)
            if (r2 != r0) goto L_0x04c8
            com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup r0 = new com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup
            r0.<init>(r1)
            java.lang.String r2 = "properties"
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl$Xwa2GroupQueryById$InlineXWA2CommunityGroup$Properties> r1 = com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityGroup.Properties.class
            X.A8k r4 = r0.A09(r1, r2)
            X.C199610h.A04(r4)
            X.C18070vi.A0X(r4)
            java.lang.String r3 = "closed_by_membership_approval_mode"
            boolean r26 = r4.A0G(r3)
            X.A8k r1 = r0.A09(r1, r2)
            X.C199610h.A04(r1)
            X.C18070vi.A0X(r1)
            java.lang.String r0 = "allow_non_admin_sub_group_creation"
            boolean r44 = r1.A0G(r0)
            java.lang.String r20 = "pn"
            X.2nA r12 = new X.2nA
            r27 = r11
            r35 = r11
            r36 = r11
            r37 = r11
            r38 = r11
            r40 = r11
            r41 = r11
            r43 = r11
            r45 = r11
            r46 = r11
            r18 = r15
            r22 = r10
            r24 = r11
            r42 = r25
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r31, r33, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46)
            return r12
        L_0x04c8:
            java.lang.String r0 = "Not all group types are supported yet"
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            r1.<init>(r0)
            throw r1
        L_0x04d0:
            java.lang.String r0 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ME.A00(X.2sm, com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl):X.2nA");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0043, code lost:
        if (r6.equals("interactive") == false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AIj A01(X.AnonymousClass1EC r5, java.lang.String r6, java.lang.String r7) {
        /*
            r4 = this;
            r0 = 0
            X.C18070vi.A0d(r5, r0)
            com.whatsapp.infra.graphql.generated.groups.calls.XWA2GroupQueryInput r1 = new com.whatsapp.infra.graphql.generated.groups.calls.XWA2GroupQueryInput
            r1.<init>()
            java.lang.String r2 = r5.getRawString()
            java.lang.String r0 = "group_jid"
            r1.A05(r0, r2)
            java.lang.String r2 = "INTERACTIVE"
            int r0 = r6.hashCode()
            switch(r0) {
                case -1288666633: goto L_0x00a1;
                case -1079492040: goto L_0x0095;
                case 106629502: goto L_0x008a;
                case 376410371: goto L_0x007f;
                case 905628002: goto L_0x0073;
                case 1629331411: goto L_0x0067;
                case 1673354756: goto L_0x005c;
                case 1682441613: goto L_0x0051;
                case 1693488150: goto L_0x0046;
                case 1844104930: goto L_0x003d;
                default: goto L_0x001b;
            }
        L_0x001b:
            java.lang.String r2 = "UNKNOWN"
        L_0x001d:
            java.lang.String r0 = "query_context"
            r1.A05(r0, r2)
            if (r7 == 0) goto L_0x0029
            java.lang.String r0 = "participants_phash"
            r1.A05(r0, r7)
        L_0x0029:
            X.A7K r3 = new X.A7K
            r3.<init>()
            java.lang.String r0 = "input"
            r3.A04(r1, r0)
            java.lang.Class<com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl> r2 = com.whatsapp.infra.graphql.generated.groups.QueryGroupInfoResponseImpl.class
            java.lang.String r1 = "QueryGroupInfo"
            X.AIj r0 = new X.AIj
            r0.<init>(r3, r2, r1)
            return r0
        L_0x003d:
            java.lang.String r0 = "interactive"
            boolean r0 = r6.equals(r0)
            if (r0 != 0) goto L_0x001d
            goto L_0x001b
        L_0x0046:
            java.lang.String r0 = "lid_migration"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x001b
            java.lang.String r2 = "LID_MIGRATION"
            goto L_0x001d
        L_0x0051:
            java.lang.String r0 = "new_subject"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x001b
            java.lang.String r2 = "NEW_SUBJECT"
            goto L_0x001d
        L_0x005c:
            java.lang.String r0 = "ack_group_mismatch"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x001b
            java.lang.String r2 = "ACK_GROUP_MISMATCH"
            goto L_0x001d
        L_0x0067:
            java.lang.String r0 = "send_failure"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x001b
            java.lang.String r2 = "SEND_FAILURE"
            goto L_0x001d
        L_0x0073:
            java.lang.String r0 = "subgroup_conflict_recovery"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x001b
            java.lang.String r2 = "SUB_GROUP_CONFLICT_RECOVERY"
            goto L_0x001d
        L_0x007f:
            java.lang.String r0 = "accept_invite_conflict_recovery"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x001b
            java.lang.String r2 = "INVITE_CODE"
            goto L_0x001d
        L_0x008a:
            java.lang.String r0 = "phash"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x001b
            java.lang.String r2 = "PHASH"
            goto L_0x001d
        L_0x0095:
            java.lang.String r0 = "participant_change_recovery"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x001b
            java.lang.String r2 = "PARTICIPANT_CHANGE_RECOVERY"
            goto L_0x001d
        L_0x00a1:
            java.lang.String r0 = "prefetch"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x001b
            java.lang.String r2 = "PRE_FETCH"
            goto L_0x001d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1ME.A01(X.1EC, java.lang.String, java.lang.String):X.AIj");
    }
}
