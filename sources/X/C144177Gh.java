package X;

import android.util.Base64;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.whatsapp.infra.graphql.generated.www_account_infra.WWWCreateAccessTokenResponseImpl;
import com.whatsapp.infra.graphql.generated.www_account_infra.WWWCreateUserResponseImpl;
import com.whatsapp.infra.graphql.generated.www_account_infra.WWWDeleteUserResponseImpl;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.X509Certificate;
import org.json.JSONObject;

/* renamed from: X.7Gh  reason: invalid class name and case insensitive filesystem */
public abstract class C144177Gh implements C35071lb {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;

    public abstract C35021lW A02();

    public abstract String A03();

    public void CBW(C1606789m r17, AnonymousClass705 r18, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        String str;
        X509Certificate x509Certificate2 = x509Certificate;
        C18070vi.A0d(x509Certificate2, 0);
        C1606789m r8 = r17;
        AnonymousClass705 r9 = r18;
        C108985cd.A1D(r8, r9);
        PublicKey publicKey2 = publicKey;
        if (publicKey == null) {
            e = AnonymousClass000.A0k("passwordPublicKey is null");
        } else {
            Integer num2 = num;
            if (num == null) {
                e = AnonymousClass000.A0k("passwordKeyId is null");
            } else {
                try {
                    KeyPair A022 = C20059A5i.A02();
                    String A0p = C108985cd.A0p(A022);
                    String A002 = C20059A5i.A00();
                    C18070vi.A0X(A002);
                    try {
                        String A012 = A01(A002, publicKey2, num2.intValue());
                        JSONObject A0h = C108995ce.A0h();
                        AnonymousClass00H r4 = this.A03;
                        A0h.put("timestamp", AnonymousClass11P.A00((AnonymousClass11P) r4.get()));
                        A0h.put("password", A012);
                        C108985cd.A1J(A0p, A0h);
                        C162478Kx A003 = A00(C108975cc.A0I(this.A00, C18070vi.A0H(A0h), x509Certificate2), 0);
                        C162478Kx.A01(A003, String.valueOf(AnonymousClass11P.A00((AnonymousClass11P) r4.get())), "timestamp");
                        C162478Kx.A01(A003, A03(), "use_case");
                        A7K a7k = new A7K();
                        C108975cc.A0z(A003, a7k, "input");
                        C108975cc.A0J(new AIj(a7k, WWWCreateUserResponseImpl.class, "WWWCreateUser"), this.A05).A04(new AnonymousClass7SS(r8, r9, this, num2, A002, A022, publicKey2, x509Certificate2));
                        return;
                    } catch (IOException e) {
                        e = e;
                        str = "Password encryption IOException:";
                    } catch (GeneralSecurityException e2) {
                        e = e2;
                        str = "Password encryption GeneralSecurityException:";
                    }
                } catch (NoSuchAlgorithmException e3) {
                    Log.e("Error generating key pair:", e3);
                    r8.Bsw(e3);
                    return;
                }
            }
        }
        r8.Bsw(e);
        Log.e(str, e);
        r8.Bsw(e);
    }

    public void CBb(AnonymousClass732 r5, C1606789m r6, AnonymousClass705 r7, Integer num, String str, PublicKey publicKey, X509Certificate x509Certificate) {
        C18070vi.A0d(r6, 2);
        C189819ju r2 = GraphQlCallInput.A02;
        String valueOf = String.valueOf(AnonymousClass11P.A00((AnonymousClass11P) this.A03.get()));
        C162478Kx A002 = r2.A00();
        C162478Kx.A01(A002, valueOf, "timestamp");
        C162478Kx.A01(A002, str, "reason");
        C162478Kx.A01(A002, A03(), "use_case");
        A7K a7k = new A7K();
        C108975cc.A0z(A002, a7k, "input");
        C108975cc.A0J(new AIj(a7k, WWWDeleteUserResponseImpl.class, "WWWDeleteUser"), this.A05).A04(new AnonymousClass7SB(r6, 32));
    }

