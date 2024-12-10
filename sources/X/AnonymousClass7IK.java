package X;

/* renamed from: X.7IK  reason: invalid class name */
public class AnonymousClass7IK implements AnonymousClass87G {
    public final int A00;
    public final Object A01;

    public AnonymousClass7IK(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0089  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void C3x(X.C131976ly r12) {
        /*
            r11 = this;
            int r0 = r11.A00
            switch(r0) {
                case 0: goto L_0x00da;
                case 1: goto L_0x00c3;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r5 = r11.A01
            X.5ii r5 = (X.C111185ii) r5
            X.C18070vi.A0h(r5, r12)
            java.util.ArrayList r4 = X.AnonymousClass000.A13()
            X.0ve r2 = r5.A04
            r1 = 3403(0xd4b, float:4.769E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00ad
            java.util.List r10 = r12.A01
            int r0 = r10.size()
            r2 = 1
            if (r0 < r2) goto L_0x0068
            java.util.ArrayList r7 = X.AnonymousClass000.A13()
            java.util.ArrayList r6 = X.AnonymousClass000.A13()
            int r9 = r10.size()
            r3 = 0
            r8 = 0
        L_0x0033:
            if (r8 >= r9) goto L_0x0055
            java.lang.Object r0 = r10.get(r8)
            X.77d r0 = (X.C1418377d) r0
            boolean r1 = r0.A0N
            java.lang.Object r0 = r10.get(r8)
            if (r1 == 0) goto L_0x00a6
            X.C18070vi.A0X(r0)
            r7.add(r0)
        L_0x0049:
            int r0 = r7.size()
            if (r0 < r2) goto L_0x00a3
            int r0 = r6.size()
            if (r0 < r2) goto L_0x00a3
        L_0x0055:
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x007d
            int r0 = r6.size()
            if (r0 < r2) goto L_0x007d
        L_0x0061:
            java.lang.Object r0 = r6.get(r3)
        L_0x0065:
            r4.add(r0)
        L_0x0068:
            X.1DT r1 = r5.A02
            java.util.List r0 = X.AnonymousClass3MW.A10(r1)
            if (r0 == 0) goto L_0x0076
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0109
        L_0x0076:
            boolean r0 = r4.isEmpty()
            if (r0 == 0) goto L_0x0109
        L_0x007c:
            return
        L_0x007d:
            boolean r0 = r6.isEmpty()
            if (r0 == 0) goto L_0x008e
            int r0 = r7.size()
            if (r0 < r2) goto L_0x008e
        L_0x0089:
            java.lang.Object r0 = r7.get(r3)
            goto L_0x0065
        L_0x008e:
            X.0z4 r0 = r5.A03
            java.lang.String r2 = "STICKERS"
            android.content.SharedPreferences r1 = X.C17890vO.A0B(r0)
            java.lang.String r0 = "expressions_suggestions_last_selected_tab"
            java.lang.String r0 = r1.getString(r0, r2)
            boolean r0 = X.C18070vi.A18(r0, r2)
            if (r0 == 0) goto L_0x0089
            goto L_0x0061
        L_0x00a3:
            int r8 = r8 + 1
            goto L_0x0033
        L_0x00a6:
            X.C18070vi.A0X(r0)
            r6.add(r0)
            goto L_0x0049
        L_0x00ad:
            java.util.List r3 = r12.A01
            int r2 = r3.size()
            r1 = 0
        L_0x00b4:
            if (r1 >= r2) goto L_0x0068
            java.lang.Object r0 = r3.get(r1)
            X.C18070vi.A0X(r0)
            r4.add(r0)
            int r1 = r1 + 1
            goto L_0x00b4
        L_0x00c3:
            java.lang.Object r1 = r11.A01
            X.1g5 r1 = (X.C31761g5) r1
            boolean r0 = r1.Be2()
            if (r0 == 0) goto L_0x007c
            java.util.List r0 = r12.A01
            X.C18070vi.A0X(r0)
            java.util.List r0 = X.C29431cG.A0q(r0)
            r1.resumeWith(r0)
            return
        L_0x00da:
            java.lang.Object r2 = r11.A01
            X.1g5 r2 = (X.C31761g5) r2
            boolean r0 = r2.Be2()
            if (r0 == 0) goto L_0x007c
            java.util.List r0 = r12.A01     // Catch:{ all -> 0x00f8 }
            X.C18070vi.A0X(r0)     // Catch:{ all -> 0x00f8 }
            java.util.List r1 = X.C29431cG.A0q(r0)     // Catch:{ all -> 0x00f8 }
            X.1eK r0 = new X.1eK     // Catch:{ all -> 0x00f8 }
            r0.<init>(r1)     // Catch:{ all -> 0x00f8 }
            r2.resumeWith(r0)     // Catch:{ all -> 0x00f8 }
            X.1Wu r0 = X.C27621Wu.A00     // Catch:{ all -> 0x00f8 }
            goto L_0x00fd
        L_0x00f8:
            r0 = move-exception
            X.1IU r0 = X.C108945cZ.A1J(r0)
        L_0x00fd:
            java.lang.Throwable r1 = X.C30671eK.A00(r0)
            if (r1 == 0) goto L_0x007c
            java.lang.String r0 = "EmojiSearchProvider/searchAwait/Unable to set result and resume."
            com.whatsapp.util.Log.e(r0, r1)
            return
        L_0x0109:
            r1.A0F(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7IK.C3x(X.6ly):void");
    }
}
