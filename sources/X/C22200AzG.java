package X;

import java.util.Set;

/* renamed from: X.AzG  reason: case insensitive filesystem */
public final class C22200AzG extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ Set $pinnedChats;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22200AzG(Set set) {
        super(1);
        this.$pinnedChats = set;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C18070vi.A0d(obj, 0);
        return C108945cZ.A1A(this.$pinnedChats.contains(obj));
    }
}
