package X;

/* renamed from: X.1GL  reason: invalid class name */
public final class AnonymousClass1GL implements AnonymousClass1GC {
    public final AnonymousClass1GJ A00;

    public void C6U(C27581Wq r3, AnonymousClass1F9 r4) {
        C18070vi.A0d(r4, 0);
        C18070vi.A0d(r3, 1);
        if (r3 == C27581Wq.ON_CREATE) {
            r4.getLifecycle().A06(this);
            this.A00.A01();
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Next event must be ON_CREATE, it was ");
        sb.append(r3);
        throw new IllegalStateException(sb.toString());
    }

    public AnonymousClass1GL(AnonymousClass1GJ r1) {
        this.A00 = r1;
    }
}
