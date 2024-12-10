package X;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

/* renamed from: X.6EY  reason: invalid class name */
public final class AnonymousClass6EY extends AnonymousClass2P3 implements C24731Ll {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;
    public final C18100vl A05 = AnonymousClass7S4.A02(this, 3);
    public final C18100vl A06 = AnonymousClass7S4.A02(this, 2);

    public final synchronized void A0B() {
        C167258fi r1;
        C18100vl r3 = this.A06;
        BlockingQueue<Runnable> queue = ((ThreadPoolExecutor) AnonymousClass3MX.A14(r3)).getQueue();
        C18070vi.A0X(queue);
        for (Runnable next : queue) {
            if ((next instanceof C167258fi) && (r1 = (C167258fi) next) != null) {
                r1.cancel();
            }
        }
        ((ThreadPoolExecutor) AnonymousClass3MX.A14(r3)).purge();
    }

    public final synchronized void A0C(String str, C22821Di r6) {
        C115285th r3 = new C115285th(this, str);
        r3.A09(new C145917Nc(r6, 23));
        r3.A00.A03(new C145917Nc(r6, 24), (Executor) null);
        ((ThreadPoolExecutor) AnonymousClass3MX.A14(this.A06)).execute(r3);
    }

    public synchronized String BZc() {
        StringBuilder A10;
        int A022;
        A10 = AnonymousClass000.A10();
        A10.append("AlbumArtworkDirectDownloader=");
        C002100z r1 = ((A5O) this.A05.getValue()).A02;
        synchronized (r1) {
            A022 = r1.A02();
        }
        return C17880vN.A0t(A10, A022);
    }

    public synchronized void C9L(C122516Qr r3, boolean z) {
        ((A5O) this.A05.getValue()).A05(true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6EY(C24571Kv r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5, AnonymousClass00H r6, AnonymousClass00H r7, AnonymousClass00H r8) {
        super(r2, r7);
        C18070vi.A0w(r3, r4, r5, r6, r2);
        C18070vi.A0l(r7, r8);
        this.A03 = r3;
        this.A04 = r4;
        this.A01 = r5;
        this.A02 = r6;
        this.A00 = r8;
        A09();
    }
}
