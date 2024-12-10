package X;

import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;

/* renamed from: X.6nD  reason: invalid class name and case insensitive filesystem */
public final class C132636nD {
    public final AnonymousClass707 A00;
    public final AnonymousClass10I A01;
    public final AnonymousClass1KB A02;
    public final AnonymousClass00H A03;

    public final void A00(C1607089p r13, String str, String str2, boolean z) {
        String str3;
        C18070vi.A0f(str, 0, r13);
        C17900vP.A0n("ChatSupportTicketManager/contactSupport called, shouldUploadLogs=", AnonymousClass000.A10(), true);
        AnonymousClass7LK r6 = new AnonymousClass7LK(this.A02, new C127306e8(r13, this), C17880vN.A0U(this.A03));
        AnonymousClass1OZ r5 = r6.A01;
        String A0B = r5.A0B();
        if (z) {
            str3 = "payment";
        } else {
            str3 = "general";
        }
        C29591cX A0Y = C108955ca.A0Y();
        C29591cX.A01(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B);
        C29591cX.A01(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
        A0Y.A04(new AnonymousClass1MD((Jid) C173438v4.A00, "to"));
        C29591cX.A01(A0Y, "xmlns", "fb:thrift_iq");
        C29591cX.A01(A0Y, "smax_id", "3");
        C29591cX A0t = C108945cZ.A0t("additional_attributes");
        C29591cX.A01(A0t, "context_flow", str3);
        C108955ca.A1P(A0t, A0Y);
        A0Y.A05(new C29621ca("description", str, (AnonymousClass1MD[]) null));
        if (!TextUtils.isEmpty(str2)) {
            A0Y.A05(new C29621ca("debug_information_json", str2, (AnonymousClass1MD[]) null));
        }
        r5.A0N(r6, A0Y.A03(), A0B, 256, 32000);
    }

    public C132636nD(AnonymousClass1KB r1, AnonymousClass707 r2, AnonymousClass10I r3, AnonymousClass00H r4) {
        C18070vi.A0s(r1, r3, r4, r2);
        this.A02 = r1;
        this.A01 = r3;
        this.A03 = r4;
        this.A00 = r2;
    }
}
