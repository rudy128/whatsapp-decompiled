package X;

import android.view.View;
import com.whatsapp.wds.components.list.header.WDSSectionHeader;

/* renamed from: X.3Ze  reason: invalid class name and case insensitive filesystem */
public class C74273Ze extends C42011xT {
    public final View A00;

    public void A0B(int i, Integer num) {
        String A11;
        View view = this.A00;
        if (num != null) {
            A11 = C72473Md.A0j(view.getContext(), num, i);
        } else {
            A11 = AnonymousClass3Ma.A11(view, i);
        }
        if (view instanceof WDSSectionHeader) {
            ((WDSSectionHeader) view).setHeaderText(A11);
        } else if (view instanceof AnonymousClass3P6) {
            C18070vi.A0d(A11, 0);
            ((AnonymousClass3P6) view).A01.setText(A11);
        }
    }

    public C74273Ze(View view) {
        super(view);
        this.A00 = view;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: X.3P6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: com.whatsapp.wds.components.list.header.WDSSectionHeader} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v4, resolved type: X.3P6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: X.3P6} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C74273Ze A00(android.view.ViewGroup r3, X.C18030ve r4) {
        /*
            boolean r0 = X.AnonymousClass1J8.A05(r4)
            if (r0 == 0) goto L_0x0042
            android.content.Context r1 = r3.getContext()
            r0 = 0
            com.whatsapp.wds.components.list.header.WDSSectionHeader r4 = new com.whatsapp.wds.components.list.header.WDSSectionHeader
            r4.<init>(r1, r0)
            r1 = -1
            r0 = -2
            X.AnonymousClass3Ma.A18(r4, r1, r0)
            android.content.res.Resources r0 = X.AnonymousClass000.A0Y(r3)
            r1 = 2131169533(0x7f0710fd, float:1.7953399E38)
            int r2 = r0.getDimensionPixelSize(r1)
            android.content.res.Resources r0 = X.AnonymousClass000.A0Y(r3)
            int r1 = r0.getDimensionPixelSize(r1)
            r0 = 0
            r4.setPadding(r2, r0, r1, r0)
            r0 = 1
            r4.setDividerVisibility(r0)
            X.AnonymousClass1HF.A0q(r4, r0)
            r1 = 0
            X.3SN r0 = new X.3SN
            r0.<init>(r1)
            X.AnonymousClass1HF.A0f(r4, r0)
        L_0x003c:
            X.3Ze r0 = new X.3Ze
            r0.<init>(r4)
            return r0
        L_0x0042:
            android.content.Context r0 = r3.getContext()
            X.3P6 r4 = new X.3P6
            r4.<init>(r0)
            r0 = 2131430073(0x7f0b0ab9, float:1.8481837E38)
            android.view.View r3 = X.AnonymousClass1HF.A06(r4, r0)
            android.content.res.Resources r2 = r4.getResources()
            android.content.res.Resources$Theme r1 = X.AnonymousClass3Ma.A06(r4)
            r0 = 2131231352(0x7f080278, float:1.8078783E38)
            android.graphics.drawable.Drawable r0 = X.C40501uo.A00(r1, r2, r0)
            r3.setBackground(r0)
            goto L_0x003c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74273Ze.A00(android.view.ViewGroup, X.0ve):X.3Ze");
    }
}
