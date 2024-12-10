package X;

import com.whatsapp.companiondevice.sync.HistorySyncWorker;
import com.whatsapp.util.Log;

/* renamed from: X.1TP  reason: invalid class name */
public final class AnonymousClass1TP {
    public final AnonymousClass19K A00;

    public AnonymousClass1TP(AnonymousClass19K r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public final void A00() {
        Log.i("HistorySyncWorkManager/startHistorySync");
        Integer num = AnonymousClass00R.A01;
        C196269uj r1 = new C196269uj(HistorySyncWorker.class);
        r1.A05(AnonymousClass00R.A00);
        A1B a1b = new A1B();
        a1b.A00 = num;
        r1.A03(a1b.A01());
        ((A7W) this.A00.get()).A07((C162248Jv) r1.A00(), num, "HISTORY_SYNC_WORK_UNIQUE_NAME");
    }
}
