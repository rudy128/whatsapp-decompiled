package X;

import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import com.facebook.msys.mci.DefaultCrypto;

public final class BJD extends AnonymousClass05G {
    public static final C22821Di A0I = C28125Drj.A00;
    public C24246By4 A00;
    public E0D A01;
    public C25999CqG A02;
    public String A03;
    public C18090vk A04;
    public C25194Cal A05;
    public boolean A06;
    public final Rect A07;
    public final View A08;
    public final WindowManager.LayoutParams A09;
    public final WindowManager A0A;
    public final C17330uU A0B;
    public final C17330uU A0C;
    public final C17330uU A0D;
    public final C16300s2 A0E;
    public final C04920Pn A0F;
    public final E3Y A0G;
    public final int[] A0H;

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [java.lang.Object, X.4rE] */
    public final void A08() {
        C26142Ct5 r0;
        C25194Cal cal = this.A05;
        if (cal != null && (r0 = m49getPopupContentSizebOM6tXw()) != null) {
            long j = r0.A00;
            Rect rect = this.A07;
            E3Y e3y = this.A0G;
            this.A08.getWindowVisibleDisplayFrame(rect);
            int i = rect.left;
            int i2 = rect.top;
            long A002 = C25293Ccv.A00(rect.right - i, rect.bottom - i2);
            ? obj = new Object();
            obj.element = C26143Ct6.A01;
            this.A0F.A06(this, new C27848Dmj(cal, this, obj, A002, j), A0I);
            WindowManager.LayoutParams layoutParams = this.A09;
            long j2 = obj.element;
            layoutParams.x = AnonymousClass000.A0G(j2);
            layoutParams.y = (int) (j2 & 4294967295L);
            e3y.CJ1(this, AnonymousClass000.A0G(A002), (int) (A002 & 4294967295L));
            this.A0A.updateViewLayout(this, layoutParams);
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null || ((motionEvent.getAction() != 0 || (motionEvent.getX() >= 0.0f && motionEvent.getX() < C108945cZ.A03(this) && motionEvent.getY() >= 0.0f && motionEvent.getY() < C108945cZ.A04(this))) && motionEvent.getAction() != 4)) {
            return super.onTouchEvent(motionEvent);
        }
        C18090vk r0 = this.A04;
        if (r0 != null) {
            r0.invoke();
        }
        return true;
    }

