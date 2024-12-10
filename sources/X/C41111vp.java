package X;

/* renamed from: X.1vp  reason: invalid class name and case insensitive filesystem */
public final class C41111vp extends AnonymousClass1DS {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41111vp(Object obj) {
        super(obj);
        C17960vV.A07(obj);
        if (obj != null) {
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public Object A06() {
        Object A06 = super.A06();
        if (A06 != null) {
            return A06;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public void A0E(Object obj) {
        C17960vV.A07(obj);
        super.A0E(obj);
    }

    public void A0F(Object obj) {
        C17960vV.A07(obj);
        super.A0F(obj);
    }

    public final void A0G(Object obj) {
        if (!C18070vi.A18(A06(), obj)) {
            A0F(obj);
        }
    }
}
