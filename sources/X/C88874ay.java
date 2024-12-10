package X;

import android.content.DialogInterface;
import com.whatsapp.community.CommunitySpamReportDialogFragment;
import com.whatsapp.conversation.conversationrow.ConversationRowContact$MessageSharedContactDialogFragment;
import com.whatsapp.jid.UserJid;
import java.util.List;

/* renamed from: X.4ay  reason: invalid class name and case insensitive filesystem */
public class C88874ay implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C88874ay(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = str;
        this.A02 = obj2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.A00 != 0) {
            ConversationRowContact$MessageSharedContactDialogFragment conversationRowContact$MessageSharedContactDialogFragment = (ConversationRowContact$MessageSharedContactDialogFragment) this.A01;
            String str = this.A03;
            UserJid userJid = ((AnonymousClass4XI) ((List) this.A02).get(i)).A01;
            if (userJid != null) {
                conversationRowContact$MessageSharedContactDialogFragment.A00.A02(conversationRowContact$MessageSharedContactDialogFragment.A1n(), userJid, str);
                return;
            }
            return;
        }
        String str2 = this.A03;
        AnonymousClass1BI r2 = (AnonymousClass1BI) this.A02;
        C18070vi.A0h(str2, r2);
        C61562pt.A00((C61562pt) ((CommunitySpamReportDialogFragment) this.A01).A04.get(), r2, str2, 2);
    }
}
