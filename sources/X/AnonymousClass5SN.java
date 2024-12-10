package X;

import java.util.Set;

/* renamed from: X.5SN  reason: invalid class name */
public final class AnonymousClass5SN extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ Set $favoriteJids;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5SN(Set set) {
        super(1);
        this.$favoriteJids = set;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass1E7 r3 = (AnonymousClass1E7) obj;
        C18070vi.A0d(r3, 0);
        return Boolean.valueOf(C29431cG.A18(this.$favoriteJids, r3.A0J));
    }
}
