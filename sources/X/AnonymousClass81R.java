package X;

import com.whatsapp.storage.StorageUsageMediaGalleryFragment;

/* renamed from: X.81R  reason: invalid class name */
public final class AnonymousClass81R extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ StorageUsageMediaGalleryFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass81R(StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment) {
        super(1);
        this.this$0 = storageUsageMediaGalleryFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C1598185z r4 = (C1598185z) obj;
        if (C18070vi.A18(r4, C145737Mk.A00)) {
            this.this$0.A2F(false, true);
        } else if (r4 instanceof C145727Mj) {
            StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment = this.this$0;
            storageUsageMediaGalleryFragment.A01 += ((C145727Mj) r4).A00;
            storageUsageMediaGalleryFragment.A2B();
            this.this$0.A2C();
        }
        return C27621Wu.A00;
    }
}
