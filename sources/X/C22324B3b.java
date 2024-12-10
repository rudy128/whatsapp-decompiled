package X;

import android.bluetooth.BluetoothAdapter;
import java.util.UUID;

/* renamed from: X.B3b  reason: case insensitive filesystem */
public final class C22324B3b extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ C22821Di $failure;
    public final /* synthetic */ UUID $serviceUUID;
    public final /* synthetic */ Cw1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22324B3b(Cw1 cw1, UUID uuid, C22821Di r4) {
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
        A10.append("Device config retrieved for BTC");
        A10.append(10);
        StringBuilder A102 = AnonymousClass000.A10();
        A102.append("Service UUID: ");
        UUID uuid = bTc.A09;
        A102.append(uuid);
        AnonymousClass8BS.A1D(A102, A10);
        A10.append(10);
        StringBuilder A103 = AnonymousClass000.A10();
        A103.append("BTC Address: ");
        String str = bTc.A01;
        C108985cd.A1L(str, A103, A10);
        A10.append(10);
        StringBuilder A104 = AnonymousClass000.A10();
        A104.append("Firmware Version: ");
        C108985cd.A1L(bTc.A06, A104, A10);
        A10.append(10);
        C26294Cx6.A06("lam:LinkedAppManager", C18070vi.A0H(A10));
        if (str != null) {
            Cw1 cw1 = this.this$0;
            UUID uuid2 = this.$serviceUUID;
            C22821Di r2 = this.$failure;
            C188599hg r5 = (C188599hg) cw1.A0F.get(uuid2);
            if (r5 == null) {
                C26294Cx6.A09("lam:LinkedAppManager", "Unable to get current LinkedDeviceManager", (Throwable) null);
                r2.invoke(C24358Bzt.FAILED_TO_CONNECT_SOCKET);
            } else {
                C22092AxW axW = new C22092AxW(r2);
                BluetoothAdapter adapter = r5.A01.getAdapter();
                if (!adapter.isEnabled()) {
                    C26294Cx6.A09("lam:LinkedDeviceManager", "Bluetooth is not enabled", (Throwable) null);
                    axW.invoke(C24358Bzt.BLUETOOTH_NOT_ENABLED);
                }
                StringBuilder A105 = AnonymousClass000.A10();
                A105.append("Attempting to connect to remote device at ...");
                C26294Cx6.A04("lam:LinkedDeviceManager", AnonymousClass000.A0y(C29361c9.A0Z(str, 6), A105));
                r5.A08.execute(new C21463AkU(adapter, axW, r5, uuid, obj3, str, 1));
            }
        }
        return C27621Wu.A00;
    }
}
