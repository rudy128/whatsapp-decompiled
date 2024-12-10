package com.facebook.smartcapture.ui;

import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass6VZ;
import X.C108965cb;
import X.C17880vN;
import X.C18070vi;
import X.C24261Jm;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class PhotoSelfieCaptureOverlayFragment extends SelfieCaptureOverlayFragment {
    public TextView A00;
    public TextView A01;
    public final RectF A02 = AnonymousClass3MW.A08();

    public static final void A00(Context context, TextView textView, int i) {
        float A002;
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i, typedValue, true);
        if (typedValue.resourceId == 0) {
            A002 = TypedValue.complexToDimension(typedValue.data, C108965cb.A08(context));
        } else {
            A002 = AnonymousClass3MW.A00(context.getResources(), typedValue.resourceId);
        }
        textView.setTextSize(0, A002);
    }

    public View A1q(Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C18070vi.A0d(layoutInflater, 0);
        return layoutInflater.inflate(2131626460, viewGroup, false);
    }

    public void A21(Bundle bundle, View view) {
        String str;
        C18070vi.A0d(view, 0);
        this.A01 = C17880vN.A0E(view, 2131436466);
        this.A00 = C17880vN.A0E(view, 2131436462);
        ImageView A0H = AnonymousClass3MW.A0H(view, 2131431855);
        ImageView A0H2 = AnonymousClass3MW.A0H(view, 16908315);
        if (this.A00 != null) {
            Context A14 = A14();
            AnonymousClass3MX.A1B(A14, A0H, 2131231675);
            Drawable A002 = C24261Jm.A00(A14, 2131232195);
            if (A002 instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) A002).getBitmap();
                Bitmap createScaledBitmap = Bitmap.createScaledBitmap(bitmap, (int) (((float) bitmap.getWidth()) * 1.8f), (int) (((float) bitmap.getHeight()) * 1.8f), true);
                C18070vi.A0X(createScaledBitmap);
                A002 = new BitmapDrawable(A14.getResources(), createScaledBitmap);
            }
            A0H2.setImageDrawable(A002);
        }
        AnonymousClass3MZ.A1N(A0H, this, 6);
        TextView textView = this.A01;
        if (textView != null) {
            TextView textView2 = this.A00;
            if (textView2 != null) {
                textView.setTextColor(AnonymousClass6VZ.A00(AnonymousClass3MY.A04(textView), 2130971051));
                A00(AnonymousClass3MY.A04(textView), textView, 2130971142);
                textView2.setTextColor(AnonymousClass6VZ.A00(AnonymousClass3MY.A04(textView2), 2130971059));
                A00(AnonymousClass3MY.A04(textView2), textView2, 2130971141);
                TextView textView3 = this.A01;
                if (textView3 != null) {
                    textView3.setText(2131898629);
                    TextView textView4 = this.A00;
                    if (textView4 != null) {
                        textView4.setText(2131898627);
                        return;
                    }
                }
            }
            str = "subtitleView";
            C18070vi.A11(str);
            throw null;
        }
        str = "titleView";
        C18070vi.A11(str);
        throw null;
    }
}
