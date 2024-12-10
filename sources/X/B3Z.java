package X;

import com.whatsapp.registration.phonenumberentry.viewmodel.PasskeyLoginViewModel;

public final class B3Z extends AnonymousClass11G implements AnonymousClass1OS {
    public final /* synthetic */ PasskeyLoginViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public B3Z(PasskeyLoginViewModel passkeyLoginViewModel) {
        super(2);
        this.this$0 = passkeyLoginViewModel;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        AnonymousClass1DT r2;
        Object obj3;
        String str = (String) obj2;
        C18070vi.A0d(obj, 0);
        if (obj != AnonymousClass9IG.SUCCESS || str == null) {
            AnonymousClass9IG r1 = AnonymousClass9IG.ANDROID_API_VERIFICATION_CANCELLED;
            r2 = this.this$0.A00;
            if (obj == r1) {
                obj3 = AnonymousClass99U.A00;
            } else {
                obj3 = AnonymousClass99V.A00;
            }
        } else {
            r2 = this.this$0.A00;
            obj3 = new AnonymousClass99T(str);
        }
        r2.A0E(obj3);
        return C27621Wu.A00;
    }
}
