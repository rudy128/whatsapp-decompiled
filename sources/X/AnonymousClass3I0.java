package X;

/* renamed from: X.3I0  reason: invalid class name */
public final class AnonymousClass3I0 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C63872tp $groupParticipants;
    public final /* synthetic */ C47712Jo $listJid;
    public final /* synthetic */ C63862to this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3I0(C63872tp r2, C63862to r3, C47712Jo r4) {
        super(0);
        this.this$0 = r3;
        this.$listJid = r4;
        this.$groupParticipants = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        C63862to r1 = this.this$0;
        C47712Jo r0 = this.$listJid;
        AnonymousClass1M9 r12 = r1.A03;
        AnonymousClass1E7 A0G = r12.A0G(r0);
        if (A0G != null) {
            A0G.A0O = "lid";
            r12.A0X(A0G);
        }
        this.$groupParticipants.A00 = 2;
        return C27621Wu.A00;
    }
}
