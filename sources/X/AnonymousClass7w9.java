package X;

import com.whatsapp.registration.sendsmstowa.SendSmsToWa;

/* renamed from: X.7w9  reason: invalid class name */
public final class AnonymousClass7w9 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ String $code;
    public final /* synthetic */ String $number;
    public final /* synthetic */ SendSmsToWa this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7w9(SendSmsToWa sendSmsToWa, String str, String str2) {
        super(0);
        this.this$0 = sendSmsToWa;
        this.$number = str;
        this.$code = str2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C108975cc.A0N(this.this$0).A0I("send_sms_to_wa_went_wrong_dialog", "skip");
        this.this$0.A4d(this.$number, this.$code);
        return C27621Wu.A00;
    }
}
