package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import com.whatsapp.media.download.service.MediaDownloadJobService;

/* renamed from: X.6Wd  reason: invalid class name and case insensitive filesystem */
public abstract class C123866Wd {
    public static void A00(Context context, AnonymousClass11C r5) {
        if (!AnonymousClass74L.A0D(context, 15)) {
            JobScheduler jobScheduler = r5.A01;
            if (jobScheduler == null) {
                jobScheduler = (JobScheduler) AnonymousClass11C.A03(r5, "jobscheduler", true);
                r5.A01 = jobScheduler;
                if (jobScheduler == null) {
                    return;
                }
            }
            jobScheduler.schedule(new JobInfo.Builder(15, new ComponentName(context, MediaDownloadJobService.class)).setRequiredNetworkType(1).setUserInitiated(true).build());
        }
    }
}
