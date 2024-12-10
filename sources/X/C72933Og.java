package X;

import android.content.Context;
import android.widget.ArrayAdapter;
import java.util.List;

/* renamed from: X.3Og  reason: invalid class name and case insensitive filesystem */
public class C72933Og extends ArrayAdapter {
    public List A00;
    public C18000vb A01;
    public final boolean A02;
    public final Context A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C72933Og(Context context, C18000vb r3, List list, boolean z) {
        super(context, 2131625776);
        C18070vi.A0d(r3, 2);
        this.A03 = context;
        this.A01 = r3;
        this.A00 = list;
        this.A02 = z;
    }

    public int getViewTypeCount() {
        return 1;
    }

    public int getCount() {
        return this.A00.size();
    }

    public /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A00.get(i);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0094  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00b8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r12, android.view.View r13, android.view.ViewGroup r14) {
        /*
            r11 = this;
            android.content.Context r8 = r11.A03
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r8)
            r0 = 2131625776(0x7f0e0730, float:1.887877E38)
            android.view.View r7 = X.AnonymousClass3MY.A0D(r1, r0)
            int r0 = android.view.View.generateViewId()
            r7.setId(r0)
            r0 = 2131431935(0x7f0b11ff, float:1.8485613E38)
            android.view.View r6 = X.C18070vi.A05(r7, r0)
            android.widget.CompoundButton r6 = (android.widget.CompoundButton) r6
            r0 = 2131431936(0x7f0b1200, float:1.8485615E38)
            android.widget.TextView r5 = X.AnonymousClass3Ma.A0E(r7, r0)
            java.util.List r4 = r11.A00
            java.lang.Object r0 = r4.get(r12)
            X.4To r0 = (X.C86914To) r0
            java.lang.String r0 = r0.A00
            r5.setText(r0)
            r0 = 2131431937(0x7f0b1201, float:1.8485617E38)
            android.widget.TextView r3 = X.AnonymousClass3Ma.A0E(r7, r0)
            boolean r2 = r11 instanceof X.AnonymousClass42U
            if (r2 == 0) goto L_0x0062
            java.util.List r0 = r11.A00
            java.util.Iterator r9 = r0.iterator()
            r10 = 0
        L_0x0043:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x008c
            java.lang.Object r0 = r9.next()
            X.4To r0 = (X.C86914To) r0
            java.lang.String r1 = r0.A01
            java.util.Locale r0 = X.C26166Ctg.A03()
            java.lang.String r0 = r0.getLanguage()
            boolean r0 = X.C18070vi.A18(r1, r0)
            if (r0 != 0) goto L_0x0092
            int r10 = r10 + 1
            goto L_0x0043
        L_0x0062:
            boolean r0 = r11 instanceof X.AnonymousClass42T
            if (r0 == 0) goto L_0x008e
            java.util.Locale r0 = X.C26166Ctg.A03()
            java.lang.String r9 = r0.getLanguage()
            java.util.List r0 = r11.A00
            java.util.Iterator r1 = r0.iterator()
            r10 = 0
        L_0x0075:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x008c
            java.lang.Object r0 = r1.next()
            X.4To r0 = (X.C86914To) r0
            java.lang.String r0 = r0.A01
            boolean r0 = X.C18070vi.A18(r0, r9)
            if (r0 != 0) goto L_0x0092
            int r10 = r10 + 1
            goto L_0x0075
        L_0x008c:
            r10 = -1
            goto L_0x0092
        L_0x008e:
            boolean r0 = r11.A02
            r10 = r0 ^ 1
        L_0x0092:
            if (r12 != r10) goto L_0x00b8
            r0 = 2131891592(0x7f121588, float:1.9417908E38)
            r3.setText(r0)
        L_0x009a:
            r1 = r11
            if (r2 == 0) goto L_0x00ad
            X.42U r1 = (X.AnonymousClass42U) r1
            int r0 = r1.A00
        L_0x00a1:
            boolean r0 = X.AnonymousClass000.A1T(r12, r0)
            r6.setChecked(r0)
            r0 = 2
            r3.setImportantForAccessibility(r0)
            return r7
        L_0x00ad:
            boolean r0 = r11 instanceof X.AnonymousClass42T
            if (r0 == 0) goto L_0x00b6
            X.42T r1 = (X.AnonymousClass42T) r1
            int r0 = r1.A00
            goto L_0x00a1
        L_0x00b6:
            r0 = 0
            goto L_0x00a1
        L_0x00b8:
            java.lang.Object r0 = r4.get(r12)
            X.4To r0 = (X.C86914To) r0
            java.lang.String r9 = r0.A01
            java.lang.String[] r0 = X.AnonymousClass1X0.A04
            java.util.Locale r1 = java.util.Locale.forLanguageTag(r9)
            java.util.Locale r0 = java.util.Locale.getDefault()
            java.lang.String r4 = r1.getDisplayLanguage(r0)
            int r1 = r4.length()
            int r0 = r9.length()
            if (r1 > r0) goto L_0x00fb
            boolean r0 = r9.startsWith(r4)
            if (r0 == 0) goto L_0x00fb
            java.util.Locale r1 = X.C26166Ctg.A03()
        L_0x00e2:
            java.util.Locale r0 = java.util.Locale.forLanguageTag(r9)
            X.C18070vi.A0X(r0)
            X.C18070vi.A0b(r1)
            java.lang.String r0 = X.C26166Ctg.A00(r8, r9, r0, r1)
            java.lang.String r0 = X.C26166Ctg.A01(r0)
            r3.setText(r0)
            r5.setContentDescription(r0)
            goto L_0x009a
        L_0x00fb:
            java.util.Locale r1 = java.util.Locale.getDefault()
            goto L_0x00e2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72933Og.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
