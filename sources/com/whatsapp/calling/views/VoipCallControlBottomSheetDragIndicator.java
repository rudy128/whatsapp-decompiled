package com.whatsapp.calling.views;

import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass4IY;
import X.AnonymousClass7DS;
import X.C108945cZ;
import X.C108985cd;
import X.C1407973c;
import X.C1422678u;
import X.C1594784r;
import X.C72463Mc;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;

public class VoipCallControlBottomSheetDragIndicator extends View implements AnonymousClass009 {
    public float A00;
    public int A01;
    public AnonymousClass031 A02;
    public boolean A03;
    public float A04;
    public C1594784r A05;
    public boolean A06;
    public final Paint A07;
    public final Path A08;

    public static boolean A01(VoipCallControlBottomSheetDragIndicator voipCallControlBottomSheetDragIndicator, int i) {
        C1594784r r0;
        if (i == 0) {
            voipCallControlBottomSheetDragIndicator.A03 = true;
            return false;
        } else if (i != 1) {
            if (i != 2) {
                voipCallControlBottomSheetDragIndicator.A03 = false;
            }
            return false;
        } else {
            if (voipCallControlBottomSheetDragIndicator.A03 && (r0 = voipCallControlBottomSheetDragIndicator.A05) != null) {
                float f = voipCallControlBottomSheetDragIndicator.A00;
                C1407973c r2 = ((AnonymousClass7DS) r0).A00.A0K;
                if (r2 != null) {
                    int i2 = 3;
                    if (f > 0.0f) {
                        i2 = 4;
                    }
                    C1407973c.A01(r2, i2);
                }
            }
            voipCallControlBottomSheetDragIndicator.A03 = false;
            return true;
        }
    }

    /* JADX INFO: finally extract failed */
    private void A00(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass4IY.A06);
            try {
                int color = obtainStyledAttributes.getColor(0, -1);
                obtainStyledAttributes.recycle();
                Paint paint = this.A07;
                AnonymousClass3MW.A1P(paint);
                paint.setStrokeCap(Paint.Cap.ROUND);
                paint.setStrokeWidth(C72463Mc.A00(context) * 4.0f);
                paint.setColor(color);
                this.A04 = TypedValue.applyDimension(1, 2.5f, AnonymousClass3Ma.A09(this));
                AnonymousClass3MW.A1Q(this);
                Context context2 = getContext();
                int i = 2131898190;
                if (this.A00 > 0.0f) {
                    i = 2131898205;
                }
                AnonymousClass3MY.A0w(context2, this, i);
            } catch (Throwable th) {
                obtainStyledAttributes.recycle();
                throw th;
            }
        }
    }

    public void A02() {
        if (!this.A06) {
            this.A06 = true;
            generatedComponent();
        }
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A02;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A02 = r0;
        }
        return r0.generatedComponent();
    }

    public void setOnClickListener(C1594784r r3) {
        this.A05 = r3;
        super.setOnTouchListener(new C1422678u((Object) this, 5));
    }

    public void setSlideOffset(float f) {
        float f2;
        if (f > 1.0f) {
            f2 = 1.0f;
        } else if (f <= 0.0f) {
            f2 = -1.0f;
        } else {
            f2 = (f - 0.5f) * 2.0f;
        }
        this.A00 = f2;
        if (f2 == 1.0f || f2 == -1.0f) {
            Context context = getContext();
            int i = 2131898190;
            if (this.A00 > 0.0f) {
                i = 2131898205;
            }
            AnonymousClass3MY.A0w(context, this, i);
        }
        invalidate();
    }

    public VoipCallControlBottomSheetDragIndicator(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        A02();
        this.A07 = AnonymousClass3MZ.A0A();
        this.A08 = C108945cZ.A0L();
        this.A00 = -1.0f;
        A00(context, attributeSet);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float paddingLeft = (float) getPaddingLeft();
        float paddingTop = (float) getPaddingTop();
        float A09 = (float) C72463Mc.A09(this);
        float A052 = (float) C108985cd.A05(this);
        float f = (A052 + paddingTop) / 2.0f;
        float f2 = this.A00;
        float f3 = (((A052 - paddingTop) / 2.0f) * f2) + f;
        float f4 = f + (this.A04 * (-f2));
        Path path = this.A08;
        path.reset();
        path.moveTo(paddingLeft, f4);
        path.lineTo((paddingLeft + A09) / 2.0f, f3);
        path.lineTo(A09, f4);
        canvas.drawPath(path, this.A07);
    }

    public VoipCallControlBottomSheetDragIndicator(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        A02();
        this.A07 = AnonymousClass3MZ.A0A();
        this.A08 = C108945cZ.A0L();
        this.A00 = -1.0f;
        A00(context, attributeSet);
    }

    public VoipCallControlBottomSheetDragIndicator(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        A02();
        this.A07 = AnonymousClass3MZ.A0A();
        this.A08 = C108945cZ.A0L();
        this.A00 = -1.0f;
        A00(context, attributeSet);
    }

    public VoipCallControlBottomSheetDragIndicator(Context context) {
        super(context);
        A02();
        this.A07 = AnonymousClass3MZ.A0A();
        this.A08 = C108945cZ.A0L();
        this.A00 = -1.0f;
    }

    public VoipCallControlBottomSheetDragIndicator(Context context, AttributeSet attributeSet, int i, int i2, int i3) {
        super(context, attributeSet);
        A02();
    }
}
