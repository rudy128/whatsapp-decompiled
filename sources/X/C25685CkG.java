package X;

import android.bluetooth.BluetoothGattServer;
import android.bluetooth.BluetoothManager;
import android.content.Context;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: X.CkG  reason: case insensitive filesystem */
public final class C25685CkG {
    public static final UUID A07 = UUID.fromString("00002902-0000-1000-8000-00805f9b34fb");
    public static final UUID A08 = UUID.fromString("c2fc1204-bdbf-40ac-9b70-df64a14c43df");
    public BluetoothGattServer A00;
    public final BluetoothManager A01;
    public final Context A02;
    public final C22582BEg A03 = new C22582BEg(this);
    public final Set A04 = C17880vN.A14();
    public final Executor A05;
    public final byte[] A06 = new byte[2];

    public C25685CkG(BluetoothManager bluetoothManager, Context context, Executor executor) {
        this.A02 = context;
        this.A01 = bluetoothManager;
        this.A05 = executor;
    }

    public final void A00(C22821Di r3) {
        BluetoothGattServer bluetoothGattServer = this.A00;
        if (bluetoothGattServer != null) {
            this.A00 = null;
            try {
                bluetoothGattServer.close();
            } catch (Throwable th) {
                C30691eM.A00(th);
            }
            r3.invoke(this);
            return;
        }
        r3.invoke((Object) null);
    }
}
