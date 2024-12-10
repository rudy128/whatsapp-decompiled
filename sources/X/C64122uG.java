package X;

import android.animation.TypeEvaluator;

/* renamed from: X.2uG  reason: invalid class name and case insensitive filesystem */
public class C64122uG implements TypeEvaluator {
    public static final C64122uG A00 = new Object();

    public Object evaluate(float f, Object obj, Object obj2) {
        int A0M = AnonymousClass000.A0M(obj);
        float f2 = ((float) ((A0M >> 24) & 255)) / 255.0f;
        int A0M2 = AnonymousClass000.A0M(obj2);
        float pow = (float) Math.pow((double) (((float) ((A0M >> 16) & 255)) / 255.0f), 2.2d);
        float pow2 = (float) Math.pow((double) (((float) ((A0M >> 8) & 255)) / 255.0f), 2.2d);
        float pow3 = (float) Math.pow((double) (((float) (A0M & 255)) / 255.0f), 2.2d);
        float pow4 = (float) Math.pow((double) (((float) ((A0M2 >> 16) & 255)) / 255.0f), 2.2d);
        float pow5 = (float) Math.pow((double) (((float) ((A0M2 >> 8) & 255)) / 255.0f), 2.2d);
        float f3 = pow + ((pow4 - pow) * f);
        float A002 = C17880vN.A00((float) Math.pow((double) (((float) (A0M2 & 255)) / 255.0f), 2.2d), pow3, f);
        return Integer.valueOf((Math.round(((float) Math.pow((double) f3, 0.45454545454545453d)) * 255.0f) << 16) | (Math.round((f2 + (((((float) ((A0M2 >> 24) & 255)) / 255.0f) - f2) * f)) * 255.0f) << 24) | (Math.round(((float) Math.pow((double) (pow2 + ((pow5 - pow2) * f)), 0.45454545454545453d)) * 255.0f) << 8) | Math.round(((float) Math.pow((double) A002, 0.45454545454545453d)) * 255.0f));
    }
}
