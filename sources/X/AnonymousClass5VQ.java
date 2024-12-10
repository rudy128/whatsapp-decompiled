package X;

import com.whatsapp.calling.callconfirmationsheet.ui.CallConfirmationSheet;
import com.whatsapp.calling.fragment.CallConfirmationFragment;

/* renamed from: X.5VQ  reason: invalid class name */
public final class AnonymousClass5VQ extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C178119Bw $callLog;
    public final /* synthetic */ AnonymousClass22M $fMessage;
    public final /* synthetic */ C78453sp this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5VQ(AnonymousClass22M r2, C78453sp r3, C178119Bw r4) {
        super(1);
        this.this$0 = r3;
        this.$callLog = r4;
        this.$fMessage = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass1E7 r6 = (AnonymousClass1E7) obj;
        C18070vi.A0d(r6, 0);
        boolean A05 = C18020vd.A05(C18040vf.A02, this.this$0.A0F, 7175);
        C78453sp r1 = this.this$0;
        if (A05) {
            AnonymousClass1FR r4 = r1.A0S.A00;
            if (r4 != null) {
                r1.getLgcBottomSheetBridge();
                boolean z = this.$callLog.A0J;
                AnonymousClass1EC A0n = AnonymousClass3Ma.A0n(r6);
                if (A0n != null) {
                    CallConfirmationSheet A01 = C87384Vj.A01(A0n, C78453sp.A00(this.$fMessage, this.this$0), z);
                    this.this$0.getLgcBottomSheetBridge();
                    r4.CMk(A01, "CallConfirmationSheet");
                }
            }
        } else {
            AnonymousClass1FU A0O = C72473Md.A0O(r1);
            if (A0O != null) {
                C178119Bw r12 = this.$callLog;
                C78453sp r2 = this.this$0;
                AnonymousClass22M r0 = this.$fMessage;
                CallConfirmationFragment.A01(A0O, r6, Integer.valueOf(C78453sp.A00(r0, r2)), r12.A0J);
            }
        }
        return C27621Wu.A00;
    }
}
