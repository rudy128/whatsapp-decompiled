package X;

import android.content.Context;
import java.io.File;
import java.io.FilenameFilter;

/* renamed from: X.Cim  reason: case insensitive filesystem */
public class C25606Cim {
    public static final FilenameFilter A07 = new DRQ(0);
    public static final FilenameFilter A08 = new DRQ(1);
    public int A00 = 0;
    public long A01 = 0;
    public CTI A02 = new Object();
    public File A03;
    public File A04;
    public File A05;
    public final File A06;

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.CTI] */
    public C25606Cim(Context context, File file) {
        if (file.exists() || file.mkdirs()) {
            this.A06 = file;
        } else {
            File A0e = C17880vN.A0e(context.getFilesDir(), "profilo");
            this.A06 = A0e;
            if (!A0e.exists() && !A0e.mkdirs()) {
                throw AnonymousClass000.A0n("Unable to initialize Profilo folder");
            }
        }
        this.A04 = C17880vN.A0e(this.A06, "upload");
        this.A05 = C17880vN.A0e(this.A06, "crash_dumps");
        this.A03 = C17880vN.A0e(this.A06, "mmap_buffer");
    }
}
