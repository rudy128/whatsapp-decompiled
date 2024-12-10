package X;

import com.whatsapp.stickers.stickerpack.StickerPackDownloader;

/* renamed from: X.7QP  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7QP implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C188759hw A02;
    public final /* synthetic */ AnonymousClass725 A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ C22821Di A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    public final void run() {
        C188759hw r6 = this.A02;
        AnonymousClass725 r9 = this.A03;
        int i = this.A00;
        boolean z = this.A06;
        C22821Di r4 = this.A05;
        int i2 = this.A01;
        boolean z2 = this.A07;
        String str = this.A04;
        ((StickerPackDownloader) r6.A0G.get()).A02(r9, new AnonymousClass7MS(r6, r4, i, z), Integer.valueOf(i2), (Integer) null, 354170068, Integer.valueOf(i), !z2);
        r6.A00 = str;
    }

    public /* synthetic */ AnonymousClass7QP(C188759hw r1, AnonymousClass725 r2, String str, C22821Di r4, int i, int i2, boolean z, boolean z2) {
        this.A02 = r1;
        this.A03 = r2;
        this.A00 = i;
        this.A06 = z;
        this.A05 = r4;
        this.A01 = i2;
        this.A07 = z2;
        this.A04 = str;
    }
}
