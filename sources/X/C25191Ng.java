package X;

import java.util.Set;

/* renamed from: X.1Ng  reason: invalid class name and case insensitive filesystem */
public final class C25191Ng extends AnonymousClass11D {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25191Ng(AnonymousClass00H r2, AnonymousClass00H r3) {
        super(r2, r3, false);
        C18070vi.A0d(r2, 1);
        C18070vi.A0d(r3, 2);
    }

    public final void A00(Set set) {
        C18070vi.A0d(set, 0);
        notifyAllObservers(new C97014om(set, 23));
    }
}
