package X;

import android.app.job.JobParameters;
import android.app.job.JobWorkItem;
import android.content.Intent;

public final class AGO implements C22492B9y {
    public final JobWorkItem A00;
    public final /* synthetic */ AnonymousClass8Bn A01;

    public AGO(JobWorkItem jobWorkItem, AnonymousClass8Bn r2) {
        this.A01 = r2;
        this.A00 = jobWorkItem;
    }

    public void BFM() {
        AnonymousClass8Bn r0 = this.A01;
        synchronized (r0.A02) {
            JobParameters jobParameters = r0.A00;
            if (jobParameters != null) {
                jobParameters.completeWork(this.A00);
            }
        }
    }

    public Intent getIntent() {
        return this.A00.getIntent();
    }
}
