package com.whatsapp.media.job;

import X.AnonymousClass10E;
import X.C17890vO;
import X.C22488B9u;
import X.C25291Nq;
import X.C64062u9;
import android.content.Context;
import java.io.File;
import org.whispersystems.jobqueue.Job;

public class DeleteMediaFileJob extends Job implements C22488B9u {
    public static final long serialVersionUID = 1;
    public transient C25291Nq A00;
    public final File fileToDelete;
    public final int messageType;

    public boolean A0C(Exception exc) {
        return true;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public DeleteMediaFileJob(java.io.File r3, int r4) {
        /*
            r2 = this;
            X.9lc r1 = new X.9lc
            r1.<init>()
            java.lang.String r0 = "delete-media-file-job"
            r1.A00 = r0
            r0 = 1
            r1.A02 = r0
            org.whispersystems.jobqueue.JobParameters r0 = r1.A00()
            r2.<init>(r0)
            r2.fileToDelete = r3
            r2.messageType = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.media.job.DeleteMediaFileJob.<init>(java.io.File, int):void");
    }

    public void A0A() {
        C25291Nq r2 = this.A00;
        File file = this.fileToDelete;
        int i = this.messageType;
        C64062u9.A0Q(file);
        r2.A0B(file, i);
    }

    public void A08() {
    }

    public void A09() {
    }

    public void CIZ(Context context) {
        this.A00 = (C25291Nq) ((AnonymousClass10E) C17890vO.A0H(context)).A6E.get();
    }
}
