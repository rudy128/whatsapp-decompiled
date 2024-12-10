package X;

import com.whatsapp.inappsupport.ui.SupportVideoActivity;

/* renamed from: X.7O4  reason: invalid class name */
public final class AnonymousClass7O4 implements AnonymousClass88U {
    public final /* synthetic */ SupportVideoActivity A00;

    public AnonymousClass7O4(SupportVideoActivity supportVideoActivity) {
        this.A00 = supportVideoActivity;
    }

    public void CAE(int i) {
        SupportVideoActivity supportVideoActivity = this.A00;
        if (i == 0) {
            AnonymousClass3MZ.A0F(supportVideoActivity).setSystemUiVisibility(0);
            C003401n supportActionBar = supportVideoActivity.getSupportActionBar();
            if (supportActionBar != null) {
                supportActionBar.A0I();
                return;
            }
            return;
        }
        AnonymousClass3MZ.A0F(supportVideoActivity).setSystemUiVisibility(4358);
        C003401n supportActionBar2 = supportVideoActivity.getSupportActionBar();
        if (supportActionBar2 != null) {
            supportActionBar2.A0E();
        }
    }
}
