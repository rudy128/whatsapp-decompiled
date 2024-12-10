package X;

import com.whatsapp.registration.email.RegisterEmail;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.5U5  reason: invalid class name */
public final class AnonymousClass5U5 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ RegisterEmail this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5U5(RegisterEmail registerEmail) {
        super(1);
        this.this$0 = registerEmail;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        C18070vi.A0b(list);
        if (AnonymousClass000.A1a(list)) {
            RegisterEmail registerEmail = this.this$0;
            registerEmail.A0H = list;
            C17880vN.A1F(C19830z4.A00(registerEmail.A0A), "pref_email_hints_shown", true);
            AnonymousClass4Yv.A01(this.this$0, 5);
        } else {
            Log.i("RegisterEmail/emails/empty");
        }
        return C27621Wu.A00;
    }
}
