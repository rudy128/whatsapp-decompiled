package X;

import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.3WY  reason: invalid class name */
public final class AnonymousClass3WY extends C38391rD {
    public List A00 = AnonymousClass000.A13();
    public final C87704Wq A01;

    public void Bmc(C42011xT r6, int i) {
        C18070vi.A0d(r6, 0);
        List list = this.A00;
        int i2 = ((C86774Ta) list.get(i)).A00;
        String valueOf = String.valueOf(((C86774Ta) list.get(i)).A01);
        C87704Wq r2 = this.A01;
        ((AnonymousClass3YW) r6).A00.A07(new C87084Uf(r2, valueOf, new C99194sQ(r2, i2, 1), i2));
    }

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        return new AnonymousClass3YW(new AnonymousClass3SE(AnonymousClass3MY.A05(viewGroup)));
    }

    public int A0Q() {
        return this.A00.size();
    }

    public AnonymousClass3WY(C87704Wq r2) {
        this.A01 = r2;
    }
}
