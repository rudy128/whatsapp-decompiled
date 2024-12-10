package androidx.compose.foundation.gestures;

import X.AnonymousClass09X;
import X.AnonymousClass0CQ;
import X.AnonymousClass0Hm;
import X.AnonymousClass0K4;
import X.AnonymousClass0PB;
import X.AnonymousClass1OS;
import X.AnonymousClass4W8;
import X.AnonymousClass4Z4;
import X.C014308l;
import X.C05410Uc;
import X.C05440Uf;
import X.C08470f9;
import X.C10590ia;
import X.C108485bm;
import X.C17210uI;
import X.C17560ur;
import X.C17680v3;
import X.C17690v4;
import X.C18090vk;
import X.C18560wh;
import X.C22821Di;
import X.C25691Pg;
import X.C30391dr;
import X.C36001nB;

public abstract class AbstractDraggableNode extends C014308l implements C17690v4, C17560ur {
    public C17210uI A00;
    public boolean A01;
    public boolean A02;
    public C05410Uc A03;
    public C18090vk A04;
    public C22821Di A05;
    public C36001nB A06;
    public C36001nB A07;
    public final C17680v3 A08;
    public final AnonymousClass0K4 A09 = new AnonymousClass0K4();
    public final C18090vk A0A = new C08470f9(this);
    public final C22821Di A0B = new C10590ia(this);
    public final C108485bm A0C;

    public static final void A09(AbstractDraggableNode abstractDraggableNode) {
        abstractDraggableNode.A02 = true;
        AnonymousClass4Z4.A02((Integer) null, (C18560wh) null, new AbstractDraggableNode$startListeningForEvents$1(abstractDraggableNode, (C30391dr) null), abstractDraggableNode.A0B(), 3);
    }

    public void A0M() {
        this.A02 = false;
        A0R();
    }

    public abstract Object A0O(C30391dr r1, AnonymousClass1OS r2);

