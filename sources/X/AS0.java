package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.whatsapp.infra.graphql.generated.www_account_infra.WWWGetCertificatesResponseImpl;

public abstract class AS0 implements C72183Ky {
    public final AnonymousClass11P A00;
    public final AnonymousClass00H A01;

    public abstract String A00();

    public AS0(AnonymousClass11P r1, AnonymousClass00H r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public void BKz(C22542BBz bBz) {
        long A04 = C17880vN.A04(System.currentTimeMillis());
        C162478Kx A002 = C162478Kx.A00(GraphQlCallInput.A02, A00(), "use_case");
        C162478Kx.A01(A002, String.valueOf(A04), "request_time");
        A7K A003 = A7K.A00();
        C108975cc.A0z(A002, A003, "input");
        C108975cc.A0J(AIj.A00(A003, WWWGetCertificatesResponseImpl.class, "WWWGetCertificates"), this.A01).A04(new C21535Ali(bBz, 27));
    }
}
