package X;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: X.1Yz  reason: invalid class name and case insensitive filesystem */
public final class C28131Yz extends Drawable.ConstantState {
    public float A00;
    public float A01;
    public float A02;
    public float A03;
    public float A04;
    public float A05;
    public int A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public ColorStateList A0B;
    public ColorStateList A0C;
    public ColorStateList A0D;
    public ColorStateList A0E;
    public ColorFilter A0F;
    public Paint.Style A0G;
    public PorterDuff.Mode A0H;
    public Rect A0I;
    public AnonymousClass1Z8 A0J;
    public C28011Ym A0K;
    public boolean A0L;

    public int getChangingConfigurations() {
        return 0;
    }

    public Drawable newDrawable() {
        C27801Xq r1 = new C27801Xq(this);
        r1.A03 = true;
        return r1;
    }
}
