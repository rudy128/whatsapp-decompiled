package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import com.google.android.material.datepicker.MaterialCalendar;

/* renamed from: X.9h3  reason: invalid class name and case insensitive filesystem */
public final class C188209h3 {
    public final Paint A00;
    public final C62072qk A01;
    public final C62072qk A02;
    public final C62072qk A03;
    public final C62072qk A04;
    public final C62072qk A05;
    public final C62072qk A06;
    public final C62072qk A07;

    public C188209h3(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AnonymousClass1Z9.A02(context, MaterialCalendar.class.getCanonicalName(), 2130970434).data, C27781Xn.A0N);
        this.A01 = C62072qk.A00(context, obtainStyledAttributes.getResourceId(3, 0));
        this.A02 = C62072qk.A00(context, obtainStyledAttributes.getResourceId(1, 0));
        this.A03 = C62072qk.A00(context, obtainStyledAttributes.getResourceId(2, 0));
        this.A05 = C62072qk.A00(context, obtainStyledAttributes.getResourceId(4, 0));
        ColorStateList A012 = AnonymousClass1YT.A01(context, obtainStyledAttributes, 6);
        this.A07 = C62072qk.A00(context, obtainStyledAttributes.getResourceId(8, 0));
        this.A04 = C62072qk.A00(context, obtainStyledAttributes.getResourceId(7, 0));
        this.A06 = C62072qk.A00(context, obtainStyledAttributes.getResourceId(9, 0));
        Paint paint = new Paint();
        this.A00 = paint;
        paint.setColor(A012.getDefaultColor());
        obtainStyledAttributes.recycle();
    }
}
