package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.1qK  reason: invalid class name and case insensitive filesystem */
public class C37891qK extends ViewGroup.MarginLayoutParams {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public int A04 = -1;
    public int A05 = -1;
    public int A06;
    public int A07;
    public View A08;
    public View A09;
    public C41501wV A0A;
    public boolean A0B = false;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final Rect A0F = new Rect();

    public void A00(C41501wV r2) {
        C41501wV r0 = this.A0A;
        if (r0 != r2) {
            if (r0 != null) {
                r0.A0E();
            }
            this.A0A = r2;
            this.A0B = true;
            if (r2 != null) {
                r2.A0J(this);
            }
        }
    }

    public C37891qK(C37891qK r3) {
        super(r3);
    }

    public C37891qK(int i, int i2) {
        super(i, i2);
    }

    public C37891qK(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C41501wV r0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C37871qH.A01);
        this.A02 = obtainStyledAttributes.getInteger(0, 0);
        this.A05 = obtainStyledAttributes.getResourceId(1, -1);
        this.A00 = obtainStyledAttributes.getInteger(2, 0);
        this.A04 = obtainStyledAttributes.getInteger(6, -1);
        this.A03 = obtainStyledAttributes.getInt(5, 0);
        this.A01 = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.A0B = hasValue;
        if (hasValue) {
            String string = obtainStyledAttributes.getString(3);
            Class[] clsArr = CoordinatorLayout.A0M;
            if (TextUtils.isEmpty(string)) {
                r0 = null;
            } else {
                if (string.startsWith(".")) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(context.getPackageName());
                    sb.append(string);
                    string = sb.toString();
                } else if (string.indexOf(46) < 0) {
                    String str = CoordinatorLayout.A0J;
                    if (!TextUtils.isEmpty(str)) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append('.');
                        sb2.append(string);
                        string = sb2.toString();
                    }
                }
                try {
                    ThreadLocal threadLocal = CoordinatorLayout.A0K;
                    Map map = (Map) threadLocal.get();
                    if (map == null) {
                        map = new HashMap();
                        threadLocal.set(map);
                    }
                    Constructor<?> constructor = (Constructor) map.get(string);
                    if (constructor == null) {
                        constructor = Class.forName(string, false, context.getClassLoader()).getConstructor(CoordinatorLayout.A0M);
                        constructor.setAccessible(true);
                        map.put(string, constructor);
                    }
                    r0 = (C41501wV) constructor.newInstance(new Object[]{context, attributeSet});
                } catch (Exception e) {
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append("Could not inflate Behavior subclass ");
                    sb3.append(string);
                    throw new RuntimeException(sb3.toString(), e);
                }
            }
            this.A0A = r0;
        }
        obtainStyledAttributes.recycle();
        C41501wV r02 = this.A0A;
        if (r02 != null) {
            r02.A0J(this);
        }
    }

    public C37891qK(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public C37891qK(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }
}
