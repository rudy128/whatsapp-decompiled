package X;

import android.app.job.JobParameters;
import android.net.Uri;

/* renamed from: X.9uv  reason: invalid class name and case insensitive filesystem */
public abstract class C196359uv {
    public static Uri[] A00(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentUris();
    }

    public static String[] A01(JobParameters jobParameters) {
        return jobParameters.getTriggeredContentAuthorities();
    }
}
