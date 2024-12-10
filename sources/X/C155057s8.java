package X;

import com.whatsapp.wds.components.profilephoto.WDSProfilePhoto;
import com.whatsapp.xfamily.accountlinking.ui.AccountLinkingNativeAuthActivity;

/* renamed from: X.7s8  reason: invalid class name and case insensitive filesystem */
public final class C155057s8 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AccountLinkingNativeAuthActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C155057s8(AccountLinkingNativeAuthActivity accountLinkingNativeAuthActivity) {
        super(0);
        this.this$0 = accountLinkingNativeAuthActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        String str;
        AnonymousClass779 r0 = this.this$0.A03;
        if (r0 == null) {
            str = "fb4aUserEntityForNativeAuth";
        } else {
            String str2 = (String) r0.A02.A00("XFAM_CROSSPOSTING_NATIVE_AUTH_UI");
            WDSProfilePhoto wDSProfilePhoto = (WDSProfilePhoto) AnonymousClass3MY.A0H(this.this$0, 2131434170);
            AnonymousClass118 r02 = this.this$0.A02;
            if (r02 != null) {
                AnonymousClass3MX.A1B(r02.A00, wDSProfilePhoto, 2131232299);
                if (str2 != null) {
                    AccountLinkingNativeAuthActivity accountLinkingNativeAuthActivity = this.this$0;
                    accountLinkingNativeAuthActivity.A05.CGF(new C146887Qz(accountLinkingNativeAuthActivity, wDSProfilePhoto, str2, 31));
                }
                wDSProfilePhoto.setProfileBadge(new AnonymousClass2QF(C39321ss.A00(), new C39261sm(2131103368, 2131100596, 0, 0), 2131232205, false));
                return C27621Wu.A00;
            }
            str = "waContext";
        }
        C18070vi.A11(str);
        throw null;
    }
}
