package X;

import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.0Ab  reason: invalid class name and case insensitive filesystem */
public final class C01830Ab extends C06070Wv {
    public final /* synthetic */ AnonymousClass0VQ A00;
    public final /* synthetic */ AnonymousClass1OS A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C01830Ab(AnonymousClass0VQ r2, AnonymousClass1OS r3) {
        super("Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.");
        this.A00 = r2;
        this.A01 = r3;
    }

    public C16820tH BjZ(C17530uo r9, List list, long j) {
        C16820tH r4;
        int i;
        int i2;
        AnonymousClass0VQ r3 = this.A00;
        AnonymousClass0XQ A02 = r3.A0C;
        A02.A02(r9.getLayoutDirection());
        A02.A00(r9.BQU());
        A02.A01(r9.BRu());
        if (r9.BfO() || r3.A07.A07 == null) {
            r3.A00 = 0;
            r4 = (C16820tH) this.A01.invoke(A02, Constraints.A05(j));
            i = r3.A00;
            i2 = 1;
        } else {
            r3.A01 = 0;
            r4 = (C16820tH) this.A01.invoke(r3.A0B, Constraints.A05(j));
            i = r3.A01;
            i2 = 0;
        }
        return new AnonymousClass0XE(r3, r4, r4, i, i2);
    }
}
