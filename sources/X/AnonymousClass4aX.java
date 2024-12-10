package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.ImageView;
import android.widget.TextView;

/* renamed from: X.4aX  reason: invalid class name */
public abstract class AnonymousClass4aX {
    public static Bitmap A00(Drawable drawable) {
        Bitmap createBitmap;
        if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            if (bitmapDrawable.getBitmap() != null) {
                return bitmapDrawable.getBitmap();
            }
        }
        if (drawable.getIntrinsicWidth() <= 0 || drawable.getIntrinsicHeight() <= 0) {
            createBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
        } else {
            createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        }
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    public static Drawable A05(Context context, Drawable drawable, int i) {
        Integer num;
        int intValue;
        if (i != 0) {
            try {
                num = Integer.valueOf(C19740yt.A00(context, i));
            } catch (Resources.NotFoundException unused) {
                num = null;
            }
            if (!(num == null || (intValue = num.intValue()) == 0)) {
                Drawable A02 = C27831Xu.A02(drawable.mutate());
                C27831Xu.A0C(A02, intValue);
                return A02;
            }
        }
        return drawable;
    }

    public static Drawable A07(Resources resources, Drawable drawable, int i) {
        if (!(drawable instanceof BitmapDrawable)) {
            return drawable;
        }
        return new BitmapDrawable(resources, Bitmap.createScaledBitmap(((BitmapDrawable) drawable).getBitmap(), i, i, false));
    }

    public static Drawable A08(Drawable drawable, int i) {
        if (i == 0) {
            return drawable;
        }
        Drawable A02 = C27831Xu.A02(drawable);
        C27831Xu.A0C(A02, i);
        return A02;
    }

    public static void A0D(ImageView imageView, int i) {
        ColorStateList valueOf;
        C28081Yu.A01(PorterDuff.Mode.SRC_IN, imageView);
        if (i == 0) {
            valueOf = null;
        } else {
            valueOf = ColorStateList.valueOf(i);
        }
        C28081Yu.A00(valueOf, imageView);
    }

    public static void A0E(TextView textView, int i) {
        if (i != 0) {
            for (Drawable drawable : textView.getCompoundDrawables()) {
                if (drawable != null) {
                    drawable.setColorFilter(new PorterDuffColorFilter(i, PorterDuff.Mode.SRC_IN));
                }
            }
        }
    }

    public static Drawable A01(Context context, int i) {
        if (!AnonymousClass112.A00()) {
            return A05(context, AnonymousClass3MX.A06(context, i), 2131100148);
        }
        return A05(context, A06(context, AnonymousClass3MX.A06(context, i), false), 2131100148);
    }

    public static Drawable A02(Context context, int i, int i2) {
        return A05(context, AnonymousClass3MX.A06(context, i), i2);
    }

    public static Drawable A03(Context context, int i, int i2, int i3) {
        return A02(context, i3, AnonymousClass1YL.A00(context, i, i2));
    }

    public static Drawable A04(Context context, Context context2, int i, int i2, int i3) {
        return A02(context2, i3, AnonymousClass1YL.A00(context, i, i2));
    }

    public static Drawable A06(Context context, Drawable drawable, boolean z) {
        int i;
        Drawable drawable2;
        Drawable drawable3 = drawable;
        if (!AnonymousClass112.A00()) {
            return drawable;
        }
        if (!z) {
            i = 1;
        } else if ((drawable instanceof InsetDrawable) && (drawable2 = ((InsetDrawable) drawable3).getDrawable()) != null) {
            return drawable2;
        } else {
            i = -1;
        }
        int dimensionPixelSize = i * context.getResources().getDimensionPixelSize(2131169493);
        return new InsetDrawable(drawable3, dimensionPixelSize, 0, dimensionPixelSize, 0);
    }

    public static RippleDrawable A09(Context context, Drawable drawable) {
        ColorStateList A03 = C19740yt.A03(context, 2131102387);
        C17960vV.A07(A03);
        return new RippleDrawable(A03, drawable, (Drawable) null);
    }

    public static C74743cP A0A(Context context, Resources resources, Drawable drawable, C18000vb r5) {
        return new C74743cP(A08(drawable, resources.getColor(AnonymousClass1YL.A00(context, 2130970284, 2131101275))), r5);
    }

    public static void A0B(Context context, ImageView imageView, int i, int i2) {
        imageView.setImageDrawable(A02(context, i, i2));
    }

    public static void A0C(Drawable drawable, TextView textView) {
        int intrinsicHeight;
        int textSize = (int) textView.getTextSize();
        if (drawable.getIntrinsicHeight() == 0) {
            intrinsicHeight = 1;
        } else {
            intrinsicHeight = drawable.getIntrinsicHeight();
        }
        drawable.setBounds(0, 0, (drawable.getIntrinsicWidth() * textSize) / intrinsicHeight, textSize);
    }
}
