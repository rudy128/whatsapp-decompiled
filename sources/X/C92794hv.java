package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;

/* renamed from: X.4hv  reason: invalid class name and case insensitive filesystem */
public final class C92794hv implements BCQ {
    public final AnonymousClass00H A00;

    private final BitmapDrawable A00(AnonymousClass48I r7) {
        ImageView imageView = r7.A00;
        AnonymousClass3NM r4 = new AnonymousClass3NM(AnonymousClass3MY.A04(imageView), 2131233494, r7.A01);
        int i = r7.A01;
        int i2 = r7.A00;
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.RGB_565);
        C18070vi.A0X(createBitmap);
        r4.setBounds(0, 0, i, i2);
        r4.draw(new Canvas(createBitmap));
        return new BitmapDrawable(imageView.getResources(), createBitmap);
    }

    private final void A01(AnonymousClass48I r5) {
        ImageView imageView = r5.A00;
        StringBuilder A10 = AnonymousClass000.A10();
        A10.append("default_");
        imageView.setTag(2131432149, AnonymousClass3MY.A0r(A10, r5.A01));
        imageView.setImageDrawable(A00(r5));
    }

    private final boolean A02(AnonymousClass48I r4) {
        ImageView imageView = r4.A00;
        Object tag = imageView.getTag(2131431533);
        String str = r4.A05;
        if (C18070vi.A18(tag, str) && !C18070vi.A18(imageView.getTag(2131432149), str)) {
            Object tag2 = imageView.getTag(2131432149);
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("default_");
            if (C18070vi.A18(tag2, AnonymousClass3MY.A0r(A10, r4.A01))) {
                return false;
            }
            return true;
        }
        return false;
    }

    public /* bridge */ /* synthetic */ void Blh(BCx bCx) {
        AnonymousClass48I r2 = (AnonymousClass48I) bCx;
        C18070vi.A0d(r2, 0);
        if (A02(r2)) {
            A01(r2);
        }
    }

    public /* bridge */ /* synthetic */ void Bwu(BCx bCx) {
        AnonymousClass48I r2 = (AnonymousClass48I) bCx;
        C18070vi.A0d(r2, 0);
        if (A02(r2)) {
            A01(r2);
        }
        C108315bU r0 = r2.A04;
        if (r0 != null) {
            r0.Bwt();
        }
    }

    public /* bridge */ /* synthetic */ void Bx1(BCx bCx) {
        AnonymousClass48I r4 = (AnonymousClass48I) bCx;
        C18070vi.A0d(r4, 0);
        r4.A00.setTag(2131431533, r4.A05);
        C108315bU r0 = r4.A04;
        if (r0 != null) {
            r0.C8a();
        }
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [boolean] */
    public /* bridge */ /* synthetic */ void Bx6(Bitmap bitmap, BCx bCx, boolean z) {
        AnonymousClass48I r8 = (AnonymousClass48I) bCx;
        ? A17 = C18070vi.A17(r8, bitmap);
        this.A00.get();
        C24521Kq r0 = C24521Kq.$redex_init_class;
        String str = r8.A05;
        ImageView imageView = r8.A00;
        if (C18070vi.A18(imageView.getTag(2131431533), str) && !C18070vi.A18(imageView.getTag(2131432149), str)) {
            imageView.setTag(2131432149, str);
            if (z) {
                imageView.setImageBitmap(bitmap);
            } else {
                Drawable drawable = imageView.getDrawable();
                if (drawable == null) {
                    drawable = A00(r8);
                }
                Drawable[] drawableArr = new Drawable[2];
                drawableArr[0] = drawable;
                drawableArr[A17] = new BitmapDrawable(imageView.getResources(), bitmap);
                TransitionDrawable transitionDrawable = new TransitionDrawable(drawableArr);
                transitionDrawable.setCrossFadeEnabled(A17);
                transitionDrawable.startTransition(250);
                imageView.setImageDrawable(transitionDrawable);
            }
        }
        C108315bU r02 = r8.A04;
        if (r02 != null) {
            r02.C8b(bitmap);
        }
    }

    public C92794hv(AnonymousClass00H r1) {
        this.A00 = r1;
    }
}
