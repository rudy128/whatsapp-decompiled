package X;

import android.app.Activity;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewStub;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import com.google.android.material.chip.Chip;

/* renamed from: X.6FL  reason: invalid class name */
public final class AnonymousClass6FL extends AnonymousClass4VZ {
    public final View A00;
    public final Activity A01;
    public final Toolbar A02;

    public void A0B() {
    }

    public static final void A00(Chip chip, AnonymousClass6FL r4, String str, boolean z) {
        if (!z) {
            chip.setVisibility(0);
            Activity activity = r4.A01;
            C72463Mc.A0y(activity, chip, 2130970097, 2131103410);
            chip.setChipBackgroundColor(ColorStateList.valueOf(AnonymousClass3Ma.A00(activity, 2130971100, 2131101098)));
            chip.setChipStrokeColor((ColorStateList) null);
            chip.setChipStrokeWidth((float) C62762rw.A01(activity, 0.0f));
            CharSequence charSequence = str;
            if (str == null) {
                charSequence = chip.getText();
            }
            chip.setText(charSequence);
        } else if (chip.isSelected()) {
            r4.A0D();
            return;
        } else {
            Activity activity2 = r4.A01;
            chip.setChipBackgroundColor(ColorStateList.valueOf(AnonymousClass3Ma.A00(activity2, 2130971101, 2131102427)));
            chip.setChipStrokeColor(ColorStateList.valueOf(AnonymousClass3Ma.A00(activity2, 2130971102, 2131102235)));
            chip.setChipStrokeWidth((float) C62762rw.A01(activity2, 1.0f));
        }
        chip.setSelected(z);
    }

    public void A08() {
        ImageView A0H = AnonymousClass3MW.A0H(this.A00, 2131434914);
        A0H.setImageDrawable((Drawable) null);
        A0H.setVisibility(8);
        C43531zx.A03(AnonymousClass3MX.A0C(this.A00, 2131434880), new C39351sv(0, 0, 0, 0));
    }

    public void A09() {
        if (C28281Zt.A0B(this.A01)) {
            super.A09();
        }
    }

    public void A0A() {
        View view = this.A00;
        View A05 = C18070vi.A05(view, 2131434856);
        Activity activity = this.A01;
        A05.setBackground(new AnonymousClass4S0(activity, AnonymousClass4CM.NORMAL).A01());
        AnonymousClass6YG.A00(activity, A05);
        ColorStateList A03 = C19740yt.A03(activity, 2131103154);
        AnonymousClass3MW.A0H(view, 2131434869).setImageTintList(A03);
        AnonymousClass3MW.A0H(view, 2131434851).setImageTintList(A03);
    }

    public boolean A0C() {
        if (this.A00.getVisibility() == 0 && this.A02.getVisibility() == 4) {
            return true;
        }
        return false;
    }

    public final void A0D() {
        View view = this.A00;
        if (!(view.findViewById(2131428924) instanceof ViewStub)) {
            View findViewById = view.findViewById(2131428923);
            findViewById.setVisibility(8);
            findViewById.setSelected(false);
        }
    }

    public final void A0E(boolean z) {
        View view = this.A00;
        if (!(view.findViewById(2131428924) instanceof ViewStub)) {
            A00((Chip) AnonymousClass3MX.A0C(view, 2131428923), this, (String) null, z);
        }
    }

    public AnonymousClass6FL(Activity activity, View view, C16560sd r3, Toolbar toolbar, C18000vb r5) {
        super(activity, view, r3, toolbar, r5);
        this.A01 = activity;
        this.A00 = view;
        this.A02 = toolbar;
    }

    public int A07() {
        return 2131626178;
    }
}
