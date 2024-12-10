package com.whatsapp.avatar.privacy;

import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass1FB;
import X.AnonymousClass1UN;
import X.AnonymousClass3gA;
import X.C72473Md;
import X.C72483Me;
import X.C90994ey;

public final class AvatarStickerPrivacySettings extends AnonymousClass3gA {
    public AnonymousClass1UN A00;
    public boolean A01;

    public AvatarStickerPrivacySettings() {
        this(0);
    }

    public void A2y() {
        if (!this.A01) {
            this.A01 = true;
            AnonymousClass10E A0L = C72473Md.A0L(this);
            C72483Me.A0q(A0L, this);
            AnonymousClass10G r1 = A0L.A00;
            AnonymousClass1FB.A0K(A0L, r1, this, r1.A45);
            AnonymousClass1FB.A0L(A0L, r1, this, r1.A5A);
            AnonymousClass3gA.A0V(A0L, r1, this);
            this.A00 = (AnonymousClass1UN) A0L.A72.get();
        }
    }

    public AvatarStickerPrivacySettings(int i) {
        this.A01 = false;
        C90994ey.A00(this, 11);
    }
}
