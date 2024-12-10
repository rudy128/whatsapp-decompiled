package X;

import java.util.List;

/* renamed from: X.6pd  reason: invalid class name and case insensitive filesystem */
public final class C133866pd {
    public int A00;
    public C128666gU A01 = new C128666gU(this, AnonymousClass00R.A01, -1);
    public final C41111vp A02;
    public final String A03;
    public final /* synthetic */ C111215j4 A04;

    public final void A00(AnonymousClass7PX r5) {
        C41111vp r2 = this.A02;
        AnonymousClass3MW.A10(r2).add(0, r5);
        this.A01 = new C128666gU(this, AnonymousClass00R.A00, 0);
        r2.A0F(r2.A06());
        C111215j4.A04(this, this.A04);
    }

    public final boolean A01(AnonymousClass7PX r5) {
        C41111vp r3 = this.A02;
        int indexOf = AnonymousClass3MW.A10(r3).indexOf(r5);
        if (!AnonymousClass3MW.A10(r3).remove(r5)) {
            return false;
        }
        this.A01 = new C128666gU(this, AnonymousClass00R.A01, indexOf);
        r3.A0F(r3.A06());
        r3.A0F(r3.A06());
        C111215j4.A04(this, this.A04);
        return true;
    }

    public C133866pd(C111215j4 r4, String str, List list, int i) {
        this.A04 = r4;
        this.A00 = i;
        this.A03 = str;
        this.A02 = AnonymousClass3MW.A0n(list);
    }
}
