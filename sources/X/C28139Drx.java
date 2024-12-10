package X;

import com.facebook.wearable.datax.RemoteChannel;

/* renamed from: X.Drx  reason: case insensitive filesystem */
public final class C28139Drx extends AnonymousClass11G implements C22821Di {
    public static final C28139Drx A00 = new C28139Drx();

    public C28139Drx() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        RemoteChannel remoteChannel = (RemoteChannel) obj;
        StringBuilder A0K = C18070vi.A0K(remoteChannel);
        A0K.append("Channel ");
        A0K.append(remoteChannel.getId());
        C26294Cx6.A06("LinkSetup", AnonymousClass000.A0y(" disconnected", A0K));
        return C27621Wu.A00;
    }
}
