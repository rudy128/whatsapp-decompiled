package X;

import com.whatsapp.gallery.GalleryTabHostFragment;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* renamed from: X.7wL  reason: invalid class name */
public final class AnonymousClass7wL extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ Set $badUris;
    public final /* synthetic */ AnonymousClass1BI $chatJid;
    public final /* synthetic */ List $uris;
    public final /* synthetic */ GalleryTabHostFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7wL(GalleryTabHostFragment galleryTabHostFragment, AnonymousClass1BI r3, List list, Set set) {
        super(0);
        this.$badUris = set;
        this.this$0 = galleryTabHostFragment;
        this.$chatJid = r3;
        this.$uris = list;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        if (!this.$badUris.isEmpty()) {
            GalleryTabHostFragment galleryTabHostFragment = this.this$0;
            AnonymousClass1KB r7 = galleryTabHostFragment.A06;
            if (r7 != null) {
                C18000vb r6 = galleryTabHostFragment.A0C;
                if (r6 != null) {
                    long size = (long) this.$badUris.size();
                    r7.A0G(r6.A0K(new Object[]{C17880vN.A0n(this.$badUris.size())}, 2131755367, size), 0);
                } else {
                    str = "whatsAppLocale";
                }
            } else {
                str = "globalUI";
            }
            C18070vi.A11(str);
            throw null;
        }
        GalleryTabHostFragment galleryTabHostFragment2 = this.this$0;
        AnonymousClass1BI r5 = this.$chatJid;
        List list = this.$uris;
        Set set = this.$badUris;
        ArrayList A13 = AnonymousClass000.A13();
        for (Object next : list) {
            AnonymousClass3MZ.A1V(next, A13, set.contains(next) ? 1 : 0);
        }
        AnonymousClass7P3 r1 = new AnonymousClass7P3(galleryTabHostFragment2, r5, A13, 1);
        AnonymousClass25J r0 = C29681ch.A03;
        if (!(r5 instanceof C29681ch) || r5 == null) {
            r1.Bq8();
        } else {
            AnonymousClass00H r02 = galleryTabHostFragment2.A0a;
            if (r02 != null) {
                galleryTabHostFragment2.A1D();
                ((C86064Qa) r02.get()).A00(r5, r1);
            } else {
                str = "wamoSubBottomSheetHelper";
                C18070vi.A11(str);
                throw null;
            }
        }
        return C27621Wu.A00;
    }
}
