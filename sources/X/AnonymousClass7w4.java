package X;

import java.lang.ref.WeakReference;

/* renamed from: X.7w4  reason: invalid class name */
public final class AnonymousClass7w4 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ boolean $isMV;
    public final /* synthetic */ WeakReference $weakActivity;
    public final /* synthetic */ AnonymousClass749 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass7w4(AnonymousClass749 r2, WeakReference weakReference, boolean z) {
        super(0);
        this.$weakActivity = weakReference;
        this.this$0 = r2;
        this.$isMV = z;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass1FU A0Z = C108945cZ.A0Z(this.$weakActivity);
        if (A0Z != null) {
            AnonymousClass749 r4 = this.this$0;
            boolean z = this.$isMV;
            boolean A1a = C72453Mb.A1a(r4.A0G);
            int A0I = C72453Mb.A0I(r4.A0E);
            if (A1a) {
                int i = 66002;
                if (!z) {
                    i = 66001;
                }
                AnonymousClass749.A03(A0Z, r4, A0I, i);
            } else {
                AnonymousClass749.A04(A0Z, r4, (C18090vk) null, A0I, z);
            }
        }
        return C27621Wu.A00;
    }
}
