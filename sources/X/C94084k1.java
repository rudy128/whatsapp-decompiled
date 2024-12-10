package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.whatsapp.communitymedia.itemviews.LinkMetadataView;
import java.util.List;

/* renamed from: X.4k1  reason: invalid class name and case insensitive filesystem */
public final class C94084k1 implements AnonymousClass8A6 {
    public /* bridge */ /* synthetic */ void BD7(Context context, View view, Object obj) {
        Drawable A05;
        Bitmap bitmap;
        ImageView imageView = (ImageView) view;
        C135666sZ r8 = (C135666sZ) obj;
        C18070vi.A0j(imageView, r8);
        AnonymousClass4TL r0 = (AnonymousClass4TL) r8.A03;
        AnonymousClass210 r3 = r0.A00;
        C87744Wu r2 = r0.A01;
        int A01 = AnonymousClass3MW.A01(context.getResources(), 2131167693);
        byte[] A1A = r3.A1A();
        if (A1A == null || (bitmap = AnonymousClass204.A0C(new AnonymousClass25O(A01, A01), A1A).A02) == null || r2.A00.A02 != null) {
            A05 = AnonymousClass4aX.A05(context, AnonymousClass3MX.A06(context, 2131232044), AnonymousClass4Z9.A00(context, 2130968578));
            C18070vi.A0b(A05);
        } else {
            A05 = new BitmapDrawable(context.getResources(), C26511Sk.A06(bitmap, context.getResources().getDimension(2131167692), A01));
        }
        imageView.setImageDrawable(A05);
    }

    public /* bridge */ /* synthetic */ void BDC(View view, AnonymousClass4ZN r3, Object obj, List list) {
        LinkMetadataView linkMetadataView = (LinkMetadataView) view;
        C135666sZ r4 = (C135666sZ) obj;
        C18070vi.A0j(linkMetadataView, r4);
        linkMetadataView.A00(((AnonymousClass4TL) r4.A03).A01);
    }

    public int BSf() {
        return 2131626961;
    }

    public int BZr() {
        return 2131625816;
    }
}
