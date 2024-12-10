package X;

import java.util.List;
import java.util.Map;

public final class Dm8 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ DOZ $bloksContext;
    public final /* synthetic */ DFL $component;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public Dm8(DOZ doz, DFL dfl) {
        super(0);
        this.$component = dfl;
        this.$bloksContext = doz;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        Object obj;
        E8A A0A = this.$component.A0A(59);
        C23736Boh A01 = C23736Boh.A01(this.$bloksContext, (E8A) null, (List) null);
        if (A0A != null) {
            obj = C25974Cph.A00(A01, C199029zJ.A01, A0A);
        } else {
            obj = null;
        }
        if (obj instanceof Map) {
            return obj;
        }
        return null;
    }
}
