package X;

import com.whatsapp.businessdirectory.view.fragment.BusinessDirectoryPopularApiBusinessesFragment;
import java.util.List;

/* renamed from: X.7yj  reason: invalid class name and case insensitive filesystem */
public final class C157837yj extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ BusinessDirectoryPopularApiBusinessesFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C157837yj(BusinessDirectoryPopularApiBusinessesFragment businessDirectoryPopularApiBusinessesFragment) {
        super(1);
        this.this$0 = businessDirectoryPopularApiBusinessesFragment;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        AnonymousClass8HW r0 = this.this$0.A01;
        if (r0 != null) {
            r0.A0W(list);
            return C27621Wu.A00;
        }
        C18070vi.A11("directoryListAdapter");
        throw null;
    }
}
