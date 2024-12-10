package X;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.0j1  reason: invalid class name and case insensitive filesystem */
public final class C10860j1 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C04670Oh this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10860j1(C04670Oh r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00((C17490uk) obj);
        return C27621Wu.A00;
    }

    public final void A00(C17490uk r6) {
        if (r6.Bft()) {
            C04670Oh BMo = r6.BMo();
            if (BMo.A01) {
                r6.BhP();
            }
            Map map = BMo.A08;
            C04670Oh r4 = this.this$0;
            Iterator A15 = AnonymousClass000.A15(map);
            while (A15.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(A15);
                r4.A01((C04280Mo) A16.getKey(), r6.BT2(), AnonymousClass000.A0M(A16.getValue()));
            }
            C01850Ad BT2 = r6.BT2();
            while (true) {
                BT2 = BT2.A0x();
                C18070vi.A0b(BT2);
                if (!C18070vi.A18(BT2, this.this$0.A07.BT2())) {
                    Set<C04280Mo> keySet = this.this$0.A04(BT2).keySet();
                    C04670Oh r3 = this.this$0;
                    for (C04280Mo r1 : keySet) {
                        r3.A01(r1, BT2, r3.A02(r1, BT2));
                    }
                } else {
                    return;
                }
            }
        }
    }
}
