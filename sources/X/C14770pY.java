package X;

import androidx.compose.ui.unit.Constraints;

/* renamed from: X.0pY  reason: invalid class name and case insensitive filesystem */
public final class C14770pY extends AnonymousClass11G implements C36001nB {
    public final /* synthetic */ C04380Mz $minSizeState;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14770pY(C04380Mz r2) {
        super(3);
        this.$minSizeState = r2;
    }

    public final C16820tH A00(C17500ul r11, C17530uo r12, long j) {
        long j2 = this.$minSizeState.A00;
        AnonymousClass0XJ Bjb = r11.Bjb(Constraints.A04(C28851b7.A03(AnonymousClass000.A0G(j2), Constraints.A03(j), Constraints.A01(j)), 0, C28851b7.A03(AnonymousClass000.A0H(j2), Constraints.A02(j), Constraints.A00(j)), 0, 10, j));
        return r12.BhL(AnonymousClass1D7.A0I(), new C09750hE(Bjb), Bjb.A01, Bjb.A00);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return A00((C17500ul) obj2, (C17530uo) obj, ((Constraints) obj3).A0B());
    }
}
