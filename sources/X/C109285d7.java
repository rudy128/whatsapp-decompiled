package X;

import android.app.job.JobService;
import com.whatsapp.media.upload.MediaUploadJobService;

/* renamed from: X.5d7  reason: invalid class name and case insensitive filesystem */
public abstract class C109285d7 extends JobService implements AnonymousClass009 {
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
            MediaUploadJobService mediaUploadJobService = (MediaUploadJobService) this;
            AnonymousClass10E r1 = ((C31221fD) ((C008503u) generatedComponent())).A07;
            mediaUploadJobService.A01 = AnonymousClass10E.A4z(r1);
            mediaUploadJobService.A05 = (C32861hs) r1.Agw.get();
            mediaUploadJobService.A02 = AnonymousClass3MZ.A0g(r1);
            mediaUploadJobService.A04 = AnonymousClass3MY.A0Z(r1);
            mediaUploadJobService.A06 = AnonymousClass10E.AL1(r1);
            mediaUploadJobService.A03 = AnonymousClass10E.A6Q(r1);
        }
        super.onCreate();
    }
}
