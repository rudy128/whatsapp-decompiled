package X;

import java.util.HashSet;

/* renamed from: X.7yu  reason: invalid class name and case insensitive filesystem */
public final class C157947yu extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ HashSet $storedLids;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C157947yu(HashSet hashSet) {
        super(1);
        this.$storedLids = hashSet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C18070vi.A0d(obj, 0);
        return Boolean.valueOf(this.$storedLids.contains(obj));
    }
}
