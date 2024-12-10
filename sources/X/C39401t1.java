package X;

import android.graphics.Rect;
import android.os.Bundle;
import android.text.Spanned;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.1t1  reason: invalid class name and case insensitive filesystem */
public abstract class C39401t1 extends AnonymousClass1XU {
    public static final Rect A0A = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final C39421t3 A0B = new C39431t4();
    public int A00 = Integer.MIN_VALUE;
    public int A01 = Integer.MIN_VALUE;
    public int A02 = Integer.MIN_VALUE;
    public AnonymousClass27e A03;
    public final View A04;
    public final AccessibilityManager A05;
    public final Rect A06 = new Rect();
    public final Rect A07 = new Rect();
    public final Rect A08 = new Rect();
    public final int[] A09 = new int[2];

    public static int A00(Rect rect, Rect rect2, int i) {
        int i2;
        int i3;
        if (i == 17) {
            i2 = rect.left;
            i3 = rect2.right;
        } else if (i == 33) {
            i2 = rect.top;
            i3 = rect2.bottom;
        } else if (i == 66) {
            i2 = rect2.left;
            i3 = rect.right;
        } else if (i == 130) {
            i2 = rect2.top;
            i3 = rect.bottom;
        } else {
            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
        }
        return Math.max(0, i2 - i3);
    }

    public static AccessibilityEvent A02(C39401t1 r4, int i, int i2) {
        AccessibilityEvent obtain = AccessibilityEvent.obtain(i2);
        if (i != -1) {
            C26228CvK A1c = r4.A1c(i);
            obtain.getText().add(A1c.A07());
            AccessibilityNodeInfo accessibilityNodeInfo = A1c.A02;
            obtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            obtain.setScrollable(accessibilityNodeInfo.isScrollable());
            obtain.setPassword(accessibilityNodeInfo.isPassword());
            obtain.setEnabled(accessibilityNodeInfo.isEnabled());
            obtain.setChecked(accessibilityNodeInfo.isChecked());
            if (!obtain.getText().isEmpty() || obtain.getContentDescription() != null) {
                obtain.setClassName(accessibilityNodeInfo.getClassName());
                View view = r4.A04;
                obtain.setSource(view, i);
                obtain.setPackageName(view.getContext().getPackageName());
                return obtain;
            }
            throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
        }
        r4.A04.onInitializeAccessibilityEvent(obtain);
        return obtain;
    }

    public int A1b(float f, float f2) {
        TextView textView = ((C39411t2) this).A01;
        CharSequence text = textView.getText();
        if (!(text instanceof Spanned)) {
            return Integer.MIN_VALUE;
        }
        Spanned spanned = (Spanned) text;
        int offsetForPosition = textView.getOffsetForPosition(f, f2);
        C39371sy[] r2 = (C39371sy[]) spanned.getSpans(offsetForPosition, offsetForPosition, C39371sy.class);
        if (r2.length == 1) {
            return spanned.getSpanStart(r2[0]);
        }
        return Integer.MIN_VALUE;
    }

