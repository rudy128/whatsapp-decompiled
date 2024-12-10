package X;

import android.animation.ObjectAnimator;
import android.graphics.drawable.AnimationDrawable;

/* renamed from: X.05z  reason: invalid class name */
public class AnonymousClass05z extends C02150Cx {
    public final ObjectAnimator A00;
    public final boolean A01;

    public static void A00(ObjectAnimator objectAnimator) {
        objectAnimator.setAutoCancel(true);
    }

    public void A01() {
        this.A00.reverse();
    }

    public void A02() {
        this.A00.start();
    }

    public void A03() {
        this.A00.cancel();
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.animation.TimeInterpolator, java.lang.Object, X.0Qy] */
    public AnonymousClass05z(AnimationDrawable animationDrawable, boolean z, boolean z2) {
        int numberOfFrames = animationDrawable.getNumberOfFrames();
        int i = z ? numberOfFrames - 1 : 0;
        int i2 = z ? 0 : numberOfFrames - 1;
        ? obj = new Object();
        int numberOfFrames2 = animationDrawable.getNumberOfFrames();
        obj.A00 = numberOfFrames2;
        int[] iArr = obj.A02;
        if (iArr == null || iArr.length < numberOfFrames2) {
            iArr = new int[numberOfFrames2];
            obj.A02 = iArr;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < numberOfFrames2; i4++) {
            int i5 = i4;
            if (z) {
                i5 = (numberOfFrames2 - i4) - 1;
            }
            int duration = animationDrawable.getDuration(i5);
            iArr[i4] = duration;
            i3 += duration;
        }
        obj.A01 = i3;
        ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", new int[]{i, i2});
        A00(ofInt);
        ofInt.setDuration((long) obj.A01);
        ofInt.setInterpolator(obj);
        this.A01 = z2;
        this.A00 = ofInt;
    }

    public boolean A04() {
        return this.A01;
    }
}
