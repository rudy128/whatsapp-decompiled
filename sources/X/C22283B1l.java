package X;

import com.whatsapp.infra.graphql.generated.groups.GroupCommonFragmentImpl;
import com.whatsapp.infra.graphql.generated.groups.QueryBatchGetGroupsResponseImpl;
import com.whatsapp.infra.graphql.generated.groups.enums.GraphQLXWA2GroupAddressingMode;
import com.whatsapp.infra.graphql.generated.groups.enums.GraphQLXWA2GroupQueryErrorCode;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* renamed from: X.B1l  reason: case insensitive filesystem */
public final class C22283B1l extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C26981Ug $callbackFuture;
    public final /* synthetic */ C194459rl $processingParameters;
    public final /* synthetic */ String $queryContext;
    public final /* synthetic */ C1193567u $this_enqueue;
    public final /* synthetic */ C186769ej this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22283B1l(C194459rl r2, C186769ej r3, C1193567u r4, C26981Ug r5, String str) {
        super(1);
        this.$this_enqueue = r4;
        this.this$0 = r3;
        this.$queryContext = str;
        this.$processingParameters = r2;
        this.$callbackFuture = r5;
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [X.A8k, com.whatsapp.infra.graphql.generated.groups.QueryBatchGetGroupsResponseImpl$Xwa2GroupBatchQueryById$InlineXWA2GroupRegularGroup] */
    /* JADX WARNING: type inference failed for: r4v3, types: [X.A8k, com.whatsapp.infra.graphql.generated.groups.QueryBatchGetGroupsResponseImpl$Xwa2GroupBatchQueryById$InlineXWA2CommunitySubGroup] */
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        C19983A1t a1t;
        AnonymousClass11T r1;
        String str;
        Boolean bool;
        int i;
        GraphQLXWA2GroupAddressingMode graphQLXWA2GroupAddressingMode;
        String str2;
        Boolean bool2;
        int i2;
        GraphQLXWA2GroupAddressingMode graphQLXWA2GroupAddressingMode2;
        String str3;
        Boolean bool3;
        int i3;
        GraphQLXWA2GroupAddressingMode graphQLXWA2GroupAddressingMode3;
        String str4;
        Object obj3 = obj;
        C18070vi.A0d(obj3, 0);
        C186769ej r8 = this.this$0;
        String str5 = this.$queryContext;
        C194459rl r11 = this.$processingParameters;
        C26981Ug r12 = this.$callbackFuture;
        try {
            QueryBatchGetGroupsResponseImpl queryBatchGetGroupsResponseImpl = (QueryBatchGetGroupsResponseImpl) obj3;
            C18070vi.A0d(queryBatchGetGroupsResponseImpl, 0);
            LinkedHashMap A13 = C17880vN.A13();
            ArrayList A132 = AnonymousClass000.A13();
            AnonymousClass1IX A0A = queryBatchGetGroupsResponseImpl.A0A(QueryBatchGetGroupsResponseImpl.Xwa2GroupBatchQueryById.class, "xwa2_group_batch_query_by_id");
            if (A0A != null) {
                Iterator it = A0A.iterator();
                while (it.hasNext()) {
                    QueryBatchGetGroupsResponseImpl.Xwa2GroupBatchQueryById xwa2GroupBatchQueryById = (QueryBatchGetGroupsResponseImpl.Xwa2GroupBatchQueryById) it.next();
                    C72453Mb.A1R(xwa2GroupBatchQueryById);
                    JSONObject jSONObject = xwa2GroupBatchQueryById.A00;
                    if (AnonymousClass8BT.A03(jSONObject) == 147711119) {
                        C20125A8k a8k = new C20125A8k(jSONObject);
                        C42941yz r0 = AnonymousClass1EC.A01;
                        AnonymousClass1EC A00 = C42941yz.A00(C36321nh.A01(a8k.A00.optString("jid")));
                        if (A00 != null) {
                            Enum A0D = a8k.A0D(GraphQLXWA2GroupQueryErrorCode.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "response_code");
                            C18070vi.A0X(A0D);
                            AnonymousClass1D6 A01 = AnonymousClass1D6.A01(A00, ((GraphQLXWA2GroupQueryErrorCode) A0D).name());
                            A13.put(A01.first, A01.second);
                        }
                    }
                    if (AnonymousClass8BT.A03(jSONObject) != -431104815) {
                        if (AnonymousClass8BT.A03(jSONObject) == -334477582) {
                            ? a8k2 = new C20125A8k(jSONObject);
                            GroupCommonFragmentImpl A03 = C20125A8k.A03(a8k2);
                            AnonymousClass1EC A04 = A95.A04(A03);
                            Integer A07 = C20125A8k.A07(A03);
                            UserJid A072 = A95.A07(A03);
                            PhoneUserJid A05 = A95.A05(A03);
                            long A02 = A95.A02(A03);
                            GroupCommonFragmentImpl.Subject A0I = A03.A0I();
                            if (A0I != null) {
                                str = C72453Mb.A0z(A0I, "value");
                            } else {
                                str = null;
                            }
                            UserJid A08 = A95.A08(A03);
                            PhoneUserJid A06 = A95.A06(A03);
                            long A032 = A95.A03(A03);
                            long A012 = C20125A8k.A01(A03);
                            C42661yX A09 = A95.A09(A03);
                            boolean A0G = a8k2.A0H().A0G("support");
                            boolean A0G2 = a8k2.A0H().A0G("locked");
                            boolean A0G3 = a8k2.A0H().A0G("announcement");
                            boolean A0E = A95.A0E(A03);
                            QueryBatchGetGroupsResponseImpl.Xwa2GroupBatchQueryById.InlineXWA2GroupRegularGroup.Properties.GrowthLocked2 growthLocked2 = (QueryBatchGetGroupsResponseImpl.Xwa2GroupBatchQueryById.InlineXWA2GroupRegularGroup.Properties.GrowthLocked2) a8k2.A0H().A09(QueryBatchGetGroupsResponseImpl.Xwa2GroupBatchQueryById.InlineXWA2GroupRegularGroup.Properties.GrowthLocked2.class, "growth_locked2");
                            if (growthLocked2 != null) {
                                bool = Boolean.valueOf(growthLocked2.A0G("locked"));
                            } else {
                                bool = null;
                            }
                            C29741cn A0A2 = A95.A0A(bool);
                            QueryBatchGetGroupsResponseImpl.Xwa2GroupBatchQueryById.InlineXWA2GroupRegularGroup.Properties.Ephemeral ephemeral = (QueryBatchGetGroupsResponseImpl.Xwa2GroupBatchQueryById.InlineXWA2GroupRegularGroup.Properties.Ephemeral) a8k2.A0H().A09(QueryBatchGetGroupsResponseImpl.Xwa2GroupBatchQueryById.InlineXWA2GroupRegularGroup.Properties.Ephemeral.class, "ephemeral");
                            if (ephemeral != null) {
                                i = C20125A8k.A00(ephemeral, "expiration_time_in_sec");
                            } else {
                                i = 0;
                            }
                            C63262sm A0E2 = AnonymousClass8BV.A0E();
                            LinkedHashMap A0D2 = A95.A0D(A03);
                            boolean A0G4 = a8k2.A0H().A0G("membership_approval_mode_enabled");
                            QueryBatchGetGroupsResponseImpl.Xwa2GroupBatchQueryById.InlineXWA2GroupRegularGroup.Properties.LidMigrationState lidMigrationState = (QueryBatchGetGroupsResponseImpl.Xwa2GroupBatchQueryById.InlineXWA2GroupRegularGroup.Properties.LidMigrationState) a8k2.A0H().A09(QueryBatchGetGroupsResponseImpl.Xwa2GroupBatchQueryById.InlineXWA2GroupRegularGroup.Properties.LidMigrationState.class, "lid_migration_state");
                            if (lidMigrationState != null) {
                                graphQLXWA2GroupAddressingMode = (GraphQLXWA2GroupAddressingMode) lidMigrationState.A0E(GraphQLXWA2GroupAddressingMode.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "addressing_mode");
                            } else {
                                graphQLXWA2GroupAddressingMode = null;
                            }
                            a1t = new C19983A1t(new A2S(A0E2, (AnonymousClass1EC) null, A05, A06, A072, A08, A09, A0A2, str, A95.A0B(graphQLXWA2GroupAddressingMode), A0D2, i, 0, 0, A95.A00(a8k2.A0H()), a8k2.A0H().A0G("capi") ? 1 : 0, A02, A032, A012, A0G, A0G2, A0G3, false, A0E, false, A0G4, a8k2.A0H().A0G("ack"), a8k2.A0H().A0G("allow_admin_reports"), false, false, false, false), A04, A07);
                        } else if (AnonymousClass8BT.A03(jSONObject) == -1340324424) {
                            ? a8k3 = new C20125A8k(jSONObject);
                            GroupCommonFragmentImpl A033 = C20125A8k.A03(a8k3);
                            AnonymousClass1EC A042 = A95.A04(A033);
                            Integer A073 = C20125A8k.A07(A033);
                            UserJid A074 = A95.A07(A033);
                            PhoneUserJid A052 = A95.A05(A033);
                            long A022 = A95.A02(A033);
                            GroupCommonFragmentImpl.Subject A0I2 = A033.A0I();
                            if (A0I2 != null) {
                                str2 = C72453Mb.A0z(A0I2, "value");
                            } else {
                                str2 = null;
                            }
                            UserJid A082 = A95.A08(A033);
                            PhoneUserJid A062 = A95.A06(A033);
                            long A034 = A95.A03(A033);
                            long A013 = C20125A8k.A01(A033);
                            C42661yX A092 = A95.A09(A033);
                            boolean A0G5 = a8k3.A0H().A0G("locked");
                            boolean A0G6 = a8k3.A0H().A0G("announcement");
                            boolean A0E3 = A95.A0E(A033);
                            QueryBatchGetGroupsResponseImpl.Xwa2GroupBatchQueryById.InlineXWA2CommunitySubGroup.Properties.GrowthLocked2 growthLocked22 = (QueryBatchGetGroupsResponseImpl.Xwa2GroupBatchQueryById.InlineXWA2CommunitySubGroup.Properties.GrowthLocked2) a8k3.A0H().A09(QueryBatchGetGroupsResponseImpl.Xwa2GroupBatchQueryById.InlineXWA2CommunitySubGroup.Properties.GrowthLocked2.class, "growth_locked2");
                            if (growthLocked22 != null) {
                                bool2 = Boolean.valueOf(growthLocked22.A0G("locked"));
                            } else {
                                bool2 = null;
                            }
                            C29741cn A0A3 = A95.A0A(bool2);
                            QueryBatchGetGroupsResponseImpl.Xwa2GroupBatchQueryById.InlineXWA2CommunitySubGroup.Properties.Ephemeral ephemeral2 = (QueryBatchGetGroupsResponseImpl.Xwa2GroupBatchQueryById.InlineXWA2CommunitySubGroup.Properties.Ephemeral) a8k3.A0H().A09(QueryBatchGetGroupsResponseImpl.Xwa2GroupBatchQueryById.InlineXWA2CommunitySubGroup.Properties.Ephemeral.class, "ephemeral");
                            if (ephemeral2 != null) {
                                i2 = C20125A8k.A00(ephemeral2, "expiration_time_in_sec");
                            } else {
                                i2 = 0;
                            }
                            C63262sm A0E4 = AnonymousClass8BV.A0E();
                            int i4 = 2;
                            if (a8k3.A0H().A0G("general_chat")) {
                                i4 = 6;
                            }
                            C42941yz r02 = AnonymousClass1EC.A01;
                            AnonymousClass1EC A063 = C20125A8k.A06(a8k3.A0H());
                            LinkedHashMap A0D3 = A95.A0D(A033);
                            boolean A0G7 = a8k3.A0H().A0G("membership_approval_mode_enabled");
                            QueryBatchGetGroupsResponseImpl.Xwa2GroupBatchQueryById.InlineXWA2CommunitySubGroup.Properties.LidMigrationState lidMigrationState2 = (QueryBatchGetGroupsResponseImpl.Xwa2GroupBatchQueryById.InlineXWA2CommunitySubGroup.Properties.LidMigrationState) a8k3.A0H().A09(QueryBatchGetGroupsResponseImpl.Xwa2GroupBatchQueryById.InlineXWA2CommunitySubGroup.Properties.LidMigrationState.class, "lid_migration_state");
                            if (lidMigrationState2 != null) {
                                graphQLXWA2GroupAddressingMode2 = (GraphQLXWA2GroupAddressingMode) lidMigrationState2.A0E(GraphQLXWA2GroupAddressingMode.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "addressing_mode");
                            } else {
                                graphQLXWA2GroupAddressingMode2 = null;
                            }
                            a1t = new C19983A1t(new A2S(A0E4, A063, A052, A062, A074, A082, A092, A0A3, str2, A95.A0B(graphQLXWA2GroupAddressingMode2), A0D3, i2, i4, 0, A95.A00(a8k3.A0H()), 0, A022, A034, A013, false, A0G5, A0G6, false, A0E3, false, A0G7, a8k3.A0H().A0G("ack"), a8k3.A0H().A0G("allow_admin_reports"), false, false, a8k3.A0H().A0G("auto_add_disabled"), a8k3.A0H().A0G("hidden_group")), A042, A073);
                        } else if (AnonymousClass8BT.A03(jSONObject) == 357610951) {
                            C20125A8k a8k4 = new C20125A8k(jSONObject);
                            GroupCommonFragmentImpl A035 = C20125A8k.A03(a8k4);
                            AnonymousClass1EC A043 = A95.A04(A035);
                            Integer A075 = C20125A8k.A07(A035);
                            UserJid A076 = A95.A07(A035);
                            PhoneUserJid A053 = A95.A05(A035);
                            long A023 = A95.A02(A035);
                            GroupCommonFragmentImpl.Subject A0I3 = A035.A0I();
                            if (A0I3 != null) {
                                str3 = C72453Mb.A0z(A0I3, "value");
                            } else {
                                str3 = null;
                            }
                            UserJid A083 = A95.A08(A035);
                            PhoneUserJid A064 = A95.A06(A035);
                            long A036 = A95.A03(A035);
                            long A014 = C20125A8k.A01(A035);
                            C42661yX A093 = A95.A09(A035);
                            boolean A0E5 = A95.A0E(A035);
                            Class<QueryBatchGetGroupsResponseImpl.Xwa2GroupBatchQueryById.InlineXWA2CommunityDefaultSubGroup.Properties> cls = QueryBatchGetGroupsResponseImpl.Xwa2GroupBatchQueryById.InlineXWA2CommunityDefaultSubGroup.Properties.class;
                            QueryBatchGetGroupsResponseImpl.Xwa2GroupBatchQueryById.InlineXWA2CommunityDefaultSubGroup.Properties.GrowthLocked2 growthLocked23 = (QueryBatchGetGroupsResponseImpl.Xwa2GroupBatchQueryById.InlineXWA2CommunityDefaultSubGroup.Properties.GrowthLocked2) ((QueryBatchGetGroupsResponseImpl.Xwa2GroupBatchQueryById.InlineXWA2CommunityDefaultSubGroup.Properties) C20125A8k.A02(a8k4, cls, "properties")).A09(QueryBatchGetGroupsResponseImpl.Xwa2GroupBatchQueryById.InlineXWA2CommunityDefaultSubGroup.Properties.GrowthLocked2.class, "growth_locked2");
                            if (growthLocked23 != null) {
                                bool3 = Boolean.valueOf(growthLocked23.A0G("locked"));
                            } else {
                                bool3 = null;
                            }
                            C29741cn A0A4 = A95.A0A(bool3);
                            QueryBatchGetGroupsResponseImpl.Xwa2GroupBatchQueryById.InlineXWA2CommunityDefaultSubGroup.Properties.Ephemeral ephemeral3 = (QueryBatchGetGroupsResponseImpl.Xwa2GroupBatchQueryById.InlineXWA2CommunityDefaultSubGroup.Properties.Ephemeral) ((QueryBatchGetGroupsResponseImpl.Xwa2GroupBatchQueryById.InlineXWA2CommunityDefaultSubGroup.Properties) C20125A8k.A02(a8k4, cls, "properties")).A09(QueryBatchGetGroupsResponseImpl.Xwa2GroupBatchQueryById.InlineXWA2CommunityDefaultSubGroup.Properties.Ephemeral.class, "ephemeral");
                            if (ephemeral3 != null) {
                                i3 = C20125A8k.A00(ephemeral3, "expiration_time_in_sec");
                            } else {
                                i3 = 0;
                            }
                            C63262sm A0E6 = AnonymousClass8BV.A0E();
                            C42941yz r2 = AnonymousClass1EC.A01;
                            AnonymousClass1EC A065 = C20125A8k.A06((QueryBatchGetGroupsResponseImpl.Xwa2GroupBatchQueryById.InlineXWA2CommunityDefaultSubGroup.Properties) C20125A8k.A02(a8k4, cls, "properties"));
                            LinkedHashMap A0D4 = A95.A0D(A035);
                            QueryBatchGetGroupsResponseImpl.Xwa2GroupBatchQueryById.InlineXWA2CommunityDefaultSubGroup.Properties.LidMigrationState lidMigrationState3 = (QueryBatchGetGroupsResponseImpl.Xwa2GroupBatchQueryById.InlineXWA2CommunityDefaultSubGroup.Properties.LidMigrationState) ((QueryBatchGetGroupsResponseImpl.Xwa2GroupBatchQueryById.InlineXWA2CommunityDefaultSubGroup.Properties) C20125A8k.A02(a8k4, cls, "properties")).A09(QueryBatchGetGroupsResponseImpl.Xwa2GroupBatchQueryById.InlineXWA2CommunityDefaultSubGroup.Properties.LidMigrationState.class, "lid_migration_state");
                            if (lidMigrationState3 != null) {
                                graphQLXWA2GroupAddressingMode3 = (GraphQLXWA2GroupAddressingMode) lidMigrationState3.A0E(GraphQLXWA2GroupAddressingMode.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "addressing_mode");
                            } else {
                                graphQLXWA2GroupAddressingMode3 = null;
                            }
                            a1t = new C19983A1t(new A2S(A0E6, A065, A053, A064, A076, A083, A093, A0A4, str3, A95.A0B(graphQLXWA2GroupAddressingMode3), A0D4, i3, 3, 0, A95.A00((QueryBatchGetGroupsResponseImpl.Xwa2GroupBatchQueryById.InlineXWA2CommunityDefaultSubGroup.Properties) C20125A8k.A02(a8k4, cls, "properties")), 0, A023, A036, A014, false, false, true, false, A0E5, true, false, ((QueryBatchGetGroupsResponseImpl.Xwa2GroupBatchQueryById.InlineXWA2CommunityDefaultSubGroup.Properties) C20125A8k.A02(a8k4, cls, "properties")).A0G("ack"), false, false, false, false, false), A043, A075);
                        } else if (AnonymousClass8BT.A03(jSONObject) != -1008570490) {
                            r1 = new AnonymousClass11T("BatchGetGroupInfoMexHelper/parseTruncatedOrFullGroupEnvelope invalid group type");
                        } else {
                            C20125A8k a8k5 = new C20125A8k(jSONObject);
                            GroupCommonFragmentImpl A037 = C20125A8k.A03(a8k5);
                            AnonymousClass1EC A044 = A95.A04(A037);
                            Integer A077 = C20125A8k.A07(A037);
                            UserJid A078 = A95.A07(A037);
                            PhoneUserJid A054 = A95.A05(A037);
                            long A024 = A95.A02(A037);
                            GroupCommonFragmentImpl.Subject A0I4 = A037.A0I();
                            if (A0I4 != null) {
                                str4 = C72453Mb.A0z(A0I4, "value");
                            } else {
                                str4 = null;
                            }
                            UserJid A084 = A95.A08(A037);
                            PhoneUserJid A066 = A95.A06(A037);
                            long A038 = A95.A03(A037);
                            long A015 = C20125A8k.A01(A037);
                            C42661yX A094 = A95.A09(A037);
                            boolean A0E7 = A95.A0E(A037);
                            C63262sm A0E8 = AnonymousClass8BV.A0E();
                            LinkedHashMap A0D5 = A95.A0D(A037);
                            Class<QueryBatchGetGroupsResponseImpl.Xwa2GroupBatchQueryById.InlineXWA2CommunityGroup.Properties> cls2 = QueryBatchGetGroupsResponseImpl.Xwa2GroupBatchQueryById.InlineXWA2CommunityGroup.Properties.class;
                            boolean A0G8 = ((QueryBatchGetGroupsResponseImpl.Xwa2GroupBatchQueryById.InlineXWA2CommunityGroup.Properties) C108985cd.A0I(a8k5, cls2, "properties")).A0G("closed_by_membership_approval_mode");
                            a1t = new C19983A1t(new A2S(A0E8, (AnonymousClass1EC) null, A054, A066, A078, A084, A094, (C29741cn) null, str4, "pn", A0D5, 0, 1, A0G8 ? 1 : 0, 0, 0, A024, A038, A015, false, false, false, false, A0E7, false, false, true, false, ((QueryBatchGetGroupsResponseImpl.Xwa2GroupBatchQueryById.InlineXWA2CommunityGroup.Properties) C108985cd.A0I(a8k5, cls2, "properties")).A0G("allow_non_admin_sub_group_creation"), false, false, false), A044, A077);
                        }
                        A132.add(a1t);
                    } else {
                        C20125A8k a8k6 = new C20125A8k(jSONObject);
                        C42941yz r03 = AnonymousClass1EC.A01;
                        JSONObject jSONObject2 = a8k6.A00;
                        AnonymousClass1EC A002 = C42941yz.A00(C36321nh.A01(jSONObject2.optString("jid")));
                        if (A002 != null) {
                            a1t = new C19983A1t(A002, AnonymousClass8BT.A0k("total_participants_count", jSONObject2));
                            A132.add(a1t);
                        } else {
                            StringBuilder A10 = AnonymousClass000.A10();
                            A10.append("BatchGetGroupInfoMexHelper/parseTruncatedGroup Invalid Jid: ");
                            r1 = new AnonymousClass11T(C17890vO.A0V(C36321nh.A01(jSONObject2.optString("jid")), A10));
                        }
                    }
                    throw r1;
                }
            }
            ArrayList A133 = AnonymousClass000.A13();
            Iterator it2 = A132.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (!((C19983A1t) next).A03) {
                    A133.add(next);
                }
            }
            ArrayList A134 = AnonymousClass000.A13();
            Iterator it3 = A133.iterator();
            while (it3.hasNext()) {
                A2S a2s = ((C19983A1t) it3.next()).A00;
                if (a2s != null) {
                    A134.add(a2s);
                }
            }
            Iterator it4 = A134.iterator();
            while (it4.hasNext()) {
                r8.A01.A0S((A2S) it4.next());
            }
            if (AnonymousClass8BR.A1Y(A13)) {
                AnonymousClass190 r4 = r8.A00;
                String A1H = AnonymousClass001.A1H("BatchGetGroupInfoMexHelper/logFailTable groups failed for, ", str5, AnonymousClass000.A10());
                StringBuilder A102 = AnonymousClass000.A10();
                A102.append("Failed: ");
                A102.append(A13.size());
                A102.append(", Errors: [");
                A102.append(C29431cG.A0h(", ", A13.values(), B32.A00));
                r4.A0G(A1H, C17890vO.A0c(A102, ']'), false);
            }
            C194449rk A016 = r8.A02.A01(C179429Hx.GET_PARTICIPATING_GROUPS_PAGINATED, A132, r11.A01, r11.A00);
            r12.BrF(new C194449rk(A13, A016.A01, A016.A02));
            obj2 = C27621Wu.A00;
        } catch (AnonymousClass11T e) {
            r8.A00.A0E("BatchGetGroupInfoMexHelper/handleInvalidJidReceived", "invalid-jid-received", e);
        } catch (Throwable th) {
            obj2 = C108945cZ.A1J(th);
        }
        Throwable A003 = C30671eK.A00(obj2);
        if (A003 == null) {
            return C27621Wu.A00;
        }
        C17900vP.A0X(A003, "BatchGetGroupInfoMexHelper/sendBatchGetGroupsViaMex/onSuccess failed to parse: ", AnonymousClass000.A10());
        throw A003;
    }
}
