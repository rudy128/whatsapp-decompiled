package X;

import com.whatsapp.calling.calllink.view.CreateCallLinkBottomSheet;

/* renamed from: X.829  reason: invalid class name */
public final class AnonymousClass829 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C1417476u $viewState;
    public final /* synthetic */ CreateCallLinkBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass829(CreateCallLinkBottomSheet createCallLinkBottomSheet, C1417476u r3) {
        super(1);
        this.this$0 = createCallLinkBottomSheet;
        this.$viewState = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        CreateCallLinkBottomSheet createCallLinkBottomSheet = this.this$0;
        C1417476u r2 = this.$viewState;
        int i = r2.A03;
        if (i == 1) {
            CreateCallLinkBottomSheet.A06(createCallLinkBottomSheet, r2.A05, r2.A00());
        } else if (i == 2 || i == 3) {
            CreateCallLinkBottomSheet.A02(createCallLinkBottomSheet);
        }
        return C27621Wu.A00;
    }
}
