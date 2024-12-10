package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;

/* renamed from: X.7H3  reason: invalid class name */
public class AnonymousClass7H3 implements AnonymousClass8B2, AnonymousClass8BB {
    public final long A00;
    public final Uri A01;
    public final AnonymousClass11B A02;
    public final int A03;
    public final AnonymousClass77X A04;
    public final File A05;
    public final boolean A06;

    public int BUm() {
        return 1;
    }

    public Bitmap CP6(int i) {
        ParcelFileDescriptor parcelFileDescriptor;
        Bitmap createBitmap;
        try {
            AnonymousClass11B r3 = this.A02;
            Uri uri = this.A01;
            Matrix A09 = C26511Sk.A09(uri, r3);
            try {
                File A042 = C64062u9.A04(uri);
                if (A042 != null) {
                    parcelFileDescriptor = ParcelFileDescriptor.open(A042, 268435456);
                } else {
                    parcelFileDescriptor = r3.A06(uri, "r");
                }
            } catch (FileNotFoundException unused) {
                parcelFileDescriptor = null;
            }
            long j = (long) i;
            Bitmap A012 = C137236v8.A01(parcelFileDescriptor, i, j * j * 2);
            if (A09 == null || A09.isIdentity()) {
                if (parcelFileDescriptor != null) {
                    parcelFileDescriptor.close();
                }
                return A012;
            }
            if (A012 == null) {
                createBitmap = null;
            } else {
                createBitmap = Bitmap.createBitmap(A012, 0, 0, A012.getWidth(), A012.getHeight(), A09, true);
            }
            if (parcelFileDescriptor != null) {
                parcelFileDescriptor.close();
            }
            return createBitmap;
        } catch (IOException unused2) {
            return null;
        } catch (Throwable th) {
            AnonymousClass0DT.A00(th, th);
        }
        throw th;
    }

    public int getType() {
        return 0;
    }

    public /* synthetic */ File BQC() {
        String path = this.A01.getPath();
        if (path == null) {
            return null;
        }
        return C108945cZ.A17(path);
    }

    public String BQD() {
        return this.A01.getPath();
    }

    public long BQH() {
        return new Date(this.A05.lastModified()).getTime();
    }

    public AnonymousClass7H3(AnonymousClass77X r4, AnonymousClass11B r5, File file, int i, boolean z) {
        Uri.Builder A062 = C108965cb.A06(file);
        if (z) {
            A062.appendQueryParameter("flip-h", "1");
        }
        if (i != 0) {
            A062.appendQueryParameter("rotation", Integer.toString(i));
        }
        Uri build = A062.build();
        long length = file.length();
        this.A02 = r5;
        this.A01 = build;
        this.A00 = length;
        this.A05 = file;
        this.A06 = z;
        this.A03 = i;
        this.A04 = r4;
    }

    public Uri BLl() {
        return this.A01;
    }

    public AnonymousClass77X BOL() {
        return this.A04;
    }

    public /* synthetic */ long BQv() {
        return 0;
    }

    public File BRc() {
        return this.A05;
    }

    public String BUw() {
        return "image/*";
    }

    public int BYP() {
        return this.A03;
    }

    public boolean Bep() {
        return this.A06;
    }

    public long getContentLength() {
        return this.A00;
    }
}
