package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.media.GridLayoutManagerNonPredictiveAnimations;
import com.whatsapp.mediacomposer.doodle.shapepicker.ShapePickerRecyclerView;
import java.util.List;
import java.util.Map;

/* renamed from: X.5lH  reason: invalid class name and case insensitive filesystem */
public class C112315lH extends C38391rD {
    public int A00 = -1;
    public int A01;
    public List A02 = AnonymousClass000.A13();
    public final /* synthetic */ AnonymousClass6z6 A03;

    public C112315lH(AnonymousClass6z6 r2) {
        this.A03 = r2;
    }

    private void A00(int i) {
        int i2 = this.A00;
        this.A00 = i;
        A0G(i2);
        A0G(this.A00);
        int max = Math.max(this.A00 - (this.A01 / 2), 0);
        AnonymousClass6z6 r2 = this.A03;
        C25272CcK ccK = r2.A04;
        if (max != ccK.A00) {
            Boolean bool = C17970vW.A03;
            ccK.A00 = max;
            r2.A03.A0e(ccK);
        }
    }

    public static void A01(C112315lH r9) {
        int i;
        int i2;
        ShapePickerRecyclerView shapePickerRecyclerView = r9.A03.A06;
        GridLayoutManagerNonPredictiveAnimations gridLayoutManagerNonPredictiveAnimations = shapePickerRecyclerView.A04;
        if (gridLayoutManagerNonPredictiveAnimations != null) {
            int A1N = gridLayoutManagerNonPredictiveAnimations.A1N();
            GridLayoutManagerNonPredictiveAnimations gridLayoutManagerNonPredictiveAnimations2 = shapePickerRecyclerView.A04;
            if (gridLayoutManagerNonPredictiveAnimations2 != null) {
                int A1P = gridLayoutManagerNonPredictiveAnimations2.A1P();
                if (A1N == 0) {
                    i = 0;
                } else if (A1P == shapePickerRecyclerView.getAdapterItemCount() - 1) {
                    i = AnonymousClass3MX.A01(r9.A02);
                } else {
                    i = -1;
                    int i3 = Integer.MAX_VALUE;
                    for (int i4 = 0; i4 < r9.A02.size(); i4++) {
                        int A0n = AnonymousClass001.A0n(r9.A02, i4);
                        if (i4 < AnonymousClass3MX.A01(r9.A02)) {
                            i2 = AnonymousClass001.A0n(r9.A02, i4 + 1) - 1;
                        } else {
                            i2 = Integer.MAX_VALUE;
                        }
                        int min = Math.min(C108945cZ.A05(A0n, A1N), C108945cZ.A05(i2, (A1N + A1P) / 2));
                        if (min < i3) {
                            i = i4;
                            i3 = min;
                        }
                    }
                }
                r9.A00(i);
                return;
            }
            throw AnonymousClass000.A0n("Must set adapter first");
        }
        throw AnonymousClass000.A0n("Must set adapter first");
    }

    public static void A02(C112315lH r4, int i) {
        AnonymousClass6z6 r1 = r4.A03;
        r1.A02 = false;
        r4.A00(i);
        ShapePickerRecyclerView shapePickerRecyclerView = r1.A06;
        int A0n = AnonymousClass001.A0n(r4.A02, i);
        GridLayoutManagerNonPredictiveAnimations gridLayoutManagerNonPredictiveAnimations = shapePickerRecyclerView.A04;
        if (gridLayoutManagerNonPredictiveAnimations != null) {
            Boolean bool = C17970vW.A03;
            C25272CcK ccK = shapePickerRecyclerView.A03;
            ccK.A00 = A0n;
            gridLayoutManagerNonPredictiveAnimations.A0e(ccK);
            return;
        }
        throw AnonymousClass000.A0n("Must set adapter first");
    }

    public long A0M(int i) {
        if (!this.A00) {
            return -1;
        }
        AnonymousClass6z6 r6 = this.A03;
        if (r6 instanceof C1196969m) {
            C1196969m r62 = (C1196969m) r6;
            boolean z = r62.A01;
            if (z && i == 0) {
                return -1;
            }
            List list = r62.A03;
            if (z) {
                i--;
            }
            String str = ((AnonymousClass725) list.get(i)).A0H;
            Map map = r62.A04;
            Number A1E = C108945cZ.A1E(str, map);
            if (A1E == null) {
                long j = r62.A00;
                r62.A00 = 1 + j;
                A1E = Long.valueOf(j);
                map.put(str, A1E);
            }
            return A1E.longValue();
        }
        throw new UnsupportedOperationException("You must override getStableId");
    }

    public int A0Q() {
        return this.A02.size();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r9, int i) {
        C113105mY r92 = (C113105mY) r9;
        int i2 = 0;
        boolean A1T = AnonymousClass000.A1T(this.A00, i);
        AnonymousClass6z6 r5 = this.A03;
        if (r5 instanceof C1196969m) {
            C1196969m r52 = (C1196969m) r5;
            boolean z = r52.A01;
            if (!z || i != 0) {
                List list = r52.A03;
                if (z) {
                    i--;
                }
                AnonymousClass725 r6 = (AnonymousClass725) list.get(i);
                String str = r6.A0H;
                ImageView imageView = r92.A01;
                if (!str.equals(imageView.getTag())) {
                    r52.A02.A0F(r6, new AnonymousClass7MZ(imageView, str));
                    View view = r92.A0H;
                    view.setContentDescription(C17880vN.A0q(view.getContext(), r6.A04, AnonymousClass3MW.A1a(), 0, 2131896074));
                }
            } else {
                ImageView imageView2 = r92.A01;
                imageView2.setTag((Object) null);
                imageView2.setImageResource(2131232332);
                View view2 = r92.A0H;
                AnonymousClass3MY.A0w(view2.getContext(), view2, 2131896071);
            }
        } else {
            ImageView imageView3 = r92.A01;
            imageView3.setImageResource(C1197069n.A01[i]);
            float f = 0.55f;
            if (A1T) {
                f = 1.0f;
            }
            imageView3.setAlpha(f);
            View view3 = r92.A0H;
            AnonymousClass3MY.A0w(view3.getContext(), view3, C1197069n.A02[i]);
        }
        View view4 = r92.A00;
        if (!A1T) {
            i2 = 8;
        }
        view4.setVisibility(i2);
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        AnonymousClass6z6 r3 = this.A03;
        C113105mY r2 = new C113105mY(AnonymousClass3MX.A09(AnonymousClass3MZ.A0D(r3.A05), viewGroup, 2131626938));
        r3.A01(r2, r3.A00);
        AnonymousClass3MZ.A1O(r2.A0H, this, r2, 10);
        return r2;
    }
}
