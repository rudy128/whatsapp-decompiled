package X;

import com.facebook.graphql.calls.GraphQlCallInput;
import com.whatsapp.dobverification.common.CommonRemediationApi;
import com.whatsapp.infra.graphql.generated.youth.SubmitAgeResponseImpl;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.1Pb  reason: invalid class name and case insensitive filesystem */
public final class C25651Pb implements AnonymousClass1PZ {
    public final AnonymousClass11S A00;
    public final AnonymousClass1PY A01;
    public final AnonymousClass11P A02;
    public final CommonRemediationApi A03;

    public C25651Pb(AnonymousClass11S r2, AnonymousClass11P r3, CommonRemediationApi commonRemediationApi, AnonymousClass1PY r5) {
        C18070vi.A0d(r5, 1);
        C18070vi.A0d(r2, 2);
        C18070vi.A0d(r3, 3);
        this.A01 = r5;
        this.A00 = r2;
        this.A02 = r3;
        this.A03 = commonRemediationApi;
    }

    public Object Bk1(String str, String str2, C30391dr r4) {
        return this.A03.Bk1(str, str2, r4);
    }

    public static final C143917Fh A00(A6Z a6z) {
        Integer num;
        new C26941Uc(a6z);
        int BOq = a6z.A02().BOq();
        if (BOq == 417) {
            num = AnonymousClass00R.A0C;
        } else if (BOq != 471) {
            num = AnonymousClass00R.A01;
        } else {
            num = AnonymousClass00R.A00;
        }
        return new C143917Fh(num);
    }

    public Object A01(C30391dr r7, int i, int i2, int i3) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        gregorianCalendar.setTime(new Date(System.currentTimeMillis()));
        if (i > gregorianCalendar.get(1)) {
            return new C143917Fh(AnonymousClass00R.A0C);
        }
        C189819ju r2 = GraphQlCallInput.A02;
        Integer num = new Integer(i);
        C162478Kx A002 = r2.A00();
        C162478Kx.A01(A002, num, "year");
        C25411Oc r0 = C124566Yv.A01;
        int i4 = r0.A00;
        if (i2 <= r0.A01 && i4 <= i2) {
            C162478Kx.A01(A002, new Integer(i2 + 1), "month");
        }
        C25411Oc r02 = C124566Yv.A00;
        int i5 = r02.A00;
        if (i3 <= r02.A01 && i5 <= i3) {
            C162478Kx.A01(A002, new Integer(i3), "day");
        }
        C162478Kx A003 = r2.A00();
        A003.A06(A002, "dob");
        A7K a7k = new A7K();
        a7k.A00.A02().A06(A003, "input");
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C71053Dp.A01;
        C71053Dp r4 = new C71053Dp(C30581eB.A02(r7));
        this.A01.A01(new AIj(a7k, SubmitAgeResponseImpl.class, "SubmitAge")).A04(new AnonymousClass7S8(this, r4, 3));
        return r4.A00();
    }
}
