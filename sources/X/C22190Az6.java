package X;

import java.util.List;

/* renamed from: X.Az6  reason: case insensitive filesystem */
public final class C22190Az6 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ List $properties;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22190Az6(List list) {
        super(1);
        this.$properties = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass84T r5 = (AnonymousClass84T) obj;
        C18070vi.A0d(r5, 0);
        for (C20245ADd aDd : this.$properties) {
            r5.put(AnonymousClass84U.A00(new C22262B0q(aDd.A00, aDd.A01)));
        }
        return C27621Wu.A00;
    }
}
