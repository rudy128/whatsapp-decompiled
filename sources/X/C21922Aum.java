package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* renamed from: X.Aum  reason: case insensitive filesystem */
public final class C21922Aum extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C185909dL this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21922Aum(C185909dL r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        List list;
        String str;
        String str2;
        C185909dL r0 = this.this$0;
        AnonymousClass19T r7 = r0.A00;
        C18140vp r1 = r0.A01;
        r7.markerPoint(314510313, "get_regs");
        Set<C190819lZ> set = (Set) r1.get();
        r7.markerPoint(314510313, "config_regs");
        C18070vi.A0b(set);
        for (C190819lZ A00 : set) {
            A00.A00();
        }
        r7.markerPoint(314510313, "process_regs");
        LinkedHashMap A13 = C17880vN.A13();
        LinkedHashMap A132 = C17880vN.A13();
        loop1:
        for (C190819lZ r4 : set) {
            synchronized (r4) {
                r4.A00();
                list = r4.A02;
            }
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    AnonymousClass2I2 r02 = ((C172148sx) it.next()).A02;
                    if (r02 == null) {
                        str = "integrationPointBuilder";
                        break loop1;
                    }
                    AnonymousClass20E r2 = r02.A01;
                    if (r2 == null) {
                        str = "integrationInterface";
                        break loop1;
                    }
                    C18140vp r12 = r02.A00;
                    if (r12 == null) {
                        str = "defaultImplementation";
                        break loop1;
                    } else if (A132.containsKey(r2)) {
                        AnonymousClass20E r3 = (AnonymousClass20E) A13.get(r2);
                        String A002 = C60662oP.A00(((AnonymousClass20F) r2).A00);
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("Duplicate registration of subsystem interface ");
                        A10.append(A002);
                        A10.append(". Originally registered by ");
                        if (r3 != null) {
                            str2 = C60662oP.A00(((AnonymousClass20F) r3).A00);
                        } else {
                            str2 = null;
                        }
                        A10.append(str2);
                        A10.append(". Duplicate registered by ");
                        throw new AnonymousClass3Ee(AnonymousClass000.A0y(C60662oP.A00(AnonymousClass3MW.A15(r4.getClass()).A00), A10));
                    } else {
                        A132.put(r2, r12);
                        A13.put(r2, AnonymousClass3MW.A15(r4.getClass()));
                    }
                }
            }
            C18070vi.A11(str);
            throw null;
        }
        r7.markerPoint(314510313, "init_complete");
        return A132;
    }
}
