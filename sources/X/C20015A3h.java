package X;

import java.nio.charset.Charset;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: X.A3h  reason: case insensitive filesystem */
public abstract class C20015A3h {
    public static final Charset A00 = C19620yd.A0C;

    public static String A00(AnonymousClass190 r5, C22661Cs r6, String str) {
        byte[] bArr;
        try {
            C191309mN A002 = C196639vO.A00(new JSONArray(str));
            if (A002 == null) {
                bArr = null;
            } else {
                bArr = r6.A02(A002, C197569wu.A0Z);
            }
            if (bArr != null) {
                return new String(bArr, A00);
            }
            r5.A0G("BusinessDirectoryStorageUtil/decryptStringData", "Failed to decrypt string data", true);
            throw new Exception("Failed to decrypt string data");
        } catch (JSONException e) {
            AnonymousClass8BS.A17(r5, "BusinessDirectoryStorageUtil/decryptSearchLocation", e, true);
            throw e;
        }
    }

    public static String A01(AnonymousClass190 r3, C22661Cs r4, String str) {
        String A002;
        C191309mN A01 = r4.A01(C197569wu.A0Z, str.getBytes(A00));
        if (A01 != null && (A002 = A01.A00()) != null && str.equals(A00(r3, r4, A002))) {
            return A002;
        }
        r3.A0G("BusinessDirectoryStorageUtil/encryptStringData", "Failed to encrypt string data", true);
        throw new Exception("Failed to encrypt string data");
    }
}
