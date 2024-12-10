package X;

import android.content.Context;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.8GO  reason: invalid class name */
public class AnonymousClass8GO extends AnonymousClass1J2 {
    public C41731wy A00 = AnonymousClass3MW.A0o();
    public String A01;
    public boolean A02;
    public final AnonymousClass1DT A03 = AnonymousClass3MW.A0L();
    public final AnonymousClass18O A04;
    public final C18000vb A05;
    public final C199159zX A06;
    public final C197929xV A07;
    public final C188439hQ A08;

    /* JADX WARNING: type inference failed for: r2v0, types: [X.9fp, java.lang.Object] */
    public static void A04(AnonymousClass8GO r3) {
        ? obj = new Object();
        obj.A00 = 5;
        obj.A03 = AnonymousClass8BR.A1S(((C20118A8b) AnonymousClass8BS.A0W(r3.A03)).A0A);
        obj.A04 = "DEEP_LINK".equals(r3.A01);
        r3.A00.A0F(obj);
    }

    public static void A00(AnonymousClass8GO r2) {
        if (r2.A04.A09(AnonymousClass18O.A0Z)) {
            AnonymousClass1DT r1 = r2.A03;
            if (((C20118A8b) AnonymousClass8BS.A0W(r1)).A0P && !TextUtils.isEmpty(((C20118A8b) AnonymousClass8BS.A0W(r1)).A0F)) {
                C187449fp.A00(r2.A00, 3);
                return;
            }
        }
        A04(r2);
    }

    public static void A03(AnonymousClass8GO r18) {
        AnonymousClass8GO r3 = r18;
        if (r3.A04.A09(AnonymousClass18O.A0W)) {
            AnonymousClass1DT r4 = r3.A03;
            if (!TextUtils.isEmpty(((C20118A8b) AnonymousClass8BS.A0W(r4)).A0I)) {
                C188439hQ r2 = r3.A08;
                Context context = r2.A01.A00;
                AnonymousClass1KB r13 = r2.A00;
                C196259ui r16 = new C196259ui();
                C175628z1 r11 = new C175628z1(context, r13, C17880vN.A0U(r2.A08), AnonymousClass8BR.A0a(r2.A09), r16, r2.A05);
                String str = ((C20118A8b) AnonymousClass8BS.A0W(r4)).A08;
                C183459Yi r6 = new C183459Yi(r3);
                AnonymousClass1OZ r5 = r11.A02;
                String A0B = r5.A0B();
                String A0v = AnonymousClass8BT.A0v(str);
                C29591cX A0Y = C108955ca.A0Y();
                AnonymousClass8BY.A19(A0Y, "xmlns", "w:pay");
                AnonymousClass8BY.A1A(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", A0B, A0v);
                C29591cX A0R = AnonymousClass8BS.A0R();
                C29591cX.A01(A0R, "action", "upi-verify-qr-code");
                if (AnonymousClass8BS.A1O(str, 1, 10000)) {
                    C29591cX.A01(A0R, "signed-qr-code", str);
                }
                AnonymousClass8BW.A1B(r5, new C175978za(r11.A00, r11.A01, r11.A03, C197889xR.A04(r11, "upi-verify-qr-code"), r11, r6), C29591cX.A00(A0R, A0Y), A0B);
                return;
            }
        }
        A00(r3);
    }

    public AnonymousClass8GO(AnonymousClass18O r2, C18000vb r3, C199159zX r4, C188439hQ r5, C197929xV r6) {
        this.A04 = r2;
        this.A07 = r6;
        this.A05 = r3;
        this.A08 = r5;
        this.A06 = r4;
    }
}
