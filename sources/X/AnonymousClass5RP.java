package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.community.communityInfo.CAGInfoFragment;

/* renamed from: X.5RP  reason: invalid class name */
public final class AnonymousClass5RP extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CAGInfoFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5RP(CAGInfoFragment cAGInfoFragment) {
        super(1);
        this.this$0 = cAGInfoFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C18100vl r2 = this.this$0.A0E;
        if (!(!((AnonymousClass1FU) r2.getValue()).A0H)) {
            Intent A09 = C72473Md.A09((Context) r2.getValue());
            C18070vi.A0X(A09);
            ((Context) r2.getValue()).startActivity(A09);
        }
        return C27621Wu.A00;
    }
}
