package X;

/* renamed from: X.6Kx  reason: invalid class name and case insensitive filesystem */
public final class C121636Kx extends C24741Lm {
    public final C002100z A00 = new C002100z(100);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C121636Kx(C24571Kv r3) {
        super(r3);
        C18070vi.A0d(r3, 1);
        A09();
    }

    public synchronized String BZc() {
        StringBuilder A10;
        A10 = AnonymousClass000.A10();
        A10.append("MetaAiChatTypeaheadCache:");
        return C17880vN.A0t(A10, this.A00.A02());
    }

    public synchronized void C9L(C122516Qr r4, boolean z) {
        synchronized (this) {
            this.A00.A07(-1);
        }
    }
}
