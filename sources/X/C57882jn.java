package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.2jn  reason: invalid class name and case insensitive filesystem */
public abstract class C57882jn {
    public File A00;
    public File A01;
    public final AnonymousClass4DO A02;
    public final AnonymousClass4DP A03;
    public final String A04;

    public C57882jn(AnonymousClass4DO r2, AnonymousClass4DP r3, String str) {
        C18070vi.A0d(str, 1);
        this.A04 = str;
        this.A02 = r2;
        this.A03 = r3;
    }

    public final File A00(Context context) {
        File file;
        File file2 = this.A01;
        if (file2 == null || !file2.exists() || (file = this.A00) == null || !file.exists()) {
            return null;
        }
        if (C28281Zt.A0B(context)) {
            return this.A00;
        }
        return this.A01;
    }
}
