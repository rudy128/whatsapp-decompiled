package X;

import android.os.SystemClock;
import android.util.SparseIntArray;

/* renamed from: X.Aip  reason: case insensitive filesystem */
public final /* synthetic */ class C21360Aip implements Runnable {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C20105A7j A01;
    public final /* synthetic */ boolean A02;
    public final /* synthetic */ boolean A03;

    public final void run() {
        C20105A7j a7j = this.A01;
        long j = this.A00;
        boolean z = this.A02;
        boolean z2 = this.A03;
        C19830z4 r4 = a7j.A05;
        r4.A1C(5);
        C19830z4.A00(r4).putLong("ext_dir_migration_rescan_time", SystemClock.elapsedRealtime() - j).commit();
        C20105A7j.A03((SparseIntArray) null, a7j, 1);
        r4.A20(z);
        if (z2) {
            a7j.A06.A04("ExternalDirMigration");
        }
    }

    public /* synthetic */ C21360Aip(C20105A7j a7j, long j, boolean z, boolean z2) {
        this.A01 = a7j;
        this.A00 = j;
        this.A02 = z;
        this.A03 = z2;
    }
}
