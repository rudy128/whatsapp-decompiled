package X;

import android.net.Uri;
import androidx.core.view.inputmethod.InputContentInfoCompat;
import com.whatsapp.util.Log;

/* renamed from: X.6xm  reason: invalid class name and case insensitive filesystem */
public class C138836xm {
    public static final String[] A01 = {"image/gif", "video/x.looping_mp4", "image/jpeg", "image/jpg", "image/png", "image/webp.wasticker"};
    public static final String[] A02 = {"text/plain"};
    public InputContentInfoCompat A00;

    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, X.6UG] */
    public AnonymousClass6UG A00(InputContentInfoCompat inputContentInfoCompat, int i) {
        try {
            InputContentInfoCompat inputContentInfoCompat2 = this.A00;
            if (inputContentInfoCompat2 != null) {
                inputContentInfoCompat2.releasePermission();
            }
        } catch (Exception e) {
            Log.e("conversation/InputContentInfoCompat#releasePermission() failed.", e);
        } catch (Throwable th) {
            this.A00 = null;
            throw th;
        }
        this.A00 = null;
        String[] strArr = A01;
        int i2 = 0;
        do {
            String str = strArr[i2];
            if (inputContentInfoCompat.getDescription().hasMimeType(str)) {
                if ((i & 1) != 0) {
                    try {
                        inputContentInfoCompat.requestPermission();
                    } catch (Exception e2) {
                        Log.e("conversation/InputContentInfoCompat#requestPermission() failed.", e2);
                        return null;
                    }
                }
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("conversation/onCommitContent: ");
                C17890vO.A1A(A10, inputContentInfoCompat.getContentUri().toString());
                this.A00 = inputContentInfoCompat;
                Uri contentUri = inputContentInfoCompat.getContentUri();
                ? obj = new Object();
                obj.A00 = contentUri;
                obj.A01 = str;
                return obj;
            }
            i2++;
        } while (i2 < 6);
        return null;
    }
}
