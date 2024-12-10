package X;

import android.content.Context;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import java.util.List;

/* renamed from: X.3s1  reason: invalid class name and case insensitive filesystem */
public final class C78033s1 extends AnonymousClass3WP {
    public Integer A00 = AnonymousClass00R.A01;
    public List A01;
    public final Context A02;
    public final C108875cR A03;
    public final C18030ve A04;
    public final C63232sj A05;

    public C78033s1(Context context, C108875cR r3, C63232sj r4, C18030ve r5, List list) {
        C18070vi.A0d(r4, 3);
        this.A04 = r5;
        this.A02 = context;
        this.A05 = r4;
        this.A01 = list;
        this.A03 = r3;
    }

    public final void A0U(List list) {
        Integer num;
        C179539Ij r1;
        this.A01 = C98924rw.A00(list, 5);
        if (!list.isEmpty()) {
            AnonymousClass206 A0k = AnonymousClass3MW.A0k(list, 0);
            if (A0k != null) {
                C692136i A002 = AnonymousClass2UX.A00(A0k);
                if (A002 != null) {
                    r1 = A002.A00;
                } else {
                    r1 = null;
                }
                if (r1 == C179539Ij.REELS) {
                    num = AnonymousClass00R.A00;
                    this.A00 = num;
                }
            }
            num = AnonymousClass00R.A01;
            this.A00 = num;
        }
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        CardView A002;
        AnonymousClass3ZZ r2;
        C18070vi.A0d(viewGroup, 0);
        if (i == 0) {
            C79133ud r5 = new C79133ud(this.A02, this.A03, AnonymousClass3MX.A01(this.A01));
            int dimensionPixelSize = AnonymousClass000.A0Y(r5).getDimensionPixelSize(2131166292);
            A002 = AnonymousClass3WP.A00(r5, viewGroup);
            A002.setCardElevation(0.0f);
            A002.setElevation(0.0f);
            A002.setBackground(AnonymousClass03S.A01(A002.getContext(), 2131231283));
            ViewGroup.MarginLayoutParams A0P = C72463Mc.A0P(r5);
            A0P.width = AnonymousClass000.A0Y(r5).getDimensionPixelSize(2131166294);
            A0P.height = AnonymousClass000.A0Y(r5).getDimensionPixelSize(2131166293);
            A0P.setMargins(dimensionPixelSize, dimensionPixelSize, dimensionPixelSize, dimensionPixelSize);
            r5.setLayoutParams(A0P);
            r2 = new AnonymousClass3ZZ(A002);
            ViewGroup.LayoutParams layoutParams = A002.getLayoutParams();
            layoutParams.height = -2;
            layoutParams.width = -2;
            A002.setLayoutParams(layoutParams);
        } else {
            int i2 = 2131231283;
            if (!C18020vd.A05(C18040vf.A02, this.A04, 7268)) {
                i2 = 2131231280;
            }
            A002 = AnonymousClass3WP.A00(new C79123uc(this.A02, this.A03), viewGroup);
            A002.setCardElevation(0.0f);
            A002.setElevation(0.0f);
            A002.setBackground(AnonymousClass03S.A01(A002.getContext(), i2));
            r2 = new AnonymousClass3ZZ(A002);
        }
        A002.setRadius(AnonymousClass3MW.A00(AnonymousClass000.A0Y(A002), 2131166259));
        return r2;
    }

    public int A0Q() {
        return this.A01.size();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r4, int i) {
        AnonymousClass3ZZ r42 = (AnonymousClass3ZZ) r4;
        C18070vi.A0d(r42, 0);
        r42.A0B(new AnonymousClass4TT((AnonymousClass210) this.A01.get(i), this.A01.size()));
    }

    public int getItemViewType(int i) {
        return this.A00.intValue();
    }
}
