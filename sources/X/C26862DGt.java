package X;

import android.net.Uri;
import android.os.Trace;
import java.net.URL;

/* renamed from: X.DGt  reason: case insensitive filesystem */
public class C26862DGt implements E7q {
    public E7q A00;

    public C25092CXd BKv(Uri uri) {
        Trace.beginSection("DefaultVideoMetadataExtractor.extract");
        C25092CXd BKv = this.A00.BKv(uri);
        Trace.endSection();
        return BKv;
    }

    public C25092CXd BKw(URL url) {
        Trace.beginSection("DefaultVideoMetadataExtractor.extract");
        C25092CXd BKw = this.A00.BKw(url);
        Trace.endSection();
        return BKw;
    }
}
