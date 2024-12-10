package X;

import android.content.Context;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Executor;

/* renamed from: X.9nQ  reason: invalid class name and case insensitive filesystem */
public class C191929nQ {
    public C22397B6a A00;
    public List A01 = AnonymousClass000.A13();
    public Set A02;
    public Set A03 = C17880vN.A14();
    public Executor A04;
    public Executor A05;
    public boolean A06;
    public boolean A07;
    public boolean A08 = true;
    public final Context A09;
    public final C189169id A0A = new C189169id();
    public final String A0B;
    public final List A0C = AnonymousClass000.A13();
    public final List A0D = AnonymousClass000.A13();

    public C191929nQ(Context context, String str) {
        this.A09 = context;
        this.A0B = str;
    }

    public void A00(C199079zO... r5) {
        Set set = this.A02;
        if (set == null) {
            set = C17880vN.A12();
            this.A02 = set;
        }
        C199079zO r2 = r5[0];
        set.add(Integer.valueOf(r2.A01));
        Set set2 = this.A02;
        C18070vi.A0b(set2);
        set2.add(Integer.valueOf(r2.A00));
        this.A0A.A00((C199079zO[]) Arrays.copyOf(r5, 1));
    }
}