    public C26228CvK A1c(int i) {
        if (i != -1) {
            return A03(i);
        }
        View view = this.A04;
        C26228CvK cvK = new C26228CvK(AccessibilityNodeInfo.obtain(view));
        AccessibilityNodeInfo accessibilityNodeInfo = cvK.A02;
        view.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        ArrayList arrayList = new ArrayList();
        A1i(arrayList);
        if (accessibilityNodeInfo.getChildCount() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                cvK.A0G(view, ((Number) arrayList.get(i2)).intValue());
            }
            return cvK;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0009, code lost:
        r2 = r4.A04;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1d() {
        /*
            r4 = this;
            r3 = 1
            android.view.accessibility.AccessibilityManager r0 = r4.A05
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x0020
            android.view.View r2 = r4.A04
            android.view.ViewParent r1 = r2.getParent()
            if (r1 == 0) goto L_0x0020
            r0 = 2048(0x800, float:2.87E-42)
            android.view.accessibility.AccessibilityEvent r0 = android.view.accessibility.AccessibilityEvent.obtain(r0)
            r2.onInitializeAccessibilityEvent(r0)
            r0.setContentChangeTypes(r3)
            r1.requestSendAccessibilityEvent(r2, r0)
        L_0x0020:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39401t1.A1d():void");
    }

    public void A1f(int i, boolean z) {
    }

    public void A1g(C26228CvK cvK) {
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0059  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A1h(X.C26228CvK r7, int r8) {
        /*
            r6 = this;
            r5 = r6
            X.1t2 r5 = (X.C39411t2) r5
            android.widget.TextView r3 = r5.A01
            java.lang.CharSequence r1 = r3.getText()
            boolean r0 = r1 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x0072
            android.text.Spanned r1 = (android.text.Spanned) r1
            java.lang.Class<X.1sy> r0 = X.C39371sy.class
            java.lang.Object[] r2 = r1.getSpans(r8, r8, r0)
            X.1sy[] r2 = (X.C39371sy[]) r2
            int r1 = r2.length
            r0 = 1
            if (r1 != r0) goto L_0x0072
            r0 = 0
            r4 = r2[r0]
            if (r4 == 0) goto L_0x0073
            java.lang.CharSequence r2 = r3.getText()
            boolean r0 = r2 instanceof android.text.Spanned
            if (r0 == 0) goto L_0x0036
            android.text.Spanned r2 = (android.text.Spanned) r2
            int r1 = r2.getSpanStart(r4)
            int r0 = r2.getSpanEnd(r4)
            java.lang.CharSequence r2 = r2.subSequence(r1, r0)
        L_0x0036:
            r7.A0Q(r2)
            r3 = 1
            r7.A0i(r3)
            r7.A0f(r3)
            android.graphics.Rect r2 = r5.A00
            X.C39411t2.A03(r2, r5, r4)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0059
            X.C39411t2.A03(r2, r5, r4)
        L_0x004e:
            android.view.accessibility.AccessibilityNodeInfo r0 = r7.A02
            r0.setBoundsInParent(r2)
            r0 = 16
            r7.A0A(r0)
            return
        L_0x0059:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "LinkAccessibilityHelper/LinkSpan bounds is empty for: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            r0 = 0
            r2.set(r0, r0, r3, r3)
            goto L_0x004e
        L_0x0072:
            r4 = 0
        L_0x0073:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r0 = "LinkAccessibilityHelper/TouchableSpan is null for offset: "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            java.lang.CharSequence r2 = r3.getText()
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39401t1.A1h(X.CvK, int):void");
    }

    public void A1i(List list) {
        C39411t2 r3 = (C39411t2) this;
        AnonymousClass11C r1 = r3.A02;
        C18070vi.A0d(r1, 0);
        if (!r1.A0P("android.hardware.type.featurephone")) {
            CharSequence text = r3.A01.getText();
            if (text instanceof Spanned) {
                Spanned spanned = (Spanned) text;
                for (C39371sy spanStart : (C39371sy[]) spanned.getSpans(0, spanned.length(), C39371sy.class)) {
                    list.add(Integer.valueOf(spanned.getSpanStart(spanStart)));
                }
            }
        }
    }

    public boolean A1m(int i, int i2, Bundle bundle) {
        C39371sy r0;
        C39411t2 r1 = (C39411t2) this;
        if (i2 != 16) {
            return false;
        }
        TextView textView = r1.A01;
        CharSequence text = textView.getText();
        if (text instanceof Spanned) {
            C39371sy[] r2 = (C39371sy[]) ((Spanned) text).getSpans(i, i, C39371sy.class);
            if (r2.length == 1 && (r0 = r2[0]) != null) {
                r0.onClick(textView);
                return true;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("LinkAccessibilityHelper/LinkSpan is null for offset: ");
        sb.append(i);
        Log.e(sb.toString());
        return false;
    }

    public static int A01(Rect rect, Rect rect2, int i) {
        int i2;
        int i3;
        int i4;
        if (i != 17) {
            if (i != 33) {
                if (i != 66) {
                    if (i != 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                }
            }
            i2 = rect.left + (rect.width() / 2);
            i3 = rect2.left;
            i4 = rect2.width();
            return Math.abs(i2 - (i3 + (i4 / 2)));
        }
        i2 = rect.top + (rect.height() / 2);
        i3 = rect2.top;
        i4 = rect2.height();
        return Math.abs(i2 - (i3 + (i4 / 2)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0175, code lost:
        if (r0 < r1) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x019c, code lost:
        if (r0 >= 0) goto L_0x0177;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean A04(int r15, android.graphics.Rect r16) {
        /*
            r14 = this;
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r14.A1i(r4)
            X.04B r3 = new X.04B
            r3.<init>()
            r2 = 0
        L_0x000e:
            int r0 = r4.size()
            if (r2 >= r0) goto L_0x0032
            java.lang.Object r0 = r4.get(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            X.CvK r1 = r14.A03(r0)
            java.lang.Object r0 = r4.get(r2)
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            r3.A02(r0, r1)
            int r2 = r2 + 1
            goto L_0x000e
        L_0x0032:
            int r0 = r14.A02
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 != r7) goto L_0x0057
            r8 = 0
        L_0x0039:
            r9 = 1
            if (r15 == r9) goto L_0x0142
            r0 = 2
            if (r15 == r0) goto L_0x0142
            r0 = 17
            if (r15 == r0) goto L_0x005c
            r0 = 33
            if (r15 == r0) goto L_0x005c
            r0 = 66
            if (r15 == r0) goto L_0x005c
            r0 = 130(0x82, float:1.82E-43)
            if (r15 == r0) goto L_0x005c
            java.lang.String r1 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0057:
            java.lang.Object r8 = X.AnonymousClass0LW.A00(r3, r0)
            goto L_0x0039
        L_0x005c:
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            int r0 = r14.A02
            if (r0 == r7) goto L_0x00f9
            X.CvK r0 = r14.A1c(r0)
            android.view.accessibility.AccessibilityNodeInfo r0 = r0.A02
            r0.getBoundsInParent(r6)
        L_0x006e:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>(r6)
            r0 = 17
            r4 = 0
            if (r15 == r0) goto L_0x00e7
            r0 = 33
            if (r15 == r0) goto L_0x00e0
            r0 = 66
            if (r15 == r0) goto L_0x00ee
            r0 = 130(0x82, float:1.82E-43)
            if (r15 != r0) goto L_0x0132
            int r0 = r6.height()
            int r0 = r0 + 1
            int r0 = -r0
        L_0x008b:
            r5.offset(r4, r0)
        L_0x008e:
            int r13 = r3.A00
            android.graphics.Rect r12 = new android.graphics.Rect
            r12.<init>()
            r9 = 0
        L_0x0096:
            if (r4 >= r13) goto L_0x017b
            java.lang.Object[] r0 = r3.A02
            r11 = r0[r4]
            X.CvK r11 = (X.C26228CvK) r11
            if (r11 == r8) goto L_0x00dd
            android.view.accessibility.AccessibilityNodeInfo r0 = r11.A02
            r0.getBoundsInParent(r12)
            boolean r0 = A06(r6, r12, r15)
            if (r0 == 0) goto L_0x00dd
            boolean r0 = A06(r6, r5, r15)
            if (r0 == 0) goto L_0x00d9
            boolean r0 = A07(r6, r12, r5, r15)
            if (r0 != 0) goto L_0x00d9
            boolean r0 = A07(r6, r5, r12, r15)
            if (r0 != 0) goto L_0x00dd
            int r1 = A00(r6, r12, r15)
            int r0 = A01(r6, r12, r15)
            int r10 = r1 * 13
            int r10 = r10 * r1
            int r0 = r0 * r0
            int r10 = r10 + r0
            int r2 = A00(r6, r5, r15)
            int r1 = A01(r6, r5, r15)
            int r0 = r2 * 13
            int r0 = r0 * r2
            int r1 = r1 * r1
            int r0 = r0 + r1
            if (r10 >= r0) goto L_0x00dd
        L_0x00d9:
            r5.set(r12)
            r9 = r11
        L_0x00dd:
            int r4 = r4 + 1
            goto L_0x0096
        L_0x00e0:
            int r0 = r6.height()
            int r0 = r0 + 1
            goto L_0x008b
        L_0x00e7:
            int r0 = r6.width()
            int r0 = r0 + 1
            goto L_0x00f5
        L_0x00ee:
            int r0 = r6.width()
            int r0 = r0 + 1
            int r0 = -r0
        L_0x00f5:
            r5.offset(r0, r4)
            goto L_0x008e
        L_0x00f9:
            r0 = r16
            if (r16 == 0) goto L_0x0102
            r6.set(r0)
            goto L_0x006e
        L_0x0102:
            android.view.View r0 = r14.A04
            int r5 = r0.getWidth()
            int r4 = r0.getHeight()
            r0 = 17
            r2 = 0
            if (r15 == r0) goto L_0x012d
            r0 = 33
            if (r15 == r0) goto L_0x0128
            r0 = 66
            r1 = -1
            if (r15 == r0) goto L_0x0123
            r0 = 130(0x82, float:1.82E-43)
            if (r15 != r0) goto L_0x013a
            r6.set(r2, r1, r5, r1)
            goto L_0x006e
        L_0x0123:
            r6.set(r1, r2, r1, r4)
            goto L_0x006e
        L_0x0128:
            r6.set(r2, r4, r5, r4)
            goto L_0x006e
        L_0x012d:
            r6.set(r5, r2, r5, r4)
            goto L_0x006e
        L_0x0132:
            java.lang.String r1 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x013a:
            java.lang.String r1 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0142:
            android.view.View r0 = r14.A04
            int r0 = r0.getLayoutDirection()
            r6 = 0
            if (r0 != r9) goto L_0x014c
            r6 = 1
        L_0x014c:
            X.1t3 r5 = A0B
            int r4 = r3.A00
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r4)
            r1 = 0
        L_0x0156:
            if (r1 >= r4) goto L_0x0162
            java.lang.Object[] r0 = r3.A02
            r0 = r0[r1]
            r2.add(r0)
            int r1 = r1 + 1
            goto L_0x0156
        L_0x0162:
            X.3D4 r0 = new X.3D4
            r0.<init>(r5, r6)
            java.util.Collections.sort(r2, r0)
            if (r15 == r9) goto L_0x0190
            int r1 = r2.size()
            if (r8 != 0) goto L_0x018b
            r0 = -1
        L_0x0173:
            int r0 = r0 + 1
            if (r0 >= r1) goto L_0x01a4
        L_0x0177:
            java.lang.Object r9 = r2.get(r0)
        L_0x017b:
            if (r9 == 0) goto L_0x01a4
            int r2 = r3.A00
            r1 = 0
        L_0x0180:
            if (r1 >= r2) goto L_0x019f
            java.lang.Object[] r0 = r3.A02
            r0 = r0[r1]
            if (r0 == r9) goto L_0x01a0
            int r1 = r1 + 1
            goto L_0x0180
        L_0x018b:
            int r0 = r2.lastIndexOf(r8)
            goto L_0x0173
        L_0x0190:
            int r0 = r2.size()
            if (r8 == 0) goto L_0x019a
            int r0 = r2.indexOf(r8)
        L_0x019a:
            int r0 = r0 + -1
            if (r0 < 0) goto L_0x01a4
            goto L_0x0177
        L_0x019f:
            r1 = -1
        L_0x01a0:
            int[] r0 = r3.A01
            r7 = r0[r1]
        L_0x01a4:
            boolean r0 = r14.A1l(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39401t1.A04(int, android.graphics.Rect):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0030 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A05(android.graphics.Rect r3, android.graphics.Rect r4, int r5) {
        /*
            r0 = 17
            r2 = 1
            if (r5 == r0) goto L_0x0019
            r0 = 33
            if (r5 == r0) goto L_0x0024
            r0 = 66
            if (r5 == r0) goto L_0x0019
            r0 = 130(0x82, float:1.82E-43)
            if (r5 == r0) goto L_0x0024
            java.lang.String r1 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0019:
            int r1 = r4.bottom
            int r0 = r3.top
            if (r1 < r0) goto L_0x0031
            int r1 = r4.top
            int r0 = r3.bottom
            goto L_0x002e
        L_0x0024:
            int r1 = r4.right
            int r0 = r3.left
            if (r1 < r0) goto L_0x0031
            int r1 = r4.left
            int r0 = r3.right
        L_0x002e:
            if (r1 > r0) goto L_0x0031
            return r2
        L_0x0031:
            r2 = 0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39401t1.A05(android.graphics.Rect, android.graphics.Rect, int):boolean");
    }

    public static boolean A06(Rect rect, Rect rect2, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        if (i == 17) {
            int i6 = rect.right;
            int i7 = rect2.right;
            if (i6 <= i7 && rect.left < i7) {
                return false;
            }
            i2 = rect.left;
            i3 = rect2.left;
        } else if (i != 33) {
            if (i == 66) {
                int i8 = rect.left;
                int i9 = rect2.left;
                if (i8 >= i9 && rect.right > i9) {
                    return false;
                }
                i4 = rect.right;
                i5 = rect2.right;
            } else if (i == 130) {
                int i10 = rect.top;
                int i11 = rect2.top;
                if (i10 >= i11 && rect.bottom > i11) {
                    return false;
                }
                i4 = rect.bottom;
                i5 = rect2.bottom;
            } else {
                throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            if (i4 < i5) {
                return true;
            }
            return false;
        } else {
            int i12 = rect.bottom;
            int i13 = rect2.bottom;
            if (i12 <= i13 && rect.top < i13) {
                return false;
            }
            i2 = rect.top;
            i3 = rect2.top;
        }
        if (i2 > i3) {
            return true;
        }
        return false;
    }

    public C25760ClV A1a(View view) {
        AnonymousClass27e r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        AnonymousClass27e r02 = new AnonymousClass27e(this);
        this.A03 = r02;
        return r02;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        r2 = r3.A04;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A1e(int r4, int r5) {
        /*
            r3 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r4 == r0) goto L_0x001b
            android.view.accessibility.AccessibilityManager r0 = r3.A05
            boolean r0 = r0.isEnabled()
            if (r0 == 0) goto L_0x001b
            android.view.View r2 = r3.A04
            android.view.ViewParent r1 = r2.getParent()
            if (r1 == 0) goto L_0x001b
            android.view.accessibility.AccessibilityEvent r0 = A02(r3, r4, r5)
            r1.requestSendAccessibilityEvent(r2, r0)
        L_0x001b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39401t1.A1e(int, int):void");
    }

    public final void A1j(boolean z, int i, Rect rect) {
        int i2 = this.A02;
        if (i2 != Integer.MIN_VALUE) {
            A1k(i2);
        }
        if (z) {
            A04(i, rect);
        }
    }

    public final boolean A1k(int i) {
        if (this.A02 != i) {
            return false;
        }
        this.A02 = Integer.MIN_VALUE;
        A1f(i, false);
        A1e(i, 8);
        return true;
    }

    public final boolean A1l(int i) {
        int i2;
        View view = this.A04;
        if ((view.isFocused() || view.requestFocus()) && (i2 = this.A02) != i) {
            if (i2 != Integer.MIN_VALUE) {
                A1k(i2);
            }
            if (i != Integer.MIN_VALUE) {
                this.A02 = i;
                A1f(i, true);
                A1e(i, 8);
                return true;
            }
        }
        return false;
    }

    public final boolean A1o(MotionEvent motionEvent) {
        int i;
        AccessibilityManager accessibilityManager = this.A05;
        if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 7 || action == 9) {
            int A1b = A1b(motionEvent.getX(), motionEvent.getY());
            int i2 = this.A01;
            if (i2 != A1b) {
                this.A01 = A1b;
                A1e(A1b, 128);
                A1e(i2, 256);
            }
            if (A1b != Integer.MIN_VALUE) {
                return true;
            }
            return false;
        } else if (action != 10 || (i = this.A01) == Integer.MIN_VALUE) {
            return false;
        } else {
            this.A01 = Integer.MIN_VALUE;
            A1e(i, 256);
            return true;
        }
    }

    public C39401t1(View view) {
        if (view != null) {
            this.A04 = view;
            this.A05 = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    private C26228CvK A03(int i) {
        boolean z;
        C26228CvK A002 = C26228CvK.A00();
        A002.A0h(true);
        A002.A0i(true);
        A002.A0O("android.view.View");
        Rect rect = A0A;
        AccessibilityNodeInfo accessibilityNodeInfo = A002.A02;
        accessibilityNodeInfo.setBoundsInParent(rect);
        A002.A0D(rect);
        View view = this.A04;
        A002.A0E(view);
        A1h(A002, i);
        if (A002.A07() == null && accessibilityNodeInfo.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.A06;
        accessibilityNodeInfo.getBoundsInParent(rect2);
        if (!rect2.equals(rect)) {
            int actions = accessibilityNodeInfo.getActions();
            if ((actions & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((actions & 128) == 0) {
                A002.A0T(view.getContext().getPackageName());
                A002.A0I(view, i);
                if (this.A00 == i) {
                    A002.A0c(true);
                    A002.A0A(128);
                } else {
                    A002.A0c(false);
                    A002.A0A(64);
                }
                if (this.A02 == i) {
                    z = true;
                    A002.A0A(2);
                } else {
                    z = false;
                    if (accessibilityNodeInfo.isFocusable()) {
                        A002.A0A(1);
                    }
                }
                A002.A0j(z);
                int[] iArr = this.A09;
                view.getLocationOnScreen(iArr);
                Rect rect3 = this.A07;
                accessibilityNodeInfo.getBoundsInScreen(rect3);
                if (rect3.equals(rect)) {
                    accessibilityNodeInfo.getBoundsInParent(rect3);
                    if (A002.A00 != -1) {
                        C26228CvK A003 = C26228CvK.A00();
                        for (int i2 = A002.A00; i2 != -1; i2 = A003.A00) {
                            A003.A0H(view, -1);
                            AccessibilityNodeInfo accessibilityNodeInfo2 = A003.A02;
                            accessibilityNodeInfo2.setBoundsInParent(rect);
                            A1h(A003, i2);
                            accessibilityNodeInfo2.getBoundsInParent(rect2);
                            rect3.offset(rect2.left, rect2.top);
                        }
                    }
                    rect3.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                }
                Rect rect4 = this.A08;
                if (view.getLocalVisibleRect(rect4)) {
                    rect4.offset(iArr[0] - view.getScrollX(), iArr[1] - view.getScrollY());
                    if (rect3.intersect(rect4)) {
                        A002.A0D(rect3);
                        if (!rect3.isEmpty() && view.getWindowVisibility() == 0) {
                            ViewParent parent = view.getParent();
                            while (true) {
                                if (parent instanceof View) {
                                    View view2 = (View) parent;
                                    if (view2.getAlpha() <= 0.0f || view2.getVisibility() != 0) {
                                        break;
                                    }
                                    parent = view2.getParent();
                                } else if (parent != null) {
                                    A002.A0s(true);
                                }
                            }
                        }
                    }
                }
                return A002;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (r1 <= r0) goto L_0x0024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x005c, code lost:
        if (r1 < r0) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x005f, code lost:
        r2 = false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A07(android.graphics.Rect r5, android.graphics.Rect r6, android.graphics.Rect r7, int r8) {
        /*
            boolean r1 = A05(r5, r6, r8)
            boolean r0 = A05(r5, r7, r8)
            r4 = 0
            if (r0 != 0) goto L_0x0048
            if (r1 == 0) goto L_0x0048
            r0 = 17
            r2 = 1
            if (r8 == r0) goto L_0x0058
            r0 = 33
            if (r8 == r0) goto L_0x0053
            r0 = 66
            if (r8 == r0) goto L_0x004e
            r0 = 130(0x82, float:1.82E-43)
            if (r8 != r0) goto L_0x006a
            int r1 = r5.bottom
            int r0 = r7.top
        L_0x0022:
            if (r1 > r0) goto L_0x005f
        L_0x0024:
            r1 = 1
            if (r2 == 0) goto L_0x0069
            r0 = 17
            if (r8 == r0) goto L_0x0069
            r0 = 66
            if (r8 == r0) goto L_0x0069
            int r3 = A00(r5, r6, r8)
            r2 = 1
            r0 = 33
            if (r8 == r0) goto L_0x0049
            r0 = 130(0x82, float:1.82E-43)
            if (r8 != r0) goto L_0x0061
            int r1 = r7.bottom
            int r0 = r5.bottom
        L_0x0040:
            int r1 = r1 - r0
            int r0 = java.lang.Math.max(r2, r1)
            if (r3 >= r0) goto L_0x0048
            r4 = 1
        L_0x0048:
            return r4
        L_0x0049:
            int r1 = r5.top
            int r0 = r7.top
            goto L_0x0040
        L_0x004e:
            int r1 = r5.right
            int r0 = r7.left
            goto L_0x0022
        L_0x0053:
            int r1 = r5.top
            int r0 = r7.bottom
            goto L_0x005c
        L_0x0058:
            int r1 = r5.left
            int r0 = r7.right
        L_0x005c:
            if (r1 < r0) goto L_0x005f
            goto L_0x0024
        L_0x005f:
            r2 = 0
            goto L_0x0024
        L_0x0061:
            java.lang.String r1 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0069:
            return r1
        L_0x006a:
            java.lang.String r1 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39401t1.A07(android.graphics.Rect, android.graphics.Rect, android.graphics.Rect, int):boolean");
    }

    public void A1Z(View view, C26228CvK cvK) {
        super.A1Z(view, cvK);
        A1g(cvK);
    }

    public final boolean A1n(KeyEvent keyEvent) {
        int i;
        int i2 = 0;
        if (keyEvent.getAction() != 1) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 61) {
                if (keyCode != 66) {
                    switch (keyCode) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                            if (keyEvent.hasNoModifiers()) {
                                if (keyCode == 19) {
                                    i = 33;
                                } else if (keyCode != 21) {
                                    i = 66;
                                    if (keyCode != 22) {
                                        i = 130;
                                    }
                                } else {
                                    i = 17;
                                }
                                int repeatCount = keyEvent.getRepeatCount() + 1;
                                boolean z = false;
                                while (i2 < repeatCount && A04(i, (Rect) null)) {
                                    i2++;
                                    z = true;
                                }
                                return z;
                            }
                            break;
                        case 23:
                            break;
                    }
                }
                if (keyEvent.hasNoModifiers() && keyEvent.getRepeatCount() == 0) {
                    int i3 = this.A02;
                    if (i3 == Integer.MIN_VALUE) {
                        return true;
                    }
                    A1m(i3, 16, (Bundle) null);
                    return true;
                }
            } else if (keyEvent.hasNoModifiers()) {
                return A04(2, (Rect) null);
            } else {
                if (keyEvent.hasModifiers(1)) {
                    return A04(1, (Rect) null);
                }
            }
        }
        return false;
    }
}
