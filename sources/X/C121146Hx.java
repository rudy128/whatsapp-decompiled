package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import java.util.List;

/* renamed from: X.6Hx  reason: invalid class name and case insensitive filesystem */
public class C121146Hx extends C145227Kl {
    public View A00;
    public WaTextView A01;
    public List A02;
    public WaImageView A03;
    public final int A04;
    public final C26631Sw A05;
    public final AnonymousClass1SB A06;
    public final AnonymousClass88B A07;
    public final boolean A08;

    public C121146Hx(Context context, LayoutInflater layoutInflater, C18030ve r11, C26631Sw r12, AnonymousClass1SB r13, AnonymousClass88B r14, int i, int i2, boolean z) {
        super(context, layoutInflater, r11, i, i2);
        this.A06 = r13;
        this.A05 = r12;
        this.A07 = r14;
        boolean z2 = z;
        this.A04 = C72453Mb.A03(z2 ? 1 : 0);
        this.A08 = z2;
    }

    public void A05(C1418377d r13) {
        C1418377d r3 = r13;
        this.A08 = r13;
        WaImageView waImageView = this.A03;
        if (waImageView == null) {
            return;
        }
        if (r13 == null) {
            waImageView.setImageDrawable((Drawable) null);
            return;
        }
        C26631Sw r0 = this.A05;
        int i = this.A0F;
        r0.A06(new C59842my(waImageView, r3, (AnonymousClass889) null, i, i, 0, 0, true, true, false));
    }

    public void A06(List list) {
        this.A02 = list;
        C112185l4 A002 = A00();
        A002.A0U(this.A02);
        A002.notifyDataSetChanged();
        if (this.A00 != null) {
            if (this.A08) {
                this.A01.setText(2131886846);
            }
            int A0Q = A00().A0Q();
            View view = this.A00;
            int i = 8;
            if (A0Q == 0) {
                i = 0;
            }
            view.setVisibility(i);
        }
    }

    public void A03(View view) {
        View findViewById = view.findViewById(2131430354);
        this.A00 = findViewById;
        findViewById.setVisibility(4);
        this.A03 = AnonymousClass3MW.A0R(view, 2131430378);
        WaTextView A0T = AnonymousClass3MW.A0T(view, 2131430396);
        this.A01 = A0T;
        A0T.setText(2131896463);
        if (this.A08) {
            C1418377d r0 = this.A08;
            if (r0 != null) {
                A05(r0);
            } else {
                this.A03.setImageDrawable((Drawable) null);
            }
        }
    }

    public void BrI(ViewGroup viewGroup, View view, int i) {
        super.BrI(viewGroup, view, i);
        this.A00 = null;
    }
}
