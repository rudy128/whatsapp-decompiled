package X;

/* renamed from: X.7mD  reason: invalid class name and case insensitive filesystem */
public final class C151387mD extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C112375lN this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C151387mD(C112375lN r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        this.this$0.A03.A00.A1q("pref_gif_tap_to_send_notice_seen_timestamp", System.currentTimeMillis() - 604800000);
        this.this$0.notifyDataSetChanged();
        return C27621Wu.A00;
    }
}
