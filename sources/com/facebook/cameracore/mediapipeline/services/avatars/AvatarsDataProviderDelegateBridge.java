package com.facebook.cameracore.mediapipeline.services.avatars;

import X.BQb;
import X.BRG;
import X.BRI;
import X.C18070vi;
import X.C24307Bz4;
import X.C24765CJf;
import X.C25050CVe;
import X.C26027Cql;

public class AvatarsDataProviderDelegateBridge {
    public final C24765CJf mDelegate;

    public String getPersonalAvatarUriOverride() {
        return null;
    }

    public void onAvatarRendered() {
        C26027Cql.A00(C24307Bz4.AVATAR_RENDERED, ((BQb) this.mDelegate).A00.A02.A00);
    }

    public void onInitialAvatarColorizationApplied() {
        C26027Cql.A00(C24307Bz4.AVATAR_FIRST_FRAME_COLORIZATION_APPLIED, ((BQb) this.mDelegate).A00.A02.A00);
    }

    public void sendAvatarMemoryCreationSuccess(String str) {
        C18070vi.A0d(str, 0);
        C26027Cql cql = ((BQb) this.mDelegate).A00.A02.A00;
        BRG brg = new BRG(str);
        cql.A03 = brg;
        C25050CVe cVe = cql.A00;
        if (cVe != null) {
            cVe.A00(brg);
        }
        cql.A0D.CPw(brg);
    }

    public void sendAvatarMemoryLoadResult(String str, String str2, boolean z, String str3) {
        C18070vi.A0h(str, str2);
        C18070vi.A0d(str3, 3);
        C26027Cql cql = ((BQb) this.mDelegate).A00.A02.A00;
        BRI bri = new BRI(str, str2, z, str3);
        C25050CVe cVe = cql.A00;
        if (cVe != null) {
            cVe.A00(bri);
        }
        cql.A0D.CPw(bri);
    }

    public void sendAvatarRampUpdateEvent(String str, String str2) {
        C18070vi.A0d(str, 0);
        C26027Cql.A00(C24307Bz4.AVATAR_DYNAMIC_COLOR_APPLIED, ((BQb) this.mDelegate).A00.A02.A00);
    }

    public AvatarsDataProviderDelegateBridge(C24765CJf cJf) {
        this.mDelegate = cJf;
    }

    public byte[] consumeAvatarFrame(String str) {
        return null;
    }

    public String getDefaultAvatarResourcePath(String str) {
        return null;
    }

    public void onLoadFailure(String str) {
    }

    public void onLoadSuccess(String str) {
    }

    public void onAvatarColorizationFailure(String str, String str2) {
    }

    public void sendAvatarFrame(String str, byte[] bArr) {
    }
}
