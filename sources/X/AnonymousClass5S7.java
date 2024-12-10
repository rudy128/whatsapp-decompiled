package X;

import com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesActivity;

/* renamed from: X.5S7  reason: invalid class name */
public final class AnonymousClass5S7 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ ReportToAdminMessagesActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5S7(ReportToAdminMessagesActivity reportToAdminMessagesActivity) {
        super(1);
        this.this$0 = reportToAdminMessagesActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        ReportToAdminMessagesActivity reportToAdminMessagesActivity = this.this$0;
        int A03 = AnonymousClass3MY.A03((Number) obj);
        AnonymousClass3X5 r0 = reportToAdminMessagesActivity.A05;
        if (r0 == null) {
            str = "adapter";
        } else {
            r0.notifyDataSetChanged();
            if (A03 != 0) {
                C18030ve r8 = reportToAdminMessagesActivity.A0E;
                AnonymousClass1KW r7 = reportToAdminMessagesActivity.A0D;
                C18000vb r6 = reportToAdminMessagesActivity.A00;
                C56472hW r02 = reportToAdminMessagesActivity.A02;
                if (r02 != null) {
                    C79433vQ A00 = r02.A00(reportToAdminMessagesActivity);
                    C95134lk r4 = new C95134lk();
                    AnonymousClass00H r03 = reportToAdminMessagesActivity.A07;
                    if (r03 != null) {
                        reportToAdminMessagesActivity.A00.A00 = reportToAdminMessagesActivity.COJ(new C79573vg(reportToAdminMessagesActivity, A00, r4, (C79603vj) r03.get(), r6, r7, r8));
                    } else {
                        str = "reportToAdminMessagesMessageSelectionActionRepository";
                    }
                } else {
                    str = "coreMessageSelectionActionExecutorFactory";
                }
            }
            return C27621Wu.A00;
        }
        C18070vi.A11(str);
        throw null;
    }
}
