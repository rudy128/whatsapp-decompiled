package X;

import java.io.File;

/* renamed from: X.17y  reason: invalid class name and case insensitive filesystem */
public class C219317y {
    public final C219417z A00;

    public File A00(String str) {
        C219417z r0 = this.A00;
        C219417z.A00(r0);
        return new File(r0.A04, str);
    }

    public C219317y(AnonymousClass118 r4, C219217x r5, AnonymousClass11Z r6) {
        this.A00 = new C219417z((AnonymousClass190) null, r5, r6, new File(r4.A00.getFilesDir(), ".trash"));
    }
}
