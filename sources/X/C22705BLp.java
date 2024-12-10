package X;

import android.content.Context;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.BLp  reason: case insensitive filesystem */
public final class C22705BLp extends C38391rD {
    public List A00;
    public final C22821Di A01;

    public C22705BLp(List list, C22821Di r3) {
        C18070vi.A0d(list, 1);
        this.A00 = list;
        this.A01 = r3;
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        List list = C42011xT.A0I;
        Context A04 = AnonymousClass3MY.A04(viewGroup);
        List list2 = this.A00;
        if (i == 0) {
            return new BMK(new BHY(A04, (C25234CbV) C29431cG.A0d(list2)));
        }
        return new BMK(new BHY(A04, (C25234CbV) C29431cG.A0b(list2)));
    }

    public int A0Q() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r4, int i) {
        BMK bmk = (BMK) r4;
        C18070vi.A0d(bmk, 0);
        BHY bhy = bmk.A00;
        bhy.setData((C25234CbV) this.A00.get(i));
        bhy.setOnClickListener(new C90104dX(this, i, 28));
    }

    public int getItemViewType(int i) {
        return ((C25234CbV) this.A00.get(i)).A07 ^ true ? 1 : 0;
    }
}
