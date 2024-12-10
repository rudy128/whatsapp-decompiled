package X;

import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.5kk  reason: invalid class name and case insensitive filesystem */
public final class C111985kk extends C38391rD {
    public List A00;
    public final C37451pZ A01;

    public C111985kk(C37451pZ r2) {
        C18070vi.A0d(r2, 1);
        this.A01 = r2;
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        return new C113155md(AnonymousClass3MX.A0B(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131627003, false));
    }

    public int A0Q() {
        return AnonymousClass001.A0m(this.A00);
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r6, int i) {
        C113155md r62 = (C113155md) r6;
        C18070vi.A0d(r62, 0);
        List list = this.A00;
        if (list != null) {
            this.A01.A0C(r62.A00, ((AnonymousClass6f2) list.get(i)).A00, false);
            r62.A01.A0S(((AnonymousClass6f2) list.get(i)).A01, (List) null, 0, false);
        }
    }
}
