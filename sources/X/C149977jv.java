package X;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.whatsapp.expressionstray.ExpressionsTrayView;

/* renamed from: X.7jv  reason: invalid class name and case insensitive filesystem */
public final class C149977jv extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass74J this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C149977jv(AnonymousClass74J r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass74J r2 = this.this$0;
        BottomSheetBehavior bottomSheetBehavior = r2.A06;
        if (bottomSheetBehavior != null) {
            int i = bottomSheetBehavior.A0J;
            ExpressionsTrayView expressionsTrayView = r2.A0E;
            if (expressionsTrayView != null) {
                expressionsTrayView.A0F(i);
            }
            if (r2.A0K) {
                AnonymousClass74J.A03(r2.A0E, r2);
            }
        }
        return C27621Wu.A00;
    }
}
