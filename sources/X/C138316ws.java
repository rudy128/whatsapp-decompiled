package X;

import android.content.Context;
import com.whatsapp.dialogs.ProgressDialogFragment;
import java.lang.ref.WeakReference;

/* renamed from: X.6ws  reason: invalid class name and case insensitive filesystem */
public final class C138316ws {
    public ProgressDialogFragment A00;
    public final AnonymousClass1KB A01;
    public final AnonymousClass6GK A02;
    public final AnonymousClass10I A03;

    public C138316ws(AnonymousClass1KB r1, AnonymousClass6GK r2, AnonymousClass10I r3) {
        C18070vi.A0j(r3, r1);
        this.A03 = r3;
        this.A01 = r1;
        this.A02 = r2;
    }

    public static final void A00(AnonymousClass72S r7, AnonymousClass206 r8, C138316ws r9, WeakReference weakReference) {
        String str;
        Context A0F = C108945cZ.A0F(weakReference);
        if (A0F != null) {
            AnonymousClass73D r6 = new AnonymousClass73D();
            r6.A06(r7);
            C139416yo r5 = new C139416yo(A0F);
            r5.A01 = 55;
            r5.A0I = AnonymousClass1ZU.A05(r7.A0X);
            C139416yo.A00(r6, r5);
            r5.A0D = C29671cg.A00.getRawString();
            r5.A0P = true;
            if (r8 instanceof AnonymousClass21V) {
                str = ((AnonymousClass21V) r8).A18();
            } else {
                str = "";
            }
            r5.A0C = str;
            r5.A02 = 45;
            AnonymousClass7RO.A01(r9.A01, A0F, r9, r5.A01(), 0);
        }
    }
}
