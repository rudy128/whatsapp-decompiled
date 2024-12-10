package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import java.util.List;

/* renamed from: X.6Xi  reason: invalid class name and case insensitive filesystem */
public abstract class C124176Xi {
    public static final C90594eK A00(View view, AnonymousClass1F9 r12, AnonymousClass11C r13, CharSequence charSequence, List list) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.MarginLayoutParams marginLayoutParams2;
        C18070vi.A0d(charSequence, 0);
        AnonymousClass11C r8 = r13;
        C72473Md.A1I(view, r13);
        C23520Bik A00 = C23520Bik.A00((Context) null, view, charSequence, 0);
        A00.A0E(AnonymousClass3MZ.A02(view.getContext(), view.getContext(), 2130971311, 2131102579));
        int dimensionPixelSize = view.getResources().getDimensionPixelSize(2131168774);
        BIE bie = A00.A0J;
        C18070vi.A0X(bie);
        AnonymousClass3MY.A0v(view.getContext(), bie, 2131231308);
        ViewGroup.LayoutParams layoutParams = bie.getLayoutParams();
        if (!(layoutParams instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams) == null) {
            marginLayoutParams = bie.getLayoutParams();
        } else {
            marginLayoutParams2.setMargins(marginLayoutParams2.leftMargin + dimensionPixelSize, marginLayoutParams2.topMargin, marginLayoutParams2.rightMargin + dimensionPixelSize, marginLayoutParams2.bottomMargin);
            marginLayoutParams = marginLayoutParams2;
        }
        bie.setLayoutParams(marginLayoutParams);
        C90594eK r5 = new C90594eK(r12, A00, r8, list, false);
        r5.A02();
        return r5;
    }
}
