package X;

import com.whatsapp.gallery.MediaGalleryFragment;
import com.whatsapp.storage.StorageUsageMediaGalleryFragment;

/* renamed from: X.7H9  reason: invalid class name */
public class AnonymousClass7H9 implements AnonymousClass87B {
    public final int A00;
    public final Object A01;

    public AnonymousClass7H9(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final C160878Ah BHY(boolean z) {
        AnonymousClass7H7 r5;
        String str;
        if (this.A00 != 0) {
            StorageUsageMediaGalleryFragment storageUsageMediaGalleryFragment = (StorageUsageMediaGalleryFragment) this.A01;
            AnonymousClass00H r0 = storageUsageMediaGalleryFragment.A09;
            if (r0 != null) {
                AnonymousClass1W6 r8 = (AnonymousClass1W6) C18070vi.A0E(r0);
                AnonymousClass1ST r6 = storageUsageMediaGalleryFragment.A03;
                if (r6 != null) {
                    C32021gV r9 = storageUsageMediaGalleryFragment.A07;
                    if (r9 != null) {
                        r5 = new AnonymousClass65I(r6, storageUsageMediaGalleryFragment.A06, r8, r9, storageUsageMediaGalleryFragment.A03, storageUsageMediaGalleryFragment.A00);
                    } else {
                        str = "messageThumbCache";
                    }
                } else {
                    str = "mediaMessageStore";
                }
            } else {
                str = "fMessageDatabase";
            }
            C18070vi.A11(str);
            throw null;
        }
        MediaGalleryFragment mediaGalleryFragment = (MediaGalleryFragment) this.A01;
        AnonymousClass1W6 A0c = C17880vN.A0c(mediaGalleryFragment.A06);
        r5 = new AnonymousClass7H7(mediaGalleryFragment.A01, mediaGalleryFragment.A04, A0c, mediaGalleryFragment.A05);
        if (r5.A01 == null) {
            AnonymousClass1W6 r4 = r5.A04;
            r5.A01 = new C109335dH(r5.A01(), (C18030ve) null, r5.A03, r4);
        }
        return r5;
    }
}
