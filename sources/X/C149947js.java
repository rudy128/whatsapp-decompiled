package X;

import com.whatsapp.expressionstray.ExpressionsTrayView;
import com.whatsapp.expressionstray.ExpressionsTrayViewModel;
import com.whatsapp.expressionstray.ExpressionsTrayViewModel$onEmojiBackspaceClick$1;

/* renamed from: X.7js  reason: invalid class name and case insensitive filesystem */
public final class C149947js extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ ExpressionsTrayView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C149947js(ExpressionsTrayView expressionsTrayView) {
        super(0);
        this.this$0 = expressionsTrayView;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ExpressionsTrayViewModel A00 = this.this$0.getExpressionsViewModel();
        AnonymousClass3MX.A1Q(new ExpressionsTrayViewModel$onEmojiBackspaceClick$1(A00, (C30391dr) null), C41561wd.A00(A00));
        this.this$0.getExpressionUserJourneyLogger().A03(41, 1, 4);
        return C27621Wu.A00;
    }
}
