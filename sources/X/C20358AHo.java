package X;

import android.content.Context;
import android.os.PowerManager;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: X.AHo  reason: case insensitive filesystem */
public class C20358AHo implements AnonymousClass86L, B4T {
    public static final String A0E = A5Z.A01("DelayMetCommandHandler");
    public int A00 = 0;
    public PowerManager.WakeLock A01;
    public boolean A02 = false;
    public final int A03;
    public final Context A04;
    public final AnonymousClass9UL A05;
    public final C20351AHh A06;
    public final C189179ie A07;
    public final C193279pp A08;
    public final Executor A09;
    public final Executor A0A;
    public final C18600wl A0B;
    public final Object A0C = C17880vN.A0p();
    public volatile AnonymousClass1OB A0D;

    public static void A00(C20358AHo aHo) {
        synchronized (aHo.A0C) {
            if (aHo.A0D != null) {
                aHo.A0D.BEM((CancellationException) null);
            }
            C199389zv r0 = aHo.A06.A08;
            C193279pp r4 = aHo.A08;
            r0.A00(r4);
            PowerManager.WakeLock wakeLock = aHo.A01;
            if (wakeLock != null && wakeLock.isHeld()) {
                A5Z A002 = A5Z.A00();
                String str = A0E;
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("Releasing wakelock ");
                A10.append(aHo.A01);
                AnonymousClass8BX.A12(A002, r4, "for WorkSpec ", str, A10);
                aHo.A01.release();
            }
        }
    }

    public void Bpt(C180159Lj r4, A2t a2t) {
        int i;
        boolean z = r4 instanceof AnonymousClass8KC;
        Executor executor = this.A0A;
        if (z) {
            i = 22;
        } else {
            i = 21;
        }
        executor.execute(new C21466AkX((Object) this, i));
    }

    public C20358AHo(Context context, AnonymousClass9UL r5, C20351AHh aHh, int i) {
        this.A04 = context;
        this.A03 = i;
        this.A06 = aHh;
        this.A08 = r5.A00;
        this.A05 = r5;
        C186369e5 r2 = aHh.A06.A09;
        C20367AHx aHx = (C20367AHx) aHh.A09;
        this.A0A = aHx.A01;
        this.A09 = aHx.A02;
        this.A0B = aHx.A03;
        this.A07 = new C189179ie(r2);
    }
}
