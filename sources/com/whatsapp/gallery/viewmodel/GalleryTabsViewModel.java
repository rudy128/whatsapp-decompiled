package com.whatsapp.gallery.viewmodel;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass02n;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass3MW;
import X.AnonymousClass7HL;
import X.AnonymousClass8B2;
import X.C108945cZ;
import X.C17880vN;
import X.C18030ve;
import X.C18070vi;
import X.C18460wS;
import X.C18600wl;
import X.C25511Om;
import java.util.List;
import java.util.Set;

public final class GalleryTabsViewModel extends AnonymousClass1J2 {
    public int A00 = -1;
    public AnonymousClass02n A01;
    public List A02 = C18460wS.A00;
    public final AnonymousClass1DT A03 = C108945cZ.A0S();
    public final AnonymousClass1DT A04 = AnonymousClass3MW.A0M(AnonymousClass000.A0h());
    public final AnonymousClass1DT A05 = C108945cZ.A0S();
    public final AnonymousClass1DT A06 = AnonymousClass3MW.A0M(C25511Om.A00);
    public final C18030ve A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final C18600wl A0A;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: X.5gy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v3, resolved type: X.5gy} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v4, resolved type: X.5gy} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0U(X.AnonymousClass1FU r5, int r6, boolean r7) {
        /*
            r4 = this;
            r3 = 0
            if (r7 == 0) goto L_0x000d
            X.0ve r1 = r4.A07
            r0 = 9262(0x242e, float:1.2979E-41)
            boolean r0 = X.C25291Nq.A04(r1, r0)
            if (r0 != 0) goto L_0x0017
        L_0x000d:
            X.0ve r1 = r4.A07
            r0 = 9974(0x26f6, float:1.3977E-41)
            boolean r0 = X.C25291Nq.A04(r1, r0)
            if (r0 == 0) goto L_0x0029
        L_0x0017:
            r0 = 1
            if (r6 > r0) goto L_0x002c
            X.5gx r2 = new X.5gx
            r2.<init>()
            r1 = 5
        L_0x0020:
            X.79c r0 = new X.79c
            r0.<init>(r3, r1)
            X.02n r3 = r5.CDw(r0, r2)
        L_0x0029:
            r4.A01 = r3
            return
        L_0x002c:
            X.5gy r2 = new X.5gy
            r2.<init>(r6)
            r1 = 6
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.gallery.viewmodel.GalleryTabsViewModel.A0U(X.1FU, int, boolean):void");
    }

    public final Set A0T() {
        Object A062 = this.A06.A06();
        if (A062 != null) {
            return (Set) A062;
        }
        throw C17880vN.A0g();
    }

    public final void A0V(AnonymousClass8B2 r5) {
        AnonymousClass1DT r3 = this.A05;
        String A1F = C108945cZ.A1F(this.A03);
        if (A1F == null) {
            A1F = "";
        }
        r3.A0F(new AnonymousClass7HL(r5, A1F, this.A02));
    }

    public GalleryTabsViewModel(C18030ve r2, AnonymousClass00H r3, AnonymousClass00H r4, C18600wl r5) {
        C18070vi.A0s(r2, r3, r4, r5);
        this.A07 = r2;
        this.A09 = r3;
        this.A08 = r4;
        this.A0A = r5;
    }
}
