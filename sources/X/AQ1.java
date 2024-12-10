package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class AQ1 implements C22539BBw {
    public ImageView A00;
    public ImageView A01;
    public TextView A02;
    public final C18000vb A03;
    public final C18030ve A04;
    public final AnonymousClass72F A05;
    public final C189109iW A06;

    public /* bridge */ /* synthetic */ void BD6(Object obj) {
        TextView textView;
        CharSequence A002;
        ImageView imageView;
        AEX A042;
        AnonymousClass8pG r0;
        C20274AEh A0C;
        int i;
        ARR arr;
        AW0 aw0 = (AW0) obj;
        this.A02.setVisibility(8);
        if (aw0 != null && aw0.A09 != null) {
            C18030ve r6 = this.A04;
            C18040vf r5 = C18040vf.A02;
            if (!C18020vd.A05(r5, r6, 4443) || (r0 = aw0.A0A) == null || (A0C = r0.A0C()) == null || (i = A0C.A01) <= 1 || (arr = A0C.A02) == null) {
                textView = this.A02;
                A002 = A3U.A00(textView.getContext(), this.A03, aw0.A01(), aw0.A09);
            } else {
                SpannableStringBuilder A003 = A3U.A00(this.A02.getContext(), this.A03, aw0.A01(), arr.A02);
                Context context = this.A02.getContext();
                Object[] A1b = AnonymousClass3MW.A1b();
                AnonymousClass3MY.A1V(String.valueOf(i), A003, A1b);
                A002 = context.getString(2131893608, A1b);
                textView = this.A02;
            }
            textView.setText(A002);
            this.A02.setVisibility(0);
            TextView textView2 = this.A02;
            AnonymousClass8BW.A0z(this.A02.getContext(), textView2.getResources(), textView2, 2130970705, 2131102112);
            this.A02.setAlpha(1.0f);
            boolean A004 = this.A06.A00(aw0);
            TextView textView3 = this.A02;
            if (A004) {
                AnonymousClass9RK.A00(textView3);
            } else {
                C18070vi.A0d(textView3, 0);
                textView3.setPaintFlags(textView3.getPaintFlags() & -17);
            }
            if ((C18020vd.A05(r5, r6, 605) || C18020vd.A05(r5, r6, 629)) && (A042 = aw0.A04()) != null) {
                this.A00.setImageDrawable((Drawable) null);
                this.A02.setTextColor(A042.A0C);
                if (A004) {
                    this.A02.setAlpha(0.54f);
                }
                this.A00.setBackgroundColor(A042.A0A);
                ViewGroup.LayoutParams layoutParams = this.A00.getLayoutParams();
                String str = A042.A01;
                if (!TextUtils.isEmpty(str)) {
                    this.A00.setContentDescription(str);
                }
                this.A05.A03(this.A00, A042, layoutParams.width, layoutParams.height, false);
                this.A00.setVisibility(0);
                imageView = this.A01;
            } else {
                this.A01.setVisibility(0);
                imageView = this.A00;
            }
            imageView.setVisibility(8);
        }
    }

    public AQ1(C18000vb r1, C18030ve r2, AnonymousClass72F r3, C189109iW r4) {
        this.A04 = r2;
        this.A03 = r1;
        this.A05 = r3;
        this.A06 = r4;
    }

    public int BTw() {
        return 2131624890;
    }

    public void CA8(View view) {
        this.A02 = AnonymousClass3MW.A0J(view, 2131427787);
        this.A01 = AnonymousClass3MW.A0G(view, 2131429609);
        this.A00 = AnonymousClass3MW.A0G(view, 2131429596);
    }
}
