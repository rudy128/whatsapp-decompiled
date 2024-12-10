package X;

import android.database.Cursor;
import com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesActivity;

/* renamed from: X.5S6  reason: invalid class name */
public final class AnonymousClass5S6 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ ReportToAdminMessagesActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5S6(ReportToAdminMessagesActivity reportToAdminMessagesActivity) {
        super(1);
        this.this$0 = reportToAdminMessagesActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Cursor cursor = (Cursor) obj;
        AnonymousClass3X5 r0 = this.this$0.A05;
        if (r0 == null) {
            AnonymousClass3MW.A1B();
            throw null;
        }
        r0.A00 = cursor;
        r0.notifyDataSetChanged();
        ReportToAdminMessagesActivity reportToAdminMessagesActivity = this.this$0;
        C28931bI A0v = AnonymousClass3MX.A0v(reportToAdminMessagesActivity.A0B);
        AnonymousClass3X5 r02 = reportToAdminMessagesActivity.A05;
        if (r02 == null) {
            AnonymousClass3MW.A1B();
            throw null;
        }
        int A0Q = r02.A0Q();
        int i = 8;
        if (A0Q == 0) {
            i = 0;
        }
        A0v.A04(i);
        return C27621Wu.A00;
    }
}
