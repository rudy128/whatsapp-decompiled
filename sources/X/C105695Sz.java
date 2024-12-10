package X;

import com.whatsapp.inappsupport.ui.SupportAiActivity;
import com.whatsapp.util.Log;

/* renamed from: X.5Sz  reason: invalid class name and case insensitive filesystem */
public final class C105695Sz extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ SupportAiActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105695Sz(SupportAiActivity supportAiActivity) {
        super(1);
        this.this$0 = supportAiActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Log.i("SupportAiActivity/showTicketCreationDialog");
        C73203Rj A00 = AnonymousClass4a6.A00(this.this$0);
        A00.A0D(2131892097);
        A00.A0T(true);
        A00.A0G(new C88794an(this.this$0, 9));
        SupportAiActivity supportAiActivity = this.this$0;
        A00.A0g(supportAiActivity, new C91604fx(supportAiActivity, 44), 2131899286);
        A00.A0C();
        AnonymousClass00H r0 = this.this$0.A03;
        if (r0 != null) {
            ((C35541mP) C18070vi.A0E(r0)).A02(7, (String) null);
            return C27621Wu.A00;
        }
        C18070vi.A11("supportLogger");
        throw null;
    }
}
