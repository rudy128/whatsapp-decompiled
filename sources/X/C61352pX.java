package X;

import java.security.MessageDigest;

/* renamed from: X.2pX  reason: invalid class name and case insensitive filesystem */
public final class C61352pX {
    public final AnonymousClass1MW A00;
    public final AnonymousClass00H A01;

    public C61352pX(AnonymousClass1MW r1, AnonymousClass00H r2) {
        C18070vi.A0j(r1, r2);
        this.A00 = r1;
        this.A01 = r2;
    }

    public static final String A00(AnonymousClass206 r3) {
        StringBuilder A10 = AnonymousClass000.A10();
        AnonymousClass205 r1 = r3.A0v;
        A10.append(r1.A01);
        A10.append(r1.A02);
        byte[] digest = MessageDigest.getInstance("MD5").digest(C18070vi.A1A(C17890vO.A0V(r1.A00, A10), C26571Sq.A05));
        C18070vi.A0b(digest);
        return C200410p.A0J(C71833In.A00, digest);
    }
}
