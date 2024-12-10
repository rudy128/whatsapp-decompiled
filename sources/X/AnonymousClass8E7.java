package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.app.job.JobWorkItem;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;

/* renamed from: X.8E7  reason: invalid class name */
public final class AnonymousClass8E7 extends C194149rF {
    public final JobInfo A00;
    public final JobScheduler A01;

    public void A02(Intent intent) {
        this.A01.enqueue(this.A00, new JobWorkItem(intent));
    }

    public AnonymousClass8E7(ComponentName componentName, Context context, int i) {
        super(componentName);
        A01(i);
        this.A00 = new JobInfo.Builder(i, this.A02).setOverrideDeadline(0).build();
        this.A01 = (JobScheduler) context.getApplicationContext().getSystemService("jobscheduler");
    }
}
