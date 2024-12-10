package X;

import android.os.Environment;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.9iy  reason: invalid class name and case insensitive filesystem */
public final class C189369iy {
    public final C218617r A00;

    public C189369iy(C218617r r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final File A00(String str) {
        File A0a;
        C18070vi.A0d(str, 0);
        if (!"mounted".equals(Environment.getExternalStorageState())) {
            Log.e("BloksFileManager/getCapturedMediaDirectory external storage is not writable");
            A0a = null;
        } else {
            A0a = this.A00.A0a("bloks_captured_media");
        }
        if (A0a != null) {
            if (A0a.exists() || A0a.mkdirs()) {
                return AnonymousClass8BR.A0u(A0a.getPath(), str);
            }
            Log.e("BloksFileManager/getCapturedMediaFile: failed to create media directory");
        }
        return null;
    }
}
