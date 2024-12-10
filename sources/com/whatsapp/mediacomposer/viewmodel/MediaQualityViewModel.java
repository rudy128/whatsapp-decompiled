package com.whatsapp.mediacomposer.viewmodel;

import X.AnonymousClass00H;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.C108945cZ;
import X.C139506yx;
import X.C17880vN;
import X.C18070vi;
import X.C18600wl;
import X.C30391dr;
import X.C37361pP;
import X.C41561wd;
import android.content.Context;
import com.whatsapp.gallery.GalleryTabHostFragment;
import com.whatsapp.mediacomposer.MediaComposerActivity;
import java.util.Collection;
import java.util.HashSet;

public final class MediaQualityViewModel extends AnonymousClass1J2 {
    public final AnonymousClass1DT A00 = AnonymousClass3MW.A0M(C17880vN.A12());
    public final AnonymousClass1DT A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final C18600wl A05;

    public final void A0W(Context context, Collection collection, boolean z) {
        boolean z2 = z;
        boolean A032 = C108945cZ.A0j(this.A02).A03(z);
        boolean A002 = C139506yx.A00(this.A04);
        if (A032 || A002) {
            AnonymousClass3MW.A1X(this.A05, new MediaQualityViewModel$checkMediaQuality$1(context, this, collection, (C30391dr) null, A032, z2, A002), C41561wd.A00(this));
        }
    }

    public static int A00(GalleryTabHostFragment galleryTabHostFragment) {
        return ((MediaQualityViewModel) galleryTabHostFragment.A0x.getValue()).A0T();
    }

    public static Integer A03(MediaComposerActivity mediaComposerActivity) {
        return Integer.valueOf(mediaComposerActivity.A0j.A0T());
    }

    public final int A0T() {
        Number A1C = C108945cZ.A1C(this.A01);
        if (A1C == null) {
            return 0;
        }
        return A1C.intValue();
    }

    public final HashSet A0U() {
        HashSet hashSet = (HashSet) this.A00.A06();
        if (hashSet == null) {
            return C17880vN.A12();
        }
        return hashSet;
    }

    public final void A0V() {
        int i;
        AnonymousClass1DT r2 = this.A01;
        Number A1C = C108945cZ.A1C(r2);
        if (A1C == null || A1C.intValue() != 3) {
            i = 3;
        } else {
            i = AnonymousClass3MY.A0f();
        }
        r2.A0F(i);
    }

    public MediaQualityViewModel(C37361pP r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, C18600wl r7) {
        C18070vi.A0w(r4, r5, r6, r7, r3);
        this.A02 = r4;
        this.A04 = r5;
        this.A03 = r6;
        this.A05 = r7;
        this.A01 = r3.A00(AnonymousClass3MY.A0f(), "arg_media_quality");
    }
}
