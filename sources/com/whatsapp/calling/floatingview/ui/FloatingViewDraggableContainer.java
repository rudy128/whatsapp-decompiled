package com.whatsapp.calling.floatingview.ui;

import X.AnonymousClass000;
import X.AnonymousClass009;
import X.AnonymousClass031;
import X.AnonymousClass033;
import X.AnonymousClass10E;
import X.AnonymousClass1DC;
import X.AnonymousClass1DF;
import X.AnonymousClass1F9;
import X.AnonymousClass1K1;
import X.AnonymousClass1LG;
import X.AnonymousClass1Y1;
import X.AnonymousClass1ZG;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass6T0;
import X.AnonymousClass72U;
import X.AnonymousClass7A9;
import X.AnonymousClass7DJ;
import X.AnonymousClass7DM;
import X.BMV;
import X.C108965cb;
import X.C108975cc;
import X.C109765dy;
import X.C110985hb;
import X.C112285lE;
import X.C116195wb;
import X.C116205wc;
import X.C116215wd;
import X.C122686Ri;
import X.C123816Vy;
import X.C125666bS;
import X.C131136kZ;
import X.C1409473r;
import X.C1420477y;
import X.C148987iK;
import X.C148997iL;
import X.C149007iM;
import X.C149017iN;
import X.C149027iO;
import X.C149037iP;
import X.C1605188u;
import X.C18030ve;
import X.C18070vi;
import X.C18100vl;
import X.C26281Cwc;
import X.C27691Xc;
import X.C29051bX;
import X.C30391dr;
import X.C39351sv;
import X.C72453Mb;
import X.CIZ;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.whatsapp.util.Log;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import java.util.ArrayList;

