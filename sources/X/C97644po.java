package X;

import android.graphics.drawable.Drawable;
import android.widget.FrameLayout;
import com.whatsapp.WaImageView;

/* renamed from: X.4po  reason: invalid class name and case insensitive filesystem */
public final class C97644po implements C108395bd {
    public int A00;
    public int A01 = 1;
    public final WaImageView A02;
    public final WaImageView A03;
    public final FrameLayout A04;

    public C97644po(FrameLayout frameLayout) {
        this.A04 = frameLayout;
        WaImageView A0f = C72453Mb.A0f(frameLayout);
        A0f.setVisibility(8);
        AnonymousClass3MZ.A1E(A0f, -1, 17);
        A0f.setImageResource(2131232098);
        frameLayout.addView(A0f);
        this.A03 = A0f;
        WaImageView A0f2 = C72453Mb.A0f(frameLayout);
        A0f2.setVisibility(8);
        AnonymousClass3MZ.A1E(A0f2, -1, 17);
        A0f2.setImageResource(2131232407);
        frameLayout.addView(A0f2);
        this.A02 = A0f2;
        this.A00 = 2131099872;
        A00();
        BhF(1);
    }

    private final void A00() {
        WaImageView waImageView = this.A03;
        int i = this.A00;
        Drawable mutate = waImageView.getDrawable().mutate();
        C18070vi.A0X(mutate);
        mutate.setTint(i);
        waImageView.setImageDrawable(mutate);
        WaImageView waImageView2 = this.A02;
        int i2 = this.A00;
        Drawable mutate2 = waImageView2.getDrawable().mutate();
        C18070vi.A0X(mutate2);
        mutate2.setTint(i2);
        waImageView2.setImageDrawable(mutate2);
    }

    public void BhF(int i) {
        WaImageView waImageView;
        WaImageView waImageView2;
        this.A01 = i;
        if (i == 1) {
            waImageView = this.A03;
            waImageView2 = this.A02;
        } else {
            waImageView = this.A02;
            waImageView2 = this.A03;
        }
        waImageView2.setVisibility(8);
        waImageView2.clearAnimation();
        waImageView.setVisibility(0);
        waImageView.clearAnimation();
    }

    public void CBk(int i) {
        WaImageView waImageView;
        WaImageView waImageView2;
        if (i != this.A01) {
            this.A01 = i;
            if (i == 1) {
                waImageView = this.A03;
                waImageView2 = this.A02;
            } else {
                waImageView = this.A02;
                waImageView2 = this.A03;
            }
            waImageView2.setVisibility(8);
            waImageView2.startAnimation(AnonymousClass4GE.A00(true));
            waImageView.setVisibility(0);
            waImageView.startAnimation(AnonymousClass4GE.A00(false));
        }
    }

    public int getTint() {
        return this.A00;
    }

    public void setTint(int i) {
        this.A00 = i;
        A00();
    }
}
