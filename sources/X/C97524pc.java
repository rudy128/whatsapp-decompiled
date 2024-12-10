package X;

import android.util.Pair;
import com.whatsapp.util.Log;

/* renamed from: X.4pc  reason: invalid class name and case insensitive filesystem */
public final class C97524pc implements AnonymousClass1O5 {
    public final /* synthetic */ C87604Wf A00;

    public void BrD(String str) {
        Log.w(AnonymousClass001.A1H("JoinSubgroupProtocolHelper/onDeliveryFailure iqid=", str, AnonymousClass3MZ.A19(str, 0)));
        C87604Wf r1 = this.A00;
        C199410f r0 = C87604Wf.A02;
        AnonymousClass3VM.A00(r1.A00.A01.A00, 0);
    }

    public void Bt9(C29621ca r5, String str) {
        Object obj;
        int intValue;
        C18070vi.A0d(r5, 1);
        Log.e("JoinSubgroupProtocolHelper/onError");
        Pair A01 = C60482o6.A01(r5);
        if (!(A01 == null || (obj = A01.first) == null)) {
            C17900vP.A0X(obj, "JoinSubgroupProtocolHelper/onError: ", AnonymousClass000.A10());
            Object obj2 = A01.first;
            Number number = (Number) obj2;
            if (number != null && ((intValue = number.intValue()) == 304 || intValue == 400 || intValue == 403 || intValue == 401 || intValue == 404 || intValue == 405 || intValue == 409 || intValue == 412 || intValue == 419 || intValue == 426 || intValue == 406 || intValue == 500)) {
                C87604Wf r1 = this.A00;
                C199410f r0 = C87604Wf.A02;
                C85504Nq r2 = r1.A00;
                C18070vi.A0W(obj2);
                int A0M = AnonymousClass000.A0M(obj2);
                AnonymousClass4L0 r02 = r2.A01;
                AnonymousClass1EC r3 = r2.A03;
                AnonymousClass3VM.A00(r02.A00, A0M);
                if (A0M == 409) {
                    r2.A02.A05.A0Z.A0H(r3, "subgroup_conflict_recovery", 3);
                    return;
                }
                return;
            }
        }
        C87604Wf r12 = this.A00;
        C199410f r03 = C87604Wf.A02;
        AnonymousClass3VM.A00(r12.A00.A01.A00, -1);
    }

    public void C7Z(C29621ca r5, String str) {
        C18070vi.A0d(r5, 1);
        C29621ca A0K = r5.A0K("membership_approval_request");
        C87604Wf r1 = this.A00;
        C199410f r0 = C87604Wf.A02;
        C85504Nq r12 = r1.A00;
        if (A0K != null) {
            C84824Kz r02 = r12.A00;
            AnonymousClass3VM.A04(r02.A00, r12.A03, 1);
            return;
        }
        C84824Kz r03 = r12.A00;
        AnonymousClass3VM.A04(r03.A00, r12.A03, 0);
    }

    public C97524pc(C87604Wf r1) {
        this.A00 = r1;
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
