package X;

import com.whatsapp.WaEditText;
import com.whatsapp.expressionstray.search.ExpressionsSearchView;

/* renamed from: X.82H  reason: invalid class name */
public final class AnonymousClass82H extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CharSequence $text;
    public final /* synthetic */ ExpressionsSearchView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass82H(ExpressionsSearchView expressionsSearchView, CharSequence charSequence) {
        super(1);
        this.this$0 = expressionsSearchView;
        this.$text = charSequence;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ExpressionsSearchView expressionsSearchView = this.this$0;
        String obj2 = this.$text.toString();
        expressionsSearchView.A0S = true;
        WaEditText waEditText = expressionsSearchView.A0B;
        if (waEditText != null) {
            waEditText.setText(obj2);
            waEditText.clearFocus();
        }
        return C27621Wu.A00;
    }
}
