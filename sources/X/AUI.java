package X;

import com.whatsapp.protocol.SetGroupDescriptionProtocolHelper;
import com.whatsapp.util.Log;

public final class AUI implements BC3 {
    public final /* synthetic */ AnonymousClass1EC A00;
    public final /* synthetic */ SetGroupDescriptionProtocolHelper A01;
    public final /* synthetic */ C31761g5 A02;

    public void BrD(String str) {
        C18070vi.A0d(str, 0);
        Log.w("groupinfo/setgroupdescription/delivery failure");
        AnonymousClass8BT.A1P(C30691eM.A00(new AnonymousClass9L6(str)), this.A02);
    }

    public void Bt1(String str, int i) {
        C18070vi.A0d(str, 0);
        AnonymousClass8BT.A1P(C30691eM.A00(new AnonymousClass9LJ(str, i)), this.A02);
    }

    public AUI(AnonymousClass1EC r1, SetGroupDescriptionProtocolHelper setGroupDescriptionProtocolHelper, C31761g5 r3) {
        this.A02 = r3;
        this.A01 = setGroupDescriptionProtocolHelper;
        this.A00 = r1;
    }

    public void onSuccess() {
        this.A01.A02.A03(this.A00, false);
        AnonymousClass8BT.A1P(C27621Wu.A00, this.A02);
    }
}
