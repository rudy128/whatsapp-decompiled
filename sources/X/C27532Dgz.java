package X;

import android.content.Context;

/* renamed from: X.Dgz  reason: case insensitive filesystem */
public final class C27532Dgz extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ BXJ this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27532Dgz(BXJ bxj) {
        super(0);
        this.this$0 = bxj;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        E7u dHk;
        C25845Cn1 cn1 = C24712CGy.A01;
        cn1.A02("sup:InitialStateDelegate", "[INITIAL]: Starting device discovery");
        this.this$0.A02.A0L.invoke(BWW.A00);
        BXJ bxj = this.this$0;
        BQm bQm = bxj.A02;
        boolean z = bxj.A03;
        Context context = bxj.A01;
        C18070vi.A0d(bQm, 0);
        if (bQm.A0G.A03 == AnonymousClass00R.A0Y) {
            dHk = new C26877DHj(bQm);
        } else {
            dHk = new C26878DHk(context, new CL8(bQm), bQm, z);
        }
        bxj.A00 = dHk;
        BXJ bxj2 = this.this$0;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("[INITIAL]: Attempt device discovery with manager ");
        cn1.A02("sup:InitialStateDelegate", C17890vO.A0V(bxj2.A00, A10));
        BXJ bxj3 = this.this$0;
        E7u e7u = bxj3.A00;
        if (e7u != null) {
            e7u.CNd(new C27446DfX(bxj3, 7), C28142Ds0.A00);
        }
        return C27621Wu.A00;
    }
}
