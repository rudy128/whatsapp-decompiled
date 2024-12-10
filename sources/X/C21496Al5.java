package X;

import com.whatsapp.jid.DeviceJid;
import java.util.concurrent.Callable;

/* renamed from: X.Al5  reason: case insensitive filesystem */
public final /* synthetic */ class C21496Al5 implements Callable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C20111A7t A02;
    public final /* synthetic */ DeviceJid A03;
    public final /* synthetic */ String A04;

    public final Object call() {
        return C20111A7t.A02(this.A02, this.A03, this.A04, this.A00, this.A01);
    }

    public /* synthetic */ C21496Al5(C20111A7t a7t, DeviceJid deviceJid, String str, int i, int i2) {
        this.A02 = a7t;
        this.A03 = deviceJid;
        this.A04 = str;
        this.A00 = i;
        this.A01 = i2;
    }
}
