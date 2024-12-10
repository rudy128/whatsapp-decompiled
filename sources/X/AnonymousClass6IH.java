package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.whatsapp.stickers.store.StickerStoreFeaturedTabFragment;
import java.util.List;

/* renamed from: X.6IH  reason: invalid class name */
public class AnonymousClass6IH extends C112295lF {
    public Drawable.ConstantState A00;
    public final /* synthetic */ StickerStoreFeaturedTabFragment A01;

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        if (i != 1) {
            return super.BqY(viewGroup, i);
        }
        StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = this.A01;
        return new C113015mP(AnonymousClass3MX.A09(stickerStoreFeaturedTabFragment.A01, viewGroup, 2131627115), stickerStoreFeaturedTabFragment);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6IH(StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment, List list) {
        super(stickerStoreFeaturedTabFragment, list);
        this.A01 = stickerStoreFeaturedTabFragment;
    }

    public int A0Q() {
        int A0C = C72463Mc.A0C(this.A00);
        if (A0C <= 0 || !StickerStoreFeaturedTabFragment.A01(this.A01)) {
            return A0C;
        }
        return A0C + 1;
    }

    public int getItemViewType(int i) {
        if (i != 0 || !StickerStoreFeaturedTabFragment.A01(this.A01)) {
            return 0;
        }
        return 1;
    }

    public void Bmc(C42011xT r9, int i) {
        Drawable.ConstantState constantState;
        View view;
        if (getItemViewType(i) == 0) {
            C113495nB r92 = (C113495nB) r9;
            StickerStoreFeaturedTabFragment stickerStoreFeaturedTabFragment = this.A01;
            if (StickerStoreFeaturedTabFragment.A01(stickerStoreFeaturedTabFragment)) {
                i--;
            }
            super.Bmc(r92, i);
            AnonymousClass725 r4 = (AnonymousClass725) this.A00.get(i);
            boolean z = r4.A0O;
            int i2 = 8;
            ImageView imageView = r92.A05;
            if (z) {
                imageView.setVisibility(0);
            } else {
                imageView.setVisibility(8);
            }
            if (r4.A02()) {
                r92.A04.setVisibility(0);
                r92.A06.setVisibility(8);
                r92.A0A.setVisibility(8);
                r92.A07.setVisibility(8);
                if (r4.A09) {
                    r92.A0I.setVisibility(4);
                    view = r92.A0B;
                } else {
                    r92.A0B.setVisibility(4);
                    view = r92.A0I;
                }
                view.setVisibility(0);
            } else if (r4.A09) {
                r92.A06.setVisibility(8);
                r92.A04.setVisibility(4);
                ProgressBar progressBar = r92.A0A;
                progressBar.setVisibility(0);
                progressBar.setIndeterminate(true);
            } else if (r4.A03 != null) {
                ImageView imageView2 = r92.A06;
                imageView2.setVisibility(0);
                imageView2.setColorFilter(AnonymousClass3MY.A02(imageView2, 2131103156));
                imageView2.setImageResource(2131233281);
                imageView2.setOnClickListener((View.OnClickListener) null);
                C108955ca.A1J(imageView2, stickerStoreFeaturedTabFragment, 2131896502);
                imageView2.setClickable(false);
                imageView2.setFocusable(true);
                if (this.A00 == null) {
                    this.A00 = imageView2.getBackground().mutate().getConstantState();
                }
                imageView2.setBackgroundResource(0);
                r92.A0A.setVisibility(8);
                r92.A04.setVisibility(4);
            } else {
                r92.A04.setVisibility(4);
                ImageView imageView3 = r92.A06;
                imageView3.setVisibility(0);
                imageView3.setColorFilter(AnonymousClass3MY.A02(imageView3, AnonymousClass4Z9.A00(stickerStoreFeaturedTabFragment.A1n(), 2130970098)));
                r92.A0A.setVisibility(8);
                imageView3.setImageResource(2131233183);
                if (imageView3.getBackground() == null && (constantState = this.A00) != null) {
                    imageView3.setBackground(constantState.newDrawable(AnonymousClass3MZ.A09(stickerStoreFeaturedTabFragment)));
                }
                C108955ca.A1J(imageView3, stickerStoreFeaturedTabFragment, 2131896438);
                imageView3.setOnClickListener(new AnonymousClass48j(r4, r92, this, 32));
            }
            View view2 = r92.A03;
            if (!r4.A09 && r4.A03 == null && r4.A0A) {
                i2 = 0;
            }
            view2.setVisibility(i2);
        }
    }
}
