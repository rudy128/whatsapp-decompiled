package X;

import java.util.List;

/* renamed from: X.8HZ  reason: invalid class name */
public abstract class AnonymousClass8HZ extends C38391rD {
    public final List A00 = AnonymousClass000.A13();

    public int A0Q() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ void A0R(C42011xT r2) {
        AnonymousClass8IO r22 = (AnonymousClass8IO) r2;
        if (r22 instanceof C168778jf) {
            r22.A0H.clearAnimation();
        }
    }

    public int getItemViewType(int i) {
        return ((C182999Wn) this.A00.get(i)).A00;
    }
}
