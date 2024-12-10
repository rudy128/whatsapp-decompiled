package X;

import com.google.android.gms.common.api.Status;
import java.util.List;

public final class DL2 implements EDV {
    public final List A00;
    public final Status A01;

    public DL2(Status status, List list) {
        this.A01 = status;
        this.A00 = list;
    }

    public final Status BZg() {
        return this.A01;
    }
}
