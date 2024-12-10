package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.Av2  reason: case insensitive filesystem */
public final class C21938Av2 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C192859p6 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21938Av2(C192859p6 r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        LinkedHashMap A01 = ((AnonymousClass20Z) this.this$0.A09.getValue()).A01();
        LinkedHashMap A13 = C17880vN.A13();
        Iterator A15 = AnonymousClass000.A15(A01);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            if (((C437020o) A16.getValue()).BSW() == AnonymousClass00R.A0C) {
                C108985cd.A1R(A13, A16);
            }
        }
        LinkedHashMap A132 = C17880vN.A13();
        Iterator A152 = AnonymousClass000.A15(A13);
        while (A152.hasNext()) {
            Map.Entry A162 = AnonymousClass000.A16(A152);
            if (A162.getValue() instanceof AUJ) {
                C108985cd.A1R(A132, A162);
            }
        }
        ArrayList A11 = C72453Mb.A11(A132);
        Iterator A153 = AnonymousClass000.A15(A132);
        while (A153.hasNext()) {
            Map.Entry A163 = AnonymousClass000.A16(A153);
            int A04 = AnonymousClass8BV.A04(A163);
            Object value = A163.getValue();
            C18070vi.A0z(value, "null cannot be cast to non-null type com.whatsapp.historysync.integration.deserialization.HistorySyncCustomMessageParser");
            A11.add(new C193839qk((AUJ) value, A04));
        }
        return C21486Akr.A00(A11, 28);
    }
}
