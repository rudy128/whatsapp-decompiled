package X;

import android.content.Context;
import com.whatsapp.WaTextView;
import com.whatsapp.calling.participantlist.view.ParticipantListBottomSheetDialog;

/* renamed from: X.5R3  reason: invalid class name */
public final class AnonymousClass5R3 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ ParticipantListBottomSheetDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5R3(ParticipantListBottomSheetDialog participantListBottomSheetDialog) {
        super(1);
        this.this$0 = participantListBottomSheetDialog;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        WaTextView waTextView;
        AnonymousClass4ZN r3 = (AnonymousClass4ZN) obj;
        WaTextView waTextView2 = this.this$0.A02;
        if (r3 == null) {
            C72453Mb.A1D(waTextView2);
        } else {
            C72453Mb.A1C(waTextView2);
            Context A1n = this.this$0.A1n();
            if (!(A1n == null || (waTextView = this.this$0.A02) == null)) {
                AnonymousClass4ZN.A01(A1n, waTextView, r3);
            }
        }
        return C27621Wu.A00;
    }
}
