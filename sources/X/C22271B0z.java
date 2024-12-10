package X;

import com.whatsapp.WaButtonWithLoader;
import com.whatsapp.payments.ui.BrazilAddPixFragment;

/* renamed from: X.B0z  reason: case insensitive filesystem */
public final class C22271B0z extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ WaButtonWithLoader $ctaButton;
    public final /* synthetic */ BrazilAddPixFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22271B0z(WaButtonWithLoader waButtonWithLoader, BrazilAddPixFragment brazilAddPixFragment) {
        super(1);
        this.$ctaButton = waButtonWithLoader;
        this.this$0 = brazilAddPixFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C198179xu r3 = (C198179xu) obj;
        C18070vi.A0d(r3, 0);
        int i = r3.A00;
        if (i == 0) {
            C34001jj r1 = new C34001jj(this.this$0.A1F());
            r1.A07(this.this$0);
            r1.A00(false);
        } else if (i == 1) {
            ((AnonymousClass1KB) this.this$0.A0H.getValue()).A05(2131896261);
            this.$ctaButton.A01();
        } else if (i == 2) {
            this.$ctaButton.A02();
        }
        return C27621Wu.A00;
    }
}
