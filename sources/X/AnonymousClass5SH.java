package X;

/* renamed from: X.5SH  reason: invalid class name */
public final class AnonymousClass5SH extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass4FP this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5SH(AnonymousClass4FP r2) {
        super(1);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass84U r3 = (AnonymousClass84U) obj;
        C18070vi.A0d(r3, 0);
        r3.A01("user_jid", this.this$0.A01.getRawString());
        r3.A01("ctwa_context_phone_number", this.this$0.A06);
        r3.A01("flow_cta", this.this$0.A07);
        r3.A01("flow_id", this.this$0.A08);
        r3.A01("flow_start_screen", this.this$0.A09);
        r3.A01("ctwa_code", this.this$0.A05);
        r3.A01("source_url", this.this$0.A0A);
        r3.A01("has_ice_breakers", this.this$0.A02);
        r3.A01("has_welcome_message", this.this$0.A03);
        r3.A01("has_logged_for_analytics", Boolean.valueOf(this.this$0.A0B));
        r3.A01("is_flow_completed", Boolean.valueOf(this.this$0.A0C));
        r3.A01("user_lid", C72463Mc.A0n(this.this$0.A00));
        r3.A01("should_show_automated_greeting_message", this.this$0.A04);
        return C27621Wu.A00;
    }
}
