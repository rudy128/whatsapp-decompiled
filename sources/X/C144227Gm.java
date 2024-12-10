package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.7Gm  reason: invalid class name and case insensitive filesystem */
public final class C144227Gm implements C72383Ls {
    public final /* synthetic */ AnonymousClass732 A00;
    public final /* synthetic */ AnonymousClass8A2 A01;
    public final /* synthetic */ C129906iZ A02;

    public void Bsw(Exception exc) {
        C18070vi.A0d(exc, 0);
        this.A01.Bsx(exc, (Integer) null);
    }

    public void C7m(Integer num, PublicKey publicKey, X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        C18070vi.A0d(x509Certificate, 0);
        C129906iZ r0 = this.A02;
        AnonymousClass732 r1 = this.A00;
        C139206yP r4 = r0.A02;
        AnonymousClass61Q r5 = r0.A03;
        int i = r0.A00;
        Object obj = r0.A04;
        new C132946nu(r0.A01, r4, r5, obj, x509Certificate, i).A00(r1, AnonymousClass705.A00());
    }

    public C144227Gm(AnonymousClass732 r1, AnonymousClass8A2 r2, C129906iZ r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    public void BrC(Exception exc) {
        this.A01.BrA();
    }
}
