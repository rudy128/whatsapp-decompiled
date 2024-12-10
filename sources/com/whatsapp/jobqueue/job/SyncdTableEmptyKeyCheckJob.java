package com.whatsapp.jobqueue.job;

import X.AnonymousClass0DT;
import X.AnonymousClass10E;
import X.C17890vO;
import X.C22488B9u;
import X.C23141Ev;
import X.C25851Pw;
import X.C26331Rs;
import X.C28781at;
import X.C28801av;
import android.content.Context;
import android.database.Cursor;
import com.whatsapp.util.Log;
import org.whispersystems.jobqueue.Job;

public class SyncdTableEmptyKeyCheckJob extends Job implements C22488B9u {
    public static final long serialVersionUID = 1;
    public transient C25851Pw A00;
    public transient C26331Rs A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public SyncdTableEmptyKeyCheckJob() {
        /*
            r2 = this;
            X.9lc r1 = new X.9lc
            r1.<init>()
            r0 = 1
            r1.A02 = r0
            java.lang.String r0 = "syncd-table-empty-key-check"
            r1.A00 = r0
            org.whispersystems.jobqueue.JobParameters r0 = r1.A00()
            r2.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.jobqueue.job.SyncdTableEmptyKeyCheckJob.<init>():void");
    }

    public void A08() {
        Log.i("SyncdTableEmptyKeyCheckJob/onadded");
    }

    public void A09() {
        Log.i("SyncdTableEmptyKeyCheckJob/onCanceled");
        this.A00.A03(7);
    }

    public void A0A() {
        Cursor A002;
        Log.i("SyncdTableEmptyKeyCheckJob/onRun/start");
        C28781at A05 = this.A01.A00.get();
        try {
            A002 = C23141Ev.A00(((C28801av) A05).A02, "SELECT 1 as has_empty_key FROM syncd_mutations WHERE device_id = 0  AND epoch = 0  LIMIT 1 ", "SyncdMutationsTable.HAS_EMPTY_KEY_EXIST_STATE");
            boolean z = false;
            if (A002.moveToFirst() && C17890vO.A01(A002, "has_empty_key") == 1) {
                z = true;
            }
            A002.close();
            A05.close();
            if (z) {
                Log.e("SyncdTableEmptyKeyCheckJob/onRun/hasEmptyKeyMutation");
                this.A00.A03(7);
                return;
            }
            Log.i("SyncdTableEmptyKeyCheckJob/onRun/end");
            return;
        } catch (Throwable th) {
            try {
                A05.close();
                throw th;
            } catch (Throwable th2) {
                AnonymousClass0DT.A00(th, th2);
                throw th;
            }
        }
        throw th;
    }

    public boolean A0C(Exception exc) {
        Log.i("SyncdTableEmptyKeyCheckJob/onShouldRetry");
        this.A00.A03(7);
        return false;
    }

    public void CIZ(Context context) {
        AnonymousClass10E r1 = (AnonymousClass10E) C17890vO.A0H(context);
        this.A01 = (C26331Rs) r1.AAj.get();
        this.A00 = (C25851Pw) r1.AAk.get();
    }
}
