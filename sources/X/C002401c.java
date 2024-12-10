package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: X.01c  reason: invalid class name and case insensitive filesystem */
public class C002401c {
    public TypedValue A00;
    public final Context A01;
    public final TypedArray A02;

    public ColorStateList A01(int i) {
        int resourceId;
        ColorStateList A002;
        TypedArray typedArray = this.A02;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0 || (A002 = AnonymousClass03S.A00(this.A01, resourceId)) == null) {
            return typedArray.getColorStateList(i);
        }
        return A002;
    }

    public Typeface A02(C28251Zq r4, int i, int i2) {
        int resourceId = this.A02.getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        TypedValue typedValue = this.A00;
        if (typedValue == null) {
            typedValue = new TypedValue();
            this.A00 = typedValue;
        }
        return AnonymousClass1YH.A04(this.A01, typedValue, r4, resourceId, i2);
    }

    public Drawable A03(int i) {
        int resourceId;
        TypedArray typedArray = this.A02;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return typedArray.getDrawable(i);
        }
        return AnonymousClass02D.A03().A09(this.A01, resourceId);
    }

    public Drawable A04(int i) {
        int resourceId;
        Drawable A0A;
        TypedArray typedArray = this.A02;
        if (!typedArray.hasValue(i) || (resourceId = typedArray.getResourceId(i, 0)) == 0) {
            return null;
        }
        AnonymousClass01X A012 = AnonymousClass01X.A01();
        Context context = this.A01;
        synchronized (A012) {
            A0A = A012.A00.A0A(context, resourceId, true);
        }
        return A0A;
    }

    public C002401c(Context context, TypedArray typedArray) {
        this.A01 = context;
        this.A02 = typedArray;
    }

    public static C002401c A00(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C002401c(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }
}
