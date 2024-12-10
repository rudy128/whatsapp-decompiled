package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass1BI;
import X.AnonymousClass1N5;
import X.AnonymousClass1N7;
import X.AnonymousClass1OZ;
import X.C000100c;
import X.C17890vO;
import X.C17900vP;
import X.C20133A8t;
import X.C22488B9u;
import X.C22931Dv;
import X.C22941Dw;
import X.C22971Dz;
import X.C55942gc;
import X.C58762lD;
import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.Pair;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Arrays;
import org.whispersystems.jobqueue.Job;

public final class SendReadReceiptJob extends Job implements C22488B9u {
    public static final long serialVersionUID = 1;
    public transient AnonymousClass1OZ A00;
    public transient AnonymousClass1N5 A01;
    public transient AnonymousClass1N7 A02;
    public final transient Throwable A03;
    public final String jid;
    public final long loggableStanzaId;
    public final String[] messageIds;
    public final long originalMessageTimestamp;
    public final String participant;
    public final String recipient;
    public final String remoteSender;
    public final boolean shouldForceReadSelfReceipt;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendReadReceiptJob(X.AnonymousClass1BI r4, X.AnonymousClass1BI r5, X.AnonymousClass1BI r6, com.whatsapp.jid.DeviceJid r7, java.lang.String[] r8, long r9, long r11, boolean r13) {
        /*
            r3 = this;
            X.9lc r1 = new X.9lc
            r1.<init>()
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "read-receipt-"
            r2.append(r0)
            java.lang.String r0 = r4.getRawString()
            r2.append(r0)
            java.lang.String r0 = "-"
            r2.append(r0)
            java.lang.String r0 = X.C22971Dz.A06(r5)
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r2)
            X.AnonymousClass3EB.A00(r0, r1)
            org.whispersystems.jobqueue.JobParameters r0 = r1.A00()
            r3.<init>(r0)
            java.lang.String r0 = r4.getRawString()
            X.C17960vV.A07(r0)
            r3.jid = r0
            r1 = 0
            if (r5 != 0) goto L_0x0081
            r0 = r1
        L_0x0039:
            r3.participant = r0
            if (r7 != 0) goto L_0x007c
            r0 = r1
        L_0x003e:
            r3.remoteSender = r0
            if (r6 != 0) goto L_0x0077
            r0 = r1
        L_0x0043:
            r3.recipient = r0
            X.C17960vV.A0J(r8)
            r3.messageIds = r8
            r3.originalMessageTimestamp = r9
            r3.shouldForceReadSelfReceipt = r13
            r3.loggableStanzaId = r11
            boolean r0 = X.C22971Dz.A0d(r4)
            if (r0 == 0) goto L_0x0074
            if (r5 == 0) goto L_0x0074
            java.lang.Throwable r0 = new java.lang.Throwable
            r0.<init>()
            r3.A03 = r0
        L_0x005f:
            int r2 = r8.length
            r1 = 0
        L_0x0061:
            if (r1 >= r2) goto L_0x0070
            r0 = r8[r1]
            boolean r0 = X.AnonymousClass1EG.A0H(r0)
            if (r0 == 0) goto L_0x0071
            java.lang.String r0 = "SendReadReceiptJob/can't create the job with invalid message id(s)"
            com.whatsapp.util.Log.e((java.lang.String) r0)
        L_0x0070:
            return
        L_0x0071:
            int r1 = r1 + 1
            goto L_0x0061
        L_0x0074:
            r3.A03 = r1
            goto L_0x005f
        L_0x0077:
            java.lang.String r0 = r6.getRawString()
            goto L_0x0043
        L_0x007c:
            java.lang.String r0 = r7.getRawString()
            goto L_0x003e
        L_0x0081:
            java.lang.String r0 = r5.getRawString()
            goto L_0x0039
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendReadReceiptJob.<init>(X.1BI, X.1BI, X.1BI, com.whatsapp.jid.DeviceJid, java.lang.String[], long, long, boolean):void");
    }

    private String A00() {
        String str = this.jid;
        C22931Dv r1 = AnonymousClass1BI.A00;
        AnonymousClass1BI A022 = r1.A02(str);
        AnonymousClass1BI A023 = r1.A02(this.participant);
        DeviceJid A06 = DeviceJid.Companion.A06(this.remoteSender);
        StringBuilder A10 = AnonymousClass000.A10();
        C17900vP.A0W(A022, "; jid=", A10);
        A10.append(A023);
        A10.append("; remoteSender=");
        A10.append(A06);
        A10.append("; recipient=");
        A10.append(this.recipient);
        A10.append("; shouldForceReadSelfReceipt=");
        A10.append(this.shouldForceReadSelfReceipt);
        A10.append("; ids:");
        return AnonymousClass000.A0y(Arrays.deepToString(this.messageIds), A10);
    }

    public void A0A() {
        AnonymousClass1BI A022;
        A00();
        String str = this.jid;
        C22931Dv r1 = AnonymousClass1BI.A00;
        AnonymousClass1BI A023 = r1.A02(str);
        if (C22971Dz.A0Z(A023)) {
            A022 = null;
        } else {
            A022 = r1.A02(this.participant);
        }
        DeviceJid A06 = DeviceJid.Companion.A06(this.remoteSender);
        UserJid A024 = C22941Dw.A02(this.recipient);
        if (this.A01.A05(A023, this.A03, this.messageIds, this.originalMessageTimestamp, this.shouldForceReadSelfReceipt)) {
            C55942gc A012 = this.A01.A01(A023, A022, A06, A024, this.messageIds, 1, this.loggableStanzaId, this.shouldForceReadSelfReceipt);
            Pair A05 = C20133A8t.A05(A06, A023, A022);
            C58762lD r3 = new C58762lD();
            r3.A02 = (Jid) A05.first;
            r3.A06 = "receipt";
            r3.A09 = A012.A07;
            r3.A08 = this.messageIds[0];
            r3.A01 = (Jid) A05.second;
            r3.A03 = A024;
            r3.A00 = this.loggableStanzaId;
            this.A00.A07(Message.obtain((Handler) null, 0, 89, 0, A012), r3.A00()).get();
            A00();
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (Jid.Companion.A02(this.jid) == null) {
            throw new InvalidObjectException("jid must not be empty");
        } else if (this.messageIds.length == 0) {
            throw new InvalidObjectException("messageIds must not be empty");
        }
    }

    public void A08() {
        A00();
    }

    public void A09() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("canceled sent read receipts job");
        C17890vO.A1B(A10, A00());
    }

    public boolean A0C(Exception exc) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("exception while running sent read receipts job");
        C17890vO.A13(A00(), A10, exc);
        return true;
    }

    public void CIZ(Context context) {
        C000100c A04 = C17900vP.A04(context);
        this.A00 = A04.BAA();
        AnonymousClass10E r1 = (AnonymousClass10E) A04;
        this.A01 = (AnonymousClass1N5) r1.A9K.get();
        this.A02 = (AnonymousClass1N7) r1.A5s.get();
    }
}
