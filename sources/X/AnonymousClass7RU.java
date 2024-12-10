package X;

import android.content.Context;
import android.webkit.URLUtil;
import com.whatsapp.util.Log;
import com.whatsapp.wamsys.JniBridge;
import java.io.File;
import java.net.URL;
import java.util.concurrent.Executor;

/* renamed from: X.7RU  reason: invalid class name */
public abstract class AnonymousClass7RU implements Runnable, C72283Li, AnonymousClass87M {
    public C1607389s A00;
    public final C144807It A01;

    public static final void A01(AnonymousClass7RU r1, boolean z) {
        C1607389s r0;
        synchronized (r1) {
            r0 = r1.A00;
        }
        if (r0 == null) {
            return;
        }
        if (z) {
            r0.BEQ();
        } else {
            r0.cancel();
        }
    }

    public C136996uk A02(C1409173o r4) {
        C136996uk r2;
        C1418377d r1;
        if (this instanceof C1195368n) {
            r2 = new C136996uk();
            r1 = ((C1195368n) this).A01;
        } else if ((this instanceof C1194968j) || (this instanceof C1195068k) || (this instanceof C1195268m) || (this instanceof C1194868i) || (this instanceof C1195168l) || (this instanceof C1194768h)) {
            return new C136996uk();
        } else {
            r2 = new C136996uk();
            r1 = ((C1195568p) this).A01;
        }
        int i = r1.A03;
        synchronized (r2) {
            r2.A0A = Integer.valueOf(i);
        }
        int i2 = r1.A02;
        synchronized (r2) {
            r2.A09 = Integer.valueOf(i2);
        }
        r2.A0E(r4.A03());
        r2.A08();
        return r2;
    }

    public C126026c4 A03() {
        C126026c4 r3;
        C1607389s r32;
        try {
            Object A04 = A04();
            if (this instanceof C1195468o) {
                C1195468o r1 = (C1195468o) this;
                C130366jJ r0 = (C130366jJ) A04;
                C18070vi.A0d(r0, 0);
                C129086hE r8 = new C129086hE(new C144837Iw(r1.A02, r1.A03, r0.A04), r0.A02, r0.A05, r0.A06);
                AnonymousClass70W r7 = r0.A00;
                if (r7 == null) {
                    r7 = new AnonymousClass70W(r0.A01, 0);
                }
                AnonymousClass11P r5 = r1.A01;
                r32 = new C147067Rr(r1.A00, r5, r1.A04, r7, r8, this, r1.A05, r0.A03);
            } else {
                C1194668g r12 = (C1194668g) this;
                C130356jI r02 = (C130356jI) A04;
                C18070vi.A0d(r02, 0);
                C129736iH r10 = new C129736iH(new C144837Iw(r12.A02, r12.A03, r02.A03), r02.A01, r02.A02, r02.A04, r02.A05);
                AnonymousClass11P r52 = r12.A01;
                r32 = new C144817Iu(r12.A00, r52, r12.A04, r10, r02.A00, this, r12.A05);
            }
            synchronized (this) {
                if (this.A00 != null) {
                    Log.e("Attempt to run same download multiple times");
                    r3 = new C126026c4(new C1409173o(24));
                } else {
                    this.A00 = r32;
                    r3 = r32.BJE();
                }
            }
        } catch (C122886Sh e) {
            r3 = new C126026c4(new C1409173o(e.downloadStatus));
        }
        C1409173o r2 = r3.A00;
        int i = r2.A01;
        if (i == 13 || i == 24) {
            this.A01.BsC(r2.A05);
            return r3;
        }
        this.A01.BsD(r2, A02(r2));
        return r3;
    }

