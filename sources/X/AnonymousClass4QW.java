package X;

import android.text.TextUtils;

/* renamed from: X.4QW  reason: invalid class name */
public final class AnonymousClass4QW {
    public final AnonymousClass11E A00;
    public final AnonymousClass1MZ A01;
    public final AnonymousClass00H A02;

    public AnonymousClass4QW(AnonymousClass11E r1, AnonymousClass1MZ r2, AnonymousClass00H r3) {
        C18070vi.A0o(r3, r2, r1);
        this.A02 = r3;
        this.A01 = r2;
        this.A00 = r1;
    }

    public final Integer A00(AnonymousClass1E7 r3, AnonymousClass1EC r4, String str) {
        String str2;
        C18070vi.A0n(r4, r3, str);
        AnonymousClass1MZ r1 = this.A01;
        if (!r1.A0J(r4)) {
            return AnonymousClass00R.A01;
        }
        if (!r1.A0K(r4) && r3.A13) {
            return AnonymousClass00R.A0C;
        }
        String A002 = new C41661wr("\n\\s*\n\\s*[\n\\s]+").A00(str, "\n\n");
        C42661yX r0 = r3.A0M;
        if (r0 != null) {
            str2 = r0.A03;
        } else {
            str2 = null;
        }
        if (TextUtils.equals(str2, A002)) {
            return AnonymousClass00R.A0Y;
        }
        if (!this.A00.A09()) {
            return AnonymousClass00R.A0j;
        }
        if (C137186v3.A00(A002) > ((C85944Pm) this.A02.get()).A00()) {
            return AnonymousClass00R.A0N;
        }
        return AnonymousClass00R.A00;
    }
}
