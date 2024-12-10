package X;

import com.whatsapp.registration.sendsmstowa.SendSmsToWa;

/* renamed from: X.7pH  reason: invalid class name and case insensitive filesystem */
public final class C153287pH extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ SendSmsToWa this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C153287pH(SendSmsToWa sendSmsToWa) {
        super(0);
        this.this$0 = sendSmsToWa;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C108975cc.A0N(this.this$0).A0I("send_sms_to_wa_went_wrong_dialog", "verify_another_way");
        C21014Ad6 ad6 = this.this$0.A0C;
        if (ad6 == null) {
            C18070vi.A11("dynamicBottomSheetNavigator");
            throw null;
        }
        ad6.A04();
        return C27621Wu.A00;
    }
}
