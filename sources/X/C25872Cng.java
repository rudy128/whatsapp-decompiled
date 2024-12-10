package X;

import android.content.Context;
import android.net.Uri;
import java.io.IOException;

/* renamed from: X.Cng  reason: case insensitive filesystem */
public abstract class C25872Cng {
    /* JADX WARNING: type inference failed for: r0v11, types: [X.DGu, java.lang.Object] */
    public static final C25092CXd A00(Context context, Uri uri, boolean z) {
        boolean z2 = true;
        if (uri.getPath() == null) {
            z2 = false;
        }
        C26171Ctn.A03(z2, AnonymousClass001.A1E(uri, "Path cannot be null contentUri: ", AnonymousClass000.A10()));
        if (AnonymousClass1YE.A0A(C180949Oo.A00(C108945cZ.A17(uri.getPath()).getPath(), "video/mp4", false), "video", false)) {
            try {
                return new C26864DGv(context, z).BKv(uri);
            } catch (IOException | RuntimeException unused) {
                return null;
            }
        } else {
            boolean z3 = true;
            if (uri.getPath() == null) {
                z3 = false;
            }
            C26171Ctn.A03(z3, AnonymousClass001.A1E(uri, "Path cannot be null contentUri: ", AnonymousClass000.A10()));
            try {
                return new Object().BKv(uri);
            } catch (IOException unused2) {
                return null;
            }
        }
    }

    public static final C25092CXd A01(Context context, String str) {
        if (str == null) {
            return null;
        }
        try {
            Uri A01 = C26215Cuu.A01(str);
            C18070vi.A0X(A01);
            return A00(context, A01, false);
        } catch (Exception e) {
            C26294Cx6.A0D("TranscodeUtil", "Exception in extractVideoMetadata for filePath: %s", e, BE7.A1b(str));
            return null;
        }
    }

    public static final boolean A02(CUT cut) {
        if (cut.A04 != null) {
            return false;
        }
        long j = cut.A02;
        if (j == 0 || j == -1) {
            return true;
        }
        return false;
    }
}
