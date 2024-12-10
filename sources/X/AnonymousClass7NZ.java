package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.gallery.GalleryTabHostFragment;
import java.util.List;

/* renamed from: X.7NZ  reason: invalid class name */
public class AnonymousClass7NZ implements C38531rR {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass7NZ(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void Bvu(View view) {
        if (this.A00 != 0) {
            Context context = (Context) this.A01;
            ImageView imageView = (ImageView) view;
            List list = C42011xT.A0I;
            C27641Ww.A03(imageView, context.getResources().getDimensionPixelSize(2131166255), 0);
            AnonymousClass3MX.A1B(context, imageView, 2131232230);
            AnonymousClass4aX.A0D(imageView, C19740yt.A00(context, 2131101888));
            AnonymousClass3MX.A1D(context.getResources(), imageView, 2131894583);
            return;
        }
        GalleryTabHostFragment galleryTabHostFragment = (GalleryTabHostFragment) this.A01;
        View view2 = (View) this.A02;
        if (view.getId() == 2131431066) {
            Context A04 = AnonymousClass3MY.A04(view2);
            RecyclerView recyclerView = (RecyclerView) AnonymousClass3MX.A0C(view, 2131431068);
            galleryTabHostFragment.A03 = recyclerView;
            recyclerView.A0R = true;
            recyclerView.setAdapter((C38391rD) galleryTabHostFragment.A14.getValue());
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(A04);
            linearLayoutManager.A1Z(0);
            recyclerView.setLayoutManager(linearLayoutManager);
            View A0C = AnonymousClass3MX.A0C(view, 2131431057);
            galleryTabHostFragment.A01 = A0C;
            C89944dH.A00(A0C, galleryTabHostFragment, 25);
        }
    }
}
