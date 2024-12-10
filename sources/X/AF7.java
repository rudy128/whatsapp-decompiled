package X;

import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;

public class AF7 implements TextWatcher {
    public Runnable A00;
    public final DOZ A01;
    public final DFL A02;
    public final long A03;
    public final Handler A04 = C17890vO.A0D();
    public final ALI A05;

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.A05.A05 = charSequence.toString();
        DFL dfl = this.A02;
        E8A A0A = dfl.A0A(56);
        if (A0A != null) {
            long j = this.A03;
            if (j <= 0) {
                C26209Cul.A01(this.A01, dfl, C20046A4p.A00(new C20046A4p(), charSequence.toString(), 0), A0A);
                return;
            }
            Runnable runnable = this.A00;
            if (runnable != null) {
                this.A04.removeCallbacks(runnable);
            }
            C21455AkM akM = new C21455AkM(this, A0A, charSequence, 41);
            this.A00 = akM;
            this.A04.postDelayed(akM, j);
        }
    }

    public AF7(DOZ doz, DFL dfl, ALI ali, long j) {
        this.A02 = dfl;
        this.A01 = doz;
        this.A05 = ali;
        this.A03 = j;
    }
}
