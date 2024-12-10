package X;

import com.whatsapp.gallery.MediaGalleryFragmentBase;

/* renamed from: X.7ln  reason: invalid class name and case insensitive filesystem */
public final class C151127ln extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ MediaGalleryFragmentBase this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C151127ln(MediaGalleryFragmentBase mediaGalleryFragmentBase) {
        super(0);
        this.this$0 = mediaGalleryFragmentBase;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        MediaGalleryFragmentBase mediaGalleryFragmentBase = this.this$0;
        C1600686z r1 = mediaGalleryFragmentBase.A0D;
        if (r1 != null) {
            C18000vb r0 = mediaGalleryFragmentBase.A0E;
            if (r0 != null) {
                return r1.BRx(r0);
            }
            str = "whatsAppLocale";
        } else {
            str = "monthYearFormat";
        }
        C18070vi.A11(str);
        throw null;
    }
}
