package X;

import android.text.TextUtils;
import android.util.Base64;
import java.io.UnsupportedEncodingException;

/* renamed from: X.9xt  reason: invalid class name and case insensitive filesystem */
public class C198169xt {
    public final AnonymousClass11S A00;
    public final AnonymousClass11P A01;
    public final C31061ex A02;

    public static byte[] A00(Boolean bool, Object obj, String str, String str2, byte[] bArr, Object[] objArr, long j) {
        String str3;
        if (bool == null) {
            str3 = null;
        } else if (bool.booleanValue()) {
            str3 = "PIN";
        } else {
            str3 = "BIO";
        }
        Object[] objArr2 = new Object[6];
        AnonymousClass8BS.A1B(str, str3, objArr2);
        objArr2[2] = obj;
        AnonymousClass3MX.A1S(objArr2, 3, j);
        C72453Mb.A1T(str2, bArr, objArr2);
        System.arraycopy(objArr, 0, objArr2, 6, 0);
        Object[] objArr3 = new String[6];
        for (int i = 0; i < 6; i++) {
            Object obj2 = objArr2[i];
            if (obj2 == null) {
                obj2 = "";
            } else if (obj2 instanceof String) {
                continue;
            } else if ((obj2 instanceof Long) || (obj2 instanceof Integer)) {
                obj2 = String.valueOf(obj2);
            } else if (obj2 instanceof byte[]) {
                obj2 = Base64.encodeToString((byte[]) obj2, 2);
            } else {
                throw AnonymousClass000.A0k(AnonymousClass1QE.A01("PinActions", "getPinNode: should only accept long, int, byte[], and String args"));
            }
            objArr3[i] = obj2;
        }
        try {
            return AnonymousClass8BR.A1Z(TextUtils.join("|", objArr3));
        } catch (UnsupportedEncodingException e) {
            AnonymousClass8BS.A1F("PinActions", AnonymousClass001.A1E(e, "constructPayload: UTF-8 not supported: ", AnonymousClass000.A10()));
            throw new Error(e);
        }
    }

    public C198169xt(AnonymousClass11S r1, AnonymousClass11P r2, C31061ex r3) {
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
