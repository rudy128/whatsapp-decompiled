package X;

import android.graphics.Bitmap;

/* renamed from: X.82x  reason: invalid class name and case insensitive filesystem */
public final class C1590182x extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ C22821Di $onError;
    public final /* synthetic */ C22821Di $onSuccess;
    public final /* synthetic */ C138526xE this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C1590182x(C138526xE r2, C22821Di r3, C22821Di r4) {
        super(1);
        this.this$0 = r2;
        this.$onError = r3;
        this.$onSuccess = r4;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        AnonymousClass1KB r4;
        Runnable ak0;
        C22821Di r1;
        int i;
        C1416976p r6 = (C1416976p) obj;
        C18070vi.A0d(r6, 0);
        String str = r6.A00;
        C138526xE r0 = this.this$0;
        if (str == null) {
            r4 = r0.A00;
            r1 = this.$onError;
            i = 11;
        } else {
            Bitmap A00 = C138526xE.A00(r0, str);
            C138526xE r02 = this.this$0;
            if (A00 == null) {
                r4 = r02.A00;
                r1 = this.$onError;
                i = 12;
            } else {
                C17880vN.A1E(C108995ce.A0F(r02.A04).edit(), "pref_avatar_preview_cache_url", str);
                r4 = this.this$0.A00;
                ak0 = new C21433Ak0(this.$onSuccess, A00, 36);
                r4.A0J(ak0);
                return C27621Wu.A00;
            }
        }
        ak0 = new C146757Qm((Object) r1, i);
        r4.A0J(ak0);
        return C27621Wu.A00;
    }
}
