package X;

import java.util.List;

/* renamed from: X.0k8  reason: invalid class name */
public final class AnonymousClass0k8 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C98474rD $boxHeight;
    public final /* synthetic */ C98474rD $boxWidth;
    public final /* synthetic */ List $measurables;
    public final /* synthetic */ AnonymousClass0XJ[] $placeables;
    public final /* synthetic */ C17530uo $this_measure;
    public final /* synthetic */ AnonymousClass0X1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass0k8(AnonymousClass0X1 r2, C17530uo r3, List list, C98474rD r5, C98474rD r6, AnonymousClass0XJ[] r7) {
        super(1);
        this.$placeables = r7;
        this.$measurables = list;
        this.$this_measure = r3;
        this.$boxWidth = r5;
        this.$boxHeight = r6;
        this.this$0 = r2;
    }

    public final void A00() {
        AnonymousClass0XJ[] r9 = this.$placeables;
        List list = this.$measurables;
        C17530uo r7 = this.$this_measure;
        C98474rD r6 = this.$boxWidth;
        C98474rD r5 = this.$boxHeight;
        AnonymousClass0X1 r4 = this.this$0;
        int length = r9.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            AnonymousClass0XJ r12 = r9[i];
            int i3 = i2 + 1;
            C18070vi.A0z(r12, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
            C24246By4 layoutDirection = r7.getLayoutDirection();
            int i4 = r6.element;
            int i5 = r5.element;
            C04870Pg.A02(r4.A00, (C17500ul) list.get(i2), r12, layoutDirection, i4, i5);
            i++;
            i2 = i3;
        }
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        A00();
        return C27621Wu.A00;
    }
}
