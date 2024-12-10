package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import androidx.core.view.inputmethod.EditorInfoCompat;
import java.lang.ref.WeakReference;
import java.util.Locale;

/* renamed from: X.03e  reason: invalid class name and case insensitive filesystem */
public class C007103e {
    public int A00 = 0;
    public Typeface A01;
    public C007903o A02;
    public C007903o A03;
    public C007903o A04;
    public C007903o A05;
    public C007903o A06;
    public C007903o A07;
    public C007903o A08;
    public boolean A09;
    public int A0A = -1;
    public final TextView A0B;
    public final AnonymousClass03f A0C;

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.03o] */
    public static C007903o A00(Context context, AnonymousClass01X r3, int i) {
        ColorStateList A082;
        synchronized (r3) {
            A082 = r3.A00.A08(context, i);
        }
        if (A082 == null) {
            return null;
        }
        ? obj = new Object();
        obj.A02 = true;
        obj.A00 = A082;
        return obj;
    }

    private void A02(Context context, C002401c r11) {
        String string;
        Typeface create;
        int i = this.A00;
        TypedArray typedArray = r11.A02;
        this.A00 = typedArray.getInt(2, i);
        boolean z = false;
        if (Build.VERSION.SDK_INT >= 28) {
            int i2 = typedArray.getInt(11, -1);
            this.A0A = i2;
            if (i2 != -1) {
                this.A00 &= 2;
            }
        }
        if (typedArray.hasValue(10) || typedArray.hasValue(12)) {
            this.A01 = null;
            int i3 = 10;
            if (typedArray.hasValue(12)) {
                i3 = 12;
            }
            int i4 = this.A0A;
            int i5 = this.A00;
            if (!context.isRestricted()) {
                try {
                    Typeface A022 = r11.A02(new C007503j(this, new WeakReference(this.A0B), i4, i5), i3, this.A00);
                    if (A022 != null) {
                        if (Build.VERSION.SDK_INT >= 28 && this.A0A != -1) {
                            Typeface create2 = Typeface.create(A022, 0);
                            int i6 = this.A0A;
                            boolean z2 = false;
                            if ((this.A00 & 2) != 0) {
                                z2 = true;
                            }
                            A022 = AnonymousClass0DC.A00(create2, i6, z2);
                        }
                        this.A01 = A022;
                    }
                    boolean z3 = false;
                    if (this.A01 == null) {
                        z3 = true;
                    }
                    this.A09 = z3;
                } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
                }
            }
            if (this.A01 == null && (string = typedArray.getString(i3)) != null) {
                if (Build.VERSION.SDK_INT < 28 || this.A0A == -1) {
                    create = Typeface.create(string, this.A00);
                } else {
                    Typeface create3 = Typeface.create(string, 0);
                    int i7 = this.A0A;
                    if ((this.A00 & 2) != 0) {
                        z = true;
                    }
                    create = AnonymousClass0DC.A00(create3, i7, z);
                }
            } else {
                return;
            }
        } else if (typedArray.hasValue(1)) {
            this.A09 = false;
            int i8 = typedArray.getInt(1, 1);
            if (i8 == 1) {
                create = Typeface.SANS_SERIF;
            } else if (i8 == 2) {
                create = Typeface.SERIF;
            } else if (i8 == 3) {
                create = Typeface.MONOSPACE;
            } else {
                return;
            }
        } else {
            return;
        }
        this.A01 = create;
    }

    private void A04(Drawable drawable, C007903o r3) {
        if (drawable != null && r3 != null) {
            AnonymousClass02D.A05(drawable, r3, this.A0B.getDrawableState());
        }
    }

    public static void A05(EditorInfo editorInfo, InputConnection inputConnection, TextView textView) {
        if (Build.VERSION.SDK_INT < 30 && inputConnection != null) {
            EditorInfoCompat.setInitialSurroundingText(editorInfo, textView.getText());
        }
    }

    public void A08() {
        if (!(this.A04 == null && this.A08 == null && this.A05 == null && this.A02 == null)) {
            Drawable[] compoundDrawables = this.A0B.getCompoundDrawables();
            A04(compoundDrawables[0], this.A04);
            A04(compoundDrawables[1], this.A08);
            A04(compoundDrawables[2], this.A05);
            A04(compoundDrawables[3], this.A02);
        }
        if (this.A06 != null || this.A03 != null) {
            Drawable[] A072 = A07(this.A0B);
            A04(A072[0], this.A06);
            A04(A072[2], this.A03);
        }
    }

    public void A09(Context context, int i) {
        String string;
        ColorStateList A012;
        ColorStateList A013;
        ColorStateList A014;
        C002401c r4 = new C002401c(context, context.obtainStyledAttributes(i, C002501d.A0N));
        TypedArray typedArray = r4.A02;
        if (typedArray.hasValue(14)) {
            this.A0B.setAllCaps(typedArray.getBoolean(14, false));
        }
        if (Build.VERSION.SDK_INT < 23) {
            if (typedArray.hasValue(3) && (A014 = r4.A01(3)) != null) {
                this.A0B.setTextColor(A014);
            }
            if (typedArray.hasValue(5) && (A013 = r4.A01(5)) != null) {
                this.A0B.setLinkTextColor(A013);
            }
            if (typedArray.hasValue(4) && (A012 = r4.A01(4)) != null) {
                this.A0B.setHintTextColor(A012);
            }
        }
        if (typedArray.hasValue(0) && typedArray.getDimensionPixelSize(0, -1) == 0) {
            this.A0B.setTextSize(0, 0.0f);
        }
        A02(context, r4);
        if (Build.VERSION.SDK_INT >= 26 && typedArray.hasValue(13) && (string = typedArray.getString(13)) != null) {
            AnonymousClass0On.A03(string, this.A0B);
        }
        typedArray.recycle();
        Typeface typeface = this.A01;
        if (typeface != null) {
            this.A0B.setTypeface(typeface, this.A00);
        }
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, X.03o] */
    public void A0A(ColorStateList colorStateList) {
        C007903o r1 = this.A07;
        C007903o r12 = r1;
        if (r1 == null) {
            ? obj = new Object();
            this.A07 = obj;
            r12 = obj;
        }
        r12.A00 = colorStateList;
        boolean z = false;
        if (colorStateList != null) {
            z = true;
        }
        r12.A02 = z;
        this.A04 = r12;
        this.A08 = r12;
        this.A05 = r12;
        this.A02 = r12;
        this.A06 = r12;
        this.A03 = r12;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.Object, X.03o] */
    public void A0B(PorterDuff.Mode mode) {
        C007903o r1 = this.A07;
        C007903o r12 = r1;
        if (r1 == null) {
            ? obj = new Object();
            this.A07 = obj;
            r12 = obj;
        }
        r12.A01 = mode;
        boolean z = false;
        if (mode != null) {
            z = true;
        }
        r12.A03 = z;
        this.A04 = r12;
        this.A08 = r12;
        this.A05 = r12;
        this.A02 = r12;
        this.A06 = r12;
        this.A03 = r12;
    }

    /* JADX WARNING: Removed duplicated region for block: B:183:0x0334  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0337  */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0343  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x010f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0C(android.util.AttributeSet r27, int r28) {
        /*
            r26 = this;
            r12 = r26
            android.widget.TextView r11 = r12.A0B
            android.content.Context r10 = r11.getContext()
            X.01X r9 = X.AnonymousClass01X.A01()
            int[] r2 = X.C002501d.A07
            r8 = 0
            r22 = r27
            r25 = r28
            r1 = r22
            r0 = r25
            X.01c r0 = X.C002401c.A00(r10, r1, r2, r0, r8)
            android.content.Context r20 = r11.getContext()
            android.content.res.TypedArray r3 = r0.A02
            r19 = 0
            r18 = 0
            r21 = r3
            r23 = r11
            r24 = r2
            X.AnonymousClass1HF.A0K(r20, r21, r22, r23, r24, r25)
            r2 = -1
            int r1 = r3.getResourceId(r8, r2)
            r14 = 3
            boolean r0 = r3.hasValue(r14)
            if (r0 == 0) goto L_0x0044
            int r0 = r3.getResourceId(r14, r8)
            X.03o r0 = A00(r10, r9, r0)
            r12.A04 = r0
        L_0x0044:
            r0 = 1
            boolean r0 = r3.hasValue(r0)
            if (r0 == 0) goto L_0x0056
            r0 = 1
            int r0 = r3.getResourceId(r0, r8)
            X.03o r0 = A00(r10, r9, r0)
            r12.A08 = r0
        L_0x0056:
            r13 = 4
            boolean r0 = r3.hasValue(r13)
            if (r0 == 0) goto L_0x0067
            int r0 = r3.getResourceId(r13, r8)
            X.03o r0 = A00(r10, r9, r0)
            r12.A05 = r0
        L_0x0067:
            r0 = 2
            boolean r0 = r3.hasValue(r0)
            if (r0 == 0) goto L_0x0079
            r0 = 2
            int r0 = r3.getResourceId(r0, r8)
            X.03o r0 = A00(r10, r9, r0)
            r12.A02 = r0
        L_0x0079:
            r7 = 5
            boolean r0 = r3.hasValue(r7)
            if (r0 == 0) goto L_0x008a
            int r0 = r3.getResourceId(r7, r8)
            X.03o r0 = A00(r10, r9, r0)
            r12.A06 = r0
        L_0x008a:
            r0 = 6
            boolean r0 = r3.hasValue(r0)
            if (r0 == 0) goto L_0x009c
            r0 = 6
            int r0 = r3.getResourceId(r0, r8)
            X.03o r0 = A00(r10, r9, r0)
            r12.A03 = r0
        L_0x009c:
            r3.recycle()
            android.text.method.TransformationMethod r0 = r11.getTransformationMethod()
            boolean r0 = r0 instanceof android.text.method.PasswordTransformationMethod
            r17 = r0
            r3 = 23
            if (r1 == r2) goto L_0x034c
            int[] r0 = X.C002501d.A0N
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r1, r0)
            X.01c r1 = new X.01c
            r1.<init>(r10, r0)
            if (r17 != 0) goto L_0x0348
            r0 = 14
            android.content.res.TypedArray r2 = r1.A02
            boolean r0 = r2.hasValue(r0)
            if (r0 == 0) goto L_0x0348
            r0 = 14
            boolean r16 = r2.getBoolean(r0, r8)
            r19 = 1
        L_0x00ca:
            r12.A02(r10, r1)
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 >= r3) goto L_0x0343
            android.content.res.TypedArray r2 = r1.A02
            boolean r0 = r2.hasValue(r14)
            if (r0 == 0) goto L_0x0340
            android.content.res.ColorStateList r6 = r1.A01(r14)
        L_0x00dd:
            boolean r0 = r2.hasValue(r13)
            if (r0 == 0) goto L_0x033d
            android.content.res.ColorStateList r5 = r1.A01(r13)
        L_0x00e7:
            boolean r0 = r2.hasValue(r7)
            if (r0 == 0) goto L_0x033a
            android.content.res.ColorStateList r4 = r1.A01(r7)
        L_0x00f1:
            r0 = 15
            android.content.res.TypedArray r1 = r1.A02
            boolean r0 = r1.hasValue(r0)
            if (r0 == 0) goto L_0x0337
            r0 = 15
            java.lang.String r3 = r1.getString(r0)
        L_0x0101:
            int r2 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r2 < r0) goto L_0x0334
            r0 = 13
            boolean r0 = r1.hasValue(r0)
            if (r0 == 0) goto L_0x0334
            r0 = 13
            java.lang.String r2 = r1.getString(r0)
        L_0x0115:
            r1.recycle()
        L_0x0118:
            int[] r0 = X.C002501d.A0N
            r15 = r22
            r1 = r25
            X.01c r1 = X.C002401c.A00(r10, r15, r0, r1, r8)
            if (r17 != 0) goto L_0x013b
            android.content.res.TypedArray r0 = r1.A02
            r20 = r0
            r0 = 14
            r15 = r0
            r0 = r20
            boolean r0 = r0.hasValue(r15)
            if (r0 == 0) goto L_0x013b
            r0 = r20
            boolean r16 = r0.getBoolean(r15, r8)
            r19 = 1
        L_0x013b:
            int r15 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r15 >= r0) goto L_0x0161
            android.content.res.TypedArray r15 = r1.A02
            boolean r0 = r15.hasValue(r14)
            if (r0 == 0) goto L_0x014d
            android.content.res.ColorStateList r6 = r1.A01(r14)
        L_0x014d:
            boolean r0 = r15.hasValue(r13)
            if (r0 == 0) goto L_0x0157
            android.content.res.ColorStateList r5 = r1.A01(r13)
        L_0x0157:
            boolean r0 = r15.hasValue(r7)
            if (r0 == 0) goto L_0x0161
            android.content.res.ColorStateList r4 = r1.A01(r7)
        L_0x0161:
            r0 = 15
            android.content.res.TypedArray r13 = r1.A02
            boolean r0 = r13.hasValue(r0)
            if (r0 == 0) goto L_0x0171
            r0 = 15
            java.lang.String r3 = r13.getString(r0)
        L_0x0171:
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 26
            if (r7 < r0) goto L_0x019a
            r0 = 13
            boolean r0 = r13.hasValue(r0)
            if (r0 == 0) goto L_0x0185
            r0 = 13
            java.lang.String r2 = r13.getString(r0)
        L_0x0185:
            r0 = 28
            if (r7 < r0) goto L_0x019a
            boolean r0 = r13.hasValue(r8)
            if (r0 == 0) goto L_0x019a
            r0 = -1
            int r0 = r13.getDimensionPixelSize(r8, r0)
            if (r0 != 0) goto L_0x019a
            r0 = 0
            r11.setTextSize(r8, r0)
        L_0x019a:
            r12.A02(r10, r1)
            r13.recycle()
            if (r6 == 0) goto L_0x01a5
            r11.setTextColor(r6)
        L_0x01a5:
            if (r5 == 0) goto L_0x01aa
            r11.setHintTextColor(r5)
        L_0x01aa:
            if (r4 == 0) goto L_0x01af
            r11.setLinkTextColor(r4)
        L_0x01af:
            if (r17 != 0) goto L_0x01b8
            if (r19 == 0) goto L_0x01b8
            r0 = r16
            r11.setAllCaps(r0)
        L_0x01b8:
            android.graphics.Typeface r4 = r12.A01
            if (r4 == 0) goto L_0x01c6
            int r1 = r12.A0A
            r0 = -1
            if (r1 != r0) goto L_0x032f
            int r0 = r12.A00
            r11.setTypeface(r4, r0)
        L_0x01c6:
            if (r2 == 0) goto L_0x01cb
            X.AnonymousClass0On.A03(r2, r11)
        L_0x01cb:
            if (r3 == 0) goto L_0x01d8
            r0 = 24
            if (r7 < r0) goto L_0x031e
            android.os.LocaleList r0 = X.C03750Km.A00(r3)
            X.C03750Km.A01(r0, r11)
        L_0x01d8:
            X.03f r3 = r12.A0C
            r1 = r22
            r0 = r25
            r3.A0D(r1, r0)
            boolean r0 = X.C002801g.A01
            if (r0 == 0) goto L_0x020e
            int r0 = r3.A03
            if (r0 == 0) goto L_0x020e
            int[] r2 = r3.A06
            int r0 = r2.length
            if (r0 <= 0) goto L_0x020e
            int r0 = X.AnonymousClass0On.A00(r11)
            float r1 = (float) r0
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0319
            float r0 = r3.A01
            int r2 = java.lang.Math.round(r0)
            float r0 = r3.A00
            int r1 = java.lang.Math.round(r0)
            float r0 = r3.A02
            int r0 = java.lang.Math.round(r0)
            X.AnonymousClass0On.A01(r11, r2, r1, r0)
        L_0x020e:
            int[] r1 = X.C002501d.A08
            r0 = r22
            android.content.res.TypedArray r0 = r10.obtainStyledAttributes(r0, r1)
            X.01c r7 = new X.01c
            r7.<init>(r10, r0)
            r1 = -1
            r0 = 8
            r4 = -1
            android.content.res.TypedArray r3 = r7.A02
            int r0 = r3.getResourceId(r0, r1)
            if (r0 == r1) goto L_0x0316
            android.graphics.drawable.Drawable r14 = r9.A03(r10, r0)
        L_0x022b:
            r0 = 13
            int r0 = r3.getResourceId(r0, r1)
            if (r0 == r1) goto L_0x0313
            android.graphics.drawable.Drawable r12 = r9.A03(r10, r0)
        L_0x0237:
            r0 = 9
            int r0 = r3.getResourceId(r0, r1)
            if (r0 == r1) goto L_0x0310
            android.graphics.drawable.Drawable r13 = r9.A03(r10, r0)
        L_0x0243:
            r0 = 6
            int r0 = r3.getResourceId(r0, r1)
            if (r0 == r1) goto L_0x030d
            android.graphics.drawable.Drawable r8 = r9.A03(r10, r0)
        L_0x024e:
            r0 = 10
            int r0 = r3.getResourceId(r0, r1)
            if (r0 == r1) goto L_0x030a
            android.graphics.drawable.Drawable r2 = r9.A03(r10, r0)
        L_0x025a:
            r0 = 7
            int r0 = r3.getResourceId(r0, r1)
            if (r0 == r1) goto L_0x0307
            android.graphics.drawable.Drawable r1 = r9.A03(r10, r0)
        L_0x0265:
            r9 = 3
            r6 = 1
            r5 = 2
            if (r2 != 0) goto L_0x02ef
            if (r1 != 0) goto L_0x02ef
            if (r14 != 0) goto L_0x0274
            if (r12 != 0) goto L_0x0274
            if (r13 != 0) goto L_0x0274
            if (r8 == 0) goto L_0x0297
        L_0x0274:
            android.graphics.drawable.Drawable[] r2 = A07(r11)
            r1 = r2[r18]
            if (r1 != 0) goto L_0x02e1
            r0 = r2[r5]
            if (r0 != 0) goto L_0x02e1
            android.graphics.drawable.Drawable[] r0 = r11.getCompoundDrawables()
            if (r14 != 0) goto L_0x0288
            r14 = r0[r18]
        L_0x0288:
            if (r12 != 0) goto L_0x028c
            r12 = r0[r6]
        L_0x028c:
            if (r13 != 0) goto L_0x0290
            r13 = r0[r5]
        L_0x0290:
            if (r8 != 0) goto L_0x0294
            r8 = r0[r9]
        L_0x0294:
            r11.setCompoundDrawablesWithIntrinsicBounds(r14, r12, r13, r8)
        L_0x0297:
            r1 = 11
            boolean r0 = r3.hasValue(r1)
            if (r0 == 0) goto L_0x02a6
            android.content.res.ColorStateList r0 = r7.A01(r1)
            X.C29261bv.A02(r0, r11)
        L_0x02a6:
            r0 = 12
            boolean r0 = r3.hasValue(r0)
            if (r0 == 0) goto L_0x02bc
            r0 = 12
            int r1 = r3.getInt(r0, r4)
            r0 = 0
            android.graphics.PorterDuff$Mode r0 = X.C005902p.A00(r0, r1)
            X.C29261bv.A03(r0, r11)
        L_0x02bc:
            r0 = 15
            int r2 = r3.getDimensionPixelSize(r0, r4)
            r0 = 18
            int r1 = r3.getDimensionPixelSize(r0, r4)
            r0 = 19
            int r0 = r3.getDimensionPixelSize(r0, r4)
            r3.recycle()
            if (r2 == r4) goto L_0x02d6
            X.C29261bv.A05(r11, r2)
        L_0x02d6:
            if (r1 == r4) goto L_0x02db
            X.C29261bv.A06(r11, r1)
        L_0x02db:
            if (r0 == r4) goto L_0x02e0
            X.C29261bv.A07(r11, r0)
        L_0x02e0:
            return
        L_0x02e1:
            if (r12 != 0) goto L_0x02e5
            r12 = r2[r6]
        L_0x02e5:
            r0 = r2[r5]
            if (r8 != 0) goto L_0x02eb
            r8 = r2[r9]
        L_0x02eb:
            A03(r1, r12, r0, r8, r11)
            goto L_0x0297
        L_0x02ef:
            android.graphics.drawable.Drawable[] r0 = A07(r11)
            if (r2 != 0) goto L_0x02f7
            r2 = r0[r18]
        L_0x02f7:
            if (r12 != 0) goto L_0x02fb
            r12 = r0[r6]
        L_0x02fb:
            if (r1 != 0) goto L_0x02ff
            r1 = r0[r5]
        L_0x02ff:
            if (r8 != 0) goto L_0x0303
            r8 = r0[r9]
        L_0x0303:
            A03(r2, r12, r1, r8, r11)
            goto L_0x0297
        L_0x0307:
            r1 = 0
            goto L_0x0265
        L_0x030a:
            r2 = 0
            goto L_0x025a
        L_0x030d:
            r8 = 0
            goto L_0x024e
        L_0x0310:
            r13 = 0
            goto L_0x0243
        L_0x0313:
            r12 = 0
            goto L_0x0237
        L_0x0316:
            r14 = 0
            goto L_0x022b
        L_0x0319:
            X.AnonymousClass0On.A02(r11, r2)
            goto L_0x020e
        L_0x031e:
            java.lang.String r0 = ","
            java.lang.String[] r0 = r3.split(r0)
            r0 = r0[r8]
            java.util.Locale r0 = A01(r0)
            A06(r11, r0)
            goto L_0x01d8
        L_0x032f:
            r11.setTypeface(r4)
            goto L_0x01c6
        L_0x0334:
            r2 = 0
            goto L_0x0115
        L_0x0337:
            r3 = 0
            goto L_0x0101
        L_0x033a:
            r4 = 0
            goto L_0x00f1
        L_0x033d:
            r5 = 0
            goto L_0x00e7
        L_0x0340:
            r6 = 0
            goto L_0x00dd
        L_0x0343:
            r5 = 0
            r4 = 0
            r6 = 0
            goto L_0x00f1
        L_0x0348:
            r16 = 0
            goto L_0x00ca
        L_0x034c:
            r5 = 0
            r2 = 0
            r16 = 0
            r4 = 0
            r3 = 0
            r6 = 0
            goto L_0x0118
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C007103e.A0C(android.util.AttributeSet, int):void");
    }

    public C007103e(TextView textView) {
        this.A0B = textView;
        this.A0C = new AnonymousClass03f(textView);
    }

    public static Locale A01(String str) {
        return Locale.forLanguageTag(str);
    }

    public static void A06(TextView textView, Locale locale) {
        textView.setTextLocale(locale);
    }

    public static Drawable[] A07(TextView textView) {
        return textView.getCompoundDrawablesRelative();
    }

    public static void A03(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4, TextView textView) {
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
    }
}
