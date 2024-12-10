package X;

import com.whatsapp.calling.participantlist.view.VoiceChatParticipantListBottomSheetDialog;

/* renamed from: X.5R6  reason: invalid class name */
public final class AnonymousClass5R6 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ VoiceChatParticipantListBottomSheetDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5R6(VoiceChatParticipantListBottomSheetDialog voiceChatParticipantListBottomSheetDialog) {
        super(1);
        this.this$0 = voiceChatParticipantListBottomSheetDialog;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass1FU r4;
        AnonymousClass4TA r6 = (AnonymousClass4TA) obj;
        VoiceChatParticipantListBottomSheetDialog voiceChatParticipantListBottomSheetDialog = this.this$0;
        C18070vi.A0b(r6);
        AnonymousClass1FL A1B = voiceChatParticipantListBottomSheetDialog.A1B();
        if ((A1B instanceof AnonymousClass1FU) && (r4 = (AnonymousClass1FU) A1B) != null) {
            String obj2 = r6.A01.A03(r4).toString();
            AnonymousClass00H r0 = voiceChatParticipantListBottomSheetDialog.A07;
            if (r0 != null) {
                r4.CMk(C87374Vi.A01(C87374Vi.A00(r4, (C37551pj) C18070vi.A0E(r0), r6.A00), obj2, 2131887212, false), "UnblockDialogFragment");
            } else {
                C18070vi.A11("blockListManager");
                throw null;
            }
        }
        return C27621Wu.A00;
    }
}
