package X;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.graphics.Matrix;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.util.Map;

/* renamed from: X.5ne  reason: invalid class name and case insensitive filesystem */
public class C113735ne extends AnonymousClass1LG {
    public static final TypeEvaluator A00 = new AnonymousClass74X();
    public static final Property A01 = new C109725du();
    public static final String[] A02;

    public Animator A03(ViewGroup viewGroup, C62392rK r9, C62392rK r10) {
        boolean z;
        if (!(r9 == null || r10 == null)) {
            Map map = r9.A02;
            Object obj = map.get("android:changeImageTransform:bounds");
            Map map2 = r10.A02;
            Object obj2 = map2.get("android:changeImageTransform:bounds");
            if (!(obj == null || obj2 == null)) {
                Object obj3 = map.get("android:changeImageTransform:matrix");
                Object obj4 = map2.get("android:changeImageTransform:matrix");
                if (obj3 != null ? !obj3.equals(obj4) : obj4 != null) {
                    z = false;
                } else {
                    z = true;
                }
                if (!obj.equals(obj2) || !z) {
                    ImageView imageView = (ImageView) r10.A00;
                    Drawable drawable = imageView.getDrawable();
                    int intrinsicWidth = drawable.getIntrinsicWidth();
                    int intrinsicHeight = drawable.getIntrinsicHeight();
                    if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
                        Property property = A01;
                        TypeEvaluator typeEvaluator = A00;
                        Matrix matrix = CED.A00;
                        return ObjectAnimator.ofObject(imageView, property, typeEvaluator, new Matrix[]{matrix, matrix});
                    }
                    if (obj3 == null) {
                        obj3 = CED.A00;
                    }
                    if (obj4 == null) {
                        obj4 = CED.A00;
                    }
                    Property property2 = A01;
                    property2.set(imageView, obj3);
                    AnonymousClass74Z r1 = new AnonymousClass74Z();
                    Matrix[] matrixArr = new Matrix[2];
                    AnonymousClass001.A1Q(obj3, obj4, matrixArr);
                    return ObjectAnimator.ofObject(imageView, property2, r1, matrixArr);
                }
            }
        }
        return null;
    }

    public static void A01(C62392rK r10) {
        Matrix matrix;
        View view = r10.A00;
        if ((view instanceof ImageView) && view.getVisibility() == 0) {
            ImageView imageView = (ImageView) view;
            if (imageView.getDrawable() != null) {
                Map map = r10.A02;
                map.put("android:changeImageTransform:bounds", C109005cf.A09(view));
                Drawable drawable = imageView.getDrawable();
                if (drawable.getIntrinsicWidth() > 0 && drawable.getIntrinsicHeight() > 0) {
                    int i = CEC.A00[imageView.getScaleType().ordinal()];
                    if (i == 1) {
                        Drawable drawable2 = imageView.getDrawable();
                        matrix = C108945cZ.A0J();
                        matrix.postScale(C108945cZ.A03(imageView) / ((float) drawable2.getIntrinsicWidth()), C108945cZ.A04(imageView) / ((float) drawable2.getIntrinsicHeight()));
                    } else if (i == 2) {
                        Drawable drawable3 = imageView.getDrawable();
                        int intrinsicWidth = drawable3.getIntrinsicWidth();
                        float A03 = C108945cZ.A03(imageView);
                        float f = (float) intrinsicWidth;
                        int intrinsicHeight = drawable3.getIntrinsicHeight();
                        float A04 = C108945cZ.A04(imageView);
                        float f2 = (float) intrinsicHeight;
                        float max = Math.max(A03 / f, A04 / f2);
                        int round = Math.round((A03 - (f * max)) / 2.0f);
                        int round2 = Math.round((A04 - (f2 * max)) / 2.0f);
                        matrix = C108945cZ.A0J();
                        matrix.postScale(max, max);
                        matrix.postTranslate((float) round, (float) round2);
                    }
                    map.put("android:changeImageTransform:matrix", matrix);
                }
                matrix = new Matrix(imageView.getImageMatrix());
                map.put("android:changeImageTransform:matrix", matrix);
            }
        }
    }

    static {
        String[] A1Z = C17880vN.A1Z();
        A1Z[0] = "android:changeImageTransform:matrix";
        A1Z[1] = "android:changeImageTransform:bounds";
        A02 = A1Z;
    }

    public String[] A0V() {
        return A02;
    }

    public void A0Q(C62392rK r1) {
        A01(r1);
    }

    public void A0S(C62392rK r1) {
        A01(r1);
    }
}
