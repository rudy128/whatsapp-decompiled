package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass11P;
import X.AnonymousClass1N7;
import X.AnonymousClass1OZ;
import X.AnonymousClass8BS;
import X.C000100c;
import X.C17890vO;
import X.C18070vi;
import X.C22488B9u;
import android.content.Context;
import org.whispersystems.jobqueue.Job;

public final class SendEngagedReceiptJob extends Job implements C22488B9u {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass11P A00;
    public transient AnonymousClass1OZ A01;
    public transient AnonymousClass1N7 A02;
    public final String jidStr;
    public final long loggableStanzaId;
    public final String messageId;
    public final long originalMessageTimestamp;
    public final String source;
    public final String value;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendEngagedReceiptJob(java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, long r8, long r10) {
        /*
            r3 = this;
            r0 = 1
            X.C18070vi.A0d(r4, r0)
            X.9lc r2 = new X.9lc
            r2.<init>()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "engaged-receipt-"
            java.lang.String r0 = X.AnonymousClass001.A1H(r0, r4, r1)
            X.AnonymousClass3EB.A00(r0, r2)
            org.whispersystems.jobqueue.JobParameters r0 = r2.A00()
            r3.<init>(r0)
            r3.jidStr = r4
            r3.messageId = r5
            r3.originalMessageTimestamp = r8
            r3.loggableStanzaId = r10
            r3.source = r6
            r3.value = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendEngagedReceiptJob.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, long, long):void");
    }

    public void CIZ(Context context) {
        C18070vi.A0d(context, 0);
        C000100c A0H = C17890vO.A0H(AnonymousClass8BS.A02(context));
        this.A00 = A0H.CP7();
        this.A01 = A0H.BAA();
        this.A02 = (AnonymousClass1N7) ((AnonymousClass10E) A0H).A5s.get();
    }

    public static final String A00(SendEngagedReceiptJob sendEngagedReceiptJob) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SendEngagedReceiptJob(jidStr='");
        A10.append(sendEngagedReceiptJob.jidStr);
        A10.append("', messageId='");
        A10.append(sendEngagedReceiptJob.messageId);
        A10.append("', originalMessageTimestamp=");
        A10.append(sendEngagedReceiptJob.originalMessageTimestamp);
        A10.append(", loggableStanzaId=");
        A10.append(sendEngagedReceiptJob.loggableStanzaId);
        A10.append(", source='");
        A10.append(sendEngagedReceiptJob.source);
        A10.append("', value='");
        A10.append(sendEngagedReceiptJob.value);
        return AnonymousClass000.A0y("')", A10);
    }
}
