package X;

import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.5ky  reason: invalid class name and case insensitive filesystem */
public class C112125ky extends C38391rD {
    public int A00 = 0;
    public AEX A01;
    public final C132646nG A02;
    public final AnonymousClass72F A03;
    public final C1601487h A04;
    public final List A05 = AnonymousClass000.A13();

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r8, int i) {
        C113545nG r3 = (C113545nG) r8;
        AnonymousClass6nH r4 = (AnonymousClass6nH) this.A05.get(i);
        r3.A0B(r4);
        r3.A0H.setOnClickListener(new AnonymousClass78D(this, r3, r4, i, 4));
    }

    public int A0Q() {
        return this.A05.size();
    }

    public C112125ky(C132646nG r2, AnonymousClass72F r3, C1601487h r4) {
        this.A03 = r3;
        this.A02 = r2;
        this.A04 = r4;
    }

    public void A0U(List list) {
        list.size();
        List list2 = this.A05;
        C72473Md.A1B(new C111395je(list2, list), this, list, list2);
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        return new C113545nG(AnonymousClass3MX.A09(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131625293), this.A02, this.A03);
    }
}
