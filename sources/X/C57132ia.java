package X;

import com.whatsapp.companiondevice.sync.HistorySyncCompanionWorker;

/* renamed from: X.2ia  reason: invalid class name and case insensitive filesystem */
public final class C57132ia {
    public final /* synthetic */ HistorySyncCompanionWorker A00;
    public final /* synthetic */ C56152gz A01;

    public void A00(Exception exc) {
        C114465qs r1;
        Object obj;
        C56152gz r3 = this.A01;
        int i = r3.A01;
        HistorySyncCompanionWorker historySyncCompanionWorker = this.A00;
        if (i == 0) {
            historySyncCompanionWorker.A01.A02(r3, exc, false);
            r1 = historySyncCompanionWorker.A00;
            obj = new C162168Jj();
        } else {
            historySyncCompanionWorker.A01.A02(r3, exc, true);
            r1 = historySyncCompanionWorker.A00;
            obj = new Object();
        }
        r1.A03(obj);
    }

    public C57132ia(HistorySyncCompanionWorker historySyncCompanionWorker, C56152gz r2) {
        this.A00 = historySyncCompanionWorker;
        this.A01 = r2;
    }
}
