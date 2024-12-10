package X;

import android.content.Intent;
import android.os.SystemClock;
import java.lang.ref.WeakReference;

/* renamed from: X.4oZ  reason: invalid class name and case insensitive filesystem */
public final class C96884oZ implements C107535aB {
    public final C36341nj A00;
    public final AnonymousClass00H A01;
    public final Integer A02;
    public final WeakReference A03;

    public void C7g(AnonymousClass1BI r16, Long l, int i, long j) {
        Intent intent;
        String str;
        AnonymousClass1BI r10 = r16;
        C18070vi.A0d(r10, 0);
        AnonymousClass1FU r5 = (AnonymousClass1FU) this.A03.get();
        if (r5 != null) {
            C36341nj r4 = this.A00;
            r4.A06(r5);
            Integer num = this.A02;
            r5.CEx();
            int A002 = AnonymousClass4H6.A00(num);
            C98494rF A003 = C98494rF.A00();
            AnonymousClass00H r9 = r4.A0F;
            r9.get();
            Intent putExtra = AnonymousClass1LU.A0C(r5, A002).putExtra("jid", r10.getRawString()).putExtra("start_t", SystemClock.uptimeMillis());
            C18070vi.A0X(putExtra);
            A003.element = putExtra;
            int i2 = i;
            putExtra.putExtra("extra_forwarded_message_thread_type", i2);
            long j2 = j;
            if (!(j == -1 || j == 0)) {
                if (C18020vd.A05(C18040vf.A02, C17880vN.A0P(r4.A02), 4682)) {
                    AnonymousClass206 A022 = ((C32471hF) r4.A0C.get()).A02((C29681ch) r10, j2);
                    if (A022 != null) {
                        r9.get();
                        AnonymousClass205 r92 = A022.A0v;
                        Intent putExtra2 = AnonymousClass1LU.A0C(r5, A002).putExtra("jid", C22971Dz.A06(r92.A00)).putExtra("start_t", SystemClock.uptimeMillis()).putExtra("row_id", A022.A0x).putExtra("sort_id", A022.A0y);
                        AnonymousClass4aU.A00(putExtra2, r92);
                        C18070vi.A0X(putExtra2);
                        A003.element = putExtra2;
                        putExtra2.putExtra("extra_forwarded_message_thread_type", i2);
                        if (AnonymousClass25A.A0p(A022)) {
                            intent = (Intent) A003.element;
                            str = "show_revoked_newsletter_message_dialog";
                        }
                    } else {
                        intent = (Intent) A003.element;
                        str = "show_expired_newsletter_message_dialog";
                    }
                    intent.putExtra(str, true);
                }
            }
            ((Intent) A003.element).putExtra("similar_newsletters_session_id", l);
            ((AnonymousClass1KB) r4.A06.get()).A0J(new C21435Ak2(r4, r5, A003, 3));
        }
    }

    public C96884oZ(AnonymousClass1FU r2, C36341nj r3, AnonymousClass00H r4, Integer num) {
        this.A00 = r3;
        this.A02 = num;
        this.A01 = r4;
        this.A03 = AnonymousClass3MW.A0z(r2);
    }
}
