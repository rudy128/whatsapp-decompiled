package X;

import android.database.sqlite.SQLiteException;
import com.whatsapp.util.Log;

/* renamed from: X.3CJ  reason: invalid class name */
public final /* synthetic */ class AnonymousClass3CJ implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C27431Wb A02;
    public final /* synthetic */ C22681Cu A03;
    public final /* synthetic */ Runnable A04;
    public final /* synthetic */ boolean A05;

    public final void run() {
        C27431Wb r7 = this.A02;
        int i = this.A00;
        long j = this.A01;
        C22681Cu r5 = this.A03;
        Runnable runnable = this.A04;
        boolean z = this.A05;
        Log.i("MessageStoreBackup/backupdb/sb unlocker");
        try {
            AnonymousClass1Cd r0 = r7.A0I;
            r0.A06();
            r0.A02.Bbw();
            r7.A0K.A01();
            C27431Wb.A08(r7, r5, i, j);
            if (runnable != null && !z) {
                runnable.run();
            }
        } catch (SQLiteException e) {
            Log.e("MessageStoreBackup/backupdb/failed-to-get-database/cannot-generate-fts-or-links", e);
        }
    }

    public /* synthetic */ AnonymousClass3CJ(C27431Wb r1, C22681Cu r2, Runnable runnable, int i, long j, boolean z) {
        this.A02 = r1;
        this.A00 = i;
        this.A01 = j;
        this.A03 = r2;
        this.A04 = runnable;
        this.A05 = z;
    }
}
