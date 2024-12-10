package X;

import android.util.Base64;
import org.json.JSONArray;

/* renamed from: X.9mN  reason: invalid class name and case insensitive filesystem */
public class C191309mN {
    public final int A00;
    public final String A01;
    public final byte[] A02;
    public final byte[] A03;
    public final byte[] A04;

    public C191309mN(String str, byte[] bArr, byte[] bArr2, byte[] bArr3, int i) {
        this.A00 = i;
        this.A03 = bArr2;
        this.A02 = bArr;
        this.A04 = bArr3;
        this.A01 = str;
    }

    public String A00() {
        JSONArray A1A = AnonymousClass8BR.A1A();
        A1A.put(this.A00);
        A1A.put(Base64.encodeToString(this.A02, 3));
        byte[] bArr = this.A03;
        if (bArr != null) {
            A1A.put(Base64.encodeToString(bArr, 3));
        }
        byte[] bArr2 = this.A04;
        if (bArr2 != null) {
            A1A.put(Base64.encodeToString(bArr2, 3));
        }
        String str = this.A01;
        if (str != null) {
            A1A.put(str);
        }
        return A1A.toString();
    }
}
