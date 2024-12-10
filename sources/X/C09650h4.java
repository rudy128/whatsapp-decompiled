package X;

import java.util.List;

/* renamed from: X.0h4  reason: invalid class name and case insensitive filesystem */
public final class C09650h4 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ List $placeables;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C09650h4(List list) {
        super(1);
        this.$placeables = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass0QZ r6 = (AnonymousClass0QZ) obj;
        List list = this.$placeables;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            r6.A0B((AnonymousClass0XJ) list.get(i), 0, 0);
        }
        return C27621Wu.A00;
    }
}
