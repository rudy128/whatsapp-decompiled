package com.whatsapp.gallery.viewmodel;

import X.AnonymousClass00H;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass1OB;
import X.AnonymousClass3MX;
import X.AnonymousClass856;
import X.C108945cZ;
import X.C18070vi;
import X.C18600wl;
import X.C201811d;
import X.C30391dr;
import X.C30451dy;
import java.util.concurrent.CancellationException;

public final class MediaGalleryFragmentViewModel extends AnonymousClass1J2 {
    public AnonymousClass1OB A00;
    public AnonymousClass1OB A01;
    public AnonymousClass1OB A02;
    public AnonymousClass1OB A03;
    public final AnonymousClass1DT A04 = C108945cZ.A0S();
    public final AnonymousClass00H A05 = C201811d.A00(65561);
    public final AnonymousClass00H A06 = C201811d.A00(65562);
    public final AnonymousClass00H A07;
    public final C18600wl A08;
    public final C18600wl A09;

    public static final Object A00(AnonymousClass856 r3, MediaGalleryFragmentViewModel mediaGalleryFragmentViewModel, C30391dr r5) {
        return AnonymousClass3MX.A13(C30451dy.A00(r5, mediaGalleryFragmentViewModel.A09, new MediaGalleryFragmentViewModel$notifyGalleryState$2(r3, mediaGalleryFragmentViewModel, (C30391dr) null)));
    }

    public final void A0T() {
        AnonymousClass1OB r0 = this.A03;
        if (r0 != null) {
            r0.BEM((CancellationException) null);
        }
        AnonymousClass1OB r02 = this.A02;
        if (r02 != null) {
            r02.BEM((CancellationException) null);
        }
        AnonymousClass1OB r03 = this.A01;
        if (r03 != null) {
            r03.BEM((CancellationException) null);
        }
        AnonymousClass1OB r04 = this.A00;
        if (r04 != null) {
            r04.BEM((CancellationException) null);
        }
    }

    public MediaGalleryFragmentViewModel(AnonymousClass00H r2, C18600wl r3, C18600wl r4) {
        C18070vi.A0o(r2, r3, r4);
        this.A07 = r2;
        this.A08 = r3;
        this.A09 = r4;
    }

    public void A0S() {
        A0T();
    }
}
