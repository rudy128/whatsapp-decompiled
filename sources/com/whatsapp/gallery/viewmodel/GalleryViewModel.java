package com.whatsapp.gallery.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass11P;
import X.AnonymousClass1CL;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass1OB;
import X.AnonymousClass3MW;
import X.AnonymousClass40L;
import X.C17900vP;
import X.C18070vi;
import X.C18600wl;
import X.C42621yT;
import java.util.List;
import java.util.concurrent.CancellationException;

public final class GalleryViewModel extends AnonymousClass1J2 {
    public C42621yT A00;
    public C42621yT A01;
    public AnonymousClass1OB A02;
    public AnonymousClass1OB A03;
    public final AnonymousClass1DT A04 = AnonymousClass3MW.A0L();
    public final AnonymousClass1CL A05;
    public final AnonymousClass00H A06;
    public final C18600wl A07;
    public final AnonymousClass11P A08;

    public void A0S() {
        AnonymousClass1OB r0 = this.A02;
        if (r0 != null) {
            r0.BEM((CancellationException) null);
        }
        AnonymousClass1OB r02 = this.A03;
        if (r02 != null) {
            r02.BEM((CancellationException) null);
        }
    }

    public GalleryViewModel(AnonymousClass11P r2, AnonymousClass1CL r3, AnonymousClass00H r4, C18600wl r5) {
        C18070vi.A0s(r2, r4, r3, r5);
        this.A08 = r2;
        this.A06 = r4;
        this.A05 = r3;
        this.A07 = r5;
    }

    public static final int A00(GalleryViewModel galleryViewModel, List list, int i) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("GalleryViewModel/report bucket/");
        A10.append(i);
        A10.append('/');
        C17900vP.A0o(A10, list.size());
        galleryViewModel.A04.A0E(new AnonymousClass40L(list, i));
        return list.size();
    }
}
