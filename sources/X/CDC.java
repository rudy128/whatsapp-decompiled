package X;

import android.content.Context;
import java.io.File;
import java.util.concurrent.TimeUnit;

public abstract class CDC {
    public static final C26052CrM A00(Context context, File file) {
        context.getResources().getDisplayMetrics();
        C25186Cac cac = new C25186Cac();
        C24322BzJ bzJ = C24322BzJ.VIDEO;
        CXD cxd = new CXD(file);
        cxd.A03 = null;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        C26010CqR cqR = new C26010CqR(bzJ, "main", timeUnit.toMicros(0));
        cqR.A00(1.0f);
        C25833Cmm.A00(cac, cqR, cxd.A00());
        C24322BzJ bzJ2 = C24322BzJ.AUDIO;
        CXD cxd2 = new CXD(file);
        cxd2.A03 = null;
        C26010CqR cqR2 = new C26010CqR(bzJ2, "main", timeUnit.toMicros(0));
        cqR2.A00(1.0f);
        C25833Cmm.A00(cac, cqR2, cxd2.A00());
        return new C26052CrM(cac);
    }
}
