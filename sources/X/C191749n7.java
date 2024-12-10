package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;

/* renamed from: X.9n7  reason: invalid class name and case insensitive filesystem */
public class C191749n7 {
    public final C31051ew A00;
    public final AnonymousClass1QS A01;
    public final AnonymousClass10I A02;
    public final AnonymousClass1KB A03;
    public final AnonymousClass11S A04;
    public final AnonymousClass11P A05;
    public final AnonymousClass118 A06;
    public final AnonymousClass1OZ A07;
    public final C33711jG A08;

    public void A00(C33661jB r21) {
        String A002 = AnonymousClass1PP.A00(this.A04, this.A05, false);
        AnonymousClass1OZ r10 = this.A07;
        String A0B = r10.A0B();
        C29591cX r1 = new C29591cX("iq");
        r1.A04(new AnonymousClass1MD((Jid) C173438v4.A00, "to"));
        C29591cX.A01(r1, "xmlns", "w:pay");
        C29591cX.A01(r1, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
        if (C29601cY.A04(A0B, 0, 9007199254740991L, false)) {
            C29591cX.A01(r1, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B);
        }
        C29591cX r5 = new C29591cX("account");
        C29591cX.A01(r5, "action", "br-remove-merchant-account");
        if (C29601cY.A04(A002, 1, 1000, false)) {
            C29591cX.A01(r5, "nonce", A002);
        }
        r10.A0I(new C175418yg(this.A06.A00, this.A08, this.A03, this, r21, 0), C29591cX.A00(r5, r1), A0B, 204, 0);
    }

    public C191749n7(AnonymousClass1KB r1, AnonymousClass11S r2, AnonymousClass11P r3, AnonymousClass118 r4, AnonymousClass1OZ r5, C33711jG r6, C31051ew r7, AnonymousClass1QS r8, AnonymousClass10I r9) {
        this.A05 = r3;
        this.A03 = r1;
        this.A04 = r2;
        this.A07 = r5;
        this.A06 = r4;
        this.A02 = r9;
        this.A01 = r8;
        this.A08 = r6;
        this.A00 = r7;
    }
}
