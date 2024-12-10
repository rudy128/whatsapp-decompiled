package X;

import android.os.Handler;
import android.view.Choreographer;
import java.util.concurrent.TimeUnit;

public class DEC implements E9S {
    public long A00;
    public final D4X A01;
    public final Handler A02;
    public final Runnable A03;
    public volatile Choreographer A04;
    public volatile C28498E4d A05;
    public volatile Long A06;
    public volatile boolean A07;

    public void stop() {
        this.A07 = true;
        this.A05 = null;
    }

    public static void A00(DEC dec) {
        if (dec.A04 == null) {
            dec.A02.post(dec.A03);
        } else {
            dec.A03.run();
        }
    }

    public void Bv1() {
        if (this.A06 != null) {
            A00(this);
            return;
        }
        C28498E4d e4d = this.A05;
        if (e4d != null) {
            e4d.CFB();
        }
    }

    public void Bv2() {
        if (this.A06 != null) {
            A00(this);
        }
    }

    public void CL2() {
        this.A06 = Long.valueOf(TimeUnit.NANOSECONDS.convert(1, TimeUnit.SECONDS) / 30);
    }

    public void CNc(C28498E4d e4d) {
        this.A05 = e4d;
        this.A07 = false;
    }

    public DEC(Handler handler) {
        this.A07 = false;
        this.A03 = C27082DTh.A00(this, 17);
        this.A01 = new D4X(this);
        this.A02 = handler;
    }

    public DEC() {
        this.A07 = false;
        this.A03 = C27082DTh.A00(this, 17);
        this.A01 = new D4X(this);
        this.A02 = C17890vO.A0D();
    }
}
