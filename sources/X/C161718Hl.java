package X;

import android.content.Context;
import android.os.CountDownTimer;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import java.util.List;

/* renamed from: X.8Hl  reason: invalid class name and case insensitive filesystem */
public final class C161718Hl extends C38391rD {
    public int A00 = -1;
    public B9Q A01;
    public boolean A02;
    public final Context A03;
    public final C18000vb A04;
    public final List A05;

    public void Bmc(C42011xT r14, int i) {
        WaTextView waTextView;
        String string;
        C42011xT r9 = r14;
        C18070vi.A0d(r14, 0);
        int i2 = r14.A01;
        boolean z = true;
        if (i2 == 0) {
            C162078Iw r92 = (C162078Iw) r9;
            C195499tR r8 = (C195499tR) this.A05.get(i);
            if (this.A00 == -1 && !r8.A06) {
                this.A00 = i;
            }
            WaImageView waImageView = r92.A02;
            waImageView.setImageResource(r8.A01);
            WaTextView waTextView2 = r92.A03;
            waTextView2.setText(r8.A03);
            CompoundButton compoundButton = r92.A01;
            if (i != this.A00) {
                z = false;
            }
            compoundButton.setChecked(z);
            compoundButton.setClickable(false);
            View view = r92.A0H;
            C90024dP.A00(view, this, r92, 36);
            if (!r8.A06) {
                waTextView = r92.A04;
                string = r8.A04;
            } else {
                view.setEnabled(false);
                Context context = this.A03;
                C72463Mc.A0y(context, waTextView2, 2130969369, 2131103224);
                compoundButton.setEnabled(false);
                AnonymousClass8BS.A10(context, waImageView, 2131103156);
                if (r8.A00 < 0) {
                    waTextView = r92.A04;
                    string = context.getString(2131890348);
                } else {
                    CountDownTimer countDownTimer = r92.A00;
                    if (countDownTimer != null) {
                        countDownTimer.cancel();
                    }
                    C161198Ce r6 = new C161198Ce(this, r8, r92, 2, r8.A00);
                    r92.A00 = r6;
                    r6.start();
                    return;
                }
            }
            waTextView.setText(string);
        } else if (i2 == 1) {
            r14.A0H.setOnClickListener(new C90104dX(this, i, 25));
        }
    }

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        if (i == 0) {
            return new C162078Iw(AnonymousClass3MY.A0E(LayoutInflater.from(this.A03), viewGroup, 2131626699), this);
        }
        if (i == 1) {
            return new C161878Ic(AnonymousClass3MY.A0E(LayoutInflater.from(this.A03), viewGroup, 2131626857), this);
        }
        throw AnonymousClass000.A0k("Invalid view type");
    }

    public int A0Q() {
        List list = this.A05;
        if (list.size() <= 3 || this.A02) {
            return list.size();
        }
        return 4;
    }

    public int getItemViewType(int i) {
        if (this.A02 || i != 3) {
            return 0;
        }
        return 1;
    }

    public C161718Hl(Context context, C18000vb r3, List list) {
        this.A03 = context;
        this.A05 = list;
        this.A04 = r3;
    }
}
