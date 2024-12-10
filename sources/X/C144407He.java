package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import java.util.List;

/* renamed from: X.7He  reason: invalid class name and case insensitive filesystem */
public class C144407He implements C1606889n {
    public final /* synthetic */ C113645nQ A00;
    public final /* synthetic */ AnonymousClass8B2 A01;
    public final /* synthetic */ AnonymousClass891 A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ void Bti() {
    }

    public C144407He(C113645nQ r1, AnonymousClass8B2 r2, AnonymousClass891 r3, boolean z) {
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = z;
        this.A01 = r2;
    }

    public void BCw() {
        C113645nQ r2 = this.A00;
        List list = C42011xT.A0I;
        C108975cc.A0x(r2.A03, r2.A00);
    }

    public void C7F(Bitmap bitmap, boolean z) {
        C113645nQ r6 = this.A00;
        List list = C42011xT.A0I;
        C1188465m r3 = r6.A03;
        if (r3.getTag() != this.A02) {
            return;
        }
        if (bitmap == AnonymousClass6YZ.A00) {
            r3.A09 = false;
            if (this.A03) {
                r3.setSelectable(false);
            }
            r3.setScaleType(ImageView.ScaleType.CENTER);
            int type = this.A01.getType();
            if (type == 0 || type == 1 || type == 2) {
                r3.setBackgroundColor(r6.A00);
                r3.setImageResource(2131232111);
                return;
            }
            r3.setBackgroundColor(r6.A00);
            r3.setImageResource(0);
            return;
        }
        r3.A09 = true;
        r3.setSelectable(true);
        AnonymousClass3MW.A1R(r3);
        r3.setBackgroundResource(0);
        r3.A06 = bitmap;
        if (!z) {
            BitmapDrawable A05 = C108965cb.A05(bitmap, r3);
            Drawable[] drawableArr = new Drawable[2];
            drawableArr[0] = r6.A01;
            C108995ce.A10(r3, A05, drawableArr);
            return;
        }
        r3.setImageBitmap(bitmap);
    }
}
