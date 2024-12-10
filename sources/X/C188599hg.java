package X;

import android.bluetooth.BluetoothManager;
import android.content.Context;
import java.util.ArrayDeque;
import java.util.UUID;
import java.util.concurrent.Executor;

/* renamed from: X.9hg  reason: invalid class name and case insensitive filesystem */
public final class C188599hg {
    public C26127Csp A00;
    public final BluetoothManager A01;
    public final C70713Cf A02;
    public final CCP A03;
    public final C25685CkG A04;
    public final C183789Zp A05;
    public final ArrayDeque A06 = new ArrayDeque();
    public final UUID A07;
    public final Executor A08;
    public final C22821Di A09;
    public final C22821Di A0A;
    public final AnonymousClass1OS A0B;
    public final Context A0C;

    public C188599hg(BluetoothManager bluetoothManager, Context context, CCP ccp, UUID uuid, Executor executor, C22821Di r8, C22821Di r9, AnonymousClass1OS r10) {
        C108965cb.A1P(uuid, 4, ccp);
        this.A0C = context;
        this.A01 = bluetoothManager;
        this.A08 = executor;
        this.A07 = uuid;
        this.A09 = r8;
        this.A0A = r9;
        this.A0B = r10;
        this.A03 = ccp;
        this.A05 = new C183789Zp(bluetoothManager, executor);
        this.A04 = new C25685CkG(bluetoothManager, context, executor);
        this.A02 = new C70713Cf(uuid, this, 20);
    }
}
