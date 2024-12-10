package X;

import android.content.Intent;
import com.whatsapp.spamreport.ReportSpamDialogFragment;

/* renamed from: X.7wQ  reason: invalid class name */
public final class AnonymousClass7wQ extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass1FU $activity;
    public final /* synthetic */ AnonymousClass1E7 $contact;
    public final /* synthetic */ boolean $extraActionChecked;
    public final /* synthetic */ ReportSpamDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7wQ(AnonymousClass1FU r2, AnonymousClass1E7 r3, ReportSpamDialogFragment reportSpamDialogFragment, boolean z) {
        super(0);
        this.this$0 = reportSpamDialogFragment;
        this.$contact = r3;
        this.$extraActionChecked = z;
        this.$activity = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        ReportSpamDialogFragment reportSpamDialogFragment = this.this$0;
        AnonymousClass1E7 r1 = this.$contact;
        boolean z = this.$extraActionChecked;
        AnonymousClass1FU r3 = this.$activity;
        if (C72453Mb.A1a(reportSpamDialogFragment.A0a)) {
            boolean A04 = ReportSpamDialogFragment.A04(r1, reportSpamDialogFragment);
            AnonymousClass00H r0 = reportSpamDialogFragment.A0M;
            if (r0 != null) {
                r0.get();
                Intent A02 = AnonymousClass1LU.A02(r3);
                if (A04) {
                    A02 = A02.setAction(C28901bF.A04).putExtra("report_and_exit_group", z);
                }
                C18070vi.A0b(A02);
                A02.addFlags(603979776);
                r3.startActivity(A02);
            } else {
                AnonymousClass3MW.A1F();
                throw null;
            }
        }
        return C27621Wu.A00;
    }
}
