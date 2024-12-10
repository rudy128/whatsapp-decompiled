package X;

import java.io.File;
import java.io.IOException;

/* renamed from: X.AlL  reason: case insensitive filesystem */
public class C21512AlL implements C18140vp {
    public final C183689Zf A00;

    public C21512AlL(File file) {
        try {
            String canonicalPath = file.getCanonicalPath();
            C196389uy.A00(file);
            this.A00 = new C183689Zf(this, canonicalPath);
        } catch (IOException e) {
            throw new RuntimeException("Unable to get canonical path", e);
        }
    }

    public /* bridge */ /* synthetic */ Object get() {
        return this.A00;
    }
}
