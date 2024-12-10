package X;

import com.whatsapp.calling.chatmessages.CallLogMessageParticipantBottomSheet;
import com.whatsapp.jid.UserJid;

/* renamed from: X.5Qr  reason: invalid class name and case insensitive filesystem */
public final class C105095Qr extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ CallLogMessageParticipantBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105095Qr(CallLogMessageParticipantBottomSheet callLogMessageParticipantBottomSheet) {
        super(1);
        this.this$0 = callLogMessageParticipantBottomSheet;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        UserJid userJid = (UserJid) obj;
        C18070vi.A0d(userJid, 0);
        CallLogMessageParticipantBottomSheet callLogMessageParticipantBottomSheet = this.this$0;
        AnonymousClass1L9 r4 = callLogMessageParticipantBottomSheet.A00;
        if (r4 != null) {
            r4.A08(callLogMessageParticipantBottomSheet.A14(), AnonymousClass1LU.A1D(callLogMessageParticipantBottomSheet.A14(), userJid, (Integer) null, true, true));
            return C27621Wu.A00;
        }
        C18070vi.A11("activityUtils");
        throw null;
    }
}
