package X;

import androidx.fragment.app.Fragment;
import com.whatsapp.storage.StorageUsageDeleteMessagesDialogFragment;
import com.whatsapp.storage.StorageUsageGalleryActivity;
import com.whatsapp.util.Log;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.49C  reason: invalid class name */
public class AnonymousClass49C extends A34 {
    public final C42621yT A00;
    public final C106845Xk A01;
    public final AnonymousClass1ST A02;
    public final HashMap A03 = C17880vN.A11();

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        StorageUsageDeleteMessagesDialogFragment A002;
        AnonymousClass1GP A1E;
        Collection collection = (Collection) obj;
        C95474mI r1 = (C95474mI) this.A01;
        if (r1.A00 != 0) {
            StorageUsageGalleryActivity storageUsageGalleryActivity = (StorageUsageGalleryActivity) r1.A01;
            Log.i("StorageUsageGalleryActivity/load duplicate messages/loaded");
            StorageUsageGalleryActivity.A03(storageUsageGalleryActivity);
            A002 = StorageUsageDeleteMessagesDialogFragment.A00(new C97894qE(storageUsageGalleryActivity, 1), (Collection) r1.A02, collection);
            A1E = storageUsageGalleryActivity.getSupportFragmentManager();
        } else {
            Fragment fragment = (Fragment) r1.A02;
            A002 = StorageUsageDeleteMessagesDialogFragment.A00(new C97894qE(fragment, 0), (Collection) r1.A01, collection);
            AnonymousClass1FL A1B = fragment.A1B();
            if (A1B != null && !A1B.isFinishing()) {
                A1E = fragment.A1E();
            } else {
                return;
            }
        }
        A002.A2C(A1E, (String) null);
    }

    public AnonymousClass49C(C42621yT r5, C106845Xk r6, AnonymousClass1ST r7, Collection collection) {
        File file;
        this.A02 = r7;
        this.A00 = r5;
        this.A01 = r6;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            AnonymousClass206 A0Y = C17880vN.A0Y(it);
            if (A0Y instanceof AnonymousClass21V) {
                AnonymousClass21V r1 = (AnonymousClass21V) A0Y;
                String str = r1.A05;
                C62572rc r0 = r1.A02;
                if (r0 != null) {
                    file = r0.A0G;
                } else {
                    file = null;
                }
                if (!(str == null || file == null)) {
                    this.A03.put(str, file);
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        ArrayList A13 = AnonymousClass000.A13();
        Iterator A0i = C17890vO.A0i(this.A03);
        while (A0i.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A0i);
            A13.addAll(this.A02.A0C(this.A00, (File) A16.getValue(), (String) A16.getKey()));
        }
        return A13;
    }
}
