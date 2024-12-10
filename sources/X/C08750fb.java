package X;

import java.util.List;

/* renamed from: X.0fb  reason: invalid class name and case insensitive filesystem */
public final class C08750fb extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C01880Ag $lookaheadDelegate;
    public final /* synthetic */ AnonymousClass0AL this$0;
    public final /* synthetic */ C04700Ok this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C08750fb(AnonymousClass0AL r2, C04700Ok r3, C01880Ag r4) {
        super(0);
        this.this$0 = r2;
        this.$lookaheadDelegate = r4;
        this.this$1 = r3;
    }

    public final void A00() {
        AnonymousClass0AL.A05(this.this$0);
        this.this$0.BLV(C12160lJ.A00);
        C01880Ag A0v = this.this$0.BT2().A0v();
        if (A0v != null) {
            boolean A0i = A0v.A0i();
            List A07 = this.this$1.A0F.A0F().A07();
            int size = A07.size();
            for (int i = 0; i < size; i++) {
                C01880Ag A0v2 = ((AnonymousClass0XV) A07.get(i)).A0K().A0v();
                if (A0v2 != null) {
                    A0v2.A0g(A0i);
                }
            }
        }
        this.$lookaheadDelegate.A0c().CBj();
        if (this.this$0.BT2().A0v() != null) {
            List A072 = this.this$1.A0F.A0F().A07();
            int size2 = A072.size();
            for (int i2 = 0; i2 < size2; i2++) {
                C01880Ag A0v3 = ((AnonymousClass0XV) A072.get(i2)).A0K().A0v();
                if (A0v3 != null) {
                    A0v3.A0g(false);
                }
            }
        }
        AnonymousClass0AL.A04(this.this$0);
        this.this$0.BLV(C12170lK.A00);
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        A00();
        return C27621Wu.A00;
    }
}
