package X;

import com.whatsapp.media.WamediaManager;
import java.util.Map;

/* renamed from: X.6Kz  reason: invalid class name and case insensitive filesystem */
public final class C121656Kz extends C24741Lm {
    public final C18030ve A00;
    public final WamediaManager A01;
    public final Map A02 = C17880vN.A13();

    public void C9L(C122516Qr r2, boolean z) {
        this.A02.clear();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121656Kz(C18030ve r2, WamediaManager wamediaManager, C24571Kv r4) {
        super(r4);
        C18070vi.A0o(r4, r2, wamediaManager);
        this.A00 = r2;
        this.A01 = wamediaManager;
        A09();
    }

    public String BZc() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("VideoMetaCache - ");
        A10.append(this.A02.size());
        return AnonymousClass000.A0y(" items", A10);
    }
}
