package X;

import android.content.Context;
import com.whatsapp.bridge.wfs.WfsManager$startSsoPrefetch$1;

/* renamed from: X.9nK  reason: invalid class name and case insensitive filesystem */
public final class C191869nK {
    public C193029pQ A00;
    public boolean A01;
    public boolean A02;
    public boolean A03 = true;
    public final AnonymousClass1KB A04;
    public final C19830z4 A05;
    public final AnonymousClass77S A06 = new AnonymousClass77S(new C1418477e(AnonymousClass8BR.A0Z(), AnonymousClass000.A13(), "XFamilySourceAccessPair"), 3);
    public final AnonymousClass00H A07;
    public final AnonymousClass00H A08;
    public final AnonymousClass00H A09;
    public final AnonymousClass00H A0A;
    public final AnonymousClass00H A0B;

    public C191869nK(AnonymousClass1KB r6, C19830z4 r7, AnonymousClass00H r8, AnonymousClass00H r9, AnonymousClass00H r10, AnonymousClass00H r11, AnonymousClass00H r12) {
        C18070vi.A0e(r8, 1, r9);
        C72473Md.A1M(r10, r6, r11, 3);
        C18070vi.A0l(r7, r12);
        this.A0A = r8;
        this.A08 = r9;
        this.A07 = r10;
        this.A04 = r6;
        this.A09 = r11;
        this.A05 = r7;
        this.A0B = r12;
    }

    public void A00(Context context) {
        C198779yt r5 = (C198779yt) this.A0B.get();
        C20525AOk aOk = new C20525AOk(this);
        AnonymousClass3MW.A1X(r5.A0G, new WfsManager$startSsoPrefetch$1(context, r5, aOk, (C30391dr) null), r5.A0I);
    }
}
