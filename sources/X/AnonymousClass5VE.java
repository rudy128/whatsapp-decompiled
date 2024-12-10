package X;

import com.whatsapp.util.Log;
import java.util.Map;

/* renamed from: X.5VE  reason: invalid class name */
public final class AnonymousClass5VE extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C195759tr $asyncBannerData;
    public final /* synthetic */ AnonymousClass5YR $quickPromotion;
    public final /* synthetic */ C91944gV this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5VE(C195759tr r2, C91944gV r3, AnonymousClass5YR r4) {
        super(1);
        this.this$0 = r3;
        this.$asyncBannerData = r2;
        this.$quickPromotion = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C91944gV r4 = this.this$0;
        r4.A06.CGF(new C21453AkK(r4, this.$quickPromotion, 37));
        C195759tr r1 = this.$asyncBannerData;
        r1.A01 = null;
        r1.A02 = null;
        C91944gV r42 = this.this$0;
        AnonymousClass5YR r12 = this.$quickPromotion;
        C18070vi.A0d(r12, 0);
        C21319Ai4 ai4 = (C21319Ai4) r12;
        C188169gz r0 = ai4.A07;
        if (r0 != null) {
            Map map = null;
            C187549fz r2 = r0.A01;
            if (r2 != null) {
                AnonymousClass9ZF r02 = ai4.A06;
                if (r02 != null) {
                    map = r02.A00;
                }
                r42.A04.A00(AnonymousClass3MY.A04(r42.A02), r2, map);
                this.this$0.Bcv();
                return C27621Wu.A00;
            }
        }
        Log.i("InAppBannerQP/handleCTA no primary action");
        this.this$0.Bcv();
        return C27621Wu.A00;
    }
}
