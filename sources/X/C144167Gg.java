package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.7Gg  reason: invalid class name and case insensitive filesystem */
public final class C144167Gg implements C35071lb {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AtomicInteger A05 = new AtomicInteger(0);

    /* renamed from: A01 */
    public void CBY(C1606789m r28, AnonymousClass705 r29, C134906rL r30, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        String str;
        C1606789m r7 = r28;
        AnonymousClass705 r13 = r29;
        X509Certificate x509Certificate2 = x509Certificate;
        C72473Md.A1M(x509Certificate2, r7, r13, 1);
        AnonymousClass00H r1 = this.A01;
        Integer num2 = C108945cZ.A0q(r1).A00;
        if (num2 != null) {
            int intValue = num2.intValue();
            AnonymousClass70I A0q = C108945cZ.A0q(r1);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("perform_backup_restore_");
            A0q.A03(intValue, C17880vN.A0t(A10, this.A05.getAndIncrement()));
        }
        PublicKey publicKey2 = publicKey;
        if (publicKey == null) {
            C108965cb.A1D(r7, "passwordPublicKey is null");
            return;
        }
        Integer num3 = num;
        if (num == null) {
            C108965cb.A1D(r7, "passwordKeyId is null");
            return;
        }
        C134906rL r6 = r30;
        if (r30 == null) {
            C108965cb.A1D(r7, "avatar user backup data is null");
            return;
        }
        try {
            KeyPair A022 = C20059A5i.A02();
            C18070vi.A0b(A022);
            String A0p = C108985cd.A0p(A022);
            Object obj = r6.A01.A00;
            C17960vV.A07(obj);
            String str2 = (String) obj;
            try {
                AnonymousClass00H r12 = this.A02;
                C129006h6 A0I = C108975cc.A0I(this.A03, C18070vi.A0H(C108945cZ.A0r(r12).A01(A0p, C108945cZ.A0r(r12).A00(str2, publicKey2, num3.intValue()))), x509Certificate2);
                String A0T = C17890vO.A0T(C108945cZ.A0r(r12).A01);
                byte[] bArr = A0I.A01;
                C18070vi.A0W(bArr);
                byte[] bArr2 = A0I.A02;
                C18070vi.A0W(bArr2);
                byte[] bArr3 = A0I.A00;
                C18070vi.A0W(bArr3);
                byte[] bArr4 = A0I.A03;
                C18070vi.A0W(bArr4);
                byte[] bArr5 = bArr;
                byte[] bArr6 = bArr2;
                AnonymousClass9F6 r15 = new AnonymousClass9F6(A0T, String.valueOf(C108985cd.A09(r6.A00)), bArr5, bArr6, bArr3, bArr4, AnonymousClass11P.A00(C108945cZ.A0r(r12).A00));
                C108945cZ.A0r(r12).A02(r7, (C29621ca) r15.A00, A0T, new AnonymousClass838(r7, this, str2, A022), new AnonymousClass83K(r7, r13, this, r6, num3, publicKey2, x509Certificate2));
            } catch (IOException e) {
                e = e;
                str = "Password encryption IOException:";
                Log.e(str, e);
                r7.Bsw(e);
            } catch (GeneralSecurityException e2) {
                e = e2;
                str = "Password encryption GeneralSecurityException:";
                Log.e(str, e);
                r7.Bsw(e);
            }
        } catch (NoSuchAlgorithmException e3) {
            e = e3;
            str = "Error generating key pair:";
            Log.e(str, e);
            r7.Bsw(e);
        }
    }

