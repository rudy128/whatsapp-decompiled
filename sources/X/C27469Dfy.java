package X;

import android.os.Build;

/* renamed from: X.Dfy  reason: case insensitive filesystem */
public final class C27469Dfy extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ D7F this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27469Dfy(D7F d7f) {
        super(0);
        this.this$0 = d7f;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        D7F d7f = this.this$0;
        if (d7f.A00 == null) {
            return C25643CjW.A03;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return C24506C7a.A00(d7f.A01);
        }
        return C25643CjW.A01;
    }
}
