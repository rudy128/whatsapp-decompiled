package X;

import java.util.UUID;

/* renamed from: X.Doo  reason: case insensitive filesystem */
public final class C27952Doo extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C22821Di $onDeviceRemoved;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27952Doo(C22821Di r2) {
        super(1);
        this.$onDeviceRemoved = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C26127Csp csp = (C26127Csp) obj;
        C18070vi.A0d(csp, 0);
        this.$onDeviceRemoved.invoke(new C22871BTf(csp, (C22868BTc) null, (UUID) null));
        return C27621Wu.A00;
    }
}
