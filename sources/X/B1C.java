package X;

import java.util.List;

public final class B1C extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C22811Dh $isFetchedAtLeastOnce;
    public final /* synthetic */ C22801Dg $this_apply;
    public final /* synthetic */ C161558Fv this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B1C(C22801Dg r2, C161558Fv r3, C22811Dh r4) {
        super(1);
        this.$isFetchedAtLeastOnce = r4;
        this.$this_apply = r2;
        this.this$0 = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        boolean z;
        List list = (List) obj;
        C22811Dh r1 = this.$isFetchedAtLeastOnce;
        boolean z2 = r1.element;
        if (z2 || (list != null && !list.isEmpty())) {
            z = true;
        } else {
            z = false;
        }
        r1.element = z;
        C19972A1h a1h = (C19972A1h) this.$this_apply.A06();
        if (a1h != null) {
            this.$this_apply.A0F(new C19972A1h(a1h.A00, AnonymousClass000.A1W(list), this.$isFetchedAtLeastOnce.element));
        }
        if (!z2 && this.$isFetchedAtLeastOnce.element) {
            C161558Fv r2 = this.this$0;
            String str = r2.A00;
            r2.A00 = null;
            if (str != null) {
                r2.A0U(str);
            }
        }
        return C27621Wu.A00;
    }
}
