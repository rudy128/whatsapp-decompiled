package X;

import com.whatsapp.data.repository.MetaAISearchRepository;
import com.whatsapp.data.repository.MetaAiTypeaheadRepository;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.7I1  reason: invalid class name */
public class AnonymousClass7I1 implements C1606989o {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public AnonymousClass7I1(Object obj, Object obj2, Object obj3, int i) {
        this.A00 = i;
        this.A01 = obj3;
        this.A03 = obj;
        this.A02 = obj2;
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [X.6UN, java.lang.Object] */
    public void BE5(C138506xC r16) {
        Object r1;
        C138506xC r5 = r16;
        switch (this.A00) {
            case 0:
                C18070vi.A0d(r5, 0);
                C31761g5 r3 = (C31761g5) this.A01;
                if (r3.Be2()) {
                    MetaAiTypeaheadRepository metaAiTypeaheadRepository = (MetaAiTypeaheadRepository) this.A03;
                    Runnable runnable = (Runnable) ((C98494rF) this.A02).element;
                    if (runnable != null) {
                        metaAiTypeaheadRepository.A00.CEz(runnable);
                    }
                    String str = (String) r5.A04.A00();
                    C1417676w r12 = (C1417676w) r5.A03.A00;
                    if (r12 != null) {
                        if (r12.A00.isEmpty()) {
                            if (metaAiTypeaheadRepository instanceof MetaAISearchRepository) {
                                r1 = C30691eM.A00(new AnonymousClass6S1("Empty data returned by server"));
                            } else {
                                r1 = new C1417676w(C18460wS.A00);
                            }
                            r3.resumeWith(r1);
                        } else {
                            r3.resumeWith(r12);
                            return;
                        }
                    }
                    if (str != null) {
                        MetaAiTypeaheadRepository.A00(new AnonymousClass6S1(str), r3);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                C18070vi.A0d(r5, 0);
                AnonymousClass7IB.A02((AnonymousClass7IB) this.A03, r5, "sendInitialRequest.GraphqlRequestCallbacks.callbackResponse");
                ((C1606989o) this.A01).BE5(r5);
                return;
            default:
                try {
                    JSONObject jSONObject = r5.A05.getJSONObject("data").getJSONObject("purpose_public_keys");
                    String A0J = C18070vi.A0J("purpose_public_ek", jSONObject);
                    String A0J2 = C18070vi.A0J("purpose_public_ik", jSONObject);
                    C18070vi.A0X(jSONObject.getString("purpose_public_ik_sig"));
                    C18070vi.A0X(jSONObject.getString("purpose_dummy_ciphertext"));
                    String A0J3 = C18070vi.A0J("purpose_dummy_nonce", jSONObject);
                    ? obj = new Object();
                    obj.A01 = A0J;
                    obj.A02 = A0J2;
                    obj.A00 = A0J3;
                    C129336hd r0 = (C129336hd) this.A02;
                    AnonymousClass71O r32 = r0.A01;
                    String str2 = r0.A02;
                    String str3 = r0.A03;
                    AnonymousClass89S r2 = r0.A00;
                    String A022 = r32.A09.A02(r32.A05.A00);
                    AnonymousClass10E r02 = r32.A02.A00.A00;
                    C18030ve A8r = AnonymousClass10E.A8r(r02);
                    AnonymousClass181 A0H = C108965cb.A0H(r02);
                    C19830z4 A0c = AnonymousClass3Ma.A0c(r02);
                    AnonymousClass00H A14 = C108945cZ.A14(r02);
                    new C1191967c(A0H, A0c, A8r, C108955ca.A0X(r02), obj, A14, str3, str2, A022, (C128176fZ) this.A03).CBv(new C144617Hz(r2, r32, 3));
                    return;
                } catch (JSONException unused) {
                    ((C129336hd) this.A02).A00.Btp(C17880vN.A0i());
                    return;
                }
        }
    }

    public void BrB(IOException iOException) {
        switch (this.A00) {
            case 0:
                C18070vi.A0d(iOException, 0);
                MetaAiTypeaheadRepository metaAiTypeaheadRepository = (MetaAiTypeaheadRepository) this.A03;
                iOException.getMessage();
                C31761g5 r2 = (C31761g5) this.A01;
                if (r2.Be2()) {
                    Runnable runnable = (Runnable) ((C98494rF) this.A02).element;
                    if (runnable != null) {
                        metaAiTypeaheadRepository.A00.CEz(runnable);
                    }
                    MetaAiTypeaheadRepository.A00(iOException, r2);
                    return;
                }
                return;
            case 1:
                C18070vi.A0d(iOException, 0);
                AnonymousClass7IB.A03((AnonymousClass7IB) this.A03, "sendInitialRequest.GraphqlRequestCallbacks.onDeliveryFailure", C18070vi.A0M(iOException), false);
                ((C1606989o) this.A01).BrB(iOException);
                return;
            default:
                ((C129336hd) this.A02).A00.Btp(C17880vN.A0i());
                return;
        }
    }

    public void Bsw(Exception exc) {
        switch (this.A00) {
            case 0:
                C18070vi.A0d(exc, 0);
                MetaAiTypeaheadRepository metaAiTypeaheadRepository = (MetaAiTypeaheadRepository) this.A03;
                exc.getMessage();
                C31761g5 r2 = (C31761g5) this.A01;
                if (r2.Be2()) {
                    Runnable runnable = (Runnable) ((C98494rF) this.A02).element;
                    if (runnable != null) {
                        metaAiTypeaheadRepository.A00.CEz(runnable);
                    }
                    MetaAiTypeaheadRepository.A00(exc, r2);
                    return;
                }
                return;
            case 1:
                C18070vi.A0d(exc, 0);
                if (!(exc instanceof C122816Sa) || ((C122816Sa) exc).error.A01 != 190) {
                    AnonymousClass7IB.A03((AnonymousClass7IB) this.A03, "sendInitialRequest.GraphqlRequestCallbacks.onError", C18070vi.A0M(exc), false);
                    ((C1606989o) this.A01).Bsw(exc);
                    return;
                }
                AnonymousClass732 r5 = (AnonymousClass732) this.A02;
                AnonymousClass7IB r4 = (AnonymousClass7IB) this.A03;
                boolean z = r4.A04.A01;
                AnonymousClass19T r22 = r4.A07;
                int i = r4.A00;
                if (z) {
                    r22.markerPoint(386138113, i, "refresh_token_with_certificate");
                    r4.A03.A02(r5, new AnonymousClass7GT(r4, this.A01, 3), (AnonymousClass705) null);
                    return;
                }
                r22.markerPoint(386138113, i, "create_user_without_certificate");
                AnonymousClass7IB.A01(r4, (C1606989o) this.A01);
                throw null;
            default:
                ((C129336hd) this.A02).A00.Btp(C17880vN.A0i());
                return;
        }
    }
}
