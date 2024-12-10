package X;

import android.animation.ObjectAnimator;
import android.view.ViewGroup;
import android.widget.ListView;

/* renamed from: X.5N8  reason: invalid class name */
public final class AnonymousClass5N8 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C108885cS $conversation;
    public final /* synthetic */ C78023rz this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5N8(C108885cS r2, C78023rz r3) {
        super(0);
        this.$conversation = r2;
        this.this$0 = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ListView listView = this.$conversation.getListView();
        return ObjectAnimator.ofInt(listView, "Top", new int[]{listView.getTop(), listView.getTop() - ((ViewGroup) AnonymousClass3MX.A0D(this.this$0.A01)).getHeight()});
    }
}
