package X;

import android.view.View;
import android.widget.LinearLayout;
import com.whatsapp.inappbugreporting.InAppBugReportingActivity;

/* renamed from: X.5Sq  reason: invalid class name and case insensitive filesystem */
public final class C105605Sq extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ InAppBugReportingActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C105605Sq(InAppBugReportingActivity inAppBugReportingActivity) {
        super(1);
        this.this$0 = inAppBugReportingActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C83204Ef r4 = (C83204Ef) obj;
        LinearLayout linearLayout = this.this$0.A03;
        if (linearLayout == null) {
            C18070vi.A11("screenshotsGroup");
            throw null;
        }
        View childAt = linearLayout.getChildAt(0);
        C18070vi.A0z(childAt, "null cannot be cast to non-null type com.whatsapp.inappbugreporting.view.AddScreenshotImageViewWithRemoveButton");
        InAppBugReportingActivity inAppBugReportingActivity = this.this$0;
        C18070vi.A0b(r4);
        InAppBugReportingActivity.A0d(inAppBugReportingActivity, r4, (AnonymousClass3RY) childAt, 0);
        return C27621Wu.A00;
    }
}
