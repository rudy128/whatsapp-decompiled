package X;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* renamed from: X.1eL  reason: invalid class name and case insensitive filesystem */
public class C30681eL {
    public static final /* synthetic */ AtomicIntegerFieldUpdater A01 = AtomicIntegerFieldUpdater.newUpdater(C30681eL.class, "_handled$volatile");
    public final Throwable A00;
    public volatile /* synthetic */ int _handled$volatile;

    public /* synthetic */ C30681eL(Throwable th) {
        this(th, false);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('[');
        sb.append(this.A00);
        sb.append(']');
        return sb.toString();
    }

    public final boolean A01() {
        if (A01.get(this) != 0) {
            return true;
        }
        return false;
    }

    public final boolean A02() {
        return A01.compareAndSet(this, 0, 1);
    }

    public C30681eL(Throwable th, boolean z) {
        this.A00 = th;
        this._handled$volatile = z ? 1 : 0;
    }
}
