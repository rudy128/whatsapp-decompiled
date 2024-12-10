package X;

import java.io.IOException;

/* renamed from: X.4q1  reason: invalid class name and case insensitive filesystem */
public final class C97764q1 implements C107655aN {
    public final /* synthetic */ C30391dr A00;

    public C97764q1(C30391dr r1) {
        this.A00 = r1;
    }

    public final void C6X(C85264Ms r5) {
        C18070vi.A0d(r5, 0);
        int i = r5.A00;
        if (i == 2) {
            this.A00.resumeWith(C27621Wu.A00);
        } else if (i == 3 || i == 4 || i == 5) {
            this.A00.resumeWith(C30691eM.A00(new IOException(AnonymousClass001.A1I("DownloadableWallpaperManager.State ", AnonymousClass000.A10(), i))));
        }
    }
}
