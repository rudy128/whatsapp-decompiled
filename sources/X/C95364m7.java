package X;

import com.whatsapp.productinfra.reportingtoken.cron.ReportingTokenCleanupDailyCron$onDailyCron$1;
import com.whatsapp.productinfra.reportingtoken.cron.ReportingTokenCleanupDailyCron$onDailyCron$2;
import com.whatsapp.productinfra.reportingtoken.cron.ReportingTokenCleanupDailyCron$triggerCleanupLogic$1;

/* renamed from: X.4m7  reason: invalid class name and case insensitive filesystem */
public final class C95364m7 implements C72113Kr {
    public final AnonymousClass11P A00;
    public final AnonymousClass00H A01;
    public final C18030ve A02;
    public final C18600wl A03;
    public final AnonymousClass1OX A04;

    public void Bqf() {
        A00(new ReportingTokenCleanupDailyCron$onDailyCron$1(this, (C30391dr) null), 6723);
        A00(new ReportingTokenCleanupDailyCron$onDailyCron$2(this, (C30391dr) null), 9567);
    }

    private final void A00(AnonymousClass1OS r6, int i) {
        int A002 = C18020vd.A00(C18040vf.A02, this.A02, i);
        if (A002 > 60) {
            A002 = 60;
        } else if (A002 < 0) {
            return;
        }
        AnonymousClass3MW.A1X(this.A03, new ReportingTokenCleanupDailyCron$triggerCleanupLogic$1(this, (C30391dr) null, r6, A002), this.A04);
    }

    public C95364m7(AnonymousClass11P r1, C18030ve r2, AnonymousClass00H r3, C18600wl r4, AnonymousClass1OX r5) {
        C18070vi.A0w(r1, r2, r3, r4, r5);
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
        this.A03 = r4;
        this.A04 = r5;
    }
}
