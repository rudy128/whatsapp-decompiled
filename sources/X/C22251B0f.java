package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.B0f  reason: case insensitive filesystem */
public final class C22251B0f extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C179309Hl $requestType;
    public final /* synthetic */ C198309y8 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22251B0f(C179309Hl r2, C198309y8 r3) {
        super(1);
        this.this$0 = r3;
        this.$requestType = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C198309y8 r4;
        Object obj2;
        Object obj3;
        C179309Hl r1;
        AnonymousClass9MB r0;
        AnonymousClass9M9 r8 = (AnonymousClass9M9) obj;
        if (r8 instanceof C169558lt) {
            r4 = this.this$0;
            C179309Hl r6 = this.$requestType;
            r4.A01.get();
            C169558lt r82 = (C169558lt) r8;
            C18070vi.A0d(r82, 0);
            List list = r82.A00.A03;
            ArrayList A13 = AnonymousClass000.A13();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                A13.add(new C169598lz(AnonymousClass8BS.A0B(it)));
            }
            obj2 = new AnonymousClass8mA(A13);
            obj3 = new AnonymousClass8m9(A13);
            int ordinal = r6.ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    throw AnonymousClass3MW.A14();
                }
            }
            C108945cZ.A0Q(r4.A02).A0F(obj2);
            return C27621Wu.A00;
        }
        if (r8 instanceof C169568lw) {
            r4 = this.this$0;
            r1 = this.$requestType;
            r0 = AnonymousClass8m4.A00;
        } else if (C18070vi.A18(r8, AnonymousClass8lv.A00)) {
            r4 = this.this$0;
            r1 = this.$requestType;
            r0 = AnonymousClass8m3.A00;
        } else {
            if (!C18070vi.A18(r8, AnonymousClass8lu.A00)) {
                if (!C18070vi.A18(r8, C169578lx.A00)) {
                    C18070vi.A18(r8, C169588ly.A00);
                    return C27621Wu.A00;
                } else if (this.$requestType == C179309Hl.START) {
                    r4 = this.this$0;
                    obj2 = AnonymousClass8mC.A00;
                    C108945cZ.A0Q(r4.A02).A0F(obj2);
                    return C27621Wu.A00;
                }
            }
            r4 = this.this$0;
            obj2 = AnonymousClass8mB.A00;
            C108945cZ.A0Q(r4.A02).A0F(obj2);
            return C27621Wu.A00;
        }
        obj2 = new AnonymousClass8m6(r0);
        obj3 = new AnonymousClass8m5(r0);
        int ordinal2 = r1.ordinal();
        if (ordinal2 != 0) {
            if (ordinal2 != 1) {
                throw AnonymousClass3MW.A14();
            }
        }
        C108945cZ.A0Q(r4.A02).A0F(obj2);
        return C27621Wu.A00;
        obj2 = obj3;
        C108945cZ.A0Q(r4.A02).A0F(obj2);
        return C27621Wu.A00;
    }
}
