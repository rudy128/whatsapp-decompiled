package X;

import android.content.Intent;
import com.whatsapp.gallery.google.GoogleGalleryActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.800  reason: invalid class name */
public final class AnonymousClass800 extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ GoogleGalleryActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass800(GoogleGalleryActivity googleGalleryActivity) {
        super(1);
        this.this$0 = googleGalleryActivity;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        List list = (List) obj;
        if (list == null) {
            this.this$0.finish();
        } else {
            GoogleGalleryActivity googleGalleryActivity = this.this$0;
            if (AnonymousClass000.A1a(list)) {
                list.size();
                C18070vi.A0z(C147017Rm.A00, "null cannot be cast to non-null type java.util.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder>{ kotlin.TypeAliasesKt.Comparator<T of kotlin.comparisons.ComparisonsKt__ComparisonsKt.reverseOrder> }");
                Intent A0A = C17880vN.A0A();
                A0A.putParcelableArrayListExtra("extra_selected_media_uri", (ArrayList) list);
                googleGalleryActivity.setResult(-1, A0A);
            }
            googleGalleryActivity.finish();
        }
        return C27621Wu.A00;
    }
}
