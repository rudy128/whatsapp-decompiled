package X;

import java.lang.ref.WeakReference;

/* renamed from: X.7w5  reason: invalid class name */
public final class AnonymousClass7w5 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ WeakReference $activity;
    public final /* synthetic */ Integer $logInstanceKey;
    public final /* synthetic */ C46162Dk $newsletter;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7w5(C46162Dk r2, Integer num, WeakReference weakReference) {
        super(0);
        this.$activity = weakReference;
        this.$newsletter = r2;
        this.$logInstanceKey = num;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass6BJ r2 = (AnonymousClass6BJ) this.$activity.get();
        if (r2 != null) {
            AnonymousClass6BJ.A0u(this.$newsletter, r2, this.$logInstanceKey);
        }
        return C27621Wu.A00;
    }
}
