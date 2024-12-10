package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass11S;
import X.AnonymousClass1BI;
import X.AnonymousClass1P3;
import X.C000100c;
import X.C166418cr;
import X.C173408v1;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C17960vV;
import X.C194059r6;
import X.C22488B9u;
import X.C25581Ot;
import X.C27091Ur;
import X.C27101Us;
import X.C27131Uv;
import X.C59982nC;
import X.C63962tz;
import android.content.Context;
import android.text.TextUtils;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement;
import java.io.ObjectInputStream;
import java.util.List;
import org.whispersystems.jobqueue.Job;
import org.whispersystems.jobqueue.requirements.Requirement;

public final class SendFinalLiveLocationNotificationJob extends Job implements C22488B9u {
    public static final long serialVersionUID = 1;
    public transient C27131Uv A00;
    public transient AnonymousClass11S A01;
    public transient AnonymousClass1P3 A02;
    public transient C25581Ot A03;
    public transient C27091Ur A04;
    public transient C27101Us A05;
    public final double latitude;
    public final double longitude;
    public final String msgId;
    public final String rawJid;
    public final int timeOffset;
    public final long timestamp;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SendFinalLiveLocationNotificationJob(X.AnonymousClass205 r5, X.C60072nL r6, int r7) {
        /*
            r4 = this;
            X.9lc r3 = new X.9lc
            r3.<init>()
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "final-live-location-"
            r1.append(r0)
            X.1BI r2 = r5.A00
            java.lang.String r0 = X.C22971Dz.A06(r2)
            java.lang.String r0 = X.AnonymousClass000.A0y(r0, r1)
            r3.A00 = r0
            r0 = 1
            r3.A02 = r0
            X.3EB r0 = new X.3EB
            r0.<init>()
            java.util.List r1 = r3.A01
            r1.add(r0)
            com.whatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement r0 = new com.whatsapp.jobqueue.requirement.AxolotlFastRatchetSenderKeyRequirement
            r0.<init>()
            r1.add(r0)
            org.whispersystems.jobqueue.JobParameters r0 = r3.A00()
            r4.<init>(r0)
            boolean r0 = r5.A02
            X.C17960vV.A0D(r0)
            X.C17960vV.A07(r2)
            java.lang.String r0 = r2.getRawString()
            r4.rawJid = r0
            java.lang.String r0 = r5.A01
            r4.msgId = r0
            double r0 = r6.A00
            r4.latitude = r0
            double r0 = r6.A01
            r4.longitude = r0
            long r0 = r6.A05
            r4.timestamp = r0
            r4.timeOffset = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob.<init>(X.205, X.2nL, int):void");
    }

    public static C194059r6 A00(SendFinalLiveLocationNotificationJob sendFinalLiveLocationNotificationJob, C166418cr r4) {
        DeviceJid A0L = sendFinalLiveLocationNotificationJob.A00.A0L();
        C17960vV.A07(A0L);
        return new C194059r6(sendFinalLiveLocationNotificationJob.A02.A0C(new C59982nC(C63962tz.A02(A0L), C173408v1.A00.getRawString()), r4.A0M()).A02, 3);
    }

    public void A08() {
        List<Requirement> list = this.parameters.requirements;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("final live location notification send job added");
        C17890vO.A1A(A10, A01());
        for (Requirement requirement : list) {
            if ((requirement instanceof AxolotlFastRatchetSenderKeyRequirement) && !((AxolotlFastRatchetSenderKeyRequirement) requirement).Bfv()) {
                this.A00.A0c();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x005c, code lost:
        r3 = r9.A04.A02(r7, java.lang.Integer.valueOf(r9.timeOffset));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006e, code lost:
        if (r9.A02.A0Y() == false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0070, code lost:
        r3 = A00(r9, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0074, code lost:
        r9.A05.A00(X.C22931Dv.A01(r9.rawJid), (X.AnonymousClass1BI) null, r3, r9.msgId, 0).get();
        r1 = X.AnonymousClass000.A10();
        r1.append("LocationSharingManager/sent final live location notifications");
        X.C17890vO.A1A(r1, A01());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0098, code lost:
        r2 = r9.A03;
        r3 = (X.C194059r6) r2.A00.submit(new X.C21499Al8(r3, r9, 2)).get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ad, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00ae, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00af, code lost:
        com.whatsapp.util.Log.e("LocationSharingManager/encryptAndSendLocation error", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b4, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A() {
        /*
            r9 = this;
            X.11S r0 = r9.A01
            X.1E2 r0 = r0.A0A()
            X.2nL r7 = new X.2nL
            r7.<init>(r0)
            double r0 = r9.latitude
            r7.A00 = r0
            double r0 = r9.longitude
            r7.A01 = r0
            long r0 = r9.timestamp
            r7.A05 = r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "run send final live location job"
            r1.append(r0)
            java.lang.String r0 = r9.A01()
            X.C17890vO.A1A(r1, r0)
            X.1Uv r8 = r9.A00
            java.lang.String r1 = r9.rawJid
            X.1Dv r0 = X.AnonymousClass1BI.A00
            X.1BI r2 = r0.A02(r1)
            X.C17960vV.A07(r2)
            java.lang.String r1 = r9.msgId
            r0 = 1
            X.205 r0 = X.AnonymousClass205.A01(r2, r1, r0)
            X.219 r6 = X.C27131Uv.A03(r8, r0)
            if (r6 == 0) goto L_0x00b8
            java.lang.Object r5 = r8.A0U
            monitor-enter(r5)
            X.2nL r1 = r6.A02     // Catch:{ all -> 0x00b5 }
            boolean r0 = r7.equals(r1)     // Catch:{ all -> 0x00b5 }
            if (r0 != 0) goto L_0x005b
            if (r1 == 0) goto L_0x0058
            long r3 = r7.A05     // Catch:{ all -> 0x00b5 }
            long r1 = r1.A05     // Catch:{ all -> 0x00b5 }
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0058
            monitor-exit(r5)     // Catch:{ all -> 0x00b5 }
            goto L_0x00b8
        L_0x0058:
            r8.A0Z(r7, r6)     // Catch:{ all -> 0x00b5 }
        L_0x005b:
            monitor-exit(r5)     // Catch:{ all -> 0x00b5 }
            X.1Ur r1 = r9.A04
            int r0 = r9.timeOffset
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            X.8cr r3 = r1.A02(r7, r0)
            X.1P3 r0 = r9.A02     // Catch:{ 11T | InterruptedException | ExecutionException -> 0x00ae }
            boolean r0 = r0.A0Y()     // Catch:{ 11T | InterruptedException | ExecutionException -> 0x00ae }
            if (r0 == 0) goto L_0x0098
            X.9r6 r3 = A00(r9, r3)     // Catch:{ 11T | InterruptedException | ExecutionException -> 0x00ae }
        L_0x0074:
            java.lang.String r0 = r9.rawJid     // Catch:{ 11T | InterruptedException | ExecutionException -> 0x00ae }
            X.1BI r1 = X.C22931Dv.A01(r0)     // Catch:{ 11T | InterruptedException | ExecutionException -> 0x00ae }
            X.1Us r0 = r9.A05     // Catch:{ 11T | InterruptedException | ExecutionException -> 0x00ae }
            java.lang.String r4 = r9.msgId     // Catch:{ 11T | InterruptedException | ExecutionException -> 0x00ae }
            r5 = 0
            r2 = 0
            X.1Ug r0 = r0.A00(r1, r2, r3, r4, r5)     // Catch:{ 11T | InterruptedException | ExecutionException -> 0x00ae }
            r0.get()     // Catch:{ 11T | InterruptedException | ExecutionException -> 0x00ae }
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ 11T | InterruptedException | ExecutionException -> 0x00ae }
            java.lang.String r0 = "LocationSharingManager/sent final live location notifications"
            r1.append(r0)     // Catch:{ 11T | InterruptedException | ExecutionException -> 0x00ae }
            java.lang.String r0 = r9.A01()     // Catch:{ 11T | InterruptedException | ExecutionException -> 0x00ae }
            X.C17890vO.A1A(r1, r0)     // Catch:{ 11T | InterruptedException | ExecutionException -> 0x00ae }
            goto L_0x00ad
        L_0x0098:
            X.1Ot r2 = r9.A03     // Catch:{ 11T | InterruptedException | ExecutionException -> 0x00ae }
            r0 = 2
            X.Al8 r1 = new X.Al8     // Catch:{ 11T | InterruptedException | ExecutionException -> 0x00ae }
            r1.<init>(r3, r9, r0)     // Catch:{ 11T | InterruptedException | ExecutionException -> 0x00ae }
            java.util.concurrent.ThreadPoolExecutor r0 = r2.A00     // Catch:{ 11T | InterruptedException | ExecutionException -> 0x00ae }
            java.util.concurrent.Future r0 = r0.submit(r1)     // Catch:{ 11T | InterruptedException | ExecutionException -> 0x00ae }
            java.lang.Object r3 = r0.get()     // Catch:{ 11T | InterruptedException | ExecutionException -> 0x00ae }
            X.9r6 r3 = (X.C194059r6) r3     // Catch:{ 11T | InterruptedException | ExecutionException -> 0x00ae }
            goto L_0x0074
        L_0x00ad:
            return
        L_0x00ae:
            r1 = move-exception
            java.lang.String r0 = "LocationSharingManager/encryptAndSendLocation error"
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x00b5:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x00b5 }
            throw r0
        L_0x00b8:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "skip sending final live location job, final live location notification already sent"
            r1.append(r0)
            java.lang.String r0 = r9.A01()
            X.C17890vO.A1A(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SendFinalLiveLocationNotificationJob.A0A():void");
    }

    private String A01() {
        StringBuilder A10 = AnonymousClass000.A10();
        C17900vP.A0q(A10, this);
        A10.append("; jid=");
        A10.append(AnonymousClass1BI.A00.A02(this.rawJid));
        A10.append("; msgId=");
        A10.append(this.msgId);
        A10.append("; location.timestamp=");
        return C17880vN.A0u(A10, this.timestamp);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        if (TextUtils.isEmpty(this.rawJid)) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("jid must not be empty");
            throw C17900vP.A06(A01(), A10);
        } else if (TextUtils.isEmpty(this.msgId)) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("msgId must not be empty");
            throw C17900vP.A06(A01(), A102);
        } else if (this.timestamp == 0) {
            StringBuilder A103 = AnonymousClass000.A10();
            A103.append("location timestamp must not be 0");
            throw C17900vP.A06(A01(), A103);
        }
    }

    public void A09() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("canceled send final live location job");
        C17890vO.A1B(A10, A01());
    }

    public boolean A0C(Exception exc) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("exception while running send final live location job");
        C17890vO.A13(A01(), A10, exc);
        return true;
    }

    public void CIZ(Context context) {
        C000100c A042 = C17900vP.A04(context);
        this.A01 = A042.BA6();
        AnonymousClass10E r1 = (AnonymousClass10E) A042;
        this.A03 = (C25581Ot) r1.A9z.get();
        this.A04 = (C27091Ur) r1.A0k.get();
        this.A02 = (AnonymousClass1P3) r1.A9y.get();
        this.A05 = (C27101Us) r1.A5r.get();
        this.A00 = (C27131Uv) r1.A5p.get();
    }
}