    public Object A04() {
        String str;
        String str2;
        C1602387r r3;
        File file;
        C26551So r2;
        if (this instanceof C1195368n) {
            C1195368n r0 = (C1195368n) this;
            r3 = new C696137w(r0.A01.A0I);
            file = r0.A03;
            r2 = C26551So.A0j;
        } else if (this instanceof C1194968j) {
            C1194968j r02 = (C1194968j) this;
            String str3 = r02.A00.A05;
            C17960vV.A07(str3);
            r3 = new C696137w(str3);
            file = r02.A03;
            r2 = C26551So.A0E;
        } else if (this instanceof C1195068k) {
            C1195068k r03 = (C1195068k) this;
            String str4 = r03.A08;
            AnonymousClass2NY r7 = new AnonymousClass2NY(r03.A05, C17970vW.A04(str4), "ppic", (String) null, str4, (String) null);
            Context context = r03.A04.A00;
            String guessFileName = URLUtil.guessFileName(AnonymousClass001.A1H("https://pps.whatsapp.net", str4, C108955ca.A15(context)), (String) null, (String) null);
            File A0e = C17880vN.A0e(context.getCacheDir(), "NewsletterProfilePictureTemp");
            A0e.mkdirs();
            File A0e2 = C17880vN.A0e(A0e, guessFileName);
            r03.A00 = A0e2;
            return new C130366jJ((AnonymousClass70W) null, C26551So.A0E, r7, (C58092k8) null, A0e2, (String) null, false);
        } else if (this instanceof C1195268m) {
            C1195268m r04 = (C1195268m) this;
            C33581j3 r22 = r04.A08;
            r22.A03(C49432Ql.EXPRESS_PATH_MEDIA_AUTO);
            C32361h4 r32 = r22.A04;
            AnonymousClass1TI r23 = r04.A0D;
            C18070vi.A0d(r23, 0);
            r32.A00.A03(r23, (Executor) null);
            String str5 = r04.A0B.A03;
            C17960vV.A07(str5);
            C696137w r15 = new C696137w(str5);
            File file2 = r04.A0G;
            C26551So r14 = r04.A0A;
            AnonymousClass68q r13 = r04.A09;
            String A02 = C25291Nq.A02(r04.A03);
            return new C130366jJ(r13, r14, r15, new C58092k8(r04.A04, r04.A0E, Integer.valueOf((int) r13.A0F), A02, r14.A02, "full", (String) null, false), file2, (String) null, false);
        } else if (this instanceof C1194868i) {
            C1194868i r05 = (C1194868i) this;
            r3 = new C696037v(r05.A03, r05.A02);
            file = r05.A01;
            r2 = r05.A00;
        } else if (this instanceof C1195168l) {
            C1195168l r06 = (C1195168l) this;
            r06.A0B = true;
            C18030ve r5 = r06.A03;
            C55782gM r33 = r06.A04;
            String str6 = r33.A05;
            String str7 = r33.A04;
            AnonymousClass2NY r16 = new AnonymousClass2NY(r5, str6, "ppic", (String) null, str7, (String) null);
            Context context2 = r06.A02.A00;
            URL url = r33.A06;
            int i = r33.A02;
            File A002 = AnonymousClass1U9.A00(context2, str7, url, i);
            r06.A0A = A002;
            C26551So r152 = C26551So.A0E;
            if (i == 1) {
                str2 = "manual";
            } else {
                str2 = "full";
            }
            JniBridge jniBridge = r06.A07;
            C18070vi.A0e(r5, 1, jniBridge);
            C58092k8 r4 = new C58092k8(r5, jniBridge, (Integer) null, "profile_picture", "ppic", str2, (String) null, false);
            C18070vi.A0d(r152, 3);
            return new C130366jJ((AnonymousClass70W) null, r152, r16, r4, A002, (String) null, false);
        } else if (this instanceof C1194768h) {
            C1194768h r07 = (C1194768h) this;
            C115295ti r34 = r07.A00;
            C139666zF r24 = r34.A0e;
            String str8 = r24.A0F;
            C26551So r52 = r24.A0A;
            if (C63972u0.A06(r52)) {
                str = r24.A0H;
            } else {
                str = r24.A0G;
            }
            String str9 = r52.A02;
            if (str != null) {
                AnonymousClass2NY r6 = new AnonymousClass2NY((C18030ve) null, str, str9, "mms", str8, (String) null);
                File file3 = r34.A02;
                return new C130366jJ(r34.A0k, r52, r6, C115295ti.A01(r34), file3, AnonymousClass74L.A07(r24.A0J), r07.A01);
            }
            throw AnonymousClass000.A0n("Required value was null.");
        } else {
            C1195568p r08 = (C1195568p) this;
            C25311Ns r1 = r08.A00;
            C1418377d r42 = r08.A01;
            String str10 = r42.A0F;
            File A0I = r1.A00.A0I();
            StringBuilder A10 = AnonymousClass000.A10();
            C108995ce.A1N(A10, str10);
            File A0e3 = C17880vN.A0e(A0I, AnonymousClass000.A0y(".tmp", A10));
            String str11 = r42.A0A;
            if (str11 != null) {
                String str12 = r42.A0D;
                if (str12 != null) {
                    return new C130356jI(C26551So.A0j, new AnonymousClass2NY((C18030ve) null, str11, "sticker", "mms", r42.A08, (String) null), A0e3, r08.A03, str12, r42.A0F);
                }
                Log.e("StickerBitmapNetworkFetcher/StickerDownload/makeRequest failed to find media key for sticker");
                throw new C122886Sh(29);
            }
            Log.e("StickerBitmapNetworkFetcher/StickerDownload/makeRequest failed to find enc file hash for sticker");
            throw new C122886Sh(27);
        }
        return new C130366jJ((AnonymousClass70W) null, r2, r3, (C58092k8) null, file, (String) null, false);
    }

    public void BB6(BC9 bc9) {
        C144807It r4 = this.A01;
        AnonymousClass1TJ r2 = r4.A01;
        C21133Af1 af1 = new C21133Af1(bc9, r4, 6);
        Executor executor = r4.A03;
        r2.A03(af1, executor);
        r4.A02.A03(new C21133Af1(bc9, r4, 7), executor);
        r4.A00.A03(new C21133Af1(bc9, r4, 8), executor);
    }

    public void BEU(boolean z) {
        String str;
        if (this instanceof C1195568p) {
            str = "StickerBitmapNetworkFetcher/StickerDownload/cancelMediaDownload attempted to cancel download";
        } else {
            if (this instanceof C1195368n) {
                str = "AvatarStickerBitmapNetworkFetcher/StickerDownload/cancelMediaDownload attempted to cancel download";
            }
            A01(this, false);
        }
        Log.i(str);
        A01(this, false);
    }

    public void BsB(long j) {
        this.A01.BsA(j);
    }

    public AnonymousClass7RU(Executor executor) {
        this.A01 = new C144807It(executor);
    }

    public void run() {
        A03();
    }
}
