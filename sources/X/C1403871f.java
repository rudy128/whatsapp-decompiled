package X;

import android.content.Context;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.TextAppearanceSpan;
import android.view.View;
import android.widget.TextView;

/* renamed from: X.71f  reason: invalid class name and case insensitive filesystem */
public final class C1403871f {
    public final int A00;
    public final View A01;
    public final View A02;

    public C1403871f(View view, View view2, int i) {
        C18070vi.A0e(view, 1, view2);
        this.A02 = view;
        this.A01 = view2;
        this.A00 = i;
        view.getViewTreeObserver().addOnScrollChangedListener(new AnonymousClass79B(this, 1));
    }

    public static final void A01(Context context, ClickableSpan clickableSpan, TextView textView, String str, int i) {
        C18070vi.A0j(textView, str);
        SpannableString spannableString = new SpannableString(str);
        int length = str.length();
        spannableString.setSpan(clickableSpan, 0, length, 0);
        spannableString.setSpan(new TextAppearanceSpan(context, i), 0, length, 0);
        spannableString.setSpan(new C109705ds(), 0, length, 0);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        textView.setText(spannableString, TextView.BufferType.SPANNABLE);
    }

    public final void A02() {
        AnonymousClass79A.A00(this.A02.getViewTreeObserver(), this, 6);
    }

    public static C1403871f A00(Context context, View view, View view2) {
        return new C1403871f(view, view2, context.getResources().getDimensionPixelSize(2131168631));
    }
}
