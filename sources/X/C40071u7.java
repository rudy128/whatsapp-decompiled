package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.ImageView;
import java.util.concurrent.TimeUnit;

/* renamed from: X.1u7  reason: invalid class name and case insensitive filesystem */
public final class C40071u7 {
    public static final long A08 = TimeUnit.DAYS.toMillis(1);
    public static final long A09 = TimeUnit.SECONDS.toMillis(2);
    public final AnimatorSet A00;
    public final Paint A01 = new Paint(1);
    public final ImageView A02;
    public final AnonymousClass1KB A03;
    public final C19830z4 A04;
    public final AnonymousClass10I A05;
    public final BitmapDrawable A06;
    public final AnonymousClass11N A07;

    public C40071u7(ImageView imageView, AnonymousClass1KB r16, AnonymousClass11N r17, C19830z4 r18, AnonymousClass10I r19) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        AnonymousClass1KB r6 = r16;
        C18070vi.A0d(r6, 1);
        AnonymousClass10I r1 = r19;
        C18070vi.A0d(r1, 2);
        C18070vi.A0d(imageView, 3);
        AnonymousClass11N r3 = r17;
        C18070vi.A0d(r3, 4);
        C19830z4 r2 = r18;
        C18070vi.A0d(r2, 5);
        this.A03 = r6;
        this.A05 = r1;
        this.A02 = imageView;
        this.A07 = r3;
        this.A04 = r2;
        Context context = imageView.getContext();
        Drawable A002 = C24261Jm.A00(context, 2131231876);
        C17960vV.A07(A002);
        if (A002 instanceof BitmapDrawable) {
            bitmapDrawable = (BitmapDrawable) A002;
        } else {
            bitmapDrawable = new BitmapDrawable(context.getResources(), AnonymousClass4aX.A00(A002));
        }
        C18070vi.A0X(bitmapDrawable);
        this.A06 = bitmapDrawable;
        Drawable A003 = C24261Jm.A00(context, 2131232098);
        C17960vV.A07(A003);
        if (A003 instanceof BitmapDrawable) {
            bitmapDrawable2 = (BitmapDrawable) A003;
        } else {
            bitmapDrawable2 = new BitmapDrawable(context.getResources(), AnonymousClass4aX.A00(A003));
        }
        C18070vi.A0X(bitmapDrawable2);
        Interpolator A004 = C29111bd.A00(0.3f, 0.0f, 0.25f, 2.0f);
        C18070vi.A0X(A004);
        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        ofFloat.setStartDelay(800);
        ofFloat.setDuration(500);
        ofFloat.setInterpolator(A004);
        ofFloat.addUpdateListener(new C40121uC(bitmapDrawable, bitmapDrawable2, this));
        TimeInterpolator accelerateDecelerateInterpolator = new AccelerateDecelerateInterpolator();
        long j = A09;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
        if (j > 0) {
            ofFloat2.setStartDelay(j);
        }
        ofFloat2.setDuration(350);
        ofFloat2.setInterpolator(accelerateDecelerateInterpolator);
        ofFloat2.addUpdateListener(new C40121uC(bitmapDrawable2, bitmapDrawable, this));
        AnimatorSet animatorSet = new AnimatorSet();
        this.A00 = animatorSet;
        animatorSet.playSequentially(new Animator[]{ofFloat, ofFloat2});
    }

    public final void A00() {
        this.A00.cancel();
        ImageView imageView = this.A02;
        imageView.setImageDrawable(this.A06);
        long currentTimeMillis = System.currentTimeMillis();
        C19830z4 r4 = this.A04;
        AnonymousClass00H r6 = r4.A00;
        if (currentTimeMillis - ((SharedPreferences) r6.get()).getLong("text_to_voice_animation_timestamp", 0) >= A08 && ((SharedPreferences) r6.get()).getInt("text_to_voice_animation_play_times_key", 0) < 10) {
            r4.A1q("text_to_voice_animation_timestamp", System.currentTimeMillis());
            C19830z4.A00(r4).putInt("text_to_voice_animation_play_times_key", ((SharedPreferences) r6.get()).getInt("text_to_voice_animation_play_times_key", 0) + 1);
            imageView.addOnLayoutChangeListener(new C1420978d((Object) this, 16));
        }
    }
}
