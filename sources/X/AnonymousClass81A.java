package X;

import com.whatsapp.spamreport.ReportSpamDialogFragment;

/* renamed from: X.81A  reason: invalid class name */
public final class AnonymousClass81A extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ ReportSpamDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass81A(ReportSpamDialogFragment reportSpamDialogFragment) {
        super(1);
        this.this$0 = reportSpamDialogFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        AnonymousClass00H r0 = this.this$0.A0H;
        if (r0 != null) {
            C36531o3 A0a = AnonymousClass3MW.A0a(r0);
            C18070vi.A0b(str);
            A0a.A01(this.this$0.A1D(), str);
            return C27621Wu.A00;
        }
        C18070vi.A11("contextualHelpHandler");
        throw null;
    }
}
