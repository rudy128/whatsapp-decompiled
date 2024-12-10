package X;

import com.google.android.play.core.integrity.StandardIntegrityManager;
import com.google.android.play.core.integrity.br;

public final class B1P extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C22513BAw $listener;
    public final /* synthetic */ String $perfTimerName;
    public final /* synthetic */ C19992A2f this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B1P(C22513BAw bAw, C19992A2f a2f, String str) {
        super(1);
        this.this$0 = a2f;
        this.$perfTimerName = str;
        this.$listener = bAw;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass8BR.A0W(this.this$0.A04).A01(this.$perfTimerName, "_SUCCESS");
        C22513BAw bAw = this.$listener;
        String str = ((br) ((StandardIntegrityManager.StandardIntegrityToken) obj)).a;
        C18070vi.A0X(str);
        bAw.C7R(str);
        return C27621Wu.A00;
    }
}
