package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.whatsapp.WaTextView;
import java.util.List;

/* renamed from: X.8Hk  reason: invalid class name and case insensitive filesystem */
public final class C161708Hk extends C38391rD {
    public int A00 = -1;
    public boolean A01;
    public boolean A02 = true;
    public final AnonymousClass9YX A03;
    public final List A04 = AnonymousClass000.A13();

    public C161708Hk(AnonymousClass9YX r2) {
        this.A03 = r2;
    }

    public void Bmc(C42011xT r7, int i) {
        String A0m;
        WaTextView waTextView;
        C18070vi.A0d(r7, 0);
        if (r7 instanceof C161988In) {
            boolean z = true;
            int i2 = i - 1;
            C20263ADv aDv = (C20263ADv) this.A04.get(i2);
            C161988In r5 = (C161988In) r7;
            boolean A1T = AnonymousClass000.A1T(this.A00, i2);
            C18070vi.A0d(aDv, 0);
            r5.A01.setText(aDv.A00);
            r5.A02.setText(aDv.A01);
            r5.A00.setChecked(A1T);
            View view = r7.A0H;
            view.setOnClickListener(new C177679Ad(aDv, i2, 7, this));
            if (this.A00 != i2) {
                z = false;
            }
            view.setSelected(z);
            return;
        }
        if (r7 instanceof C161858Ia) {
            A0m = AnonymousClass3MY.A0m(r7.A0H.getResources(), 2131894193);
            waTextView = ((C161858Ia) r7).A00;
        } else if (r7 instanceof AnonymousClass8IZ) {
            A0m = AnonymousClass3MY.A0m(r7.A0H.getResources(), 2131894201);
            waTextView = ((AnonymousClass8IZ) r7).A00;
        } else {
            return;
        }
        waTextView.setText(A0m);
    }

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater;
        int i2;
        C18070vi.A0d(viewGroup, 0);
        if (i == 0) {
            return new C161988In(AnonymousClass3MX.A0B(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131625686, false));
        }
        if (i == 2) {
            return new C161858Ia(AnonymousClass3MX.A0B(AnonymousClass3MY.A0B(viewGroup), viewGroup, 2131625684, false));
        }
        if (i != 3) {
            layoutInflater = AnonymousClass3MY.A0B(viewGroup);
            i2 = 2131625685;
            if (i != 4) {
                return new AnonymousClass8IZ(AnonymousClass3MX.A0B(layoutInflater, viewGroup, 2131625640, false));
            }
        } else {
            layoutInflater = AnonymousClass3MY.A0B(viewGroup);
            i2 = 2131625687;
        }
        return new C42011xT(AnonymousClass3MX.A0B(layoutInflater, viewGroup, i2, false));
    }

    public int A0Q() {
        if (this.A01) {
            return 0;
        }
        if (this.A02) {
            return 3;
        }
        List list = this.A04;
        if (list.size() > 0) {
            return list.size() + 1;
        }
        return 1;
    }

    public int getItemViewType(int i) {
        boolean z = this.A02;
        if (i == 0) {
            if (z) {
                return 4;
            }
            if (this.A04.size() > 0) {
                return 2;
            }
            return 1;
        } else if (z) {
            return 3;
        } else {
            return 0;
        }
    }
}
