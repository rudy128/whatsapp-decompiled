package X;

import java.util.List;

/* renamed from: X.0jf  reason: invalid class name and case insensitive filesystem */
public final class C11210jf extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C25146CZx $editProcessor;
    public final /* synthetic */ C22821Di $onValueChange;
    public final /* synthetic */ C98494rF $session;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11210jf(C25146CZx cZx, C22821Di r3, C98494rF r4) {
        super(1);
        this.$editProcessor = cZx;
        this.$onValueChange = r3;
        this.$session = r4;
    }

    public final void A00(List list) {
        C05090Qj.A08(this.$editProcessor, (C25246Cbl) this.$session.element, list, this.$onValueChange);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00((List) obj);
        return C27621Wu.A00;
    }
}
