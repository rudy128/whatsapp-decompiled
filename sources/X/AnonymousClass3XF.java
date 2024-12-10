package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* renamed from: X.3XF  reason: invalid class name */
public final class AnonymousClass3XF extends C38391rD {
    public final C84344Jd A00;
    public final C37451pZ A01;
    public final AnonymousClass29x A02 = ((AnonymousClass29x) AnonymousClass12Q.A01(16446));
    public final C108505bo A03;
    public final List A04;

    public void A0T(RecyclerView recyclerView) {
        C18070vi.A0d(recyclerView, 0);
        this.A01.A02();
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        View inflate = C72463Mc.A0K(viewGroup, 0).inflate(i, viewGroup, false);
        if (i == 2131625309) {
            C84344Jd r2 = this.A00;
            C18070vi.A0b(inflate);
            C37451pZ r3 = this.A01;
            C108505bo r1 = this.A03;
            List list = C42011xT.A0I;
            return new C80923yN(inflate, AnonymousClass3MZ.A0T(r2.A00.A01.A00), r3, r1);
        } else if (i == 2131625308) {
            AnonymousClass29x r12 = this.A02;
            C108505bo r0 = this.A03;
            Context A0A = C72483Me.A0A(r12);
            try {
                return new C80913yM(inflate, r0);
            } finally {
                AnonymousClass12Q.A04();
                AnonymousClass114.A02(A0A);
            }
        } else {
            throw AnonymousClass000.A0n("Unsupported view type");
        }
    }

    public int A0Q() {
        return this.A04.size();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r6, int i) {
        C73823Xl r62 = (C73823Xl) r6;
        int i2 = 0;
        C18070vi.A0d(r62, 0);
        C106895Xp r4 = (C106895Xp) this.A04.get(i);
        if (r62 instanceof C80923yN) {
            C80923yN r63 = (C80923yN) r62;
            C96044nD r42 = (C96044nD) r4;
            int i3 = 0;
            C18070vi.A0d(r42, 0);
            r63.A00 = r42;
            View A0A = AnonymousClass3Ma.A0A(r63.A05);
            C18070vi.A0X(A0A);
            boolean z = r42.A02;
            if (!z) {
                i3 = 8;
            }
            A0A.setVisibility(i3);
            View A0A2 = AnonymousClass3Ma.A0A(r63.A06);
            C18070vi.A0X(A0A2);
            if (!z) {
                i2 = 8;
            }
            A0A2.setVisibility(i2);
            C37451pZ r2 = r63.A01;
            AnonymousClass1E7 r1 = r42.A00;
            r2.A07((ImageView) AnonymousClass3MY.A0l(r63.A04), r1);
            ((C42141xh) AnonymousClass3MY.A0l(r63.A03)).A05(r1);
        }
    }

    public int getItemViewType(int i) {
        Object obj = this.A04.get(i);
        if (obj instanceof C96044nD) {
            return 2131625309;
        }
        if (obj instanceof C96054nE) {
            return 2131625308;
        }
        throw AnonymousClass3MW.A14();
    }

    public AnonymousClass3XF(Context context, C84344Jd r3, C27201Vd r4, C108505bo r5, List list) {
        C18070vi.A0k(r4, r3);
        this.A00 = r3;
        this.A03 = r5;
        this.A04 = list;
        this.A01 = r4.A06(context, "favorites-activity--list-single");
    }
}
