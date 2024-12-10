package X;

import com.whatsapp.util.Log;
import com.whatsapp.waffle.wfac.ui.WfacBanViewModel;
import java.io.IOException;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.7Hz  reason: invalid class name and case insensitive filesystem */
public class C144617Hz implements C1606989o {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C144617Hz(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public void BE5(C138506xC r12) {
        C131836lk r1;
        int i;
        switch (this.A00) {
            case 0:
                String A002 = C138506xC.A00(r12);
                C134296qM r4 = (C134296qM) r12.A03.A00;
                if (r4 != null) {
                    C128416fx r13 = (C128416fx) this.A02;
                    C30391dr r3 = (C30391dr) this.A01;
                    if (r4.A00.isEmpty()) {
                        Log.e("ImagineSuggestionsRepository/Empty data returned by server");
                    } else {
                        C127236e1 r0 = r13.A01;
                        C19830z4 r6 = r0.A01;
                        C17880vN.A1D(C19830z4.A00(r6), "pref_last_updated_imagine_edit_suggestions_ts", AnonymousClass11P.A01(r0.A00));
                        JSONObject A15 = C17880vN.A15();
                        JSONArray jSONArray = new JSONArray();
                        for (C135716se r9 : r4.A00) {
                            JSONObject A152 = C17880vN.A15();
                            A152.put("image_uri", r9.A00);
                            A152.put("intent_uri", r9.A01);
                            A152.put("prompt", r9.A02);
                            A152.put("short_prompt", r9.A03);
                            jSONArray.put(A152);
                        }
                        A15.put("suggestions", jSONArray);
                        C17880vN.A1E(C19830z4.A00(r6), "pref_imagine_edit_suggestions", C18070vi.A0H(A15));
                    }
                    r3.resumeWith(r4);
                }
                if (A002 != null) {
                    ((C30391dr) this.A01).resumeWith(C30691eM.A00(new AnonymousClass6S3(A002)));
                    return;
                }
                return;
            case 1:
                C18070vi.A0d(r12, 0);
                AnonymousClass7IB.A02((AnonymousClass7IB) this.A02, r12, "sendRefreshedTokenRequest.GraphqlRequestCallbacks.callbackResponse");
                ((C1606989o) this.A01).BE5(r12);
                return;
            case 2:
                C18070vi.A0d(r12, 0);
                C1584080o r32 = new C1584080o((C22821Di) this.A01);
                AnonymousClass163 r2 = r12.A04;
                C18070vi.A0X(r2);
                AnonymousClass161 r14 = r12.A03;
                C18070vi.A0X(r14);
                if (r12.A00 == 0) {
                    Object obj = r14.A00;
                    if (obj != null) {
                        ((C22821Di) this.A02).invoke(obj);
                        return;
                    }
                    return;
                }
                Object A003 = r2.A00();
                if ((A003 instanceof C123076Ta) && A003 != null) {
                    r32.invoke(A003);
                    return;
                }
                return;
            case 5:
                AnonymousClass71O r33 = (AnonymousClass71O) this.A01;
                AnonymousClass89S r22 = (AnonymousClass89S) this.A02;
                AnonymousClass16W r15 = (AnonymousClass16W) r12.A03;
                if (r12.A00 == 0) {
                    try {
                        C128776gf A03 = r15.A03((JSONObject) r15.A00);
                        AnonymousClass71O.A01(r33, A03);
                        r22.C7O(A03);
                        return;
                    } catch (Exception unused) {
                        AnonymousClass71O.A00(r12, r22);
                        return;
                    }
                } else {
                    AnonymousClass71O.A00(r12, r22);
                    return;
                }
            case 6:
                C18070vi.A0d(r12, 0);
                if (r12.A00 != 0) {
                    AnonymousClass163 r02 = r12.A04;
                    if (r02 == null) {
                        r1 = (C131836lk) this.A01;
                        i = 2;
                    } else {
                        C131836lk r23 = (C131836lk) this.A01;
                        int A05 = C108995ce.A05(r02);
                        if (!(A05 == 1 || A05 == 2 || A05 == 3 || A05 == 4)) {
                            A05 = -1;
                        }
                        r23.A00(A05);
                        return;
                    }
                } else {
                    C134436qa r16 = (C134436qa) r12.A03.A00;
                    if (r16 == null) {
                        r1 = (C131836lk) this.A01;
                        i = 3;
                    } else {
                        String str = r16.A00;
                        WfacBanViewModel wfacBanViewModel = ((C131836lk) this.A01).A00;
                        C132556n0 A032 = WfacBanViewModel.A03(wfacBanViewModel);
                        C31081ez.A02(AnonymousClass001.A1H("WfacBanRepository/storeBanState : ", str, AnonymousClass000.A10()));
                        C17880vN.A1E(C138066wT.A00(A032.A02), "wfac_ban_state", str);
                        AnonymousClass3MX.A1K(wfacBanViewModel.A03, WfacBanViewModel.A00(str));
                        return;
                    }
                }
                r1.A00(i);
                return;
            default:
                AnonymousClass71O r42 = (AnonymousClass71O) this.A01;
                AnonymousClass89S r34 = (AnonymousClass89S) this.A02;
                AnonymousClass16W r17 = (AnonymousClass16W) r12.A03;
                if (r12.A00 == 0) {
                    try {
                        C128776gf A033 = r17.A03((JSONObject) r17.A00);
                        AnonymousClass71O.A01(r42, A033);
                        Log.i("BanAppealRepository/clearFormReviewDraft");
                        C17880vN.A1B(C19830z4.A00(r42.A06), "support_ban_appeal_form_review_draft");
                        r34.C7O(A033);
                        return;
                    } catch (Exception unused2) {
                        AnonymousClass71O.A00(r12, r34);
                        return;
                    }
                } else {
                    AnonymousClass71O.A00(r12, r34);
                    return;
                }
        }
    }

    public void BrB(IOException iOException) {
        switch (this.A00) {
            case 0:
                C18070vi.A0d(iOException, 0);
                iOException.getMessage();
                ((C30391dr) this.A01).resumeWith(C108945cZ.A1J(iOException));
                return;
            case 1:
                C18070vi.A0d(iOException, 0);
                AnonymousClass7IB.A03((AnonymousClass7IB) this.A02, "sendRefreshedTokenRequest.GraphqlRequestCallbacks.onDeliveryFailure", C18070vi.A0M(iOException), false);
                ((C1606989o) this.A01).BrB(iOException);
                return;
            case 2:
                C18070vi.A0d(iOException, 0);
                ((C22821Di) this.A01).invoke(new AnonymousClass6D1(iOException));
                return;
            case 6:
                C31081ez.A02("WfacBanViewModel/updateBanState fetchBanStatus onDeliveryFailure");
                return;
            default:
                ((AnonymousClass89S) this.A02).Btp(C17880vN.A0i());
                return;
        }
    }

    public void Bsw(Exception exc) {
        switch (this.A00) {
            case 0:
                C18070vi.A0d(exc, 0);
                exc.getMessage();
                ((C30391dr) this.A01).resumeWith(C108945cZ.A1J(exc));
                return;
            case 1:
                C18070vi.A0d(exc, 0);
                AnonymousClass7IB.A03((AnonymousClass7IB) this.A02, "sendRefreshedTokenRequest.GraphqlRequestCallbacks.onError", C18070vi.A0M(exc), false);
                ((C1606989o) this.A01).Bsw(exc);
                return;
            case 2:
                C18070vi.A0d(exc, 0);
                ((C22821Di) this.A01).invoke(new AnonymousClass6D4(exc));
                return;
            case 6:
                ((C131836lk) this.A01).A00(-1);
                return;
            default:
                ((AnonymousClass89S) this.A02).Btp(C17880vN.A0i());
                return;
        }
    }
}
