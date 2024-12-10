package com.whatsapp.jobqueue.job;

import X.AnonymousClass10E;
import X.AnonymousClass1SY;
import X.C17900vP;
import X.C22488B9u;
import X.C24371Kb;
import X.C24421Kg;
import android.content.Context;
import org.whispersystems.jobqueue.Job;

public class SendDeleteHistorySyncMmsJob extends Job implements C22488B9u {
    public static final long serialVersionUID = 1;
    public transient C24371Kb A00;
    public transient AnonymousClass1SY A01;
    public transient C24421Kg A02;
    public final String chunkId;
    public final String companionMetaNonce;
    public final String directPath;
    public final String encHandle;
    public final String mediaEncHash;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendDeleteHistorySyncMmsJob(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r3 = this;
            X.9lc r2 = new X.9lc
            r2.<init>()
            r0 = 1
            r2.A02 = r0
            org.whispersystems.jobqueue.requirements.NetworkRequirement r1 = new org.whispersystems.jobqueue.requirements.NetworkRequirement
            r1.<init>()
            java.util.List r0 = r2.A01
            r0.add(r1)
            org.whispersystems.jobqueue.JobParameters r0 = r2.A00()
            r3.<init>(r0)
            r3.chunkId = r4
            r3.encHandle = r5
            r3.directPath = r6
            r3.mediaEncHash = r7
            r3.companionMetaNonce = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendDeleteHistorySyncMmsJob.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    public void CIZ(Context context) {
        AnonymousClass10E r1 = (AnonymousClass10E) C17900vP.A04(context);
        this.A02 = (C24421Kg) r1.A9a.get();
        this.A01 = (AnonymousClass1SY) r1.AB8.get();
        this.A00 = (C24371Kb) r1.A6A.get();
    }
}
