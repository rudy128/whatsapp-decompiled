package X;

import android.content.ContentValues;
import android.os.Build;
import java.io.File;

/* renamed from: X.6Wq  reason: invalid class name and case insensitive filesystem */
public abstract class C123996Wq {
    public static final ContentValues A00(File file, String str, String str2) {
        ContentValues A08 = C17880vN.A08();
        A08.put("mime_type", str2);
        A08.put("_display_name", file.getName());
        if (Build.VERSION.SDK_INT >= 29) {
            A08.put("relative_path", AnonymousClass000.A0y("/WhatsApp/", AnonymousClass000.A11(str)));
            return A08;
        }
        A08.put("_data", file.getPath());
        return A08;
    }
}
