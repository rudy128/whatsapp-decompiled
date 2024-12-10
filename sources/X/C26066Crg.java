package X;

import com.whatsapp.search.views.itemviews.AudioPlayerView;

/* renamed from: X.Crg  reason: case insensitive filesystem */
public abstract class C26066Crg {
    public static String A01(C18000vb r2, C441822l r3) {
        if (r3.A0D != 0) {
            return BE7.A0j(r2, r3.A0D);
        }
        return C88584aA.A02(r2, r3.A01);
    }

    public static void A03(C18000vb r4, C441822l r5, C28539E6n e6n, AudioPlayerView audioPlayerView) {
        int intValue;
        long j;
        Number A1D = C108945cZ.A1D(r5.A0v, C145777Mo.A17);
        if (A1D == null) {
            intValue = 0;
        } else {
            intValue = A1D.intValue();
        }
        Integer valueOf = Integer.valueOf(intValue);
        int i = 0;
        audioPlayerView.setPlayButtonState(0);
        audioPlayerView.setSeekbarMax(r5.A0D * 1000);
        if (valueOf != null) {
            i = intValue;
        }
        audioPlayerView.setSeekbarProgress(i);
        if (valueOf != null) {
            j = (long) intValue;
        } else {
            j = 0;
        }
        audioPlayerView.setSeekbarContentDescription(j);
        e6n.C0o(1, BE7.A0j(r4, r5.A0D));
    }

    public static String A00(C18000vb r1, C441822l r2) {
        if (AnonymousClass25A.A11(r2) || AnonymousClass25A.A12(r2)) {
            return BE7.A0j(r1, r2.A0D);
        }
        return A01(r1, r2);
    }

    public static void A02(C160838Ad r3, C31131f4 r4, C18000vb r5, C441822l r6, C28539E6n e6n, AudioPlayerView audioPlayerView) {
        if (!r4.A0D(r6) || r4.A0C()) {
            A03(r5, r6, e6n, audioPlayerView);
            return;
        }
        C145777Mo A00 = r4.A00();
        if (A00 != null) {
            if (!A00.A0I()) {
                A03(r5, r6, e6n, audioPlayerView);
            } else {
                audioPlayerView.setPlayButtonState(1);
                e6n.C0o(0, BE7.A0j(r5, A00.A09() / 1000));
            }
            audioPlayerView.setSeekbarContentDescription((long) A00.A09());
            A00.A0H = r3;
        }
    }
}
