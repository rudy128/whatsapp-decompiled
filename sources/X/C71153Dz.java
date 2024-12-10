package X;

/* renamed from: X.3Dz  reason: invalid class name and case insensitive filesystem */
public final class C71153Dz implements AnonymousClass3MV {
    public final C22821Di A00;

    public void Bdq(Throwable th) {
        this.A00.invoke(th);
    }

    public C71153Dz(C22821Di r1) {
        this.A00 = r1;
    }

    public String toString() {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("CancelHandler.UserSupplied[");
        C17900vP.A0a(this.A00, A10);
        A10.append('@');
        A10.append(Integer.toHexString(System.identityHashCode(this)));
        return C17890vO.A0c(A10, ']');
    }
}
