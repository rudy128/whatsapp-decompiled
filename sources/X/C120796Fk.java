package X;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;

/* renamed from: X.6Fk  reason: invalid class name and case insensitive filesystem */
public abstract class C120796Fk extends C120816Fm {
    public C116435xG A00;

    public abstract String getDefaultMessageText();

    public abstract int getDrawableRes();

    public void setThumbnailOnClickListener(View.OnClickListener onClickListener) {
        this.A00.setId(2131436134);
        this.A00.setOnClickListener(onClickListener);
    }

    public /* bridge */ /* synthetic */ CharSequence A05(AnonymousClass1E7 r10, AnonymousClass206 r11) {
        CharSequence A03 = C72813Np.A03(this.A01.getPaint(), AnonymousClass4aX.A02(getContext(), getDrawableRes(), 2131101888), "");
        Context context = getContext();
        boolean z = r11.A0v.A02;
        return AnonymousClass25G.A02(context, this.A01, this.A03, this.A06, r10, this.A08, A03, z);
    }

    public void setUpThumbView(C116435xG r4) {
        r4.setRadius(getResources().getDimensionPixelSize(2131168561));
        r4.setLayoutParams(new FrameLayout.LayoutParams(getResources().getDimensionPixelSize(2131168564), AnonymousClass3Ma.A02(this, 2131168564)));
        C27641Ww.A03(r4, getResources().getDimensionPixelSize(2131168530), 0);
    }
}
