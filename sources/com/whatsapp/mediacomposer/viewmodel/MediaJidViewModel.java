package com.whatsapp.mediacomposer.viewmodel;

import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass3MW;
import X.AnonymousClass6UD;
import X.AnonymousClass87Y;
import X.C131126kY;
import X.C17880vN;
import X.C72473Md;
import com.whatsapp.gallery.GalleryTabHostFragment;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import java.util.List;

public final class MediaJidViewModel extends AnonymousClass1J2 {
    public final AnonymousClass1DT A00;
    public final AnonymousClass6UD A01;
    public final AnonymousClass87Y A02;

    public static C131126kY A00(GalleryTabHostFragment galleryTabHostFragment) {
        return ((MediaJidViewModel) galleryTabHostFragment.A0w.getValue()).A0T();
    }

    public static C131126kY A03(MediaComposerActivity mediaComposerActivity) {
        return mediaComposerActivity.A0i.A0T();
    }

    public static List A04(MediaComposerActivity mediaComposerActivity) {
        return mediaComposerActivity.A0i.A0T().A06;
    }

    public final C131126kY A0T() {
        Object A06 = this.A00.A06();
        if (A06 != null) {
            return (C131126kY) A06;
        }
        throw C17880vN.A0g();
    }

    public final void A0U(List list) {
        List list2;
        AnonymousClass1DT r2 = this.A00;
        C131126kY r0 = (C131126kY) r2.A06();
        if (r0 != null) {
            list2 = r0.A05;
        } else {
            list2 = list;
        }
        C131126kY BGY = this.A02.BGY(list, list2);
        this.A01.A00 = BGY;
        r2.A0F(BGY);
    }

    public MediaJidViewModel(AnonymousClass6UD r2, AnonymousClass87Y r3, List list) {
        C72473Md.A1I(r3, r2);
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = AnonymousClass3MW.A0M(r3.BGY(list, list));
    }
}
