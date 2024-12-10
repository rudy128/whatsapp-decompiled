package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.5Uk  reason: invalid class name and case insensitive filesystem */
public final class C106065Uk extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass3XE $adapter;
    public final /* synthetic */ RecyclerView $recyclerView;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106065Uk(RecyclerView recyclerView, AnonymousClass3XE r3) {
        super(1);
        this.$adapter = r3;
        this.$recyclerView = recyclerView;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        AnonymousClass3XE r3 = this.$adapter;
        C18070vi.A0b(list);
        ArrayList A0s = C72463Mc.A0s(list);
        A0s.addAll(list);
        List list2 = r3.A00;
        C72473Md.A1B(new AnonymousClass3Vn(list2, list), r3, A0s, list2);
        C38251qy layoutManager = this.$recyclerView.getLayoutManager();
        C18070vi.A0z(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        if (((LinearLayoutManager) layoutManager).A1N() <= 0 && AnonymousClass000.A1a(list)) {
            this.$recyclerView.A0f(0);
        }
        return C27621Wu.A00;
    }
}
