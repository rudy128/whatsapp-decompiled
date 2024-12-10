package X;

import android.os.SystemClock;
import com.whatsapp.report.ReportActivity;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.concurrent.TimeUnit;

/* renamed from: X.6MF  reason: invalid class name */
public final class AnonymousClass6MF extends A34 {
    public final AnonymousClass1KB A00;
    public final C72403Lu A01;
    public final Integer A02;
    public final WeakReference A03;
    public final AnonymousClass11P A04;

    public AnonymousClass6MF(AnonymousClass1FU r2, AnonymousClass1KB r3, AnonymousClass11P r4, C72403Lu r5, Integer num) {
        super(r2, true);
        this.A00 = r3;
        this.A01 = r5;
        this.A02 = num;
        this.A04 = r4;
        this.A03 = AnonymousClass3MW.A0z(r2);
    }

    public void A0F() {
        AnonymousClass1FU A0Z = C108945cZ.A0Z(this.A03);
        if (A0Z != null && !A0Z.Bed()) {
            A0Z.CNB(0, 2131895077);
        }
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        AnonymousClass1FU A0Z = C108945cZ.A0Z(this.A03);
        if (A0Z != null && !A0Z.Bed()) {
            A0Z.CEx();
            this.A01.CDp(this.A02);
        }
    }

    /* JADX WARNING: type inference failed for: r3v5, types: [X.Bly, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        C114465qs r3;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        C72403Lu r4 = this.A01;
        Integer num = this.A02;
        ReportActivity reportActivity = (ReportActivity) r4;
        C18070vi.A0d(num, 0);
        if (num == AnonymousClass00R.A0N) {
            reportActivity.A4b();
            ? obj = new Object();
            obj.A03((Object) null);
            r3 = obj;
        } else {
            C132086mB r2 = reportActivity.A08;
            if (r2 != null) {
                r3 = r2.A00(new AnonymousClass7LX(reportActivity, num, 1), num);
            } else {
                C18070vi.A11("gdprXmppMethods");
                throw null;
            }
        }
        try {
            r3.get(32000, TimeUnit.MILLISECONDS);
            long elapsedRealtime2 = SystemClock.elapsedRealtime() - elapsedRealtime;
            if (elapsedRealtime2 < 500) {
                try {
                    Thread.sleep(500 - elapsedRealtime2);
                    return null;
                } catch (InterruptedException unused) {
                }
            }
        } catch (Throwable th) {
            Log.w("SendGetGdprReportTask/doInBackground/timeout", th);
            C146767Qn.A00(this.A00, this, 35);
        }
        return null;
    }
}
