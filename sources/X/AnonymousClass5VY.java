package X;

import android.view.View;

/* renamed from: X.5VY  reason: invalid class name */
public final class AnonymousClass5VY extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass1FU $activity;
    public final /* synthetic */ View.OnClickListener $retryListener;
    public final /* synthetic */ View $view;
    public final /* synthetic */ AnonymousClass3VG $viewModel;
    public final /* synthetic */ AnonymousClass4VW this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5VY(View.OnClickListener onClickListener, View view, AnonymousClass1FU r4, AnonymousClass4VW r5, AnonymousClass3VG r6) {
        super(1);
        this.this$0 = r5;
        this.$activity = r4;
        this.$view = view;
        this.$viewModel = r6;
        this.$retryListener = onClickListener;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass4VW r4 = this.this$0;
        AnonymousClass1FU r3 = this.$activity;
        r4.A02(this.$retryListener, this.$view, r3, this.$viewModel);
        return C27621Wu.A00;
    }
}
