package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.03f  reason: invalid class name */
public class AnonymousClass03f {
    public static ConcurrentHashMap A0B = new ConcurrentHashMap();
    public static ConcurrentHashMap A0C = new ConcurrentHashMap();
    public static final RectF A0D = new RectF();
    public float A00 = -1.0f;
    public float A01 = -1.0f;
    public float A02 = -1.0f;
    public int A03 = 0;
    public TextPaint A04;
    public boolean A05 = false;
    public int[] A06 = new int[0];
    public boolean A07 = false;
    public final TextView A08;
    public final C007203g A09;
    public final Context A0A;

    public static int[] A08(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            int i = 0;
            do {
                int i2 = iArr[i];
                if (i2 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i2)) < 0) {
                    arrayList.add(Integer.valueOf(i2));
                }
                i++;
            } while (i < length);
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i3 = 0; i3 < size; i3++) {
                    iArr2[i3] = ((Number) arrayList.get(i3)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public static Method A03(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = A0C;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to retrieve TextView#");
            sb.append(str);
            sb.append("() method");
            Log.w("ACTVAutoSizeHelper", sb.toString(), e);
            return null;
        }
    }

    private void A04(float f, float f2, float f3) {
        if (f <= 0.0f) {
            StringBuilder sb = new StringBuilder();
            sb.append("Minimum auto-size text size (");
            sb.append(f);
            sb.append("px) is less or equal to (0px)");
            throw new IllegalArgumentException(sb.toString());
        } else if (f2 <= f) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Maximum auto-size text size (");
            sb2.append(f2);
            sb2.append("px) is less or equal to minimum auto-size text size (");
            sb2.append(f);
            sb2.append("px)");
            throw new IllegalArgumentException(sb2.toString());
        } else if (f3 > 0.0f) {
            this.A03 = 1;
            this.A01 = f;
            this.A00 = f2;
            this.A02 = f3;
            this.A07 = false;
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("The auto-size step granularity (");
            sb3.append(f3);
            sb3.append("px) is less or equal to (0px)");
            throw new IllegalArgumentException(sb3.toString());
        }
    }

    private boolean A05() {
        if (!(!(this.A08 instanceof C007603k)) || this.A03 != 1) {
            this.A05 = false;
            return false;
        }
        if (!this.A07 || this.A06.length == 0) {
            float f = this.A00;
            float f2 = this.A01;
            float f3 = this.A02;
            int floor = ((int) Math.floor((double) ((f - f2) / f3))) + 1;
            int[] iArr = new int[floor];
            for (int i = 0; i < floor; i++) {
                iArr[i] = Math.round((((float) i) * f3) + f2);
            }
            this.A06 = A08(iArr);
        }
        this.A05 = true;
        return true;
    }

    private boolean A06() {
        int[] iArr = this.A06;
        int length = iArr.length;
        boolean z = false;
        if (length > 0) {
            z = true;
        }
        this.A07 = z;
        if (z) {
            this.A03 = 1;
            this.A01 = (float) iArr[0];
            this.A00 = (float) iArr[length - 1];
            this.A02 = -1.0f;
        }
        return z;
    }

    public void A0A(int i) {
        if (!(!(this.A08 instanceof C007603k))) {
            return;
        }
        if (i == 0) {
            this.A03 = 0;
            this.A01 = -1.0f;
            this.A00 = -1.0f;
            this.A02 = -1.0f;
            this.A06 = new int[0];
            this.A05 = false;
        } else if (i == 1) {
            DisplayMetrics displayMetrics = this.A0A.getResources().getDisplayMetrics();
            A04(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (A05()) {
                A09();
            }
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unknown auto-size text type: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public void A0B(int i, float f) {
        Resources resources;
        Context context = this.A0A;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i, f, resources.getDisplayMetrics());
        TextView textView = this.A08;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean A072 = A07(textView);
            if (textView.getLayout() != null) {
                this.A05 = false;
                try {
                    Method A032 = A03("nullLayouts");
                    if (A032 != null) {
                        A032.invoke(textView, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!A072) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    public void A0C(int i, int i2, int i3, int i4) {
        if (!(this.A08 instanceof C007603k)) {
            DisplayMetrics displayMetrics = this.A0A.getResources().getDisplayMetrics();
            A04(TypedValue.applyDimension(i4, (float) i, displayMetrics), TypedValue.applyDimension(i4, (float) i2, displayMetrics), TypedValue.applyDimension(i4, (float) i3, displayMetrics));
            if (A05()) {
                A09();
            }
        }
    }

    public void A0D(AttributeSet attributeSet, int i) {
        float f;
        float f2;
        float f3;
        int resourceId;
        Context context = this.A0A;
        int[] iArr = C002501d.A08;
        AttributeSet attributeSet2 = attributeSet;
        int i2 = i;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet2, iArr, i2, 0);
        TextView textView = this.A08;
        AnonymousClass1HF.A0K(textView.getContext(), obtainStyledAttributes, attributeSet2, textView, iArr, i2);
        if (obtainStyledAttributes.hasValue(5)) {
            this.A03 = obtainStyledAttributes.getInt(5, 0);
        }
        if (obtainStyledAttributes.hasValue(4)) {
            f = obtainStyledAttributes.getDimension(4, -1.0f);
        } else {
            f = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(2)) {
            f2 = obtainStyledAttributes.getDimension(2, -1.0f);
        } else {
            f2 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(1)) {
            f3 = obtainStyledAttributes.getDimension(1, -1.0f);
        } else {
            f3 = -1.0f;
        }
        if (obtainStyledAttributes.hasValue(3) && (resourceId = obtainStyledAttributes.getResourceId(3, 0)) > 0) {
            TypedArray obtainTypedArray = obtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            int length = obtainTypedArray.length();
            int[] iArr2 = new int[length];
            if (length > 0) {
                int i3 = 0;
                do {
                    iArr2[i3] = obtainTypedArray.getDimensionPixelSize(i3, -1);
                    i3++;
                } while (i3 < length);
                this.A06 = A08(iArr2);
                A06();
            }
            obtainTypedArray.recycle();
        }
        obtainStyledAttributes.recycle();
        if (!(!(textView instanceof C007603k))) {
            this.A03 = 0;
        } else if (this.A03 == 1) {
            if (!this.A07) {
                DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                if (f2 == -1.0f) {
                    f2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (f3 == -1.0f) {
                    f3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (f == -1.0f) {
                    f = 1.0f;
                }
                A04(f2, f3, f);
            }
            A05();
        }
    }

    public void A0E(int[] iArr, int i) {
        if (!(this.A08 instanceof C007603k)) {
            int length = iArr.length;
            int i2 = 0;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.A0A.getResources().getDisplayMetrics();
                    do {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, (float) iArr[i2], displayMetrics));
                        i2++;
                    } while (i2 < length);
                }
                this.A06 = A08(iArr2);
                if (!A06()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("None of the preset sizes is valid: ");
                    sb.append(Arrays.toString(iArr));
                    throw new IllegalArgumentException(sb.toString());
                }
            } else {
                this.A07 = false;
            }
            if (A05()) {
                A09();
            }
        }
    }

    public boolean A0F() {
        if (!(!(this.A08 instanceof C007603k)) || this.A03 == 0) {
            return false;
        }
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: X.03h} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: X.03i} */
    /* JADX WARNING: type inference failed for: r0v7, types: [X.03g] */
    /* JADX WARNING: type inference failed for: r0v9 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass03f(android.widget.TextView r3) {
        /*
            r2 = this;
            r2.<init>()
            r1 = 0
            r2.A03 = r1
            r2.A05 = r1
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2.A02 = r0
            r2.A01 = r0
            r2.A00 = r0
            int[] r0 = new int[r1]
            r2.A06 = r0
            r2.A07 = r1
            r2.A08 = r3
            android.content.Context r0 = r3.getContext()
            r2.A0A = r0
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x002c
            X.03i r0 = new X.03i
            r0.<init>()
        L_0x0029:
            r2.A09 = r0
            return
        L_0x002c:
            r0 = 23
            if (r1 < r0) goto L_0x0036
            X.03h r0 = new X.03h
            r0.<init>()
            goto L_0x0029
        L_0x0036:
            X.03g r0 = new X.03g
            r0.<init>()
            goto L_0x0029
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass03f.<init>(android.widget.TextView):void");
    }

    public static int A00(TextView textView) {
        return textView.getMaxLines();
    }

    public static StaticLayout A01(Layout.Alignment alignment, TextPaint textPaint, TextView textView, CharSequence charSequence, int i) {
        return new StaticLayout(charSequence, textPaint, i, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000e, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000f, code lost:
        r1 = new java.lang.StringBuilder();
        r1.append("Failed to invoke TextView#");
        r1.append(r5);
        r1.append("() method");
        android.util.Log.w("ACTVAutoSizeHelper", r1.toString(), r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002a, code lost:
        return r4;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.Object A02(java.lang.Object r3, java.lang.Object r4, java.lang.String r5) {
        /*
            java.lang.reflect.Method r1 = A03(r5)     // Catch:{ Exception -> 0x000e, all -> 0x000c }
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x000e, all -> 0x000c }
            java.lang.Object r4 = r1.invoke(r3, r0)     // Catch:{ Exception -> 0x000e, all -> 0x000c }
            return r4
        L_0x000c:
            r0 = move-exception
            throw r0
        L_0x000e:
            r3 = move-exception
            java.lang.String r2 = "ACTVAutoSizeHelper"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "Failed to invoke TextView#"
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = "() method"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            android.util.Log.w(r2, r0, r3)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass03f.A02(java.lang.Object, java.lang.Object, java.lang.String):java.lang.Object");
    }

    public static boolean A07(View view) {
        return view.isInLayout();
    }

    public void A09() {
        int measuredWidth;
        StaticLayout staticLayout;
        CharSequence transformation;
        if (A0F()) {
            if (this.A05) {
                TextView textView = this.A08;
                if (textView.getMeasuredHeight() > 0 && textView.getMeasuredWidth() > 0) {
                    C007203g r11 = this.A09;
                    if (r11.A01(textView)) {
                        measuredWidth = 1048576;
                    } else {
                        measuredWidth = (textView.getMeasuredWidth() - textView.getTotalPaddingLeft()) - textView.getTotalPaddingRight();
                    }
                    int height = (textView.getHeight() - textView.getCompoundPaddingBottom()) - textView.getCompoundPaddingTop();
                    if (measuredWidth > 0 && height > 0) {
                        RectF rectF = A0D;
                        synchronized (rectF) {
                            rectF.setEmpty();
                            rectF.right = (float) measuredWidth;
                            rectF.bottom = (float) height;
                            int length = this.A06.length;
                            if (length != 0) {
                                int i = 1;
                                int i2 = length - 1;
                                int i3 = 0;
                                while (i <= i2) {
                                    int i4 = (i + i2) / 2;
                                    int i5 = this.A06[i4];
                                    CharSequence text = textView.getText();
                                    TransformationMethod transformationMethod = textView.getTransformationMethod();
                                    if (!(transformationMethod == null || (transformation = transformationMethod.getTransformation(text, textView)) == null)) {
                                        text = transformation;
                                    }
                                    int A002 = A00(textView);
                                    TextPaint textPaint = this.A04;
                                    if (textPaint == null) {
                                        this.A04 = new TextPaint();
                                    } else {
                                        textPaint.reset();
                                    }
                                    this.A04.set(textView.getPaint());
                                    this.A04.setTextSize((float) i5);
                                    Layout.Alignment alignment = (Layout.Alignment) A02(textView, Layout.Alignment.ALIGN_NORMAL, "getLayoutAlignment");
                                    int round = Math.round(rectF.right);
                                    if (Build.VERSION.SDK_INT >= 23) {
                                        staticLayout = AnonymousClass0DD.A00(alignment, this.A04, textView, r11, text, round, A002);
                                    } else {
                                        staticLayout = A01(alignment, this.A04, textView, text, round);
                                    }
                                    if (A002 != -1) {
                                        if (staticLayout.getLineCount() <= A002) {
                                            if (staticLayout.getLineEnd(staticLayout.getLineCount() - 1) != text.length()) {
                                            }
                                        }
                                        i3 = i4 - 1;
                                        i2 = i3;
                                    }
                                    if (((float) staticLayout.getHeight()) <= rectF.bottom) {
                                        i3 = i;
                                        i = i4 + 1;
                                    }
                                    i3 = i4 - 1;
                                    i2 = i3;
                                }
                                float f = (float) this.A06[i3];
                                if (f != textView.getTextSize()) {
                                    A0B(0, f);
                                }
                            } else {
                                throw new IllegalStateException("No available text sizes to choose from.");
                            }
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            this.A05 = true;
        }
    }
}
