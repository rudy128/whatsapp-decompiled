package X;

import com.whatsapp.jobqueue.job.GetStatusPrivacyJob;
import org.whispersystems.jobqueue.Job;

/* renamed from: X.2Ts  reason: invalid class name and case insensitive filesystem */
public abstract class C50252Ts {
    /* JADX WARNING: type inference failed for: r0v3, types: [com.whatsapp.jobqueue.job.GetStatusPrivacyJob, org.whispersystems.jobqueue.Job] */
    public static final GetStatusPrivacyJob A00(C19880zA r2) {
        C18070vi.A0d(r2, 0);
        C190849lc r1 = new C190849lc();
        AnonymousClass3EB.A00("GetStatusPrivacyJob", r1);
        if (!r2.A07()) {
            return new Job(r1.A00());
        }
        r2.A03();
        throw AnonymousClass000.A0s("getValidVNameRequirement");
    }
}
