package X;

import android.net.Uri;
import java.io.File;
import java.util.Date;

/* renamed from: X.65i  reason: invalid class name and case insensitive filesystem */
public class C1188065i extends C144357Gz implements AnonymousClass8BB {
    public final AnonymousClass77X A00;
    public final File A01;

    public int BUm() {
        return 3;
    }

    public int BYP() {
        return 0;
    }

    public boolean Bep() {
        return false;
    }

    public long BQH() {
        return new Date(this.A01.lastModified()).getTime();
    }

    public C1188065i(AnonymousClass77X r4, File file) {
        super(Uri.fromFile(file), file.length());
        this.A01 = file;
        this.A00 = r4;
    }

    public AnonymousClass77X BOL() {
        return this.A00;
    }

    public File BRc() {
        return this.A01;
    }
}
