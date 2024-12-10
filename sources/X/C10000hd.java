package X;

import java.util.List;

/* renamed from: X.0hd  reason: invalid class name and case insensitive filesystem */
public final class C10000hd extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ List $placeables;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10000hd(List list) {
        super(1);
        this.$placeables = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass0QZ r6 = (AnonymousClass0QZ) obj;
        List list = this.$placeables;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            r6.A0C((AnonymousClass0XJ) list.get(i), AnonymousClass0O5.A01, 0, 0);
        }
        return C27621Wu.A00;
    }
}
