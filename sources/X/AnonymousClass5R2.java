package X;

import com.whatsapp.calling.participantlist.view.ParticipantListBottomSheetDialog;
import java.util.List;

/* renamed from: X.5R2  reason: invalid class name */
public final class AnonymousClass5R2 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ ParticipantListBottomSheetDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5R2(ParticipantListBottomSheetDialog participantListBottomSheetDialog) {
        super(1);
        this.this$0 = participantListBottomSheetDialog;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        AnonymousClass3WN r0 = this.this$0.A03;
        if (r0 != null) {
            r0.A0W(list);
            return C27621Wu.A00;
        }
        C18070vi.A11("participantListAdapter");
        throw null;
    }
}
