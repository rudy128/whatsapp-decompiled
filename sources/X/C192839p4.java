package X;

import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.ArrayList;

/* renamed from: X.9p4  reason: invalid class name and case insensitive filesystem */
public class C192839p4 {
    public final Context A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass122 A02;
    public final C33711jG A03;
    public final AnonymousClass1QD A04;
    public final C31061ex A05;
    public final C33701jF A06;
    public final AnonymousClass1QS A07;
    public final AnonymousClass10I A08;
    public final C30931ek A09;

    public void A00(C33661jB r16) {
        C31061ex r9 = this.A05;
        String A062 = r9.A06();
        String A012 = this.A09.A01();
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A19(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set");
        C29591cX.A01(A0Y, "xmlns", "w:pay");
        boolean A1X = AnonymousClass8BY.A1X(A0Y, A062);
        C29591cX A0R = AnonymousClass8BS.A0R();
        C29591cX.A01(A0R, "action", "delete");
        if (A012 != null) {
            AnonymousClass8BY.A1C(A0R, A012, true);
        }
        C29621ca A002 = C29591cX.A00(A0R, A0Y);
        C17880vN.A1F(AnonymousClass8BU.A07(this.A04), "is_payment_account_created", A1X);
        r9.A0H(new C175428yh(this.A00, this.A03, this.A01, r16, this, 12), A002, A062, C20113A7w.A0L);
    }

    public C192839p4(Context context, AnonymousClass1KB r2, AnonymousClass122 r3, C33711jG r4, AnonymousClass1QD r5, C31061ex r6, C33701jF r7, AnonymousClass1QS r8, C30931ek r9, AnonymousClass10I r10) {
        this.A00 = context;
        this.A01 = r2;
        this.A08 = r10;
        this.A09 = r9;
        this.A07 = r8;
        this.A02 = r3;
        this.A04 = r5;
        this.A05 = r6;
        this.A06 = r7;
        this.A03 = r4;
    }

    public void A01(C191419mZ r11, C29621ca r12, String str, String str2, byte[] bArr) {
        ArrayList A13 = AnonymousClass000.A13();
        if (r12 != null) {
            A13.add(r12);
        }
        if (bArr != null) {
            A13.add(new C29621ca("password", bArr, new AnonymousClass1MD[0]));
        }
        C31061ex r2 = this.A05;
        AnonymousClass1MD[] r3 = new AnonymousClass1MD[4];
        C17880vN.A1Q("action", "generate-payments-dyi-report", r3, 0);
        AnonymousClass8BV.A1N("version", "1", r3);
        C17890vO.A12("nonce", str, r3);
        AnonymousClass8BV.A1O(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2, r3);
        C29621ca A0l = AnonymousClass8BR.A0l("account", r3, C17890vO.A1Y(A13, 0));
        Context context = this.A00;
        AnonymousClass1KB r6 = this.A01;
        r2.A0G(new C175428yh(context, this.A03, r6, r11, this, 13), A0l, "get");
    }
}
