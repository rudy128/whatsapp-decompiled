package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.infra.graphql.generated.groups.QuerySubgroupParticipantCountResponseImpl;

public final class B26 extends AnonymousClass11G implements C22821Di {
    public static final B26 A00 = new B26();

    public B26() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C20125A8k a8k = (C20125A8k) obj;
        C42941yz r0 = AnonymousClass1EC.A01;
        Class<QuerySubgroupParticipantCountResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityGroup.SubGroups.Edges.Node> cls = QuerySubgroupParticipantCountResponseImpl.Xwa2GroupQueryById.InlineXWA2CommunityGroup.SubGroups.Edges.Node.class;
        return AnonymousClass1D6.A00(C42941yz.A01(C72453Mb.A0z(C108985cd.A0I(a8k, cls, "node"), PublicKeyCredentialControllerUtility.JSON_KEY_ID)), C20125A8k.A00(C108985cd.A0I(a8k, cls, "node"), "total_participants_count"));
    }
}
