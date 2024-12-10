package X;

import android.util.Base64;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: X.9ng  reason: invalid class name and case insensitive filesystem */
public final class C192049ng {
    public final AnonymousClass00H A00;

    public C192049ng(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final String A00(String str, SecretKey secretKey, byte[] bArr) {
        int A0G = C72453Mb.A0G(str, bArr, 0);
        A5A a5a = (A5A) ((C188249h7) this.A00.get()).A00.get();
        try {
            byte[] encoded = secretKey.getEncoded();
            byte[] decode = Base64.decode(str, A0G);
            SecretKeySpec secretKeySpec = new SecretKeySpec(encoded, 0, encoded.length, "AES");
            C18070vi.A0b(decode);
            C18070vi.A0d(decode, A0G);
            a5a.A05.get();
            byte[] A1Q = AnonymousClass8BS.A1Q(secretKeySpec, AnonymousClass8BR.A19(bArr), AnonymousClass8BR.A18(), decode, A0G);
            C18070vi.A0b(A1Q);
            return C108955ca.A13(A1Q);
        } catch (Exception e) {
            Log.w(C17900vP.A0C("FlowsLogger/FlowsDataCryptoProcessor/decryptGalaxyFlowData() - Issue while decrypting data", AnonymousClass000.A10(), e));
            a5a.A00.A0G("extensions-decryption-failed-exception", AnonymousClass8BX.A0a(a5a.A04, e.getMessage()), true);
            return null;
        }
    }

    public final void A01(BC0 bc0, UserJid userJid, String str, String str2, String str3, SecretKey secretKey, byte[] bArr, boolean z, boolean z2, boolean z3) {
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        UserJid userJid2 = userJid;
        String str9 = str;
        String str10 = str2;
        AnonymousClass8BX.A1J(userJid2, str9, str10, 0);
        byte[] bArr2 = bArr;
        C18070vi.A0d(bArr2, 6);
        String str11 = str3;
        C18070vi.A0d(str11, 9);
        int hashCode = str11.hashCode();
        BC0 bc02 = bc0;
        if (str10.equals("2") || str10.equals("3")) {
            C188249h7 r4 = (C188249h7) this.A00.get();
            boolean z4 = z2;
            boolean z5 = z3;
            if (z2) {
                C20081A6h A0V = AnonymousClass8BR.A0V(r4.A01);
                if (z3) {
                    str7 = "encryption_1_start";
                } else {
                    str7 = "encryption_start";
                }
                Integer valueOf = Integer.valueOf(hashCode);
                A0V.A0B(valueOf, str7);
                if (z3) {
                    str8 = "fetch_key_1_start";
                } else {
                    str8 = "fetch_key_start";
                }
                A0V.A0B(valueOf, str8);
            }
            SecretKey secretKey2 = secretKey;
            if (!z) {
                AnonymousClass00H r3 = r4.A00;
                if (!((A5A) r3.get()).A04(userJid2)) {
                    if (z2) {
                        C20081A6h A0V2 = AnonymousClass8BR.A0V(r4.A01);
                        if (z3) {
                            str6 = "fetch_key_1_cache_hit";
                        } else {
                            str6 = "fetch_key_cache_hit";
                        }
                        A0V2.A07(hashCode, str6, true);
                    }
                    ((A5A) r3.get()).A03(bc02, userJid2, str9, secretKey2, bArr2, hashCode, z4, z5);
                    return;
                }
            }
            if (z2) {
                AnonymousClass00H r32 = r4.A01;
                C20081A6h A0V3 = AnonymousClass8BR.A0V(r32);
                if (z3) {
                    str4 = "fetch_key_1_cache_hit";
                } else {
                    str4 = "fetch_key_cache_hit";
                }
                A0V3.A07(hashCode, str4, false);
                C20081A6h A0V4 = AnonymousClass8BR.A0V(r32);
                if (z3) {
                    str5 = "fetch_key_network_1_start";
                } else {
                    str5 = "fetch_key_network_start";
                }
                C20081A6h.A02(A0V4, str5, hashCode);
            }
            ((C190939ll) r4.A02.get()).A00(new C20503ANo(r4, bc02, str9, secretKey2, bArr2, hashCode, z4, z5), userJid2);
            return;
        }
        bc02.Bqn("extensions-invalid-business-profile");
    }
}
