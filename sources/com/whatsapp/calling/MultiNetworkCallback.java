package com.whatsapp.calling;

import X.AnonymousClass7RK;
import X.C146847Qv;
import X.C18070vi;
import X.C20075A6b;

public final class MultiNetworkCallback {
    public final C20075A6b provider;

    public MultiNetworkCallback(C20075A6b a6b) {
        C18070vi.A0d(a6b, 1);
        this.provider = a6b;
    }

    public final void closeAlternativeSocket(boolean z) {
        C20075A6b a6b = this.provider;
        a6b.A07.execute(new AnonymousClass7RK(a6b, 14, z));
    }

    public final void createAlternativeSocket(boolean z, boolean z2) {
        C20075A6b a6b = this.provider;
        a6b.A07.execute(new C146847Qv(a6b, 2, z, z2));
    }
}
