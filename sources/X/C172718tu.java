package X;

import com.whatsapp.infra.graphql.BaseMexCallback;
import com.whatsapp.infra.graphql.generated.mex.PasskeyExistResponseQueryResponseImpl;

/* renamed from: X.8tu  reason: invalid class name and case insensitive filesystem */
public final class C172718tu extends BaseMexCallback {
    public final /* synthetic */ BB2 A00;

    public /* bridge */ /* synthetic */ void A02(C20125A8k a8k) {
        AnonymousClass9MS r6;
        C193139pb r7;
        C18070vi.A0d(a8k, 0);
        Class<PasskeyExistResponseQueryResponseImpl.Xwa2PasskeyExist> cls = PasskeyExistResponseQueryResponseImpl.Xwa2PasskeyExist.class;
        boolean A0G = C108985cd.A0I(a8k, cls, "xwa2_passkey_exist").A0G("result");
        String A0F = C108985cd.A0I(a8k, cls, "xwa2_passkey_exist").A0F("credential");
        long A002 = ((long) C20125A8k.A00(C108985cd.A0I(a8k, cls, "xwa2_passkey_exist"), "create_ts_s")) * 1000;
        long A003 = ((long) C20125A8k.A00(C108985cd.A0I(a8k, cls, "xwa2_passkey_exist"), "used_ts_s")) * 1000;
        if (A0G) {
            if (A0F != null) {
                r7 = new C193139pb(C196759vb.A00(A0F));
            } else {
                r7 = null;
            }
            r6 = new C175318yW(r7, A002, A003);
        } else {
            r6 = C175328yX.A00;
        }
        this.A00.C7K(r6);
    }

    public boolean A05(A6Z a6z) {
        C17900vP.A0X(a6z, "PasskeyExistCheckMex/onError: MEX errored ", AnonymousClass3MZ.A19(a6z, 0));
        this.A00.Bti();
        return false;
    }

    public C172718tu(BB2 bb2) {
        this.A00 = bb2;
    }
}
