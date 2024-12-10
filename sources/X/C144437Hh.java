package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: X.7Hh  reason: invalid class name and case insensitive filesystem */
public final class C144437Hh implements C1606889n {
    public final int A00;
    public final Context A01;
    public final Drawable A02;
    public final C25131Mz A03;
    public final C144367Ha A04;
    public final AnonymousClass69G A05;

    public /* synthetic */ void Bti() {
    }

    public void C7F(Bitmap bitmap, boolean z) {
        C18070vi.A0d(bitmap, 0);
        AnonymousClass69G r3 = this.A05;
        Object tag = r3.getTag();
        C144367Ha r2 = this.A04;
        if (tag == r2) {
            if (bitmap.equals(AnonymousClass6YZ.A00)) {
                r3.setScaleType(ImageView.ScaleType.CENTER);
                r3.setBackgroundColor(this.A00);
                r3.setImageResource(2131232110);
            } else {
                r3.setScaleType(r3.getDefaultScaleType());
                r3.setBackgroundResource(0);
                if (!z) {
                    Drawable[] drawableArr = new Drawable[2];
                    drawableArr[0] = this.A02;
                    C108995ce.A10(r3, C108975cc.A08(this.A01, bitmap), drawableArr);
                } else {
                    r3.setImageBitmap(bitmap);
                }
            }
            this.A03.A0F(r2.Ba8(), bitmap);
        }
    }

    public void BCw() {
        C108975cc.A0x(this.A05, this.A00);
    }

    public C144437Hh(C25131Mz r3, C144367Ha r4, AnonymousClass69G r5) {
        this.A04 = r4;
        this.A05 = r5;
        this.A03 = r3;
        Context A042 = AnonymousClass3MY.A04(r5);
        this.A01 = A042;
        int A002 = C19740yt.A00(A042, 2131100009);
        this.A00 = A002;
        this.A02 = new ColorDrawable(A002);
    }
}
