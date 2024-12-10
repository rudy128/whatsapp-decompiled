package X;

import com.whatsapp.usercontrol.view.UserControlMessageLevelFragment;
import com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel;
import com.whatsapp.usercontrol.viewmodel.UserControlMessageLevelViewModel$sendUnsetPreference$1;

/* renamed from: X.7vn  reason: invalid class name and case insensitive filesystem */
public final class C157097vn extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass6U3 $navigation;
    public final /* synthetic */ UserControlMessageLevelFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C157097vn(AnonymousClass6U3 r2, UserControlMessageLevelFragment userControlMessageLevelFragment) {
        super(0);
        this.this$0 = userControlMessageLevelFragment;
        this.$navigation = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        UserControlMessageLevelViewModel A0e = C108965cb.A0e(this.this$0);
        boolean z = ((C121586Ko) this.$navigation).A01;
        AnonymousClass3MX.A1Q(new UserControlMessageLevelViewModel$sendUnsetPreference$1(A0e, (C30391dr) null, z), A0e.A0F);
        return C27621Wu.A00;
    }
}
