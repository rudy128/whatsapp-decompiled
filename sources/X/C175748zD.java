package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.8zD  reason: invalid class name and case insensitive filesystem */
public final class C175748zD extends C197889xR {
    public final AnonymousClass190 A00;
    public final C24751Ln A01;
    public final C18030ve A02;
    public final AnonymousClass1OZ A03;

    public final void A00(C22565BDa bDa, UserJid userJid, String str, String str2, String str3) {
        boolean z;
        C22565BDa bDa2 = bDa;
        C29621ca r4 = null;
        UserJid userJid2 = userJid;
        String str4 = str;
        boolean A17 = C18070vi.A17(userJid2, str4);
        C18030ve r3 = this.A02;
        boolean A05 = C18020vd.A05(C18040vf.A02, r3, 12679);
        StringBuilder A10 = AnonymousClass000.A10();
        if (!A05) {
            C17900vP.A0f("PAY: sendUpiP2MEvent skipping P2M logging as ABProp is off : ", str4, A10);
            return;
        }
        C17900vP.A0f("PAY: sendUpiP2MEvent called for referenceId: ", str4, A10);
        AnonymousClass1OZ r9 = this.A03;
        String A0B = r9.A0B();
        UserJid A012 = C60432o1.A01(this.A00, this.A01, r3, userJid2, "upi-log-p2m-event");
        C18070vi.A0X(A012);
        if (bDa != null) {
            ARR arr = (ARR) bDa2;
            z = true;
            r4 = C178749Eh.A00(new C178749Eh(String.valueOf(bDa2.getValue()), String.valueOf(arr.A00), AnonymousClass8BU.A0n(arr), 17), "amount").A03();
        } else {
            z = false;
        }
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "APP_SIGNAL";
        List A0O = C18070vi.A0O("ORDER_STATUS", A1Z, A17 ? 1 : 0);
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A19(A0Y, "xmlns", "w:pay");
        C29591cX.A01(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
        AnonymousClass8BY.A15(A0Y, A0B);
        C29591cX A0R = AnonymousClass8BS.A0R();
        C29591cX.A01(A0R, "action", "upi-log-p2m-event");
        AnonymousClass8BT.A1E(A012, A0R, "receiver");
        if (C29601cY.A04(str4, 1, 1000, false)) {
            C29591cX.A01(A0R, "reference_id", str4);
        }
        String str5 = str2;
        if (str2 != null && C29601cY.A04(str5, 1, 1000, A17)) {
            C29591cX.A01(A0R, "status", str5);
        }
        A0R.A08(str3, "referral", A0O);
        if (z) {
            A0R.A05(r4);
        }
        r9.A0N(new C20961AcF(str4), C29591cX.A00(A0R, A0Y), A0B, 204, 0);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C175748zD(AnonymousClass190 r2, C24751Ln r3, C18030ve r4, AnonymousClass1OZ r5, A7U a7u, C31061ex r7) {
        super(a7u.A04, r7);
        C18070vi.A0w(r4, r2, r5, a7u, r7);
        C18070vi.A0d(r3, 6);
        this.A02 = r4;
        this.A00 = r2;
        this.A03 = r5;
        this.A01 = r3;
    }
}
