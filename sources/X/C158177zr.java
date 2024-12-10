package X;

import android.content.Intent;
import com.whatsapp.gallery.GalleryRecentsFragment;
import com.whatsapp.gallery.GalleryTabHostFragment;
import com.whatsapp.gallery.viewmodel.GalleryTabsViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.7zr  reason: invalid class name and case insensitive filesystem */
public final class C158177zr extends AnonymousClass11G implements C22821Di {
    public final /* synthetic */ AnonymousClass8A8 $mediaBrowserHost;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C158177zr(AnonymousClass8A8 r2) {
        super(1);
        this.$mediaBrowserHost = r2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        GalleryTabHostFragment galleryTabHostFragment;
        Intent intent;
        AnonymousClass8A8 r1 = this.$mediaBrowserHost;
        if ((r1 instanceof GalleryRecentsFragment) && (galleryTabHostFragment = ((GalleryRecentsFragment) r1).A02) != null) {
            GalleryTabsViewModel A0P = C108965cb.A0P(galleryTabHostFragment);
            C136156tM A26 = galleryTabHostFragment.A26();
            int A01 = GalleryTabHostFragment.A01(galleryTabHostFragment);
            int A00 = GalleryTabHostFragment.A00(galleryTabHostFragment);
            long A04 = GalleryTabHostFragment.A04(galleryTabHostFragment);
            Long valueOf = Long.valueOf(A04);
            String A0C = GalleryTabHostFragment.A0C(galleryTabHostFragment);
            Intent A0D = C108995ce.A0D(galleryTabHostFragment);
            boolean z = false;
            if (A0D != null && A0D.hasExtra("number_from_url")) {
                z = A0D.getBooleanExtra("number_from_url", false);
            }
            String A0A = GalleryTabHostFragment.A0A(galleryTabHostFragment);
            AnonymousClass1FL A1B = galleryTabHostFragment.A1B();
            int i = 25;
            if (!(A1B == null || (intent = A1B.getIntent()) == null)) {
                i = intent.getIntExtra("camera_picker_origin", 25);
            }
            C150927lT r5 = new C150927lT(galleryTabHostFragment);
            AnonymousClass8A9 r0 = (AnonymousClass8A9) AnonymousClass000.A0w((Map) A0P.A08.get(), A0P.A00);
            if (r0 != null) {
                r0.BnW().invoke(A26);
            } else {
                r5.invoke();
                AnonymousClass1BI A02 = AnonymousClass1BI.A00.A02(A26.A04);
                A0P.A09.get();
                AnonymousClass1FL r4 = A26.A02;
                if (valueOf == null) {
                    A04 = 0;
                }
                Intent A0g = AnonymousClass1LU.A0g(r4, A02, (Integer) null, (Integer) null, (Integer) null, Integer.valueOf(A00), Integer.valueOf(A01), A0C, A0A, A0P.A02, i, A04, z);
                Set A0T = A0P.A0T();
                ArrayList A0D2 = C29351c6.A0D(A0T);
                Iterator it = A0T.iterator();
                while (it.hasNext()) {
                    C108995ce.A1P(A0D2, it);
                }
                A0g.putExtra("selected_uris", C17880vN.A10(A0D2));
                r4.startActivityForResult(A0g, 103);
            }
        }
        return C27621Wu.A00;
    }
}
