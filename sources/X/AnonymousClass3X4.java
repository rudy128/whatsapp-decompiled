package X;

import android.view.ViewGroup;
import java.util.ArrayList;

/* renamed from: X.3X4  reason: invalid class name */
public final class AnonymousClass3X4 extends C38391rD {
    public ArrayList A00 = AnonymousClass000.A13();
    public ArrayList A01 = AnonymousClass000.A13();
    public final C18000vb A02;
    public final AnonymousClass1KW A03;
    public final C18090vk A04;
    public final C19880zA A05;
    public final AnonymousClass00H A06;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: X.3ZB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v3, resolved type: X.3ZA} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v4, resolved type: X.3ZB} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: X.3ZB} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0055, code lost:
        if (r0.intValue() == 1) goto L_0x0057;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a2, code lost:
        if (r0.intValue() == 1) goto L_0x00a4;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bmc(X.C42011xT r9, int r10) {
        /*
            r8 = this;
            r5 = 0
            X.C18070vi.A0d(r9, r5)
            int r1 = r9.A01
            r6 = 1
            if (r1 == r6) goto L_0x006a
            r0 = 2
            if (r1 != r0) goto L_0x0067
            X.3ZA r9 = (X.AnonymousClass3ZA) r9
            java.util.ArrayList r0 = r8.A01
            java.lang.Object r0 = r0.get(r10)
            X.C18070vi.A0X(r0)
            X.4TZ r0 = (X.AnonymousClass4TZ) r0
            android.widget.TextView r7 = r9.A01
            X.1x1 r6 = r0.A01
            java.lang.String r3 = r6.A06
            android.view.View r4 = r9.A0H
            android.content.Context r2 = r4.getContext()
            android.text.TextPaint r1 = r7.getPaint()
            X.1KW r0 = r8.A03
            X.AnonymousClass3MY.A0u(r2, r1, r7, r0, r3)
            int r1 = r6.A02
            r0 = 4
            r3 = 2131233505(0x7f080ae1, float:1.808315E38)
            if (r1 != r0) goto L_0x0039
            r3 = 2131233299(0x7f080a13, float:1.8082732E38)
        L_0x0039:
            android.widget.ImageView r2 = r9.A00
            X.0vb r1 = r8.A02
            android.content.Context r0 = r2.getContext()
            X.AnonymousClass3NL.A01(r0, r2, r1, r3)
            com.whatsapp.components.SelectionCheckView r2 = r9.A02
            java.util.ArrayList r0 = r8.A00
            java.lang.Object r0 = r0.get(r10)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x0068
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r1) goto L_0x0068
        L_0x0057:
            r2.A04(r1, r5)
            r2.setClickable(r5)
            r1 = 19
        L_0x005f:
            X.78T r0 = new X.78T
            r0.<init>(r9, r10, r1, r8)
            r4.setOnClickListener(r0)
        L_0x0067:
            return
        L_0x0068:
            r1 = 0
            goto L_0x0057
        L_0x006a:
            X.3ZB r9 = (X.AnonymousClass3ZB) r9
            java.util.ArrayList r0 = r8.A01
            java.lang.Object r0 = r0.get(r10)
            X.C18070vi.A0X(r0)
            X.4TZ r0 = (X.AnonymousClass4TZ) r0
            android.widget.TextView r7 = r9.A01
            X.1x1 r0 = r0.A01
            java.lang.String r3 = r0.A06
            android.view.View r4 = r9.A0H
            android.content.Context r2 = r4.getContext()
            android.text.TextPaint r1 = r7.getPaint()
            X.1KW r0 = r8.A03
            X.AnonymousClass3MY.A0u(r2, r1, r7, r0, r3)
            android.widget.ImageView r0 = r9.A00
            r0.getContext()
            com.whatsapp.TriStateCheckBox r2 = r9.A02
            java.util.ArrayList r0 = r8.A00
            java.lang.Object r0 = r0.get(r10)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x00ba
            int r0 = r0.intValue()
            r1 = 1
            if (r0 != r6) goto L_0x00ba
        L_0x00a4:
            r2.setChecked(r1)
            java.util.ArrayList r0 = r8.A00
            java.lang.Object r0 = r0.get(r10)
            int r0 = X.AnonymousClass000.A0M(r0)
            r2.setCheckedState(r0)
            r2.setClickable(r5)
            r1 = 20
            goto L_0x005f
        L_0x00ba:
            r1 = 0
            goto L_0x00a4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3X4.Bmc(X.1xT, int):void");
    }

    public C42011xT BqY(ViewGroup viewGroup, int i) {
        C18070vi.A0d(viewGroup, 0);
        if (i == 1) {
            return new AnonymousClass3ZB(AnonymousClass3MY.A0E(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131626956));
        }
        if (i == 2) {
            return new AnonymousClass3ZA(AnonymousClass3MY.A0E(AnonymousClass3MZ.A0D(viewGroup), viewGroup, 2131626957));
        }
        throw AnonymousClass000.A0k("Invalid view type");
    }

    public int A0Q() {
        return this.A01.size();
    }

    public AnonymousClass3X4(C19880zA r2, C18000vb r3, AnonymousClass1KW r4, AnonymousClass00H r5, C18090vk r6) {
        C18070vi.A0s(r4, r5, r3, r2);
        this.A03 = r4;
        this.A06 = r5;
        this.A02 = r3;
        this.A05 = r2;
        this.A04 = r6;
    }

    public int getItemViewType(int i) {
        return 2;
    }
}
