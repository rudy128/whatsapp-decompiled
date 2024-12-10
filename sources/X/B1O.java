package X;

import com.google.android.play.core.integrity.StandardIntegrityManager;

public final class B1O extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ B5F $listener;
    public final /* synthetic */ String $perfTimerName;
    public final /* synthetic */ C19992A2f this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B1O(B5F b5f, C19992A2f a2f, String str) {
        super(1);
        this.this$0 = a2f;
        this.$perfTimerName = str;
        this.$listener = b5f;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C19992A2f a2f = this.this$0;
        a2f.A00 = (StandardIntegrityManager.StandardIntegrityTokenProvider) obj;
        AnonymousClass8BR.A0W(a2f.A04).A01(this.$perfTimerName, "_SUCCESS");
        B5F b5f = this.$listener;
        if (b5f != null) {
            ((C30391dr) ((AVN) b5f).A01).resumeWith(C27621Wu.A00);
        }
        return C27621Wu.A00;
    }
}
