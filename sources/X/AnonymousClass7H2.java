package X;

import android.net.Uri;
import java.io.File;

/* renamed from: X.7H2  reason: invalid class name */
public abstract class AnonymousClass7H2 implements AnonymousClass8B2 {
    public final Uri A00;
    public final AnonymousClass21V A01;
    public final File A02;
    public final long A03;
    public final C18100vl A04;
    public final C18100vl A05;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass7H2(X.AnonymousClass21V r7, java.io.File r8, long r9) {
        /*
            r6 = this;
            r3 = r8
            android.net.Uri r1 = android.net.Uri.fromFile(r8)
            X.C18070vi.A0X(r1)
            r0 = r6
            r2 = r7
            r4 = r9
            r0.<init>(r1, r2, r3, r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7H2.<init>(X.21V, java.io.File, long):void");
    }

    public String BQD() {
        return AnonymousClass3MW.A0y(this.A05);
    }

    public /* synthetic */ long BQv() {
        if (this instanceof AnonymousClass654) {
            return ((AnonymousClass654) this).A00;
        }
        if (this instanceof AnonymousClass652) {
            return ((AnonymousClass652) this).A00;
        }
        if (this instanceof AnonymousClass655) {
            return ((AnonymousClass655) this).A00;
        }
        if (this instanceof AnonymousClass651) {
            return ((AnonymousClass651) this).A00;
        }
        return 0;
    }

    public long getContentLength() {
        return C72453Mb.A0K(this.A04);
    }

    public Uri BLl() {
        return this.A00;
    }

    public File BQC() {
        return this.A02;
    }

    public long BQH() {
        return this.A03;
    }

    public AnonymousClass7H2(Uri uri, AnonymousClass21V r3, File file, long j) {
        this.A02 = file;
        this.A03 = j;
        this.A01 = r3;
        this.A00 = uri;
        this.A04 = AnonymousClass1DF.A01(new C150717l8(this));
        this.A05 = AnonymousClass1DF.A01(new C150727l9(this));
    }
}
