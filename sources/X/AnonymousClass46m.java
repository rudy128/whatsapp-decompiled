package X;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.whatsapp.WaImageView;
import java.util.List;
import java.util.Set;

/* renamed from: X.46m  reason: invalid class name */
public class AnonymousClass46m extends AnonymousClass6FY {
    public C36361nl A00;
    public WaImageView A01;
    public C18000vb A02;
    public C36391no A03;
    public C18030ve A04;
    public C131596lM A05;
    public C32011gU A06;
    public AnonymousClass1PU A07;
    public View A08;
    public C73163Qi A09;
    public boolean A0A;

    private void setPreviewClickListener(String str, Set set, AnonymousClass210 r5) {
        View.OnClickListener r0;
        if (set != null) {
            r0 = new C824648b(r5, this, str, set);
        } else {
            r0 = new C825348i(8, str, this);
        }
        setOnClickListener(r0);
    }

    public void A01() {
        if (!this.A0A) {
            this.A0A = true;
            AnonymousClass10E A0Q = C72483Me.A0Q(this);
            this.A04 = AnonymousClass10E.A8r(A0Q);
            this.A06 = AnonymousClass3MY.A0d(A0Q);
            this.A00 = AnonymousClass3Ma.A0L(A0Q);
            this.A02 = AnonymousClass10E.A6Q(A0Q);
            this.A07 = AnonymousClass3MZ.A12(A0Q);
            this.A03 = (C36391no) A0Q.A8P.get();
            this.A05 = (C131596lM) A0Q.A00.AIX.get();
        }
    }

    public View A02() {
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 16;
        linearLayout.setLayoutParams(layoutParams);
        int A042 = C72463Mc.A04(this);
        C27641Ww.A07(linearLayout, this.A02, A042, 0, A042, 0);
        this.A08 = AnonymousClass3MZ.A0D(this).inflate(2131627160, linearLayout, false);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.topMargin = C62762rw.A01(getContext(), 4.0f);
        layoutParams2.bottomMargin = C62762rw.A01(getContext(), 4.0f);
        this.A08.setLayoutParams(layoutParams2);
        this.A09 = new C73163Qi(AnonymousClass3MX.A04(this.A08, this, 8));
        this.A09.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        linearLayout.addView(this.A09);
        linearLayout.addView(this.A08);
        return linearLayout;
    }

    public View A03() {
        int dimensionPixelSize = getResources().getDimensionPixelSize(2131168528);
        this.A01 = C72453Mb.A0f(this);
        this.A01.setLayoutParams(new FrameLayout.LayoutParams(dimensionPixelSize, dimensionPixelSize));
        return this.A01;
    }

    public void setMessage(AnonymousClass210 r13, List list) {
        String str;
        Bitmap A0E;
        int i = 0;
        C87744Wu A002 = C87744Wu.A00(getContext(), this.A03, this.A06, r13, 0);
        AnonymousClass4NY r8 = A002.A00;
        String str2 = r8.A01;
        C18030ve r2 = this.A04;
        String str3 = A002.A04;
        if (str3 == null) {
            str3 = "";
        }
        String A003 = C84014Hn.A00(r2, str3, 2);
        Set set = r8.A02;
        setPreviewClickListener(str2, set, r13);
        boolean A1W = AnonymousClass000.A1W(set);
        byte[] A1A = r13.A1A();
        if (A1A == null || (A0E = C72473Md.A0E(A1A)) == null || A1W) {
            AnonymousClass4aX.A0B(getContext(), this.A01, 2131232044, AnonymousClass1YL.A00(getContext(), 2130971104, 2131102430));
            this.A01.setScaleType(ImageView.ScaleType.CENTER);
            this.A01.setScaleX(1.5f);
            this.A01.setScaleY(1.5f);
            WaImageView waImageView = this.A01;
            C72463Mc.A0v(getContext(), getContext(), waImageView, 2130968799, 2131099873);
        } else {
            this.A01.setImageBitmap(A0E);
            AnonymousClass3MW.A1R(this.A01);
        }
        if (set != null) {
            str = null;
        } else {
            str = A002.A03;
        }
        this.A09.setTitleAndDescription(A003, str, list);
        this.A09.setSubText(C84014Hn.A00(this.A04, r8.A00, 1), list);
        View view = this.A08;
        if (set == null) {
            i = 8;
        }
        view.setVisibility(i);
    }
}
