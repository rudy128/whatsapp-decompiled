package X;

import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: X.5qv  reason: invalid class name and case insensitive filesystem */
public final class C114495qv extends C180769Nv {
    public WeakReference A00 = AnonymousClass3MW.A0z((Object) null);
    public boolean A01;
    public final C129146hK A02;
    public final WeakHashMap A03 = new WeakHashMap();
    public final C18140vp A04;
    public final C18140vp A05;
    public final AnonymousClass6ZH A06 = new AnonymousClass6ZH();

    public static final synchronized void A00(C1593984j r2, C114495qv r3, boolean z) {
        synchronized (r3) {
            ((A58) r3.A05.get()).A02(C108945cZ.A0O(((C142887Be) r2).A04));
            if (z) {
                r3.A03.remove(r2);
            }
        }
    }

    public C114495qv(C129146hK r2, C18140vp r3, C18140vp r4) {
        this.A02 = r2;
        this.A04 = r3;
        this.A05 = r4;
        C18070vi.A0X(C114495qv.class.getName());
    }
}
