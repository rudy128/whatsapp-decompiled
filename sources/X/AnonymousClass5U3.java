package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.reactions.ReactionsBottomSheetDialogFragment;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.5U3  reason: invalid class name */
public final class AnonymousClass5U3 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ ReactionsBottomSheetDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5U3(ReactionsBottomSheetDialogFragment reactionsBottomSheetDialogFragment) {
        super(1);
        this.this$0 = reactionsBottomSheetDialogFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        long A05 = C17880vN.A05(obj);
        AnonymousClass4MO r0 = this.this$0.A0A;
        if (r0 != null) {
            AnonymousClass3u7 r8 = r0.A01;
            Context context = r0.A00;
            ArrayList A0k = C29431cG.A0k(r8.getRevokedAlbumMessages(), r8.getAlbumMessages());
            if (C17880vN.A1X(A0k)) {
                Iterator it = A0k.iterator();
                int i = 0;
                while (true) {
                    if (it.hasNext()) {
                        if (A05 == C17880vN.A0Y(it).A0x) {
                            break;
                        }
                        i++;
                    } else {
                        i = -1;
                        break;
                    }
                }
                C191569mo r2 = r8.A1O;
                AnonymousClass206 fMessage = r8.getFMessage();
                C18070vi.A0X(fMessage);
                r2.A00(fMessage, AnonymousClass00R.A0j, 1);
                r8.getConversationRowAlbumUtils();
                AnonymousClass206 fMessage2 = r8.getFMessage();
                C18070vi.A0X(fMessage2);
                Intent A00 = AnonymousClass4Xe.A00(context, fMessage2, A0k);
                if (A00 != null) {
                    if (AnonymousClass745.A00) {
                        A00.putExtra("start_index", i);
                    }
                    context.startActivity(A00);
                }
            }
        }
        return C27621Wu.A00;
    }
}
