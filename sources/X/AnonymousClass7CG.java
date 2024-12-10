package X;

import com.whatsapp.snapl.cron.SnaplWorker;
import com.whatsapp.util.Log;
import java.util.concurrent.TimeUnit;

/* renamed from: X.7CG  reason: invalid class name */
public final class AnonymousClass7CG implements AnonymousClass191 {
    public final C18030ve A00;
    public final AnonymousClass19K A01;

    public /* synthetic */ void Blf() {
    }

    public void Blg() {
        if (C18020vd.A05(C18040vf.A02, this.A00, 10970)) {
            C162238Ju r4 = new C162238Ju(SnaplWorker.class, TimeUnit.HOURS, 24);
            A1B a1b = new A1B();
            Integer num = AnonymousClass00R.A01;
            a1b.A00 = num;
            r4.A03(a1b.A01());
            TimeUnit timeUnit = TimeUnit.MINUTES;
            r4.A06(num, timeUnit, 3);
            r4.A02(10, timeUnit);
            BDL A02 = ((A7W) this.A01.get()).A02((C162258Jw) r4.A00(), num, "SnaplWorker");
            C18070vi.A0X(A02);
            try {
                ((C20346AHc) A02).A00.get();
            } catch (Exception e) {
                Log.e("SNAPL work enqueue failed", e);
            }
        }
    }

    public AnonymousClass7CG(C18030ve r1, AnonymousClass19K r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public void Ba9() {
    }
}
