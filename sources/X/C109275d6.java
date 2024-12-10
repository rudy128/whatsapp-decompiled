package X;

import android.app.job.JobService;
import com.whatsapp.media.download.service.MediaDownloadJobService;

/* renamed from: X.5d6  reason: invalid class name and case insensitive filesystem */
public abstract class C109275d6 extends JobService implements AnonymousClass009 {
    public boolean A00 = false;
    public final Object A01 = C17880vN.A0p();
    public volatile C008203r A02;

    public final Object generatedComponent() {
        if (this.A02 == null) {
            synchronized (this.A01) {
                if (this.A02 == null) {
                    this.A02 = new C008203r(this);
                }
            }
        }
        return this.A02.generatedComponent();
    }

    public void onCreate() {
        if (!this.A00) {
            this.A00 = true;
            MediaDownloadJobService mediaDownloadJobService = (MediaDownloadJobService) this;
            AnonymousClass10E r1 = ((C31221fD) ((C008503u) generatedComponent())).A07;
            mediaDownloadJobService.A0B = (AnonymousClass1OX) r1.A9C.get();
            mediaDownloadJobService.A00 = AnonymousClass10E.A4z(r1);
            mediaDownloadJobService.A0A = AnonymousClass3MZ.A1B(r1);
            mediaDownloadJobService.A08 = C000200d.A00(r1.A62);
            mediaDownloadJobService.A04 = (C32431hB) r1.A66.get();
            mediaDownloadJobService.A02 = AnonymousClass10E.A6O(r1);
            mediaDownloadJobService.A01 = AnonymousClass3MZ.A0g(r1);
            mediaDownloadJobService.A03 = AnonymousClass3MZ.A0l(r1);
            mediaDownloadJobService.A09 = AnonymousClass3MW.A0s(r1);
            mediaDownloadJobService.A06 = AnonymousClass10E.AL1(r1);
        }
        super.onCreate();
    }
}
