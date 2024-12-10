package X;

import com.whatsapp.jid.UserJid;
import com.whatsapp.spamreport.ReportSpamDialogFragment;

/* renamed from: X.7pV  reason: invalid class name and case insensitive filesystem */
public final class C153427pV extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ ReportSpamDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C153427pV(ReportSpamDialogFragment reportSpamDialogFragment) {
        super(0);
        this.this$0 = reportSpamDialogFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        return UserJid.Companion.A04(this.this$0.A15().getString("senderJid"));
    }
}
