package com.whatsapp.numberkeyboard;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass11C;
import X.AnonymousClass3MW;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass8BU;
import X.AnonymousClass9QB;
import X.BE6;
import X.Bv0;
import X.C108945cZ;
import X.C108965cb;
import X.C17880vN;
import X.C18000vb;
import X.C24075Bv1;
import X.C24931CQe;
import X.C27007DPd;
import X.C27691Xc;
import X.C5J;
import X.C84144If;
import X.CT2;
import X.D55;
import X.E8G;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.RectF;
import android.provider.Settings;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.whatsapp.WaEditText;
import java.text.NumberFormat;
import java.util.Iterator;
import java.util.Map;

public class NumberEntryKeyboard extends LinearLayout implements AnonymousClass009 {
    public static final int A0J = ((int) Math.floor(20.399999618530273d));
    public int A00;
    public int A01;
    public long A02;
    public View A03;
    public EditText A04;
    public AnonymousClass11C A05;
    public C18000vb A06;
    public C24931CQe A07;
    public E8G A08;
    public AnonymousClass031 A09;
    public Map A0A;
    public boolean A0B;
    public boolean A0C;
    public View[][] A0D;
    public C5J[][] A0E;
    public Paint A0F;
    public RectF A0G;
    public final View.OnTouchListener A0H;
    public final Map A0I;

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A09;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A09 = r0;
        }
        return r0.generatedComponent();
    }

    public void setCustomKey(E8G e8g) {
        this.A08 = e8g;
        View[] viewArr = this.A0D[3];
        char c = 2;
        if (AnonymousClass3MY.A1b(this.A06)) {
            c = 0;
        }
        ViewGroup viewGroup = (ViewGroup) viewArr[c];
        viewGroup.removeAllViews();
        if (e8g != null) {
            viewGroup.addView(e8g.BbV(getContext()));
        }
        invalidate();
    }

    public NumberEntryKeyboard(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!this.A0C) {
            this.A0C = true;
            C27691Xc.A11((C27691Xc) ((AnonymousClass033) generatedComponent()), this);
        }
        this.A0I = C17880vN.A11();
        this.A02 = -1;
        this.A0H = new D55(this, 7);
        A01(context, attributeSet);
    }

    public static C27007DPd A00(C18000vb r1) {
        if (AnonymousClass9QB.A00(r1).equals(".")) {
            return new C24075Bv1();
        }
        return new Bv0();
    }

    private void A01(Context context, AttributeSet attributeSet) {
        KeyEvent.Callback callback;
        View[] viewArr;
        View.inflate(getContext(), 2131626286, this);
        ViewGroup viewGroup = (ViewGroup) findViewById(2131429752);
        boolean z = false;
        if (attributeSet != null && context.getTheme().obtainStyledAttributes(attributeSet, C84144If.A0F, 0, 0).getInteger(0, 0) == 1) {
            C27007DPd A002 = A00(this.A06);
            this.A08 = A002;
            viewGroup.addView(A002.BbV(context));
        }
        View[][] viewArr2 = new View[4][];
        View[] viewArr3 = new View[3];
        if (AnonymousClass3MY.A1b(this.A06)) {
            BE6.A1C(this, viewArr3, 2131433283, 0);
            BE6.A1C(this, viewArr3, 2131436472, 1);
            BE6.A1C(this, viewArr3, 2131436122, 2);
            viewArr2[0] = viewArr3;
            View[] viewArr4 = new View[3];
            BE6.A1C(this, viewArr4, 2131430994, 0);
            BE6.A1C(this, viewArr4, 2131430892, 1);
            BE6.A1C(this, viewArr4, 2131435468, 2);
            viewArr2[1] = viewArr4;
            View[] viewArr5 = new View[3];
            BE6.A1C(this, viewArr5, 2131435337, 0);
            BE6.A1C(this, viewArr5, 2131430278, 1);
            BE6.A1C(this, viewArr5, 2131433128, 2);
            viewArr2[2] = viewArr5;
            View[] viewArr6 = new View[3];
            viewArr6[0] = viewGroup;
            BE6.A1C(this, viewArr6, 2131437101, 1);
            viewArr = viewArr6;
            callback = findViewById(2131428024);
        } else {
            BE6.A1C(this, viewArr3, 2131436122, 0);
            BE6.A1C(this, viewArr3, 2131436472, 1);
            BE6.A1C(this, viewArr3, 2131433283, 2);
            viewArr2[0] = viewArr3;
            View[] viewArr7 = new View[3];
            BE6.A1C(this, viewArr7, 2131435468, 0);
            BE6.A1C(this, viewArr7, 2131430892, 1);
            BE6.A1C(this, viewArr7, 2131430994, 2);
            viewArr2[1] = viewArr7;
            View[] viewArr8 = new View[3];
            BE6.A1C(this, viewArr8, 2131433128, 0);
            BE6.A1C(this, viewArr8, 2131430278, 1);
            BE6.A1C(this, viewArr8, 2131435337, 2);
            viewArr2[2] = viewArr8;
            View[] viewArr9 = new View[3];
            BE6.A1C(this, viewArr9, 2131428024, 0);
            BE6.A1C(this, viewArr9, 2131437101, 1);
            callback = viewGroup;
            viewArr = viewArr9;
        }
        viewArr[2] = callback;
        viewArr2[3] = viewArr;
        this.A0D = viewArr2;
        if (attributeSet != null && context.getTheme().obtainStyledAttributes(attributeSet, C84144If.A0F, 0, 0).getInteger(0, 0) == 1) {
            setCustomKey(A00(this.A06));
        }
        int dimensionPixelSize = AnonymousClass000.A0Y(this).getDimensionPixelSize(2131168088);
        setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
        setOrientation(1);
        setBackgroundColor(AnonymousClass3MZ.A02(getContext(), getContext(), 2130970611, 2131102000));
        for (View[] viewArr10 : this.A0D) {
            int i = 0;
            while (true) {
                if (i >= viewArr10.length) {
                    break;
                }
                View view = viewArr10[i];
                if (view != null && (view instanceof TextView)) {
                    TextView textView = (TextView) view;
                    NumberFormat A0L = this.A06.A0L();
                    int id = view.getId();
                    int i2 = 0;
                    if (id != 2131437101) {
                        i2 = 1;
                        if (id != 2131433283) {
                            i2 = 2;
                            if (id != 2131436472) {
                                i2 = 3;
                                if (id != 2131436122) {
                                    i2 = 4;
                                    if (id != 2131430994) {
                                        i2 = 5;
                                        if (id != 2131430892) {
                                            i2 = 6;
                                            if (id != 2131435468) {
                                                i2 = 7;
                                                if (id != 2131435337) {
                                                    i2 = 9;
                                                    if (id == 2131430278) {
                                                        i2 = 8;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    textView.setText(A0L.format((long) i2));
                }
                i++;
            }
        }
        if (Settings.System.getFloat(this.A05.A0O().A00, "window_animation_scale", 1.0f) == 1.0f) {
            z = true;
        }
        this.A0B = z;
        if (z) {
            Paint A0K = C108945cZ.A0K(1);
            this.A0F = A0K;
            A0K.setColor(AnonymousClass3Ma.A00(context, 2130970612, 2131102001));
            C108945cZ.A1L(this.A0F);
            C108965cb.A11(this.A0F, PorterDuff.Mode.SRC_OVER);
            this.A0G = AnonymousClass3MW.A08();
            this.A0A = C17880vN.A11();
            this.A07 = new C24931CQe(this);
        }
        setOnTouchListener(this.A0H);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.A0B) {
            Map map = this.A0A;
            map.getClass();
            Iterator A0x = AnonymousClass8BU.A0x(map);
            while (A0x.hasNext()) {
                CT2 ct2 = (CT2) this.A0A.get(A0x.next());
                ct2.getClass();
                PointF pointF = ct2.A05;
                pointF.getClass();
                float f = ct2.A00;
                float f2 = pointF.x;
                float f3 = f / 2.0f;
                float f4 = pointF.y;
                RectF rectF = this.A0G;
                rectF.getClass();
                rectF.set(f2 - f3, f4 - f3, f2 + f3, f4 + f3);
                Paint paint = this.A0F;
                paint.getClass();
                paint.setAlpha(ct2.A01);
                canvas.drawOval(this.A0G, this.A0F);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v22, resolved type: X.C5J[][]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v23, resolved type: java.lang.Object[]} */
    /* JADX WARNING: type inference failed for: r1v7, types: [java.lang.Object, X.C5J] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r16, int r17, int r18, int r19, int r20) {
        /*
            r15 = this;
            super.onLayout(r16, r17, r18, r19, r20)
            if (r16 == 0) goto L_0x0093
            float r6 = X.C108945cZ.A03(r15)
            float r14 = X.C108945cZ.A04(r15)
            android.view.View[][] r1 = r15.A0D
            r13 = 0
            r0 = r1[r13]
            int r4 = r0.length
            float r0 = (float) r4
            float r6 = r6 / r0
            int r3 = r1.length
            float r0 = (float) r3
            float r14 = r14 / r0
            double r0 = (double) r6
            double r1 = java.lang.Math.floor(r0)
            int r0 = (int) r1
            int r0 = r0 + 12
            r15.A00 = r0
            float r0 = (float) r0
            r12 = 1073741824(0x40000000, float:2.0)
            float r0 = r0 / r12
            int r0 = (int) r0
            r15.A01 = r0
            int[] r1 = X.C108945cZ.A1W()
            r11 = 1
            r1[r11] = r4
            r1[r13] = r3
            java.lang.Class<X.C5J> r0 = X.C5J.class
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r0, r1)
            X.C5J[][] r0 = (X.C5J[][]) r0
            r15.A0E = r0
            r5 = 0
        L_0x003d:
            android.view.View[][] r0 = r15.A0D
            int r0 = r0.length
            if (r5 >= r0) goto L_0x0093
            r4 = 0
        L_0x0043:
            android.view.View[][] r2 = r15.A0D
            r0 = r2[r13]
            int r1 = r0.length
            if (r4 >= r1) goto L_0x0090
            r0 = r2[r5]
            r3 = r0[r4]
            float r10 = (float) r4
            float r10 = r10 * r6
            float r9 = (float) r5
            float r9 = r9 * r14
            float r8 = r10 + r6
            float r7 = r9 + r14
            if (r4 != 0) goto L_0x0085
            int r0 = r15.getPaddingLeft()
        L_0x005c:
            float r2 = (float) r0
        L_0x005d:
            float r1 = r9 + r7
            float r1 = r1 / r12
            float r0 = r10 + r8
            float r0 = r0 / r12
            float r0 = r0 + r2
            android.graphics.PointF r2 = new android.graphics.PointF
            r2.<init>(r0, r1)
            android.graphics.RectF r0 = new android.graphics.RectF
            r0.<init>(r10, r9, r8, r7)
            X.C5J r1 = new X.C5J
            r1.<init>()
            r1.A01 = r0
            r1.A00 = r2
            X.C5J[][] r0 = r15.A0E
            r0 = r0[r5]
            r0[r4] = r1
            java.util.Map r0 = r15.A0I
            r0.put(r3, r1)
            int r4 = r4 + 1
            goto L_0x0043
        L_0x0085:
            int r1 = r1 - r11
            if (r4 != r1) goto L_0x008e
            int r0 = r15.getPaddingRight()
            int r0 = -r0
            goto L_0x005c
        L_0x008e:
            r2 = 0
            goto L_0x005d
        L_0x0090:
            int r5 = r5 + 1
            goto L_0x003d
        L_0x0093:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.numberkeyboard.NumberEntryKeyboard.onLayout(boolean, int, int, int, int):void");
    }

    public void setEditText(WaEditText waEditText) {
        this.A04 = waEditText;
    }

    public NumberEntryKeyboard(Context context) {
        this(context, (AttributeSet) null);
    }

    public NumberEntryKeyboard(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NumberEntryKeyboard(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        if (!this.A0C) {
            this.A0C = true;
            C27691Xc.A11((C27691Xc) ((AnonymousClass033) generatedComponent()), this);
        }
        this.A0I = C17880vN.A11();
        this.A02 = -1;
        this.A0H = new D55(this, 7);
        A01(context, attributeSet);
    }
}
