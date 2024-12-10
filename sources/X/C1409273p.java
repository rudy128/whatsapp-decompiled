package X;

import android.animation.TimeInterpolator;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.whatsapp.calling.callgrid.view.CallGrid;
import com.whatsapp.calling.controls.view.CallControlCard;
import com.whatsapp.calling.floatingview.ui.FloatingViewDraggableContainer;
import com.whatsapp.calling.header.ui.CallScreenHeaderView;
import com.whatsapp.voipcalling.CallInfo;
import com.whatsapp.voipcalling.CallState;
import java.lang.ref.WeakReference;

/* renamed from: X.73p  reason: invalid class name and case insensitive filesystem */
public final class C1409273p {
    public static final C18100vl A0D = AnonymousClass1DF.A01(C157357wn.A00);
    public static final C18100vl A0E = AnonymousClass1DF.A01(C157367wo.A00);
    public WeakReference A00;
    public boolean A01;
    public final CallGrid A02;
    public final CallControlCard A03;
    public final CallScreenHeaderView A04;
    public final C28931bI A05;
    public final C28931bI A06;
    public final C28931bI A07;
    public final C28931bI A08;
    public final C18140vp A09;
    public final boolean A0A;
    public final C115065tL A0B;
    public final AnonymousClass11C A0C;

    public C1409273p(CallGrid callGrid, CallControlCard callControlCard, CallScreenHeaderView callScreenHeaderView, C115065tL r5, AnonymousClass11C r6, C28931bI r7, C28931bI r8, C28931bI r9, C28931bI r10, C18140vp r11, boolean z) {
        C18070vi.A0d(callControlCard, 1);
        C72473Md.A1M(callGrid, r7, r8, 3);
        C18070vi.A0x(r6, r5, r9, r10, r11);
        this.A03 = callControlCard;
        this.A04 = callScreenHeaderView;
        this.A02 = callGrid;
        this.A06 = r7;
        this.A05 = r8;
        this.A0C = r6;
        this.A0B = r5;
        this.A07 = r9;
        this.A08 = r10;
        this.A09 = r11;
        this.A0A = z;
    }

