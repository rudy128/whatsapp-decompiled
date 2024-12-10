package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.6n3  reason: invalid class name */
public final class AnonymousClass6n3 {
    public final /* synthetic */ C132206mO A00;
    public final /* synthetic */ C135586sR A01;
    public final /* synthetic */ AnonymousClass71L A02;

    public AnonymousClass6n3(C132206mO r1, C135586sR r2, AnonymousClass71L r3) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = r1;
    }

    public void A00(int i, Integer num) {
        AnonymousClass6YJ.A00(AnonymousClass001.A1I("XFamilyCrosspostRequestManager/generateCrosspostGraphqlCallback unknown error with code: ", AnonymousClass000.A10(), i), (Throwable) null);
        AnonymousClass1IX r0 = this.A01.A00;
        ArrayList A0D = C29351c6.A0D(r0);
        Iterator it = r0.iterator();
        while (it.hasNext()) {
            C108995ce.A1Q(A0D, it);
        }
        AnonymousClass71L r1 = this.A02;
        AnonymousClass74B.A06(r1.A00, (AnonymousClass2LI) C18070vi.A0E(r1.A03), r1.A06, A0D, 4);
        this.A00.A00(i, num);
    }
}
