package X;

import android.content.Context;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.requirements.Requirement;

/* renamed from: X.9Sl  reason: invalid class name and case insensitive filesystem */
public class C181949Sl {
    public static void A00(Context context, Job job) {
        if (job instanceof C22488B9u) {
            ((C22488B9u) job).CIZ(context);
        }
        for (Requirement requirement : job.parameters.requirements) {
            if (requirement instanceof C22488B9u) {
                ((C22488B9u) requirement).CIZ(context);
            }
        }
    }
}
