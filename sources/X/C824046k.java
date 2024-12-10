package X;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.whatsapp.WaImageView;
import java.util.List;
import java.util.Locale;

/* renamed from: X.46k  reason: invalid class name and case insensitive filesystem */
public class C824046k extends AnonymousClass6FM {
    public C18000vb A00;
    public C18030ve A01;
    public WaImageView A02;
    public C73163Qi A03;
    public boolean A04;

    public void A01() {
        if (!this.A04) {
            this.A04 = true;
            AnonymousClass10E A0Q = C72483Me.A0Q(this);
            this.A01 = AnonymousClass10E.A8r(A0Q);
            this.A00 = AnonymousClass10E.A6Q(A0Q);
        }
    }

    public void setMessage(C438921i r11, List list) {
        String string;
        C18030ve r2 = this.A01;
        if (!TextUtils.isEmpty(r11.A19())) {
            string = r11.A19();
        } else {
            string = getContext().getString(2131897363);
        }
        String A002 = C84014Hn.A00(r2, string, 3);
        String A022 = C88584aA.A02(this.A00, r11.A01);
        String A003 = C84014Hn.A00(this.A01, C25291Nq.A03(r11.A06).toUpperCase(Locale.US), 1);
        if (TextUtils.isEmpty(A003) && !TextUtils.isEmpty(r11.A19())) {
            A003 = C64062u9.A09(r11.A19()).toUpperCase(Locale.US);
        }
        this.A03.setTitleAndDescription(A002, (String) null, list);
        boolean A1b = AnonymousClass3MY.A1b(this.A00);
        C73163Qi r3 = this.A03;
        Context context = getContext();
        Object[] objArr = new Object[2];
        if (A1b) {
            objArr[0] = A022;
            r3.setSubText(C17880vN.A0q(context, A003, objArr, 1, 2131899038), (List) null);
        } else {
            objArr[0] = A003;
            r3.setSubText(C17880vN.A0q(context, A022, objArr, 1, 2131899038), (List) null);
        }
        this.A02.setImageDrawable(C137486vX.A00(getContext(), r11));
    }

    public View A02() {
        this.A03 = new C73163Qi(getContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        int A042 = C72463Mc.A04(this);
        C27641Ww.A07(this.A03, this.A00, 0, 0, A042, 0);
        this.A03.setLayoutParams(layoutParams);
        return this.A03;
    }

    public View A03() {
        this.A02 = C72453Mb.A0f(this);
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131168529);
        int A042 = C72463Mc.A04(this);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize);
        layoutParams.setMargins(A042, A042, A042, A042);
        this.A02.setLayoutParams(layoutParams);
        this.A02.setScaleType(ImageView.ScaleType.FIT_CENTER);
        return this.A02;
    }
}
