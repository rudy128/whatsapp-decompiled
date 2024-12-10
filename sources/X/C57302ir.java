package X;

import java.io.File;

/* renamed from: X.2ir  reason: invalid class name and case insensitive filesystem */
public class C57302ir {
    public final AnonymousClass118 A00;
    public final AnonymousClass2KW A01;

    public File A00() {
        File A0e = C17880vN.A0e(this.A00.A00.getFilesDir(), "biz_directory");
        if (!A0e.exists()) {
            A0e.mkdirs();
        }
        return C17880vN.A0e(A0e, "directory_recent_search_history");
    }

    public C57302ir(AnonymousClass118 r1, AnonymousClass2KW r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
