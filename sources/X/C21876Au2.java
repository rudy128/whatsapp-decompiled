package X;

import com.whatsapp.jid.UserJid;

/* renamed from: X.Au2  reason: case insensitive filesystem */
public final class C21876Au2 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass8lW this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C21876Au2(AnonymousClass8lW r2) {
        super(0);
        this.this$0 = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        AnonymousClass8lW r4 = this.this$0;
        AnonymousClass00H r0 = r4.A06;
        if (r0 != null) {
            C175268yR r3 = (C175268yR) C18070vi.A0E(r0);
            UserJid A4b = this.this$0.A4b();
            AnonymousClass8lW r02 = this.this$0;
            C22417B6z b6z = r02.A00;
            if (b6z != null) {
                return AnonymousClass8BR.A0C(new AH5(b6z.BGF(r02.A4b()), r3, A4b), r4).A00(C161538Fq.class);
            }
            str = "activeCartRepositoryFactory";
        } else {
            str = "cartObservers";
        }
        C18070vi.A11(str);
        throw null;
    }
}
