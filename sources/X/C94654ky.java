package X;

import android.view.View;

/* renamed from: X.4ky  reason: invalid class name and case insensitive filesystem */
public class C94654ky implements C108005ay {
    public final int A00;
    public final Object A01;

    public C94654ky(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v11, resolved type: X.3uK} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean Bs8() {
        /*
            r3 = this;
            int r0 = r3.A00
            java.lang.Object r2 = r3.A01
            switch(r0) {
                case 0: goto L_0x0019;
                case 1: goto L_0x0020;
                case 2: goto L_0x002d;
                case 3: goto L_0x003a;
                default: goto L_0x0007;
            }
        L_0x0007:
            X.3uK r2 = (X.AnonymousClass3uK) r2
            boolean r0 = r2.A2Z()
            if (r0 == 0) goto L_0x0047
            X.21Y r1 = r2.getFMessage()
        L_0x0013:
            r0 = 2
            r2.A2T(r1, r0)
            r0 = 1
            return r0
        L_0x0019:
            X.3uP r2 = (X.AnonymousClass3uP) r2
            X.206 r1 = r2.getFMessage()
            goto L_0x0013
        L_0x0020:
            X.3ty r2 = (X.C78943ty) r2
            boolean r0 = r2.A2Z()
            if (r0 == 0) goto L_0x0047
            X.23z r1 = r2.getFMessage()
            goto L_0x0013
        L_0x002d:
            X.3u3 r2 = (X.AnonymousClass3u3) r2
            boolean r0 = r2.A2Z()
            if (r0 == 0) goto L_0x0047
            X.21d r1 = r2.getFMessage()
            goto L_0x0013
        L_0x003a:
            X.3uE r2 = (X.AnonymousClass3uE) r2
            boolean r0 = r2.A2Z()
            if (r0 == 0) goto L_0x0047
            X.21B r1 = r2.getFMessage()
            goto L_0x0013
        L_0x0047:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C94654ky.Bs8():boolean");
    }

    public void C5l(View view) {
        C38471rL r0;
        switch (this.A00) {
            case 0:
                AnonymousClass3uP.A0X((View) null, (AnonymousClass3uP) this.A01);
                return;
            case 1:
                C18070vi.A0d(view, 0);
                r0 = ((C78943ty) this.A01).A0L;
                break;
            case 3:
                C18070vi.A0d(view, 0);
                ((AnonymousClass3uE) this.A01).getThumbViewOnClickListener().onClick(view);
                return;
            default:
                r0 = ((AnonymousClass3uL) this.A01).A0F;
                break;
        }
        r0.onClick(view);
    }
}
