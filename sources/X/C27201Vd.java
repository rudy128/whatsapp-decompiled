package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Parcelable;
import com.whatsapp.jid.UserJid;
import com.whatsapp.productinfra.avatar.coinflip.ContactAvatarCoinFlipRepository;
import com.whatsapp.productinfra.avatar.coinflip.MyAvatarCoinFlipRepository;
import java.util.List;

/* renamed from: X.1Vd  reason: invalid class name and case insensitive filesystem */
public class C27201Vd implements C201511a {
    public final AnonymousClass1KB A00;
    public final AnonymousClass11S A01;
    public final AnonymousClass1VW A02;
    public final AnonymousClass1M9 A03;
    public final C24921Me A04;
    public final C24791Lr A05;
    public final C27191Vc A06;
    public final C27171Va A07;
    public final AnonymousClass11C A08;
    public final AnonymousClass118 A09;
    public final C18000vb A0A;
    public final AnonymousClass1CJ A0B;
    public final AnonymousClass1VU A0C;
    public final C18030ve A0D;
    public final AnonymousClass1PU A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G;

    public C37451pZ A08(String str, float f, int i) {
        return new C37451pZ(this, str, f, i, false);
    }

    public static Bitmap A01(C27201Vd r3, AnonymousClass1E7 r4) {
        if (r3.A01.A0O(r4.A0J)) {
            AnonymousClass00H r1 = r3.A0G;
            if (((MyAvatarCoinFlipRepository) r1.get()).A06()) {
                return ((MyAvatarCoinFlipRepository) r1.get()).A01();
            }
        } else {
            UserJid userJid = (UserJid) r4.A06(UserJid.class);
            if (userJid != null) {
                return ((ContactAvatarCoinFlipRepository) r3.A0F.get()).A03(userJid);
            }
        }
        return null;
    }

