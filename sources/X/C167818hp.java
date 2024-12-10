package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.8hp  reason: invalid class name and case insensitive filesystem */
public final class C167818hp extends C20997Acp {
    public final C195689tk A00;
    public final C20004A2u A01;
    public final C20027A3w A02;
    public final BAP A03;
    public final AnonymousClass11E A04;
    public final C19949A0g A05;
    public final AnonymousClass1OZ A06;
    public final C195049si A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C167818hp(C26911Ty r2, C195689tk r3, C20027A3w a3w, BAP bap, AnonymousClass11E r6, C19949A0g a0g, AnonymousClass1OZ r8, C20004A2u a2u, C195049si r10) {
        super(r2);
        C18070vi.A0d(r8, 2);
        C18070vi.A0d(r10, 9);
        this.A01 = a2u;
        this.A06 = r8;
        this.A04 = r6;
        this.A02 = a3w;
        this.A00 = r3;
        this.A03 = bap;
        this.A05 = a0g;
        this.A07 = r10;
    }

    public void BrD(String str) {
        C18070vi.A0d(str, 0);
        if (this.A00.A05 == null) {
            this.A01.A02("view_collection_details_tag");
        }
        this.A07.A00(str);
        Log.e("GetCollectionProductListProtocol/sendGetCollectionProductLis/delivery-error");
        this.A03.Btx(-1);
    }

    public final void A03() {
        if (!this.A04.A09()) {
            this.A03.Btx(-1);
            return;
        }
        String A0B = this.A06.A0B();
        C195049si r0 = this.A07;
        C195689tk r9 = this.A00;
        UserJid userJid = r9.A04;
        r0.A02(A0B, userJid, 270);
        String str = r9.A05;
        if (str == null) {
            this.A01.A03("view_collection_details_tag");
        }
        C19949A0g a0g = this.A05;
        ArrayList A13 = AnonymousClass000.A13();
        AnonymousClass8BU.A1J("limit", String.valueOf(r9.A01), A13);
        AnonymousClass8BU.A1J("width", String.valueOf(r9.A02), A13);
        AnonymousClass8BU.A1J("height", String.valueOf(r9.A00), A13);
        AnonymousClass8BU.A1J("is_category", Boolean.toString(r9.A08), A13);
        String str2 = r9.A07;
        if (str2 != null) {
            AnonymousClass8BU.A1J("catalog_session_id", str2, A13);
        }
        if (str != null) {
            AnonymousClass8BU.A1J("after", str, A13);
        }
        String A0A = this.A01.A0A(userJid);
        if (A0A != null) {
            AnonymousClass8BU.A1J("direct_connection_encrypted_info", A0A, A13);
        }
        AnonymousClass9PV.A00(r9.A03, A13, false);
        AnonymousClass1MD[] r2 = new AnonymousClass1MD[2];
        C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, r9.A06, r2, 0);
        r2[1] = new AnonymousClass1MD((Jid) userJid, "biz_jid");
        C29621ca A0l = AnonymousClass8BR.A0l("collection", r2, C17890vO.A1Y(A13, 0));
        AnonymousClass1MD[] r22 = new AnonymousClass1MD[5];
        C17880vN.A1I(C173438v4.A00, "to", r22, 0);
        C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B, r22, 1);
        C17880vN.A1Q("smax_id", "30", r22, 2);
        AnonymousClass8BV.A1O("xmlns", "w:biz:catalog", r22);
        C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r22, 4);
        a0g.A02(this, AnonymousClass8BT.A0a(A0l, r22), A0B, 270);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("app/sendGetCollectionProductList jid=");
        A10.append(userJid);
        C17890vO.A1A(A10, " success");
    }

    public void Brd(UserJid userJid) {
        Log.e("GetCollectionProductListProtocol/sendGetCollectionProductLis/direct-connection-error");
        this.A03.Btx(421);
    }

    public void Bre(UserJid userJid) {
        Log.i("GetCollectionProductListProtocolonDirectConnectionSucceeded/retry-request");
        A03();
    }

    public void Bt9(C29621ca r4, String str) {
        C18070vi.A0h(str, r4);
        C195689tk r2 = this.A00;
        if (r2.A05 == null) {
            this.A01.A02("view_collection_details_tag");
        }
        this.A07.A00(str);
        Log.e("GetCollectionProductListProtocol/sendGetCollectionProductList/response-error");
        int A002 = C60482o6.A00(r4);
        if (!A02(r2.A04, A002)) {
            this.A03.Btx(A002);
        }
    }

    public void C7Z(C29621ca r6, String str) {
        C195129sq A002;
        boolean A15 = C18070vi.A15(str, r6);
        C195689tk r3 = this.A00;
        if (r3.A05 == null) {
            this.A01.A02("view_collection_details_tag");
        }
        this.A07.A01(str);
        C20027A3w a3w = this.A02;
        C29621ca A0K = r6.A0K("collection");
        if (A0K == null || (A002 = C20027A3w.A00(a3w, A0K)) == null) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("GetCollectionProductListProtocol/sendGetCollectionProductList/onSuccess/emptyPage jid=");
            A10.append(r3.A04);
            C17890vO.A0w(A10);
            this.A03.Btx(A15 ? 1 : 0);
            return;
        }
        AN4 an4 = new AN4(A6T.A00(A0K.A0K("paging")), A002);
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("GetCollectionProductListProtocol/sendGetCollectionProductList/onSuccess jid=");
        C17900vP.A0b(r3.A04, A102);
        this.A03.C7a(an4, r3);
    }
}
