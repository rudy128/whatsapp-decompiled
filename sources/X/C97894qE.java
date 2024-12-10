package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.whatsapp.storage.Hilt_StorageUsageDeleteCompleteDialogFragment;
import com.whatsapp.storage.StorageUsageGalleryActivity;
import com.whatsapp.util.Log;

/* renamed from: X.4qE  reason: invalid class name and case insensitive filesystem */
public class C97894qE implements C107675aP {
    public final int A00;
    public final Object A01;

    public C97894qE(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void Br9(long j, int i, long j2) {
        long j3 = j2;
        if (this.A00 != 0) {
            StorageUsageGalleryActivity storageUsageGalleryActivity = (StorageUsageGalleryActivity) this.A01;
            Log.i("StorageUsageGalleryActivity/message delete started");
            storageUsageGalleryActivity.A0P = new C98594rP(storageUsageGalleryActivity, i, 2, j, j3);
            if (i > 0) {
                storageUsageGalleryActivity.A0T.postDelayed(storageUsageGalleryActivity.A0U, 800);
                return;
            }
            return;
        }
        Hilt_StorageUsageDeleteCompleteDialogFragment hilt_StorageUsageDeleteCompleteDialogFragment = new Hilt_StorageUsageDeleteCompleteDialogFragment();
        Bundle A0D = C17880vN.A0D();
        A0D.putLong("deleted_disk_size", j2);
        hilt_StorageUsageDeleteCompleteDialogFragment.A1R(A0D);
        hilt_StorageUsageDeleteCompleteDialogFragment.A2C(((Fragment) this.A01).A1E(), (String) null);
    }
}
