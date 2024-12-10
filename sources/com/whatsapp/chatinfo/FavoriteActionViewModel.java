package com.whatsapp.chatinfo;

import X.AnonymousClass1BI;
import X.AnonymousClass1DT;
import X.AnonymousClass1J2;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.C18070vi;
import X.C18600wl;
import X.C30391dr;
import X.C41561wd;
import com.whatsapp.favorite.FavoriteManager;

public final class FavoriteActionViewModel extends AnonymousClass1J2 {
    public final AnonymousClass1DT A00 = AnonymousClass3MW.A0M(1);
    public final FavoriteManager A01;
    public final C18600wl A02;

    public FavoriteActionViewModel(FavoriteManager favoriteManager, C18600wl r3) {
        C18070vi.A0e(favoriteManager, 1, r3);
        this.A01 = favoriteManager;
        this.A02 = r3;
    }

    public final void A0T(AnonymousClass1BI r5) {
        if (r5 == null) {
            AnonymousClass3MX.A1K(this.A00, 1);
            return;
        }
        AnonymousClass3MW.A1X(this.A02, new FavoriteActionViewModel$checkState$1(this, r5, (C30391dr) null), C41561wd.A00(this));
    }
}
