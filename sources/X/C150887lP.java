package X;

import com.whatsapp.gallery.GalleryTabHostFragment;

/* renamed from: X.7lP  reason: invalid class name and case insensitive filesystem */
public final class C150887lP extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ GalleryTabHostFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C150887lP(GalleryTabHostFragment galleryTabHostFragment) {
        super(0);
        this.this$0 = galleryTabHostFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        GalleryTabHostFragment galleryTabHostFragment = this.this$0;
        AnonymousClass10I r7 = galleryTabHostFragment.A0L;
        if (r7 != null) {
            C18030ve r2 = galleryTabHostFragment.A0D;
            if (r2 != null) {
                C26521Sl r6 = galleryTabHostFragment.A0K;
                if (r6 != null) {
                    C34501ka r4 = galleryTabHostFragment.A0F;
                    if (r4 != null) {
                        AnonymousClass73D r3 = galleryTabHostFragment.A0k;
                        C18010vc r5 = galleryTabHostFragment.A0I;
                        if (r5 != null) {
                            AnonymousClass11C r1 = galleryTabHostFragment.A09;
                            if (r1 != null) {
                                AnonymousClass00H r8 = galleryTabHostFragment.A0W;
                                if (r8 != null) {
                                    return new C139266yY(r1, r2, r3, r4, r5, r6, r7, r8);
                                }
                                str = "videoMetaFactory";
                            } else {
                                str = "systemServices";
                            }
                        } else {
                            str = "sharedPreferencesFactory";
                        }
                    } else {
                        str = "mediaFileTypeUtils";
                    }
                } else {
                    str = "mediaFileUtils";
                }
            } else {
                AnonymousClass3MW.A1A();
                throw null;
            }
        } else {
            str = "waWorkers";
        }
        C18070vi.A11(str);
        throw null;
    }
}
