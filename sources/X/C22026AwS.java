package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.AwS  reason: case insensitive filesystem */
public final class C22026AwS extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ String $directConnectionEncryptedInfo;
    public final /* synthetic */ String $iqId;
    public final /* synthetic */ C167828hq this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22026AwS(C167828hq r2, String str, String str2) {
        super(0);
        this.$iqId = str;
        this.this$0 = r2;
        this.$directConnectionEncryptedInfo = str2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String str = this.$iqId;
        C187669gB r10 = this.this$0.A02;
        String str2 = this.$directConnectionEncryptedInfo;
        C18070vi.A0d(str, 0);
        ArrayList A13 = AnonymousClass000.A13();
        AnonymousClass8BU.A1J(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r10.A03, A13);
        String str3 = r10.A04;
        if (str3.length() > 0) {
            AnonymousClass8BU.A1J("reason", str3, A13);
        }
        AnonymousClass8BU.A1J("catalog_session_id", r10.A05, A13);
        if (str2 != null) {
            AnonymousClass8BU.A1J("direct_connection_encrypted_info", str2, A13);
        }
        AnonymousClass1MD[] r2 = new AnonymousClass1MD[2];
        C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "report_product", r2, 0);
        C17880vN.A1I(r10.A02, "biz_jid", r2, 1);
        C29621ca A0l = AnonymousClass8BR.A0l("request", r2, C17890vO.A1Y(A13, 0));
        AnonymousClass1MD[] r22 = new AnonymousClass1MD[4];
        C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, r22, 0);
        C17880vN.A1Q("xmlns", "fb:thrift_iq", r22, 1);
        C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", r22, 2);
        return C29621ca.A00(C173438v4.A00, A0l, r22);
    }
}
