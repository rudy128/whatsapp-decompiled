package X;

import android.content.Context;
import android.content.Intent;
import com.whatsapp.lists.ListsManagerFragment;
import java.util.List;

/* renamed from: X.5O3  reason: invalid class name */
public final class AnonymousClass5O3 extends AnonymousClass11G implements C18090vk {
    public final /* synthetic */ C41761x1 $labelInfo;
    public final /* synthetic */ ListsManagerFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5O3(C41761x1 r2, ListsManagerFragment listsManagerFragment) {
        super(0);
        this.this$0 = listsManagerFragment;
        this.$labelInfo = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke() {
        AnonymousClass00H r0 = this.this$0.A0A;
        if (r0 != null) {
            r0.get();
            Context A14 = this.this$0.A14();
            List list = AnonymousClass3Ma.A0p(this.this$0).A09;
            C18070vi.A0X(list);
            C41761x1 r3 = this.$labelInfo;
            Intent A0A = C17880vN.A0A();
            A0A.setClassName(A14.getPackageName(), "com.whatsapp.lists.picker.ListsContactPickerActivity");
            A0A.putStringArrayListExtra("selected", C22971Dz.A0B(list));
            if (r3 != null) {
                A0A.putExtra("LABELINFO", r3);
            }
            this.this$0.A0D.A03(A0A);
            return C27621Wu.A00;
        }
        AnonymousClass3MW.A1F();
        throw null;
    }
}
