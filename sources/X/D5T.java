package X;

import android.view.View;
import android.widget.CompoundButton;
import android.widget.Switch;

public class D5T implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C23690Bnx A01;
    public final /* synthetic */ DOZ A02;
    public final /* synthetic */ DFL A03;
    public final /* synthetic */ E8A A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public D5T(View view, C23690Bnx bnx, DOZ doz, DFL dfl, E8A e8a, boolean z, boolean z2) {
        this.A01 = bnx;
        this.A06 = z;
        this.A00 = view;
        this.A05 = z2;
        this.A04 = e8a;
        this.A03 = dfl;
        this.A02 = doz;
    }

    public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        if (this.A06) {
            Switch switchR = ((BIR) ((C28588E9c) this.A00)).A00;
            switchR.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            switchR.setChecked(this.A05);
            switchR.setOnCheckedChangeListener(this);
        }
        E8A e8a = this.A04;
        if (e8a != null) {
            DFL dfl = this.A03;
            C20046A4p A0J = C108985cd.A0J(dfl);
            A0J.A03(Boolean.valueOf(z), 1);
            C26209Cul.A04(this.A02, dfl, A0J, e8a, 2);
        }
    }
}
