package X;

import android.graphics.PointF;
import android.view.animation.Interpolator;

/* renamed from: X.1up  reason: invalid class name and case insensitive filesystem */
public class C40511up {
    public float A00;
    public float A01;
    public int A02;
    public int A03;
    public PointF A04;
    public PointF A05;
    public Float A06;
    public Object A07;
    public float A08;
    public float A09;
    public final float A0A;
    public final Interpolator A0B;
    public final Interpolator A0C;
    public final Interpolator A0D;
    public final Object A0E;
    public final C39801tf A0F;

    public float A00() {
        C39801tf r4 = this.A0F;
        if (r4 == null) {
            return 1.0f;
        }
        float f = this.A08;
        if (f != Float.MIN_VALUE) {
            return f;
        }
        Float f2 = this.A06;
        if (f2 == null) {
            this.A08 = 1.0f;
            return 1.0f;
        }
        float A012 = A01() + ((f2.floatValue() - this.A0A) / (r4.A00 - r4.A02));
        this.A08 = A012;
        return A012;
    }

    public float A01() {
        C39801tf r3 = this.A0F;
        if (r3 == null) {
            return 0.0f;
        }
        float f = this.A09;
        if (f != Float.MIN_VALUE) {
            return f;
        }
        float f2 = this.A0A;
        float f3 = r3.A02;
        float f4 = (f2 - f3) / (r3.A00 - f3);
        this.A09 = f4;
        return f4;
    }

    public boolean A02() {
        if (this.A0B == null && this.A0C == null && this.A0D == null) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Keyframe{startValue=");
        sb.append(this.A0E);
        sb.append(", endValue=");
        sb.append(this.A07);
        sb.append(", startFrame=");
        sb.append(this.A0A);
        sb.append(", endFrame=");
        sb.append(this.A06);
        sb.append(", interpolator=");
        sb.append(this.A0B);
        sb.append('}');
        return sb.toString();
    }

    public C40511up(Interpolator interpolator, Interpolator interpolator2, Interpolator interpolator3, C39801tf r5, Float f, Object obj, Object obj2, float f2) {
        this.A01 = -3987645.8f;
        this.A00 = -3987645.8f;
        this.A03 = 784923401;
        this.A02 = 784923401;
        this.A09 = Float.MIN_VALUE;
        this.A08 = Float.MIN_VALUE;
        this.A04 = null;
        this.A05 = null;
        this.A0F = r5;
        this.A0E = obj;
        this.A07 = obj2;
        this.A0B = interpolator;
        this.A0C = interpolator2;
        this.A0D = interpolator3;
        this.A0A = f2;
        this.A06 = f;
    }

    public C40511up(Object obj, Object obj2) {
        this.A01 = -3987645.8f;
        this.A00 = -3987645.8f;
        this.A03 = 784923401;
        this.A02 = 784923401;
        this.A09 = Float.MIN_VALUE;
        this.A08 = Float.MIN_VALUE;
        this.A04 = null;
        this.A05 = null;
        this.A0F = null;
        this.A0E = obj;
        this.A07 = obj2;
        this.A0B = null;
        this.A0C = null;
        this.A0D = null;
        this.A0A = Float.MIN_VALUE;
        this.A06 = Float.valueOf(Float.MAX_VALUE);
    }

    public C40511up(Interpolator interpolator, C39801tf r3, Float f, Object obj, Object obj2, float f2) {
        this.A01 = -3987645.8f;
        this.A00 = -3987645.8f;
        this.A03 = 784923401;
        this.A02 = 784923401;
        this.A09 = Float.MIN_VALUE;
        this.A08 = Float.MIN_VALUE;
        this.A04 = null;
        this.A05 = null;
        this.A0F = r3;
        this.A0E = obj;
        this.A07 = obj2;
        this.A0B = interpolator;
        this.A0C = null;
        this.A0D = null;
        this.A0A = f2;
        this.A06 = f;
    }

    public C40511up(Interpolator interpolator, Interpolator interpolator2, C39801tf r5, Object obj, Object obj2, float f) {
        this.A01 = -3987645.8f;
        this.A00 = -3987645.8f;
        this.A03 = 784923401;
        this.A02 = 784923401;
        this.A09 = Float.MIN_VALUE;
        this.A08 = Float.MIN_VALUE;
        this.A04 = null;
        this.A05 = null;
        this.A0F = r5;
        this.A0E = obj;
        this.A07 = obj2;
        this.A0B = null;
        this.A0C = interpolator;
        this.A0D = interpolator2;
        this.A0A = f;
        this.A06 = null;
    }

    public C40511up(Object obj) {
        this.A01 = -3987645.8f;
        this.A00 = -3987645.8f;
        this.A03 = 784923401;
        this.A02 = 784923401;
        this.A09 = Float.MIN_VALUE;
        this.A08 = Float.MIN_VALUE;
        this.A04 = null;
        this.A05 = null;
        this.A0F = null;
        this.A0E = obj;
        this.A07 = obj;
        this.A0B = null;
        this.A0C = null;
        this.A0D = null;
        this.A0A = Float.MIN_VALUE;
        this.A06 = Float.valueOf(Float.MAX_VALUE);
    }
}
