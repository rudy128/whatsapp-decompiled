package X;

import com.whatsapp.jid.Jid;
import com.whatsapp.storage.StorageUsageActivity;

/* renamed from: X.79w  reason: invalid class name and case insensitive filesystem */
public class C1425479w implements AnonymousClass86K {
    public final int A00;
    public final Object A01;

    public C1425479w(StorageUsageActivity storageUsageActivity, int i) {
        this.A00 = i;
        this.A01 = storageUsageActivity;
    }

    public final boolean test(Object obj) {
        if (this.A00 != 0) {
            AnonymousClass1BI r5 = (AnonymousClass1BI) obj;
            C18070vi.A0d(r5, 1);
            return StorageUsageActivity.A0r(r5, (StorageUsageActivity) this.A01);
        }
        Jid jid = (Jid) obj;
        C18070vi.A0d(jid, 1);
        int ordinal = ((StorageUsageActivity) this.A01).A0G.ordinal();
        if (ordinal == 2) {
            return C22971Dz.A0V(jid);
        }
        if (ordinal != 1 || !C22971Dz.A0V(jid)) {
            return true;
        }
        return false;
    }
}
