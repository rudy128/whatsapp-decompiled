package X;

import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

public class A4E {
    public static final Set A06;
    public String A00;
    public String A01;
    public JSONObject A02;
    public JSONObject A03;
    public final String A04;
    public final String A05;

    public static byte[] A00(byte[] bArr) {
        int length;
        int i = 0;
        while (true) {
            length = bArr.length;
            if (i < length && bArr[i] == 0) {
                i++;
            }
        }
        if (i == length) {
            return new byte[]{0};
        }
        int i2 = length - i;
        if ((bArr[i] & 255) > Byte.MAX_VALUE) {
            byte[] bArr2 = new byte[(i2 + 1)];
            System.arraycopy(bArr, i, bArr2, 1, i2);
            return bArr2;
        }
        byte[] bArr3 = new byte[i2];
        System.arraycopy(bArr, i, bArr3, 0, i2);
        return bArr3;
    }

    static {
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "NONE";
        A06 = C17900vP.A0I("ES256", A1Z, 1);
    }

    public A4E(String str) {
        int indexOf = str.indexOf(46);
        int lastIndexOf = str.lastIndexOf(46);
        if (!(indexOf == -1 || lastIndexOf == -1 || indexOf == lastIndexOf)) {
            int i = indexOf + 1;
            if (str.indexOf(46, i) == lastIndexOf) {
                String A0o = AnonymousClass8BS.A0o(str, indexOf);
                this.A04 = A0o;
                String substring = str.substring(i, lastIndexOf);
                this.A05 = substring;
                this.A01 = str.substring(lastIndexOf + 1);
                try {
                    byte[] decode = Base64.decode(A0o, 8);
                    byte[] decode2 = Base64.decode(substring, 8);
                    Base64.decode(this.A01, 8);
                    JSONObject A16 = C17880vN.A16(new String(decode));
                    this.A02 = A16;
                    this.A00 = C108955ca.A0y(A16.getString(PublicKeyCredentialControllerUtility.JSON_KEY_ALG));
                    this.A03 = C17880vN.A16(new String(decode2));
                    if (!A06.contains(this.A00)) {
                        throw new C179999Ks("JWT algorithm not supported");
                    }
                    return;
                } catch (JSONException e) {
                    throw new C179999Ks(e.getMessage());
                } catch (IllegalArgumentException unused) {
                    throw new C179999Ks("Wrong Base64 encoding.");
                }
            }
        }
        throw new C179999Ks("Invalid JWT Token");
    }
}
