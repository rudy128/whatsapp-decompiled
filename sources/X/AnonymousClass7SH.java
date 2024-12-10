package X;

import android.content.Intent;

/* renamed from: X.7SH  reason: invalid class name */
public final /* synthetic */ class AnonymousClass7SH implements C18090vk {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass1FU A01;
    public final /* synthetic */ C138636xR A02;

    public final Object invoke() {
        int i = this.A00;
        AnonymousClass1FU r2 = this.A01;
        if (i != 1) {
            if (i == 2) {
                Intent A022 = AnonymousClass1LU.A02(r2);
                A022.setFlags(67108864);
                r2.startActivity(A022);
            }
            return C27621Wu.A00;
        }
        r2.finish();
        return C27621Wu.A00;
    }

    public /* synthetic */ AnonymousClass7SH(AnonymousClass1FU r1, C138636xR r2, int i) {
        this.A00 = i;
        this.A02 = r2;
        this.A01 = r1;
    }
}
