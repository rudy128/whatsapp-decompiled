package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Parcelable;
import android.util.SparseArray;
import android.widget.ImageView;
import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;

/* renamed from: X.1VW  reason: invalid class name */
public class AnonymousClass1VW {
    public static final AnonymousClass1VX A06 = AnonymousClass1VX.COBALT;
    public final AnonymousClass1CJ A00;
    public final C18030ve A01;
    public final AnonymousClass1VV A02;
    public final AnonymousClass1VY A03 = new AnonymousClass1VY(this);
    public final AnonymousClass118 A04;
    public final AnonymousClass1VU A05;

    public AnonymousClass1VW(AnonymousClass1VV r2, AnonymousClass118 r3, AnonymousClass1CJ r4, AnonymousClass1VU r5, C18030ve r6) {
        C18070vi.A0d(r6, 1);
        C18070vi.A0d(r3, 2);
        C18070vi.A0d(r4, 3);
        C18070vi.A0d(r5, 4);
        C18070vi.A0d(r2, 5);
        this.A01 = r6;
        this.A04 = r3;
        this.A00 = r4;
        this.A05 = r5;
        this.A02 = r2;
    }

    public final int A02(AnonymousClass1E7 r3) {
        C18070vi.A0d(r3, 0);
        return A03((AnonymousClass1BI) r3.A06(AnonymousClass1BI.class), false);
    }

    public final Bitmap A04(Context context, AnonymousClass1VX r9, float f, int i, int i2) {
        C18070vi.A0d(context, 0);
        return A00(context, r9, this, f, i, i2);
    }

    public final Bitmap A05(Context context, AnonymousClass1VX r14, int i) {
        Bitmap bitmap;
        Context context2 = context;
        C18070vi.A0d(context, 0);
        AnonymousClass1VV r3 = this.A02;
        AnonymousClass1VY r5 = this.A03;
        synchronized (r3) {
            C18070vi.A0d(r5, 2);
            if (C28281Zt.A0B(context) != r3.A00) {
                r3.A01.clear();
                r3.A00 = !r3.A00;
            }
            int i2 = i;
            int i3 = i;
            AnonymousClass1VX r7 = r14;
            if (r14 != null) {
                i3 = ((65535 & i) * 100) + r14.ordinal();
            }
            SparseArray sparseArray = r3.A01;
            bitmap = (Bitmap) sparseArray.get(i3);
            if (bitmap == null) {
                AnonymousClass1VW r8 = r5.A00;
                C18070vi.A0d(r8, 0);
                bitmap = A00(context2, r7, r8, context.getResources().getDimension(2131168737), i2, context.getResources().getDimensionPixelSize(2131168739));
                sparseArray.put(i3, bitmap);
                C18070vi.A0b(bitmap);
            }
        }
        return bitmap;
    }

    public final Bitmap A06(Context context, AnonymousClass1E7 r4) {
        C18070vi.A0d(context, 0);
        C18070vi.A0d(r4, 1);
        return A05(context, A01(r4.A0J), A02(r4));
    }

    public final Bitmap A07(AnonymousClass1E7 r10, float f, int i) {
        Bitmap A042;
        float f2 = f;
        int i2 = i;
        if (f >= 0.0f || f == -2.14748365E9f) {
            Context context = this.A04.A00;
            C18070vi.A0X(context);
            A042 = A04(context, A01(r10.A0J), f2, A02(r10), i2);
        } else {
            Context context2 = this.A04.A00;
            C18070vi.A0X(context2);
            A042 = A05(context2, A01(r10.A0J), A02(r10));
        }
        if (i == 0) {
            return A042;
        }
        Bitmap createScaledBitmap = Bitmap.createScaledBitmap(A042, i, i, true);
        C18070vi.A0X(createScaledBitmap);
        return createScaledBitmap;
    }

    public final LayerDrawable A08(C43011z6 r7, AnonymousClass1VX r8, int i) {
        C18070vi.A0d(r8, 1);
        Context context = this.A04.A00;
        Drawable A022 = AnonymousClass4aX.A02(context, i, r8.colorResId);
        C18070vi.A0X(A022);
        Drawable A023 = this.A05.A02(r7, C19740yt.A00(context, r8.backgroundColorRes));
        C18070vi.A0b(A023);
        return new LayerDrawable(new Drawable[]{A023, A022});
    }

    public final void A09(ImageView imageView, int i) {
        C18070vi.A0d(imageView, 0);
        A0B(imageView, (AnonymousClass1VX) null, i);
    }

    public final void A0A(ImageView imageView, AnonymousClass1VX r8, float f, int i, int i2) {
        C18070vi.A0d(imageView, 0);
        float f2 = f;
        if (f == -2.14748365E9f && (imageView instanceof WDSProfilePhoto)) {
            ((WDSProfilePhoto) imageView).setProfilePhotoShape(C39201sg.SQUIRCLE);
        }
        Context context = imageView.getContext();
        C18070vi.A0X(context);
        imageView.setImageBitmap(A00(context, r8, this, f2, i, i2));
    }

