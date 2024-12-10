package X;

import java.lang.ref.WeakReference;

/* renamed from: X.7wY  reason: invalid class name */
public final class AnonymousClass7wY extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ int $entryPoint;
    public final /* synthetic */ C46162Dk $newsletter;
    public final /* synthetic */ String $pcId = null;
    public final /* synthetic */ WeakReference $weakActivity;
    public final /* synthetic */ AnonymousClass749 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7wY(C46162Dk r2, AnonymousClass749 r3, WeakReference weakReference, int i) {
        super(0);
        this.$weakActivity = weakReference;
        this.this$0 = r3;
        this.$newsletter = r2;
        this.$entryPoint = i;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass1FU A0Z = C108945cZ.A0Z(this.$weakActivity);
        if (A0Z != null) {
            AnonymousClass749 r3 = this.this$0;
            C46162Dk r0 = this.$newsletter;
            int i = this.$entryPoint;
            r3.A09(A0Z, r0.A0M(), this.$pcId, i);
        }
        return C27621Wu.A00;
    }
}
