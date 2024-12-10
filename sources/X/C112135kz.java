package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: X.5kz  reason: invalid class name and case insensitive filesystem */
public class C112135kz extends C38391rD {
    public boolean A00 = false;
    public Bitmap[] A01;
    public boolean[] A02;
    public boolean[] A03;
    public final float A04;
    public final float A05;
    public final Context A06;
    public final Drawable A07;
    public final AnonymousClass2E5 A08;
    public final AnonymousClass740 A09;

    public void A0U(int i) {
        this.A00 = true;
        int i2 = 0;
        while (true) {
            boolean[] zArr = this.A02;
            if (i2 < zArr.length) {
                if (!zArr[i2]) {
                    A0G(i2);
                }
                i2++;
            } else {
                this.A08.A0F(new AnonymousClass7G2(this), i);
                return;
            }
        }
    }

    public int A0Q() {
        return C72463Mc.A0D(C137726vv.A00);
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r25, int i) {
        float f;
        AnonymousClass6M5 r14;
        C113625nO r8 = (C113625nO) r25;
        AnonymousClass740 r7 = this.A09;
        int i2 = i;
        boolean booleanValue = Boolean.valueOf(AnonymousClass000.A1T(i2, r7.A01)).booleanValue();
        float f2 = 1.0f;
        if (booleanValue) {
            f = this.A05;
            f2 = this.A04;
        } else {
            f = 1.0f;
        }
        r8.A04.A04(booleanValue, false);
        View view = r8.A00;
        view.setScaleX(f);
        view.setScaleY(f2);
        view.setPivotX(C108945cZ.A02(r7.A0K));
        view.setPivotY((float) r7.A0J);
        TextView textView = r8.A03;
        textView.setText(C137726vv.A00(i2).A01);
        ImageView imageView = r8.A02;
        imageView.setBackground(this.A07);
        imageView.setImageDrawable((Drawable) null);
        View view2 = r8.A01;
        view2.setOnClickListener(r8);
        if (r7.A03 != null) {
            if (i == 0) {
                r14 = new AnonymousClass6M5(this.A06, this.A08, r7, r8, this, this.A01, this.A03, this.A02, 0);
            } else {
                boolean[] zArr = this.A02;
                if (zArr[i - 1]) {
                    Context context = this.A06;
                    Bitmap[] bitmapArr = this.A01;
                    boolean[] zArr2 = this.A03;
                    r14 = new AnonymousClass6M5(context, this.A08, r7, r8, this, bitmapArr, zArr2, zArr, i2);
                } else if (this.A00) {
                    textView.setText(2131890399);
                    AnonymousClass3MX.A1A(this.A06, imageView, 2131101042);
                    view2.setOnClickListener((View.OnClickListener) null);
                    imageView.setClickable(false);
                    return;
                } else {
                    textView.setText(2131890394);
                    imageView.setClickable(true);
                    AnonymousClass78K.A00(view2, this, 43);
                    return;
                }
            }
            r14.A02.executeOnExecutor(r7.A0Y, new Void[0]);
        }
    }

    public C112135kz(Context context, AnonymousClass2E5 r5, AnonymousClass740 r6) {
        this.A06 = context;
        this.A08 = r5;
        this.A09 = r6;
        this.A04 = context.getResources().getDimension(2131166803) / ((float) r6.A0J);
        this.A05 = context.getResources().getDimension(2131166804) / ((float) r6.A0K);
        this.A07 = new ColorDrawable(C19740yt.A00(context, 2131100009));
        int A0D = C72463Mc.A0D(C137726vv.A00) - 1;
        this.A01 = new Bitmap[A0D];
        this.A03 = new boolean[A0D];
        this.A02 = new boolean[A0D];
        A0U(0);
    }

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        return new C113625nO(AnonymousClass3MX.A09(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131625323), this);
    }
}
