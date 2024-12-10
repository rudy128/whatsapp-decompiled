package X;

import androidx.compose.foundation.ScrollingLayoutElement;
import androidx.compose.foundation.gestures.ScrollableElement;
import androidx.compose.foundation.gestures.ScrollableKt;

/* renamed from: X.0pm  reason: invalid class name and case insensitive filesystem */
public final class C14910pm extends AnonymousClass11G implements C36001nB {
    public final /* synthetic */ C16080rg $flingBehavior;
    public final /* synthetic */ boolean $isScrollable;
    public final /* synthetic */ boolean $isVertical = true;
    public final /* synthetic */ boolean $reverseScrolling = false;
    public final /* synthetic */ C05400Ua $state;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14910pm(C05400Ua r4) {
        super(3);
        this.$state = r4;
        this.$isScrollable = true;
        this.$flingBehavior = null;
    }

    public final C17090tj A00(C17130tn r15) {
        AnonymousClass0CI r9;
        C17090tj r1;
        r15.COB(1478351300);
        AnonymousClass0t9 A00 = AnonymousClass0L2.A00(r15);
        Object A1C = AnonymousClass001.A1C(r15, 773894976);
        if (A1C == AnonymousClass0MH.A00) {
            A1C = new C05710Vk(AnonymousClass0QC.A00(r15, AnonymousClass1OR.A00));
            r15.CRH(A1C);
        }
        AnonymousClass0VR r0 = (AnonymousClass0VR) r15;
        AnonymousClass0VR.A0R(r0, false);
        AnonymousClass1OX A002 = ((C05710Vk) A1C).A00();
        AnonymousClass0VR.A0R(r0, false);
        AnonymousClass0WC r12 = C17090tj.A00;
        boolean z = this.$reverseScrolling;
        boolean z2 = this.$isVertical;
        C17090tj A01 = AnonymousClass0PD.A02(r12, new C11430k1(this.$state, A002, z, z2, this.$isScrollable), false);
        if (z2) {
            r9 = AnonymousClass0CI.Vertical;
        } else {
            r9 = AnonymousClass0CI.Horizontal;
        }
        boolean z3 = this.$reverseScrolling;
        boolean A012 = AnonymousClass0L2.A01(r9, (C24246By4) AnonymousClass000.A0t(r15), z3);
        C05400Ua r10 = this.$state;
        C17210uI r11 = r10.A02;
        boolean z4 = this.$isScrollable;
        C16080rg r8 = this.$flingBehavior;
        C17010ta r7 = AnonymousClass0MN.A01;
        C22821Di r13 = ScrollableKt.A04;
        ScrollableElement scrollableElement = new ScrollableElement(A00, r7, r8, r9, r10, r11, z4, A012);
        ScrollingLayoutElement scrollingLayoutElement = new ScrollingLayoutElement(r10, z3, this.$isVertical);
        if (r9 == AnonymousClass0CI.Vertical) {
            r1 = AnonymousClass0GQ.A01;
        } else {
            r1 = AnonymousClass0GQ.A00;
        }
        C17090tj CP5 = A01.CP5(r1).CP5(A00.BR8()).CP5(scrollableElement).CP5(scrollingLayoutElement);
        AnonymousClass0VR.A0R(r0, false);
        return CP5;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return A00(AnonymousClass000.A0b(obj2, obj3));
    }
}
