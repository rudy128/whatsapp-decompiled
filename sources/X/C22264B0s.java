package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.groups.GroupCommonFragmentImpl;
import com.whatsapp.infra.graphql.generated.groups.QueryLinkedGroupInfoResponseImpl;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.B0s  reason: case insensitive filesystem */
public final class C22264B0s extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C22509BAq $getSubgroupInfoResponse;
    public final /* synthetic */ C85104Mc this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22264B0s(C85104Mc r2, C22509BAq bAq) {
        super(1);
        this.this$0 = r2;
        this.$getSubgroupInfoResponse = bAq;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        C195799tv r9;
        String str2;
        UserJid userJid;
        int A01;
        Object obj2 = obj;
        C18070vi.A0d(obj2, 0);
        C20125A8k a8k = (C20125A8k) obj2;
        Class<QueryLinkedGroupInfoResponseImpl.Xwa2GroupQueryById> cls = QueryLinkedGroupInfoResponseImpl.Xwa2GroupQueryById.class;
        C20125A8k A09 = a8k.A09(cls, "xwa2_group_query_by_id");
        if (A09 != null) {
            JSONObject jSONObject = A09.A00;
            if (AnonymousClass8BT.A03(jSONObject) == -1340324424) {
                C20125A8k a8k2 = new C20125A8k(jSONObject);
                C85104Mc r4 = this.this$0;
                GroupCommonFragmentImpl A03 = C20125A8k.A03(a8k2);
                AnonymousClass1EC A04 = A95.A04(A03);
                UserJid A07 = A95.A07(A03);
                long A02 = A95.A02(A03);
                GroupCommonFragmentImpl.Subject A0I = A03.A0I();
                if (A0I != null) {
                    str2 = C72453Mb.A0z(A0I, "value");
                } else {
                    str2 = null;
                }
                long A032 = A95.A03(A03);
                Map A0D = A95.A0D(A03);
                if (A0D == null) {
                    A0D = AnonymousClass1D7.A0I();
                }
                int A00 = C20125A8k.A00(A03, "total_participants_count");
                C42661yX A092 = A95.A09(A03);
                Class<QueryLinkedGroupInfoResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunitySubGroup.Properties> cls2 = QueryLinkedGroupInfoResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunitySubGroup.Properties.class;
                int i = 2;
                if (C108985cd.A0I(a8k2, cls2, "properties").A0G("general_chat")) {
                    i = 6;
                }
                PhoneUserJid A012 = AnonymousClass11S.A01(r4.A00);
                C18070vi.A0X(A012);
                if (!C108985cd.A0I(a8k2, cls2, "properties").A0G("membership_approval_mode_enabled")) {
                    A01 = 0;
                } else {
                    Class<QueryLinkedGroupInfoResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunitySubGroup.MembershipApprovalRequests> cls3 = QueryLinkedGroupInfoResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunitySubGroup.MembershipApprovalRequests.class;
                    C20125A8k A093 = a8k2.A09(cls3, "membership_approval_requests");
                    if (A093 == null || C20125A8k.A00(A093, "total_count") != 0) {
                        C20125A8k A094 = a8k2.A09(cls3, "membership_approval_requests");
                        if (A094 != null) {
                            AnonymousClass1IX A0J = C108955ca.A0J(A094, QueryLinkedGroupInfoResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunitySubGroup.MembershipApprovalRequests.Edges.class, "edges");
                            C18070vi.A0X(A0J);
                            C20125A8k a8k3 = (C20125A8k) C29431cG.A0c(A0J);
                            if (a8k3 != null) {
                                userJid = AnonymousClass8BR.A0X(C108985cd.A0I(C108985cd.A0I(a8k3, QueryLinkedGroupInfoResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunitySubGroup.MembershipApprovalRequests.Edges.Node.class, "node"), QueryLinkedGroupInfoResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunitySubGroup.MembershipApprovalRequests.Edges.Node.User.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER).A00.optString("jid"));
                                A01 = AnonymousClass8BU.A01(C18070vi.A18(userJid, A012) ? 1 : 0);
                            }
                        }
                        userJid = null;
                        A01 = AnonymousClass8BU.A01(C18070vi.A18(userJid, A012) ? 1 : 0);
                    } else {
                        A01 = 1;
                    }
                }
                r9 = new C195799tv(A04, A07, A092, str2, A0D, A00, i, A01, A02, A032, C108985cd.A0I(a8k2, cls2, "properties").A0G("admin_request_required"), C108985cd.A0I(a8k2, cls2, "properties").A0G("hidden_group"));
                C22509BAq bAq = this.$getSubgroupInfoResponse;
                AnonymousClass1EC r11 = r9.A05;
                UserJid userJid2 = r9.A06;
                long j = r9.A03;
                String str3 = r9.A08;
                Map map = r9.A09;
                int i2 = r9.A02;
                bAq.C7D(r11, userJid2, r9.A07, str3, map, i2, r9.A01, r9.A00, j, r9.A0A, r9.A0B);
                return C27621Wu.A00;
            }
        }
        C20125A8k A095 = a8k.A09(cls, "xwa2_group_query_by_id");
        if (A095 != null) {
            JSONObject jSONObject2 = A095.A00;
            if (AnonymousClass8BT.A03(jSONObject2) == 357610951) {
                GroupCommonFragmentImpl A033 = C20125A8k.A03(new C20125A8k(jSONObject2));
                AnonymousClass1EC A042 = A95.A04(A033);
                UserJid A072 = A95.A07(A033);
                long A022 = A95.A02(A033);
                GroupCommonFragmentImpl.Subject A0I2 = A033.A0I();
                if (A0I2 != null) {
                    str = C72453Mb.A0z(A0I2, "value");
                } else {
                    str = null;
                }
                long A034 = A95.A03(A033);
                Map A0D2 = A95.A0D(A033);
                if (A0D2 == null) {
                    A0D2 = AnonymousClass1D7.A0I();
                }
                r9 = new C195799tv(A042, A072, A95.A09(A033), str, A0D2, C20125A8k.A00(A033, "total_participants_count"), 3, 0, A022, A034, false, false);
                C22509BAq bAq2 = this.$getSubgroupInfoResponse;
                AnonymousClass1EC r112 = r9.A05;
                UserJid userJid22 = r9.A06;
                long j2 = r9.A03;
                String str32 = r9.A08;
                Map map2 = r9.A09;
                int i22 = r9.A02;
                bAq2.C7D(r112, userJid22, r9.A07, str32, map2, i22, r9.A01, r9.A00, j2, r9.A0A, r9.A0B);
                return C27621Wu.A00;
            }
        }
        throw new AnonymousClass11T("Invalid Linked Group");
    }
}
