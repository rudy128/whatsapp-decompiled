package X;

import android.view.View;
import com.whatsapp.WaTextView;

/* renamed from: X.94c  reason: invalid class name and case insensitive filesystem */
public final class C1764094c extends AnonymousClass8IQ {
    public final View A00;
    public final WaTextView A01;
    public final WaTextView A02;
    public final AnonymousClass1R2 A03;

    public C1764094c(View view, AnonymousClass1R2 r3) {
        super(view);
        this.A03 = r3;
        this.A02 = AnonymousClass3Ma.A0N(view, 2131435709);
        this.A01 = AnonymousClass3Ma.A0N(view, 2131433311);
        this.A00 = C18070vi.A05(view, 2131436370);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0058, code lost:
        r3 = r6.getString(r0);
        r2 = 2131233352;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0076, code lost:
        r3 = r6.getString(r0);
        r2 = 2131233422;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0081, code lost:
        r3 = r6.getString(r0);
        r2 = 2131233280;
        r1 = 2130970627;
        r0 = 2131102011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001a, code lost:
        r3 = r6.getString(r0);
        r2 = 2131233286;
        r1 = 2130970924;
        r0 = 2131102368;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0027, code lost:
        r4 = X.AnonymousClass1YL.A00(r6, r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x002b, code lost:
        r1 = X.C40501uo.A00((android.content.res.Resources.Theme) null, r6.getResources(), r2);
        r1.getClass();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x003b, code lost:
        return new X.C186209dp(r1, r3, r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.C186209dp A00(android.content.Context r6, X.AnonymousClass1KJ r7, X.AnonymousClass1R2 r8, int r9, boolean r10) {
        /*
            r2 = 2130971113(0x7f0409e9, float:1.7550955E38)
            r1 = 2131102439(0x7f060ae7, float:1.7817316E38)
            int r4 = X.AnonymousClass1YL.A00(r6, r2, r1)
            r5 = 0
            switch(r9) {
                case 1: goto L_0x003c;
                case 2: goto L_0x0045;
                case 3: goto L_0x0049;
                case 4: goto L_0x004d;
                case 5: goto L_0x0051;
                case 6: goto L_0x0055;
                case 7: goto L_0x0060;
                case 8: goto L_0x0073;
                case 9: goto L_0x007e;
                default: goto L_0x000e;
            }
        L_0x000e:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "OrderStatusMapper/mapStatus can not map order status "
            X.C17900vP.A0i(r0, r1, r9)
            r0 = 2131893252(0x7f121c04, float:1.9421275E38)
        L_0x001a:
            java.lang.String r3 = r6.getString(r0)
            r2 = 2131233286(0x7f080a06, float:1.8082705E38)
            r1 = 2130970924(0x7f04092c, float:1.7550572E38)
            r0 = 2131102368(0x7f060aa0, float:1.7817172E38)
        L_0x0027:
            int r4 = X.AnonymousClass1YL.A00(r6, r1, r0)
        L_0x002b:
            android.content.res.Resources r0 = r6.getResources()
            android.graphics.drawable.Drawable r1 = X.C40501uo.A00(r5, r0, r2)
            r1.getClass()
        L_0x0036:
            X.9dp r0 = new X.9dp
            r0.<init>(r1, r3, r4)
            return r0
        L_0x003c:
            r0 = 2131893244(0x7f121bfc, float:1.942126E38)
            if (r10 == 0) goto L_0x0076
            r0 = 2131893241(0x7f121bf9, float:1.9421253E38)
            goto L_0x0076
        L_0x0045:
            r0 = 2131893248(0x7f121c00, float:1.9421267E38)
            goto L_0x0076
        L_0x0049:
            r0 = 2131893235(0x7f121bf3, float:1.942124E38)
            goto L_0x0081
        L_0x004d:
            r0 = 2131893233(0x7f121bf1, float:1.9421237E38)
            goto L_0x001a
        L_0x0051:
            r0 = 2131893239(0x7f121bf7, float:1.9421249E38)
            goto L_0x0058
        L_0x0055:
            r0 = 2131893250(0x7f121c02, float:1.9421271E38)
        L_0x0058:
            java.lang.String r3 = r6.getString(r0)
            r2 = 2131233352(0x7f080a48, float:1.808284E38)
            goto L_0x002b
        L_0x0060:
            r0 = 2131893242(0x7f121bfa, float:1.9421255E38)
            java.lang.String r3 = r6.getString(r0)
            int r1 = X.AnonymousClass1YL.A00(r6, r2, r1)
            r0 = 2131168116(0x7f070b74, float:1.7950525E38)
            X.26n r1 = r8.A0M(r6, r7, r1, r0)
            goto L_0x0036
        L_0x0073:
            r0 = 2131893246(0x7f121bfe, float:1.9421263E38)
        L_0x0076:
            java.lang.String r3 = r6.getString(r0)
            r2 = 2131233422(0x7f080a8e, float:1.8082981E38)
            goto L_0x002b
        L_0x007e:
            r0 = 2131893237(0x7f121bf5, float:1.9421245E38)
        L_0x0081:
            java.lang.String r3 = r6.getString(r0)
            r2 = 2131233280(0x7f080a00, float:1.8082693E38)
            r1 = 2130970627(0x7f040803, float:1.754997E38)
            r0 = 2131102011(0x7f06093b, float:1.7816448E38)
            goto L_0x0027
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1764094c.A00(android.content.Context, X.1KJ, X.1R2, int, boolean):X.9dp");
    }
}
