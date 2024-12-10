package X;

import android.os.Handler;

/* renamed from: X.7ma  reason: invalid class name and case insensitive filesystem */
public final class C151617ma extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass740 $this_apply;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C151617ma(AnonymousClass740 r2) {
        super(0);
        this.$this_apply = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass740 r2 = this.$this_apply;
        AnonymousClass740.A03(r2);
        C112135kz r0 = r2.A0B;
        if (r0 != null) {
            r0.notifyDataSetChanged();
        } else {
            Handler handler = r2.A0L;
            Runnable runnable = r2.A0Z;
            handler.removeCallbacks(runnable);
            runnable.run();
        }
        return C27621Wu.A00;
    }
}