    public static Bitmap A02(List list, float f) {
        Rect rect;
        RectF rectF;
        Object obj;
        List<Bitmap> list2 = list;
        boolean z = false;
        if (list2.size() > 1) {
            z = true;
        }
        C17960vV.A0F(z, "Insufficient number of bitmaps to combine");
        if (list2.size() == 1) {
            return (Bitmap) list2.get(0);
        }
        int i = 0;
        int i2 = 0;
        for (Bitmap bitmap : list2) {
            if (i < bitmap.getWidth()) {
                i = bitmap.getWidth();
            }
            if (i2 < bitmap.getHeight()) {
                i2 = bitmap.getHeight();
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        float f2 = (float) i;
        float f3 = (float) i2;
        RectF rectF2 = new RectF(0.0f, 0.0f, f2, f3);
        Paint paint = new Paint();
        paint.setColor(-1);
        float f4 = f;
        if (f != 0.0f) {
            if (f > 0.0f) {
                canvas.drawRoundRect(rectF2, f4, f4, paint);
            } else {
                canvas.drawArc(rectF2, 0.0f, 360.0f, true, paint);
            }
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        }
        if (list2.size() == 2) {
            Rect rect2 = new Rect(((int) (((double) i) * 0.25d)) + 1, 0, ((int) (f2 * 0.75f)) - 1, i2);
            float f5 = 0.5f * f2;
            canvas.drawBitmap((Bitmap) list2.get(0), rect2, new RectF(0.0f, 0.0f, f5 - 2.0f, f3), paint);
            canvas.drawBitmap((Bitmap) list2.get(1), rect2, new RectF(f5 + 2.0f, 0.0f, f2, f3), paint);
        } else {
            if (list2.size() == 3) {
                int i3 = ((int) (((double) i) * 0.25d)) + 1;
                int i4 = ((int) (f2 * 0.75f)) - 1;
                float f6 = f2 * 0.5f;
                canvas.drawBitmap((Bitmap) list2.get(0), new Rect(i3, 0, i4, i2), new RectF(0.0f, 0.0f, f6 - 2.0f, f3), paint);
                double d = (double) i2;
                rect = new Rect(i3, ((int) (d * 0.25d)) + 1, i4, ((int) (d * 0.75d)) - 1);
                float f7 = f6 + 2.0f;
                float f8 = f3 * 0.5f;
                canvas.drawBitmap((Bitmap) list2.get(1), rect, new RectF(f7, 0.0f, f2, f8 - 2.0f), paint);
                rectF = new RectF(f7, f8 + 2.0f, f2, f3);
                obj = list2.get(2);
            } else if (list2.size() == 4) {
                double d2 = (double) i2;
                rect = new Rect(((int) (((double) i) * 0.25d)) + 1, ((int) (d2 * 0.25d)) + 1, ((int) (f2 * 0.75f)) - 1, ((int) (d2 * 0.75d)) - 1);
                float f9 = f2 * 0.5f;
                float f10 = f9 - 2.0f;
                float f11 = f3 * 0.5f;
                float f12 = f11 - 2.0f;
                canvas.drawBitmap((Bitmap) list2.get(0), rect, new RectF(0.0f, 0.0f, f10, f12), paint);
                float f13 = f11 + 2.0f;
                canvas.drawBitmap((Bitmap) list2.get(1), rect, new RectF(0.0f, f13, f10, f3), paint);
                float f14 = f9 + 2.0f;
                canvas.drawBitmap((Bitmap) list2.get(2), rect, new RectF(f14, 0.0f, f2, f12), paint);
                rectF = new RectF(f14, f13, f2, f3);
                obj = list2.get(3);
            }
            canvas.drawBitmap((Bitmap) obj, rect, rectF, paint);
            return createBitmap;
        }
        return createBitmap;
    }

    public C27201Vd(AnonymousClass1KB r2, AnonymousClass11S r3, AnonymousClass1VW r4, AnonymousClass1M9 r5, C24921Me r6, C24791Lr r7, C27191Vc r8, C27171Va r9, AnonymousClass11C r10, AnonymousClass118 r11, C18000vb r12, AnonymousClass1CJ r13, AnonymousClass1VU r14, C18030ve r15, AnonymousClass1PU r16, AnonymousClass00H r17, AnonymousClass00H r18) {
        this.A0D = r15;
        this.A00 = r2;
        this.A09 = r11;
        this.A01 = r3;
        this.A0B = r13;
        this.A02 = r4;
        this.A03 = r5;
        this.A08 = r10;
        this.A04 = r6;
        this.A0A = r12;
        this.A0E = r16;
        this.A07 = r9;
        this.A05 = r7;
        this.A0C = r14;
        this.A06 = r8;
        this.A0G = r17;
        this.A0F = r18;
    }

    public static Bitmap A00(Bitmap bitmap, float f, int i, boolean z) {
        Rect rect;
        int i2 = i;
        if (bitmap.getWidth() == i2 && bitmap.getHeight() == i2 && ((int) f) == 0) {
            return bitmap;
        }
        Bitmap createBitmap = Bitmap.createBitmap(i2, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint();
        float f2 = (float) i2;
        RectF rectF = new RectF(0.0f, 0.0f, f2, f2);
        paint.setAntiAlias(true);
        paint.setDither(true);
        paint.setFilterBitmap(true);
        canvas.drawARGB(0, 0, 0, 0);
        paint.setColor(-1);
        if (f == 0.0f) {
            canvas.drawRect(rectF, paint);
        } else if (f > 0.0f) {
            canvas.drawRoundRect(rectF, f, f, paint);
        } else if (f == -2.14748365E9f) {
            canvas.drawPath(AnonymousClass204.A07(rectF), paint);
        } else {
            canvas.drawArc(rectF, 0.0f, 360.0f, true, paint);
        }
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        RectF rectF2 = new RectF(0.0f, 0.0f, f2, f2);
        int width = (bitmap.getWidth() - bitmap.getHeight()) / 2;
        if (width > 0) {
            rect = new Rect(width, 0, bitmap.getWidth() - width, bitmap.getHeight());
        } else {
            rect = new Rect(0, -width, bitmap.getWidth(), bitmap.getHeight() + width);
        }
        canvas.drawBitmap(bitmap, rect, rectF2, paint);
        if (z) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    public Bitmap A03(Context context, AnonymousClass1E7 r12, int i, int i2) {
        int min = Math.min(i, i2);
        AnonymousClass1PU r2 = this.A0E;
        AnonymousClass1E7 r5 = r12;
        AnonymousClass1BI r1 = r12.A0J;
        Parcelable.Creator creator = AnonymousClass1EC.CREATOR;
        boolean A032 = r2.A03(C42941yz.A00(r1));
        int i3 = -1;
        if (A032) {
            i3 = Integer.MIN_VALUE;
        }
        C24791Lr r0 = this.A05;
        float f = (float) i3;
        Bitmap bitmap = (Bitmap) r0.A02.A04().A0A(r12.A08(f, min));
        Context context2 = context;
        if (bitmap == null && r12.A0g && min > 0) {
            bitmap = this.A06.A04(context2, r5, "ContactPhotos.getContactNotificationPhoto", f, min, true);
        }
        if (!C18020vd.A05(C18040vf.A02, this.A0D, 9156) ? bitmap != null : bitmap != null || (!r12.A0g && (bitmap = A01(this, r12)) != null)) {
            return bitmap;
        }
        return this.A07.A00(context, r12, f, min);
    }

    public C37451pZ A04(Context context, AnonymousClass1F9 r5, String str) {
        C37451pZ A062 = A06(context, str);
        r5.getLifecycle().A05(new C40281uS(A062));
        return A062;
    }

    public C37451pZ A05(Context context, String str) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(2131168739);
        return new C37451pZ(this, str, resources.getDimension(2131168737), dimensionPixelSize, true);
    }

    public C37451pZ A06(Context context, String str) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(2131168739);
        return new C37451pZ(this, str, resources.getDimension(2131168737), dimensionPixelSize, false);
    }

    public C37451pZ A07(AnonymousClass1F9 r4, String str, float f, int i) {
        C37451pZ A082 = A08(str, f, i);
        r4.getLifecycle().A05(new C40281uS(A082));
        return A082;
    }
}
