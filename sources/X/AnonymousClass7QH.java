package X;

import com.whatsapp.stickers.stickerpack.StickerPackDownloader;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.7QH  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7QH implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C188759hw A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ C22821Di A03;
    public final /* synthetic */ boolean A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public final void run() {
        String str;
        C188759hw r7 = this.A01;
        String str2 = this.A02;
        boolean z = this.A04;
        C22821Di r5 = this.A03;
        boolean z2 = this.A05;
        int i = this.A00;
        boolean z3 = this.A06;
        AnonymousClass00H r9 = r7.A0A;
        int A012 = C108945cZ.A0q(r9).A01();
        AnonymousClass70I.A00(C108945cZ.A0q(r9), r9, "start_download", A012).A06(AnonymousClass6EH.A00, str2, A012);
        r7.A0C.get();
        String str3 = "";
        AnonymousClass725 A013 = AnonymousClass71T.A01((C1418377d) null, "meta-avatar", "Avatars", "Meta", "", str3, "", "", C18460wS.A00);
        if (z) {
            String str4 = r7.A00;
            if (str4 != null) {
                StringBuilder A10 = AnonymousClass000.A10();
                A10.append("(previous download origin: ");
                str = C17900vP.A0B(str4, A10);
            } else {
                str = null;
            }
            String str5 = A013.A0H;
            StringBuilder A15 = C108955ca.A15(str5);
            A15.append("new download started from ");
            A15.append(str2);
            ((StickerPackDownloader) r7.A0G.get()).A03(str5, C17890vO.A0Z(str, A15, ' '));
        }
        AtomicBoolean atomicBoolean = r7.A0I;
        if (atomicBoolean.get()) {
            atomicBoolean.set(false);
            C108945cZ.A0q(r9).A02(A012, AnonymousClass00R.A0C);
            r5.invoke(false);
            return;
        }
        r7.A01.set(A013.A0H);
        r7.A02.A0J(new AnonymousClass7QP(r7, A013, str2, r5, A012, i, z2, z3));
    }

    public /* synthetic */ AnonymousClass7QH(C188759hw r1, String str, C22821Di r3, int i, boolean z, boolean z2, boolean z3) {
        this.A01 = r1;
        this.A02 = str;
        this.A04 = z;
        this.A03 = r3;
        this.A05 = z2;
        this.A00 = i;
        this.A06 = z3;
    }
}
