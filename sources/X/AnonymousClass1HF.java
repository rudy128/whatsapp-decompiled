package X;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.PointerIcon;
import android.view.View;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityNodeInfo;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: X.1HF  reason: invalid class name */
public abstract class AnonymousClass1HF {
    public static ThreadLocal A00;
    public static Field A01;
    public static boolean A02;
    public static Method A03;
    public static Method A04;
    public static WeakHashMap A05;
    public static boolean A06;
    public static final AnonymousClass1XX A07 = new AnonymousClass1XY();
    public static final int[] A08 = {2131427377, 2131427378, 2131427389, 2131427400, 2131427403, 2131427404, 2131427405, 2131427406, 2131427407, 2131427408, 2131427379, 2131427380, 2131427381, 2131427382, 2131427383, 2131427384, 2131427385, 2131427386, 2131427387, 2131427388, 2131427390, 2131427391, 2131427392, 2131427393, 2131427394, 2131427395, 2131427396, 2131427397, 2131427398, 2131427399, 2131427401, 2131427402};
    public static final AnonymousClass1XZ A09 = new AnonymousClass1XZ();

    public static C25997CqD A0A(View view, C25997CqD cqD) {
        AnonymousClass1XX r3;
        if (Log.isLoggable("ViewCompat", 3)) {
            StringBuilder sb = new StringBuilder();
            sb.append("performReceiveContent: ");
            sb.append(cqD);
            sb.append(", view=");
            sb.append(view.getClass().getSimpleName());
            sb.append("[");
            sb.append(view.getId());
            sb.append("]");
            Log.d("ViewCompat", sb.toString());
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return C25862CnR.A00(view, cqD);
        }
        E3a e3a = (E3a) view.getTag(2131436011);
        if (e3a != null && (cqD = e3a.C2a(view, cqD)) == null) {
            return null;
        }
        if (view instanceof AnonymousClass1XX) {
            r3 = (AnonymousClass1XX) view;
        } else {
            r3 = A07;
        }
        return r3.C2b(cqD);
    }

    public static void A0m(View view, C26137Ct0 ct0, E3b e3b, CharSequence charSequence) {
        E3b e3b2 = e3b;
        CharSequence charSequence2 = charSequence;
        if (e3b == null && charSequence == null) {
            A0b(view, ((AccessibilityNodeInfo.AccessibilityAction) ct0.A03).getId());
            return;
        }
        A0l(view, new C26137Ct0(e3b2, charSequence2, ct0.A02, (Object) null, ct0.A00));
    }

    public static void A0o(View view, CharSequence charSequence) {
        new AnonymousClass27c(1).A02(view, charSequence);
    }

    public static void A0q(View view, boolean z) {
        new AnonymousClass27c(2).A02(view, Boolean.valueOf(z));
    }

    public static void A0r(View view, boolean z) {
        new AnonymousClass27c(0).A02(view, Boolean.valueOf(z));
    }

    public static boolean A0s(View view) {
        Boolean bool = (Boolean) new AnonymousClass27c(2).A00(view);
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public static boolean A0t(View view) {
        Boolean bool = (Boolean) new AnonymousClass27c(0).A00(view);
        if (bool == null || !bool.booleanValue()) {
            return false;
        }
        return true;
    }

    public static int A01(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return AnonymousClass1ZF.A00(view);
        }
        return 0;
    }

