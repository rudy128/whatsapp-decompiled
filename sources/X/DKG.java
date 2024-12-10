package X;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;

public final class DKG implements E5V {
    public final Location BTq(C25260Cbz cbz) {
        Context context;
        String str;
        boolean z = true;
        C18210vx.A07(AnonymousClass000.A1W(cbz), "GoogleApiClient parameter is required.");
        C24599CAv cAv = C24733CHv.A00;
        if (cbz instanceof BZB) {
            BZB bzb = (BZB) cbz;
            EDS eds = (EDS) bzb.A0D.get(cAv);
            C18210vx.A02(eds, "Appropriate Api was not requested.");
            C23018BZu bZu = (C23018BZu) eds;
            if (bZu == null) {
                z = false;
            }
            C18210vx.A08(z, "GoogleApiClient is not configured to use the LocationServices.API Api. Pass thisinto GoogleApiClient.Builder#addApi() to use this feature.");
            if (cbz instanceof BZA) {
                context = ((BZA) cbz).A00.A01;
            } else {
                context = bzb.A04;
            }
            if (Build.VERSION.SDK_INT >= 30 && context != null) {
                try {
                    str = (String) C108995ce.A0V(Context.class, context, "getAttributionTag");
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                }
                return bZu.A0B(str);
            }
            str = null;
            try {
                return bZu.A0B(str);
            } catch (Exception unused2) {
                return null;
            }
        } else {
            throw C17880vN.A0y();
        }
    }
}
