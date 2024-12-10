package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

/* renamed from: X.0SF  reason: invalid class name */
public class AnonymousClass0SF implements AnonymousClass0t8 {
    public static Method A0P;
    public static Method A0Q;
    public static Method A0R;
    public int A00 = 0;
    public int A01;
    public int A02;
    public int A03 = -2;
    public Context A04;
    public Rect A05;
    public View A06;
    public AdapterView.OnItemClickListener A07;
    public AdapterView.OnItemSelectedListener A08;
    public ListAdapter A09;
    public PopupWindow A0A;
    public C009205e A0B;
    public Runnable A0C;
    public boolean A0D;
    public boolean A0E = false;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public DataSetObserver A0I;
    public final Rect A0J = new Rect();
    public final Handler A0K;
    public final C05300Rq A0L = new C05300Rq(this);
    public final C06520Yq A0M = new C06520Yq(this);
    public final C06510Yp A0N = new C06510Yp(this);
    public final AnonymousClass0Ri A0O = new AnonymousClass0Ri(this);

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            Class<PopupWindow> cls = PopupWindow.class;
            try {
                A0Q = cls.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                A0R = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
        if (Build.VERSION.SDK_INT <= 23) {
            Class<PopupWindow> cls2 = PopupWindow.class;
            try {
                A0P = cls2.getDeclaredMethod("getMaxAvailableHeight", new Class[]{View.class, Integer.TYPE, Boolean.TYPE});
            } catch (NoSuchMethodException unused3) {
                Log.i("ListPopupWindow", "Could not find method getMaxAvailableHeight(View, int, boolean) on PopupWindow. Oh well.");
            }
        }
    }

    public C009205e A02(Context context, boolean z) {
        return new C009205e(context, z);
    }

    public void A03(int i) {
        Drawable background = this.A0A.getBackground();
        if (background != null) {
            Rect rect = this.A0J;
            background.getPadding(rect);
            this.A03 = rect.left + rect.right + i;
            return;
        }
        this.A03 = i;
    }

    public Drawable BNI() {
        return this.A0A.getBackground();
    }

    public int BbP() {
        if (!this.A0D) {
            return 0;
        }
        return this.A02;
    }

    public boolean BgV() {
        return this.A0A.isShowing();
    }

