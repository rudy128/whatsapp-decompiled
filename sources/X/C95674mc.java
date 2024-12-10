package X;

import android.os.Bundle;
import com.whatsapp.product.searchtheweb.GoogleSearchContentBottomSheet;
import java.util.List;

/* renamed from: X.4mc  reason: invalid class name and case insensitive filesystem */
public final class C95674mc implements C201511a {
    public final AnonymousClass00H A00;

    public C95674mc(AnonymousClass00H r2) {
        C18070vi.A0d(r2, 1);
        this.A00 = r2;
    }

    public GoogleSearchContentBottomSheet A00(List list, int i, boolean z) {
        if (list.isEmpty()) {
            ((C26031Qo) C18070vi.A0E(this.A00)).A00(C80493xG.A00, (String) null);
            return null;
        }
        Bundle A0D = C17880vN.A0D();
        A0D.putInt("arg-entry-point", i);
        A0D.putParcelableArrayList("arg-search-options", C17880vN.A10(list));
        A0D.putBoolean("arg-is-channel-update", z);
        GoogleSearchContentBottomSheet googleSearchContentBottomSheet = new GoogleSearchContentBottomSheet();
        googleSearchContentBottomSheet.A1R(A0D);
        return googleSearchContentBottomSheet;
    }
}
