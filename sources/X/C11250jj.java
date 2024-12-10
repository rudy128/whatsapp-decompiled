package X;

import androidx.compose.material3.SwitchKt$Switch$3$1;

/* renamed from: X.0jj  reason: invalid class name and case insensitive filesystem */
public final class C11250jj extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass0Q3 $offset;
    public final /* synthetic */ AnonymousClass1OX $scope;
    public final /* synthetic */ float $targetValue;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C11250jj(AnonymousClass0Q3 r2, AnonymousClass1OX r3, float f) {
        super(1);
        this.$offset = r2;
        this.$targetValue = f;
        this.$scope = r3;
    }

    public final AnonymousClass0VV A00() {
        float A05 = AnonymousClass001.A05(this.$offset.A07);
        float f = this.$targetValue;
        if (A05 != f) {
            AnonymousClass4Z4.A02((Integer) null, (C18560wh) null, new SwitchKt$Switch$3$1(this.$offset, (C30391dr) null, f), this.$scope, 3);
        }
        return new AnonymousClass0VV(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return A00();
    }
}
