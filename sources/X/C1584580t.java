package X;

import android.content.Context;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.reactions.ReactionsBottomSheetDialogFragment;

/* renamed from: X.80t  reason: invalid class name and case insensitive filesystem */
public final class C1584580t extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ ReactionsBottomSheetDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1584580t(ReactionsBottomSheetDialogFragment reactionsBottomSheetDialogFragment) {
        super(1);
        this.this$0 = reactionsBottomSheetDialogFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str;
        AnonymousClass1A3 r7 = (AnonymousClass1A3) obj;
        C18070vi.A0d(r7, 0);
        Context A1n = this.this$0.A1n();
        if (!(A1n == null || r7.A00 == null || !C22971Dz.A0d((Jid) r7.A00()))) {
            ReactionsBottomSheetDialogFragment reactionsBottomSheetDialogFragment = this.this$0;
            AnonymousClass1L9 r2 = reactionsBottomSheetDialogFragment.A00;
            if (r2 == null) {
                str = "activityUtils";
            } else if (reactionsBottomSheetDialogFragment.A0H != null) {
                Object A00 = r7.A00();
                C18070vi.A0z(A00, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
                r2.A08(A1n, AnonymousClass1LU.A1D(A1n, (UserJid) A00, (Integer) null, true, true));
                ReactionsBottomSheetDialogFragment reactionsBottomSheetDialogFragment2 = this.this$0;
                AnonymousClass206 r22 = reactionsBottomSheetDialogFragment2.A0J;
                Integer num = AnonymousClass00R.A19;
                if (r22 != null) {
                    C191569mo r0 = reactionsBottomSheetDialogFragment2.A0K;
                    if (r0 != null) {
                        r0.A00(r22, num, 1);
                    } else {
                        C18070vi.A11("reactionUserJourney");
                        throw null;
                    }
                }
            } else {
                str = "waIntents";
            }
            C18070vi.A11(str);
            throw null;
        }
        return C27621Wu.A00;
    }
}
