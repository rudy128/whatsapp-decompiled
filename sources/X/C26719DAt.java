package X;

import com.facebook.xanalytics.XAnalyticsAdapterHolder;
import com.whatsapp.SecondaryProcessAbstractAppShellDelegate;

/* renamed from: X.DAt  reason: case insensitive filesystem */
public final class C26719DAt implements C28423E0o {
    public String A00 = SecondaryProcessAbstractAppShellDelegate.COMPRESSED_WHATSAPP_LIB_NAME;
    public final C26879DHl A01;
    public final XAnalyticsAdapterHolder A02;
    public final CQP A03;

    public C26719DAt(CQP cqp) {
        C18070vi.A0d(cqp, 1);
        this.A03 = cqp;
        C26879DHl dHl = new C26879DHl(cqp);
        this.A01 = dHl;
        this.A02 = new XAnalyticsAdapterHolder(dHl);
    }
}
