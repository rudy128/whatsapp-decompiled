package X;

import android.content.Context;
import android.net.Uri;
import com.whatsapp.infra.graphql.generated.invite.GetWaMeLinkQueryResponseImpl;

/* renamed from: X.82M  reason: invalid class name */
public final class AnonymousClass82M extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ Context $activity;
    public final /* synthetic */ C61742qB this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass82M(Context context, C61742qB r3) {
        super(1);
        this.this$0 = r3;
        this.$activity = context;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String A0F;
        C18070vi.A0d(obj, 0);
        C61742qB r3 = this.this$0;
        Context context = this.$activity;
        C20125A8k A09 = ((C20125A8k) obj).A09(GetWaMeLinkQueryResponseImpl.Xwa2GrowthGetWameLink.class, "xwa2_growth_get_wame_link");
        if (!(A09 == null || (A0F = A09.A0F("wa_me_link")) == null)) {
            Uri parse = Uri.parse(A0F);
            C18070vi.A0X(parse);
            r3.A01.A08(context, AnonymousClass1LU.A0O(context, parse, 1));
        }
        return C27621Wu.A00;
    }
}
