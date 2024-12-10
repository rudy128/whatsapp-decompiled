package X;

import com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsFragment;
import com.whatsapp.expressionstray.expression.avatars.AvatarExpressionsViewModel;
import com.whatsapp.productinfra.avatar.squid.AvatarSquidConfiguration;

/* renamed from: X.7z2  reason: invalid class name */
public final class AnonymousClass7z2 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AvatarExpressionsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7z2(AvatarExpressionsFragment avatarExpressionsFragment) {
        super(1);
        this.this$0 = avatarExpressionsFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Class cls = (Class) obj;
        C18070vi.A0d(cls, 0);
        AvatarExpressionsViewModel A0M = C108965cb.A0M(this.this$0);
        A0M.A0U(cls);
        if (cls.equals(C1176260i.class)) {
            AvatarSquidConfiguration avatarSquidConfiguration = A0M.A03;
            C137856w8.A00(avatarSquidConfiguration.A00(), avatarSquidConfiguration.A00, AnonymousClass6RS.STICKER_TRAY, 3);
            C108945cZ.A0o(avatarSquidConfiguration.A02).A00(avatarSquidConfiguration.A00());
        }
        return C27621Wu.A00;
    }
}
