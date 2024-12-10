package X;

import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewActivity;
import com.whatsapp.stickers.store.preview.StickerStorePackPreviewViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.6LY  reason: invalid class name */
public final class AnonymousClass6LY extends A34 {
    public final AnonymousClass1SB A00;
    public final C126606d0 A01;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.6Un, java.lang.Object] */
    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        AnonymousClass725[] r10 = (AnonymousClass725[]) objArr;
        C18070vi.A0d(r10, 0);
        C17960vV.A07(r10);
        C17960vV.A0C(C17890vO.A1R(r10.length));
        AnonymousClass725 r7 = r10[0];
        List list = r7.A07;
        C18070vi.A0X(list);
        AnonymousClass1SB r6 = this.A00;
        AnonymousClass4VT A08 = r6.A08();
        ArrayList A0D = C29351c6.A0D(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C1418377d A0x = C108945cZ.A0x(it);
            A0D.add(new C135906sx(A0x, false, r6.A0L(A0x)));
        }
        ? obj = new Object();
        obj.A00 = r7;
        obj.A01 = A0D;
        return new C134986rT(obj, A08);
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        String str;
        C134986rT r15 = (C134986rT) obj;
        C18070vi.A0d(r15, 0);
        AnonymousClass4VT r9 = r15.A01;
        C123456Un r1 = r15.A00;
        StickerStorePackPreviewActivity stickerStorePackPreviewActivity = this.A01.A00;
        C18070vi.A0d(r1, 1);
        if (stickerStorePackPreviewActivity.A0A == null) {
            C18030ve r6 = stickerStorePackPreviewActivity.A0E;
            C26631Sw r8 = stickerStorePackPreviewActivity.A07;
            if (r8 != null) {
                int dimensionPixelSize = stickerStorePackPreviewActivity.getResources().getDimensionPixelSize(2131168927);
                int dimensionPixelSize2 = stickerStorePackPreviewActivity.getResources().getDimensionPixelSize(2131168928);
                AnonymousClass6RG r2 = stickerStorePackPreviewActivity.A03;
                if (r2 == null) {
                    str = "stickerPackPreviewSource";
                } else {
                    boolean A1Z = AnonymousClass000.A1Z(r2, AnonymousClass6RG.STICKER_STORE_MY_TAB);
                    C24481Km r7 = stickerStorePackPreviewActivity.A05;
                    if (r7 != null) {
                        C112345lK r5 = new C112345lK(r6, r7, r8, r9, dimensionPixelSize, dimensionPixelSize2, true, A1Z);
                        r5.A02 = stickerStorePackPreviewActivity.A0h;
                        stickerStorePackPreviewActivity.A0A = r5;
                        RecyclerView recyclerView = stickerStorePackPreviewActivity.A02;
                        if (recyclerView != null) {
                            recyclerView.setAdapter(r5);
                        }
                    } else {
                        str = "staticContentUrlGenerator";
                    }
                }
            } else {
                str = "stickerImageFileLoader";
            }
            C18070vi.A11(str);
            throw null;
        }
        C112345lK r22 = stickerStorePackPreviewActivity.A0A;
        if (r22 != null) {
            r22.A01 = r1.A00;
            r22.A03 = r1.A01;
            r22.notifyDataSetChanged();
        }
        StickerStorePackPreviewViewModel stickerStorePackPreviewViewModel = stickerStorePackPreviewActivity.A0B;
        if (stickerStorePackPreviewViewModel == null) {
            str = "viewModel";
            C18070vi.A11(str);
            throw null;
        }
        stickerStorePackPreviewViewModel.A00.A0F(new C145707Mh(r1.A00, false));
        StickerStorePackPreviewActivity.A0V(stickerStorePackPreviewActivity);
    }

    public AnonymousClass6LY(AnonymousClass1SB r1, C126606d0 r2) {
        this.A01 = r2;
        this.A00 = r1;
    }
}
