package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;

/* renamed from: X.3AS  reason: invalid class name */
public class AnonymousClass3AS implements C38531rR {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass3AS(Context context, C42071xZ r2, int i) {
        this.A00 = i;
        this.A01 = r2;
        this.A02 = context;
    }

    public final void Bvu(View view) {
        if (this.A00 != 0) {
            Context context = (Context) this.A02;
            ImageView imageView = (ImageView) view;
            C27641Ww.A03(imageView, context.getResources().getDimensionPixelSize(2131166255), 0);
            imageView.setImageDrawable(C24261Jm.A00(context, 2131232230));
            AnonymousClass4aX.A0D(imageView, C19740yt.A00(context, 2131101888));
            return;
        }
        ImageView imageView2 = (ImageView) view;
        C27641Ww.A03(imageView2, ((Context) this.A02).getResources().getDimensionPixelSize(2131166255), 0);
        imageView2.setImageResource(2131232145);
    }
}
