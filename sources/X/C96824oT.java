package X;

import com.whatsapp.gallery.GalleryTabHostFragment;
import com.whatsapp.gallery.viewmodel.GalleryTabsViewModel;
import com.whatsapp.mentions.MentionableEntry;

/* renamed from: X.4oT  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C96824oT implements AnonymousClass5a8 {
    public final /* synthetic */ GalleryTabHostFragment A00;
    public final /* synthetic */ MentionableEntry A01;

    public final void Bo6(boolean z) {
        GalleryTabHostFragment galleryTabHostFragment = this.A00;
        MentionableEntry mentionableEntry = this.A01;
        if (!z) {
            ((GalleryTabsViewModel) galleryTabHostFragment.A0o.getValue()).A02 = mentionableEntry.getMentions();
        }
    }

    public /* synthetic */ C96824oT(GalleryTabHostFragment galleryTabHostFragment, MentionableEntry mentionableEntry) {
        this.A00 = galleryTabHostFragment;
        this.A01 = mentionableEntry;
    }
}
