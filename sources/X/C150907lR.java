package X;

import com.whatsapp.gallery.GalleryTabHostFragment;
import java.util.List;

/* renamed from: X.7lR  reason: invalid class name and case insensitive filesystem */
public final class C150907lR extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ GalleryTabHostFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C150907lR(GalleryTabHostFragment galleryTabHostFragment) {
        super(0);
        this.this$0 = galleryTabHostFragment;
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [X.6UD, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object invoke() {
        List list;
        AnonymousClass1BI A02 = AnonymousClass1BI.A00.A02(GalleryTabHostFragment.A0B(this.this$0));
        if (A02 != null) {
            list = C18070vi.A0M(A02);
        } else {
            list = C18460wS.A00;
        }
        AnonymousClass87Y r0 = this.this$0.A0G;
        if (r0 != null) {
            C131126kY BGY = r0.BGY(list, list);
            ? obj = new Object();
            obj.A00 = BGY;
            return obj;
        }
        C18070vi.A11("mediaJidStateFactory");
        throw null;
    }
}
