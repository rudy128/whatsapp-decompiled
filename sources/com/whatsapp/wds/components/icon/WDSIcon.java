package com.whatsapp.wds.components.icon;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass1Y0;
import X.AnonymousClass1Y1;
import X.AnonymousClass1Y5;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4D7;
import X.AnonymousClass4D8;
import X.AnonymousClass4YF;
import X.C18070vi;
import X.C24253ByB;
import X.C83064Df;
import X.C88284Zb;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;

public class WDSIcon extends AppCompatImageView implements AnonymousClass009 {
    public C24253ByB A00;
    public C83064Df A01;
    public AnonymousClass031 A02;
    public boolean A03;
    public PorterDuffColorFilter A04;
    public Drawable A05;
    public AnonymousClass4D7 A06;
    public AnonymousClass4YF A07;
    public AnonymousClass4D8 A08;
    public boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public WDSIcon(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C18070vi.A0d(context, 1);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
        C83064Df r9 = C83064Df.A04;
        this.A07 = new AnonymousClass4YF(r9.size, r9.iconSize);
        this.A01 = r9;
        C24253ByB byB = C24253ByB.CIRCLE;
        this.A00 = byB;
        AnonymousClass4D8 r7 = AnonymousClass4D8.FILLED;
        this.A08 = r7;
        AnonymousClass4D7 r4 = AnonymousClass4D7.NORMAL;
        this.A06 = r4;
        this.A09 = true;
        if (attributeSet != null) {
            int[] iArr = AnonymousClass1Y0.A0B;
            C18070vi.A0Z(iArr);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
            int resourceId = obtainStyledAttributes.getResourceId(0, 0);
            if (resourceId != 0) {
                AnonymousClass3MY.A0w(context, this, resourceId);
            }
            int i = obtainStyledAttributes.getInt(4, 4);
            C83064Df[] values = C83064Df.values();
            if (i >= 0 && i < values.length) {
                r9 = values[i];
            }
            setSize(r9);
            int i2 = obtainStyledAttributes.getInt(3, 0);
            C24253ByB[] values2 = C24253ByB.values();
            if (i2 >= 0 && i2 < values2.length) {
                byB = values2[i2];
            }
            setShape(byB);
            int i3 = obtainStyledAttributes.getInt(5, 0);
            AnonymousClass4D8[] values3 = AnonymousClass4D8.values();
            if (i3 >= 0 && i3 < values3.length) {
                r7 = values3[i3];
            }
            setVariant(r7);
            int i4 = obtainStyledAttributes.getInt(2, 0);
            AnonymousClass4D7[] values4 = AnonymousClass4D7.values();
            if (i4 >= 0 && i4 < values4.length) {
                r4 = values4[i4];
            }
            setAction(r4);
            setupIcon(obtainStyledAttributes.getDrawable(1));
            obtainStyledAttributes.recycle();
        }
        A00();
        A01();
        AnonymousClass1Y5.A09(this, false);
    }

    public void onDraw(Canvas canvas) {
        C18070vi.A0d(canvas, 0);
        AnonymousClass4YF r0 = this.A07;
        int i = (r0.A01 - r0.A00) / 2;
        Drawable drawable = getDrawable();
        if (drawable != null) {
            int i2 = this.A07.A00 + i;
            drawable.setBounds(i, i, i2, i2);
            drawable.draw(canvas);
            drawable.clearColorFilter();
        }
    }

    public final void setAction(AnonymousClass4D7 r2) {
        C18070vi.A0d(r2, 0);
        boolean A1Z = AnonymousClass3Ma.A1Z(this.A06, r2);
        this.A06 = r2;
        if (A1Z) {
            A01();
            invalidate();
        }
    }

    public final void setShape(C24253ByB byB) {
        C18070vi.A0d(byB, 0);
        boolean A1Z = AnonymousClass3Ma.A1Z(this.A00, byB);
        this.A00 = byB;
        if (A1Z) {
            A01();
            requestLayout();
        }
    }

    public final void setSize(C83064Df r2) {
        C18070vi.A0d(r2, 0);
        boolean A1Z = AnonymousClass3Ma.A1Z(this.A01, r2);
        this.A01 = r2;
        if (A1Z) {
            A00();
            A01();
            requestLayout();
        }
    }

    public final void setVariant(AnonymousClass4D8 r2) {
        C18070vi.A0d(r2, 0);
        boolean A1Z = AnonymousClass3Ma.A1Z(this.A08, r2);
        this.A08 = r2;
        if (A1Z) {
            A01();
            invalidate();
        }
    }

