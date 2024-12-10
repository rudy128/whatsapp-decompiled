package X;

import com.whatsapp.WaTextView;
import com.whatsapp.inappbugreporting.BugReportingCategoriesActivity;

/* renamed from: X.BLu  reason: case insensitive filesystem */
public final class C22709BLu extends C37911qO {
    public final /* synthetic */ WaTextView A00;
    public final /* synthetic */ BugReportingCategoriesActivity A01;
    public final /* synthetic */ C28931bI A02;

    public C22709BLu(WaTextView waTextView, BugReportingCategoriesActivity bugReportingCategoriesActivity, C28931bI r3) {
        this.A01 = bugReportingCategoriesActivity;
        this.A02 = r3;
        this.A00 = waTextView;
    }

    public void A01() {
        AnonymousClass3XN r0 = this.A01.A01;
        if (r0 == null) {
            C18070vi.A11("bugCategoryListAdapter");
            throw null;
        }
        int size = r0.A00.size();
        C28931bI r02 = this.A02;
        if (size == 0) {
            r02.A04(0);
            this.A00.setVisibility(8);
            return;
        }
        r02.A04(8);
        this.A00.setVisibility(0);
    }
}