    public void CHm(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.A0I;
        if (dataSetObserver == null) {
            this.A0I = new AnonymousClass04P(this);
        } else {
            ListAdapter listAdapter2 = this.A09;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.A09 = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.A0I);
        }
        C009205e r1 = this.A0B;
        if (r1 != null) {
            r1.setAdapter(this.A09);
        }
    }

    public void CI3(Drawable drawable) {
        this.A0A.setBackgroundDrawable(drawable);
    }

    public void CLK(int i) {
        this.A02 = i;
        this.A0D = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f2  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0126  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void CMX() {
        /*
            r19 = this;
            r3 = r19
            X.05e r0 = r3.A0B
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = -1
            r10 = 1
            if (r0 != 0) goto L_0x008a
            android.content.Context r1 = r3.A04
            X.0Yo r0 = new X.0Yo
            r0.<init>(r3)
            r3.A0C = r0
            boolean r0 = r3.A0F
            r0 = r0 ^ 1
            X.05e r1 = r3.A02(r1, r0)
            r3.A0B = r1
            android.widget.ListAdapter r0 = r3.A09
            r1.setAdapter(r0)
            X.05e r1 = r3.A0B
            android.widget.AdapterView$OnItemClickListener r0 = r3.A07
            r1.setOnItemClickListener(r0)
            X.05e r0 = r3.A0B
            r0.setFocusable(r10)
            X.05e r0 = r3.A0B
            r0.setFocusableInTouchMode(r10)
            X.05e r2 = r3.A0B
            r1 = 0
            X.0Rv r0 = new X.0Rv
            r0.<init>(r3, r1)
            r2.setOnItemSelectedListener(r0)
            X.05e r1 = r3.A0B
            X.0Rq r0 = r3.A0L
            r1.setOnScrollListener(r0)
            android.widget.AdapterView$OnItemSelectedListener r1 = r3.A08
            if (r1 == 0) goto L_0x004e
            X.05e r0 = r3.A0B
            r0.setOnItemSelectedListener(r1)
        L_0x004e:
            X.05e r0 = r3.A0B
            r12 = 0
            android.widget.PopupWindow r13 = r3.A0A
            r13.setContentView(r0)
        L_0x0056:
            android.graphics.drawable.Drawable r0 = r13.getBackground()
            android.graphics.Rect r6 = r3.A0J
            if (r0 == 0) goto L_0x0085
            r0.getPadding(r6)
            int r1 = r6.top
            int r0 = r6.bottom
            int r11 = r1 + r0
            boolean r0 = r3.A0D
            if (r0 != 0) goto L_0x006e
            int r0 = -r1
            r3.A02 = r0
        L_0x006e:
            int r1 = r13.getInputMethodMode()
            r0 = 2
            if (r1 == r0) goto L_0x0076
            r10 = 0
        L_0x0076:
            android.view.View r9 = r3.A06
            int r8 = r3.A02
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 23
            if (r1 > r0) goto L_0x00ab
            java.lang.reflect.Method r4 = A0P
            if (r4 == 0) goto L_0x00b7
            goto L_0x0091
        L_0x0085:
            r6.setEmpty()
            r11 = 0
            goto L_0x006e
        L_0x008a:
            android.widget.PopupWindow r13 = r3.A0A
            r13.getContentView()
            r12 = 0
            goto L_0x0056
        L_0x0091:
            r0 = 3
            java.lang.Object[] r2 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x00b0 }
            r2[r12] = r9     // Catch:{ Exception -> 0x00b0 }
            X.AnonymousClass000.A1M(r2, r8)     // Catch:{ Exception -> 0x00b0 }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r10)     // Catch:{ Exception -> 0x00b0 }
            r0 = 2
            r2[r0] = r1     // Catch:{ Exception -> 0x00b0 }
            java.lang.Object r0 = r4.invoke(r13, r2)     // Catch:{ Exception -> 0x00b0 }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x00b0 }
            int r4 = r0.intValue()     // Catch:{ Exception -> 0x00b0 }
            goto L_0x00bb
        L_0x00ab:
            int r4 = X.AnonymousClass0DF.A00(r9, r13, r8, r10)
            goto L_0x00bb
        L_0x00b0:
            java.lang.String r1 = "ListPopupWindow"
            java.lang.String r0 = "Could not call getMaxAvailableHeightMethod(View, int, boolean) on PopupWindow. Using the public version."
            android.util.Log.i(r1, r0)
        L_0x00b7:
            int r4 = r13.getMaxAvailableHeight(r9, r8)
        L_0x00bb:
            int r1 = r3.A03
            r0 = -2
            if (r1 == r0) goto L_0x01c7
            r5 = 1073741824(0x40000000, float:2.0)
            if (r1 == r7) goto L_0x01c7
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r1, r5)
        L_0x00c8:
            X.05e r0 = r3.A0B
            r6 = -1
            int r2 = r0.A05(r1, r4)
            if (r2 <= 0) goto L_0x00e0
            X.05e r0 = r3.A0B
            int r1 = r0.getPaddingTop()
            X.05e r0 = r3.A0B
            int r0 = r0.getPaddingBottom()
            int r1 = r1 + r0
            int r11 = r11 + r1
            int r12 = r12 + r11
        L_0x00e0:
            int r2 = r2 + r12
            r13.getInputMethodMode()
            r0 = 1002(0x3ea, float:1.404E-42)
            X.AnonymousClass1HL.A00(r13, r0)
            boolean r0 = r13.isShowing()
            r4 = 1
            r5 = -2
            r7 = 0
            if (r0 == 0) goto L_0x0126
            android.view.View r0 = r3.A06
            boolean r0 = r0.isAttachedToWindow()
            if (r0 == 0) goto L_0x011c
            int r1 = r3.A03
            if (r1 != r6) goto L_0x011d
            r1 = -1
        L_0x00ff:
            boolean r0 = r3.A0E
            if (r0 == 0) goto L_0x0104
            r4 = 0
        L_0x0104:
            r13.setOutsideTouchable(r4)
            android.view.View r14 = r3.A06
            int r15 = r3.A01
            int r0 = r3.A02
            if (r1 >= 0) goto L_0x0110
            r1 = -1
        L_0x0110:
            if (r2 >= 0) goto L_0x0113
            r2 = -1
        L_0x0113:
            r16 = r0
            r17 = r1
            r18 = r2
            r13.update(r14, r15, r16, r17, r18)
        L_0x011c:
            return
        L_0x011d:
            if (r1 != r5) goto L_0x00ff
            android.view.View r0 = r3.A06
            int r1 = r0.getWidth()
            goto L_0x00ff
        L_0x0126:
            int r0 = r3.A03
            if (r0 != r6) goto L_0x013d
            r0 = -1
        L_0x012b:
            r13.setWidth(r0)
            r13.setHeight(r2)
            r5 = 1
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 > r0) goto L_0x015a
            java.lang.reflect.Method r2 = A0Q
            if (r2 == 0) goto L_0x015d
            goto L_0x0146
        L_0x013d:
            if (r0 != r5) goto L_0x012b
            android.view.View r0 = r3.A06
            int r0 = r0.getWidth()
            goto L_0x012b
        L_0x0146:
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x0152 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)     // Catch:{ Exception -> 0x0152 }
            r1[r7] = r0     // Catch:{ Exception -> 0x0152 }
            r2.invoke(r13, r1)     // Catch:{ Exception -> 0x0152 }
            goto L_0x015d
        L_0x0152:
            java.lang.String r1 = "ListPopupWindow"
            java.lang.String r0 = "Could not call setClipToScreenEnabled() on PopupWindow. Oh well."
            android.util.Log.i(r1, r0)
            goto L_0x015d
        L_0x015a:
            X.C03770Ko.A01(r13)
        L_0x015d:
            boolean r0 = r3.A0E
            boolean r0 = X.AnonymousClass000.A1P(r0)
            r13.setOutsideTouchable(r0)
            X.0Ri r0 = r3.A0O
            r13.setTouchInterceptor(r0)
            boolean r0 = r3.A0H
            if (r0 == 0) goto L_0x0174
            boolean r0 = r3.A0G
            X.AnonymousClass1HL.A01(r13, r0)
        L_0x0174:
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 28
            if (r1 > r0) goto L_0x0188
            java.lang.reflect.Method r2 = A0R
            if (r2 == 0) goto L_0x0196
            java.lang.Object[] r1 = new java.lang.Object[r4]     // Catch:{ Exception -> 0x018e }
            android.graphics.Rect r0 = r3.A05     // Catch:{ Exception -> 0x018e }
            r1[r7] = r0     // Catch:{ Exception -> 0x018e }
            r2.invoke(r13, r1)     // Catch:{ Exception -> 0x018e }
            goto L_0x0196
        L_0x0188:
            android.graphics.Rect r0 = r3.A05
            X.C03770Ko.A00(r0, r13)
            goto L_0x0196
        L_0x018e:
            r2 = move-exception
            java.lang.String r1 = "ListPopupWindow"
            java.lang.String r0 = "Could not invoke setEpicenterBounds on PopupWindow"
            android.util.Log.e(r1, r0, r2)
        L_0x0196:
            android.view.View r4 = r3.A06
            int r2 = r3.A01
            int r1 = r3.A02
            int r0 = r3.A00
            r13.showAsDropDown(r4, r2, r1, r0)
            X.05e r0 = r3.A0B
            r0.setSelection(r6)
            boolean r0 = r3.A0F
            if (r0 == 0) goto L_0x01b2
            X.05e r0 = r3.A0B
            boolean r0 = r0.isInTouchMode()
            if (r0 == 0) goto L_0x01bb
        L_0x01b2:
            X.05e r0 = r3.A0B
            if (r0 == 0) goto L_0x01bb
            r0.A07 = r5
            r0.requestLayout()
        L_0x01bb:
            boolean r0 = r3.A0F
            if (r0 != 0) goto L_0x011c
            android.os.Handler r1 = r3.A0K
            X.0Yp r0 = r3.A0N
            r1.post(r0)
            return
        L_0x01c7:
            android.content.Context r0 = r3.A04
            android.content.res.Resources r0 = r0.getResources()
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r2 = r0.widthPixels
            int r1 = r6.left
            int r0 = r6.right
            int r1 = r1 + r0
            int r2 = r2 - r1
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r5)
            goto L_0x00c8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0SF.CMX():void");
    }

    public void dismiss() {
        PopupWindow popupWindow = this.A0A;
        popupWindow.dismiss();
        popupWindow.setContentView((View) null);
        this.A0B = null;
        this.A0K.removeCallbacks(this.A0M);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.05g, android.widget.PopupWindow] */
    public AnonymousClass0SF(Context context, AttributeSet attributeSet, int i, int i2) {
        this.A04 = context;
        this.A0K = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C002501d.A0E, i, i2);
        this.A01 = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.A02 = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.A0D = true;
        }
        obtainStyledAttributes.recycle();
        ? popupWindow = new PopupWindow(context, attributeSet, i, i2);
        C002401c A002 = C002401c.A00(context, attributeSet, C002501d.A0I, i, i2);
        TypedArray typedArray = A002.A02;
        if (typedArray.hasValue(2)) {
            A01(popupWindow, typedArray.getBoolean(2, false));
        }
        popupWindow.setBackgroundDrawable(A002.A03(0));
        typedArray.recycle();
        this.A0A = popupWindow;
        popupWindow.setInputMethodMode(1);
    }

    public static void A01(C009405g r0, boolean z) {
        AnonymousClass1HL.A01(r0, z);
    }

    public int BSY() {
        return this.A01;
    }

    public C009205e BU2() {
        return this.A0B;
    }

    public void CJ6(int i) {
        this.A01 = i;
    }
}
