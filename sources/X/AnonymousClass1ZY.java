package X;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* renamed from: X.1ZY  reason: invalid class name */
public abstract class AnonymousClass1ZY extends AnonymousClass1ZX {
    public static Class A05;
    public static Field A06;
    public static Field A07;
    public static Method A08;
    public static boolean A09;
    public C33321id A00;
    public C33321id A01 = null;
    public AnonymousClass1HO A02;
    public C33321id[] A03;
    public final WindowInsets A04;

    public C33321id A0E(int i, boolean z) {
        C33321id r0;
        C33321id r6;
        C33321id r1;
        C33321id r12;
        C33321id r02;
        Cn4 A072;
        if (i != 1) {
            C33321id r13 = null;
            if (i != 2) {
                if (i == 8) {
                    C33321id[] r14 = this.A03;
                    if (r14 != null && (r02 = r14[3]) != null) {
                        return r02;
                    }
                    C33321id A032 = A03();
                    AnonymousClass1HO r03 = this.A02;
                    if (r03 != null) {
                        r1 = r03.A00.A01();
                    } else {
                        r1 = C33321id.A04;
                    }
                    int i2 = A032.A00;
                    int i3 = r1.A00;
                    if (i2 > i3 || ((r12 = this.A00) != null && !r12.equals(C33321id.A04) && (i2 = r12.A00) > i3)) {
                        return C33321id.A00(0, 0, 0, i2);
                    }
                } else if (i == 16) {
                    return A02();
                } else {
                    if (i == 32) {
                        return A00();
                    }
                    if (i == 64) {
                        return A04();
                    }
                    if (i == 128) {
                        AnonymousClass1HO r04 = this.A02;
                        if (r04 != null) {
                            A072 = r04.A00.A07();
                        } else {
                            A072 = A07();
                        }
                        if (A072 != null) {
                            return C33321id.A00(A072.A02(), A072.A04(), A072.A03(), A072.A01());
                        }
                    }
                }
                return C33321id.A04;
            } else if (z) {
                AnonymousClass1HO r05 = this.A02;
                if (r05 != null) {
                    r6 = r05.A00.A01();
                } else {
                    r6 = C33321id.A04;
                }
                C33321id A012 = A01();
                return C33321id.A00(Math.max(r6.A01, A012.A01), 0, Math.max(r6.A02, A012.A02), Math.max(r6.A00, A012.A00));
            } else {
                C33321id A033 = A03();
                AnonymousClass1HO r06 = this.A02;
                if (r06 != null) {
                    r13 = r06.A00.A01();
                }
                int i4 = A033.A00;
                if (r13 != null) {
                    i4 = Math.min(i4, r13.A00);
                }
                return C33321id.A00(A033.A01, 0, A033.A02, i4);
            }
        } else if (!z) {
            return C33321id.A00(0, A03().A03, 0, 0);
        } else {
            AnonymousClass1HO r07 = this.A02;
            if (r07 != null) {
                r0 = r07.A00.A01();
            } else {
                r0 = C33321id.A04;
            }
            return C33321id.A00(0, Math.max(r0.A03, A03().A03), 0, 0);
        }
    }

    public void A0A(View view) {
        C33321id r0;
        if (Build.VERSION.SDK_INT < 30) {
            if (!A09) {
                try {
                    A08 = View.class.getDeclaredMethod("getViewRootImpl", new Class[0]);
                    Class<?> cls = Class.forName("android.view.View$AttachInfo");
                    A05 = cls;
                    A07 = cls.getDeclaredField("mVisibleInsets");
                    A06 = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                    A07.setAccessible(true);
                    A06.setAccessible(true);
                } catch (ReflectiveOperationException e) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Failed to get visible insets. (Reflection error). ");
                    sb.append(e.getMessage());
                    Log.e("WindowInsetsCompat", sb.toString(), e);
                }
                A09 = true;
            }
            Method method = A08;
            if (!(method == null || A05 == null || A07 == null)) {
                try {
                    Object invoke = method.invoke(view, new Object[0]);
                    if (invoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                    } else {
                        Rect rect = (Rect) A07.get(A06.get(invoke));
                        if (rect != null) {
                            r0 = C33321id.A00(rect.left, rect.top, rect.right, rect.bottom);
                            this.A00 = r0;
                            return;
                        }
                    }
                } catch (ReflectiveOperationException e2) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Failed to get visible insets. (Reflection error). ");
                    sb2.append(e2.getMessage());
                    Log.e("WindowInsetsCompat", sb2.toString(), e2);
                }
            }
            r0 = C33321id.A04;
            this.A00 = r0;
            return;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    public AnonymousClass1ZY(AnonymousClass1HO r2, WindowInsets windowInsets) {
        super(r2);
        this.A04 = windowInsets;
    }

    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        return AnonymousClass026.A00(this.A00, ((AnonymousClass1ZY) obj).A00);
    }
}
