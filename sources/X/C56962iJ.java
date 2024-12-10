package X;

import android.net.Uri;
import com.whatsapp.util.Log;
import java.io.File;

/* renamed from: X.2iJ  reason: invalid class name and case insensitive filesystem */
public final class C56962iJ {
    public final AnonymousClass118 A00;

    public C56962iJ(AnonymousClass118 r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final File A00(String str, int i) {
        String str2 = null;
        File A0e = C17880vN.A0e(C17880vN.A0e(this.A00.A00.getFilesDir(), "privacy_disclosure"), String.valueOf(i));
        if (A0e.exists() || A0e.mkdirs()) {
            Uri parse = Uri.parse(str);
            if (parse != null) {
                str2 = parse.getLastPathSegment();
            }
            return C17880vN.A0e(A0e, str2);
        }
        Log.e("PrivacyDisclosureFileCache/getPrivacyDisclosureDir can not make directory");
        return null;
    }
}
