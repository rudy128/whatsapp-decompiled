package X;

import android.app.Activity;
import android.widget.TextView;
import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.6Ls  reason: invalid class name and case insensitive filesystem */
public final class C121846Ls extends A34 {
    public ArrayList A00;
    public final C37551pj A01;
    public final AnonymousClass1M9 A02;
    public final String A03;
    public final WeakReference A04;

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        String A042;
        if (this.A04.get() != null) {
            String str = this.A03;
            if (!AnonymousClass1YF.A0T(str)) {
                if (this.A00 == null) {
                    ArrayList A13 = AnonymousClass000.A13();
                    this.A00 = A13;
                    this.A02.A0m(A13);
                }
                ArrayList arrayList = this.A00;
                if (arrayList != null) {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        AnonymousClass1E7 A0O = C17880vN.A0O(it);
                        UserJid A0x = AnonymousClass3MZ.A0x(A0O);
                        if (A0x != null && !this.A01.A0P(A0x) && (A042 = AnonymousClass17K.A04(A0x)) != null && A042.equals(str)) {
                            return A0O;
                        }
                    }
                }
            }
        }
        return null;
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        AnonymousClass1E7 r11 = (AnonymousClass1E7) obj;
        AnonymousClass7EL r5 = (AnonymousClass7EL) this.A04.get();
        if (r5 != null) {
            Activity activity = r5.A04;
            if (activity.isFinishing()) {
                return;
            }
            if (r11 != null) {
                r5.A01 = r11;
                C133996pq r1 = r5.A07;
                r1.A01(r11, C18070vi.A0F(activity, 2131888764));
                String A0F = C18070vi.A0F(activity, 2131897875);
                C90004dN r3 = new C90004dN(r5, r11, 23);
                C28931bI r12 = r1.A05;
                ((TextView) r12.A02()).setText(A0F);
                AnonymousClass3MY.A0I(r12, 0).setOnClickListener(r3);
                return;
            }
            String str = r5.A02;
            if (str != null) {
                AnonymousClass1OZ r7 = r5.A09;
                C678831f r6 = r5.A08;
                AnonymousClass6MQ r2 = new AnonymousClass6MQ(r5.A05, r5.A06, r5, r6, r7, C17880vN.A0h(), str);
                r5.A00 = r2;
                C17890vO.A0u(r2, r5.A0A);
            }
        }
    }

    public C121846Ls(C37551pj r2, AnonymousClass1M9 r3, AnonymousClass7EL r4, String str) {
        this.A03 = str;
        this.A02 = r3;
        this.A01 = r2;
        this.A04 = AnonymousClass3MW.A0z(r4);
    }
}
