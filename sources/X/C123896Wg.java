package X;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import com.whatsapp.media.transcode.MediaTranscodeService;
import com.whatsapp.media.upload.MediaUploadJobService;

/* renamed from: X.6Wg  reason: invalid class name and case insensitive filesystem */
public abstract class C123896Wg {
    public static boolean A00(JobScheduler jobScheduler, AnonymousClass118 r6) {
        if (jobScheduler == null || MediaTranscodeService.A0B.size() != 1) {
            return false;
        }
        Context context = r6.A00;
        if (AnonymousClass74L.A0D(context, 16)) {
            return false;
        }
        jobScheduler.schedule(new JobInfo.Builder(16, new ComponentName(context, MediaUploadJobService.class)).setRequiredNetworkType(1).setUserInitiated(true).build());
        return true;
    }
}
