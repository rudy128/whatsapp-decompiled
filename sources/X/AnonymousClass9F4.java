package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

/* renamed from: X.9F4  reason: invalid class name */
public class AnonymousClass9F4 extends AnonymousClass9EV {
    public final Object A00;

    public AnonymousClass9F4(C178719Ee r5, String str, byte[] bArr) {
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A19(A0Y, "xmlns", "vesta");
        AnonymousClass8BY.A1A(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", str, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        C178719Ee.A00(A0Y, r5);
        this.A00 = C29591cX.A00(C20121A8g.A07("l3", bArr), A0Y);
    }

    public AnonymousClass9F4(String str, String str2, byte[] bArr, byte[] bArr2, byte[] bArr3, byte[] bArr4, byte[] bArr5, long j) {
        String str3 = str2;
        C18070vi.A0d(str3, 7);
        C29591cX A0Y = C108955ca.A0Y();
        C29591cX.A01(A0Y, "xmlns", "waffle");
        C108965cb.A1I(A0Y, "smax_id", 63);
        C108995ce.A1E(A0Y);
        C29591cX.A01(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
        String str4 = str;
        AnonymousClass8BW.A1F(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_ID, str4, C29601cY.A04(str4, 0, 9007199254740991L, false) ? 1 : 0);
        C29591cX A0t = C108945cZ.A0t("encryption_metadata");
        C29591cX.A01(A0t, "version", "1");
        C29591cX.A01(A0t, "algorithm", "rsa2048");
        C29591cX A0t2 = C108945cZ.A0t("encrypted_key");
        byte[] bArr6 = bArr;
        C29601cY.A02(bArr6, 1, 2048);
        C108965cb.A1G(A0t2, A0t, bArr6);
        byte[] bArr7 = bArr2;
        C108965cb.A1G(C20121A8g.A06("nonce", bArr7), A0t, bArr7);
        C29591cX A0t3 = C108945cZ.A0t("encrypted_data");
        byte[] bArr8 = bArr3;
        C29601cY.A02(bArr8, 1, 8192);
        C108965cb.A1G(A0t3, A0t, bArr8);
        byte[] bArr9 = bArr4;
        C29591cX A06 = C20121A8g.A06("auth_tag", bArr9);
        A06.A01 = bArr9;
        AnonymousClass8BX.A1I(A06, A0t, A0Y);
        C29591cX A0t4 = C108945cZ.A0t("timestamp");
        long j2 = j;
        C20121A8g.A08(A0t4, C29601cY.A03(Long.valueOf(j2), 1, 9007199254740991L, false) ? 1 : 0, j2);
        C108955ca.A1P(A0t4, A0Y);
        C108955ca.A1P(C20121A8g.A05(str3), A0Y);
        C29591cX A0t5 = C108945cZ.A0t("id_sign");
        byte[] bArr10 = bArr5;
        C29601cY.A02(bArr10, 1, 2048);
        A0t5.A01 = bArr10;
        this.A00 = C29591cX.A00(A0t5, A0Y);
    }

    public AnonymousClass9F4(C178719Ee r5, AnonymousClass9EW r6, C178729Ef r7, String str, AnonymousClass1Y1 r9, byte[] bArr, int i, int i2) {
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A19(A0Y, "xmlns", "vesta");
        AnonymousClass8BY.A1A(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", str, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        C178719Ee.A00(A0Y, r5);
        this.A00 = C29591cX.A00(C20121A8g.A07("reg_payload", bArr), A0Y);
    }

    public AnonymousClass9F4(C178719Ee r5, AnonymousClass9EX r6, Long l, String str, int i) {
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A19(A0Y, "xmlns", "vesta");
        AnonymousClass8BY.A1A(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", str, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        C178719Ee.A00(A0Y, r5);
        this.A00 = C29591cX.A00(C108945cZ.A0t("init_reg"), A0Y);
    }

    public AnonymousClass9F4(C178719Ee r7, AnonymousClass9EY r8, String str, int i, long j) {
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A19(A0Y, "xmlns", "vesta");
        AnonymousClass8BY.A1A(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set", str, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        C178719Ee.A00(A0Y, r7);
        C29591cX A0t = C108945cZ.A0t("migration_urgency");
        C108965cb.A1I(A0t, "value", 1);
        this.A00 = C29591cX.A00(A0t, A0Y);
    }

    public AnonymousClass9F4(C178719Ee r5, String str) {
        C29591cX A0Y = C108955ca.A0Y();
        AnonymousClass8BY.A19(A0Y, "xmlns", "vesta");
        AnonymousClass8BY.A1A(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get", str, PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        C178719Ee.A00(A0Y, r5);
        this.A00 = C29591cX.A00(C108945cZ.A0t("init_login"), A0Y);
    }
}
