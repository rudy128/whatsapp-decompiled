package X;

import android.content.Context;
import java.io.File;
import java.util.Set;

/* renamed from: X.9pW  reason: invalid class name and case insensitive filesystem */
public final class C193089pW {
    public final Context A00;

    public final File A00(String str) {
        C18070vi.A0d(str, 0);
        if (str.length() > 0) {
            File A01 = A01(str);
            C108985cd.A1C(A01);
            File parentFile = A01.getParentFile();
            if (parentFile != null) {
                parentFile.mkdirs();
            }
            return A01;
        }
        throw AnonymousClass000.A0k("Filename is not specified.");
    }

    public final File A01(String str) {
        C18070vi.A0d(str, 0);
        if (str.length() > 0) {
            Context context = this.A00;
            File A0e = C17880vN.A0e(C17880vN.A0e(context.getFilesDir(), "migration/import/sandbox"), str);
            String canonicalPath = AnonymousClass8BU.A0f(context, "migration/import/sandbox").getCanonicalPath();
            String canonicalPath2 = A0e.getCanonicalPath();
            C18070vi.A0b(canonicalPath2);
            C18070vi.A0b(canonicalPath);
            if (AnonymousClass1YE.A0A(canonicalPath2, canonicalPath, false)) {
                return A0e;
            }
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("Invalid file name: ");
            A10.append(str);
            throw C17880vN.A0f(AnonymousClass000.A0y(", sandbox escaping attempt.", A10));
        }
        throw AnonymousClass000.A0k("Filename is not specified.");
    }

    public final void A02() {
        C64062u9.A0K(C17880vN.A0e(this.A00.getFilesDir(), "migration/import/sandbox"), (Set) null);
    }

    public C193089pW(Context context) {
        this.A00 = context;
    }
}
