package X;

import androidx.compose.foundation.gestures.AbstractDraggableNode;
import androidx.compose.foundation.gestures.DragGestureDetectorKt;
import androidx.compose.foundation.gestures.DraggableKt;
import androidx.compose.foundation.gestures.DraggableNode$drag$2;

/* renamed from: X.07C  reason: invalid class name */
public final class AnonymousClass07C extends AbstractDraggableNode {
    public C16060re A00 = DraggableKt.A00;
    public AnonymousClass0CI A01;
    public C16070rf A02;
    public final AnonymousClass0UO A03 = new AnonymousClass0UO(this);
    public final C16600sh A04;

    public AnonymousClass07C(C16070rf r9, AnonymousClass0CI r10, C17210uI r11, C18090vk r12, C22821Di r13, C36001nB r14, C36001nB r15, boolean z) {
        super(r11, r12, r13, r14, r15, z);
        C16600sh r0;
        this.A02 = r9;
        this.A01 = r10;
        if (r10 == AnonymousClass0CI.Vertical) {
            r0 = DragGestureDetectorKt.A03;
        } else {
            r0 = DragGestureDetectorKt.A02;
        }
        this.A04 = r0;
    }

    public Object A0O(C30391dr r5, AnonymousClass1OS r6) {
        Object BJG = this.A02.BJG(AnonymousClass0CH.UserInput, r5, new DraggableNode$drag$2(this, (C30391dr) null, r6));
        if (BJG != AnonymousClass3F6.A03()) {
            return C27621Wu.A00;
        }
        return BJG;
    }

    public final void A0W(C16070rf r4, AnonymousClass0CI r5, C17210uI r6, C18090vk r7, C22821Di r8, C36001nB r9, C36001nB r10, boolean z) {
        boolean z2;
        boolean z3 = true;
        if (!C18070vi.A18(this.A02, r4)) {
            this.A02 = r4;
            z2 = true;
        } else {
            z2 = false;
        }
        A0T(r8);
        if (this.A01 != r5) {
            this.A01 = r5;
            z2 = true;
        }
        if (this.A01 != z) {
            this.A01 = z;
            if (!z) {
                A0R();
            }
        } else {
            z3 = z2;
        }
        if (!C18070vi.A18(this.A00, r6)) {
            A0R();
            this.A00 = r6;
        }
        A0S(r7);
        A0U(r9);
        A0V(r10);
        if (z3) {
            this.A08.CFk();
        }
    }
}
