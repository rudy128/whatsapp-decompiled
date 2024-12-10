package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.2zS  reason: invalid class name and case insensitive filesystem */
public final class C67232zS implements AnonymousClass1L0 {
    public final AnonymousClass118 A00;

    public C67232zS(AnonymousClass118 r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public /* synthetic */ void Bqg() {
    }

    public /* synthetic */ void Bqi() {
    }

    public void Bqh() {
        Context context = this.A00.A00;
        File filesDir = context.getFilesDir();
        String[] list = filesDir.list(new AnonymousClass3BU(0));
        if (list != null) {
            for (String str : list) {
                String[] split = str.substring(0, str.lastIndexOf(".pack")).split("_");
                int length = split.length;
                if (length > 1) {
                    try {
                        if (Long.parseLong(split[length - 1]) != C17880vN.A04(new File(context.getPackageCodePath()).lastModified())) {
                            C17900vP.A0f("translations/cleanupOldPackFiles Clearing old pack file: ", str, AnonymousClass000.A10());
                            if (!C17880vN.A0e(filesDir, str).delete()) {
                                C17900vP.A0e("translations/cleanupOldPackFiles Could not delete old pack file: ", str, AnonymousClass000.A10());
                            }
                        }
                    } catch (NumberFormatException unused) {
                        C17900vP.A0g("translations/cleanupOldPackFiles Pack file name did not contain version info: ", str, AnonymousClass000.A10());
                    }
                }
            }
        }
    }
}
