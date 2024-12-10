package X;

import android.content.Context;
import android.os.Environment;

/* renamed from: X.6jg  reason: invalid class name and case insensitive filesystem */
public final class C130586jg {
    public long A00;
    public String A01;
    public final Context A02;
    public final C23501Gn A03 = new C143707Em(this, 2);
    public final AnonymousClass1NM A04;
    public final C35551mQ A05;
    public final AnonymousClass00H A06;
    public final AnonymousClass00H A07;

    public C130586jg(Context context, AnonymousClass1NM r4, C35551mQ r5, AnonymousClass00H r6, AnonymousClass00H r7) {
        C18070vi.A0p(r5, r4, r6);
        C18070vi.A0d(r7, 5);
        this.A02 = context;
        this.A05 = r5;
        this.A04 = r4;
        this.A06 = r6;
        this.A07 = r7;
        String externalStorageState = Environment.getExternalStorageState();
        C18070vi.A0X(externalStorageState);
        this.A01 = externalStorageState;
    }
}
