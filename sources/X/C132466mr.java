package X;

import android.app.Application;
import android.content.Context;
import java.io.File;

/* renamed from: X.6mr  reason: invalid class name and case insensitive filesystem */
public final class C132466mr {
    public final AnonymousClass1SJ A00;
    public final AnonymousClass00H A01;
    public final AnonymousClass00H A02;

    public String A00(Context context, AnonymousClass210 r5) {
        C18070vi.A0d(r5, 1);
        if (context instanceof Application) {
            C17960vV.A0F(false, "Application context was passed in for burning");
        } else {
            AnonymousClass00H r0 = this.A02;
            r0.get();
            File A002 = ((AnonymousClass12C) r0.get()).A00(r5, AnonymousClass6XY.A00(context, (C36381nn) null, r5));
            if (A002 != null) {
                return A002.getName();
            }
        }
        return null;
    }

    public C132466mr(AnonymousClass1SJ r1, AnonymousClass00H r2, AnonymousClass00H r3) {
        C18070vi.A0o(r1, r2, r3);
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
