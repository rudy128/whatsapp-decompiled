package X;

import android.os.Build;
import com.whatsapp.networkresources.NetworkResourceDownloadWorker;

/* renamed from: X.9jL  reason: invalid class name and case insensitive filesystem */
public class C189499jL {
    public final AnonymousClass19K A00;

    public void A00(C0L c0l) {
        A1B a1b = new A1B();
        a1b.A00 = AnonymousClass00R.A01;
        a1b.A02 = true;
        a1b.A04 = true;
        if (Build.VERSION.SDK_INT >= 23) {
            a1b.A02();
        }
        C196269uj r4 = new C196269uj(NetworkResourceDownloadWorker.class);
        C192939pH r3 = new C192939pH();
        r3.A00.put("resource_id", c0l.id);
        r4.A04(r3.A00());
        r4.A03(a1b.A01());
        r4.A07("NetworkResourceDownloadTask-Lazy");
        AnonymousClass8BR.A0D(this.A00).A07((C162248Jv) r4.A00(), AnonymousClass00R.A00, AnonymousClass001.A1E(c0l, "Resource-Download-", AnonymousClass000.A10()));
    }

    public C189499jL(AnonymousClass19K r1) {
        this.A00 = r1;
    }
}