    public void CBW(C1606789m r32, AnonymousClass705 r33, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        String str;
        X509Certificate x509Certificate2 = x509Certificate;
        C18070vi.A0d(x509Certificate2, 0);
        C1606789m r13 = r32;
        AnonymousClass705 r22 = r33;
        C108985cd.A1D(r13, r22);
        AnonymousClass00H r1 = this.A01;
        Integer num2 = C108945cZ.A0q(r1).A00;
        if (num2 != null) {
            int intValue = num2.intValue();
            AnonymousClass70I A0q = C108945cZ.A0q(r1);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("perform_user_creation_");
            A0q.A03(intValue, C17880vN.A0t(A10, this.A05.getAndIncrement()));
        }
        PublicKey publicKey2 = publicKey;
        if (publicKey == null) {
            e = AnonymousClass000.A0k("passwordPublicKey is null");
        } else {
            Integer num3 = num;
            if (num == null) {
                e = AnonymousClass000.A0k("passwordKeyId is null");
            } else {
                try {
                    KeyPair A022 = C20059A5i.A02();
                    C18070vi.A0b(A022);
                    String A0p = C108985cd.A0p(A022);
                    String A002 = C20059A5i.A00();
                    C18070vi.A0X(A002);
                    try {
                        AnonymousClass00H r20 = this.A02;
                        C129006h6 A0I = C108975cc.A0I(this.A03, C18070vi.A0H(C108945cZ.A0r(r20).A01(A0p, C108945cZ.A0r(r20).A00(A002, publicKey2, num3.intValue()))), x509Certificate2);
                        String A0T = C17890vO.A0T(C108945cZ.A0r(r20).A01);
                        byte[] bArr = A0I.A01;
                        C18070vi.A0W(bArr);
                        byte[] bArr2 = A0I.A02;
                        C18070vi.A0W(bArr2);
                        byte[] bArr3 = A0I.A00;
                        C18070vi.A0W(bArr3);
                        byte[] bArr4 = A0I.A03;
                        C18070vi.A0W(bArr4);
                        long A003 = AnonymousClass11P.A00(C108945cZ.A0r(r20).A00);
                        C29591cX A0Y = C108955ca.A0Y();
                        C29591cX.A01(A0Y, "xmlns", "avatars");
                        C108965cb.A1I(A0Y, "smax_id", 100);
                        C108995ce.A1E(A0Y);
                        C29591cX.A01(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
                        if (C29601cY.A04(A0T, 0, 9007199254740991L, false)) {
                            C29591cX.A01(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0T);
                        }
                        C29591cX A0t = C108945cZ.A0t("encryption_metadata");
                        C29591cX.A01(A0t, "version", "1");
                        C29591cX.A01(A0t, "algorithm", "rsa2048");
                        C29591cX A0t2 = C108945cZ.A0t("encrypted_key");
                        C29601cY.A02(bArr, 1, 2048);
                        C108965cb.A1G(A0t2, A0t, bArr);
                        C29591cX A0t3 = C108945cZ.A0t("nonce");
                        C29601cY.A02(bArr2, 1, 128);
                        C108965cb.A1G(A0t3, A0t, bArr2);
                        C29591cX A0t4 = C108945cZ.A0t("encrypted_data");
                        C29601cY.A02(bArr3, 1, 8192);
                        C108965cb.A1G(A0t4, A0t, bArr3);
                        C29591cX A0t5 = C108945cZ.A0t("auth_tag");
                        C29601cY.A02(bArr4, 1, 128);
                        A0t5.A01 = bArr4;
                        A0Y.A05(C29591cX.A00(A0t5, A0t));
                        C29591cX A0t6 = C108945cZ.A0t("timestamp");
                        if (C29601cY.A03(Long.valueOf(A003), 1, 9007199254740991L, false)) {
                            A0t6.A07(String.valueOf(A003));
                        }
                        C29621ca A004 = C29591cX.A00(A0t6, A0Y);
                        X509Certificate x509Certificate3 = x509Certificate2;
                        C108945cZ.A0r(r20).A02(r13, A004, A0T, new AnonymousClass837(r13, this, A002, A022), new AnonymousClass83I(r13, r22, this, num3, publicKey2, x509Certificate3));
                        return;
                    } catch (IOException e) {
                        e = e;
                        str = "Password encryption IOException:";
                    } catch (GeneralSecurityException e2) {
                        e = e2;
                        str = "Password encryption GeneralSecurityException:";
                    }
                } catch (NoSuchAlgorithmException e3) {
                    e = e3;
                    str = "Error generating key pair:";
                    Log.e(str, e);
                    r13.Bsw(e);
                }
            }
        }
        r13.Bsw(e);
    }

    public void CBb(AnonymousClass732 r23, C1606789m r24, AnonymousClass705 r25, Integer num, String str, PublicKey publicKey, X509Certificate x509Certificate) {
        X509Certificate x509Certificate2 = x509Certificate;
        C18070vi.A0d(x509Certificate2, 0);
        C1606789m r13 = r24;
        AnonymousClass705 r14 = r25;
        C18070vi.A0g(r13, 2, r14);
        AnonymousClass00H r2 = this.A01;
        Integer num2 = C108945cZ.A0q(r2).A00;
        if (num2 != null) {
            int intValue = num2.intValue();
            AnonymousClass70I A0q = C108945cZ.A0q(r2);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("perform_user_deletion_");
            A0q.A03(intValue, C17880vN.A0t(A10, this.A05.getAndIncrement()));
        }
        AnonymousClass00H r9 = this.A02;
        String A0T = C17890vO.A0T(C108945cZ.A0r(r9).A01);
        String str2 = PublicKeyCredentialControllerUtility.JSON_KEY_USER;
        String str3 = str2;
        String str4 = str;
        if (!C18070vi.A18(str4, str2)) {
            str2 = "event";
            if (!C18070vi.A18(str4, str2)) {
                Log.e("Unsupported user deletion reason attribute");
                str2 = null;
            }
        }
        List A0N = C18070vi.A0N("event", str3, new String[2], 0, 1);
        C29591cX A0Y = C108955ca.A0Y();
        C29591cX.A01(A0Y, "xmlns", "avatars");
        C108965cb.A1I(A0Y, "smax_id", 102);
        C108995ce.A1E(A0Y);
        C29591cX.A01(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "get");
        if (C29601cY.A04(A0T, 0, 9007199254740991L, false)) {
            C29591cX.A01(A0Y, PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0T);
        }
        A0Y.A08(str2, "reason", A0N);
        C29621ca A032 = A0Y.A03();
        C108945cZ.A0r(r9).A02(r13, A032, A0T, new C1584380r(r13), new AnonymousClass83N(r23, r13, r14, this, num, str4, publicKey, x509Certificate2));
    }

    public void CBe(AnonymousClass732 r29, C1606789m r30, AnonymousClass705 r31, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        String str;
        X509Certificate x509Certificate2 = x509Certificate;
        C18070vi.A0d(x509Certificate2, 0);
        AnonymousClass732 r9 = r29;
        C1606789m r4 = r30;
        AnonymousClass705 r8 = r31;
        C72473Md.A1M(r9, r4, r8, 1);
        AnonymousClass00H r3 = this.A01;
        Integer num2 = C108945cZ.A0q(r3).A00;
        if (num2 != null) {
            int intValue = num2.intValue();
            AnonymousClass70I A0q = C108945cZ.A0q(r3);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("perform_token_refresh_");
            A0q.A03(intValue, C17880vN.A0t(A10, this.A05.getAndIncrement()));
        }
        PublicKey publicKey2 = publicKey;
        if (publicKey == null) {
            e = AnonymousClass000.A0k("passwordPublicKey is null");
        } else {
            Integer num3 = num;
            if (num == null) {
                e = AnonymousClass000.A0k("passwordKeyId is null");
            } else {
                try {
                    KeyPair A022 = C20059A5i.A02();
                    C18070vi.A0b(A022);
                    String A0p = C108985cd.A0p(A022);
                    String A012 = AnonymousClass732.A01(r9);
                    try {
                        AnonymousClass00H r7 = this.A02;
                        C135466sF A0r = C108945cZ.A0r(r7);
                        C18070vi.A0b(A012);
                        C129006h6 A0I = C108975cc.A0I(this.A03, C18070vi.A0H(C108945cZ.A0r(r7).A01(A0p, A0r.A00(A012, publicKey2, num3.intValue()))), x509Certificate2);
                        String A0T = C17890vO.A0T(C108945cZ.A0r(r7).A01);
                        byte[] bArr = A0I.A01;
                        C18070vi.A0W(bArr);
                        byte[] bArr2 = A0I.A02;
                        C18070vi.A0W(bArr2);
                        byte[] bArr3 = A0I.A00;
                        C18070vi.A0W(bArr3);
                        byte[] bArr4 = A0I.A03;
                        C18070vi.A0W(bArr4);
                        AnonymousClass9F6 r10 = new AnonymousClass9F6(A0T, String.valueOf(AnonymousClass732.A00(r9)), bArr, bArr2, bArr3, bArr4, AnonymousClass11P.A00(C108945cZ.A0r(r7).A00));
                        C108945cZ.A0r(r7).A02(r4, (C29621ca) r10.A00, A0T, new AnonymousClass83A(r4, this, A012, A022), new AnonymousClass83L(r9, r4, r8, this, num3, publicKey2, x509Certificate2));
                        return;
                    } catch (IOException e) {
                        e = e;
                        str = "Password encryption IOException:";
                    } catch (GeneralSecurityException e2) {
                        e = e2;
                        str = "Password encryption GeneralSecurityException:";
                    }
                } catch (NoSuchAlgorithmException e3) {
                    e = e3;
                    str = "Error generating key pair:";
                    Log.e(str, e);
                    r4.Bsw(e);
                }
            }
        }
        r4.Bsw(e);
    }

    public C144167Gg(AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0w(r3, r4, r5, r6, r7);
        this.A03 = r3;
        this.A02 = r4;
        this.A04 = r5;
        this.A00 = r6;
        this.A01 = r7;
    }

    public static final void A00(C1606789m r2, C144167Gg r3, C29621ca r4, String str, PrivateKey privateKey) {
        String A022 = ((A0V) r3.A03.get()).A02(AnonymousClass7GR.A00(r4), privateKey);
        r3.A04.get();
        r2.C7I(C137206v5.A00(C35021lW.A03, str, C17880vN.A16(A022)));
    }

    public /* bridge */ /* synthetic */ void CBX(C1606789m r2, AnonymousClass705 r3, Integer num, Integer num2, String str, String str2, String str3, PublicKey publicKey, X509Certificate x509Certificate) {
        throw C17880vN.A0y();
    }

    public /* bridge */ /* synthetic */ void CBZ() {
        throw C17880vN.A0y();
    }

    public void CBd(AnonymousClass732 r2, C1606789m r3, AnonymousClass705 r4, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        throw C17880vN.A0y();
    }
}
