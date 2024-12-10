package X;

/* renamed from: X.DqU  reason: case insensitive filesystem */
public final class C28054DqU extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ BTW $linkSecurity;
    public final /* synthetic */ AnonymousClass1OS $success;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C28054DqU(BTW btw, AnonymousClass1OS r3) {
        super(1);
        this.$success = r3;
        this.$linkSecurity = btw;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C26294Cx6.A06("lam:LinkedAppManager", AnonymousClass001.A1E(obj, "getDeviceConfig: linkedDeviceConfig=", C18070vi.A0K(obj)));
        this.$success.invoke(obj, this.$linkSecurity);
        return C27621Wu.A00;
    }
}
