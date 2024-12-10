package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.whatsapp.components.button.ThumbnailButton;
import com.whatsapp.wds.components.banners.WDSBanner;

/* renamed from: X.4a7  reason: invalid class name and case insensitive filesystem */
public abstract class C88554a7 {
    public static void A03(Context context, WDSBanner wDSBanner, int i) {
        AnonymousClass4XT r3 = new AnonymousClass4XT();
        r3.A02 = AnonymousClass4A9.A00;
        r3.A05 = false;
        AnonymousClass4XT.A00(wDSBanner, r3, A3H.A02(context, new C21422Ajp(13), context.getString(i), "learn-more"));
    }

    public static View A00(int i, ViewGroup viewGroup) {
        View A09 = AnonymousClass3MX.A09(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131624145);
        WDSBanner wDSBanner = (WDSBanner) A09.findViewById(2131428058);
        if (wDSBanner != null) {
            A03(viewGroup.getContext(), wDSBanner, i);
        }
        return A09;
    }

    public static View A01(LayoutInflater layoutInflater, View.OnClickListener onClickListener, ViewGroup viewGroup, int i, int i2, int i3) {
        View inflate = layoutInflater.inflate(2131624680, viewGroup, false);
        A04(inflate, i, i2, 2131231553, i3, 0);
        inflate.setOnClickListener(onClickListener);
        return inflate;
    }

    public static View A02(LayoutInflater layoutInflater, ViewGroup viewGroup, int i, int i2) {
        View inflate = layoutInflater.inflate(2131624680, viewGroup, false);
        A04(inflate, i, 0, 2131231546, i2, 0);
        ImageView A0H = AnonymousClass3MW.A0H(inflate, 2131429479);
        if (A0H != null) {
            AnonymousClass4aX.A0D(A0H, inflate.getResources().getColor(2131103225));
        }
        return inflate;
    }

    public static void A04(View view, int i, int i2, int i3, int i4, int i5) {
        C42491yG.A02(view);
        ThumbnailButton thumbnailButton = (ThumbnailButton) AnonymousClass1HF.A06(view, 2131429479);
        AnonymousClass4aX.A0B(view.getContext(), thumbnailButton, i, i2);
        thumbnailButton.setScaleType(ImageView.ScaleType.CENTER);
        thumbnailButton.setBackgroundResource(i3);
        thumbnailButton.A06 = true;
        TextView A0E = C17880vN.A0E(view, 2131429476);
        C43421zm.A04(A0E);
        A0E.setText(i4);
        TextView A0E2 = C17880vN.A0E(view, 2131429480);
        if (i5 == 0) {
            A0E2.setVisibility(8);
            return;
        }
        A0E2.setVisibility(0);
        A0E2.setText(i5);
    }
}
