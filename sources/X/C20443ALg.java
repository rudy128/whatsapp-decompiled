package X;

import android.util.LruCache;
import java.util.Queue;

/* renamed from: X.ALg  reason: case insensitive filesystem */
public final class C20443ALg implements C24721Lk, C24731Ll {
    public final LruCache A00 = new AnonymousClass8D0();
    public final AnonymousClass10I A01;
    public final AnonymousClass00H A02;
    public final Queue A03 = AnonymousClass8BR.A14();
    public final C18100vl A04 = C21528Alb.A00(this, 38);
    public final C24571Kv A05;
    public volatile boolean A06;
    public volatile boolean A07;

    public synchronized String BZc() {
        StringBuilder A10;
        A10 = AnonymousClass000.A10();
        A10.append("FcsConfigInMemoryCache: ");
        return C17880vN.A0t(A10, this.A00.size());
    }

    public synchronized void C9L(C122516Qr r2, boolean z) {
        this.A00.evictAll();
    }

    public static final void A00(C20443ALg aLg, C18090vk r4) {
        if (aLg.A07) {
            aLg.A03.add(new C21448AkF(r4, 18));
            return;
        }
        aLg.A07 = true;
        aLg.A03.add(new C21448AkF(r4, 19));
        C24571Kv r1 = aLg.A05;
        r1.A00.registerObserver(aLg);
        AnonymousClass193 r2 = (AnonymousClass193) r1.A01.get();
        synchronized (r2) {
            r2.A00.add(AnonymousClass3MW.A0z(aLg));
        }
        ((C200710s) aLg.A04.getValue()).execute(new C21448AkF(aLg, 20));
    }

    public C20443ALg(C24571Kv r2, AnonymousClass10I r3, AnonymousClass00H r4) {
        C18070vi.A0o(r3, r4, r2);
        this.A01 = r3;
        this.A02 = r4;
        this.A05 = r2;
    }
}
