package X;

import java.util.List;
import java.util.Map;

public final class DmA extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ DOZ $bloksContext;
    public final /* synthetic */ DFL $component;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DmA(DOZ doz, DFL dfl) {
        super(0);
        this.$component = dfl;
        this.$bloksContext = doz;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        E8A A0A = this.$component.A0A(45);
        if (A0A != null) {
            Object A00 = C25974Cph.A00(C23736Boh.A01(this.$bloksContext, (E8A) null, (List) null), C199029zJ.A01, A0A);
            if (A00 instanceof Map) {
                return A00;
            }
        }
        return null;
    }
}
