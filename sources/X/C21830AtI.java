package X;

import android.bluetooth.BluetoothSocket;

/* renamed from: X.AtI  reason: case insensitive filesystem */
public final class C21830AtI extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ BluetoothSocket $socket;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21830AtI(BluetoothSocket bluetoothSocket) {
        super(0);
        this.$socket = bluetoothSocket;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        CCR.A00(this.$socket);
        C26294Cx6.A06("lam:LinkedDeviceManager", "Bluetooth socket closed safely");
        return C27621Wu.A00;
    }
}
