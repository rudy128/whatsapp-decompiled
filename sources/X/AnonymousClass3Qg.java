package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: X.3Qg  reason: invalid class name */
public class AnonymousClass3Qg extends LinearLayout implements AnonymousClass009 {
    public C18030ve A00;
    public AnonymousClass031 A01;
    public boolean A02;
    public final ImageView A03;
    public final ImageView A04;
    public final TextView A05;

    public void A00(Drawable drawable, Drawable drawable2, String str) {
        int i;
        this.A05.setText(str);
        this.A04.setImageDrawable(drawable);
        ImageView imageView = this.A03;
        if (drawable2 == null) {
            i = 8;
        } else {
            imageView.setImageDrawable(drawable2);
            i = 0;
        }
        imageView.setVisibility(i);
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A01;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A01 = r0;
        }
        return r0.generatedComponent();
    }

    public void setPreviewScaleType(ImageView.ScaleType scaleType) {
        this.A04.setScaleType(scaleType);
    }

    public AnonymousClass3Qg(Context context) {
        super(context);
        if (!this.A02) {
            this.A02 = true;
            this.A00 = AnonymousClass10E.A8r(AnonymousClass3MW.A0O(generatedComponent()));
        }
        setOrientation(1);
        LayoutInflater.from(context).inflate(2131627537, this);
        this.A05 = AnonymousClass3MW.A0J(this, 2131436969);
        this.A04 = AnonymousClass3MW.A0G(this, 2131436967);
        this.A03 = AnonymousClass3MW.A0G(this, 2131436968);
    }
}
