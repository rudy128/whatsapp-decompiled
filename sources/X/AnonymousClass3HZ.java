package X;

import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.3HZ  reason: invalid class name */
public final class AnonymousClass3HZ extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C62582rd this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3HZ(C62582rd r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        LinkedHashMap A13 = C17880vN.A13();
        List A03 = ((C63332st) this.this$0.A05.get()).A03();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C200510q.A00(A03));
        for (Object next : A03) {
            C17880vN.A1O(next, linkedHashMap, ((C62302rB) next).A05.A00);
        }
        A13.putAll(AnonymousClass1D7.A08(linkedHashMap));
        return A13;
    }
}
