package X;

import android.media.MediaMetadataRetriever;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;

/* renamed from: X.5dc  reason: invalid class name and case insensitive filesystem */
public class C109545dc extends MediaMetadataRetriever implements Closeable {
    public String A00;

    public C109545dc(String str) {
        this.A00 = str;
    }

    public void A00(File file) {
        try {
            setDataSource(file.getAbsolutePath());
        } catch (Exception e) {
            close();
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("MediaMetadataRetriever/setDataSource/");
            C108985cd.A1M(this.A00, A10, e);
            throw e;
        }
    }

    public void close() {
        try {
            release();
        } catch (IOException e) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("MediaMetadataRetriever/close/");
            C108985cd.A1M(this.A00, A10, e);
        }
    }

    public void finalize() {
        try {
            super.finalize();
        } catch (Throwable th) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("MediaMetadataRetriever/finalize/");
            C108985cd.A1M(this.A00, A10, th);
            throw th;
        }
    }
}
