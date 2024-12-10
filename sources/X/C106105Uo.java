package X;

import com.whatsapp.conversation.EditMessageActivity;

/* renamed from: X.5Uo  reason: invalid class name and case insensitive filesystem */
public final class C106105Uo extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass206 $message;
    public final /* synthetic */ EditMessageActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C106105Uo(EditMessageActivity editMessageActivity, AnonymousClass206 r3) {
        super(1);
        this.this$0 = editMessageActivity;
        this.$message = r3;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C143887Fe r4 = (C143887Fe) obj;
        AnonymousClass3TA r0 = this.this$0.A0D;
        if (r0 != null) {
            r0.A0X(r4);
            if (r4 == null || !r0.A0c()) {
                EditMessageActivity.A0V(this.this$0, 8);
            } else {
                EditMessageActivity.A0c(this.this$0, this.$message);
                boolean A0w = this.$message.A0w();
                AnonymousClass3TA r02 = this.this$0.A0D;
                if (r02 != null) {
                    r02.A0V(A0w ? 1 : 0);
                    AnonymousClass3TA r03 = this.this$0.A0D;
                    if (r03 != null) {
                        r03.A0U();
                    }
                }
            }
            return C27621Wu.A00;
        }
        C18070vi.A11("webPagePreviewViewModel");
        throw null;
    }
}
