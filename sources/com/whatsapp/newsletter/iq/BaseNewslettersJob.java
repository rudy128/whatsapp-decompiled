package com.whatsapp.newsletter.iq;

import X.AnonymousClass5Y9;
import X.C107095Yj;
import X.C18070vi;
import X.C22488B9u;
import android.content.Context;
import org.whispersystems.jobqueue.Job;

public abstract class BaseNewslettersJob extends Job implements C107095Yj, C22488B9u {
    public boolean isCancelled;
    public AnonymousClass5Y9 newsletterRequestTimeManager;

    public void CIZ(Context context) {
        C18070vi.A0d(context, 0);
    }

    public void cancel() {
        this.isCancelled = true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public BaseNewslettersJob(java.lang.String r4) {
        /*
            r3 = this;
            X.9lc r2 = new X.9lc
            r2.<init>()
            r2.A00 = r4
            X.3EB r1 = new X.3EB
            r1.<init>()
            java.util.List r0 = r2.A01
            r0.add(r1)
            org.whispersystems.jobqueue.JobParameters r0 = r2.A00()
            r3.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.newsletter.iq.BaseNewslettersJob.<init>(java.lang.String):void");
    }
}
