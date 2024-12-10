package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass1BI;
import X.AnonymousClass1OZ;
import X.C17890vO;
import X.C22488B9u;
import X.C58762lD;
import X.C60132nR;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import org.whispersystems.jobqueue.Job;

public final class SendOrderStatusUpdateFailureReceiptJob extends Job implements C22488B9u {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass1OZ A00;
    public final String jid;
    public final String messageKeyId;

    public void A08() {
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendOrderStatusUpdateFailureReceiptJob(X.AnonymousClass1BI r4, java.lang.String r5) {
        /*
            r3 = this;
            X.9lc r2 = new X.9lc
            r2.<init>()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "order-status-update-failure-"
            r1.append(r0)
            java.lang.String r0 = r4.getRawString()
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            X.AnonymousClass3EB.A00(r0, r2)
            org.whispersystems.jobqueue.JobParameters r0 = r2.A00()
            r3.<init>(r0)
            java.lang.String r0 = r4.getRawString()
            r3.jid = r0
            r3.messageKeyId = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendOrderStatusUpdateFailureReceiptJob.<init>(X.1BI, java.lang.String):void");
    }

    public void A0A() {
        AnonymousClass1BI A02 = AnonymousClass1BI.A00.A02(this.jid);
        C58762lD r1 = new C58762lD();
        r1.A02 = A02;
        r1.A08 = this.messageKeyId;
        r1.A09 = "error";
        r1.A06 = "receipt";
        C60132nR A002 = r1.A00();
        AnonymousClass1OZ r4 = this.A00;
        String str = this.messageKeyId;
        Message obtain = Message.obtain((Handler) null, 0, 295, 0, A02);
        obtain.getData().putString("messageKeyId", str);
        r4.A07(obtain, A002).get();
    }

    public void A09() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("canceled send order-status-update-failure receipt job");
        StringBuilder A0d = C17890vO.A0d();
        A0d.append(this.jid);
        A0d.append("; id=");
        C17890vO.A1B(A10, AnonymousClass000.A0y(this.messageKeyId, A0d));
    }

    public boolean A0C(Exception exc) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("exception while running send order status update failure receipt job");
        StringBuilder A0d = C17890vO.A0d();
        A0d.append(this.jid);
        A0d.append("; id=");
        C17890vO.A13(AnonymousClass000.A0y(this.messageKeyId, A0d), A10, exc);
        return true;
    }

    public void CIZ(Context context) {
        this.A00 = C17890vO.A0H(context).BAA();
    }
}
