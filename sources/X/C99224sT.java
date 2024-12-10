package X;

import android.content.Context;
import android.widget.CompoundButton;
import android.widget.RadioGroup;
import com.whatsapp.util.Log;
import java.util.List;

/* renamed from: X.4sT  reason: invalid class name and case insensitive filesystem */
public class C99224sT implements C18080vj, C22821Di {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C99224sT(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj4;
        this.A03 = obj3;
        this.A04 = obj;
    }

    public final Object invoke(Object obj) {
        if (this.A00 != 0) {
            RadioGroup radioGroup = (RadioGroup) this.A01;
            int[] iArr = (int[]) this.A02;
            List list = (List) this.A03;
            RadioGroup.OnCheckedChangeListener onCheckedChangeListener = (RadioGroup.OnCheckedChangeListener) this.A04;
            int A0M = AnonymousClass000.A0M(obj);
            C18070vi.A0d(iArr, 1);
            C18070vi.A0k(list, onCheckedChangeListener);
            if (A0M != C72483Me.A05(radioGroup, radioGroup.getCheckedRadioButtonId())) {
                radioGroup.setOnCheckedChangeListener((RadioGroup.OnCheckedChangeListener) null);
                int i = 0;
                do {
                    if (iArr[i] == A0M) {
                        ((CompoundButton) list.get(i)).setChecked(true);
                    }
                    i++;
                } while (i < 4);
                radioGroup.setOnCheckedChangeListener(onCheckedChangeListener);
            }
        } else {
            AnonymousClass4Q2 r1 = (AnonymousClass4Q2) this.A01;
            C93834jc r6 = (C93834jc) this.A02;
            Context context = (Context) this.A03;
            C21132Af0 af0 = (C21132Af0) this.A04;
            C18070vi.A0d(r1, 0);
            C18070vi.A0f(af0, 3, obj);
            if (obj instanceof C76923oo) {
                r1.A00.C3e(new AnonymousClass4YL(AnonymousClass00R.A00, (Integer) null, (Integer) null));
                r6.BEO();
            } else {
                Log.i("ChatLockAuthCallbackBase/authfail");
                r1.A00.C3e(new AnonymousClass4YL(AnonymousClass00R.A0Y, (Integer) null, (Integer) null));
                C73193Ri A002 = C73193Ri.A00(context);
                A002.A0V(2131891335);
                A002.A0U(2131891336);
                A002.A0X(new C1411874q(13), 2131891334);
                A002.create();
                A002.A0C();
            }
            af0.A0B(obj);
        }
        return C27621Wu.A00;
    }
}
