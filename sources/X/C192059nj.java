package X;

import android.content.Context;
import java.io.File;
import java.util.Set;

/* renamed from: X.9nj  reason: invalid class name and case insensitive filesystem */
public final class C192059nj {
    public final Context A00;

    public final File A00(String str) {
        C18070vi.A0d(str, 0);
        Context context = this.A00;
        C17880vN.A0e(context.getFilesDir(), "migration/export/sandbox").mkdirs();
        File createTempFile = File.createTempFile("sandbox", str, AnonymousClass8BU.A0f(context, "migration/export/sandbox"));
        C18070vi.A0X(createTempFile);
        return createTempFile;
    }

    public final void A01() {
        C64062u9.A0K(C17880vN.A0e(this.A00.getFilesDir(), "migration/export/sandbox"), (Set) null);
    }

    public C192059nj(Context context) {
        this.A00 = context;
    }
}
