package X;

import android.content.res.ColorStateList;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.whatsapp.ListItemWithLeftIcon;
import com.whatsapp.WaImageView;
import com.whatsapp.WaTextView;
import com.whatsapp.util.Log;
import java.text.NumberFormat;
import java.util.List;

/* renamed from: X.5kx  reason: invalid class name and case insensitive filesystem */
public final class C112115kx extends C38391rD {
    public final C18000vb A00;
    public final AnonymousClass1SB A01;
    public final List A02 = AnonymousClass000.A13();
    public final C18090vk A03;
    public final C22821Di A04;

    public /* bridge */ /* synthetic */ C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        if (i == 1) {
            return new AnonymousClass6HK(this.A03, AnonymousClass3MY.A0E(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131627092));
        } else if (i == 2) {
            return new AnonymousClass6HL(AnonymousClass3MY.A0E(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131627093), this.A00, this.A01, this.A04);
        } else {
            throw new IllegalAccessError("CustomStickerPackAdapter/Cannot render this view type");
        }
    }

    public int A0Q() {
        return this.A02.size();
    }

    public /* bridge */ /* synthetic */ void Bmc(C42011xT r8, int i) {
        C112895mD r82 = (C112895mD) r8;
        C18070vi.A0d(r82, 0);
        C139846zX r1 = (C139846zX) this.A02.get(i);
        if (r82 instanceof AnonymousClass6HL) {
            AnonymousClass6HL r83 = (AnonymousClass6HL) r82;
            C18070vi.A0d(r1, 0);
            AnonymousClass725 r4 = r1.A00;
            if (r4 == null) {
                Log.e("CustomStickerPackPackViewHolder/bind sticker pack is null");
                return;
            }
            C18100vl r2 = r83.A02;
            ListItemWithLeftIcon listItemWithLeftIcon = (ListItemWithLeftIcon) r2.getValue();
            List list = r4.A07;
            C18070vi.A0X(list);
            if (!list.isEmpty()) {
                WaTextView waTextView = new WaTextView(AnonymousClass3MY.A04(AnonymousClass3MW.A0A(r2)));
                waTextView.setLayoutParams(AnonymousClass3Ma.A0D());
                waTextView.setId(1);
                NumberFormat A0L = r83.A00.A0L();
                List list2 = r4.A07;
                C18070vi.A0X(list2);
                waTextView.setText(A0L.format(Integer.valueOf(list2.size())));
                listItemWithLeftIcon.A09(waTextView, 1);
            }
            listItemWithLeftIcon.setTitle((CharSequence) r4.A04);
            listItemWithLeftIcon.A01.setScaleType(ImageView.ScaleType.FIT_CENTER);
            listItemWithLeftIcon.A01.clearColorFilter();
            C28081Yu.A00((ColorStateList) null, listItemWithLeftIcon.A01);
            View view = r83.A0H;
            AnonymousClass3MZ.A1P(view, r83, r4, 38);
            AnonymousClass3MW.A1Q(view);
            AnonymousClass1SB r3 = r83.A01;
            WaImageView waImageView = ((C74793cj) r2.getValue()).A01;
            C18070vi.A0W(waImageView);
            r3.A0F(r4, new AnonymousClass7MZ(waImageView, AnonymousClass725.A00(r4)));
            return;
        }
        View view2 = r82.A0H;
        AnonymousClass78P.A00(view2, r82, 22);
        AnonymousClass3MW.A1Q(view2);
    }

    public int getItemViewType(int i) {
        C139846zX r1 = (C139846zX) this.A02.get(i);
        if (r1.A00 != null) {
            return 2;
        }
        return AnonymousClass000.A1O(r1.A01 ? 1 : 0) ? 1 : 0;
    }

    public C112115kx(C18000vb r2, AnonymousClass1SB r3, C18090vk r4, C22821Di r5) {
        C108985cd.A1D(r2, r3);
        this.A03 = r4;
        this.A04 = r5;
        this.A00 = r2;
        this.A01 = r3;
    }
}
