package X;

/* renamed from: X.Am4  reason: case insensitive filesystem */
public final class C21557Am4 implements C22487B9t {
    public void C66(C192589oe r4) {
        C24360Bzv bzv;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("NativeAuthSsoLogger onSsoProviderResolved, source: ");
        String str = null;
        if (r4 != null) {
            bzv = r4.A03;
        } else {
            bzv = null;
        }
        A10.append(bzv);
        A10.append(", package name: ");
        if (r4 != null) {
            str = r4.A01;
        }
        C108995ce.A1O(A10, str);
    }
}
