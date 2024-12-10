package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.WaImageView;
import java.util.List;

/* renamed from: X.71D  reason: invalid class name */
public final class AnonymousClass71D {
    public final C19830z4 A00;
    public final AnonymousClass00H A01;
    public final List A02;
    public final C18000vb A03;

    public AnonymousClass71D(C19830z4 r7, C18000vb r8, AnonymousClass00H r9) {
        C18070vi.A0d(r8, 1);
        AnonymousClass3Ma.A1O(r7, 2, r9);
        this.A03 = r8;
        this.A00 = r7;
        this.A01 = r9;
        AnonymousClass7PS[] r5 = new AnonymousClass7PS[2];
        r5[0] = new AnonymousClass7PS(2131233454, 2131890555, 2131890552);
        this.A02 = C18070vi.A0O(new AnonymousClass7PS(2131233453, 2131890556, 2131890554), r5, 1);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.5gD, android.widget.LinearLayout, android.view.ViewGroup] */
    public static final C110555gD A00(Context context, AnonymousClass7PS r6, float f) {
        Drawable drawable;
        String str = null;
        ? linearLayout = new LinearLayout(context, (AttributeSet) null);
        View inflate = LayoutInflater.from(context).inflate(2131625406, linearLayout, true);
        linearLayout.A02 = (WaImageView) AnonymousClass3MX.A0C(inflate, 2131430032);
        linearLayout.A00 = C72453Mb.A0W(inflate, 2131430033);
        linearLayout.A01 = C72453Mb.A0W(inflate, 2131430034);
        AnonymousClass1Y5.A0A(linearLayout.A00, true);
        Number number = (Number) r6.first;
        if (number != null) {
            drawable = AnonymousClass03S.A01(context, number.intValue());
        } else {
            drawable = null;
        }
        linearLayout.setIconDrawableRes(drawable);
        Number number2 = (Number) r6.second;
        if (number2 != null) {
            str = context.getString(number2.intValue());
        }
        linearLayout.setText(str);
        linearLayout.setSecondaryText(context.getString(AnonymousClass000.A0M(r6.third)));
        if (f != -1.0f) {
            linearLayout.setSecondaryTextSize(f);
        }
        return linearLayout;
    }

    public static final void A01(View view, LinearLayout linearLayout, AnonymousClass71D r8, Integer num, int i, int i2) {
        int i3;
        LinearLayout.LayoutParams A0D = AnonymousClass3Ma.A0D();
        View view2 = view;
        view.setLayoutParams(A0D);
        int i4 = i;
        if (num != null) {
            i3 = num.intValue();
        } else {
            i3 = i;
        }
        C27641Ww.A06(view2, r8.A03, i3, A0D.topMargin, i4, i2);
        linearLayout.addView(view2);
    }
}
