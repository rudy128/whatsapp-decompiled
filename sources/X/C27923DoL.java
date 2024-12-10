package X;

import java.util.List;

/* renamed from: X.DoL  reason: case insensitive filesystem */
public final class C27923DoL extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ List $placeables;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27923DoL(List list) {
        super(1);
        this.$placeables = list;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass0QZ r5 = (AnonymousClass0QZ) obj;
        int A04 = AnonymousClass1ZU.A04(this.$placeables);
        if (A04 >= 0) {
            int i = 0;
            while (true) {
                r5.A0B((AnonymousClass0XJ) this.$placeables.get(i), 0, 0);
                if (i == A04) {
                    break;
                }
                i++;
            }
        }
        return C27621Wu.A00;
    }
}
