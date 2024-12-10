package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.AppCompatCheckBox;
import androidx.appcompat.widget.AppCompatRadioButton;
import java.lang.reflect.Constructor;

/* renamed from: X.028  reason: invalid class name */
public class AnonymousClass028 {
    public static final int[] A01 = {16843375};
    public static final String[] A02 = {"android.widget.", "android.view.", "android.webkit."};
    public static final AnonymousClass00O A03 = new AnonymousClass00O(0);
    public static final int[] A04 = {16844160};
    public static final int[] A05 = {16844156};
    public static final int[] A06 = {16844148};
    public static final Class[] A07 = {Context.class, AttributeSet.class};
    public final Object[] A00 = new Object[2];

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x007c, code lost:
        if (r4 != null) goto L_0x0142;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View A02(java.lang.String r10, android.content.Context r11, android.util.AttributeSet r12) {
        /*
            r9 = this;
            r3 = r11
            int[] r0 = X.C002501d.A0P
            r1 = 0
            android.content.res.TypedArray r4 = r11.obtainStyledAttributes(r12, r0, r1, r1)
            r0 = 4
            int r2 = r4.getResourceId(r0, r1)
            if (r2 == 0) goto L_0x0016
            java.lang.String r1 = "AppCompatViewInflater"
            java.lang.String r0 = "app:theme is now deprecated. Please move to using android:theme instead."
            android.util.Log.i(r1, r0)
        L_0x0016:
            r4.recycle()
            if (r2 == 0) goto L_0x002b
            boolean r0 = r11 instanceof X.C003101k
            if (r0 == 0) goto L_0x0026
            r0 = r3
            X.01k r0 = (X.C003101k) r0
            int r0 = r0.A00
            if (r0 == r2) goto L_0x002b
        L_0x0026:
            X.01k r3 = new X.01k
            r3.<init>(r11, r2)
        L_0x002b:
            int r0 = r10.hashCode()
            switch(r0) {
                case -1946472170: goto L_0x0080;
                case -1455429095: goto L_0x008f;
                case -1346021293: goto L_0x009e;
                case -938935918: goto L_0x00ad;
                case -937446323: goto L_0x00bb;
                case -658531749: goto L_0x00c9;
                case -339785223: goto L_0x00d7;
                case 776382189: goto L_0x00e5;
                case 799298502: goto L_0x00f2;
                case 1125864064: goto L_0x0100;
                case 1413872058: goto L_0x010e;
                case 1601505219: goto L_0x011b;
                case 1666676343: goto L_0x0128;
                case 2001146706: goto L_0x0136;
                default: goto L_0x0032;
            }
        L_0x0032:
            r4 = 0
            if (r11 == r3) goto L_0x016b
            java.lang.String r0 = "view"
            boolean r0 = r10.equals(r0)
            r8 = 0
            if (r0 == 0) goto L_0x0044
            java.lang.String r0 = "class"
            java.lang.String r10 = r12.getAttributeValue(r4, r0)
        L_0x0044:
            r7 = 1
            r6 = 0
            java.lang.Object[] r5 = r9.A00     // Catch:{ Exception -> 0x006f, all -> 0x016c }
            r5[r6] = r3     // Catch:{ Exception -> 0x006f, all -> 0x016c }
            r5[r7] = r12     // Catch:{ Exception -> 0x006f, all -> 0x016c }
            r0 = 46
            int r1 = r10.indexOf(r0)     // Catch:{ Exception -> 0x006f, all -> 0x016c }
            r0 = -1
            if (r0 != r1) goto L_0x0066
            r2 = 0
        L_0x0056:
            java.lang.String[] r1 = A02     // Catch:{ Exception -> 0x006f, all -> 0x016c }
            r0 = 3
            if (r2 >= r0) goto L_0x0077
            r0 = r1[r2]     // Catch:{ Exception -> 0x006f, all -> 0x016c }
            android.view.View r4 = r9.A00(r3, r10, r0)     // Catch:{ Exception -> 0x006f, all -> 0x016c }
            if (r4 != 0) goto L_0x006a
            int r2 = r2 + 1
            goto L_0x0056
        L_0x0066:
            android.view.View r4 = r9.A00(r3, r10, r4)     // Catch:{ Exception -> 0x006f, all -> 0x016c }
        L_0x006a:
            r5[r6] = r8
            r5[r7] = r8
            goto L_0x007c
        L_0x006f:
            java.lang.Object[] r0 = r9.A00
            r0[r6] = r8
            r0[r7] = r8
            r4 = r8
            goto L_0x007c
        L_0x0077:
            r5[r6] = r8
            r5[r7] = r8
            r4 = r8
        L_0x007c:
            if (r4 == 0) goto L_0x016b
            goto L_0x0142
        L_0x0080:
            java.lang.String r0 = "RatingBar"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0032
            X.05i r4 = new X.05i
            r4.<init>(r3, r12)
            goto L_0x0142
        L_0x008f:
            java.lang.String r0 = "CheckedTextView"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0032
            X.05R r4 = new X.05R
            r4.<init>(r3, r12)
            goto L_0x0142
        L_0x009e:
            java.lang.String r0 = "MultiAutoCompleteTextView"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0032
            X.05f r4 = new X.05f
            r4.<init>(r3, r12)
            goto L_0x0142
        L_0x00ad:
            java.lang.String r0 = "TextView"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0032
            X.03P r4 = r9.A07(r3, r12)
            goto L_0x0142
        L_0x00bb:
            java.lang.String r0 = "ImageButton"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0032
            androidx.appcompat.widget.AppCompatImageButton r4 = new androidx.appcompat.widget.AppCompatImageButton
            r4.<init>(r3, r12)
            goto L_0x0142
        L_0x00c9:
            java.lang.String r0 = "SeekBar"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0032
            androidx.appcompat.widget.AppCompatSeekBar r4 = new androidx.appcompat.widget.AppCompatSeekBar
            r4.<init>(r3, r12)
            goto L_0x0142
        L_0x00d7:
            java.lang.String r0 = "Spinner"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0032
            androidx.appcompat.widget.AppCompatSpinner r4 = new androidx.appcompat.widget.AppCompatSpinner
            r4.<init>((android.content.Context) r3, (android.util.AttributeSet) r12)
            goto L_0x0142
        L_0x00e5:
            java.lang.String r0 = "RadioButton"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0032
            androidx.appcompat.widget.AppCompatRadioButton r4 = r9.A06(r3, r12)
            goto L_0x0142
        L_0x00f2:
            java.lang.String r0 = "ToggleButton"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0032
            X.05l r4 = new X.05l
            r4.<init>(r3, r12)
            goto L_0x0142
        L_0x0100:
            java.lang.String r0 = "ImageView"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0032
            androidx.appcompat.widget.AppCompatImageView r4 = new androidx.appcompat.widget.AppCompatImageView
            r4.<init>(r3, r12)
            goto L_0x0142
        L_0x010e:
            java.lang.String r0 = "AutoCompleteTextView"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0032
            X.05O r4 = r9.A03(r3, r12)
            goto L_0x0142
        L_0x011b:
            java.lang.String r0 = "CheckBox"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0032
            androidx.appcompat.widget.AppCompatCheckBox r4 = r9.A05(r3, r12)
            goto L_0x0142
        L_0x0128:
            java.lang.String r0 = "EditText"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0032
            X.03k r4 = new X.03k
            r4.<init>(r3, r12)
            goto L_0x0142
        L_0x0136:
            java.lang.String r0 = "Button"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0032
            X.03n r4 = r9.A04(r3, r12)
        L_0x0142:
            android.content.Context r1 = r4.getContext()
            boolean r0 = r1 instanceof android.content.ContextWrapper
            if (r0 == 0) goto L_0x0168
            boolean r0 = r4.hasOnClickListeners()
            if (r0 == 0) goto L_0x0168
            int[] r0 = A01
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r12, r0)
            r0 = 0
            java.lang.String r1 = r2.getString(r0)
            if (r1 == 0) goto L_0x0165
            X.0Rd r0 = new X.0Rd
            r0.<init>(r4, r1)
            r4.setOnClickListener(r0)
        L_0x0165:
            r2.recycle()
        L_0x0168:
            A01(r3, r12, r4)
        L_0x016b:
            return r4
        L_0x016c:
            r1 = move-exception
            java.lang.Object[] r0 = r9.A00
            r0[r6] = r8
            r0[r7] = r8
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass028.A02(java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    private View A00(Context context, String str, String str2) {
        String str3;
        AnonymousClass00O r3 = A03;
        Constructor<? extends U> constructor = (Constructor) r3.get(str);
        if (constructor == null) {
            if (str2 != null) {
                try {
                    StringBuilder sb = new StringBuilder();
                    sb.append(str2);
                    sb.append(str);
                    str3 = sb.toString();
                } catch (Exception unused) {
                    return null;
                }
            } else {
                str3 = str;
            }
            constructor = Class.forName(str3, false, context.getClassLoader()).asSubclass(View.class).getConstructor(A07);
            r3.put(str, constructor);
        }
        constructor.setAccessible(true);
        return (View) constructor.newInstance(this.A00);
    }

    public static void A01(Context context, AttributeSet attributeSet, View view) {
        if (Build.VERSION.SDK_INT <= 28) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, A04);
            if (obtainStyledAttributes.hasValue(0)) {
                AnonymousClass1HF.A0q(view, obtainStyledAttributes.getBoolean(0, false));
            }
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, A05);
            if (obtainStyledAttributes2.hasValue(0)) {
                AnonymousClass1HF.A0n(view, obtainStyledAttributes2.getString(0));
            }
            obtainStyledAttributes2.recycle();
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, A06);
            if (obtainStyledAttributes3.hasValue(0)) {
                AnonymousClass1HF.A0r(view, obtainStyledAttributes3.getBoolean(0, false));
            }
            obtainStyledAttributes3.recycle();
        }
    }

    public AnonymousClass05O A03(Context context, AttributeSet attributeSet) {
        return new AnonymousClass05O(context, attributeSet);
    }

    public C007803n A04(Context context, AttributeSet attributeSet) {
        return new C007803n(context, attributeSet);
    }

    public AppCompatCheckBox A05(Context context, AttributeSet attributeSet) {
        return new AppCompatCheckBox(context, attributeSet);
    }

    public AppCompatRadioButton A06(Context context, AttributeSet attributeSet) {
        return new AppCompatRadioButton(context, attributeSet);
    }

    public AnonymousClass03P A07(Context context, AttributeSet attributeSet) {
        return new AnonymousClass03P(context, attributeSet);
    }
}
