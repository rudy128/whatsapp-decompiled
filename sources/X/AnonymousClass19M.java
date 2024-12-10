package X;

import java.io.File;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

/* renamed from: X.19M  reason: invalid class name */
public class AnonymousClass19M {
    public static final long A07 = TimeUnit.DAYS.toMillis(5);
    public final AnonymousClass118 A00;
    public final AnonymousClass19I A01;
    public final AnonymousClass19G A02;
    public final AnonymousClass19A A03;
    public final Semaphore A04 = new Semaphore(1);
    public final AnonymousClass11P A05;
    public volatile File A06 = null;

    public static File[] A00(AnonymousClass19M r3, String str) {
        File[] listFiles;
        File file = new File(r3.A00.A00.getCacheDir(), "qpl");
        if (!file.exists() || (listFiles = file.listFiles(new AnonymousClass3BV(str, 2))) == null) {
            return new File[0];
        }
        return listFiles;
    }

    public AnonymousClass19M(AnonymousClass11P r3, AnonymousClass118 r4, AnonymousClass19I r5, AnonymousClass19G r6, AnonymousClass19A r7) {
        this.A00 = r4;
        this.A05 = r3;
        this.A03 = r7;
        this.A01 = r5;
        this.A02 = r6;
    }

    public void A01(File file) {
        if (file.exists()) {
            try {
                file.delete();
            } catch (Exception e) {
                this.A03.BKW(e.getMessage());
            }
        }
    }
}
