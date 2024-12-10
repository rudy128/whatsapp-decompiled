package X;

/* renamed from: X.CQq  reason: case insensitive filesystem */
public class C24940CQq {
    public final String A00;
    public final String A01;
    public final /* synthetic */ C25638CjQ A02;

    public C24940CQq(String str, C25638CjQ cjQ) {
        this.A02 = cjQ;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("-----BEGIN ");
        A10.append(str);
        this.A01 = AnonymousClass000.A0y("-----", A10);
        StringBuilder A102 = AnonymousClass000.A10();
        C17890vO.A10("-----END ", str, "-----", A102);
        this.A00 = A102.toString();
    }
}
