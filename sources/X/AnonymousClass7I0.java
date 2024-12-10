package X;

import java.io.IOException;

/* renamed from: X.7I0  reason: invalid class name */
public final class AnonymousClass7I0 implements C1606989o {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C136526tx A01;
    public final /* synthetic */ C146167Ob A02;

    public void BE5(C138506xC r8) {
        C133786pU r2;
        Exception exc;
        C18070vi.A0d(r8, 0);
        if (r8.A00 == 0) {
            C18070vi.A0d("BloksPreConsentFetcherHelper/makeFetchRequest: Success", 0);
            C136526tx r1 = this.A01;
            String str = (String) r8.A03.A00;
            if (str != null) {
                C133786pU r0 = r1.A01;
                C19995A2i a2i = r0.A00;
                boolean z = r0.A04;
                a2i.A01(r0.A01, r0.A02, r0.A03, str, z);
                return;
            }
            r1.A01.A01(new Exception("Null Payload"));
            return;
        }
        C18070vi.A0d("BloksPreConsentFetcherHelper/makeFetchRequest: Error", 0);
        C146167Ob r5 = this.A02;
        C136526tx r4 = this.A01;
        int i = this.A00;
        if (i == 0) {
            r2 = r4.A01;
            exc = new Exception("Unknown Failure");
        } else {
            AnonymousClass163 r12 = r8.A04;
            C18070vi.A0z(r12, "null cannot be cast to non-null type com.whatsapp.waffle.accountlinking.bloks.graphql.PreConsentBloksGraphqlErrorProcessor");
            Number number = (Number) r12.A00();
            if (number != null) {
                int intValue = number.intValue();
                if (intValue == 1675012) {
                    r2 = r4.A01;
                    exc = new Exception("Bad Request");
                } else if (intValue != 3489039) {
                    r2 = r4.A01;
                    exc = new Exception("Unknown Failure");
                } else {
                    C146167Ob.A00(r4, r5, i - 1, true);
                    return;
                }
            } else {
                return;
            }
        }
        r2.A01(exc);
    }

    public void BrB(IOException iOException) {
        C18070vi.A0d(iOException, 0);
        C18070vi.A0d("BloksPreConsentFetcherHelper/makeFetchRequest: onDeliveryFailure", 0);
        this.A01.A01.A00(iOException);
    }

    public void Bsw(Exception exc) {
        C18070vi.A0d(exc, 0);
        C18070vi.A0d("BloksPreConsentFetcherHelper/makeFetchRequest: onError", 0);
        this.A01.A01.A01(exc);
    }

    public AnonymousClass7I0(C136526tx r1, C146167Ob r2, int i) {
        this.A02 = r2;
        this.A01 = r1;
        this.A00 = i;
    }
}
