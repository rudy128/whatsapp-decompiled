package androidx.compose.foundation;

import X.AnonymousClass000;
import X.AnonymousClass0CQ;
import X.AnonymousClass0Hm;
import X.AnonymousClass0XW;
import X.AnonymousClass4Z4;
import X.C05430Ue;
import X.C05470Ui;
import X.C17210uI;
import X.C17690v4;
import X.C18070vi;
import X.C18560wh;
import X.C30391dr;

public final class HoverableNode extends AnonymousClass0XW implements C17690v4 {
    public C17210uI A00;
    public C05430Ue A01;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.0r0, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0N(X.C30391dr r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.AnonymousClass0bG
            if (r0 == 0) goto L_0x004c
            r5 = r7
            X.0bG r5 = (X.AnonymousClass0bG) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x004c
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r4 = r5.result
            X.1g4 r3 = X.AnonymousClass3F6.A03()
            int r0 = r5.label
            r2 = 1
            if (r0 == 0) goto L_0x002f
            if (r0 != r2) goto L_0x0052
            java.lang.Object r1 = r5.L$1
            X.0Ue r1 = (X.C05430Ue) r1
            java.lang.Object r0 = r5.L$0
            androidx.compose.foundation.HoverableNode r0 = (androidx.compose.foundation.HoverableNode) r0
            X.C30691eM.A01(r4)
        L_0x002a:
            r0.A01 = r1
        L_0x002c:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x002f:
            X.C30691eM.A01(r4)
            X.0Ue r0 = r6.A01
            if (r0 != 0) goto L_0x002c
            X.0Ue r1 = new X.0Ue
            r1.<init>()
            X.0uI r0 = r6.A00
            r5.L$0 = r6
            r5.L$1 = r1
            r5.label = r2
            java.lang.Object r0 = r0.BJs(r1, r5)
            if (r0 != r3) goto L_0x004a
            return r3
        L_0x004a:
            r0 = r6
            goto L_0x002a
        L_0x004c:
            X.0bG r5 = new X.0bG
            r5.<init>(r6, r7)
            goto L_0x0012
        L_0x0052:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.HoverableNode.A0N(X.1dr):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A0O(X.C30391dr r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.AnonymousClass0b3
            if (r0 == 0) goto L_0x0047
            r5 = r7
            X.0b3 r5 = (X.AnonymousClass0b3) r5
            int r2 = r5.label
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0047
            int r2 = r2 - r1
            r5.label = r2
        L_0x0012:
            java.lang.Object r4 = r5.result
            X.1g4 r3 = X.AnonymousClass3F6.A03()
            int r0 = r5.label
            r2 = 1
            if (r0 == 0) goto L_0x002c
            if (r0 != r2) goto L_0x004d
            java.lang.Object r1 = r5.L$0
            androidx.compose.foundation.HoverableNode r1 = (androidx.compose.foundation.HoverableNode) r1
            X.C30691eM.A01(r4)
        L_0x0026:
            r0 = 0
            r1.A01 = r0
        L_0x0029:
            X.1Wu r0 = X.C27621Wu.A00
            return r0
        L_0x002c:
            X.C30691eM.A01(r4)
            X.0Ue r0 = r6.A01
            if (r0 == 0) goto L_0x0029
            X.0Ui r1 = new X.0Ui
            r1.<init>(r0)
            X.0uI r0 = r6.A00
            r5.L$0 = r6
            r5.label = r2
            java.lang.Object r0 = r0.BJs(r1, r5)
            if (r0 != r3) goto L_0x0045
            return r3
        L_0x0045:
            r1 = r6
            goto L_0x0026
        L_0x0047:
            X.0b3 r5 = new X.0b3
            r5.<init>(r6, r7)
            goto L_0x0012
        L_0x004d:
            java.lang.IllegalStateException r0 = X.AnonymousClass000.A0l()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.HoverableNode.A0O(X.1dr):java.lang.Object");
    }

    /* renamed from: A0P */
    public final void CA7() {
        C05430Ue r0 = this.A01;
        if (r0 != null) {
            this.A00.CPx(new C05470Ui(r0));
            this.A01 = null;
        }
    }

    public final void A0Q(C17210uI r2) {
        if (!C18070vi.A18(this.A00, r2)) {
            CA7();
            this.A00 = r2;
        }
    }

    public void C0v(AnonymousClass0Hm r5, AnonymousClass0CQ r6, long j) {
        if (r6 == AnonymousClass0CQ.Main) {
            int i = r5.A00;
            if (AnonymousClass000.A1T(i, 4)) {
                AnonymousClass4Z4.A02((Integer) null, (C18560wh) null, new HoverableNode$onPointerEvent$1(this, (C30391dr) null), A0B(), 3);
            } else if (i == 5) {
                AnonymousClass4Z4.A02((Integer) null, (C18560wh) null, new HoverableNode$onPointerEvent$2(this, (C30391dr) null), A0B(), 3);
            }
        }
    }

    public void A0M() {
        CA7();
    }

    public /* synthetic */ boolean Bdj() {
        return false;
    }

    public void Bnm() {
        CA7();
    }

    public /* synthetic */ boolean CLc() {
        return false;
    }
}
