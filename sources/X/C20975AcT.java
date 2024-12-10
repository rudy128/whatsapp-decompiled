package X;

import com.whatsapp.group.iq.GetGroupInfoProtocolHelper;
import java.util.Iterator;

/* renamed from: X.AcT  reason: case insensitive filesystem */
public final class C20975AcT implements AnonymousClass1O5 {
    public final /* synthetic */ int A00;
    public final /* synthetic */ GetGroupInfoProtocolHelper A01;
    public final /* synthetic */ C31761g5 A02;

    public void BrD(String str) {
        C18070vi.A0d(str, 0);
        AnonymousClass8BT.A1P(C30691eM.A00(new AnonymousClass9L6(str)), this.A02);
    }

    public void C7Z(C29621ca r6, String str) {
        C18070vi.A0d(r6, 1);
        GetGroupInfoProtocolHelper getGroupInfoProtocolHelper = this.A01;
        C31761g5 r4 = this.A02;
        C63262sm r3 = new C63262sm("group_response", this.A00);
        AnonymousClass190 r1 = getGroupInfoProtocolHelper.A00;
        AnonymousClass00H r2 = getGroupInfoProtocolHelper.A02;
        C59962nA A012 = C196859vl.A01(r1, (AnonymousClass126) r2.get(), r3, r6);
        AnonymousClass126 r0 = (AnonymousClass126) r2.get();
        if (A012 != null) {
            r0.A0T(A012);
        }
        AnonymousClass8BT.A1P(A012, r4);
    }

    public C20975AcT(GetGroupInfoProtocolHelper getGroupInfoProtocolHelper, C31761g5 r2, int i) {
        this.A01 = getGroupInfoProtocolHelper;
        this.A02 = r2;
        this.A00 = i;
    }

    public void Bt9(C29621ca r4, String str) {
        Throwable A0s;
        C18070vi.A0h(str, r4);
        Iterator A0r = AnonymousClass8BW.A0r(r4, "error");
        while (true) {
            if (!A0r.hasNext()) {
                A0s = AnonymousClass000.A0s("Expected to get an error code but none was found");
                break;
            }
            String A022 = C29621ca.A02(C17880vN.A0a(A0r), "code");
            if (A022 != null) {
                A0s = new AnonymousClass9LJ(str, Integer.parseInt(A022));
                break;
            }
        }
        AnonymousClass8BT.A1P(C108945cZ.A1J(A0s), this.A02);
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
