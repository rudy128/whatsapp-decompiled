package X;

import android.media.MediaFormat;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.LinkedBlockingQueue;

public class DHU implements E7t {
    public MediaFormat A00;
    public DH2 A01 = null;
    public ArrayList A02;
    public CountDownLatch A03 = new CountDownLatch(1);
    public LinkedBlockingQueue A04;
    public LinkedBlockingQueue A05 = new LinkedBlockingQueue();
    public LinkedBlockingQueue A06 = new LinkedBlockingQueue();
    public volatile boolean A07;
    public volatile boolean A08 = true;

    public EAS BHI() {
        this.A04 = new LinkedBlockingQueue();
        return new DHO(this);
    }

    public EAb BHL() {
        return new DHR(this);
    }
}
