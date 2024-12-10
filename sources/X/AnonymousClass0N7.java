package X;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.ui.unit.Constraints;
import java.util.List;

/* renamed from: X.0N7  reason: invalid class name */
public final class AnonymousClass0N7 {
    public final long A00;
    public final C17230uK A01;
    public final C17510um A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ int A04;
    public final /* synthetic */ int A05;
    public final /* synthetic */ int A06;
    public final /* synthetic */ long A07;
    public final /* synthetic */ LazyListState A08;
    public final /* synthetic */ C17510um A09;
    public final /* synthetic */ C16330s5 A0A;
    public final /* synthetic */ C16340s6 A0B;
    public final /* synthetic */ boolean A0C;
    public final /* synthetic */ boolean A0D;

    public final AnonymousClass0V0 A00(int i) {
        C17230uK r0 = this.A01;
        return A01(r0.BTi(i), ((AnonymousClass0V1) r0).A01.A00(i), this.A02.BjY(i, this.A00), i);
    }

    public AnonymousClass0V0 A01(Object obj, Object obj2, List list, int i) {
        int i2;
        int i3 = i;
        if (i3 == this.A05 - 1) {
            i2 = 0;
        } else {
            i2 = this.A06;
        }
        boolean z = this.A0C;
        C16330s5 r11 = this.A0A;
        C16340s6 r12 = this.A0B;
        C24246By4 layoutDirection = this.A09.getLayoutDirection();
        boolean z2 = this.A0D;
        int i4 = this.A04;
        int i5 = this.A03;
        boolean z3 = z;
        return new AnonymousClass0V0(this.A08.A0E, r11, r12, layoutDirection, obj, obj2, list, (AnonymousClass1Y1) null, i3, i4, i5, i2, this.A07, z3, z2);
    }

    public AnonymousClass0N7(C17230uK r4, C17510um r5, long j, boolean z) {
        int i;
        int A002;
        this.A01 = r4;
        this.A02 = r5;
        if (z) {
            i = Constraints.A01(j);
            A002 = Integer.MAX_VALUE;
        } else {
            i = Integer.MAX_VALUE;
            A002 = Constraints.A00(j);
        }
        this.A00 = C26229CvL.A02(i, A002, 5);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public AnonymousClass0N7(X.C17230uK r9, androidx.compose.foundation.lazy.LazyListState r10, X.C17510um r11, X.C16330s5 r12, X.C16340s6 r13, int r14, int r15, int r16, int r17, long r18, long r20, boolean r22, boolean r23) {
        /*
            r8 = this;
            r2 = r8
            r7 = r22
            r8.A0C = r7
            r4 = r11
            r8.A09 = r11
            r8.A05 = r14
            r8.A06 = r15
            r8.A0A = r12
            r8.A0B = r13
            r0 = r23
            r8.A0D = r0
            r0 = r16
            r8.A04 = r0
            r0 = r17
            r8.A03 = r0
            r0 = r20
            r8.A07 = r0
            r8.A08 = r10
            r3 = r9
            r5 = r18
            r2.<init>(r3, r4, r5, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass0N7.<init>(X.0uK, androidx.compose.foundation.lazy.LazyListState, X.0um, X.0s5, X.0s6, int, int, int, int, long, long, boolean, boolean):void");
    }
}
