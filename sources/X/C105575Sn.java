package X;

import android.content.Intent;
import com.whatsapp.inappbugreporting.BugReportingCategoriesActivity;

/* renamed from: X.5Sn  reason: invalid class name and case insensitive filesystem */
public final class C105575Sn extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ BugReportingCategoriesActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105575Sn(BugReportingCategoriesActivity bugReportingCategoriesActivity) {
        super(1);
        this.this$0 = bugReportingCategoriesActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass4NP r4 = (AnonymousClass4NP) obj;
        Intent A0G = C72463Mc.A0G(r4);
        A0G.putExtra("bug_category_title", r4.A02);
        A0G.putExtra("bug_category_type", r4.A00);
        this.this$0.setResult(-1, A0G);
        this.this$0.finish();
        return C27621Wu.A00;
    }
}
