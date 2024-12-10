package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;

/* renamed from: X.7GR  reason: invalid class name */
public abstract class AnonymousClass7GR implements AnonymousClass878 {
    public final AnonymousClass190 A00;
    public final AnonymousClass1OZ A01;

    public static C129006h6 A00(C29621ca r4) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        C29621ca A0L = r4.A0L("encryption_metadata");
        C29621ca A0L2 = A0L.A0L("encrypted_key");
        C29621ca A0L3 = A0L.A0L("nonce");
        C29621ca A0L4 = A0L.A0L("encrypted_data");
        C29621ca A0L5 = A0L.A0L("auth_tag");
        byte[] bArr4 = A0L2.A01;
        if (bArr4 != null && (bArr = A0L3.A01) != null && (bArr2 = A0L4.A01) != null && (bArr3 = A0L5.A01) != null) {
            return new C129006h6(bArr4, bArr2, bArr3, bArr);
        }
        throw new AnonymousClass1UI("encryption_metadata inner node data missing");
    }

    public void CHQ(C72373Lr r14, Object obj, int i) {
        C29591cX A0Y;
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        C29621ca A002;
        C29621ca A03;
        byte[] bArr4;
        byte[] bArr5;
        byte[] bArr6;
        AnonymousClass1OZ r6 = this.A01;
        String A0B = r6.A0B();
        int i2 = i;
        if (this instanceof AnonymousClass61Q) {
            A03 = ((AnonymousClass61Q) this).A00((C54612eQ) obj, A0B, i2);
        } else {
            if (this instanceof AnonymousClass61P) {
                C129006h6 r15 = (C129006h6) obj;
                A0Y = C108955ca.A0Y();
                C108965cb.A1H(A0Y, "smax_id", i2);
                C29591cX.A01(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B);
                C29591cX.A01(A0Y, "xmlns", "fb:graphql");
                C29591cX.A01(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
                C108995ce.A1E(A0Y);
                C29591cX A0t = C108945cZ.A0t("auth_metadata");
                C108965cb.A1I(A0t, "timestamp", AnonymousClass11P.A00(((AnonymousClass61P) this).A00));
                C108965cb.A1H(A0t, "version", 1);
                C29591cX.A01(A0t, "use_case", "support");
                C108955ca.A1P(A0t, A0Y);
                C29591cX A0t2 = C108945cZ.A0t("encryption_metadata");
                C108965cb.A1H(A0t2, "version", 1);
                C29591cX.A01(A0t2, "algorithm", "rsa2048");
                C29591cX A0t3 = C108945cZ.A0t("encrypted_key");
                byte[] bArr7 = null;
                if (r15 != null) {
                    bArr4 = r15.A01;
                } else {
                    bArr4 = null;
                }
                C108965cb.A1G(A0t3, A0t2, bArr4);
                C29591cX A0t4 = C108945cZ.A0t("encrypted_data");
                if (r15 != null) {
                    bArr5 = r15.A00;
                } else {
                    bArr5 = null;
                }
                C108965cb.A1G(A0t4, A0t2, bArr5);
                C29591cX A0t5 = C108945cZ.A0t("nonce");
                if (r15 != null) {
                    bArr6 = r15.A02;
                } else {
                    bArr6 = null;
                }
                C108965cb.A1G(A0t5, A0t2, bArr6);
                C29591cX A0t6 = C108945cZ.A0t("auth_tag");
                if (r15 != null) {
                    bArr7 = r15.A03;
                }
                A0t6.A01 = bArr7;
                A002 = C29591cX.A00(A0t6, A0t2);
            } else if (this instanceof AnonymousClass61O) {
                C129006h6 r152 = (C129006h6) obj;
                A0Y = C108955ca.A0Y();
                C108965cb.A1H(A0Y, "smax_id", i2);
                C29591cX.A01(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B);
                C29591cX.A01(A0Y, "xmlns", "fb:graphql");
                C29591cX.A01(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
                A0Y.A04(new AnonymousClass1MD((Jid) C173438v4.A00, "to"));
                C29591cX A0t7 = C108945cZ.A0t("auth_metadata");
                C108965cb.A1I(A0t7, "timestamp", AnonymousClass11P.A00(((AnonymousClass61O) this).A00));
                C29591cX.A01(A0t7, "version", "1");
                C108955ca.A1P(A0t7, A0Y);
                C29591cX A0t8 = C108945cZ.A0t("encryption_metadata");
                C29591cX.A01(A0t8, "version", "1");
                C29591cX.A01(A0t8, "algorithm", "rsa2048");
                C108965cb.A1G(C108945cZ.A0t("encrypted_key"), A0t8, r152.A01);
                C108965cb.A1G(C108945cZ.A0t("encrypted_data"), A0t8, r152.A00);
                C108965cb.A1G(C108945cZ.A0t("nonce"), A0t8, r152.A02);
                C29591cX A0t9 = C108945cZ.A0t("auth_tag");
                A0t9.A01 = r152.A03;
                A002 = C29591cX.A00(A0t9, A0t8);
            } else {
                C129006h6 r153 = (C129006h6) obj;
                A0Y = C108955ca.A0Y();
                C108965cb.A1H(A0Y, "smax_id", i2);
                C29591cX.A01(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B);
                C29591cX.A01(A0Y, "xmlns", "fb:graphql");
                C29591cX.A01(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
                C108995ce.A1E(A0Y);
                C29591cX A0t10 = C108945cZ.A0t("auth_metadata");
                C108965cb.A1I(A0t10, "timestamp", AnonymousClass11P.A00(((AnonymousClass61N) this).A00));
                C108965cb.A1H(A0t10, "version", 1);
                C108955ca.A1P(A0t10, A0Y);
                C29591cX A0t11 = C108945cZ.A0t("encryption_metadata");
                C108965cb.A1H(A0t11, "version", 1);
                C29591cX.A01(A0t11, "algorithm", "rsa2048");
                C29591cX A0t12 = C108945cZ.A0t("encrypted_key");
                byte[] bArr8 = null;
                if (r153 != null) {
                    bArr = r153.A01;
                } else {
                    bArr = null;
                }
                C108965cb.A1G(A0t12, A0t11, bArr);
                C29591cX A0t13 = C108945cZ.A0t("encrypted_data");
                if (r153 != null) {
                    bArr2 = r153.A00;
                } else {
                    bArr2 = null;
                }
                C108965cb.A1G(A0t13, A0t11, bArr2);
                C29591cX A0t14 = C108945cZ.A0t("nonce");
                if (r153 != null) {
                    bArr3 = r153.A02;
                } else {
                    bArr3 = null;
                }
                C108965cb.A1G(A0t14, A0t11, bArr3);
                C29591cX A0t15 = C108945cZ.A0t("auth_tag");
                if (r153 != null) {
                    bArr8 = r153.A03;
                }
                A0t15.A01 = bArr8;
                A002 = C29591cX.A00(A0t15, A0t11);
            }
            A0Y.A05(A002);
            A03 = A0Y.A03();
        }
        r6.A0N(new AnonymousClass37G(this, r14, 1), A03, A0B, 264, 32000);
    }

    public AnonymousClass7GR(AnonymousClass190 r1, AnonymousClass1OZ r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
