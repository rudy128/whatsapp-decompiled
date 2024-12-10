package X;

/* renamed from: X.DgD  reason: case insensitive filesystem */
public final class C27484DgD extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ DFL $tooltipContainerModel;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C27484DgD(DFL dfl) {
        super(0);
        this.$tooltipContainerModel = dfl;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        E8A A0A = this.$tooltipContainerModel.A0A(41);
        if (A0A != null) {
            return A0A;
        }
        throw AnonymousClass000.A0k("Server should have ensured that the Tooltip Container always has on-visibility-update.");
    }
}
