package X;

import android.os.Handler;
import android.os.Looper;
import com.whatsapp.util.Log;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.1V7  reason: invalid class name */
public class AnonymousClass1V7 implements AnonymousClass1V6 {
    public final Handler A00;
    public final AnonymousClass118 A01;
    public final C18030ve A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final AnonymousClass00H A05;
    public final AtomicBoolean A06 = new AtomicBoolean();
    public volatile boolean A07;

    public void A00(A69 a69) {
        this.A00.obtainMessage(1, a69).sendToTarget();
    }

    public void A01(C72203La r3) {
        if (this.A07) {
            r3.C5F((A99) this.A05.get());
            Log.i("voice-service-wrapper/bindService singleton returned");
            return;
        }
        this.A00.obtainMessage(4, r3).sendToTarget();
    }

    public void A02(C72203La r4) {
        if ((C18020vd.A00(C18040vf.A01, this.A02, 11758) & 1) != 0) {
            Log.i("voice-service-wrapper/unbindService skip unbind");
        } else {
            this.A00.obtainMessage(5, r4).sendToTarget();
        }
    }

    public void C6R(boolean z) {
        this.A06.set(true);
    }

    public void C78() {
        this.A06.set(false);
    }

    public AnonymousClass1V7(AnonymousClass118 r3, C18030ve r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        this.A02 = r4;
        this.A01 = r3;
        this.A03 = r5;
        this.A04 = r6;
        this.A05 = r7;
        this.A00 = new AnonymousClass1V8(Looper.getMainLooper(), this);
    }
}
