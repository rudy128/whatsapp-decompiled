package X;

import java.util.ArrayList;
import java.util.List;

public final /* synthetic */ class AY3 implements C22446B8e {
    public final /* synthetic */ AnonymousClass8pK A00;
    public final /* synthetic */ BB9 A01;
    public final /* synthetic */ C191909nO A02;

    public final void BrN(AnonymousClass8pK r6, A7B a7b, ArrayList arrayList, boolean z) {
        ARG arg;
        C191909nO r0 = this.A02;
        BB9 bb9 = this.A01;
        AnonymousClass8pK r3 = this.A00;
        if (a7b == null) {
            A5I A012 = r0.A01.A01();
            if (z) {
                arg = new ARG(r3, bb9, 5);
            } else {
                arg = new ARG(arrayList, bb9, 6);
            }
            A012.A03(arg, r6);
            return;
        }
        bb9.C3s(a7b, (List) null);
    }

    public /* synthetic */ AY3(AnonymousClass8pK r1, BB9 bb9, C191909nO r3) {
        this.A02 = r3;
        this.A01 = bb9;
        this.A00 = r1;
    }
}