    public void setLayoutDirection(int i) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v17, resolved type: X.BJI} */
    /* JADX WARNING: type inference failed for: r1v2, types: [X.E3Y] */
    /* JADX WARNING: type inference failed for: r1v16 */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ BJD(android.view.View r7, X.C28644ECa r8, X.E0D r9, X.C25999CqG r10, java.lang.String r11, java.util.UUID r12, X.C18090vk r13) {
        /*
            r6 = this;
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 29
            if (r1 < r0) goto L_0x00f2
            X.BJI r1 = new X.BJI
            r1.<init>()
        L_0x000b:
            android.content.Context r0 = r7.getContext()
            r2 = 0
            r4 = 0
            r6.<init>(r0, r2, r4)
            r6.A04 = r13
            r6.A02 = r10
            r6.A03 = r11
            r6.A08 = r7
            r6.A0G = r1
            android.content.Context r1 = r7.getContext()
            java.lang.String r0 = "window"
            java.lang.Object r1 = r1.getSystemService(r0)
            java.lang.String r0 = "null cannot be cast to non-null type android.view.WindowManager"
            X.C18070vi.A0z(r1, r0)
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            r6.A0A = r1
            android.view.WindowManager$LayoutParams r3 = new android.view.WindowManager$LayoutParams
            r3.<init>()
            r0 = 8388659(0x800033, float:1.1755015E-38)
            r3.gravity = r0
            int r1 = r3.flags
            r0 = -8552473(0xffffffffff7d7fe7, float:-3.369588E38)
            r1 = r1 & r0
            r3.flags = r1
            r0 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 | r0
            r3.flags = r1
            r0 = 1002(0x3ea, float:1.404E-42)
            r3.type = r0
            android.view.View r1 = r6.A08
            android.os.IBinder r0 = r1.getApplicationWindowToken()
            r3.token = r0
            r0 = -2
            r3.width = r0
            r3.height = r0
            r0 = -3
            r3.format = r0
            android.content.res.Resources r1 = X.AnonymousClass000.A0Y(r1)
            r0 = 2131898873(0x7f1231f9, float:1.9432676E38)
            java.lang.String r0 = r1.getString(r0)
            r3.setTitle(r0)
            r6.A09 = r3
            r6.A01 = r9
            X.By4 r0 = X.C24246By4.Ltr
            r6.A00 = r0
            r3 = 2
            X.08V r0 = X.AnonymousClass0Q9.A02(r2)
            r6.A0D = r0
            X.0Vp r1 = X.AnonymousClass0Q9.A06()
            X.08V r0 = new X.08V
            r0.<init>(r1, r2)
            r6.A0C = r0
            X.Dfs r0 = new X.Dfs
            r0.<init>(r6)
            X.08W r0 = X.AnonymousClass0PF.A01(r0)
            r6.A0E = r0
            r5 = 1090519040(0x41000000, float:8.0)
            android.graphics.Rect r0 = X.AnonymousClass3MW.A07()
            r6.A07 = r0
            X.DoM r1 = new X.DoM
            r1.<init>(r6)
            X.0Pn r0 = new X.0Pn
            r0.<init>(r1)
            r6.A0F = r0
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            r6.setId(r0)
            X.1F9 r0 = X.AnonymousClass1ZG.A00(r7)
            X.AnonymousClass1ZG.A01(r6, r0)
            X.1FD r0 = androidx.lifecycle.ViewTreeViewModelStoreOwner.A00(r7)
            androidx.lifecycle.ViewTreeViewModelStoreOwner.A01(r6, r0)
            X.1FE r0 = X.AnonymousClass1ZI.A00(r7)
            X.AnonymousClass1ZI.A01(r6, r0)
            r2 = 2131429328(0x7f0b07d0, float:1.8480326E38)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Popup:"
            java.lang.String r0 = X.AnonymousClass001.A1E(r12, r0, r1)
            r6.setTag(r2, r0)
            r6.setClipChildren(r4)
            float r0 = r8.CPQ(r5)
            r6.setElevation(r0)
            X.BHm r0 = new X.BHm
            r0.<init>()
            r6.setOutlineProvider(r0)
            X.1OS r2 = X.CEA.A00
            X.0Vp r1 = X.AnonymousClass0Q9.A06()
            X.08V r0 = new X.08V
            r0.<init>(r1, r2)
            r6.A0B = r0
            int[] r0 = new int[r3]
            r6.A0H = r0
            return
        L_0x00f2:
            X.D6G r1 = new X.D6G
            r1.<init>()
            goto L_0x000b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.BJD.<init>(android.view.View, X.ECa, X.E0D, X.CqG, java.lang.String, java.util.UUID, X.0vk):void");
    }

    private final AnonymousClass1OS getContent() {
        return (AnonymousClass1OS) this.A0B.getValue();
    }

    /* access modifiers changed from: private */
    public final C16910tQ getParentLayoutCoordinates() {
        return (C16910tQ) this.A0C.getValue();
    }

    private final void setClippingEnabled(boolean z) {
        int i;
        WindowManager.LayoutParams layoutParams = this.A09;
        int i2 = layoutParams.flags;
        if (z) {
            i = i2 & -513;
        } else {
            i = i2 | 512;
        }
        layoutParams.flags = i;
        this.A0A.updateViewLayout(this, layoutParams);
    }

    private final void setIsFocusable(boolean z) {
        int i;
        WindowManager.LayoutParams layoutParams = this.A09;
        int i2 = layoutParams.flags;
        if (!z) {
            i = i2 | 8;
        } else {
            i = i2 & -9;
        }
        layoutParams.flags = i;
        this.A0A.updateViewLayout(this, layoutParams);
    }

    private final void setParentLayoutCoordinates(C16910tQ r2) {
        this.A0C.setValue(r2);
    }

    private final void setSecurePolicy(C24247By5 by5) {
        WindowManager.LayoutParams layoutParams;
        int i;
        ViewGroup.LayoutParams layoutParams2 = this.A08.getRootView().getLayoutParams();
        if (layoutParams2 instanceof WindowManager.LayoutParams) {
            layoutParams = (WindowManager.LayoutParams) layoutParams2;
        } else {
            layoutParams = null;
        }
        boolean z = false;
        if (!(layoutParams == null || (layoutParams.flags & DefaultCrypto.BUFFER_SIZE) == 0)) {
            z = true;
        }
        int ordinal = by5.ordinal();
        if (ordinal == 2) {
            z = false;
        } else if (ordinal == 1) {
            z = true;
        } else if (ordinal != 0) {
            throw AnonymousClass3MW.A14();
        }
        WindowManager.LayoutParams layoutParams3 = this.A09;
        int i2 = layoutParams3.flags;
        if (z) {
            i = i2 | DefaultCrypto.BUFFER_SIZE;
        } else {
            i = i2 & -8193;
        }
        layoutParams3.flags = i;
        this.A0A.updateViewLayout(this, layoutParams3);
    }

    public final void A0A(C24246By4 by4, C25999CqG cqG, String str, C18090vk r7) {
        this.A04 = r7;
        this.A02 = cqG;
        this.A03 = str;
        setIsFocusable(false);
        setSecurePolicy(cqG.A00);
        setClippingEnabled(cqG.A01);
        int ordinal = by4.ordinal();
        int i = 1;
        if (ordinal == 0) {
            i = 0;
        } else if (ordinal != 1) {
            throw AnonymousClass3MW.A14();
        }
        super.setLayoutDirection(i);
    }

    public final boolean getCanCalculatePosition() {
        return AnonymousClass000.A1Y(this.A0E.getValue());
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.A09;
    }

    public final C24246By4 getParentLayoutDirection() {
        return this.A00;
    }

    /* renamed from: getPopupContentSize-bOM6tXw  reason: not valid java name */
    public final C26142Ct5 m49getPopupContentSizebOM6tXw() {
        return (C26142Ct5) this.A0D.getValue();
    }

    public final E0D getPositionProvider() {
        return this.A01;
    }

    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.A06;
    }

    public AnonymousClass05G getSubCompositionView() {
        return this;
    }

    public final String getTestTag() {
        return this.A03;
    }

    public /* synthetic */ View getViewRoot() {
        return null;
    }

    /* renamed from: setPopupContentSize-fhxjrPA  reason: not valid java name */
    public final void m50setPopupContentSizefhxjrPA(C26142Ct5 ct5) {
        this.A0D.setValue(ct5);
    }

    private final int getDisplayHeight() {
        return C22339B3q.A01(((float) AnonymousClass000.A0Y(this).getConfiguration().screenHeightDp) * C72473Md.A00(this));
    }

    private final int getDisplayWidth() {
        return C22339B3q.A01(((float) AnonymousClass000.A0Y(this).getConfiguration().screenWidthDp) * C72473Md.A00(this));
    }

    public void A04(int i, int i2) {
        super.A04(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
    }

    public void A05(C17130tn r3, int i) {
        r3.COC(-857613600);
        getContent().invoke(r3, AnonymousClass3MY.A0f());
        C05660Vf BKF = r3.BKF();
        if (BKF != null) {
            BKF.A06 = new DsZ(this, i);
        }
    }

    public void A06(boolean z, int i, int i2, int i3, int i4) {
        super.A06(z, i, i2, i3, i4);
        View A0F2 = AnonymousClass3MY.A0F(this);
        if (A0F2 != null) {
            WindowManager.LayoutParams layoutParams = this.A09;
            layoutParams.width = A0F2.getMeasuredWidth();
            layoutParams.height = A0F2.getMeasuredHeight();
            this.A0A.updateViewLayout(this, layoutParams);
        }
    }

    public final void A07() {
        C16910tQ parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            long BZM = parentLayoutCoordinates.BZM();
            long Bhw = parentLayoutCoordinates.Bhw(AnonymousClass0QY.A03);
            long A002 = C7A.A00(C22339B3q.A01(AnonymousClass0QY.A01(Bhw)), C22339B3q.A01(AnonymousClass0QY.A02(Bhw)));
            int i = (int) (A002 >> 32);
            int i2 = (int) (A002 & 4294967295L);
            C25194Cal cal = new C25194Cal(i, i2, i + ((int) (BZM >> 32)), ((int) (BZM & 4294967295L)) + i2);
            if (!cal.equals(this.A05)) {
                this.A05 = cal;
                A08();
            }
        }
    }

    public final void A09(C16910tQ r1) {
        setParentLayoutCoordinates(r1);
        A07();
    }

    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4 && getKeyDispatcherState() != null) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
            } else if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                C18090vk r0 = this.A04;
                if (r0 != null) {
                    r0.invoke();
                    return true;
                }
            }
            return true;
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A0F.A05();
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C04920Pn r1 = this.A0F;
        C16320s4 r0 = r1.A00;
        if (r0 != null) {
            r0.dispose();
        }
        r1.A04();
    }

    public final void setContent(AnonymousClass0D1 r2, AnonymousClass1OS r3) {
        setParentCompositionContext(r2);
        setContent(r3);
        this.A06 = true;
    }

    public final void setParentLayoutDirection(C24246By4 by4) {
        this.A00 = by4;
    }

    public final void setPositionProvider(E0D e0d) {
        this.A01 = e0d;
    }

    public final void setTestTag(String str) {
        this.A03 = str;
    }

    private final void setContent(AnonymousClass1OS r2) {
        this.A0B.setValue(r2);
    }
}
