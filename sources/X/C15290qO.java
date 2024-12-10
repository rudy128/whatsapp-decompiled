package X;

import android.os.Handler;
import android.view.Choreographer;
import java.util.List;

/* renamed from: X.0qO  reason: invalid class name and case insensitive filesystem */
public final class C15290qO extends C18600wl {
    public static final C04270Mn A0A = new Object();
    public static final ThreadLocal A0B = new C07200aX();
    public static final C18100vl A0C = AnonymousClass1DF.A01(C09420gg.A00);
    public List A00;
    public List A01;
    public boolean A02;
    public boolean A03;
    public final Object A04;
    public final Handler A05;
    public final Choreographer A06;
    public final C17860vL A07;
    public final AnonymousClass0ZZ A08;
    public final AnonymousClass1JD A09;

    public /* synthetic */ C15290qO(Handler handler, Choreographer choreographer, AnonymousClass1Y1 r3) {
        this(handler, choreographer);
    }

    private final Runnable A02() {
        Runnable runnable;
        synchronized (this.A04) {
            runnable = (Runnable) this.A09.A0W();
        }
        return runnable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0015, code lost:
        r1 = r2.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0019, code lost:
        if (r3 >= r1) goto L_0x0027;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001b, code lost:
        ((android.view.Choreographer.FrameCallback) r2.get(r3)).doFrame(r5);
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        r2.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002a, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void A09(X.C15290qO r4, long r5) {
        /*
            java.lang.Object r1 = r4.A04
            monitor-enter(r1)
            boolean r0 = r4.A02     // Catch:{ all -> 0x002b }
            if (r0 != 0) goto L_0x0009
            monitor-exit(r1)
            return
        L_0x0009:
            r3 = 0
            r4.A02 = r3     // Catch:{ all -> 0x002b }
            java.util.List r2 = r4.A01     // Catch:{ all -> 0x002b }
            java.util.List r0 = r4.A00     // Catch:{ all -> 0x002b }
            r4.A01 = r0     // Catch:{ all -> 0x002b }
            r4.A00 = r2     // Catch:{ all -> 0x002b }
            monitor-exit(r1)
            int r1 = r2.size()
        L_0x0019:
            if (r3 >= r1) goto L_0x0027
            java.lang.Object r0 = r2.get(r3)
            android.view.Choreographer$FrameCallback r0 = (android.view.Choreographer.FrameCallback) r0
            r0.doFrame(r5)
            int r3 = r3 + 1
            goto L_0x0019
        L_0x0027:
            r2.clear()
            return
        L_0x002b:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15290qO.A09(X.0qO, long):void");
    }

    public void A0D(Runnable runnable, C18560wh r6) {
        synchronized (this.A04) {
            this.A09.addLast(runnable);
            if (!this.A03) {
                this.A03 = true;
                Handler handler = this.A05;
                AnonymousClass0ZZ r1 = this.A08;
                handler.post(r1);
                if (!this.A02) {
                    this.A02 = true;
                    this.A06.postFrameCallback(r1);
                }
            }
        }
    }

    public final void A0G(Choreographer.FrameCallback frameCallback) {
        synchronized (this.A04) {
            this.A01.add(frameCallback);
            if (!this.A02) {
                this.A02 = true;
                this.A06.postFrameCallback(this.A08);
            }
        }
    }

    public final void A0H(Choreographer.FrameCallback frameCallback) {
        synchronized (this.A04) {
            this.A01.remove(frameCallback);
        }
    }

    public C15290qO(Handler handler, Choreographer choreographer) {
        this.A06 = choreographer;
        this.A05 = handler;
        this.A04 = new Object();
        this.A09 = new AnonymousClass1JD();
        this.A01 = AnonymousClass000.A13();
        this.A00 = AnonymousClass000.A13();
        this.A08 = new AnonymousClass0ZZ(this);
        this.A07 = new AnonymousClass0VZ(choreographer, this);
    }

    /* access modifiers changed from: private */
    public final void A06() {
        boolean z;
        while (true) {
            Runnable A022 = A02();
            if (A022 != null) {
                A022.run();
            } else {
                synchronized (this.A04) {
                    z = true;
                    if (this.A09.isEmpty()) {
                        z = false;
                        this.A03 = false;
                    }
                }
                if (!z) {
                    return;
                }
            }
        }
    }

    public final Choreographer A0E() {
        return this.A06;
    }

    public final C17860vL A0F() {
        return this.A07;
    }
}
