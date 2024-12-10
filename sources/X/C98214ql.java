package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.Pair;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.util.Log;

/* renamed from: X.4ql  reason: invalid class name and case insensitive filesystem */
public class C98214ql implements C38531rR {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C98214ql(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void Bvu(View view) {
        Drawable A0N;
        int i;
        switch (this.A00) {
            case 0:
                Context context = (Context) this.A01;
                Object obj = this.A02;
                ImageView imageView = (ImageView) view;
                C18070vi.A0h(context, obj);
                imageView.setImageResource(2131233243);
                imageView.setColorFilter(C19740yt.A00(context, 2131103331));
                C90034dQ.A01(imageView, obj, 35);
                return;
            case 1:
                C28931bI r3 = (C28931bI) this.A01;
                Object obj2 = this.A02;
                C18070vi.A0d(r3, 0);
                r3.A05(new AnonymousClass48l(obj2, 22));
                return;
            case 2:
                View view2 = (View) this.A01;
                C18070vi.A0d(view, 2);
                Drawable background = view.getBackground();
                C18070vi.A0z(background, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                GradientDrawable gradientDrawable = (GradientDrawable) background;
                gradientDrawable.mutate();
                int A012 = C62762rw.A01(view2.getContext(), 1.0f);
                Context context2 = view2.getContext();
                boolean z = ((AnonymousClass206) this.A02).A0v.A02;
                Context context3 = view2.getContext();
                int i2 = 2130969491;
                int i3 = 2131100458;
                if (z) {
                    i2 = 2130969492;
                    i3 = 2131100459;
                }
                gradientDrawable.setStroke(A012, AnonymousClass3MZ.A02(context3, context2, i2, i3));
                return;
            case 3:
                View view3 = (View) this.A01;
                C18070vi.A0d(view, 2);
                Context context4 = view3.getContext();
                boolean z2 = ((AnonymousClass206) this.A02).A0v.A02;
                Context context5 = view3.getContext();
                int i4 = 2130971968;
                int i5 = 2131103130;
                if (z2) {
                    i4 = 2130971969;
                    i5 = 2131103133;
                }
                view.setBackground(new C109475dV(C19740yt.A00(context4, AnonymousClass1YL.A01(context5, i4, i5, false))));
                view.setVisibility(0);
                return;
            default:
                C826849i r7 = (C826849i) this.A01;
                int A0M = AnonymousClass000.A0M(((Pair) this.A02).second);
                AnonymousClass4aY r4 = (AnonymousClass4aY) r7.A01;
                ImageView A0I = AnonymousClass3MX.A0I(AnonymousClass3MW.A0P(r4), 2131433503);
                if (A0I == null) {
                    Log.e("conversation/onPostExecute paymentBtn or context is null");
                    return;
                }
                Context context6 = A0I.getContext();
                if (C18020vd.A05(C18040vf.A02, r4.A3F, 12490)) {
                    if (r4.A3k.A02() == C63572tK.A0F) {
                        i = 2131231841;
                    } else {
                        if (r4.A3k.A02() == C63572tK.A0E) {
                            i = 2131231840;
                        }
                        C90104dX.A00(A0I, r7, A0M, 16);
                        r4.A4U = C72453Mb.A0r(AnonymousClass3MW.A0P(r4), 2131433506);
                        return;
                    }
                    A0N = AnonymousClass03S.A01(context6, i);
                } else {
                    A0N = r4.A3s.A0N(context6, r4.A3k.A02(), 2131101222, 2131169467);
                }
                A0I.setImageDrawable(A0N);
                C90104dX.A00(A0I, r7, A0M, 16);
                r4.A4U = C72453Mb.A0r(AnonymousClass3MW.A0P(r4), 2131433506);
                return;
        }
    }
}
