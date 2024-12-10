package X;

import android.content.Context;
import android.util.Base64;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.security.GeneralSecurityException;
import java.security.PublicKey;
import java.security.spec.MGF1ParameterSpec;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

public final class A5A {
    public final AnonymousClass190 A00;
    public final AnonymousClass11P A01;
    public final AnonymousClass1P3 A02;
    public final C197849xM A03;
    public final C18030ve A04;
    public final AnonymousClass00H A05;
    public final AnonymousClass00H A06;
    public final C196109uT A07;

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Object, X.5qs] */
    public final void A02(BC0 bc0, UserJid userJid, String str, String str2, String str3, SecretKey secretKey, byte[] bArr, int i, boolean z) {
        UserJid userJid2 = userJid;
        C18070vi.A0d(userJid2, 0);
        BC0 bc02 = bc0;
        String str4 = str;
        if (!(str == null || str4.length() == 0)) {
            String str5 = str2;
            if (!(str2 == null || str5.length() == 0)) {
                String str6 = str3;
                SecretKey secretKey2 = secretKey;
                byte[] bArr2 = bArr;
                int i2 = i;
                boolean z2 = z;
                if (C18020vd.A05(C18040vf.A02, this.A04, 5994)) {
                    C197849xM r15 = this.A03;
                    C191719n4 r5 = new C191719n4(this, bc02, userJid2, str4, str6, secretKey2, bArr2, i2, z2);
                    if (C197849xM.A00(r15, userJid2, str4, str5)) {
                        r5.A00(true);
                        return;
                    }
                    C187679gC r6 = (C187679gC) r15.A00.get();
                    C20604ARo aRo = new C20604ARo(r15, r5, userJid2, str4, str5);
                    Map map = r6.A04;
                    synchronized (map) {
                        List A0t = AnonymousClass8BS.A0t(userJid2, map);
                        if (A0t == null) {
                            map.put(userJid2, AnonymousClass8BR.A11(aRo, new B81[1], 0));
                            ? obj = new Object();
                            Context A0A = C72483Me.A0A(r6.A01);
                            try {
                                C20451ALo aLo = new C20451ALo(obj, userJid2);
                                AnonymousClass12Q.A04();
                                AnonymousClass114.A02(A0A);
                                r6.A00.registerObserver(aLo);
                                ((C39511tC) r6.A03.get()).registerObserver(aLo);
                                ((AnonymousClass123) r6.A05.getValue()).A02(C18070vi.A0M(userJid2.getPrimaryDevice()));
                                r6.A02.CGF(new C70833Cr((Object) obj, (Object) r6, (Object) aLo, (Object) userJid2, 33));
                            } catch (Throwable th) {
                                AnonymousClass12Q.A04();
                                AnonymousClass114.A02(A0A);
                                throw th;
                            }
                        } else {
                            A0t.add(aRo);
                        }
                    }
                    return;
                }
                LinkedHashMap A13 = C17880vN.A13();
                A13.put(C63962tz.A02(userJid2.getPrimaryDevice()), userJid2);
                Iterator A0i = C17890vO.A0i(this.A02.A0L(A13.keySet()));
                while (A0i.hasNext()) {
                    if (C63962tz.A07(((C58252kO) C17890vO.A0P(A0i)).A00, Base64.decode(str4, 2), Base64.decode(str5, 2))) {
                        A01(this, bc02, userJid2, str4, str6, secretKey2, bArr2, i2, z2);
                        return;
                    }
                }
                A00(this, bc02, userJid2, i2, z2);
                return;
            }
        }
        bc02.BwS(false, "extensions-invalid-public-key");
    }

    public final void A03(BC0 bc0, UserJid userJid, String str, SecretKey secretKey, byte[] bArr, int i, boolean z, boolean z2) {
        BC0 bc02 = bc0;
        int i2 = i;
        boolean z3 = z;
        boolean z4 = z2;
        try {
            C196109uT r0 = this.A07;
            UserJid userJid2 = userJid;
            String str2 = userJid2.user;
            C18070vi.A0d(str2, 0);
            PublicKey publicKey = null;
            String string = C17880vN.A0C(r0.A01).getString(AnonymousClass001.A1H("extensions_biz_public_key_", str2, AnonymousClass000.A10()), (String) null);
            if (!(string == null || string.length() == 0)) {
                publicKey = AnonymousClass8BX.A0h(AnonymousClass8BT.A1a(AnonymousClass1YE.A07(AnonymousClass1YE.A07(AnonymousClass1YE.A07(string, "-----BEGIN PUBLIC KEY-----", "", false), "-----END PUBLIC KEY-----", "", false), "\n", "", false)));
                C18070vi.A0X(publicKey);
            }
            if (z) {
                AnonymousClass8BR.A0T(this.A06).A0I(z4, i2);
            }
            if (publicKey == null) {
                if (z) {
                    AnonymousClass8BR.A0T(this.A06).A0E(i2, "extensions-failed-to-load-certificate-from-preferences", (String) null);
                }
                Log.w("FlowsLogger/FlowsDataCryptoProcessor/encryptGalaxyFlowData - null certificate");
                this.A00.A0G("extensions-failed-to-load-certificate-from-preferences", "", false);
                bc02.Bqn("extensions-failed-to-load-certificate-from-preferences");
                return;
            }
            this.A05.get();
            IvParameterSpec A19 = AnonymousClass8BR.A19(bArr);
            byte[] A1O = C108975cc.A1O(str);
            Cipher A18 = AnonymousClass8BR.A18();
            SecretKey secretKey2 = secretKey;
            A18.init(1, secretKey2, A19);
            byte[] iv = A18.getIV();
            byte[] doFinal = A18.doFinal(A1O);
            C18070vi.A0b(doFinal);
            C18070vi.A0b(iv);
            C18070vi.A0d(doFinal, 2);
            C18070vi.A0d(iv, 3);
            Cipher instance = Cipher.getInstance("RSA/ECB/OAEPWithSHA-256AndMGF1Padding");
            instance.init(1, publicKey, new OAEPParameterSpec("SHA-256", "MGF1", MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
            byte[] doFinal2 = instance.doFinal(secretKey2.getEncoded());
            C18070vi.A0X(doFinal2);
            C185889dJ r2 = new C185889dJ(doFinal2, doFinal, iv);
            if (z) {
                AnonymousClass8BR.A0T(this.A06).A0H(z4, i2);
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("AesKey=");
            A10.append(Base64.encodeToString(r2.A01, 2));
            A10.append(";IV=");
            A10.append(Base64.encodeToString(r2.A02, 2));
            A10.append(";Data=");
            bc02.Bqo(userJid2, AnonymousClass000.A0y(Base64.encodeToString(r2.A00, 2), A10), i2, z3, z4);
        } catch (GeneralSecurityException e) {
            if (z) {
                C172058si.A00(this.A06, i2, z4).A0E(i2, "extensions-encryption-failed-exception", AnonymousClass8BX.A0a(this.A04, e.getMessage()));
            }
            C108995ce.A1M("FlowsLogger/FlowsDataCryptoProcessor/encryptGalaxyFlowData() - error while encrypting data", AnonymousClass000.A10(), e);
            bc02.Bqn("extensions-encryption-failed-exception");
            this.A00.A0G("extensions-encryption-failed-exception", AnonymousClass8BX.A0a(this.A04, e.getMessage()), true);
        }
    }

    public final boolean A04(UserJid userJid) {
        String A0r;
        C18070vi.A0d(userJid, 0);
        C18030ve r8 = this.A04;
        C18040vf r7 = C18040vf.A02;
        boolean A052 = C18020vd.A05(r7, r8, 5936);
        C196109uT r4 = this.A07;
        String str = userJid.user;
        if (A052) {
            A0r = r4.A03(str);
        } else {
            C18070vi.A0d(str, 0);
            A0r = C17880vN.A0r(C17880vN.A0C(r4.A01), AnonymousClass001.A1H("extensions_biz_public_key_", str, AnonymousClass000.A10()));
        }
        if (A0r == null || A0r.length() == 0) {
            return true;
        }
        String str2 = userJid.user;
        C18070vi.A0d(str2, 0);
        C18100vl r6 = r4.A01;
        long A053 = C17890vO.A05(C17880vN.A0C(r6), AnonymousClass001.A1H("extensions_biz_fetch_time_", str2, AnonymousClass000.A10()));
        int A002 = C18020vd.A00(r7, r8, 3329);
        if (A002 < 0 || A002 >= 43200) {
            A002 = 10080;
        }
        if (AnonymousClass11P.A01(this.A01) <= A053 + (((long) A002) * 60000)) {
            return false;
        }
        String str3 = userJid.user;
        C18070vi.A0d(str3, 0);
        C17880vN.A1B(C17890vO.A0A(r6), AnonymousClass001.A1H("extensions_biz_public_key_", str3, AnonymousClass000.A10()));
        String str4 = userJid.user;
        C18070vi.A0d(str4, 0);
        C17880vN.A1B(C17890vO.A0A(r6), AnonymousClass001.A1H("flows_biz_public_key_pem_", str4, AnonymousClass000.A10()));
        return true;
    }

    public static final void A00(A5A a5a, BC0 bc0, UserJid userJid, int i, boolean z) {
        C196109uT r0 = a5a.A07;
        String str = userJid.user;
        C18070vi.A0d(str, 0);
        C17880vN.A1B(C17890vO.A0A(r0.A01), AnonymousClass001.A1H("extensions_biz_public_key_", str, AnonymousClass000.A10()));
        Log.e("FlowsLogger/FlowsDataCryptoProcessor/handleSignedPublicKey() - public key signature could not be verified");
        C172058si.A00(a5a.A06, i, z).A0E(i, "extensions-public-key-signature-verification-exception", (String) null);
        bc0.BwS(false, "extensions-public-key-signature-verification-exception");
        bc0.Bqn("extensions-public-key-signature-verification-exception");
    }

    public A5A(AnonymousClass190 r1, AnonymousClass11P r2, C196109uT r3, AnonymousClass1P3 r4, C197849xM r5, C18030ve r6, AnonymousClass00H r7, AnonymousClass00H r8) {
        C18070vi.A0w(r3, r1, r6, r7, r4);
        C18070vi.A0l(r2, r8);
        this.A07 = r3;
        this.A00 = r1;
        this.A04 = r6;
        this.A05 = r7;
        this.A02 = r4;
        this.A01 = r2;
        this.A06 = r8;
        this.A03 = r5;
    }

    public static final void A01(A5A a5a, BC0 bc0, UserJid userJid, String str, String str2, SecretKey secretKey, byte[] bArr, int i, boolean z) {
        byte[] A1a = AnonymousClass8BT.A1a(str);
        C18070vi.A0b(A1a);
        String A13 = C108955ca.A13(A1a);
        A5A a5a2 = a5a;
        C196109uT r1 = a5a.A07;
        UserJid userJid2 = userJid;
        String str3 = userJid.user;
        C18070vi.A0d(str3, 0);
        C18100vl r4 = r1.A01;
        AnonymousClass8BX.A0z(C17890vO.A0A(r4), "flows_biz_public_key_pem_", str3, str, AnonymousClass000.A10());
        String str4 = userJid.user;
        C18070vi.A0d(str4, 0);
        AnonymousClass8BX.A0z(C17890vO.A0A(r4), "extensions_biz_public_key_", str4, A13, AnonymousClass000.A10());
        String str5 = userJid.user;
        long A012 = AnonymousClass11P.A01(a5a.A01);
        C18070vi.A0d(str5, 0);
        C17880vN.A1D(C17890vO.A0A(r4), AnonymousClass001.A1H("extensions_biz_fetch_time_", str5, AnonymousClass000.A10()), A012);
        BC0 bc02 = bc0;
        bc0.BwS(true, (String) null);
        String str6 = str2;
        if (str2 != null) {
            SecretKey secretKey2 = secretKey;
            if (secretKey != null) {
                byte[] bArr2 = bArr;
                if (bArr != null) {
                    a5a2.A03(bc02, userJid2, str6, secretKey2, bArr2, i, true, z);
                }
            }
        }
    }
}