    public static C162478Kx A00(C129006h6 r4, int i) {
        C189819ju r3 = GraphQlCallInput.A02;
        String encodeToString = Base64.encodeToString(r4.A01, i);
        C18070vi.A0X(encodeToString);
        C162478Kx A002 = r3.A00();
        C162478Kx.A01(A002, encodeToString, "key");
        String encodeToString2 = Base64.encodeToString(r4.A00, i);
        C18070vi.A0X(encodeToString2);
        C162478Kx.A01(A002, encodeToString2, "data");
        String encodeToString3 = Base64.encodeToString(r4.A03, i);
        C18070vi.A0X(encodeToString3);
        C162478Kx.A01(A002, encodeToString3, "tag");
        String encodeToString4 = Base64.encodeToString(r4.A02, i);
        C18070vi.A0X(encodeToString4);
        C162478Kx.A01(A002, encodeToString4, "nonce");
        C162478Kx.A01(A002, "rsa2048", "algorithm");
        C162478Kx A003 = r3.A00();
        A003.A06(A002, "encrypted_password");
        return A003;
    }

    private final String A01(String str, PublicKey publicKey, int i) {
        this.A00.get();
        String A002 = A0V.A00(Integer.valueOf(i), str, (String) null, publicKey);
        StringBuilder A15 = C108955ca.A15(A002);
        A15.append("#PWD_WA:11:");
        A15.append(AnonymousClass11P.A00((AnonymousClass11P) this.A03.get()));
        return C17890vO.A0Z(A002, A15, ':');
    }

    public void CBY(C1606789m r3, AnonymousClass705 r4, Integer num, Object obj, PublicKey publicKey, X509Certificate x509Certificate) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public void CBZ() {
        throw new UnsupportedOperationException("Not implemented");
    }

    public void CBd(AnonymousClass732 r3, C1606789m r4, AnonymousClass705 r5, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        throw new UnsupportedOperationException("Not implemented");
    }

    public void CBe(AnonymousClass732 r16, C1606789m r17, AnonymousClass705 r18, Integer num, PublicKey publicKey, X509Certificate x509Certificate) {
        String str;
        X509Certificate x509Certificate2 = x509Certificate;
        AnonymousClass732 r2 = r16;
        boolean A15 = C18070vi.A15(x509Certificate2, r2);
        C1606789m r10 = r17;
        C18070vi.A0d(r10, 4);
        PublicKey publicKey2 = publicKey;
        if (publicKey == null) {
            e = AnonymousClass000.A0k("passwordPublicKey is null");
        } else if (num == null) {
            e = AnonymousClass000.A0k("passwordKeyId is null");
        } else {
            try {
                KeyPair A022 = C20059A5i.A02();
                String A0p = C108985cd.A0p(A022);
                String A012 = AnonymousClass732.A01(r2);
                Object A002 = AnonymousClass732.A00(r2);
                try {
                    C18070vi.A0b(A012);
                    String A013 = A01(A012, publicKey2, num.intValue());
                    JSONObject A0h = C108995ce.A0h();
                    AnonymousClass00H r5 = this.A03;
                    A0h.put("timestamp", AnonymousClass11P.A00((AnonymousClass11P) r5.get()));
                    A0h.put("password", A013);
                    C108985cd.A1J(A0p, A0h);
                    C162478Kx A003 = A00(C108975cc.A0I(this.A00, C18070vi.A0H(A0h), x509Certificate2), A15 ? 1 : 0);
                    C162478Kx.A01(A003, String.valueOf(AnonymousClass11P.A00((AnonymousClass11P) r5.get())), "timestamp");
                    String obj = A002.toString();
                    C18070vi.A0d(obj, A15);
                    C162478Kx.A01(A003, obj, "encrypted_fbid");
                    C162478Kx.A01(A003, A03(), "use_case");
                    A7K a7k = new A7K();
                    C108975cc.A0z(A003, a7k, "input");
                    C108975cc.A0J(new AIj(a7k, WWWCreateAccessTokenResponseImpl.class, "WWWCreateAccessToken"), this.A05).A04(new AnonymousClass7SA(r10, this, A012, A022, 2));
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
                r10.Bsw(e);
            }
        }
        r10.Bsw(e);
    }

    public C144177Gh(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6) {
        this.A03 = r1;
        this.A04 = r2;
        this.A05 = r3;
        this.A00 = r4;
        this.A01 = r5;
        this.A02 = r6;
    }

    public /* bridge */ /* synthetic */ void CBX(C1606789m r2, AnonymousClass705 r3, Integer num, Integer num2, String str, String str2, String str3, PublicKey publicKey, X509Certificate x509Certificate) {
        throw C17880vN.A0y();
    }
}