    private final void A00() {
        if (this.A09) {
            C83064Df r4 = this.A01;
            Context A042 = AnonymousClass3MY.A04(this);
            this.A07 = new AnonymousClass4YF(A042.getResources().getDimensionPixelSize(r4.size), A042.getResources().getDimensionPixelSize(r4.iconSize));
        }
    }

    private final void A01() {
        if (this.A09) {
            C88284Zb A002 = C88284Zb.A02.A00(AnonymousClass3MY.A04(this), this.A06, this.A08);
            setupContentStyle(A002.A01);
            setupBackgroundStyle(A002.A00);
        }
    }

    private final void setupBackgroundStyle(int i) {
        Shape shape;
        int i2;
        C24253ByB byB = this.A00;
        Context A042 = AnonymousClass3MY.A04(this);
        C83064Df r5 = this.A01;
        int i3 = 0;
        C18070vi.A0d(r5, 1);
        int ordinal = byB.ordinal();
        if (ordinal == 0) {
            shape = new OvalShape();
        } else if (ordinal == 1) {
            float[] fArr = new float[8];
            do {
                Resources resources = A042.getResources();
                switch (r5.ordinal()) {
                    case 0:
                        i2 = 2131169463;
                        break;
                    case 1:
                        i2 = 2131169461;
                        break;
                    case 2:
                        i2 = 2131169459;
                        break;
                    case 3:
                        i2 = 2131169457;
                        break;
                    case 4:
                        i2 = 2131169458;
                        break;
                    case 5:
                        i2 = 2131169456;
                        break;
                    case 6:
                        i2 = 2131169460;
                        break;
                    case 7:
                        i2 = 2131169462;
                        break;
                    default:
                        throw AnonymousClass3MW.A14();
                }
                fArr[i3] = AnonymousClass3MW.A00(resources, i2);
                i3++;
            } while (i3 < 8);
            shape = new RoundRectShape(fArr, (RectF) null, (float[]) null);
        } else {
            throw AnonymousClass3MW.A14();
        }
        ShapeDrawable shapeDrawable = new ShapeDrawable(shape);
        shapeDrawable.getPaint().setColor(AnonymousClass3MY.A02(this, i));
        setBackground(shapeDrawable);
    }

    private final void setupIcon(Drawable drawable) {
        Drawable drawable2;
        if (drawable != null) {
            drawable2 = drawable.mutate();
        } else {
            drawable2 = null;
        }
        this.A05 = drawable2;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A02;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public final AnonymousClass4D7 getAction() {
        return this.A06;
    }

    public Drawable getDrawable() {
        Drawable drawable = this.A05;
        if (drawable == null) {
            return null;
        }
        PorterDuffColorFilter porterDuffColorFilter = this.A04;
        if (porterDuffColorFilter == null) {
            C18070vi.A11("colorFilter");
            throw null;
        }
        drawable.setColorFilter(porterDuffColorFilter);
        return drawable;
    }

    public final Drawable getIcon() {
        return this.A05;
    }

    public final C24253ByB getShape() {
        return this.A00;
    }

    public final C83064Df getSize() {
        return this.A01;
    }

    public final AnonymousClass4D8 getVariant() {
        return this.A08;
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.A07.A01, 1073741824), View.MeasureSpec.makeMeasureSpec(this.A07.A01, 1073741824));
    }

    public final void setIcon(int i) {
        Drawable A0B;
        if (i == 0) {
            A0B = null;
        } else {
            A0B = AnonymousClass3MZ.A0B(this, i);
        }
        setIcon(A0B);
    }

    private final void setupContentStyle(int i) {
        this.A04 = new PorterDuffColorFilter(AnonymousClass3MY.A02(this, i), PorterDuff.Mode.SRC_IN);
    }

    public void setEnabled(boolean z) {
        if (isEnabled() != z) {
            super.setEnabled(z);
            A01();
        }
    }

    public WDSIcon(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        if (!this.A03) {
            this.A03 = true;
            generatedComponent();
        }
    }

    public final void setIcon(Drawable drawable) {
        setupIcon(drawable);
        requestLayout();
    }

    public /* synthetic */ WDSIcon(Context context, AttributeSet attributeSet, int i, AnonymousClass1Y1 r5) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public WDSIcon(Context context) {
        this(context, (AttributeSet) null);
        C18070vi.A0d(context, 1);
    }
}
