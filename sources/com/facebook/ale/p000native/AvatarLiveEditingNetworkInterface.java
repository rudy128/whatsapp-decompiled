package com.facebook.ale.p000native;

import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass8BX;
import X.C18070vi;
import X.C26652D8b;
import X.C27170DXf;
import X.C27171DXg;
import X.C27442DfT;
import X.C27446DfX;
import X.C27936DoY;
import X.C27937DoZ;
import X.C27938Doa;
import X.C27939Dob;
import X.C30391dr;
import X.E0W;
import com.whatsapp.productinfra.avatar.liveediting.network.LiveEditingNetworkInterfaceImpl$makeCDNRequest$1;
import com.whatsapp.productinfra.avatar.liveediting.network.LiveEditingNetworkInterfaceImpl$makeCancellableCDNRequest$job$1;
import com.whatsapp.productinfra.avatar.liveediting.network.LiveEditingNetworkInterfaceImpl$makeGraphQLRequest$1;

/* renamed from: com.facebook.ale.native.AvatarLiveEditingNetworkInterface  reason: invalid package */
public final class AvatarLiveEditingNetworkInterface {
    public final E0W avatarLiveEditingNetworkInterface;

    public AvatarLiveEditingNetworkInterface(E0W e0w) {
        C18070vi.A0d(e0w, 1);
        this.avatarLiveEditingNetworkInterface = e0w;
    }

    public final boolean makeCDNRequest(String str, ResponseCallback responseCallback) {
        boolean A16 = C18070vi.A16(str, responseCallback);
        E0W e0w = this.avatarLiveEditingNetworkInterface;
        C27936DoY doY = new C27936DoY(responseCallback);
        C27937DoZ doZ = new C27937DoZ(responseCallback);
        C26652D8b d8b = (C26652D8b) e0w;
        AnonymousClass3MX.A1Q(new LiveEditingNetworkInterfaceImpl$makeCDNRequest$1(d8b, str, (C30391dr) null, doY, doZ), d8b.A02);
        return A16;
    }

    public final CancellationToken makeCancellableCDNRequest(String str, ResponseCallback responseCallback) {
        boolean A16 = C18070vi.A16(str, responseCallback);
        E0W e0w = this.avatarLiveEditingNetworkInterface;
        C27446DfX dfX = new C27446DfX(responseCallback, A16 ? 1 : 0);
        C27446DfX dfX2 = new C27446DfX(responseCallback, 2);
        C26652D8b d8b = (C26652D8b) e0w;
        return new C27171DXg(new C27170DXf(new C27442DfT(AnonymousClass3MY.A0s(new LiveEditingNetworkInterfaceImpl$makeCancellableCDNRequest$job$1(d8b, str, (C30391dr) null, dfX, dfX2), d8b.A02))));
    }

    public final boolean makeGraphQLRequest(String str, String str2, ResponseCallback responseCallback) {
        boolean A1U = AnonymousClass8BX.A1U(str, str2, responseCallback);
        E0W e0w = this.avatarLiveEditingNetworkInterface;
        C27938Doa doa = new C27938Doa(responseCallback);
        C27939Dob dob = new C27939Dob(responseCallback);
        C26652D8b d8b = (C26652D8b) e0w;
        AnonymousClass3MX.A1Q(new LiveEditingNetworkInterfaceImpl$makeGraphQLRequest$1(d8b, str, str2, (C30391dr) null, dob, doa), d8b.A02);
        return A1U;
    }
}
