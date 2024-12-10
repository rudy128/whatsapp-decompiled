package X;

import android.content.Context;
import android.widget.ArrayAdapter;
import com.whatsapp.support.faq.SearchFAQActivity;
import java.util.List;

/* renamed from: X.5f5  reason: invalid class name and case insensitive filesystem */
public final class C110195f5 extends ArrayAdapter {
    public final /* synthetic */ SearchFAQActivity A00;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r7v4, resolved type: android.widget.LinearLayout} */
    /* JADX WARNING: type inference failed for: r1v9, types: [X.6fD, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            r4 = 1
            if (r7 != 0) goto L_0x006b
            android.content.Context r0 = r5.getContext()
            android.widget.LinearLayout r7 = new android.widget.LinearLayout
            r7.<init>(r0)
            android.content.Context r1 = r5.getContext()
            java.lang.String r0 = "layout_inflater"
            java.lang.Object r1 = X.AnonymousClass11C.A02(r1, r0)
            android.view.LayoutInflater r1 = (android.view.LayoutInflater) r1
            X.C17960vV.A07(r1)
            X.C18070vi.A0X(r1)
            r0 = 2131626785(0x7f0e0b21, float:1.8880816E38)
            r1.inflate(r0, r7, r4)
            X.6fD r1 = new X.6fD
            r1.<init>()
            r0 = 2131434884(0x7f0b1d84, float:1.8491595E38)
            android.widget.TextView r0 = X.C17880vN.A0E(r7, r0)
            r1.A01 = r0
            r0 = 2131430073(0x7f0b0ab9, float:1.8481837E38)
            android.view.View r0 = r7.findViewById(r0)
            r1.A00 = r0
            r7.setTag(r1)
        L_0x003e:
            java.lang.Object r3 = r5.getItem(r6)
            X.C17960vV.A07(r3)
            X.C18070vi.A0X(r3)
            X.6hb r3 = (X.C129316hb) r3
            android.widget.TextView r2 = r1.A01
            if (r2 == 0) goto L_0x0053
            java.lang.String r0 = r3.A02
            r2.setText(r0)
        L_0x0053:
            android.view.View r2 = r1.A00
            if (r2 == 0) goto L_0x0064
            int r1 = r5.getCount()
            int r1 = r1 - r4
            r0 = 8
            if (r6 >= r1) goto L_0x0061
            r0 = 0
        L_0x0061:
            r2.setVisibility(r0)
        L_0x0064:
            com.whatsapp.support.faq.SearchFAQActivity r1 = r5.A00
            r0 = 2
            X.AnonymousClass78M.A00(r7, r1, r3, r0)
            return r7
        L_0x006b:
            java.lang.Object r1 = r7.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.support.faq.SearchFAQActivity.ViewHolder"
            X.C18070vi.A0z(r1, r0)
            X.6fD r1 = (X.C127956fD) r1
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C110195f5.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C110195f5(Context context, SearchFAQActivity searchFAQActivity, List list) {
        super(context, 2131626785, list);
        this.A00 = searchFAQActivity;
    }
}
