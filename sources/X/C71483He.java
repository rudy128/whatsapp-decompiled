package X;

import com.whatsapp.registration.RegisterName;

/* renamed from: X.3He  reason: invalid class name and case insensitive filesystem */
public final class C71483He extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ RegisterName this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C71483He(RegisterName registerName) {
        super(0);
        this.this$0 = registerName;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass00H r0 = this.this$0.A19;
        if (r0 != null) {
            C26931Ua r4 = (C26931Ua) r0.get();
            AnonymousClass1UZ r3 = r4.A03;
            if (!C18070vi.A03(r3.A01).getBoolean("restoration_registration_complete_logging_sent", false)) {
                C26931Ua.A00(r4, 0, AnonymousClass11P.A01(r4.A01));
                r3.A00(true);
            }
            return C27621Wu.A00;
        }
        C18070vi.A11("contactsRestoreLoggerLazy");
        throw null;
    }
}
