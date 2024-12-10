package X;

import java.util.NoSuchElementException;

/* renamed from: X.0fA  reason: invalid class name and case insensitive filesystem */
public final class C08480fA extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ AnonymousClass092 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C08480fA(AnonymousClass092 r2) {
        super(0);
        this.this$0 = r2;
    }

    public final void A00() {
        AnonymousClass0NU A05;
        AnonymousClass092 r5 = this.this$0;
        AnonymousClass0JE r3 = r5.A0A;
        while (AnonymousClass000.A1O(r3.A00.A00)) {
            C06970a9 r6 = r3.A00;
            int i = r6.A00;
            if (i != 0) {
                AnonymousClass0NU r2 = (AnonymousClass0NU) ((AnonymousClass0Ja) r6.A01[i - 1]).A00().invoke();
                if (r2 != null && !AnonymousClass092.A07(r5, r2, r5.A00)) {
                    break;
                }
                ((AnonymousClass0Ja) r6.A06(r6.A00 - 1)).A01().resumeWith(C27621Wu.A00);
            } else {
                throw new NoSuchElementException("MutableVector is empty.");
            }
        }
        AnonymousClass092 r1 = this.this$0;
        if (r1.A07 && (A05 = AnonymousClass092.A05(r1)) != null) {
            AnonymousClass092 r22 = this.this$0;
            if (AnonymousClass092.A07(r22, A05, r22.A00)) {
                this.this$0.A07 = false;
            }
        }
        AnonymousClass092 r0 = this.this$0;
        r0.A0B.A00 = AnonymousClass092.A00(r0);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        A00();
        return C27621Wu.A00;
    }
}