public final class FloatingViewDraggableContainer extends FrameLayout implements AnonymousClass009 {
    public C26281Cwc A00;
    public C125666bS A01;
    public C1409473r A02;
    public C131136kZ A03;
    public AnonymousClass031 A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public CIZ A08;
    public final C18100vl A09;
    public final C18100vl A0A;
    public final C110985hb A0B;
    public final C18100vl A0C;
    public final C18100vl A0D;
    public final C18100vl A0E;
    public final C18100vl A0F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FloatingViewDraggableContainer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        int i2;
        C18070vi.A0d(context, 1);
        if (!this.A05) {
            this.A05 = true;
            C27691Xc r1 = (C27691Xc) ((AnonymousClass033) generatedComponent());
            AnonymousClass10E r2 = r1.A10;
            AnonymousClass1K1 r12 = r1.A0z;
            C112285lE r3 = (C112285lE) r12.A6M.get();
            C18030ve A8q = AnonymousClass10E.A8q(r2);
            this.A02 = new C1409473r(r3, AnonymousClass10E.A6R(r2), AnonymousClass10E.A84(r2), A8q, (AnonymousClass1DC) r2.A95.get());
            this.A03 = (C131136kZ) r12.A40.get();
            this.A01 = (C125666bS) r12.A5q.get();
        }
        this.A0A = AnonymousClass1DF.A01(new C149027iO(this));
        this.A09 = AnonymousClass1DF.A01(new C148987iK(this));
        this.A0C = AnonymousClass1DF.A01(new C148997iL(this));
        this.A0D = AnonymousClass1DF.A01(new C149007iM(this));
        this.A0F = AnonymousClass1DF.A01(new C149037iP(this));
        this.A0B = new C110985hb(this);
        this.A0E = AnonymousClass1DF.A01(new C149017iN(this));
        if (isAttachedToWindow()) {
            A05(this);
            if (!isAttachedToWindow()) {
                getFloatingViewManager().A0A(this);
                return;
            }
            i2 = 1;
        } else {
            i2 = 2;
        }
        addOnAttachStateChangeListener(new C1420477y(this, this, i2));
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        C26281Cwc cwc;
        C18070vi.A0d(motionEvent, 0);
        if (getFloatingViewManager().A08() == null) {
            return false;
        }
        if (this.A06 || (((cwc = this.A00) != null && cwc.A0H(motionEvent)) || A07(motionEvent, false) || super.onInterceptTouchEvent(motionEvent))) {
            return true;
        }
        return false;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        C18070vi.A0d(motionEvent, 0);
        boolean z2 = false;
        if (getFloatingViewManager().A08() != null) {
            z = true;
            if (!this.A06) {
                CIZ ciz = this.A08;
                if (ciz != null) {
                    ciz.A00.onTouchEvent(motionEvent);
                }
                if (!A07(motionEvent, true)) {
                    C26281Cwc cwc = this.A00;
                    if (!(cwc == null || cwc.A06 == null)) {
                        z2 = true;
                        C1409473r floatingViewManager = getFloatingViewManager();
                        if (floatingViewManager.A05.canDrag && !floatingViewManager.A0D) {
                            try {
                                C26281Cwc cwc2 = this.A00;
                                if (cwc2 != null) {
                                    cwc2.A0D(motionEvent);
                                    return true;
                                }
                            } catch (IllegalArgumentException e) {
                                Log.e("FloatingViewDraggableContainer/onTouchEvent", e);
                                return true;
                            }
                        }
                    }
                    return z2;
                }
            }
        }
        return z;
    }

    public final void setBehavior(C122686Ri r7) {
        C18070vi.A0d(r7, 0);
        C123816Vy r0 = C123816Vy.$redex_init_class;
        switch (r7.ordinal()) {
            case 0:
                A03(getStatusBarHeightPx().A00);
                break;
            case 1:
                A03(0);
                break;
            case 2:
            case 3:
                A04(2131427841, 2131427844);
                break;
            case 4:
            case 5:
                A02();
                break;
        }
        C1409473r floatingViewManager = getFloatingViewManager();
        C122686Ri r02 = floatingViewManager.A05;
        C122686Ri r4 = C122686Ri.FOCUS;
        if (r02 == r4 && r7 != r4) {
            C116205wc r3 = C116205wc.A00;
            AnonymousClass1F9 A002 = AnonymousClass1ZG.A00(this);
            if (A002 != null) {
                AnonymousClass3MX.A1Q(new FloatingViewManager$tryHideWithAnimation$1(this, floatingViewManager, r3, (C30391dr) null), AnonymousClass3MZ.A0H(A002));
            }
        }
        C1409473r floatingViewManager2 = getFloatingViewManager();
        if (floatingViewManager2.A05 != r7) {
            floatingViewManager2.A05 = r7;
            floatingViewManager2.A09();
        }
        C131136kZ stateHolder = getStateHolder();
        if (stateHolder.A02 != r7) {
            stateHolder.A02 = r7;
            if (r7 != r4) {
                stateHolder.A0F.setValue((Object) null);
            }
            stateHolder.A0E.setValue(stateHolder.A02);
        }
    }

    public final void setFloatingViewManager(C1409473r r2) {
        C18070vi.A0d(r2, 0);
        this.A02 = r2;
    }

    public final void setStateHolder(C131136kZ r2) {
        C18070vi.A0d(r2, 0);
        this.A03 = r2;
    }

    public final void setStatusBarHeightPx(C125666bS r2) {
        C18070vi.A0d(r2, 0);
        this.A01 = r2;
    }

    private final boolean A07(MotionEvent motionEvent, boolean z) {
        C26281Cwc cwc = this.A00;
        if (cwc == null || motionEvent.getAction() != 0 || !getFloatingViewManager().A07().contains((int) motionEvent.getX(), (int) motionEvent.getY()) || getFloatingViewManager().A05 == C122686Ri.FOCUS) {
            return false;
        }
        if (z) {
            View A082 = getFloatingViewManager().A08();
            if (A082 != null) {
                cwc.A0E(A082, motionEvent.getPointerId(0));
            }
            return false;
        }
        return true;
    }

    private final int getControlsCardHeight() {
        return C72453Mb.A0I(this.A09);
    }

    /* access modifiers changed from: private */
    public final C39351sv getFloatingViewMargins() {
        return (C39351sv) this.A0C.getValue();
    }

    private final C39351sv getFocusViewMargins() {
        return (C39351sv) this.A0D.getValue();
    }

    private final C109765dy getGestureListener() {
        return (C109765dy) this.A0E.getValue();
    }

    private final int getMinMargin() {
        return C72453Mb.A0I(this.A0A);
    }

    /* access modifiers changed from: private */
    public final AnonymousClass7DJ getUserActionListener() {
        return (AnonymousClass7DJ) this.A0F.getValue();
    }

    /* access modifiers changed from: private */
    public final void setListeners(C1605188u r4) {
        CIZ ciz;
        if (r4 instanceof AnonymousClass7DM) {
            C26281Cwc A012 = C26281Cwc.A01(this, this.A0B);
            A012.A05 = (int) (((float) A012.A05) * (1.0f / 1.0f));
            this.A00 = A012;
            ciz = C108965cb.A0C(getContext(), getGestureListener());
        } else {
            ciz = null;
            this.A00 = null;
        }
        this.A08 = ciz;
    }

    public final Object generatedComponent() {
        AnonymousClass031 r0 = this.A04;
        if (r0 == null) {
            r0 = AnonymousClass3MW.A0u(this);
            this.A04 = r0;
        }
        return r0.generatedComponent();
    }

    public final C1409473r getFloatingViewManager() {
        C1409473r r0 = this.A02;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("floatingViewManager");
        throw null;
    }

    public final C131136kZ getStateHolder() {
        C131136kZ r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("stateHolder");
        throw null;
    }

    public final C125666bS getStatusBarHeightPx() {
        C125666bS r0 = this.A01;
        if (r0 != null) {
            return r0;
        }
        C18070vi.A11("statusBarHeightPx");
        throw null;
    }

    public final C29051bX getTransitions() {
        C29051bX r3 = new C29051bX();
        AnonymousClass1LG r0 = new AnonymousClass1LG();
        r0.A0E(this);
        r3.A0a(r0);
        View A082 = getFloatingViewManager().A08();
        if (A082 != null) {
            BMV bmv = new BMV();
            bmv.A0E(A082);
            r3.A0a(bmv);
            AnonymousClass1LG r02 = new AnonymousClass1LG();
            r02.A0E(A082);
            r3.A0a(r02);
        }
        AnonymousClass1LG r1 = new AnonymousClass1LG();
        ArrayList arrayList = r1.A0E;
        if (arrayList == null) {
            arrayList = AnonymousClass000.A13();
            r1.A0E = arrayList;
        }
        arrayList.add("transition_target_floating_view");
        r3.A0a(r1);
        AnonymousClass1LG r12 = new AnonymousClass1LG();
        ArrayList arrayList2 = r12.A0E;
        if (arrayList2 == null) {
            arrayList2 = AnonymousClass000.A13();
            r12.A0E = arrayList2;
        }
        arrayList2.add("transition_target_floating_view");
        r3.A0a(r12);
        return r3;
    }

    public final void setBehaviorForArEffects(boolean z) {
        C122686Ri r0;
        if (!z) {
            r0 = C122686Ri.CONTROLS_SHOWN;
        } else if (!AnonymousClass000.A1Y(getStateHolder().A0H.getValue())) {
            r0 = C122686Ri.AR_EFFECT_SELF_FLOATING;
        } else {
            r0 = C122686Ri.AR_EFFECT_PEER_FLOATING;
        }
        setBehavior(r0);
    }

    private final void A02() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
            layoutParams2.removeRule(3);
            layoutParams2.removeRule(2);
            layoutParams2.topMargin = 0;
            layoutParams2.bottomMargin = 0;
            setLayoutParams(layoutParams2);
            return;
        }
        throw AnonymousClass000.A0s("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
    }

    private final void A03(int i) {
        if (getFloatingViewManager().A0D) {
            A02();
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.bottomMargin = C72453Mb.A0I(this.A09);
                setLayoutParams(marginLayoutParams);
                return;
            }
            throw AnonymousClass000.A0s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        getFloatingViewMargins().A03 = C72453Mb.A0I(this.A0A) + i;
        A04(2131428733, 2131428657);
    }

    private final void A04(int i, int i2) {
        if (getLayoutParams() instanceof RelativeLayout.LayoutParams) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams != null) {
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.addRule(3, i);
                layoutParams2.addRule(2, i2);
                layoutParams2.topMargin = 0;
                layoutParams2.bottomMargin = 0;
                setLayoutParams(layoutParams2);
                return;
            }
            throw AnonymousClass000.A0s("null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        }
    }

    public static final void A05(FloatingViewDraggableContainer floatingViewDraggableContainer) {
        C1409473r floatingViewManager = floatingViewDraggableContainer.getFloatingViewManager();
        C39351sv floatingViewMargins = floatingViewDraggableContainer.getFloatingViewMargins();
        C18070vi.A0d(floatingViewMargins, 0);
        floatingViewManager.A07 = floatingViewMargins;
        C1409473r floatingViewManager2 = floatingViewDraggableContainer.getFloatingViewManager();
        C39351sv focusViewMargins = floatingViewDraggableContainer.getFocusViewMargins();
        C18070vi.A0d(focusViewMargins, 0);
        floatingViewManager2.A08 = focusViewMargins;
        AnonymousClass1F9 A002 = AnonymousClass1ZG.A00(floatingViewDraggableContainer);
        if (A002 != null) {
            A002.getLifecycle().A05(new AnonymousClass7A9(floatingViewDraggableContainer));
            AnonymousClass3MX.A1Q(new FloatingViewDraggableContainer$setupOnAttach$1(A002, floatingViewDraggableContainer, (C30391dr) null), AnonymousClass3MZ.A0H(A002));
        }
    }

    private final View getFloatingView() {
        return getFloatingViewManager().A08();
    }

    public void computeScroll() {
        super.computeScroll();
        C26281Cwc cwc = this.A00;
        if (cwc != null && cwc.A0F()) {
            postInvalidateOnAnimation();
        }
    }

    public final boolean getShouldShowDimBg() {
        CallInfo BO3;
        CallState callState;
        C131136kZ stateHolder = getStateHolder();
        boolean z = true;
        if (!AnonymousClass000.A1Y(stateHolder.A0H.getValue()) && ((BO3 = stateHolder.A05.BO3()) == null || (callState = BO3.callState) == null || !AnonymousClass72U.A03(callState))) {
            z = false;
        }
        return !z;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        View A082;
        super.onLayout(z, i, i2, i3, i4);
        C1409473r floatingViewManager = getFloatingViewManager();
        if (floatingViewManager.A09 || z) {
            floatingViewManager.A09();
            floatingViewManager.A09 = false;
        }
        AnonymousClass6T0 r1 = floatingViewManager.A06;
        C116215wd r5 = C116215wd.A00;
        float f = 0.0f;
        if (C18070vi.A18(r1, r5)) {
            View A083 = floatingViewManager.A08();
            if (A083 != null) {
                Rect rect = floatingViewManager.A03;
                if (rect != null) {
                    f = (float) rect.width();
                }
                A083.setTranslationX(f * ((float) C108975cc.A0m(AnonymousClass3MW.A1Z(floatingViewManager.A0F) ? 1 : 0)));
            }
        } else if (C18070vi.A18(r1, C116195wb.A00) && (A082 = floatingViewManager.A08()) != null) {
            A082.setAlpha(0.0f);
        }
        View A084 = floatingViewManager.A08();
        if (A084 != null) {
            int i5 = floatingViewManager.A00;
            A084.layout(i5, floatingViewManager.A02, floatingViewManager.A05() + i5, floatingViewManager.A02 + C1409473r.A00(floatingViewManager));
        }
        AnonymousClass6T0 r3 = floatingViewManager.A06;
        if (C18070vi.A18(r3, r5)) {
            C1409473r.A04(floatingViewManager, true);
        } else if (C18070vi.A18(r3, C116195wb.A00)) {
            C1409473r.A03(floatingViewManager, true);
        }
        floatingViewManager.A06 = null;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        C131136kZ stateHolder = getStateHolder();
        Point point = new Point(i, i2);
        if (!C18070vi.A18(stateHolder.A01, point)) {
            stateHolder.A01 = point;
            stateHolder.A0C.setValue(point);
        }
    }

    public boolean performClick() {
        super.performClick();
        return true;
    }

    public final void setInTransition(boolean z) {
        this.A06 = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FloatingViewDraggableContainer(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        C18070vi.A0d(context, 1);
    }

    public /* synthetic */ FloatingViewDraggableContainer(Context context, AttributeSet attributeSet, int i, int i2, AnonymousClass1Y1 r7) {
        this(context, AnonymousClass3MZ.A0C(attributeSet, i2), AnonymousClass3MY.A00(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public FloatingViewDraggableContainer(Context context) {
        this(context, (AttributeSet) null, 0);
        C18070vi.A0d(context, 1);
    }
}
