package X;

import android.app.Activity;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.28O  reason: invalid class name */
public class AnonymousClass28O extends C39711tW {
    public int A00 = 0;
    public final /* synthetic */ int A01;
    public final /* synthetic */ Activity A02;
    public final /* synthetic */ C36711oL A03;

    public AnonymousClass28O(Activity activity, C36711oL r3, int i) {
        this.A03 = r3;
        this.A01 = i;
        this.A02 = activity;
    }

    public void A03(RecyclerView recyclerView, int i) {
        if (i == 0) {
            this.A03.A01();
        } else if (i == 1 && this.A00 == 0) {
            this.A03.A03(this.A02.getWindow(), this.A01);
        }
        this.A00 = i;
    }
}
