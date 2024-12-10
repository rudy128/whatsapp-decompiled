package X;

import androidx.compose.material3.AppBarKt;
import androidx.compose.ui.unit.Constraints;

/* renamed from: X.0kE  reason: invalid class name and case insensitive filesystem */
public final class C11520kE extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass0XJ $actionIconsPlaceable;
    public final /* synthetic */ long $constraints;
    public final /* synthetic */ int $layoutHeight;
    public final /* synthetic */ AnonymousClass0XJ $navigationIconPlaceable;
    public final /* synthetic */ C17530uo $this_Layout;
    public final /* synthetic */ int $titleBaseline;
    public final /* synthetic */ int $titleBottomPadding;
    public final /* synthetic */ C16120rk $titleHorizontalArrangement;
    public final /* synthetic */ AnonymousClass0XJ $titlePlaceable;
    public final /* synthetic */ C16130rl $titleVerticalArrangement;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11520kE(C16120rk r2, C16130rl r3, C17530uo r4, AnonymousClass0XJ r5, AnonymousClass0XJ r6, AnonymousClass0XJ r7, int i, int i2, int i3, long j) {
        super(1);
        this.$navigationIconPlaceable = r5;
        this.$layoutHeight = i;
        this.$titlePlaceable = r6;
        this.$titleHorizontalArrangement = r2;
        this.$constraints = j;
        this.$actionIconsPlaceable = r7;
        this.$this_Layout = r4;
        this.$titleVerticalArrangement = r3;
        this.$titleBottomPadding = i2;
        this.$titleBaseline = i3;
    }

    public final void A00(AnonymousClass0QZ r7) {
        int max;
        int i;
        C18070vi.A0d(r7, 0);
        AnonymousClass0XJ r2 = this.$navigationIconPlaceable;
        r7.A0B(r2, 0, (this.$layoutHeight - r2.A00) / 2);
        AnonymousClass0XJ r3 = this.$titlePlaceable;
        C16120rk r1 = this.$titleHorizontalArrangement;
        C17220uJ r22 = AnonymousClass0OB.A02;
        if (C18070vi.A18(r1, r22)) {
            max = (Constraints.A01(this.$constraints) - this.$titlePlaceable.A01) / 2;
        } else if (C18070vi.A18(r1, AnonymousClass0OB.A00)) {
            max = (Constraints.A01(this.$constraints) - this.$titlePlaceable.A01) - this.$actionIconsPlaceable.A01;
        } else {
            max = Math.max(this.$this_Layout.CG9(AppBarKt.A00), this.$navigationIconPlaceable.A01);
        }
        C16130rl r5 = this.$titleVerticalArrangement;
        if (C18070vi.A18(r5, r22)) {
            i = (this.$layoutHeight - this.$titlePlaceable.A00) / 2;
        } else if (C18070vi.A18(r5, AnonymousClass0OB.A04)) {
            int i2 = this.$titleBottomPadding;
            int i3 = this.$layoutHeight;
            int i4 = this.$titlePlaceable.A00;
            if (i2 != 0) {
                i3 -= i4;
                i4 = Math.max(0, (i2 - i4) + this.$titleBaseline);
            }
            i = i3 - i4;
        } else {
            i = 0;
        }
        r7.A0B(r3, max, i);
        AnonymousClass0XJ r32 = this.$actionIconsPlaceable;
        r7.A0B(r32, Constraints.A01(this.$constraints) - r32.A01, (this.$layoutHeight - r32.A00) / 2);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00((AnonymousClass0QZ) obj);
        return C27621Wu.A00;
    }
}
