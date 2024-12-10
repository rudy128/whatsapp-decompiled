package X;

import android.app.Activity;
import com.facebook.avatar.autogen.view.AESelfieViewProvider$increaseBrightness$1;

/* renamed from: X.Din  reason: case insensitive filesystem */
public final class C27643Din extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C23709BoG this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27643Din(C23709BoG boG) {
        super(0);
        this.this$0 = boG;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C25687CkI ckI = this.this$0.A00;
        if (ckI != null) {
            EDL edl = ckI.A02;
            if (edl != null) {
                edl.CG0();
            }
            Activity A00 = C25687CkI.A00(ckI.A05, ckI);
            AnonymousClass3MX.A1Q(new AESelfieViewProvider$increaseBrightness$1(A00, (C30391dr) null), BE6.A18());
        }
        return C27621Wu.A00;
    }
}
