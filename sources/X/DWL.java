package X;

import android.widget.TextView;

public final /* synthetic */ class DWL implements C18140vp {
    public final /* synthetic */ int A00;
    public final /* synthetic */ TextView A01;
    public final /* synthetic */ Bq8 A02;

    public final Object get() {
        Bq8 bq8 = this.A02;
        return Float.valueOf((((float) this.A00) + BE9.A03(bq8.A0B)) - ((float) this.A01.getTop()));
    }

    public /* synthetic */ DWL(TextView textView, Bq8 bq8, int i) {
        this.A02 = bq8;
        this.A00 = i;
        this.A01 = textView;
    }
}
