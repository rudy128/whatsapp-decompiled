package X;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.util.concurrent.TimeUnit;

/* renamed from: X.CdY  reason: case insensitive filesystem */
public abstract class C25327CdY {
    public static long A00(Context context, E7q e7q, C24322BzJ bzJ, CUT cut) {
        C26052CrM crM = cut.A06;
        if (crM != null) {
            return C26162Ctb.A00(e7q, bzJ, crM, cut.A08.A02());
        }
        File file = cut.A0A;
        if (file != null) {
            long j = cut.A02;
            if (j < 0) {
                j = 0;
            }
            long j2 = cut.A00;
            if (j2 < 0) {
                Uri fromFile = Uri.fromFile(file);
                C18070vi.A0d(fromFile, 0);
                C25092CXd A00 = C25872Cng.A00(context, fromFile, false);
                if (A00 == null) {
                    return -1;
                }
                j2 = A00.A07;
            }
            return TimeUnit.MILLISECONDS.toMicros(j2 - j);
        }
        throw new C2Z("No input data source provided");
    }

    public static void A01(C28609EAd eAd, CUT cut) {
        C26052CrM crM = cut.A06;
        if (crM != null) {
            eAd.CIe(crM);
            return;
        }
        File file = cut.A0A;
        if (file != null) {
            eAd.CIf(file);
            eAd.CLG(new A5W(TimeUnit.MILLISECONDS, cut.A02, cut.A00));
            return;
        }
        throw new BW3("No valid data source provided");
    }
}
