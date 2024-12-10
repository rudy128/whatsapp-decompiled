package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.C17890vO;
import X.C17900vP;
import X.C22488B9u;
import X.C22911Dt;
import X.C42691ya;
import X.C62352rG;
import android.content.Context;
import com.whatsapp.jid.Jid;
import org.whispersystems.jobqueue.Job;

public final class ReceiptMultiTargetProcessingJob extends Job implements C22488B9u {
    public static final long serialVersionUID = 1;
    public transient C62352rG A00;
    public final boolean keyFromMe;
    public final String keyId;
    public final String keyRemoteChatJidRawString;
    public final String[] participantDeviceJidRawString;
    public final C42691ya receiptPrivacyMode;
    public final String remoteJidString;
    public final int status;
    public final long[] timestamp;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ReceiptMultiTargetProcessingJob(com.whatsapp.jid.Jid r7, X.AnonymousClass205 r8, X.C42691ya r9, java.util.List r10, int r11) {
        /*
            r6 = this;
            X.9lc r1 = new X.9lc
            r1.<init>()
            r0 = 1
            r1.A02 = r0
            java.lang.String r0 = "ReceiptProcessingGroup"
            r1.A00 = r0
            org.whispersystems.jobqueue.JobParameters r0 = r1.A00()
            r6.<init>(r0)
            int r5 = r10.size()
            java.lang.String r0 = r8.A01
            r6.keyId = r0
            boolean r0 = r8.A02
            r6.keyFromMe = r0
            X.1BI r0 = r8.A00
            X.C17960vV.A07(r0)
            java.lang.String r0 = r0.getRawString()
            r6.keyRemoteChatJidRawString = r0
            java.lang.String r0 = r7.getRawString()
            r6.remoteJidString = r0
            r6.status = r11
            java.lang.String[] r0 = new java.lang.String[r5]
            r6.participantDeviceJidRawString = r0
            long[] r0 = new long[r5]
            r6.timestamp = r0
            r6.receiptPrivacyMode = r9
            r4 = 0
        L_0x003d:
            if (r4 >= r5) goto L_0x0061
            java.lang.Object r3 = r10.get(r4)
            android.util.Pair r3 = (android.util.Pair) r3
            java.lang.String[] r1 = r6.participantDeviceJidRawString
            java.lang.Object r0 = r3.first
            com.whatsapp.jid.Jid r0 = (com.whatsapp.jid.Jid) r0
            java.lang.String r0 = X.C22971Dz.A06(r0)
            r1[r4] = r0
            long[] r2 = r6.timestamp
            java.lang.Object r0 = r3.second
            X.C17960vV.A07(r0)
            long r0 = X.C17880vN.A05(r0)
            r2[r4] = r0
            int r4 = r4 + 1
            goto L_0x003d
        L_0x0061:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.ReceiptMultiTargetProcessingJob.<init>(com.whatsapp.jid.Jid, X.205, X.1ya, java.util.List, int):void");
    }

    public static String A00(ReceiptMultiTargetProcessingJob receiptMultiTargetProcessingJob) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("; keyRemoteJid=");
        String str = receiptMultiTargetProcessingJob.keyRemoteChatJidRawString;
        C22911Dt r1 = Jid.Companion;
        A10.append(r1.A02(str));
        A10.append("; remoteJid=");
        A10.append(r1.A02(receiptMultiTargetProcessingJob.remoteJidString));
        A10.append("; number of participants=");
        A10.append(receiptMultiTargetProcessingJob.participantDeviceJidRawString.length);
        A10.append("; recepitPrivacyMode=");
        return C17890vO.A0V(receiptMultiTargetProcessingJob.receiptPrivacyMode, A10);
    }

    public void CIZ(Context context) {
        this.A00 = (C62352rG) ((AnonymousClass10E) C17900vP.A04(context)).A6e.get();
    }
}
