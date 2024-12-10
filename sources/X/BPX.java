package X;

import android.content.Context;

public class BPX extends C22797BPk {
    public String A00 = "";
    public String A01;
    public final int A02;
    public final C25007CTh A03;

    public BPX(Context context, C25007CTh cTh, int i) {
        super(context, i);
        int i2 = C108965cb.A08(context).densityDpi;
        int i3 = 320;
        if (i2 <= 320) {
            i3 = 250;
            if (i2 <= 250) {
                i3 = 72;
            }
        }
        this.A02 = i3;
        this.A03 = cTh;
    }
}
