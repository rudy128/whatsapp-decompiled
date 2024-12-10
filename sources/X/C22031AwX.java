package X;

import java.util.List;

/* renamed from: X.AwX  reason: case insensitive filesystem */
public final class C22031AwX extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ String $name;
    public final /* synthetic */ C20346AHc $operation;
    public final /* synthetic */ A7W $this_enqueueUniquelyNamedPeriodic;
    public final /* synthetic */ C185319cO $workRequest;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C22031AwX(C185319cO r2, C20346AHc aHc, A7W a7w, String str) {
        super(0);
        this.$workRequest = r2;
        this.$this_enqueueUniquelyNamedPeriodic = a7w;
        this.$name = str;
        this.$operation = aHc;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        List A0M = C18070vi.A0M(this.$workRequest);
        new C21471Akc((Object) this.$operation, (Object) new A7G(this.$this_enqueueUniquelyNamedPeriodic, AnonymousClass00R.A01, this.$name, A0M, (List) null), 24).run();
        return C27621Wu.A00;
    }
}
