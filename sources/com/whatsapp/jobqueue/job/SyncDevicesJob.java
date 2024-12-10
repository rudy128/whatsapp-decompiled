package com.whatsapp.jobqueue.job;

import X.AnonymousClass000;
import X.AnonymousClass10E;
import X.AnonymousClass11P;
import X.AnonymousClass12E;
import X.AnonymousClass2R1;
import X.C17880vN;
import X.C17890vO;
import X.C17960vV;
import X.C22488B9u;
import X.C22941Dw;
import X.C22971Dz;
import X.C26171Rc;
import X.C62132qq;
import android.content.Context;
import com.whatsapp.jid.UserJid;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.whispersystems.jobqueue.Job;

public class SyncDevicesJob extends Job implements C22488B9u {
    public static final long serialVersionUID = 1;
    public transient C26171Rc A00;
    public transient AnonymousClass12E A01;
    public final String[] jids;
    public final int syncType;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SyncDevicesJob(com.whatsapp.jid.UserJid[] r5, int r6) {
        /*
            r4 = this;
            X.9lc r1 = new X.9lc
            r1.<init>()
            java.lang.String r0 = "SyncDevicesJob"
            r1.A00 = r0
            org.whispersystems.jobqueue.JobParameters r0 = X.AnonymousClass3EC.A00(r1)
            r4.<init>(r0)
            X.C17960vV.A0J(r5)
            int r3 = r5.length
            r2 = 0
        L_0x0015:
            if (r2 >= r3) goto L_0x0021
            r1 = r5[r2]
            java.lang.String r0 = "an element of jids was empty."
            X.C17960vV.A08(r1, r0)
            int r2 = r2 + 1
            goto L_0x0015
        L_0x0021:
            java.util.List r0 = java.util.Arrays.asList(r5)
            java.lang.String[] r0 = X.C22971Dz.A0j(r0)
            r4.jids = r0
            r4.syncType = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SyncDevicesJob.<init>(com.whatsapp.jid.UserJid[], int):void");
    }

    private String A00() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("; jids=");
        return AnonymousClass000.A0y(C22971Dz.A09(this.jids), A10);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        int length;
        objectInputStream.defaultReadObject();
        String[] strArr = this.jids;
        if (strArr == null || (length = strArr.length) == 0) {
            throw new InvalidObjectException("jids must not be empty");
        }
        int i = 0;
        while (C22941Dw.A02(strArr[i]) != null) {
            i++;
            if (i >= length) {
                return;
            }
        }
        throw new InvalidObjectException("an jid is not a UserJid");
    }

    public void A08() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SyncDevicesJob/onAdded/sync devices job added param=");
        C17890vO.A1A(A10, A00());
    }

    public void A09() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SyncDevicesJob/onCanceled/cancel sync devices job param=");
        C17890vO.A1B(A10, A00());
        this.A00.A00(this.jids);
    }

    public void A0A() {
        AnonymousClass2R1 r3;
        try {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("SyncDevicesJob/onRun/start sync device. param=");
            C17890vO.A1A(A10, A00());
            AnonymousClass12E r1 = this.A01;
            ArrayList A0C = C22971Dz.A0C(this.jids);
            C17960vV.A0A("jid list is empty", A0C);
            switch (this.syncType) {
                case 1:
                    r3 = AnonymousClass2R1.A0I;
                    break;
                case 2:
                    r3 = AnonymousClass2R1.A0K;
                    break;
                case 3:
                    r3 = AnonymousClass2R1.A05;
                    break;
                case 4:
                    r3 = AnonymousClass2R1.A0O;
                    break;
                case 5:
                    r3 = AnonymousClass2R1.A0H;
                    break;
                case 6:
                    r3 = AnonymousClass2R1.A0G;
                    break;
                default:
                    r3 = AnonymousClass2R1.A0E;
                    break;
            }
            A0C.size();
            r1.A04(C62132qq.A0H, r3, A0C, true, true).get();
            this.A00.A00(this.jids);
            return;
        } catch (Exception e) {
            StringBuilder A102 = AnonymousClass000.A10();
            A102.append("SyncDevicesJob/onRun/error, param=");
            C17890vO.A19(A102, A00());
            throw e;
        } catch (Throwable th) {
            this.A00.A00(this.jids);
            throw th;
        }
    }

    public boolean A0C(Exception exc) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("SyncDevicesJob/onShouldReply/exception while running devices sync param=");
        C17890vO.A1B(A10, A00());
        return true;
    }

    public void CIZ(Context context) {
        int length;
        AnonymousClass10E r1 = (AnonymousClass10E) C17890vO.A0H(context);
        this.A01 = (AnonymousClass12E) r1.A2k.get();
        this.A00 = (C26171Rc) r1.A3N.get();
        String[] strArr = this.jids;
        if (strArr != null && (length = strArr.length) > 0) {
            HashSet A12 = C17880vN.A12();
            int i = 0;
            do {
                UserJid A02 = C22941Dw.A02(strArr[i]);
                if (A02 != null) {
                    A12.add(A02);
                }
                i++;
            } while (i < length);
            C26171Rc r7 = this.A00;
            Set set = r7.A03;
            synchronized (set) {
                set.addAll(A12);
                long A012 = AnonymousClass11P.A01(r7.A00);
                Iterator it = A12.iterator();
                while (it.hasNext()) {
                    r7.A01.put(C17880vN.A0T(it), Long.valueOf(A012));
                }
            }
        }
    }
}
