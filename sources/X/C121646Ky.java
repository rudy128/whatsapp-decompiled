package X;

import java.util.Map;

/* renamed from: X.6Ky  reason: invalid class name and case insensitive filesystem */
public final class C121646Ky extends C24741Lm {
    public final Map A00 = C17880vN.A13();
    public final Map A01 = C17880vN.A13();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121646Ky(C24571Kv r2) {
        super(r2);
        C18070vi.A0d(r2, 1);
        A09();
    }

    public void C9L(C122516Qr r2, boolean z) {
        this.A00.clear();
        this.A01.clear();
    }

    public String BZc() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("AIStickersCache - ");
        A10.append(this.A01.size());
        return AnonymousClass000.A0y(" items", A10);
    }
}
