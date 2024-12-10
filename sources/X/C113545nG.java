package X;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;

/* renamed from: X.5nG  reason: invalid class name and case insensitive filesystem */
public class C113545nG extends C42011xT {
    public final View A00;
    public final ImageView A01;
    public final ImageView A02;
    public final ProgressBar A03;
    public final C132646nG A04;
    public final AnonymousClass72F A05;

    public void A0B(AnonymousClass6nH r7) {
        ImageView imageView;
        this.A03.setVisibility(8);
        AEX aex = r7.A03;
        if (aex == null) {
            imageView = this.A01;
            imageView.setImageResource(2131232784);
            imageView.setBackgroundColor(0);
        } else {
            String str = aex.A01;
            if (!TextUtils.isEmpty(str)) {
                this.A01.setContentDescription(str);
            }
            imageView = this.A01;
            C108975cc.A0x(imageView, aex.A0A);
            if (r7.A01) {
                this.A02.setVisibility(0);
                imageView.setTag(2131430749, aex);
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                if (aex != null && r7.A00) {
                    this.A04.A00(imageView, aex, layoutParams.width, layoutParams.height);
                }
                this.A00.setVisibility(C72453Mb.A06(r7.A02 ? 1 : 0));
            }
        }
        this.A02.setVisibility(8);
        imageView.setTag(2131430749, aex);
        ViewGroup.LayoutParams layoutParams2 = imageView.getLayoutParams();
        this.A04.A00(imageView, aex, layoutParams2.width, layoutParams2.height);
        this.A00.setVisibility(C72453Mb.A06(r7.A02 ? 1 : 0));
    }

    public C113545nG(View view, C132646nG r3, AnonymousClass72F r4) {
        super(view);
        this.A01 = AnonymousClass3MW.A0G(view, 2131428022);
        this.A00 = AnonymousClass1HF.A06(view, 2131433495);
        this.A02 = AnonymousClass3MW.A0G(view, 2131434677);
        this.A03 = (ProgressBar) AnonymousClass1HF.A06(view, 2131427859);
        this.A05 = r4;
        this.A04 = r3;
    }
}
