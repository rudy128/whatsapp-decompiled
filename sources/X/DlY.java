package X;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;

public final class DlY extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C24989CSp this$0;
    public final /* synthetic */ DBA this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DlY(C24989CSp cSp, DBA dba) {
        super(0);
        this.this$0 = cSp;
        this.this$1 = dba;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Map A12 = AnonymousClass3MW.A12(this.this$0.A01);
        DBA dba = this.this$1;
        LinkedHashMap A0b = C108995ce.A0b(A12);
        Iterator A15 = AnonymousClass000.A15(A12);
        while (A15.hasNext()) {
            Map.Entry A16 = AnonymousClass000.A16(A15);
            Object key = A16.getKey();
            CZI czi = dba.A06;
            C25052CVg A01 = czi.A01(dba.A00);
            CV5 A00 = czi.A00();
            Executor executor = ((C26762DCr) dba.A05).A02;
            A0b.put(key, new C25680CkB((C25963CpV) A16.getValue(), A00, dba.A03, A01, executor, executor));
        }
        return new HashMap(A0b);
    }
}
