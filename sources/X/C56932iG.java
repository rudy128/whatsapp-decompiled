package X;

import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import com.whatsapp.util.Log;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: X.2iG  reason: invalid class name and case insensitive filesystem */
public final class C56932iG {
    public final AnonymousClass118 A00;

    public C56932iG(AnonymousClass118 r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final ArrayList A00(String str) {
        String str2;
        C18070vi.A0d(str, 0);
        ArrayList A13 = AnonymousClass000.A13();
        try {
            Signature[] signatureArr = this.A00.A00.getPackageManager().getPackageInfo(str, 64).signatures;
            if (signatureArr == null) {
                signatureArr = new Signature[0];
            }
            for (Signature charsString : signatureArr) {
                String charsString2 = charsString.toCharsString();
                C18070vi.A0X(charsString2);
                String A0Z = C17890vO.A0Z(charsString2, AnonymousClass000.A11(str), ' ');
                try {
                    MessageDigest instance = MessageDigest.getInstance("SHA-256");
                    Charset charset = StandardCharsets.UTF_8;
                    C18070vi.A0Z(charset);
                    instance.update(C18070vi.A1A(A0Z, charset));
                    String encodeToString = Base64.encodeToString(Arrays.copyOfRange(instance.digest(), 0, 9), 3);
                    C18070vi.A0b(encodeToString);
                    str2 = encodeToString.substring(0, 11);
                    C18070vi.A0X(str2);
                } catch (NoSuchAlgorithmException unused) {
                    Log.e("OTPHashUtil/hash:NoSuchAlgorithm");
                    str2 = null;
                }
                if (str2 != null) {
                    String format = String.format(Locale.US, "%s", Arrays.copyOf(new Object[]{str2}, 1));
                    C18070vi.A0X(format);
                    A13.add(format);
                }
            }
        } catch (PackageManager.NameNotFoundException unused2) {
            Log.e("OTPHashUtil/Unable to find package to obtain hash");
        }
        return A13;
    }
}
