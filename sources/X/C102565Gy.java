package X;

import com.whatsapp.conversation.conversationrow.message.reporttoadmin.messageslist.ReportToAdminMessagesActivity;

/* renamed from: X.5Gy  reason: invalid class name and case insensitive filesystem */
public final class C102565Gy extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ ReportToAdminMessagesActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C102565Gy(ReportToAdminMessagesActivity reportToAdminMessagesActivity) {
        super(0);
        this.this$0 = reportToAdminMessagesActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ReportToAdminMessagesActivity reportToAdminMessagesActivity = this.this$0;
        C106745Xa r3 = reportToAdminMessagesActivity.A04;
        if (r3 != null) {
            C42941yz r0 = AnonymousClass1EC.A01;
            AnonymousClass1EC A01 = C42941yz.A01(C72453Mb.A0u(reportToAdminMessagesActivity));
            return AnonymousClass4WS.A00(new AnonymousClass4WS(), AnonymousClass3Uj.class, new C106135Ur(r3, A01));
        }
        C18070vi.A11("rtaViewModelFactory");
        throw null;
    }
}
