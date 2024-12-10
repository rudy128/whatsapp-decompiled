package X;

import java.util.List;

/* renamed from: X.0is  reason: invalid class name and case insensitive filesystem */
public final class C10770is extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ List $it;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10770is(List list) {
        super(1);
        this.$it = list;
    }

    public final void A00(Object obj) {
        List list = this.$it;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ((C22821Di) list.get(i)).invoke(obj);
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00(obj);
        return C27621Wu.A00;
    }
}
