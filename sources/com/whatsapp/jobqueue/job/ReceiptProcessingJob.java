package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass3MX;
import X.C17890vO;
import X.C22488B9u;
import X.C42691ya;
import X.C62352rG;
import android.content.Context;
import org.whispersystems.jobqueue.Job;

public final class ReceiptProcessingJob extends Job implements C22488B9u {
    public static final long serialVersionUID = 1;
    public transient C62352rG A00;
    public final boolean[] keyFromMe;
    public final String[] keyId;
    public final String[] keyRemoteChatJidRawString;
    public final String participantDeviceJidRawString;
    public final C42691ya receiptPrivacyMode;
    public final String remoteJidRawString;
    public final int status;
    public final long timestamp;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ReceiptProcessingJob(com.whatsapp.jid.DeviceJid r6, com.whatsapp.jid.Jid r7, X.C42691ya r8, X.AnonymousClass205[] r9, int r10, long r11) {
        /*
            r5 = this;
            X.9lc r1 = new X.9lc
            r1.<init>()
            r0 = 1
            r1.A02 = r0
            java.lang.String r0 = "ReceiptProcessingGroup"
            r1.A00 = r0
            org.whispersystems.jobqueue.JobParameters r0 = r1.A00()
            r5.<init>(r0)
            int r4 = r9.length
            java.lang.String[] r0 = new java.lang.String[r4]
            r5.keyId = r0
            boolean[] r0 = new boolean[r4]
            r5.keyFromMe = r0
            java.lang.String[] r0 = new java.lang.String[r4]
            r5.keyRemoteChatJidRawString = r0
            r3 = 0
        L_0x0021:
            if (r3 >= r4) goto L_0x0040
            java.lang.String[] r1 = r5.keyId
            r0 = r9[r3]
            java.lang.String r0 = r0.A01
            r1[r3] = r0
            boolean[] r1 = r5.keyFromMe
            r2 = r9[r3]
            boolean r0 = r2.A02
            r1[r3] = r0
            java.lang.String[] r1 = r5.keyRemoteChatJidRawString
            X.1BI r0 = r2.A00
            java.lang.String r0 = X.C22971Dz.A06(r0)
            r1[r3] = r0
            int r3 = r3 + 1
            goto L_0x0021
        L_0x0040:
            java.lang.String r0 = r7.getRawString()
            r5.remoteJidRawString = r0
            java.lang.String r0 = X.C22971Dz.A06(r6)
            r5.participantDeviceJidRawString = r0
            r5.status = r10
            r5.timestamp = r11
            r5.receiptPrivacyMode = r8
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.ReceiptProcessingJob.<init>(com.whatsapp.jid.DeviceJid, com.whatsapp.jid.Jid, X.1ya, X.205[], int, long):void");
    }

    public static String A00(ReceiptProcessingJob receiptProcessingJob) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("; remoteJid=");
        A10.append(AnonymousClass3MX.A0n(receiptProcessingJob.remoteJidRawString));
        A10.append("; number of keys=");
        A10.append(receiptProcessingJob.keyId.length);
        A10.append("; receiptPrivacyMode=");
        return C17890vO.A0V(receiptProcessingJob.receiptPrivacyMode, A10);
    }

    public void CIZ(Context context) {
        this.A00 = (C62352rG) ((AnonymousClass10E) C17890vO.A0H(context)).A6e.get();
    }
}
