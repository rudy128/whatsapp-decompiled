package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass12E;
import X.AnonymousClass1MR;
import X.C000100c;
import X.C17890vO;
import X.C19830z4;
import X.C22488B9u;
import X.C22971Dz;
import X.C23651Hc;
import android.content.Context;
import org.whispersystems.jobqueue.Job;

public class SyncDeviceForAdvValidationJob extends Job implements C22488B9u {
    public static final long serialVersionUID = 1;
    public transient C23651Hc A00;
    public transient AnonymousClass12E A01;
    public transient C19830z4 A02;
    public transient AnonymousClass1MR A03;
    public final String[] jids;

    public void A09() {
    }

    public boolean A0C(Exception exc) {
        return false;
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SyncDeviceForAdvValidationJob(com.whatsapp.jid.UserJid[] r3) {
        /*
            r2 = this;
            X.9lc r1 = new X.9lc
            r1.<init>()
            java.lang.String r0 = "SyncDeviceForAdvValidationJob"
            r1.A00 = r0
            org.whispersystems.jobqueue.JobParameters r0 = r1.A00()
            r2.<init>(r0)
            java.util.List r0 = java.util.Arrays.asList(r3)
            java.lang.String[] r0 = X.C22971Dz.A0j(r0)
            r2.jids = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SyncDeviceForAdvValidationJob.<init>(com.whatsapp.jid.UserJid[]):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0016, code lost:
        if (r9.A00.A01() != false) goto L_0x0018;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0A() {
        /*
            r9 = this;
            java.lang.String[] r0 = r9.jids
            java.util.ArrayList r5 = X.C22971Dz.A0C(r0)
            X.1Hc r0 = r9.A00
            boolean r0 = r0.A02()
            r4 = 0
            if (r0 == 0) goto L_0x0018
            X.1Hc r0 = r9.A00
            boolean r0 = r0.A01()
            r3 = 1
            if (r0 == 0) goto L_0x0020
        L_0x0018:
            r3 = 0
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0020
        L_0x001f:
            return
        L_0x0020:
            X.0z4 r0 = r9.A02
            android.content.SharedPreferences r2 = X.C17890vO.A0B(r0)
            java.util.HashSet r0 = X.C17880vN.A12()
            java.lang.String r1 = "adv_validating_users_to_sync"
            java.util.Set r2 = r2.getStringSet(r1, r0)
            X.C17960vV.A07(r2)
            java.lang.String[] r0 = new java.lang.String[r4]
            java.lang.Object[] r0 = r2.toArray(r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            java.util.ArrayList r0 = X.C22971Dz.A0C(r0)
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>(r0)
            boolean r0 = r6.addAll(r5)
            if (r0 == 0) goto L_0x0064
            java.lang.String[] r0 = X.C22971Dz.A0j(r6)
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.util.HashSet r2 = new java.util.HashSet
            r2.<init>(r0)
            X.0z4 r0 = r9.A02
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r0)
            android.content.SharedPreferences$Editor r0 = r0.putStringSet(r1, r2)
            r0.apply()
        L_0x0064:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x001f
            if (r3 == 0) goto L_0x001f
            X.12E r3 = r9.A01     // Catch:{ Exception -> 0x0091 }
            X.2R1 r5 = X.AnonymousClass2R1.A05     // Catch:{ Exception -> 0x0091 }
            r6.size()     // Catch:{ Exception -> 0x0091 }
            X.2qq r4 = X.C62132qq.A0H     // Catch:{ Exception -> 0x0091 }
            r7 = 1
            r8 = r7
            X.2P4 r0 = r3.A04(r4, r5, r6, r7, r8)     // Catch:{ Exception -> 0x0091 }
            java.lang.Object r0 = r0.get()     // Catch:{ Exception -> 0x0091 }
            X.2rf r0 = (X.C62602rf) r0     // Catch:{ Exception -> 0x0091 }
            boolean r0 = r0.A00()     // Catch:{ Exception -> 0x0091 }
            if (r0 == 0) goto L_0x009b
            X.0z4 r0 = r9.A02     // Catch:{ Exception -> 0x0091 }
            android.content.SharedPreferences$Editor r0 = X.C19830z4.A00(r0)     // Catch:{ Exception -> 0x0091 }
            X.C17880vN.A1B(r0, r1)     // Catch:{ Exception -> 0x0091 }
            goto L_0x009b
        L_0x0091:
            r2 = move-exception
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "DeviceSyncManager/syncDeviceForAdvValidation/error ex="
            X.C17900vP.A0X(r2, r0, r1)
        L_0x009b:
            X.0z4 r1 = r9.A02
            X.1MR r0 = r9.A03
            X.11P r0 = r0.A01
            long r2 = r0.A07()
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r1)
            java.lang.String r0 = "adv_last_device_job_ts"
            X.C17880vN.A1D(r1, r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SyncDeviceForAdvValidationJob.A0A():void");
    }

    public void A08() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SyncDeviceForAdvValidationJob/onAdded/sync devices job added param=");
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("; jids=");
        C17890vO.A1A(A10, AnonymousClass000.A0y(C22971Dz.A09(this.jids), A102));
    }

    public void CIZ(Context context) {
        C000100c A0H = C17890vO.A0H(context);
        AnonymousClass10E r1 = (AnonymousClass10E) A0H;
        this.A00 = (C23651Hc) r1.ACD.get();
        this.A03 = (AnonymousClass1MR) r1.ABD.get();
        this.A01 = (AnonymousClass12E) r1.A2k.get();
        this.A02 = A0H.CRw();
    }
}
