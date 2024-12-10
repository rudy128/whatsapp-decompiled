package X;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.SystemClock;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: X.CuR  reason: case insensitive filesystem */
public final class C26196CuR {
    public long A00;
    public HandlerThread A01;
    public final MediaCodec A02;
    public final BT9 A03;
    public final LinkedBlockingQueue A04;

    public C26196CuR(MediaCodec mediaCodec, BT9 bt9) {
        C18070vi.A0d(bt9, 2);
        this.A02 = mediaCodec;
        this.A03 = bt9;
        this.A04 = new LinkedBlockingQueue(100);
    }

    public static final /* synthetic */ void A01(C25002CTc cTc, C26196CuR cuR) {
        if (!cTc.A06) {
            long elapsedRealtime = 30 - (SystemClock.elapsedRealtime() - cuR.A00);
            if (elapsedRealtime > 0) {
                Thread.sleep(elapsedRealtime);
            }
        }
    }

    public MediaCodec A03() {
        return this.A02;
    }

    public BT9 A04() {
        return this.A03;
    }

    public void A05() {
        MediaCodec mediaCodec = this.A02;
        BFR bfr = new BFR(this);
        HandlerThread handlerThread = this.A01;
        if (handlerThread == null) {
            C18070vi.A11("decoderThread");
            throw null;
        } else {
            mediaCodec.setCallback(bfr, new Handler(handlerThread.getLooper()));
        }
    }

    public C26196CuR() {
    }
}