    public final boolean A05(C18030ve r4, CallInfo callInfo, int i) {
        C18070vi.A0d(r4, 2);
        if (callInfo == null) {
            return false;
        }
        if (!(i == 1 || i == 0)) {
            if (!callInfo.videoEnabled || callInfo.isSelfRequestingUpgrade() || callInfo.isPeerRequestingUpgrade() || callInfo.callState != CallState.ACTIVE) {
                return false;
            }
            if ((!callInfo.isCallOnHold() || !C18020vd.A05(C18040vf.A02, r4, 12603)) && !C108965cb.A1X(this.A0C)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static final void A00(C29051bX r16, C1409273p r17, long j, boolean z, boolean z2) {
        TimeInterpolator timeInterpolator;
        AnonymousClass1LI r11;
        C122686Ri r0;
        boolean z3 = z;
        if (z) {
            timeInterpolator = (DecelerateInterpolator) A0E.getValue();
        } else {
            timeInterpolator = (AccelerateInterpolator) A0D.getValue();
        }
        TimeInterpolator timeInterpolator2 = timeInterpolator;
        AnonymousClass1LI r10 = new AnonymousClass1LI(80);
        long j2 = j;
        r10.A0C(j2);
        long j3 = 0;
        r10.A01 = 0;
        r10.A0D(timeInterpolator2);
        C1409273p r15 = r17;
        CallControlCard callControlCard = r15.A03;
        r10.A0E(callControlCard);
        C29071bZ r9 = new C29071bZ(C72453Mb.A04(z3 ? 1 : 0));
        r9.A01 = 0;
        r9.A0C(125);
        r9.A0D(timeInterpolator2);
        CallScreenHeaderView callScreenHeaderView = r15.A04;
        if (callScreenHeaderView != null) {
            r9.A0E(callScreenHeaderView);
        }
        r9.A0E(callControlCard);
        if (callScreenHeaderView == null) {
            r11 = null;
        } else {
            r11 = new AnonymousClass1LI(48);
            r11.A01 = 0;
            r11.A0C(j2);
            r11.A0D(timeInterpolator2);
            r11.A0E(callScreenHeaderView);
        }
        AnonymousClass1LG r7 = new AnonymousClass1LG();
        if (z) {
            j3 = j / 2;
        }
        r7.A01 = j3;
        r7.A0C(j / 2);
        r7.A0D(timeInterpolator2);
        C28931bI r3 = r15.A0B.A00;
        View view = r3.A01;
        if (view == null) {
            view = AnonymousClass3MX.A0D(r3);
        }
        r7.A0E(view);
        C29051bX r4 = new C29051bX();
        int i = 0;
        r4.A03 = true;
        r4.A0a(r9);
        r4.A0a(r10);
        if (r11 != null) {
            r4.A0a(r11);
        }
        C28931bI r92 = r15.A07;
        if (r92.A00 != null) {
            C29051bX transitions = ((FloatingViewDraggableContainer) r92.A02()).getTransitions();
            transitions.A01 = 0;
            transitions.A0W(j2);
            transitions.A0X(timeInterpolator2);
            r4.A0a(transitions);
        }
        C29051bX r2 = r16;
        if (r16 != null) {
            r4.A0a(r2);
        }
        r4.A0a(r7);
        r4.A0Z(new C113755ng(timeInterpolator2, r15, callControlCard.getInCallControlsTop(), j2, z3));
        C29191bl.A02(C108955ca.A0H(callControlCard.getParent()), r4);
        callControlCard.setVisibility(C72453Mb.A07(z3));
        if (callScreenHeaderView != null) {
            callScreenHeaderView.setVisibility(C72453Mb.A07(z3));
        }
        A01(r15, z3);
        if (r92.A00 != null) {
            FloatingViewDraggableContainer floatingViewDraggableContainer = (FloatingViewDraggableContainer) r92.A02();
            if (z2) {
                r0 = C122686Ri.FOCUS;
            } else if (z) {
                r0 = C122686Ri.CONTROLS_SHOWN;
            } else {
                r0 = C122686Ri.CONTROLS_HIDDEN;
            }
            floatingViewDraggableContainer.setBehavior(r0);
            View A0D2 = AnonymousClass3MX.A0D(r15.A08);
            if (!z2) {
                i = 8;
            }
            A0D2.setVisibility(i);
            r15.A02.setIsCallControlsShown(z3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r4 == false) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C1409273p r3, boolean r4) {
        /*
            X.5tL r2 = r3.A0B
            com.whatsapp.calling.header.ui.CallScreenHeaderView r0 = r3.A04
            if (r0 == 0) goto L_0x0009
            r1 = 1
            if (r4 != 0) goto L_0x000a
        L_0x0009:
            r1 = 0
        L_0x000a:
            boolean r0 = r2.A01
            if (r0 == r1) goto L_0x001d
            r2.A01 = r1
            X.1bI r1 = r2.A00
            android.view.View r0 = r1.A00
            if (r0 == 0) goto L_0x001d
            android.view.View r0 = X.AnonymousClass3MX.A0D(r1)
            X.C115065tL.A00(r0, r2)
        L_0x001d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1409273p.A01(X.73p, boolean):void");
    }

    public static final void A02(C1409273p r21, boolean z, boolean z2) {
        int i;
        int i2;
        TimeInterpolator timeInterpolator;
        TimeInterpolator timeInterpolator2;
        long j;
        int i3;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        C1409273p r10 = r21;
        boolean z3 = z;
        if (z) {
            C28931bI r1 = r10.A05;
            if (r1.A00 == null) {
                AnonymousClass3MX.A0D(r1).setVisibility(8);
            }
            C28931bI r12 = r10.A06;
            if (r12.A00 == null) {
                AnonymousClass3MX.A0D(r12).setVisibility(8);
            }
            i2 = 2;
            i = 1;
            timeInterpolator = (AccelerateInterpolator) A0D.getValue();
        } else {
            i = 2;
            i2 = 1;
            timeInterpolator = (DecelerateInterpolator) A0E.getValue();
        }
        TimeInterpolator timeInterpolator3 = timeInterpolator;
        if (z) {
            timeInterpolator2 = (DecelerateInterpolator) A0E.getValue();
        } else {
            timeInterpolator2 = (AccelerateInterpolator) A0D.getValue();
        }
        TimeInterpolator timeInterpolator4 = timeInterpolator2;
        long j2 = 200;
        if (z) {
            j = 200;
            j2 = 250;
        } else {
            j = 250;
        }
        C29071bZ r8 = new C29071bZ(i2);
        r8.A0C(j);
        r8.A01 = 0;
        r8.A0D(timeInterpolator3);
        CallControlCard callControlCard = r10.A03;
        CallControlCard callControlCard2 = callControlCard;
        r8.A0E(callControlCard);
        AnonymousClass1LI r7 = new AnonymousClass1LI(80);
        r7.A0C(j2);
        r7.A01 = 0;
        r7.A0D(timeInterpolator4);
        C28931bI r212 = r10.A06;
        r7.A0E(r212.A02());
        CallScreenHeaderView callScreenHeaderView = r10.A04;
        C29071bZ r2 = null;
        if (callScreenHeaderView != null) {
            r2 = new C29071bZ(i2);
            r2.A0C(j);
            r2.A01 = 0;
            r2.A0D(timeInterpolator3);
            r2.A0E(callScreenHeaderView);
        }
        AnonymousClass1LG r13 = new AnonymousClass1LG();
        r13.A0C(j2);
        r13.A01 = 0;
        r13.A0D(timeInterpolator4);
        C28931bI r20 = r10.A05;
        r13.A0E(r20.A02());
        C29051bX r122 = new C29051bX();
        int i4 = 0;
        r122.A03 = true;
        C28931bI r15 = r10.A07;
        if (r15.A00 != null) {
            C29051bX transitions = ((FloatingViewDraggableContainer) r15.A02()).getTransitions();
            transitions.A01 = 0;
            transitions.A0W(j2);
            transitions.A0X(timeInterpolator4);
            r122.A0a(transitions);
        }
        long j3 = r122.A00;
        C28931bI r6 = r10.A08;
        if (r6.A00 != null) {
            C29071bZ r5 = new C29071bZ(i);
            r5.A0C(j3);
            r5.A01 = 0;
            r5.A0D(timeInterpolator4);
            r122.A0a(r5);
        }
        r122.A0a(r8);
        r122.A0a(r7);
        if (r2 != null) {
            r122.A0a(r2);
        }
        r122.A0a(r13);
        r122.A0Z(new C113765nh(timeInterpolator4, r10, z3));
        if (z2) {
            C29191bl.A02(C108955ca.A0H(callControlCard2.getParent()), r122);
        }
        boolean z4 = !z3;
        callControlCard2.setVisibility(C72453Mb.A07(z4 ? 1 : 0));
        if (callScreenHeaderView != null) {
            callScreenHeaderView.setVisibility(C72453Mb.A07(z4));
        }
        A01(r10, true);
        AnonymousClass3MX.A0D(r212).setVisibility(C72453Mb.A07(z3 ? 1 : 0));
        AnonymousClass3MX.A0D(r20).setVisibility(C72453Mb.A07(z3));
        View A0D2 = AnonymousClass3MX.A0D(r20);
        ViewGroup.LayoutParams layoutParams = A0D2.getLayoutParams();
        if (layoutParams != null) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            if (callScreenHeaderView != null) {
                ViewGroup.LayoutParams layoutParams2 = callScreenHeaderView.getLayoutParams();
                if (!(layoutParams2 instanceof ViewGroup.MarginLayoutParams) || (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams2) == null) {
                    i3 = 0;
                } else {
                    i3 = marginLayoutParams.topMargin;
                }
                marginLayoutParams2.topMargin = Integer.valueOf(i3).intValue();
            }
            A0D2.setLayoutParams(marginLayoutParams2);
            if (r15.A00 != null) {
                ((FloatingViewDraggableContainer) r15.A02()).setBehaviorForArEffects(z3);
                if (r6.A00 != null) {
                    View A0D3 = AnonymousClass3MX.A0D(r6);
                    if (!((FloatingViewDraggableContainer) r15.A02()).getShouldShowDimBg() || !z3) {
                        i4 = 8;
                    }
                    A0D3.setVisibility(i4);
                }
            }
            r10.A02.setIsCallControlsShown(z4);
            return;
        }
        throw AnonymousClass000.A0s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    public static final void A03(C28931bI r1, boolean z) {
        if (r1.A00 != null) {
            ((FloatingViewDraggableContainer) r1.A02()).A06 = z;
        }
    }

    public final boolean A04() {
        C28931bI r1 = this.A07;
        if (r1.A00 == null || ((FloatingViewDraggableContainer) r1.A02()).getFloatingViewManager().A05 != C122686Ri.FOCUS) {
            return false;
        }
        return true;
    }
}
