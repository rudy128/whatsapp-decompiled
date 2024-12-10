package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass11S;
import X.AnonymousClass1BI;
import X.AnonymousClass1P3;
import X.AnonymousClass689;
import X.C000100c;
import X.C166418cr;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C17960vV;
import X.C194059r6;
import X.C198079xk;
import X.C21499Al8;
import X.C22488B9u;
import X.C25581Ot;
import X.C27101Us;
import X.C32501hI;
import X.C60072nL;
import X.C63962tz;
import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.io.ObjectInputStream;
import java.util.concurrent.ExecutionException;
import org.whispersystems.jobqueue.Job;

public final class SendFinalLiveLocationRetryJob extends Job implements C22488B9u {
    public static final long serialVersionUID = 1;
    public transient C32501hI A00;
    public transient AnonymousClass1P3 A01;
    public transient AnonymousClass11S A02;
    public transient C25581Ot A03;
    public transient AnonymousClass689 A04;
    public transient C27101Us A05;
    public final String contextRawJid;
    public final double latitude;
    public final double longitude;
    public final String msgId;
    public final String rawDeviceJid;
    public final int retryCount;
    public final int timeOffset;
    public final long timestamp;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendFinalLiveLocationRetryJob(com.whatsapp.jid.DeviceJid r5, X.AnonymousClass205 r6, X.C60072nL r7, byte[] r8, int r9, int r10) {
        /*
            r4 = this;
            X.9lc r3 = new X.9lc
            r3.<init>()
            if (r8 == 0) goto L_0x0011
            int r0 = r8.length
            if (r0 != 0) goto L_0x0011
            java.lang.String r0 = "cannot use empty old alice base key"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass000.A0k(r0)
            throw r0
        L_0x0011:
            com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement r0 = new com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement
            r0.<init>(r5)
            java.util.List r2 = r3.A01
            r2.add(r0)
            if (r8 == 0) goto L_0x0025
            X.3EF r0 = new X.3EF
            r0.<init>(r5, r8)
            r2.add(r0)
        L_0x0025:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "final-live-location-"
            java.lang.String r0 = X.AnonymousClass001.A1E(r5, r0, r1)
            r3.A00 = r0
            r0 = 1
            r3.A02 = r0
            X.3EB r0 = new X.3EB
            r0.<init>()
            r2.add(r0)
            org.whispersystems.jobqueue.JobParameters r0 = r3.A00()
            r4.<init>(r0)
            boolean r0 = X.AnonymousClass000.A1R(r10)
            X.C17960vV.A0D(r0)
            java.lang.String r0 = r5.getRawString()
            r4.rawDeviceJid = r0
            X.1BI r1 = r6.A00
            boolean r0 = X.C22971Dz.A0e(r1)
            if (r0 == 0) goto L_0x0073
            java.lang.String r0 = X.C22971Dz.A06(r1)
        L_0x005c:
            r4.contextRawJid = r0
            java.lang.String r0 = r6.A01
            r4.msgId = r0
            double r0 = r7.A00
            r4.latitude = r0
            double r0 = r7.A01
            r4.longitude = r0
            long r0 = r7.A05
            r4.timestamp = r0
            r4.timeOffset = r9
            r4.retryCount = r10
            return
        L_0x0073:
            r0 = 0
            goto L_0x005c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendFinalLiveLocationRetryJob.<init>(com.whatsapp.jid.DeviceJid, X.205, X.2nL, byte[], int, int):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0022 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A08() {
        /*
            r7 = this;
            org.whispersystems.jobqueue.JobParameters r0 = r7.parameters
            java.util.List r2 = r0.requirements
            java.lang.String r1 = r7.rawDeviceJid
            X.1E0 r0 = com.whatsapp.jid.DeviceJid.Companion
            com.whatsapp.jid.DeviceJid r6 = r0.A06(r1)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "final live location notification send retry job added"
            r1.append(r0)
            java.lang.String r0 = r7.A00()
            X.C17890vO.A1A(r1, r0)
            java.util.Iterator r5 = r2.iterator()
            r4 = 0
            r3 = 0
        L_0x0022:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0055
            java.lang.Object r2 = r5.next()
            org.whispersystems.jobqueue.requirements.Requirement r2 = (org.whispersystems.jobqueue.requirements.Requirement) r2
            boolean r0 = r2 instanceof com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement
            r1 = 1
            if (r0 == 0) goto L_0x0047
            com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement r2 = (com.whatsapp.jobqueue.requirement.AxolotlSessionRequirement) r2
            boolean r0 = r2.Bfv()
        L_0x0039:
            if (r0 != 0) goto L_0x0052
            r3 = 1
        L_0x003c:
            X.1hI r2 = r7.A00
            com.whatsapp.jid.DeviceJid[] r1 = new com.whatsapp.jid.DeviceJid[r1]
            r1[r4] = r6
            r0 = 3
            r2.A04(r1, r0, r4)
            goto L_0x0022
        L_0x0047:
            boolean r0 = r2 instanceof X.AnonymousClass3EF
            if (r0 == 0) goto L_0x0052
            X.3EF r2 = (X.AnonymousClass3EF) r2
            boolean r0 = r2.Bfv()
            goto L_0x0039
        L_0x0052:
            if (r3 == 0) goto L_0x0022
            goto L_0x003c
        L_0x0055:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendFinalLiveLocationRetryJob.A08():void");
    }

    public void A0A() {
        C194059r6 r5;
        AnonymousClass1BI r4;
        C60072nL r2 = new C60072nL(this.A02.A0A());
        r2.A00 = this.latitude;
        r2.A01 = this.longitude;
        r2.A05 = this.timestamp;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("run send final live location retry job");
        C17890vO.A1A(A10, A00());
        C166418cr A022 = this.A04.A02(r2, Integer.valueOf(this.timeOffset));
        try {
            if (this.A01.A0Y()) {
                r5 = C198079xk.A00(this.A01.A0B(C63962tz.A02(DeviceJid.Companion.A06(this.rawDeviceJid)), A022.A0M()));
            } else {
                C25581Ot r22 = this.A03;
                r5 = (C194059r6) r22.A00.submit(new C21499Al8(A022, this, 3)).get();
            }
            DeviceJid A06 = DeviceJid.Companion.A06(this.rawDeviceJid);
            C17960vV.A07(A06);
            UserJid userJid = A06.userJid;
            C27101Us r23 = this.A05;
            String str = this.contextRawJid;
            if (str == null) {
                r4 = null;
            } else {
                r4 = AnonymousClass1BI.A00.A02(str);
            }
            r23.A00(userJid, r4, r5, this.msgId, this.retryCount).get();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("LocationSharingManager/encryptAndSendLocation error", e);
        }
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("sent final live location notifications");
        C17890vO.A1A(A102, A00());
    }

    private String A00() {
        StringBuilder A10 = AnonymousClass000.A10();
        C17900vP.A0q(A10, this);
        A10.append("; jid=");
        A10.append(Jid.Companion.A02(this.rawDeviceJid));
        A10.append("; msgId=");
        A10.append(this.msgId);
        A10.append("; location.timestamp=");
        return C17880vN.A0u(A10, this.timestamp);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (TextUtils.isEmpty(this.rawDeviceJid)) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("jid must not be empty");
            throw C17900vP.A06(A00(), A10);
        } else if (TextUtils.isEmpty(this.msgId)) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("msgId must not be empty");
            throw C17900vP.A06(A00(), A102);
        } else if (this.timestamp == 0) {
            StringBuilder A103 = AnonymousClass000.A10();
            A103.append("location timestamp must not be 0");
            throw C17900vP.A06(A00(), A103);
        }
    }

    public void A09() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("canceled send final live location retry job");
        C17890vO.A1B(A10, A00());
    }

    public boolean A0C(Exception exc) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("exception while running send final live location retry job");
        C17890vO.A13(A00(), A10, exc);
        return true;
    }

    public void CIZ(Context context) {
        C000100c A042 = C17900vP.A04(context);
        this.A02 = A042.BA6();
        AnonymousClass10E r1 = (AnonymousClass10E) A042;
        this.A04 = (AnonymousClass689) r1.A5q.get();
        this.A03 = (C25581Ot) r1.A9z.get();
        this.A01 = (AnonymousClass1P3) r1.A9y.get();
        this.A05 = (C27101Us) r1.A5r.get();
        this.A00 = (C32501hI) r1.A8Y.get();
    }
}
