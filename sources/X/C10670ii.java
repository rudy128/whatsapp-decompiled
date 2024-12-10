package X;

import java.util.List;

/* renamed from: X.0ii  reason: invalid class name and case insensitive filesystem */
public final class C10670ii extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ List $toPlace;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10670ii(List list) {
        super(1);
        this.$toPlace = list;
    }

    public final void A00() {
        List list = this.$toPlace;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                AnonymousClass1D6 r0 = (AnonymousClass1D6) list.get(i);
                AnonymousClass0QZ.A04((AnonymousClass0XJ) r0.A04(), 0.0f, ((C26143Ct6) r0.A05()).A02());
            }
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00();
        return C27621Wu.A00;
    }
}
