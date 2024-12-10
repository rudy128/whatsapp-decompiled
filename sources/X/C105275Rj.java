package X;

import com.whatsapp.conversation.EditMessageActivity;

/* renamed from: X.5Rj  reason: invalid class name and case insensitive filesystem */
public final class C105275Rj extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ EditMessageActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105275Rj(EditMessageActivity editMessageActivity) {
        super(1);
        this.this$0 = editMessageActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        C18070vi.A0d(str, 0);
        if (str.equals("ExitEditExpired")) {
            EditMessageActivity editMessageActivity = this.this$0;
            C73203Rj A00 = AnonymousClass4a6.A00(editMessageActivity);
            C18030ve r2 = editMessageActivity.A0E;
            A00.A0E(2131892057);
            A00.A0S(C72473Md.A0k(editMessageActivity.getResources(), C18020vd.A00(C18040vf.A02, r2, 3272) / 60, 2131755230));
            C73203Rj.A06(A00);
            A00.A0C();
            EditMessageActivity.A0d(this.this$0, false);
        } else {
            if (str.equals("ExitWithChanges")) {
                this.this$0.setResult(-1);
            }
            this.this$0.finish();
        }
        return C27621Wu.A00;
    }
}
