package X;

import java.security.PublicKey;
import java.security.cert.X509Certificate;

/* renamed from: X.7Gn  reason: invalid class name and case insensitive filesystem */
public final class C144237Gn implements C72383Ls {
    public final /* synthetic */ AnonymousClass86X A00;
    public final /* synthetic */ C1418477e A01;
    public final /* synthetic */ C129416hl A02;
    public final /* synthetic */ Object A03;

    public C144237Gn(AnonymousClass86X r1, C1418477e r2, C129416hl r3, Object obj) {
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = obj;
        this.A00 = r1;
    }

    public void C7m(Integer num, PublicKey publicKey, X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        String str;
        C129416hl r4 = this.A02;
        C1418477e r2 = this.A01;
        if (num == null) {
            str = "EncryptPasswordHelper/passwordKeyId is null";
        } else if (publicKey == null) {
            str = "EncryptPasswordHelper/passwordPublicKey is null";
        } else {
            String valueOf = String.valueOf(AnonymousClass11P.A00(r4.A01));
            r4.A02.get();
            String A002 = A0V.A00(num, (String) C20061A5k.A01(r2), (String) null, publicKey);
            StringBuilder A15 = C108955ca.A15(A002);
            A15.append("#PWD_WA:11:");
            A15.append(valueOf);
            String A0Z = C17890vO.A0Z(A002, A15, ':');
            if (A0Z != null) {
                r4.A00.CGP(new C146887Qz(this.A03, this.A00, A0Z, 28));
                return;
            }
            C31081ez.A01("EncryptPasswordHelper/encryptedPassword is null ");
            AnonymousClass7RN.A01(r4.A00, this.A03, this.A00, 26);
        }
        C31081ez.A01(str);
        C31081ez.A01("EncryptPasswordHelper/encryptedPassword is null ");
        AnonymousClass7RN.A01(r4.A00, this.A03, this.A00, 26);
    }

    public void BrC(Exception exc) {
        C31081ez.A01(C17900vP.A0C("EncryptPasswordHelper/delivery fail ", C18070vi.A0K(exc), exc));
        C129416hl r0 = this.A02;
        AnonymousClass7RN.A01(r0.A00, this.A03, this.A00, 26);
    }

    public void Bsw(Exception exc) {
        C31081ez.A01(C17900vP.A0C("EncryptPasswordHelper/error ", C18070vi.A0K(exc), exc));
        C129416hl r0 = this.A02;
        AnonymousClass7RN.A01(r0.A00, this.A03, this.A00, 26);
    }
}
