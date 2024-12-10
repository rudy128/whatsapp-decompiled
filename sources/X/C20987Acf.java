package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;

/* renamed from: X.Acf  reason: case insensitive filesystem */
public final class C20987Acf implements AnonymousClass1O5 {
    public C36211nW A00;
    public final int A01;
    public final AnonymousClass11S A02;
    public final C39511tC A03;
    public final UserJid A04;
    public final AnonymousClass1OZ A05;
    public final C20004A2u A06;
    public final String A07;
    public final AnonymousClass190 A08;
    public final AnonymousClass1KB A09;
    public final C26911Ty A0A;

    public C20987Acf(AnonymousClass190 r2, AnonymousClass1KB r3, AnonymousClass11S r4, C26911Ty r5, C39511tC r6, UserJid userJid, AnonymousClass1OZ r8, C20004A2u a2u, String str, int i) {
        C18070vi.A0g(r2, 4, r4);
        C18070vi.A0x(a2u, r8, r5, r6, r3);
        this.A01 = i;
        this.A04 = userJid;
        this.A07 = str;
        this.A08 = r2;
        this.A02 = r4;
        this.A06 = a2u;
        this.A05 = r8;
        this.A0A = r5;
        this.A03 = r6;
        this.A09 = r3;
    }

    public void BrD(String str) {
        C18070vi.A0d(str, 0);
        this.A06.A02("profile_view_tag");
        Log.i("sendGetBusinessProfile/delivery-error");
        this.A09.CGP(new C21452AkJ(27, str, this));
    }

    public final void A00(C36211nW r17) {
        AnonymousClass1MD[] r1;
        UserJid userJid;
        this.A00 = r17;
        AnonymousClass1OZ r9 = this.A05;
        String A0B = r9.A0B();
        this.A06.A03("profile_view_tag");
        String str = this.A07;
        if (str != null) {
            r1 = new AnonymousClass1MD[2];
            userJid = this.A04;
            C17880vN.A1I(userJid, "jid", r1, 0);
            C17880vN.A1Q("tag", str, r1, 1);
        } else {
            r1 = new AnonymousClass1MD[1];
            userJid = this.A04;
            C17880vN.A1I(userJid, "jid", r1, 0);
        }
        ArrayList A13 = AnonymousClass000.A13();
        C29621ca.A05("profile", A13, r1);
        this.A02.A0O(userJid);
        C29621ca A0l = AnonymousClass8BR.A0l("business_profile", new AnonymousClass1MD[]{new AnonymousClass1MD("v", this.A01)}, C17890vO.A1Y(A13, 0));
        AnonymousClass1MD[] r2 = new AnonymousClass1MD[3];
        C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B, r2, 0);
        C17880vN.A1Q("xmlns", "w:biz", r2, 1);
        C17880vN.A1Q(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", r2, 2);
        r9.A0I(this, AnonymousClass8BT.A0a(A0l, r2), A0B, 132, 32000);
        C17900vP.A0Y(userJid, "sendGetBusinessProfile jid=", AnonymousClass000.A10());
    }

    public void Bt9(C29621ca r4, String str) {
        C18070vi.A0h(str, r4);
        this.A06.A02("profile_view_tag");
        Log.i("sendGetBusinessProfile/response-error");
        this.A09.CGP(new C21459AkQ(this, r4, str, 24));
    }

    public void C7Z(C29621ca r6, String str) {
        AnonymousClass190 r1;
        String str2;
        boolean A15 = C18070vi.A15(str, r6);
        this.A06.A02("profile_view_tag");
        C29621ca A0K = r6.A0K("business_profile");
        if (A0K == null) {
            r1 = this.A08;
            str2 = "payload businessProfileNode doesn't match server";
        } else {
            C29621ca A0K2 = A0K.A0K("profile");
            if (A0K2 == null) {
                r1 = this.A08;
                str2 = "payload profileNode doesn't match server";
            } else {
                AnonymousClass11S r0 = this.A02;
                UserJid userJid = this.A04;
                r0.A0O(userJid);
                AEW A012 = A82.A01(userJid, A0K2);
                this.A0A.A0G(A012, userJid);
                this.A09.CGP(new C21453AkK(this, A012, 48));
                return;
            }
        }
        r1.A0G("smb-reg-business-profile-fetch-failed", str2, A15);
        Bt9(r6, str);
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
