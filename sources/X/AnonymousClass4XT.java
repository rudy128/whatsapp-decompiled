package X;

import com.whatsapp.wds.components.banners.WDSBanner;

/* renamed from: X.4XT  reason: invalid class name */
public final class AnonymousClass4XT {
    public int A00;
    public int A01;
    public C85604Oa A02 = AnonymousClass4A7.A00;
    public CharSequence A03;
    public CharSequence A04;
    public boolean A05 = true;

    public static void A00(WDSBanner wDSBanner, AnonymousClass4XT r2, CharSequence charSequence) {
        r2.A03 = charSequence;
        wDSBanner.setState(r2.A01());
    }

    public final C85784Os A01() {
        return new C85784Os(this.A02, this.A04, this.A03, this.A01, this.A00, this.A05);
    }
}
