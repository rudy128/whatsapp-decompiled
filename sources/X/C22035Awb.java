package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Awb  reason: case insensitive filesystem */
public final class C22035Awb extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ UserJid $bizCompatibleLid;
    public final /* synthetic */ String $iqId;
    public final /* synthetic */ C195119sp $request;
    public final /* synthetic */ C167838hr this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22035Awb(C195119sp r2, C167838hr r3, UserJid userJid, String str) {
        super(0);
        this.this$0 = r3;
        this.$iqId = str;
        this.$request = r2;
        this.$bizCompatibleLid = userJid;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C167838hr r10 = this.this$0;
        String str = this.$iqId;
        C195119sp r4 = this.$request;
        UserJid userJid = this.$bizCompatibleLid;
        boolean A17 = C18070vi.A17(str, r4);
        ArrayList A16 = C108955ca.A16(userJid, 2);
        AnonymousClass8BU.A1J("width", String.valueOf(r4.A01), A16);
        AnonymousClass8BU.A1J("height", String.valueOf(r4.A00), A16);
        C29621ca A0l = AnonymousClass8BR.A0l("image_dimensions", (AnonymousClass1MD[]) null, C17890vO.A1Y(A16, 0));
        C27354DcQ A01 = AnonymousClass1ZT.A01();
        A01.add(A0l);
        Iterator it = r4.A04.iterator();
        while (it.hasNext()) {
            String A0v = C17880vN.A0v(it);
            ArrayList A13 = AnonymousClass000.A13();
            AnonymousClass8BU.A1J(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0v, A13);
            AnonymousClass8BU.A1K("product", A01, (AnonymousClass1MD[]) null, C17890vO.A1Y(A13, 0));
        }
        String A0A = r10.A01.A0A(userJid);
        if (A0A != null) {
            r10.A00 = r4;
            AnonymousClass8BU.A1J("direct_connection_encrypted_info", A0A, A01);
        }
        AnonymousClass9PV.A00(r4.A02, A01, A17);
        C27354DcQ A02 = AnonymousClass1ZT.A02(A01);
        AnonymousClass1MD[] r3 = new AnonymousClass1MD[2];
        C17880vN.A1Q("op", "refresh", r3, 0);
        C17880vN.A1Q("biz_jid", userJid.getRawString(), r3, A17 ? 1 : 0);
        C29621ca A0l2 = AnonymousClass8BR.A0l("cart", r3, C17890vO.A1Y(A02, 0));
        AnonymousClass1MD[] r32 = new AnonymousClass1MD[5];
        C17880vN.A1Q("smax_id", "11", r32, 0);
        C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str, r32, A17);
        C17880vN.A1Q("xmlns", "fb:thrift_iq", r32, 2);
        AnonymousClass8BV.A1O(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r32);
        return AnonymousClass8BW.A0Q(A0l2, new AnonymousClass1MD((Jid) C173438v4.A00, "to"), r32);
    }
}
