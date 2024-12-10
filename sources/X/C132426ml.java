package X;

import com.whatsapp.executorch.WhatsAppDynamicExecuTorchLoader;
import com.whatsapp.pytorch.WhatsAppDynamicPytorchLoader;

/* renamed from: X.6ml  reason: invalid class name and case insensitive filesystem */
public final class C132426ml {
    public final C18030ve A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;

    public final boolean A00() {
        if (C18020vd.A05(C18040vf.A02, this.A00, 10857)) {
            return ((WhatsAppDynamicExecuTorchLoader) this.A01.get()).modelLoaded("UTwoNet");
        }
        return ((WhatsAppDynamicPytorchLoader) this.A02.get()).modelLoaded("UTwoNet");
    }

    public C132426ml(C18030ve r1, AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
    }
}
