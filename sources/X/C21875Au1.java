package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.Au1  reason: case insensitive filesystem */
public final class C21875Au1 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass8lW this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21875Au1(AnonymousClass8lW r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass8lW r2 = this.this$0;
        UserJid A4b = r2.A4b();
        B7A b7a = this.this$0.A01;
        if (b7a != null) {
            return AHF.A00(r2, b7a, A4b);
        }
        C18070vi.A11("cartMenuViewModelFactory");
        throw null;
    }
}
