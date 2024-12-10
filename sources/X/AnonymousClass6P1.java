package X;

import java.security.PrivateKey;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.6P1  reason: invalid class name */
public final class AnonymousClass6P1 extends AnonymousClass9N7 implements AnonymousClass1O5 {
    public final C129436hn A00;

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, X.2rm] */
    /* JADX WARNING: type inference failed for: r4v1, types: [java.lang.Object, X.2rm] */
    /* JADX WARNING: type inference failed for: r1v25, types: [java.lang.Object, X.87L] */
    public static final void A00(C29621ca r12, C129436hn r13, AnonymousClass9F5 r14) {
        AnonymousClass1UI r0;
        AnonymousClass1UI r02;
        int A0G = C72453Mb.A0G(r14, r13, 1);
        ArrayList A13 = AnonymousClass000.A13();
        try {
            C108945cZ.A1N(r12);
            C29621ca BVP = r14.BVP();
            ? obj = new Object();
            C137706vt r7 = C137706vt.A00;
            C122316Ou r1 = (C122316Ou) obj.A03(r12, C108945cZ.A0W(r7, 23), new String[]{"encryption_metadata"});
            if (r1 == null) {
                r02 = AnonymousClass1O9.A00(obj);
            } else if (obj.A03(r12, new C21160AfV(BVP, r7, 12), new String[0]) != null) {
                C18070vi.A0d("AccountLinkingFbUserEntityOperationHelper/fetchNonce/success", 0);
                C35081lc r10 = r13.A02;
                PrivateKey privateKey = r13.A03.getPrivate();
                JSONObject A0l = C108975cc.A0l(new C129006h6(r1.A02, r1.A01, r1.A00, r1.A03), (A0V) r10.A04.get(), privateKey);
                try {
                    AnonymousClass00H r4 = r10.A05;
                    r4.get();
                    long j = C108985cd.A0v(A0l).getLong("fbid");
                    Number number = (Number) AnonymousClass732.A00(r13.A00);
                    if (number == null || number.longValue() != j) {
                        C18070vi.A0d("AccountLinkingFbUserEntityOperationHelper/fetchNonce/fbid null", 0);
                        r13.A01.Bsw(AnonymousClass000.A0n("ids do not match"));
                        return;
                    }
                    r4.get();
                    r13.A01.onSuccess(new C1418477e(new Object(), C18070vi.A0J("nonce", C108985cd.A0v(A0l)), "waffleCompanionLinkingNonce"));
                    return;
                } catch (JSONException e) {
                    C18070vi.A0d(C17900vP.A0C("AccountLinkingFbUserEntityOperationHelper/fetchNonce/error ", AnonymousClass000.A10(), e), 0);
                    r13.A01.Bsw(AnonymousClass000.A0n("Error parsing nonce from response"));
                    return;
                }
            } else {
                r02 = AnonymousClass1O9.A00(obj);
            }
            throw r02;
        } catch (AnonymousClass1UI e2) {
            A13.add(C17900vP.A0C("GetNonceResponseSuccess: ", AnonymousClass000.A10(), e2));
            C108945cZ.A1N(r12);
            C29621ca BVP2 = r14.BVP();
            ? obj2 = new Object();
            C137706vt r8 = C137706vt.A00;
            if (obj2.A03(r12, new C21160AfV(BVP2, r8, 11), new String[0]) != null) {
                C22470B9c[] b9cArr = new C22470B9c[12];
                b9cArr[0] = C108945cZ.A0W(r8, 17);
                b9cArr[1] = C108945cZ.A0W(r8, 18);
                b9cArr[A0G] = C108945cZ.A0W(r8, 19);
                b9cArr[3] = C108945cZ.A0W(r8, 20);
                b9cArr[4] = C108945cZ.A0W(r8, 21);
                b9cArr[5] = C108945cZ.A0W(r8, 22);
                b9cArr[6] = C108945cZ.A0W(r8, 11);
                b9cArr[7] = C108945cZ.A0W(r8, 12);
                b9cArr[8] = C108945cZ.A0W(r8, 13);
                b9cArr[9] = C108945cZ.A0W(r8, 14);
                b9cArr[10] = C108945cZ.A0W(r8, 15);
                Object A06 = obj2.A06(r12, "IQErrorBadRequest|IQErrorRequestTimeout|IQErrorPayloadEncDec|IQErrorInternalServerError|IQErrorServiceUnavailable|IQErrorNotAuthorized|IQErrorRateOverlimit|IQErrorNotAllowed|IQErrorWFNotFound|IQErrorWFStateMismatch|IQErrorWFSuspended|IQErrorConflict", C18070vi.A0O(C108945cZ.A0W(r8, 16), b9cArr, 11), new String[]{"error"});
                if (A06 != null) {
                    r13.A01.Bsw(new C122936Sm(r12, String.valueOf(((C1603988h) A06).BOr())));
                    return;
                }
                r0 = AnonymousClass1O9.A00(obj2);
            } else {
                r0 = AnonymousClass1O9.A00(obj2);
            }
            throw r0;
        } catch (AnonymousClass1UI e3) {
            throw new AnonymousClass1UI(AnonymousClass000.A0y(C108995ce.A0X("\n", A13), C108995ce.A0a(C17900vP.A0C("GetNonceResponseError: ", AnonymousClass000.A10(), e3), A13)));
        }
    }

    public void BrD(String str) {
        C18070vi.A0d(str, 0);
    }

    public AnonymousClass6P1(C129436hn r1, AnonymousClass9F5 r2) {
        this.A00 = r2;
        this.A00 = r1;
    }

    public void Bt9(C29621ca r3, String str) {
        A00(r3, this.A00, (AnonymousClass9F5) C108955ca.A0c(this, r3));
    }

    public void C7Z(C29621ca r3, String str) {
        A00(r3, this.A00, (AnonymousClass9F5) C108955ca.A0c(this, r3));
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
