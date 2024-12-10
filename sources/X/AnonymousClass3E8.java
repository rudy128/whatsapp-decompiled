package X;

/* renamed from: X.3E8  reason: invalid class name */
public final class AnonymousClass3E8 implements AnonymousClass1OM {
    public final C22821Di A00;

    public void Bdq(Throwable th) {
        this.A00.invoke(th);
    }

    public AnonymousClass3E8(C22821Di r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("InternalCompletionHandler.UserSupplied[");
        C17900vP.A0a(this.A00, A10);
        A10.append('@');
        A10.append(Integer.toHexString(System.identityHashCode(this)));
        return C17890vO.A0c(A10, ']');
    }
}
