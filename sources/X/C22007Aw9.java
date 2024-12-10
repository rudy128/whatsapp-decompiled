package X;

import java.util.LinkedHashSet;

/* renamed from: X.Aw9  reason: case insensitive filesystem */
public final class C22007Aw9 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C20357AHn $listener;
    public final /* synthetic */ C192949pI this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22007Aw9(C20357AHn aHn, C192949pI r3) {
        super(0);
        this.this$0 = r3;
        this.$listener = aHn;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C196019uK r4 = this.this$0.A00;
        C20357AHn aHn = this.$listener;
        C18070vi.A0d(aHn, 0);
        synchronized (r4.A02) {
            LinkedHashSet linkedHashSet = r4.A03;
            if (linkedHashSet.remove(aHn) && linkedHashSet.isEmpty()) {
                r4.A06();
            }
        }
        return C27621Wu.A00;
    }
}
