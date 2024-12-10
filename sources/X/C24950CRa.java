package X;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;

/* renamed from: X.CRa  reason: case insensitive filesystem */
public class C24950CRa {
    public final long A00;
    public final Uri A01;
    public final ParcelFileDescriptor A02;
    public final File A03;

    public C24950CRa(Uri uri, ParcelFileDescriptor parcelFileDescriptor, File file, long j) {
        this.A03 = file;
        this.A02 = parcelFileDescriptor;
        this.A00 = j;
        this.A01 = uri;
    }
}
