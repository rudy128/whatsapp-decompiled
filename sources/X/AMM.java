package X;

import java.io.File;
import java.io.IOException;

public final class AMM implements B70 {
    public final /* synthetic */ File A00;
    public final /* synthetic */ File A01;

    public AMM(File file, File file2) {
        this.A00 = file;
        this.A01 = file2;
    }

    public /* bridge */ /* synthetic */ Object apply(Object obj) {
        String str = (String) obj;
        if (!(str == null || str.length() == 0)) {
            File file = this.A00;
            if (str.equals(file.getName())) {
                return file;
            }
            try {
                return C64062u9.A06(this.A01.getCanonicalPath(), str);
            } catch (IOException unused) {
            }
        }
        return null;
    }
}