    /* JADX WARNING: type inference failed for: r0v6, types: [X.0r0, java.lang.Object] */
    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002b  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x009f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.AnonymousClass07E r9, X.C30391dr r10, X.AnonymousClass1OX r11) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.C07610bT
            if (r0 == 0) goto L_0x00a0
            r4 = r10
            X.0bT r4 = (X.C07610bT) r4
            int r2 = r4.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00a0
            int r2 = r2 - r1
            r4.label = r2
        L_0x0012:
            java.lang.Object r1 = r4.result
            X.1g4 r3 = X.AnonymousClass3F6.A03()
            int r0 = r4.label
            r5 = 3
            r7 = 2
            r6 = 1
            if (r0 == 0) goto L_0x002b
            if (r0 == r6) goto L_0x004c
            if (r0 == r7) goto L_0x0073
            if (r0 != r5) goto L_0x00a7
            X.C30691eM.A01(r1)
        L_0x0028:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x002b:
            X.C30691eM.A01(r1)
            X.0Uc r2 = r8.A03
            if (r2 == 0) goto L_0x004a
            X.0uI r1 = r8.A00
            if (r1 == 0) goto L_0x004a
            X.0Uf r0 = new X.0Uf
            r0.<init>(r2)
            r4.L$0 = r8
            r4.L$1 = r11
            r4.L$2 = r9
            r4.label = r6
            java.lang.Object r0 = r1.BJs(r0, r4)
            if (r0 != r3) goto L_0x004a
            return r3
        L_0x004a:
            r2 = r8
            goto L_0x0059
        L_0x004c:
            java.lang.Object r9 = r4.L$2
            X.07E r9 = (X.AnonymousClass07E) r9
            java.lang.Object r11 = r4.L$1
            java.lang.Object r2 = r4.L$0
            androidx.compose.foundation.gestures.AbstractDraggableNode r2 = (androidx.compose.foundation.gestures.AbstractDraggableNode) r2
            X.C30691eM.A01(r1)
        L_0x0059:
            X.0Uc r0 = new X.0Uc
            r0.<init>()
            X.0uI r1 = r2.A00
            if (r1 == 0) goto L_0x0084
            r4.L$0 = r2
            r4.L$1 = r11
            r4.L$2 = r9
            r4.L$3 = r0
            r4.label = r7
            java.lang.Object r1 = r1.BJs(r0, r4)
            if (r1 != r3) goto L_0x0084
            return r3
        L_0x0073:
            java.lang.Object r0 = r4.L$3
            X.0Uc r0 = (X.C05410Uc) r0
            java.lang.Object r9 = r4.L$2
            X.07E r9 = (X.AnonymousClass07E) r9
            java.lang.Object r11 = r4.L$1
            java.lang.Object r2 = r4.L$0
            androidx.compose.foundation.gestures.AbstractDraggableNode r2 = (androidx.compose.foundation.gestures.AbstractDraggableNode) r2
            X.C30691eM.A01(r1)
        L_0x0084:
            r2.A03 = r0
            X.1nB r2 = r2.A06
            long r0 = r9.A00
            X.0QY r1 = X.AnonymousClass000.A0e(r0)
            r0 = 0
            r4.L$0 = r0
            r4.L$1 = r0
            r4.L$2 = r0
            r4.L$3 = r0
            r4.label = r5
            java.lang.Object r0 = r2.invoke(r11, r1, r4)
            if (r0 != r3) goto L_0x0028
            return r3
        L_0x00a0:
            X.0bT r4 = new X.0bT
            r4.<init>(r8, r10)
            goto L_0x0012
        L_0x00a7:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractDraggableNode.A03(X.07E, X.1dr, X.1OX):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0071 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(X.AnonymousClass07F r9, X.C30391dr r10, X.AnonymousClass1OX r11) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof X.AnonymousClass0bP
            if (r0 == 0) goto L_0x0072
            r5 = r10
            X.0bP r5 = (X.AnonymousClass0bP) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0072
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r1 = r5.result
            X.1g4 r4 = X.AnonymousClass3F6.A03()
            int r0 = r5.label
            r6 = 2
            r7 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0029
            if (r0 == r7) goto L_0x004c
            if (r0 != r6) goto L_0x0078
            X.C30691eM.A01(r1)
        L_0x0026:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0029:
            X.C30691eM.A01(r1)
            X.0Uc r2 = r8.A03
            if (r2 == 0) goto L_0x004a
            X.0uI r1 = r8.A00
            if (r1 == 0) goto L_0x0048
            X.0Ug r0 = new X.0Ug
            r0.<init>(r2)
            r5.L$0 = r8
            r5.L$1 = r11
            r5.L$2 = r9
            r5.label = r7
            java.lang.Object r0 = r1.BJs(r0, r5)
            if (r0 != r4) goto L_0x0048
            return r4
        L_0x0048:
            r0 = r8
            goto L_0x0059
        L_0x004a:
            r0 = r8
            goto L_0x005b
        L_0x004c:
            java.lang.Object r9 = r5.L$2
            X.07F r9 = (X.AnonymousClass07F) r9
            java.lang.Object r11 = r5.L$1
            java.lang.Object r0 = r5.L$0
            androidx.compose.foundation.gestures.AbstractDraggableNode r0 = (androidx.compose.foundation.gestures.AbstractDraggableNode) r0
            X.C30691eM.A01(r1)
        L_0x0059:
            r0.A03 = r3
        L_0x005b:
            X.1nB r2 = r0.A07
            long r0 = r9.A00
            X.CuU r0 = X.C26199CuU.A01(r0)
            r5.L$0 = r3
            r5.L$1 = r3
            r5.L$2 = r3
            r5.label = r6
            java.lang.Object r0 = r2.invoke(r11, r0, r5)
            if (r0 != r4) goto L_0x0026
            return r4
        L_0x0072:
            X.0bP r5 = new X.0bP
            r5.<init>(r8, r10)
            goto L_0x0012
        L_0x0078:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractDraggableNode.A04(X.07F, X.1dr, X.1OX):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A05(X.C30391dr r9, X.AnonymousClass1OX r10) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C07520bH
            if (r0 == 0) goto L_0x006e
            r5 = r9
            X.0bH r5 = (X.C07520bH) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006e
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r1 = r5.result
            X.1g4 r4 = X.AnonymousClass3F6.A03()
            int r0 = r5.label
            r6 = 2
            r7 = 1
            r3 = 0
            if (r0 == 0) goto L_0x0033
            if (r0 == r7) goto L_0x0029
            if (r0 != r6) goto L_0x0074
            X.C30691eM.A01(r1)
        L_0x0026:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x0029:
            java.lang.Object r10 = r5.L$1
            java.lang.Object r0 = r5.L$0
            androidx.compose.foundation.gestures.AbstractDraggableNode r0 = (androidx.compose.foundation.gestures.AbstractDraggableNode) r0
            X.C30691eM.A01(r1)
            goto L_0x0053
        L_0x0033:
            X.C30691eM.A01(r1)
            X.0Uc r2 = r8.A03
            if (r2 == 0) goto L_0x0050
            X.0uI r1 = r8.A00
            if (r1 == 0) goto L_0x0052
            X.0Uf r0 = new X.0Uf
            r0.<init>(r2)
            r5.L$0 = r8
            r5.L$1 = r10
            r5.label = r7
            java.lang.Object r0 = r1.BJs(r0, r5)
            if (r0 != r4) goto L_0x0052
            return r4
        L_0x0050:
            r0 = r8
            goto L_0x0055
        L_0x0052:
            r0 = r8
        L_0x0053:
            r0.A03 = r3
        L_0x0055:
            X.1nB r2 = r0.A07
            long r0 = X.C26199CuU.A01
            long r0 = X.C7C.A00()
            X.CuU r0 = X.C26199CuU.A01(r0)
            r5.L$0 = r3
            r5.L$1 = r3
            r5.label = r6
            java.lang.Object r0 = r2.invoke(r10, r0, r5)
            if (r0 != r4) goto L_0x0026
            return r4
        L_0x006e:
            X.0bH r5 = new X.0bH
            r5.<init>(r8, r9)
            goto L_0x0012
        L_0x0074:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.AbstractDraggableNode.A05(X.1dr, X.1OX):java.lang.Object");
    }

    public final void A0R() {
        C05410Uc r2 = this.A03;
        if (r2 != null) {
            C17210uI r1 = this.A00;
            if (r1 != null) {
                r1.CPx(new C05440Uf(r2));
            }
            this.A03 = null;
        }
    }

    /* renamed from: Bnm */
    public void CA7() {
        this.A08.Bnm();
    }

    public void C0v(AnonymousClass0Hm r2, AnonymousClass0CQ r3, long j) {
        this.A08.C0v(r2, r3, j);
    }

    public AbstractDraggableNode(C17210uI r3, C18090vk r4, C22821Di r5, C36001nB r6, C36001nB r7, boolean z) {
        this.A05 = r5;
        this.A01 = z;
        this.A00 = r3;
        this.A04 = r4;
        this.A06 = r6;
        this.A07 = r7;
        AnonymousClass09X A022 = AnonymousClass0PB.A02(new AbstractDraggableNode$pointerInputNode$1(this, (C30391dr) null));
        A0N(A022);
        this.A08 = A022;
        this.A0C = AnonymousClass4W8.A01(C25691Pg.SUSPEND, Integer.MAX_VALUE);
    }

    public final C18090vk A0P() {
        return this.A04;
    }

    public final C22821Di A0Q() {
        return this.A05;
    }

    public /* synthetic */ boolean Bdj() {
        return false;
    }

    public /* synthetic */ boolean CLc() {
        return false;
    }

    public final void A0S(C18090vk r1) {
        this.A04 = r1;
    }

    public final void A0T(C22821Di r1) {
        this.A05 = r1;
    }

    public final void A0U(C36001nB r1) {
        this.A06 = r1;
    }

    public final void A0V(C36001nB r1) {
        this.A07 = r1;
    }
}
