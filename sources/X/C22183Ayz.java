package X;

import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ayz  reason: case insensitive filesystem */
public final class C22183Ayz extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C194919sV this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22183Ayz(C194919sV r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass84U A0a = C108955ca.A0a(obj);
        A0a.A01("user_jid_raw", this.this$0.A01.getRawString());
        A0a.A01("promotion_id", this.this$0.A02);
        A0a.A01("last_impression_ts", Long.valueOf(this.this$0.A00));
        List<C193769qd> list = this.this$0.A03;
        ArrayList A0D = C29351c6.A0D(list);
        for (C193769qd ayy : list) {
            A0D.add(AnonymousClass84U.A00(new C22182Ayy(ayy)));
        }
        A0a.A02("actions", A0D);
        return C27621Wu.A00;
    }
}
