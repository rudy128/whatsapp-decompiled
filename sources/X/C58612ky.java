package X;

import java.nio.charset.Charset;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.2ky  reason: invalid class name and case insensitive filesystem */
public final class C58612ky {
    public final AnonymousClass190 A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;

    public final String A00(String str) {
        byte[] bArr;
        try {
            this.A01.get();
            C191309mN A002 = C196639vO.A00(new JSONArray(str));
            if (A002 == null) {
                bArr = null;
            } else {
                bArr = ((C22661Cs) this.A02.get()).A02(A002, C197569wu.A0Z);
            }
            if (bArr != null) {
                Charset charset = C19620yd.A0C;
                C18070vi.A0Z(charset);
                return new String(bArr, charset);
            }
            this.A00.A0G("XFamilyEncryptionHelper/decryptFromHash", "Failed to decrypt", true);
            throw AnonymousClass000.A0n("Failed to decrypt");
        } catch (JSONException e) {
            this.A00.A0G("XFamilyAccountStore/decryptFromHash", e.getMessage(), true);
            throw new IllegalStateException("Failed to decrypt", e);
        }
    }

    public final String A01(String str) {
        String A002;
        Charset charset = C19620yd.A0C;
        C18070vi.A0Z(charset);
        C191309mN A012 = ((C22661Cs) this.A02.get()).A01(C197569wu.A0Z, C18070vi.A1A(str, charset));
        if (A012 != null && (A002 = A012.A00()) != null && str.equals(A00(A002))) {
            return A002;
        }
        this.A00.A0G("XFamilyEncryptionHelper/encryptToHash", "Failed to encrypt", true);
        throw AnonymousClass000.A0n("Failed to encrypt");
    }

    public C58612ky(AnonymousClass190 r1, AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0o(r2, r3, r1);
        this.A02 = r2;
        this.A01 = r3;
        this.A00 = r1;
    }
}
