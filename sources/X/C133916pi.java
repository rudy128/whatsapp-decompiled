package X;

import android.app.Application;
import android.content.Context;
import java.util.concurrent.Future;

/* renamed from: X.6pi  reason: invalid class name and case insensitive filesystem */
public final class C133916pi {
    public final AnonymousClass10I A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;
    public final AnonymousClass00H A04;

    public final void A00(Context context, AnonymousClass210 r14) {
        Integer num;
        AnonymousClass210 r9 = r14;
        C18070vi.A0d(r14, 1);
        Context context2 = context;
        C17960vV.A0G(!(context instanceof Application), "XFamilyTextStatusBurningManager/application context was passed in for scheduleTextStatusMediaPathUpdate");
        AnonymousClass00H r5 = this.A02;
        String A0w = C108955ca.A0w(r14);
        if (!((C128156fX) r5.get()).A00.containsKey(A0w)) {
            if (((C128156fX) r5.get()).A01.contains(A0w)) {
                C62422rN r0 = (C62422rN) this.A03.get();
                long j = r14.A0x;
                C62422rN.A00(r0);
                C001100p r1 = r0.A00;
                synchronized (r1) {
                    num = (Integer) r1.A05(j);
                }
                if (num == null || 4 != num.intValue()) {
                    return;
                }
            }
            Object obj = new Object();
            this.A00.CGF(new C146617Py(this, context2, r9, obj, 36));
            ((C128156fX) r5.get()).A00.put(A0w, obj);
        }
    }

    public final void A01(AnonymousClass210 r7) {
        C18070vi.A0d(r7, 0);
        AnonymousClass00H r5 = this.A02;
        String A0w = C108955ca.A0w(r7);
        Future future = (Future) ((C128156fX) r5.get()).A00.get(A0w);
        if (future != null) {
            String str = (String) future.get();
            long j = r7.A0x;
            C18070vi.A0b(str);
            ((AnonymousClass72Q) this.A04.get()).A04(j, str);
            C128156fX r1 = (C128156fX) r5.get();
            r1.A00.remove(A0w);
            r1.A01.add(A0w);
        }
    }

    public C133916pi(AnonymousClass10I r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4, AnonymousClass00H r5) {
        C18070vi.A0w(r1, r2, r3, r4, r5);
        this.A00 = r1;
        this.A01 = r2;
        this.A04 = r3;
        this.A03 = r4;
        this.A02 = r5;
    }
}
