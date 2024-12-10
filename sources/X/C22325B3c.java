package X;

import java.util.UUID;

/* renamed from: X.B3c  reason: case insensitive filesystem */
public final class C22325B3c extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ C22821Di $failure;
    public final /* synthetic */ UUID $serviceUUID;
    public final /* synthetic */ Cw1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22325B3c(Cw1 cw1, UUID uuid, C22821Di r4) {
        super(2);
        this.this$0 = cw1;
        this.$serviceUUID = uuid;
        this.$failure = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C22868BTc bTc = (C22868BTc) obj;
        Object obj3 = obj2;
        C18070vi.A0h(bTc, obj2);
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("-----------------------------");
        A10.append(10);
        A10.append("Device config retrieved for TCP");
        A10.append(10);
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("Service UUID: ");
        A102.append(bTc.A09);
        AnonymousClass8BS.A1D(A102, A10);
        A10.append(10);
        StringBuilder A103 = AnonymousClass000.A10();
        A103.append("IP Address: ");
        String str = bTc.A08;
        C108985cd.A1L(str, A103, A10);
        A10.append(10);
        StringBuilder A104 = AnonymousClass000.A10();
        A104.append("Firmware Version: ");
        C108985cd.A1L(bTc.A06, A104, A10);
        A10.append(10);
        C26294Cx6.A06("lam:LinkedAppManager", C18070vi.A0H(A10));
        C188599hg r5 = (C188599hg) this.this$0.A0F.get(this.$serviceUUID);
        if (r5 == null) {
            C26294Cx6.A09("lam:LinkedAppManager", "Unable to get current LinkedDeviceManager", (Throwable) null);
            this.$failure.invoke(C24358Bzt.FAILED_TO_CONNECT_SOCKET);
        } else {
            C22094AxY axY = new C22094AxY(this.$failure);
            C26294Cx6.A06("lam:LinkedDeviceManager", AnonymousClass001.A1H("connectSecureTcpSocket ipAddress=", str, AnonymousClass000.A10()));
            r5.A08.execute(new C21456AkN(axY, obj3, r5, str, 3));
        }
        return C27621Wu.A00;
    }
}
