package X;

import com.whatsapp.wds.metrics.logging.network.HierarchyUploadScheduler$HierarchyUploadWorker;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7CH  reason: invalid class name */
public final class AnonymousClass7CH implements AnonymousClass191 {
    public final AnonymousClass19K A00;
    public final AnonymousClass00H A01;

    public /* synthetic */ void Blg() {
    }

    public void Blf() {
        if (C72453Mb.A1a(((C130776jz) this.A01.get()).A07)) {
            C162238Ju r3 = new C162238Ju(HierarchyUploadScheduler$HierarchyUploadWorker.class, TimeUnit.HOURS, 24);
            A1B a1b = new A1B();
            a1b.A00 = AnonymousClass00R.A0C;
            a1b.A03 = true;
            r3.A03(a1b.A01());
            r3.A02(5, TimeUnit.MINUTES);
            BDL A02 = ((A7W) this.A00.get()).A02((C162258Jw) r3.A00(), AnonymousClass00R.A01, "name.whatsapp.wds.metrics.logging");
            C18070vi.A0X(A02);
            try {
                ((C20346AHc) A02).A00.get();
            } catch (Exception unused) {
            }
        }
    }

    public AnonymousClass7CH(AnonymousClass19K r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public void Ba9() {
    }
}
