package X;

import android.graphics.Bitmap;
import android.net.Uri;
import java.io.File;

/* renamed from: X.7Gz  reason: invalid class name and case insensitive filesystem */
public abstract class C144357Gz implements AnonymousClass8B2 {
    public final Uri A00;
    public final long A01;

    public int getType() {
        return 1;
    }

    public /* synthetic */ File BQC() {
        String path = this.A00.getPath();
        if (path == null) {
            return null;
        }
        return C108945cZ.A17(path);
    }

    public String BQD() {
        return this.A00.getPath();
    }

    public C144357Gz(Uri uri, long j) {
        this.A00 = uri;
        this.A01 = j;
    }

    public Uri BLl() {
        return this.A00;
    }

    public /* synthetic */ long BQv() {
        return 0;
    }

    public String BUw() {
        return "video/*";
    }

    public Bitmap CP6(int i) {
        return C1408873l.A01(BQC());
    }

    public long getContentLength() {
        return this.A01;
    }
}
