package X;

import android.util.Base64OutputStream;
import androidx.core.view.inputmethod.EditorInfoCompat;
import com.facebook.msys.mci.DefaultCrypto;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Map;

/* renamed from: X.Cjm  reason: case insensitive filesystem */
public final class C25656Cjm {
    public static final Map A02 = C17880vN.A11();
    public final Object A00 = C17880vN.A0p();
    public final C18140vp A01;

    public String A00() {
        String str;
        FileInputStream A18;
        Base64OutputStream base64OutputStream;
        try {
            File file = (File) this.A01.get();
            A18 = C108945cZ.A18(file);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream((int) file.length());
            base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 0);
            byte[] bArr = new byte[EditorInfoCompat.MAX_INITIAL_SELECTION_LENGTH];
            while (true) {
                int read = A18.read(bArr);
                if (read != -1) {
                    base64OutputStream.write(bArr, 0, read);
                } else {
                    base64OutputStream.close();
                    String byteArrayOutputStream2 = byteArrayOutputStream.toString(DefaultCrypto.UTF_8);
                    A18.close();
                    base64OutputStream.close();
                    return byteArrayOutputStream2;
                }
            }
        } catch (IOException e) {
            if (e.getMessage() != null) {
                str = e.getMessage();
            } else {
                str = "description N/A";
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("[I/O error: ");
            return BEA.A0m(str, A10);
        } catch (Throwable th) {
            A18.close();
            base64OutputStream.close();
            throw th;
        }
    }

    public C25656Cjm(C18140vp r2) {
        this.A01 = r2;
    }
}
