package X;

import android.content.Intent;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5VW  reason: invalid class name */
public final class AnonymousClass5VW extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass1FY $activity;
    public final /* synthetic */ boolean $isChatLocked;
    public final /* synthetic */ AnonymousClass206 $selectedMessage;
    public final /* synthetic */ C79713vu this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5VW(AnonymousClass1FY r2, C79713vu r3, AnonymousClass206 r4, boolean z) {
        super(1);
        this.this$0 = r3;
        this.$selectedMessage = r4;
        this.$activity = r2;
        this.$isChatLocked = z;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass1A3 r6 = (AnonymousClass1A3) obj;
        if (r6.A00 != null && C22971Dz.A0d((Jid) r6.A00())) {
            C22941Dw r0 = UserJid.Companion;
            UserJid A01 = C22941Dw.A01((Jid) r6.A00());
            if (A01 != null) {
                this.this$0.A01.A00.put(A01, this.$selectedMessage);
                Intent A0C = AnonymousClass1LU.A0C(this.$activity, 0);
                C18070vi.A0X(A0C);
                A0C.putExtra("jid", A01.getRawString());
                A0C.putExtra("args_conversation_screen_entry_point", 2);
                A0C.putExtra("extra_quoted_message_row_id", this.$selectedMessage.A0F);
                if (this.$isChatLocked) {
                    A0C.putExtra("chatlockEntryPoint", 2);
                }
                this.this$0.A00.A09(this.$activity, A0C);
            }
        }
        return C27621Wu.A00;
    }
}
