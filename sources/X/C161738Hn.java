package X;

import android.app.Activity;
import android.view.ViewGroup;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8Hn  reason: invalid class name and case insensitive filesystem */
public final class C161738Hn extends C38391rD {
    public final int A00;
    public final Activity A01;
    public final AnonymousClass1VW A02;
    public final C37451pZ A03;
    public final C184909bi A04;
    public final AnonymousClass1R2 A05;
    public final List A06;
    public final List A07;

    public void Bmc(C42011xT r8, int i) {
        C18070vi.A0d(r8, 0);
        int i2 = r8.A01;
        if (i2 == 0) {
            AnonymousClass8J7 r82 = (AnonymousClass8J7) r8;
            C21346Aia aia = (C21346Aia) this.A06.get(i);
            if (aia.A06) {
                r82.A01.setText(this.A05.A0R(aia.A03, (AnonymousClass1BI) null, false));
                this.A02.A0B(r82.A00, (AnonymousClass1VX) null, 2131231047);
                return;
            }
            Iterator it = this.A07.iterator();
            while (it.hasNext()) {
                AnonymousClass1E7 A0O = C17880vN.A0O(it);
                if (C18070vi.A18(A0O.A0J, aia.A04)) {
                    this.A03.A07(r82.A00, A0O);
                    r82.A01.setText(this.A05.A0R(aia.A03, A0O.A0J, false));
                    return;
                }
            }
        } else if (i2 == 1 && i == 3) {
            AnonymousClass8J8 r83 = (AnonymousClass8J8) r8;
            r83.A01.setText(2131894054);
            r83.A00.setImageResource(2131232183);
        }
    }

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        C42011xT r2;
        C18070vi.A0d(viewGroup, 0);
        if (i == 0) {
            List list = C42011xT.A0I;
            r2 = new AnonymousClass8J7(AnonymousClass3MX.A0B(this.A01.getLayoutInflater(), viewGroup, 2131626363, false), this.A04);
        } else if (i == 1) {
            List list2 = C42011xT.A0I;
            r2 = new AnonymousClass8J8(AnonymousClass3MX.A0B(this.A01.getLayoutInflater(), viewGroup, 2131626363, false), this.A04);
        } else {
            throw AnonymousClass000.A0k("Invalid view type");
        }
        return r2;
    }

    public int getItemViewType(int i) {
        return i <= 2 ? 0 : 1;
    }

    public int A0Q() {
        int size = this.A06.size();
        if (size > 3) {
            return this.A00;
        }
        return size;
    }

    public C161738Hn(Activity activity, AnonymousClass1VW r3, C37451pZ r4, C184909bi r5, AnonymousClass1R2 r6, List list, List list2, int i) {
        C18070vi.A0o(activity, r3, list);
        AnonymousClass8BU.A1H(r4, 5, r6);
        this.A01 = activity;
        this.A02 = r3;
        this.A07 = list;
        this.A06 = list2;
        this.A03 = r4;
        this.A00 = i;
        this.A05 = r6;
        this.A04 = r5;
    }
}
