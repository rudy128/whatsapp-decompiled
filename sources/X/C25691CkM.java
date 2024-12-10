package X;

import com.facebook.wearable.airshield.security.Hash;
import com.facebook.wearable.airshield.security.PrivateKey;
import com.facebook.wearable.airshield.security.PublicKey;
import com.facebook.wearable.datax.Connection;
import com.facebook.wearable.datax.LocalChannel;
import com.facebook.wearable.datax.Service;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.CkM  reason: case insensitive filesystem */
public final class C25691CkM {
    public Hash A00;
    public Hash A01;
    public final PrivateKey A02;
    public final PublicKey A03;
    public final Connection A04;
    public final LocalChannel A05;
    public final Service A06;
    public final BTD A07;
    public final C22821Di A08;
    public final AtomicBoolean A09 = new AtomicBoolean();
    public final C18090vk A0A;

    /* JADX WARNING: type inference failed for: r0v3, types: [X.BTD, java.lang.Object] */
    public C25691CkM(PrivateKey privateKey, PublicKey publicKey, Connection connection, C18090vk r8, C22821Di r9) {
        C18070vi.A0d(publicKey, 3);
        this.A04 = connection;
        this.A02 = privateKey;
        this.A03 = publicKey;
        this.A0A = r8;
        this.A08 = r9;
        AtomicBoolean A16 = BE6.A16(false);
        AtomicBoolean A162 = BE6.A16(false);
        ? obj = new Object();
        obj.A00 = A16;
        obj.A01 = A162;
        this.A07 = obj;
        LocalChannel localChannel = new LocalChannel(connection, 30);
        localChannel.onError = new C27446DfX(this, 19);
        this.A05 = localChannel;
        Service service = new Service(30);
        service.onReceived = new C27447DfY(this, 4);
        this.A06 = service;
    }

    public final void A01() {
        if (AnonymousClass8BV.A1Z(this.A09)) {
            this.A06.unregister();
            CCR.A00(this.A05);
        }
    }

    public static final void A00(C25691CkM ckM, C18090vk r3) {
        r3.invoke();
        BTD btd = ckM.A07;
        synchronized (btd) {
            if (btd.A01.get() && btd.A00.get()) {
                ckM.A0A.invoke();
            }
        }
    }
}
