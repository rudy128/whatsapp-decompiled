package X;

import android.os.Handler;
import com.whatsapp.storage.StorageUsageGalleryActivity;
import com.whatsapp.util.Log;
import java.util.Collection;

/* renamed from: X.3vJ  reason: invalid class name and case insensitive filesystem */
public final class C79363vJ extends C95084lf {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C79363vJ(C87794Wz r2) {
        super(r2);
        C18070vi.A0d(r2, 1);
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, X.1yT] */
    public boolean A00(AnonymousClass1FU r7, Collection collection) {
        if (!(r7 instanceof StorageUsageGalleryActivity)) {
            return super.A00(r7, collection);
        }
        StorageUsageGalleryActivity storageUsageGalleryActivity = (StorageUsageGalleryActivity) r7;
        AnonymousClass4S9 r2 = storageUsageGalleryActivity.A0D;
        if (r2 == null || r2.A03.isEmpty()) {
            Log.e("StorageUsageGalleryActivity/dialog/delete no messages");
            return true;
        }
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("StorageUsageGalleryActivity/dialog/delete/");
        C17900vP.A0o(A10, r2.A03.size());
        StorageUsageGalleryActivity.A03(storageUsageGalleryActivity);
        storageUsageGalleryActivity.A06 = new Object();
        Collection values = storageUsageGalleryActivity.A0D.A03.values();
        storageUsageGalleryActivity.A0E = new AnonymousClass49C(storageUsageGalleryActivity.A06, new C95474mI(values, storageUsageGalleryActivity, 1), storageUsageGalleryActivity.A0F, values);
        storageUsageGalleryActivity.A0Q = new AnonymousClass7RQ(storageUsageGalleryActivity, values, 49);
        Handler handler = storageUsageGalleryActivity.A0T;
        handler.postDelayed(storageUsageGalleryActivity.A0V, 800);
        handler.postDelayed(storageUsageGalleryActivity.A0Q, 5000);
        C17890vO.A0u(storageUsageGalleryActivity.A0E, storageUsageGalleryActivity.A05);
        Log.i("StorageUsageGalleryActivity/load duplicate messages");
        return true;
    }
}
