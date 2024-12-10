package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.google.android.material.imageview.ShapeableImageView;

/* renamed from: X.6AT  reason: invalid class name */
public final class AnonymousClass6AT extends C136786uO {
    public Bitmap A00;
    public ShapeableImageView A01;
    public final C218617r A02;
    public final AnonymousClass1KB A03;
    public final C34531kd A04;
    public final AnonymousClass181 A05;
    public final AnonymousClass118 A06;
    public final AnonymousClass1D9 A07;
    public final AnonymousClass10I A08;
    public final AnonymousClass00H A09;
    public final C18100vl A0A = AnonymousClass7S3.A00(this, 39);
    public final AnonymousClass1LU A0B;

    public void A02(Context context, AnonymousClass02n r10, C140016zo r11) {
        C18070vi.A0d(r10, 2);
        super.A02(context, r10, r11);
        C134366qT r1 = r11.A00;
        if (r1 != null) {
            ((AnonymousClass4VT) this.A0A.getValue()).A00((Drawable) null, (Drawable) null, this.A01, new C145857Mw(this, 0), r1.A00);
        }
    }

    public AnonymousClass6AT(C218617r r2, AnonymousClass1KB r3, C34531kd r4, AnonymousClass181 r5, AnonymousClass118 r6, AnonymousClass1D9 r7, AnonymousClass1LU r8, AnonymousClass10I r9, AnonymousClass00H r10) {
        C18070vi.A0w(r6, r3, r9, r5, r7);
        C18070vi.A0q(r8, r2, r4);
        C18070vi.A0d(r10, 9);
        this.A06 = r6;
        this.A03 = r3;
        this.A08 = r9;
        this.A05 = r5;
        this.A07 = r7;
        this.A0B = r8;
        this.A02 = r2;
        this.A04 = r4;
        this.A09 = r10;
    }

    public void A01() {
        super.A01();
        this.A01 = null;
        this.A08.CGF(new C70593Bs(this, 33));
    }
}
