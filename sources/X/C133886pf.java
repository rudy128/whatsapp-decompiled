package X;

import com.whatsapp.util.Log;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6pf  reason: invalid class name and case insensitive filesystem */
public final class C133886pf {
    public final AnonymousClass00H A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;

    public final void A00(Runnable runnable) {
        if (!((C26501Sj) this.A01.get()).A03(C26551So.A0j, 0, 1048576, true, false, false, false, false)) {
            Log.i("InitialStickerPackDownloader/downloadInitialStickerPack/autodownload is not safe, going to do nothing");
            return;
        }
        C138326wt r3 = (C138326wt) this.A04.get();
        AnonymousClass7RQ.A02(r3.A01, r3, new AnonymousClass6HB(this, runnable), 13);
    }

    public final void A01(Runnable runnable, String str) {
        String str2;
        Object obj;
        AnonymousClass00H r4 = this.A01;
        C26551So r6 = C26551So.A0j;
        long j = 1048576;
        if (((C26501Sj) r4.get()).A03(r6, 0, 1048576, true, false, false, false, false)) {
            C138326wt r3 = (C138326wt) this.A04.get();
            List A022 = ((C139636zC) r3.A02.get()).A02();
            AnonymousClass7RQ.A00(r3.A00, r3, A022, 12);
            Iterator it = A022.iterator();
            while (true) {
                str2 = str;
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C18070vi.A18(((AnonymousClass725) obj).A0H, str2)) {
                    break;
                }
            }
            AnonymousClass725 r2 = (AnonymousClass725) obj;
            if (r2 != null) {
                if (!str2.equals(C18020vd.A01(C18040vf.A02, C17880vN.A0P(this.A00), 12188))) {
                    j = r2.A02;
                }
                if (((C26501Sj) r4.get()).A03(r6, 0, j, true, false, false, false, false)) {
                    AnonymousClass7RO.A01(C108945cZ.A0a(this.A02), this, r2, runnable, 4);
                    return;
                }
            } else {
                return;
            }
        }
        Log.i("InitialStickerPackDownloader/downloadInitialStickerPack/autodownload is not safe, going to do nothing");
    }

    public C133886pf(AnonymousClass00H r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0w(r1, r2, r3, r4, r5);
        this.A00 = r1;
        this.A02 = r2;
        this.A01 = r3;
        this.A03 = r4;
        this.A04 = r5;
    }
}
