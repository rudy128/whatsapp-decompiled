package X;

import android.app.Application;
import android.content.ContentValues;
import android.content.Context;
import java.util.concurrent.Future;

/* renamed from: X.6pS  reason: invalid class name and case insensitive filesystem */
public final class C133766pS {
    public final AnonymousClass10I A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;
    public final AnonymousClass00H A03;

    public final void A00(Context context, AnonymousClass210 r11) {
        AnonymousClass210 r6 = r11;
        C18070vi.A0d(r11, 1);
        Context context2 = context;
        C17960vV.A0G(!(context instanceof Application), "CrosspostTextStatusBurningManager/application context was passed in for scheduleTextStatusMediaPathUpdate");
        AnonymousClass00H r2 = this.A02;
        String A0w = C108955ca.A0w(r11);
        if (!((C126796dJ) r2.get()).A00.containsKey(A0w)) {
            Object obj = new Object();
            this.A00.CGF(new C146617Py(this, context2, r6, obj, 32));
            ((C126796dJ) r2.get()).A00.put(A0w, obj);
        }
    }

    public final void A01(AnonymousClass210 r9) {
        C18070vi.A0d(r9, 0);
        AnonymousClass00H r7 = this.A02;
        String A0w = C108955ca.A0w(r9);
        Future future = (Future) ((C126796dJ) r7.get()).A00.get(A0w);
        if (future != null) {
            String str = (String) future.get();
            long j = r9.A0x;
            C72453Mb.A1S(str);
            ContentValues A08 = C17880vN.A08();
            A08.put("media_file_path", str);
            AnonymousClass73E.A02(A08, (AnonymousClass73E) this.A03.get(), C18070vi.A0M(Long.valueOf(j)));
            ((C126796dJ) r7.get()).A00.remove(A0w);
        }
    }

    public C133766pS(AnonymousClass10I r1, AnonymousClass00H r2, AnonymousClass00H r3, AnonymousClass00H r4) {
        C18070vi.A0s(r1, r2, r3, r4);
        this.A00 = r1;
        this.A03 = r2;
        this.A02 = r3;
        this.A01 = r4;
    }
}