    public static View.AccessibilityDelegate A05(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AnonymousClass1YG.A00(view);
        }
        if (A02) {
            return null;
        }
        if (A01 == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                A01 = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                A02 = true;
                return null;
            }
        }
        Object obj = A01.get(view);
        if (obj instanceof View.AccessibilityDelegate) {
            return (View.AccessibilityDelegate) obj;
        }
        return null;
    }

    public static View A06(View view, int i) {
        if (Build.VERSION.SDK_INT >= 28) {
            return C28301Zv.A00(view, i);
        }
        View findViewById = view.findViewById(i);
        if (findViewById != null) {
            return findViewById;
        }
        throw new IllegalArgumentException("ID does not reference a View inside this View");
    }

    @Deprecated
    public static AnonymousClass1HC A0B(View view) {
        WeakHashMap weakHashMap = A05;
        if (weakHashMap == null) {
            weakHashMap = new WeakHashMap();
            A05 = weakHashMap;
        }
        AnonymousClass1HC r1 = (AnonymousClass1HC) weakHashMap.get(view);
        if (r1 != null) {
            return r1;
        }
        AnonymousClass1HC r12 = new AnonymousClass1HC(view);
        A05.put(view, r12);
        return r12;
    }

    public static AnonymousClass1HO A0C(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return C33291ia.A00(view);
        }
        return A0D(view);
    }

    public static AnonymousClass1HO A0D(View view) {
        if (C50892We.A03 && view.isAttachedToWindow()) {
            try {
                Object obj = C50892We.A02.get(view.getRootView());
                if (obj != null) {
                    Rect rect = (Rect) C50892We.A01.get(obj);
                    Rect rect2 = (Rect) C50892We.A00.get(obj);
                    if (!(rect == null || rect2 == null)) {
                        C28171Zd r5 = new C28171Zd();
                        C33321id A002 = C33321id.A00(rect.left, rect.top, rect.right, rect.bottom);
                        C28181Ze r4 = r5.A00;
                        r4.A03(A002);
                        r5.A01(C33321id.A00(rect2.left, rect2.top, rect2.right, rect2.bottom));
                        AnonymousClass1HO A003 = r4.A00();
                        AnonymousClass1ZX r1 = A003.A00;
                        if (r1 instanceof AnonymousClass1ZY) {
                            ((AnonymousClass1ZY) r1).A02 = A003;
                        }
                        r1.A0A(view.getRootView());
                        return A003;
                    }
                }
            } catch (IllegalAccessException e) {
                StringBuilder sb = new StringBuilder();
                sb.append("Failed to get insets from AttachInfo. ");
                sb.append(e.getMessage());
                Log.w("WindowInsetsCompat", sb.toString(), e);
            }
        }
        return null;
    }

    @Deprecated
    public static C25932Cow A0G(View view) {
        if (Build.VERSION.SDK_INT >= 30) {
            return C62692ro.A00(view);
        }
        for (Context context = view.getContext(); context instanceof ContextWrapper; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof Activity) {
                Window window = ((Activity) context).getWindow();
                if (window != null) {
                    return new C25932Cow(view, window);
                }
                return null;
            }
        }
        return null;
    }

    public static CharSequence A0H(View view) {
        return (CharSequence) new C29451cI().A00(view);
    }

    public static void A0J() {
        Class<View> cls = View.class;
        try {
            A04 = cls.getDeclaredMethod("dispatchStartTemporaryDetach", new Class[0]);
            A03 = cls.getDeclaredMethod("dispatchFinishTemporaryDetach", new Class[0]);
        } catch (NoSuchMethodException e) {
            Log.e("ViewCompat", "Couldn't find method", e);
        }
        A06 = true;
    }

    public static void A0K(Context context, TypedArray typedArray, AttributeSet attributeSet, View view, int[] iArr, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            AnonymousClass1YG.A01(context, typedArray, attributeSet, view, iArr, i);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (A04(r3) != null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0L(android.content.res.ColorStateList r2, android.view.View r3) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            A0M(r2, r3)
            if (r1 != r0) goto L_0x002f
            android.graphics.drawable.Drawable r2 = r3.getBackground()
            android.content.res.ColorStateList r0 = X.AnonymousClass1Xr.A01(r3)
            if (r0 != 0) goto L_0x001a
            android.graphics.PorterDuff$Mode r1 = A04(r3)
            r0 = 0
            if (r1 == 0) goto L_0x001b
        L_0x001a:
            r0 = 1
        L_0x001b:
            if (r2 == 0) goto L_0x002f
            if (r0 == 0) goto L_0x002f
            boolean r0 = r2.isStateful()
            if (r0 == 0) goto L_0x002c
            int[] r0 = r3.getDrawableState()
            r2.setState(r0)
        L_0x002c:
            r3.setBackground(r2)
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1HF.A0L(android.content.res.ColorStateList, android.view.View):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0018, code lost:
        if (A04(r3) != null) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0N(android.graphics.PorterDuff.Mode r2, android.view.View r3) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 21
            A0O(r2, r3)
            if (r1 != r0) goto L_0x002f
            android.graphics.drawable.Drawable r2 = r3.getBackground()
            android.content.res.ColorStateList r0 = X.AnonymousClass1Xr.A01(r3)
            if (r0 != 0) goto L_0x001a
            android.graphics.PorterDuff$Mode r1 = A04(r3)
            r0 = 0
            if (r1 == 0) goto L_0x001b
        L_0x001a:
            r0 = 1
        L_0x001b:
            if (r2 == 0) goto L_0x002f
            if (r0 == 0) goto L_0x002f
            boolean r0 = r2.isStateful()
            if (r0 == 0) goto L_0x002c
            int[] r0 = r3.getDrawableState()
            r2.setState(r0)
        L_0x002c:
            r3.setBackground(r2)
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1HF.A0N(android.graphics.PorterDuff$Mode, android.view.View):void");
    }

    public static void A0R(View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            C29321c1.A01(view);
            return;
        }
        if (!A06) {
            A0J();
        }
        Method method = A03;
        if (method != null) {
            try {
                method.invoke(view, new Object[0]);
            } catch (Exception e) {
                Log.d("ViewCompat", "Error calling dispatchFinishTemporaryDetach", e);
            }
        } else {
            view.onFinishTemporaryDetach();
        }
    }

    public static void A0S(View view) {
        if (Build.VERSION.SDK_INT >= 24) {
            C29321c1.A02(view);
            return;
        }
        if (!A06) {
            A0J();
        }
        Method method = A04;
        if (method != null) {
            try {
                method.invoke(view, new Object[0]);
            } catch (Exception e) {
                Log.d("ViewCompat", "Error calling dispatchStartTemporaryDetach", e);
            }
        } else {
            view.onStartTemporaryDetach();
        }
    }

    public static void A0Z(View view, int i) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
            return;
        }
        ThreadLocal threadLocal = A00;
        if (threadLocal == null) {
            threadLocal = new ThreadLocal();
            A00 = threadLocal;
        }
        Rect rect = (Rect) threadLocal.get();
        if (rect == null) {
            rect = new Rect();
            A00.set(rect);
        }
        rect.setEmpty();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rect.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !rect.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            A0V(view);
            ViewParent parent2 = view.getParent();
            if (parent2 instanceof View) {
                A0V((View) parent2);
            }
        }
        if (z && rect.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rect);
        }
    }

    public static void A0a(View view, int i) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
            return;
        }
        ThreadLocal threadLocal = A00;
        if (threadLocal == null) {
            threadLocal = new ThreadLocal();
            A00 = threadLocal;
        }
        Rect rect = (Rect) threadLocal.get();
        if (rect == null) {
            rect = new Rect();
            A00.set(rect);
        }
        rect.setEmpty();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            rect.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !rect.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            A0V(view);
            ViewParent parent2 = view.getParent();
            if (parent2 instanceof View) {
                A0V((View) parent2);
            }
        }
        if (z && rect.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(rect);
        }
    }

    public static void A0c(View view, int i) {
        if (Build.VERSION.SDK_INT >= 26) {
            AnonymousClass1ZF.A01(view, i);
        }
    }

    public static void A0d(View view, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            C33291ia.A01(view, i);
        }
    }

    public static void A0f(View view, AnonymousClass1XU r2) {
        View.AccessibilityDelegate accessibilityDelegate;
        if (r2 == null && (A05(view) instanceof AnonymousClass1XW)) {
            r2 = new AnonymousClass1XU();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        if (r2 == null) {
            accessibilityDelegate = null;
        } else {
            accessibilityDelegate = r2.A00;
        }
        view.setAccessibilityDelegate(accessibilityDelegate);
    }

    public static void A0h(View view, AnonymousClass1HE r3) {
        View.OnApplyWindowInsetsListener r0;
        if (Build.VERSION.SDK_INT < 30) {
            view.setTag(2131436010, r3);
        }
        if (r3 == null) {
            r0 = (View.OnApplyWindowInsetsListener) view.getTag(2131436019);
        } else {
            r0 = new C27671Xa(view, r3);
        }
        view.setOnApplyWindowInsetsListener(r0);
    }

    public static void A0i(View view, E3a e3a, String[] strArr) {
        if (Build.VERSION.SDK_INT >= 31) {
            C25862CnR.A01(view, e3a, strArr);
            return;
        }
        if (strArr == null || strArr.length == 0) {
            strArr = null;
        }
        boolean z = false;
        boolean z2 = false;
        if (strArr != null) {
            z2 = true;
        }
        if (z2) {
            if (strArr != null) {
                int length = strArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (strArr[i].startsWith("*")) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
                boolean z3 = !z;
                StringBuilder sb = new StringBuilder();
                sb.append("A MIME type set here must not start with *: ");
                sb.append(Arrays.toString(strArr));
                String obj = sb.toString();
                if (!z3) {
                    throw new IllegalArgumentException(String.valueOf(obj));
                }
            }
            view.setTag(2131436012, strArr);
            view.setTag(2131436011, e3a);
            return;
        }
        throw new IllegalArgumentException(String.valueOf("When the listener is set, MIME types must also be set"));
    }

    public static void A0j(View view, C29301bz r3) {
        Object obj;
        if (Build.VERSION.SDK_INT >= 24) {
            if (r3 != null) {
                obj = r3.A01();
            } else {
                obj = null;
            }
            C29321c1.A00((PointerIcon) obj, view);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        if (r4.getWindowVisibility() != 0) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0n(android.view.View r4, java.lang.CharSequence r5) {
        /*
            X.1cI r0 = new X.1cI
            r0.<init>()
            r0.A02(r4, r5)
            X.1XZ r3 = A09
            if (r5 == 0) goto L_0x0034
            java.util.WeakHashMap r2 = r3.A00
            boolean r0 = r4.isShown()
            if (r0 == 0) goto L_0x001b
            int r1 = r4.getWindowVisibility()
            r0 = 1
            if (r1 == 0) goto L_0x001c
        L_0x001b:
            r0 = 0
        L_0x001c:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.put(r4, r0)
            r4.addOnAttachStateChangeListener(r3)
            boolean r0 = r4.isAttachedToWindow()
            if (r0 == 0) goto L_0x0033
            android.view.ViewTreeObserver r0 = r4.getViewTreeObserver()
            r0.addOnGlobalLayoutListener(r3)
        L_0x0033:
            return
        L_0x0034:
            java.util.WeakHashMap r0 = r3.A00
            r0.remove(r4)
            r4.removeOnAttachStateChangeListener(r3)
            android.view.ViewTreeObserver r0 = r4.getViewTreeObserver()
            r0.removeOnGlobalLayoutListener(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1HF.A0n(android.view.View, java.lang.CharSequence):void");
    }

    public static void A0p(View view, List list) {
        if (Build.VERSION.SDK_INT >= 29) {
            AnonymousClass1YG.A02(view, list);
        }
    }

    public static boolean A0u(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        C63072sS r6 = (C63072sS) view.getTag(2131436017);
        if (r6 == null) {
            r6 = new C63072sS();
            view.setTag(2131436017, r6);
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = r6.A02;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList = C63072sS.A03;
            if (!arrayList.isEmpty()) {
                synchronized (arrayList) {
                    if (r6.A02 == null) {
                        r6.A02 = new WeakHashMap();
                    }
                    int size = arrayList.size();
                    while (true) {
                        size--;
                        if (size < 0) {
                            break;
                        }
                        View view2 = (View) ((WeakReference) arrayList.get(size)).get();
                        if (view2 == null) {
                            arrayList.remove(size);
                        } else {
                            r6.A02.put(view2, Boolean.TRUE);
                            for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                r6.A02.put((View) parent, Boolean.TRUE);
                            }
                        }
                    }
                }
            }
        }
        View A002 = C63072sS.A00(keyEvent, view, r6);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (A002 == null) {
                return false;
            }
            if (KeyEvent.isModifierKey(keyCode)) {
                return true;
            }
            SparseArray sparseArray = r6.A00;
            if (sparseArray == null) {
                sparseArray = new SparseArray();
                r6.A00 = sparseArray;
            }
            sparseArray.put(keyCode, new WeakReference(A002));
            return true;
        } else if (A002 != null) {
            return true;
        } else {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0054, code lost:
        if (r0 == null) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A0v(android.view.View r3, android.view.KeyEvent r4) {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 >= r0) goto L_0x0026
            r1 = 2131436017(0x7f0b21f1, float:1.8493893E38)
            r0 = 2131436017(0x7f0b21f1, float:1.8493893E38)
            java.lang.Object r1 = r3.getTag(r1)
            X.2sS r1 = (X.C63072sS) r1
            if (r1 != 0) goto L_0x001c
            X.2sS r1 = new X.2sS
            r1.<init>()
            r3.setTag(r0, r1)
        L_0x001c:
            java.lang.ref.WeakReference r0 = r1.A01
            if (r0 == 0) goto L_0x0028
            java.lang.Object r0 = r0.get()
            if (r0 != r4) goto L_0x0028
        L_0x0026:
            r0 = 0
            return r0
        L_0x0028:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r4)
            r1.A01 = r0
            android.util.SparseArray r3 = r1.A00
            if (r3 != 0) goto L_0x003a
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            r1.A00 = r3
        L_0x003a:
            int r0 = r4.getAction()
            r2 = 1
            if (r0 != r2) goto L_0x0056
            int r0 = r4.getKeyCode()
            int r1 = r3.indexOfKey(r0)
            if (r1 < 0) goto L_0x0056
            java.lang.Object r0 = r3.valueAt(r1)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            r3.removeAt(r1)
            if (r0 != 0) goto L_0x0062
        L_0x0056:
            int r0 = r4.getKeyCode()
            java.lang.Object r0 = r3.get(r0)
            java.lang.ref.Reference r0 = (java.lang.ref.Reference) r0
            if (r0 == 0) goto L_0x0026
        L_0x0062:
            java.lang.Object r1 = r0.get()
            android.view.View r1 = (android.view.View) r1
            if (r1 == 0) goto L_0x008d
            boolean r0 = r1.isAttachedToWindow()
            if (r0 == 0) goto L_0x008d
            r0 = 2131436018(0x7f0b21f2, float:1.8493895E38)
            java.lang.Object r1 = r1.getTag(r0)
            java.util.AbstractList r1 = (java.util.AbstractList) r1
            if (r1 == 0) goto L_0x008d
            int r0 = r1.size()
            int r0 = r0 - r2
            if (r0 < 0) goto L_0x008d
            r1.get(r0)
            java.lang.String r1 = "onUnhandledKeyEvent"
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x008d:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1HF.A0v(android.view.View, android.view.KeyEvent):boolean");
    }

    public static String[] A0w(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return C25862CnR.A02(view);
        }
        return (String[]) view.getTag(2131436012);
    }

    public static float A00(View view) {
        return AnonymousClass1Xr.A00(view);
    }

    public static ColorStateList A02(View view) {
        return AnonymousClass1Xr.A01(view);
    }

    public static PorterDuff.Mode A03(View view) {
        return A04(view);
    }

    public static PorterDuff.Mode A04(View view) {
        return view.getBackgroundTintMode();
    }

    public static WindowInsets A07(View view, WindowInsets windowInsets) {
        return view.dispatchApplyWindowInsets(windowInsets);
    }

    public static WindowInsets A08(View view, WindowInsets windowInsets) {
        return view.onApplyWindowInsets(windowInsets);
    }

    public static AnonymousClass1XU A09(View view) {
        View.AccessibilityDelegate A052 = A05(view);
        if (A052 == null) {
            return null;
        }
        if (A052 instanceof AnonymousClass1XW) {
            return ((AnonymousClass1XW) A052).A00;
        }
        return new AnonymousClass1XU(A052);
    }

    public static AnonymousClass1HO A0E(View view, AnonymousClass1HO r3) {
        WindowInsets A062 = r3.A06();
        if (A062 != null) {
            WindowInsets A072 = A07(view, A062);
            if (!A072.equals(A062)) {
                return AnonymousClass1HO.A01(view, A072);
            }
        }
        return r3;
    }

    public static AnonymousClass1HO A0F(View view, AnonymousClass1HO r3) {
        WindowInsets A062 = r3.A06();
        if (A062 != null) {
            WindowInsets A082 = A08(view, A062);
            if (!A082.equals(A062)) {
                return AnonymousClass1HO.A01(view, A082);
            }
        }
        return r3;
    }

    public static ArrayList A0I(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(2131436005);
        if (arrayList != null) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        view.setTag(2131436005, arrayList2);
        return arrayList2;
    }

    public static void A0Q(Rect rect, View view, AnonymousClass1HO r3) {
        WindowInsets A062 = r3.A06();
        if (A062 != null) {
            AnonymousClass1HO.A01(view, view.computeSystemWindowInsets(A062, rect));
        } else {
            rect.setEmpty();
        }
    }

    public static void A0T(View view) {
        A0U(view);
    }

    public static void A0U(View view) {
        view.requestApplyInsets();
    }

    public static void A0V(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0023, code lost:
        if (r5.getWindowVisibility() != 0) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0Y(android.view.View r5, int r6) {
        /*
            android.content.Context r1 = r5.getContext()
            java.lang.String r0 = "accessibility"
            java.lang.Object r4 = r1.getSystemService(r0)
            android.view.accessibility.AccessibilityManager r4 = (android.view.accessibility.AccessibilityManager) r4
            boolean r0 = r4.isEnabled()
            if (r0 == 0) goto L_0x0053
            java.lang.CharSequence r0 = A0H(r5)
            if (r0 == 0) goto L_0x0025
            boolean r0 = r5.isShown()
            if (r0 == 0) goto L_0x0025
            int r0 = r5.getWindowVisibility()
            r3 = 1
            if (r0 == 0) goto L_0x0026
        L_0x0025:
            r3 = 0
        L_0x0026:
            int r1 = r5.getAccessibilityLiveRegion()
            r0 = 32
            if (r1 != 0) goto L_0x0086
            if (r3 != 0) goto L_0x0086
            if (r6 != r0) goto L_0x0054
            android.view.accessibility.AccessibilityEvent r2 = android.view.accessibility.AccessibilityEvent.obtain()
            r5.onInitializeAccessibilityEvent(r2)
            r2.setEventType(r0)
            r2.setContentChangeTypes(r6)
            r2.setSource(r5)
            r5.onPopulateAccessibilityEvent(r2)
            java.util.List r1 = r2.getText()
            java.lang.CharSequence r0 = A0H(r5)
            r1.add(r0)
            r4.sendAccessibilityEvent(r2)
        L_0x0053:
            return
        L_0x0054:
            android.view.ViewParent r0 = r5.getParent()
            if (r0 == 0) goto L_0x0053
            android.view.ViewParent r0 = r5.getParent()
            r0.notifySubtreeAccessibilityStateChanged(r5, r5, r6)     // Catch:{ AbstractMethodError -> 0x0062 }
            return
        L_0x0062:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            android.view.ViewParent r0 = r5.getParent()
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r1.append(r0)
            java.lang.String r0 = " does not fully implement ViewParent"
            r1.append(r0)
            java.lang.String r1 = r1.toString()
            java.lang.String r0 = "ViewCompat"
            android.util.Log.e(r0, r1, r2)
            return
        L_0x0086:
            android.view.accessibility.AccessibilityEvent r2 = android.view.accessibility.AccessibilityEvent.obtain()
            if (r3 != 0) goto L_0x008e
            r0 = 2048(0x800, float:2.87E-42)
        L_0x008e:
            r2.setEventType(r0)
            r2.setContentChangeTypes(r6)
            if (r3 == 0) goto L_0x00ab
            java.util.List r1 = r2.getText()
            java.lang.CharSequence r0 = A0H(r5)
            r1.add(r0)
            int r0 = r5.getImportantForAccessibility()
            if (r0 != 0) goto L_0x00ab
            r0 = 1
            r5.setImportantForAccessibility(r0)
        L_0x00ab:
            r5.sendAccessibilityEventUnchecked(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass1HF.A0Y(android.view.View, int):void");
    }

    public static void A0b(View view, int i) {
        A0e(view, i);
        A0Y(view, 0);
    }

    public static void A0e(View view, int i) {
        ArrayList A0I = A0I(view);
        for (int i2 = 0; i2 < A0I.size(); i2++) {
            if (((AccessibilityNodeInfo.AccessibilityAction) ((C26137Ct0) A0I.get(i2)).A03).getId() == i) {
                A0I.remove(i2);
                return;
            }
        }
    }

    public static void A0l(View view, C26137Ct0 ct0) {
        AnonymousClass1XU A092 = A09(view);
        if (A092 == null) {
            A092 = new AnonymousClass1XU();
        }
        A0f(view, A092);
        A0e(view, ((AccessibilityNodeInfo.AccessibilityAction) ct0.A03).getId());
        A0I(view).add(ct0);
        A0Y(view, 0);
    }

    public static void A0M(ColorStateList colorStateList, View view) {
        view.setBackgroundTintList(colorStateList);
    }

    public static void A0O(PorterDuff.Mode mode, View view) {
        view.setBackgroundTintMode(mode);
    }

    public static void A0W(View view, float f) {
        A0X(view, f);
    }

    public static void A0X(View view, float f) {
        view.setElevation(f);
    }

    public static void A0g(View view, AnonymousClass1HE r1) {
        A0h(view, r1);
    }

    public static void A0k(View view, C25247Cbm cbm) {
        C25972Cpf.A01(view, cbm);
    }

    public static void A0P(Rect rect, View view, AnonymousClass1HO r2) {
        A0Q(rect, view, r2);
    }
}
