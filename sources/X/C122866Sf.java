package X;

/* renamed from: X.6Sf  reason: invalid class name and case insensitive filesystem */
public class C122866Sf extends Exception {
    public final String message;

    public C122866Sf(String str) {
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("Package ");
        A10.append(str);
        this.message = AnonymousClass000.A0y(" not authorized", A10);
    }

    public String getMessage() {
        return this.message;
    }
}