    public final void A0B(ImageView imageView, AnonymousClass1VX r3, int i) {
        C18070vi.A0d(imageView, 0);
        Context context = imageView.getContext();
        C18070vi.A0X(context);
        imageView.setImageBitmap(A05(context, r3, i));
    }

    public final void A0C(ImageView imageView, AnonymousClass1E7 r4) {
        C18070vi.A0d(imageView, 0);
        C18070vi.A0d(r4, 1);
        AnonymousClass1BI r0 = (AnonymousClass1BI) r4.A06(AnonymousClass1BI.class);
        A0B(imageView, A01(r0), A03(r0, false));
    }

    public static final Bitmap A00(Context context, AnonymousClass1VX r8, AnonymousClass1VW r9, float f, int i, int i2) {
        Drawable A012;
        if (r8 != null && r9.A0E(i)) {
            A012 = r9.A08(new C65502wb(f), r8, i);
        } else if (f == -2.14748365E9f) {
            A012 = AnonymousClass1VU.A00(context.getTheme(), context.getResources(), new C65482wZ(5), r9.A01, i);
        } else {
            A012 = AnonymousClass03S.A01(context, i);
        }
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        C18070vi.A0X(createBitmap);
        if (A012 != null) {
            Canvas canvas = new Canvas(createBitmap);
            A012.setBounds(0, 0, i2, i2);
            if (A012 instanceof BitmapDrawable) {
                BitmapDrawable bitmapDrawable = (BitmapDrawable) A012;
                Paint paint = new Paint();
                float f2 = (float) i2;
                RectF rectF = new RectF(0.0f, 0.0f, f2, f2);
                paint.setAntiAlias(true);
                paint.setDither(true);
                paint.setFilterBitmap(true);
                canvas.drawARGB(0, 0, 0, 0);
                paint.setColor(C19740yt.A00(context, AnonymousClass1YL.A00(context, 2130970830, 2131102245)));
                if (f >= 0.0f) {
                    canvas.drawRoundRect(rectF, f, f, paint);
                } else {
                    canvas.drawArc(rectF, 0.0f, 360.0f, true, paint);
                }
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
                canvas.drawBitmap(bitmapDrawable.getBitmap(), (Rect) null, rectF, paint);
            } else {
                A012.draw(canvas);
                return createBitmap;
            }
        }
        return createBitmap;
    }

    public static final AnonymousClass1VX A01(AnonymousClass1BI r4) {
        int i;
        if (r4 == null) {
            return A06;
        }
        AnonymousClass1VX[] values = AnonymousClass1VX.values();
        int length = values.length - 1;
        Integer A032 = AnonymousClass1YD.A03(C29361c9.A0Z(r4.user, 1));
        if (A032 != null) {
            i = A032.intValue();
        } else {
            i = 7;
        }
        return values[i % length];
    }

    public boolean A0D() {
        return C18020vd.A05(C18040vf.A01, this.A01, 11482);
    }

    public final int A03(AnonymousClass1BI r5, boolean z) {
        if (C22971Dz.A0Z(r5)) {
            return 2131231058;
        }
        if (C22971Dz.A0a(r5)) {
            return 2131231062;
        }
        if (C22971Dz.A0N(r5)) {
            return 2131231046;
        }
        if (C22971Dz.A0e(r5)) {
            AnonymousClass1CJ r3 = this.A00;
            Parcelable.Creator creator = AnonymousClass1EC.CREATOR;
            AnonymousClass1EC A002 = C42941yz.A00(r5);
            boolean z2 = true;
            if (r3.A06(A002) != 1) {
                if (r3.A06(A002) != 3) {
                    z2 = false;
                }
                boolean A0U = r3.A0U(r5);
                if (z2) {
                    if (C22891Dp.A02) {
                        return 2131231045;
                    }
                    return 2131231044;
                } else if (A0U) {
                    return 2131231055;
                } else {
                    if (A0D()) {
                        return 2131233171;
                    }
                    if (z) {
                        return 2131231054;
                    }
                    return 2131231053;
                }
            } else if (A0D()) {
                return 2131233135;
            } else {
                return 2131233211;
            }
        } else if (C22971Dz.A0V(r5)) {
            return 2131231056;
        } else {
            if (A0D()) {
                return 2131233521;
            }
            if (z) {
                return 2131231050;
            }
            return 2131231047;
        }
    }

    public final boolean A0E(int i) {
        if (!A0D()) {
            return false;
        }
        if (C200410p.A0S(new Integer[]{2131233171, 2131233521, 2131233135}).contains(Integer.valueOf(i))) {
            return true;
        }
        return false;
    }
}
