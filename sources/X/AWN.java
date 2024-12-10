package X;

import android.content.Context;
import com.whatsapp.businessdirectory.viewmodel.BusinessDirectoryPopularApiBusinessesViewModel;
import java.util.Map;

public class AWN implements B8N {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AWN(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void C4B(Context context) {
        if (this.A00 != 0) {
            BusinessDirectoryPopularApiBusinessesViewModel businessDirectoryPopularApiBusinessesViewModel = (BusinessDirectoryPopularApiBusinessesViewModel) this.A01;
            AF0 af0 = (AF0) this.A02;
            C18070vi.A0d(af0, 1);
            ((AM7) C18070vi.A0E(businessDirectoryPopularApiBusinessesViewModel.A02)).A08((Integer) null, C17880vN.A0l(), (Map) null, 13, 90, 1);
            businessDirectoryPopularApiBusinessesViewModel.A01.A00(context, af0);
            return;
        }
        C20529AOo aOo = (C20529AOo) this.A01;
        AF0 af02 = (AF0) this.A02;
        C18070vi.A0d(af02, 1);
        aOo.A01.A01(AnonymousClass1L9.A00(context), af02);
        aOo.A02.A0E(af02);
    }
}
