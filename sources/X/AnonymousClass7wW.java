package X;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.7wW  reason: invalid class name */
public final class AnonymousClass7wW extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ int $firstFullyVisibleItemPosition;
    public final /* synthetic */ int $firstVisibleItemPosition;
    public final /* synthetic */ int $lastVisibleItemPosition;
    public final /* synthetic */ RecyclerView $recyclerView;
    public final /* synthetic */ C112755lz this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7wW(RecyclerView recyclerView, C112755lz r3, int i, int i2, int i3) {
        super(0);
        this.this$0 = r3;
        this.$recyclerView = recyclerView;
        this.$firstVisibleItemPosition = i;
        this.$lastVisibleItemPosition = i2;
        this.$firstFullyVisibleItemPosition = i3;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C112755lz.A00(this.$recyclerView, this.this$0, this.$firstVisibleItemPosition, this.$lastVisibleItemPosition, this.$firstFullyVisibleItemPosition);
        return AnonymousClass000.A0i();
    }
}
