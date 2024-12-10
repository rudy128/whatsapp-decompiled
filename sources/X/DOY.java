package X;

import android.content.Context;

public final class DOY implements E6Q {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Integer A01;

    public DOY(Context context, Integer num) {
        this.A00 = context;
        this.A01 = num;
    }

    public final boolean BeR() {
        Context context = this.A00;
        int intValue = this.A01.intValue();
        if (intValue == 0) {
            return true;
        }
        if (intValue == 1 || (C108965cb.A03(context).uiMode & 48) != 32) {
            return false;
        }
        return true;
    }
}
