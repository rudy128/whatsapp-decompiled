package X;

import android.content.Context;
import android.content.Intent;

/* renamed from: X.2ku  reason: invalid class name and case insensitive filesystem */
public final class C58572ku {
    public final C18030ve A00;
    public final AnonymousClass1LU A01;
    public final AnonymousClass00H A02;

    public final Intent A00(Context context, int i, int i2, int i3) {
        Context context2 = context;
        if (((AnonymousClass1DC) this.A02.get()).BcY()) {
            if (C18020vd.A05(C18040vf.A02, this.A00, 7558)) {
                return AnonymousClass1LU.A0S(context2, (AnonymousClass77K) null, Integer.valueOf(i), C17880vN.A0k(), Integer.valueOf(i2), C29671cg.A00.getRawString(), (String) null, 2, i3, 9);
            }
        }
        Integer valueOf = Integer.valueOf(i2);
        Intent A0A = C17880vN.A0A();
        A0A.setClassName(context2.getPackageName(), "com.whatsapp.textstatuscomposer.TextStatusComposerActivityV2");
        A0A.putExtra("camera_origin", 4);
        if (valueOf == null) {
            return A0A;
        }
        A0A.putExtra("entry_point", valueOf.intValue());
        return A0A;
    }

    public final Intent A01(Context context, int i, int i2, int i3, int i4) {
        boolean A05 = C18020vd.A05(C18040vf.A02, this.A00, 7558);
        C29671cg r0 = C29671cg.A00;
        Context context2 = context;
        int i5 = i;
        int i6 = i3;
        int i7 = i4;
        if (A05) {
            return AnonymousClass1LU.A0S(context2, (AnonymousClass77K) null, Integer.valueOf(i), C17880vN.A0k(), Integer.valueOf(i2), r0.getRawString(), (String) null, 1, i6, i7);
        }
        Intent A1I = AnonymousClass1LU.A1I(context2, C17880vN.A0k(), r0.getRawString(), (String) null, i5, i6, i7, false);
        C18070vi.A0b(A1I);
        return A1I;
    }

    public C58572ku(C18030ve r1, AnonymousClass1LU r2, AnonymousClass00H r3) {
        C18070vi.A0o(r2, r1, r3);
        this.A01 = r2;
        this.A00 = r1;
        this.A02 = r3;
    }
}
