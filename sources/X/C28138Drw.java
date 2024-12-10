package X;

import com.facebook.wearable.datax.RemoteChannel;

/* renamed from: X.Drw  reason: case insensitive filesystem */
public final class C28138Drw extends AnonymousClass11G implements C22821Di {
    public static final C28138Drw A00 = new C28138Drw();

    public C28138Drw() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        RemoteChannel remoteChannel = (RemoteChannel) obj;
        StringBuilder A0K = C18070vi.A0K(remoteChannel);
        A0K.append("Channel ");
        A0K.append(remoteChannel.getId());
        C26294Cx6.A06("LinkSetup", AnonymousClass000.A0y(" connected", A0K));
        return C27621Wu.A00;
    }
}
