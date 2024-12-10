package X;

import java.io.IOException;

/* renamed from: X.7GT  reason: invalid class name */
public class AnonymousClass7GT implements C1606689l {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass7GT(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public void BrA() {
        IOException iOException;
        AnonymousClass7IB r4;
        C1606989o r3;
        String str;
        switch (this.A00) {
            case 0:
                ((AnonymousClass8A2) this.A01).BrA();
                return;
            case 1:
                iOException = C17880vN.A0f("Network error while creating user");
                r4 = (AnonymousClass7IB) this.A02;
                r3 = (C1606989o) this.A01;
                str = "createUserWithCertificate.FbUserEntityCallback.onDeliveryFailure";
                break;
            case 2:
                iOException = C17880vN.A0f("Network error while creating user");
                r4 = (AnonymousClass7IB) this.A02;
                r3 = (C1606989o) this.A01;
                str = "createUserWithoutCertificate.FbUserEntityCallback.onDeliveryFailure";
                break;
            case 3:
                iOException = C17880vN.A0f("Network error while refreshing token");
                r4 = (AnonymousClass7IB) this.A02;
                r3 = (C1606989o) this.A01;
                str = "sendRefreshedTokenRequest.FbUserEntityCallback.onDeliveryFailure";
                break;
            case 4:
                ((C1606789m) this.A01).Bsw(new Exception("onDeliveryFailure"));
                return;
            case 5:
                ((AnonymousClass3LQ) this.A01).onError(3489018);
                return;
            default:
                ((C1606789m) this.A01).Bsw((Exception) this.A02);
                return;
        }
        AnonymousClass7IB.A03(r4, str, C18070vi.A0M(iOException), false);
        r3.BrB(iOException);
    }

    public void Bsw(Exception exc) {
        AnonymousClass7IB r4;
        C1606989o r3;
        String str;
        switch (this.A00) {
            case 0:
                C18070vi.A0d(exc, 0);
                ((AnonymousClass8A2) this.A01).Bsx(exc, (Integer) null);
                return;
            case 1:
                C18070vi.A0d(exc, 0);
                r4 = (AnonymousClass7IB) this.A02;
                r3 = (C1606989o) this.A01;
                str = "createUserWithCertificate.FbUserEntityCallback.onError";
                break;
            case 2:
                C18070vi.A0d(exc, 0);
                r4 = (AnonymousClass7IB) this.A02;
                r3 = (C1606989o) this.A01;
                str = "createUserWithoutCertificate.FbUserEntityCallback.onError";
                break;
            case 3:
                C18070vi.A0d(exc, 0);
                r4 = (AnonymousClass7IB) this.A02;
                r3 = (C1606989o) this.A01;
                str = "sendRefreshedTokenRequest.FbUserEntityCallback.onError";
                break;
            case 5:
                ((AnonymousClass3LQ) this.A01).onError(3489018);
                return;
            default:
                C18070vi.A0d(exc, 0);
                ((C1606789m) this.A01).Bsw(exc);
                return;
        }
        AnonymousClass6WV r0 = r4.A05;
        StringBuilder A11 = AnonymousClass000.A11(str);
        if (r0 == null) {
            AnonymousClass7IB.A03(r4, AnonymousClass000.A0y(".invokeUserRelatedError.1", A11), C18070vi.A0M(exc), false);
        } else {
            AnonymousClass7IB.A03(r4, AnonymousClass000.A0y(".invokeUserRelatedError.2", A11), C18070vi.A0M(exc), false);
            exc = new C122826Sb(exc);
        }
        r3.Bsw(exc);
    }

    public void C7I(AnonymousClass732 r13) {
        AnonymousClass7IB r1;
        switch (this.A00) {
            case 0:
                ((AnonymousClass7RO) this.A02).run();
                return;
            case 1:
                r1 = (AnonymousClass7IB) this.A02;
                if (r13 == null) {
                    throw C17880vN.A0g();
                }
                break;
            case 2:
                r1 = (AnonymousClass7IB) this.A02;
                if (r13 == null) {
                    throw C17880vN.A0g();
                }
                break;
            case 3:
                AnonymousClass7IB r5 = (AnonymousClass7IB) this.A02;
                AnonymousClass87E r12 = r5.A06;
                if (r13 != null) {
                    AnonymousClass8AB BGW = r12.BGW(C108985cd.A0m(r13.A02));
                    Object obj = this.A01;
                    if (r5.A01 == 0) {
                        r5.A07.markerAnnotate(386138113, r5.A00, "doc_id", BGW.BQn());
                    }
                    BGW.CBv(new C144617Hz(r5, obj, 1));
                    return;
                }
                throw C17880vN.A0g();
            case 4:
                C108945cZ.A1Q(this.A02);
                return;
            case 5:
                C108945cZ.A1P(this.A02);
                return;
            default:
                ((C1606789m) this.A01).Bsw((Exception) this.A02);
                return;
        }
        AnonymousClass7IB.A00(r13, r1, (C1606989o) this.A01);
    }
}
