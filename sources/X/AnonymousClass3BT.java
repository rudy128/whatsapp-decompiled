package X;

import java.io.File;
import java.io.FileFilter;

/* renamed from: X.3BT  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3BT implements FileFilter {
    public final /* synthetic */ long A00;

    public final boolean accept(File file) {
        return AnonymousClass000.A1R(((System.currentTimeMillis() - file.lastModified()) > this.A00 ? 1 : ((System.currentTimeMillis() - file.lastModified()) == this.A00 ? 0 : -1)));
    }

    public /* synthetic */ AnonymousClass3BT(long j) {
        this.A00 = j;
    }
}
