package X;

import java.util.Deque;
import java.util.concurrent.TimeUnit;

/* renamed from: X.D8e  reason: case insensitive filesystem */
public class C26655D8e implements EAG {
    public static final C26655D8e $redex_init_class = null;
    public final EAG A00;
    public final Ch0 A01;
    public final D47 A02;

    static {
        TimeUnit.MICROSECONDS.convert(2, TimeUnit.SECONDS);
    }

    public C25215CbB BMx() {
        return this.A00.BMx();
    }

    public long BNH() {
        return this.A00.BNH();
    }

    public void C1Z() {
        this.A00.C1Z();
    }

    public void C2x() {
        this.A00.C2x();
    }

    public void C78() {
        this.A00.C78();
    }

    public void C94(C26539D3a d3a, ECg[] eCgArr, C28650ECj[] eCjArr) {
        this.A00.C94(d3a, eCgArr, eCjArr);
    }

    public boolean CG3() {
        return this.A00.CG3();
    }

    public void CJt(long j, long j2) {
        this.A00.CJt(j, j2);
    }

    public boolean CLn(float f, long j, long j2, boolean z) {
        synchronized (this.A01) {
        }
        return this.A00.CLn(f, j, j2, z);
    }

    public boolean CMR(float f, long j, boolean z, boolean z2) {
        return this.A00.CMR(f, j, z, z2);
    }

    public C26655D8e(EAG eag, D47 d47, Ch0 ch0) {
        this.A00 = eag;
        Deque deque = C24680CEu.A00;
        if (d47.A0H != null) {
            this.A01 = ch0;
            this.A02 = d47;
            return;
        }
        throw AnonymousClass000.A0k("video source has null video id");
    }
}
