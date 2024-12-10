package X;

import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;

/* renamed from: X.7vM  reason: invalid class name */
public final class AnonymousClass7vM extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ View $itemView;
    public final /* synthetic */ AnonymousClass6KR this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7vM(View view, AnonymousClass6KR r3) {
        super(0);
        this.$itemView = view;
        this.this$0 = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(AnonymousClass3MY.A04(this.$itemView), 2, 0, false);
        gridLayoutManager.A01 = new C111635k2(gridLayoutManager, this.this$0, 9);
        return gridLayoutManager;
    }
}
