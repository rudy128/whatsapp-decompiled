package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5S1  reason: invalid class name */
public final class AnonymousClass5S1 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C79173um this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5S1(C79173um r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C86624Sj r7 = (C86624Sj) obj;
        C79173um r5 = this.this$0;
        C18070vi.A0b(r7);
        r5.setVisibility(0);
        ArrayList A13 = AnonymousClass000.A13();
        A13.add(C18070vi.A0F(r5.getContext(), 2131890864));
        String A0k = C72473Md.A0k(r5.A00.getResources(), r7.A00, 2131755077);
        C18070vi.A0X(A0k);
        A13.add(A0k);
        r5.A0S(C29431cG.A0h(" • ", A13, (C22821Di) null), (List) null, 0, false);
        return C27621Wu.A00;
    }
}
