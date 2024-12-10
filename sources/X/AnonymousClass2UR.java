package X;

import android.content.SharedPreferences;
import android.util.Base64;

/* renamed from: X.2UR  reason: invalid class name */
public abstract class AnonymousClass2UR {
    public static final void A00(SharedPreferences.Editor editor, String str, byte[] bArr) {
        String str2;
        if (bArr != null) {
            String encodeToString = Base64.encodeToString(bArr, 0);
            C18070vi.A0X(encodeToString);
            str2 = AnonymousClass1YF.A0I(encodeToString);
        } else {
            str2 = null;
        }
        String encodeToString2 = Base64.encodeToString(bArr, 0);
        C18070vi.A0X(encodeToString2);
        AnonymousClass1YF.A0G(encodeToString2).toString();
        editor.putString(str, str2);
    }
}
