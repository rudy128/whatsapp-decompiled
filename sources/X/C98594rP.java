package X;

import android.os.Bundle;
import com.whatsapp.backup.google.RestoreFromBackupActivity;
import com.whatsapp.storage.Hilt_StorageUsageDeleteCompleteDialogFragment;
import com.whatsapp.storage.StorageUsageGalleryActivity;
import com.whatsapp.util.Log;

/* renamed from: X.4rP  reason: invalid class name and case insensitive filesystem */
public class C98594rP implements Runnable {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final Object A04;

    public C98594rP(Object obj, int i, int i2, long j, long j2) {
        this.A00 = i2;
        this.A04 = obj;
        this.A01 = i;
        this.A02 = j;
        this.A03 = j2;
    }

    public final void run() {
        switch (this.A00) {
            case 0:
                return;
            case 1:
                int i = this.A01;
                long j = this.A02;
                long j2 = this.A03;
                RestoreFromBackupActivity restoreFromBackupActivity = ((C167518gV) this.A04).A01;
                if (!RestoreFromBackupActivity.A19(restoreFromBackupActivity)) {
                    restoreFromBackupActivity.A01.setIndeterminate(false);
                    restoreFromBackupActivity.A01.setProgress(i);
                    AnonymousClass3MY.A0y(restoreFromBackupActivity, restoreFromBackupActivity.A03, new Object[]{C88584aA.A03(restoreFromBackupActivity.A00, j), C88584aA.A03(restoreFromBackupActivity.A00, j2), restoreFromBackupActivity.A00.A0M().format(((double) i) / 100.0d)}, 2131895896);
                    return;
                }
                Log.i("restore>RestoreFromBackupActivity/observer/activity exited during msgstore download progress");
                return;
            default:
                StorageUsageGalleryActivity storageUsageGalleryActivity = (StorageUsageGalleryActivity) this.A04;
                long j3 = this.A02;
                long j4 = this.A03;
                int i2 = this.A01;
                Log.i("StorageUsageGalleryActivity/message delete completed");
                storageUsageGalleryActivity.CEx();
                if (storageUsageGalleryActivity.A0R != null) {
                    storageUsageGalleryActivity.A02 += j3;
                    StorageUsageGalleryActivity.A0Q(storageUsageGalleryActivity);
                    String str = storageUsageGalleryActivity.A0R;
                    int i3 = storageUsageGalleryActivity.A00;
                    AnonymousClass18K r2 = storageUsageGalleryActivity.A0K;
                    AnonymousClass3Ma.A1O(str, 0, r2);
                    C81653za r1 = new C81653za();
                    C83964Hi.A00(r1, str, 6, i3);
                    r1.A04 = Long.valueOf(j4);
                    r1.A03 = C17880vN.A0n(i2);
                    r2.CC7(r1);
                    AnonymousClass4S9 r0 = storageUsageGalleryActivity.A0D;
                    if (r0 != null) {
                        r0.A03.clear();
                    }
                    AnonymousClass02B r02 = storageUsageGalleryActivity.A05;
                    if (r02 != null) {
                        r02.A05();
                    }
                    if (j4 > 0) {
                        Hilt_StorageUsageDeleteCompleteDialogFragment hilt_StorageUsageDeleteCompleteDialogFragment = new Hilt_StorageUsageDeleteCompleteDialogFragment();
                        Bundle A0D = C17880vN.A0D();
                        A0D.putLong("deleted_disk_size", j4);
                        hilt_StorageUsageDeleteCompleteDialogFragment.A1R(A0D);
                        C72453Mb.A1I(hilt_StorageUsageDeleteCompleteDialogFragment, storageUsageGalleryActivity);
                    }
                }
                storageUsageGalleryActivity.A0P = null;
                return;
        }
    }
}
