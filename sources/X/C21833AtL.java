package X;

import java.net.Socket;

/* renamed from: X.AtL  reason: case insensitive filesystem */
public final class C21833AtL extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ Socket $this_apply;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21833AtL(Socket socket) {
        super(0);
        this.$this_apply = socket;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        CCR.A00(this.$this_apply);
        C26294Cx6.A06("lam:LinkedDeviceManager", "TCP socket closed safely");
        return C27621Wu.A00;
    }
}
