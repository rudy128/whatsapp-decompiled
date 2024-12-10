package com.whatsapp.mediacomposer;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass2E5;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MZ;
import X.C000200d;
import X.C008703w;
import X.C008903z;
import X.C108965cb;
import X.C109005cf;
import X.C36241nZ;
import X.C72453Mb;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.LayoutInflater;

public abstract class Hilt_ImageComposerFragment extends MediaComposerFragment {
    public ContextWrapper A00;
    public boolean A01;
    public boolean A02 = false;

    private void A0C() {
        if (this.A00 == null) {
            this.A00 = AnonymousClass3MW.A0t(super.A1n(), this);
            this.A01 = C008703w.A00(super.A1n());
        }
    }

    public void A25() {
        if (this instanceof Hilt_StickerComposerFragment) {
            Hilt_StickerComposerFragment hilt_StickerComposerFragment = (Hilt_StickerComposerFragment) this;
            if (!hilt_StickerComposerFragment.A00) {
                hilt_StickerComposerFragment.A00 = true;
                C008903z A0S = AnonymousClass3MX.A0S(hilt_StickerComposerFragment);
                StickerComposerFragment stickerComposerFragment = (StickerComposerFragment) hilt_StickerComposerFragment;
                C36241nZ r3 = (C36241nZ) A0S;
                AnonymousClass10E r2 = r3.A2Q;
                AnonymousClass10G r1 = r2.A00;
                C109005cf.A0Z(r3, r2, r1, stickerComposerFragment);
                C109005cf.A0g(r2, r1, stickerComposerFragment);
                stickerComposerFragment.A0Q = C108965cb.A0a(r2);
                C109005cf.A0a(r3, r2, r1, stickerComposerFragment, r2.AAP);
                stickerComposerFragment.A03 = C108965cb.A0K(r2);
                stickerComposerFragment.A02 = C108965cb.A0G(r2);
                stickerComposerFragment.A04 = (AnonymousClass2E5) r1.ABG.get();
                stickerComposerFragment.A09 = AnonymousClass3MZ.A1B(r2);
                stickerComposerFragment.A08 = r3.A1N;
                stickerComposerFragment.A02 = C000200d.A00(r1.AHk);
            }
        } else if (!this.A02) {
            this.A02 = true;
            ImageComposerFragment imageComposerFragment = (ImageComposerFragment) this;
            C36241nZ r4 = (C36241nZ) AnonymousClass3MX.A0S(this);
            AnonymousClass10E r22 = r4.A2Q;
            AnonymousClass10G r12 = r22.A00;
            C109005cf.A0Z(r4, r22, r12, imageComposerFragment);
            C109005cf.A0g(r22, r12, imageComposerFragment);
            imageComposerFragment.A0Q = C108965cb.A0a(r22);
            C109005cf.A0a(r4, r22, r12, imageComposerFragment, r22.AAP);
            imageComposerFragment.A03 = C108965cb.A0K(r22);
            imageComposerFragment.A02 = C108965cb.A0G(r22);
            imageComposerFragment.A04 = (AnonymousClass2E5) r12.ABG.get();
            imageComposerFragment.A09 = AnonymousClass3MZ.A1B(r22);
            imageComposerFragment.A08 = r4.A1N;
        }
    }

    public Context A1n() {
        if (super.A1n() == null && !this.A01) {
            return null;
        }
        A0C();
        return this.A00;
    }

    public LayoutInflater A1o(Bundle bundle) {
        return C72453Mb.A0Q(super.A1o(bundle), this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000c, code lost:
        if (r1 == r3) goto L_0x000e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1p(android.app.Activity r3) {
        /*
            r2 = this;
            super.A1p(r3)
            android.content.ContextWrapper r0 = r2.A00
            if (r0 == 0) goto L_0x000e
            android.content.Context r1 = X.C008803x.A00(r0)
            r0 = 0
            if (r1 != r3) goto L_0x000f
        L_0x000e:
            r0 = 1
        L_0x000f:
            X.AnonymousClass3MY.A1Z(r0)
            r2.A0C()
            r2.A25()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.mediacomposer.Hilt_ImageComposerFragment.A1p(android.app.Activity):void");
    }

    public void A1x(Context context) {
        super.A1x(context);
        A0C();
        A25();
    }
}
