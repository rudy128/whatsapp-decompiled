package X;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: X.Cq8  reason: case insensitive filesystem */
public final class C25993Cq8 {
    public int A00;
    public Map A01;
    public Set A02;
    public final int A03;
    public final E95 A04;
    public final C24772CJp A05;
    public final C25082CWs A06;
    public final C25026CUc A07;
    public final ConcurrentHashMap A08;
    public final C24771CJo A09;
    public volatile int A0A;
    public volatile boolean A0B;

    public static final int A00(E95 e95) {
        long millis = TimeUnit.SECONDS.toMillis(1) / ((long) (e95.BUH() / e95.getFrameCount()));
        if (millis < 1) {
            millis = 1;
        }
        return (int) millis;
    }

    public static final void A01(C25993Cq8 cq8, int i, int i2) {
        if (!cq8.A0B) {
            cq8.A0B = true;
            ThreadFactory threadFactory = C24699CGl.A01;
            C24699CGl.A00.execute(new AnonymousClass7RE(cq8, i, i2, 0));
        }
    }

    public void A02(int i) {
        E95 e95 = this.A04;
        int BUH = e95.BUH();
        int loopCount = e95.getLoopCount();
        if (loopCount < 1) {
            loopCount = 1;
        }
        int i2 = BUH * loopCount;
        C24771CJo cJo = this.A09;
        int frameCount = e95.getFrameCount();
        int A002 = A00(e95);
        if (i > A002) {
            i = A002;
        }
        if (i < 1) {
            i = 1;
        }
        int i3 = cJo.A00;
        if (i > i3) {
            i = i3;
        }
        float f = ((float) i) * (((float) i2) / 1000.0f);
        if (f < 0.0f) {
            f = 0.0f;
        }
        float f2 = (float) frameCount;
        if (f > f2) {
            f = f2;
        }
        float f3 = f2 / f;
        int i4 = 0;
        C25411Oc A082 = C28851b7.A08(0, frameCount);
        LinkedHashMap linkedHashMap = new LinkedHashMap(C200510q.A00(A082));
        for (Object next : A082) {
            int A0M = AnonymousClass000.A0M(next);
            if (((int) (((float) A0M) % f3)) == 0) {
                i4 = A0M;
            }
            C17880vN.A1P(next, linkedHashMap, i4);
        }
        this.A01 = linkedHashMap;
        this.A02 = C29431cG.A12(linkedHashMap.values());
    }

    public C25993Cq8(E95 e95, C24771CJo cJo, C25082CWs cWs, C25026CUc cUc, int i) {
        this.A07 = cUc;
        this.A06 = cWs;
        this.A09 = cJo;
        this.A04 = e95;
        int A002 = (A00(e95) * i) / 1000;
        A002 = A002 < 1 ? 1 : A002;
        this.A03 = A002;
        this.A08 = AnonymousClass8BR.A17();
        this.A05 = new C24772CJp(this.A04.getFrameCount());
        this.A00 = -1;
        this.A01 = AnonymousClass1D7.A0I();
        this.A02 = C25511Om.A00;
        A02(A00(this.A04));
        this.A0A = (int) (((float) A002) * 0.5f);
    }
}
