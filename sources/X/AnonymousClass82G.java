package X;

import com.google.android.material.chip.Chip;
import com.whatsapp.expressionstray.ExpressionsTrayView;
import com.whatsapp.expressionstray.ExpressionsTrayViewModel;
import com.whatsapp.expressionstray.ExpressionsTrayViewModel$onSearchStarted$1;

/* renamed from: X.82G  reason: invalid class name */
public final class AnonymousClass82G extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ Chip $chip;
    public final /* synthetic */ ExpressionsTrayView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass82G(Chip chip, ExpressionsTrayView expressionsTrayView) {
        super(1);
        this.this$0 = expressionsTrayView;
        this.$chip = chip;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ExpressionsTrayViewModel A00 = this.this$0.getExpressionsViewModel();
        String A13 = AnonymousClass3Ma.A13(this.$chip);
        AnonymousClass3MX.A1Q(new ExpressionsTrayViewModel$onSearchStarted$1(A00, A13, (C30391dr) null), C41561wd.A00(A00));
        return C27621Wu.A00;
    }
}
