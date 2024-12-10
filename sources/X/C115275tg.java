package X;

import com.whatsapp.util.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* renamed from: X.5tg  reason: invalid class name and case insensitive filesystem */
public class C115275tg extends C167258fi {
    public final long A00;
    public final C42621yT A01;
    public final AnonymousClass190 A02;
    public final String A03;
    public final Collection A04;

    /* renamed from: A0G */
    public File A0E() {
        C42621yT r4 = this.A01;
        r4.A02();
        ArrayList A13 = AnonymousClass000.A13();
        for (File listFiles : this.A04) {
            File[] listFiles2 = listFiles.listFiles();
            r4.A02();
            if (listFiles2 != null) {
                for (File file : listFiles2) {
                    if (file.isFile()) {
                        long abs = Math.abs(file.lastModified() - this.A00);
                        if (abs <= 3600000) {
                            A13.add(new C127406eJ(file, abs));
                        }
                    }
                }
            }
        }
        r4.A02();
        C147027Rn.A01(20, A13);
        A13.size();
        r4.A02();
        Iterator it = A13.iterator();
        while (it.hasNext()) {
            File file2 = ((C127406eJ) it.next()).A01;
            r4.A02();
            try {
                if (this.A03.equals(C1402370n.A00(file2))) {
                    return file2;
                }
            } catch (IOException e) {
                Log.e("mediafilefindjob/run/ioexception", e);
            }
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("file not found for hash ");
        A10.append(this.A03);
        throw new FileNotFoundException(AnonymousClass001.A1E(this, "; job=", A10));
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, X.1yT] */
    public C115275tg(AnonymousClass190 r6, AnonymousClass10I r7, String str, Collection collection, long j) {
        this.A02 = r6;
        this.A03 = str;
        this.A04 = collection;
        this.A00 = j;
        C18070vi.A0d(r7, 0);
        ? obj = new Object();
        r7.CGv(new AnonymousClass7RJ(obj, 10), 10000);
        this.A01 = obj;
    }

    public void cancel() {
        super.cancel();
        this.A01.A01();
    }
}
