package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewStub;
import com.whatsapp.updates.ui.UpdatesFragment;
import java.lang.ref.WeakReference;

/* renamed from: X.73S  reason: invalid class name */
public final class AnonymousClass73S {
    public C1603087y A00;
    public final View A01;
    public final C32741hg A02;
    public final UpdatesFragment A03;
    public final C30141dS A04;
    public final AnonymousClass00H A05 = C217517g.A00(32774);
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final C18100vl A0A = AnonymousClass1DF.A01(new C153487pb(this));
    public final C18100vl A0B = AnonymousClass1DF.A01(new C153497pc(this));
    public final C18100vl A0C = AnonymousClass1DF.A01(new C153507pd(this));
    public final C18100vl A0D = AnonymousClass1DF.A01(new C153517pe(this));
    public final C18100vl A0E = AnonymousClass1DF.A01(new C153527pf(this));
    public final boolean A0F;

    public AnonymousClass73S(View view, C1603087y r3, C32741hg r4, UpdatesFragment updatesFragment, C30141dS r6, AnonymousClass00H r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, boolean z) {
        C18070vi.A0g(r6, 4, r7);
        C18070vi.A0q(r8, r9, r10);
        C18070vi.A0d(r4, 9);
        this.A01 = view;
        this.A00 = r3;
        this.A03 = updatesFragment;
        this.A04 = r6;
        this.A06 = r7;
        this.A09 = r8;
        this.A07 = r9;
        this.A08 = r10;
        this.A02 = r4;
        this.A0F = z;
        A04(this.A00);
    }

    public static final View A00(AnonymousClass73S r1, Integer num, int i, int i2) {
        View view = r1.A01;
        ViewStub A0F2 = AnonymousClass3MW.A0F(view, i);
        if (A0F2 == null) {
            return C18070vi.A05(view, i2);
        }
        View A0G = AnonymousClass3MY.A0G(A0F2, num.intValue());
        A0G.setVisibility(8);
        return A0G;
    }

    public static final AnonymousClass86B A01(AnonymousClass73S r4) {
        AnonymousClass86B r1;
        int ordinal = AnonymousClass72B.A01(r4.A06).ordinal();
        if (ordinal == 1) {
            C18100vl r42 = r4.A0D;
            r1 = new C146307Op(AnonymousClass3MW.A0A(r42), C18070vi.A05(AnonymousClass3MW.A0A(r42), 2131429727), C18070vi.A05(AnonymousClass3MW.A0A(r42), 2131435701));
        } else if (ordinal == 2 || ordinal == 3) {
            C18100vl r43 = r4.A0B;
            r1 = new C146297Oo(AnonymousClass3MW.A0A(r43), AnonymousClass3Ma.A0C(AnonymousClass3MW.A0A(r43), 2131429727), AnonymousClass3Ma.A0C(AnonymousClass3MW.A0A(r43), 2131429728));
        } else if (ordinal == 0) {
            C17960vV.A0F(false, "CrosspostStatusListController/crosspost was not enabled");
            return null;
        } else {
            throw AnonymousClass3MW.A14();
        }
        return r1;
    }

    public static final void A02(AnonymousClass73S r5, C123476Up r6, boolean z) {
        int width;
        long j;
        C18100vl r3 = r5.A0A;
        View A0A2 = AnonymousClass3MW.A0A(r3);
        C89974dK.A00(A0A2, r5, 34);
        C89974dK.A00(C18070vi.A05(A0A2, 2131429132), r5, 35);
        boolean z2 = r6.A04;
        AnonymousClass00H r0 = r5.A05;
        if (z2) {
            C138856xo r52 = (C138856xo) r0.get();
            View A0A3 = AnonymousClass3MW.A0A(r3);
            C18070vi.A0d(A0A3, 0);
            if (A0A3.getVisibility() == 0 && A0A3.getHeight() == C138856xo.A01) {
                C138856xo.A00(r52);
                return;
            }
            WeakReference weakReference = C138856xo.A02;
            if (weakReference == null || weakReference.get() != A0A3) {
                C138856xo.A02 = AnonymousClass3MW.A0z(A0A3);
                int visibility = A0A3.getVisibility();
                int i = A0A3.getLayoutParams().height;
                A0A3.setVisibility(0);
                A0A3.getLayoutParams().height = -2;
                if (A0A3.getParent() == null) {
                    width = A0A3.getWidth();
                } else {
                    width = C72463Mc.A0L(A0A3).getWidth();
                }
                C108985cd.A10(A0A3, width, Integer.MIN_VALUE);
                C138856xo.A01 = A0A3.getMeasuredHeight();
                A0A3.setVisibility(visibility);
                AnonymousClass3MX.A1F(A0A3, i);
            }
            int i2 = C138856xo.A01;
            C109195cy r02 = new C109195cy(A0A3, 34);
            C138856xo.A00(r52);
            ValueAnimator A0B2 = C108995ce.A0B(0, i2);
            r52.A00 = A0B2;
            if (A0B2 != null) {
                C109005cf.A0I(r02, A0B2);
                C1411074h.A00(A0B2, A0A3, 26);
                if (z) {
                    j = 1400;
                } else {
                    j = 0;
                }
                A0B2.setStartDelay(j);
                A0B2.start();
                return;
            }
            return;
        }
        ((C138856xo) r0.get()).A01(AnonymousClass3MW.A0A(r3), r6.A03);
    }

    public static final void A03(AnonymousClass73S r5, C123476Up r6, boolean z) {
        long j;
        int i;
        View view;
        C41821x7 r1;
        boolean A062 = C108945cZ.A11(r5.A08).A06(AnonymousClass00R.A0Y);
        boolean z2 = r6.A04;
        if (!A062) {
            C18100vl r12 = r5.A0D;
            if (r12.Bf6() && AnonymousClass3MW.A0A(r12).getVisibility() == 0) {
                C72453Mb.A1U(r12, 8);
            }
            C30141dS r13 = r5.A04;
            if (C72453Mb.A1X(r13.A02)) {
                if (C18020vd.A05(C18040vf.A01, r13.A01, 10404)) {
                    C72453Mb.A1U(r5.A0E, 8);
                    return;
                }
            }
            r1 = C108945cZ.A12(r5.A09);
            view = AnonymousClass3MW.A0A(r5.A0E);
            j = C108995ce.A0A(r5.A02);
            i = 2;
        } else {
            C18100vl r14 = r5.A0E;
            if (r14.Bf6() && AnonymousClass3MW.A0A(r14).getVisibility() == 0) {
                C108965cb.A1N(r14.getValue());
            }
            r1 = C108945cZ.A12(r5.A09);
            view = AnonymousClass3MW.A0A(r5.A0D);
            j = C108995ce.A0A(r5.A02);
            i = 1;
        }
        r1.A03(view, i, j, z2, z);
    }

    public final void A04(C1603087y r6) {
        C123476Up BPj;
        this.A00 = r6;
        if (r6 != null && (BPj = r6.BPj()) != null) {
            if (C72453Mb.A1a(this.A0C)) {
                AnonymousClass86B A012 = A01(this);
                if (A012 != null) {
                    ((C139216yQ) this.A07.get()).A01(A012, BPj.A00(), true);
                }
            } else {
                C30141dS r1 = this.A04;
                if (r1.A01() && !C108985cd.A1Y(r1)) {
                    A02(this, BPj, true);
                } else if (r1.A02()) {
                    A03(this, BPj, true);
                }
            }
            if (!this.A0F) {
                C108975cc.A0r(this.A01.findViewById(2131427795));
            }
        }
    }
}
