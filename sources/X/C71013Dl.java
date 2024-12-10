package X;

/* renamed from: X.3Dl  reason: invalid class name and case insensitive filesystem */
public class C71013Dl implements C18080vj, C18090vk {
    public final int A00;
    public final Object A01;

    public C71013Dl(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static AnonymousClass1D6 A00(C18020vd r1, Object obj, int i) {
        return new AnonymousClass1D6(obj, Float.valueOf(r1.A0F(C18040vf.A02, i)));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0203, code lost:
        if (X.C24191Jf.A02((X.AnonymousClass11C) r2.A03.get(), (X.C18010vc) r2.A02.get()) < X.C18020vd.A00(r3, r4, 9751)) goto L_0x0205;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r9 = this;
            int r0 = r9.A00
            switch(r0) {
                case 0: goto L_0x0019;
                case 1: goto L_0x003f;
                case 2: goto L_0x006b;
                case 3: goto L_0x0099;
                case 4: goto L_0x00c7;
                case 5: goto L_0x00fc;
                case 6: goto L_0x019b;
                case 7: goto L_0x01a9;
                case 8: goto L_0x01b7;
                case 9: goto L_0x01c5;
                case 10: goto L_0x01d4;
                case 11: goto L_0x020b;
                case 12: goto L_0x022a;
                case 13: goto L_0x0241;
                case 14: goto L_0x0284;
                case 15: goto L_0x02a6;
                case 16: goto L_0x02c8;
                case 17: goto L_0x02d6;
                case 18: goto L_0x02ef;
                case 19: goto L_0x0308;
                case 20: goto L_0x031f;
                case 21: goto L_0x012a;
                case 22: goto L_0x0161;
                case 23: goto L_0x0330;
                case 24: goto L_0x0348;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r1 = r9.A01
            android.content.Context r1 = (android.content.Context) r1
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>()
            r0 = 2131103166(0x7f060dbe, float:1.781879E38)
            int r0 = X.C19740yt.A00(r1, r0)
            r3.setColor(r0)
        L_0x0018:
            return r3
        L_0x0019:
            java.lang.Object r1 = r9.A01
            X.1RV r1 = (X.AnonymousClass1RV) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            java.util.HashSet r3 = X.C17880vN.A12()
            X.00H r0 = r1.A04
            java.util.Iterator r1 = X.C17890vO.A0h(r0)
        L_0x002b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0018
            java.lang.Object r0 = r1.next()
            X.3MB r0 = (X.AnonymousClass3MB) r0
            X.6RT r0 = r0.BNA()
            r3.add(r0)
            goto L_0x002b
        L_0x003f:
            java.lang.Object r1 = r9.A01
            X.1RV r1 = (X.AnonymousClass1RV) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            java.util.HashSet r3 = X.C17880vN.A12()
            X.00H r0 = r1.A04
            java.util.Iterator r2 = X.C17890vO.A0h(r0)
        L_0x0051:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0018
            java.lang.Object r1 = r2.next()
            X.3MB r1 = (X.AnonymousClass3MB) r1
            boolean r0 = r1.CM8()
            if (r0 == 0) goto L_0x0051
            X.6RT r0 = r1.BNA()
            r3.add(r0)
            goto L_0x0051
        L_0x006b:
            java.lang.Object r1 = r9.A01
            X.1RV r1 = (X.AnonymousClass1RV) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            java.util.HashSet r3 = X.C17880vN.A12()
            X.00H r0 = r1.A04
            java.util.Iterator r4 = X.C17890vO.A0h(r0)
        L_0x007d:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0018
            java.lang.Object r2 = r4.next()
            X.3MB r2 = (X.AnonymousClass3MB) r2
            java.lang.Integer r1 = r2.BOc()
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 != r0) goto L_0x007d
            X.6RT r0 = r2.BNA()
            r3.add(r0)
            goto L_0x007d
        L_0x0099:
            java.lang.Object r1 = r9.A01
            X.1RV r1 = (X.AnonymousClass1RV) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            java.util.HashSet r3 = X.C17880vN.A12()
            X.00H r0 = r1.A04
            java.util.Iterator r4 = X.C17890vO.A0h(r0)
        L_0x00ab:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0018
            java.lang.Object r2 = r4.next()
            X.3MB r2 = (X.AnonymousClass3MB) r2
            java.lang.Integer r1 = r2.BOd()
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 != r0) goto L_0x00ab
            X.6RT r0 = r2.BNA()
            r3.add(r0)
            goto L_0x00ab
        L_0x00c7:
            java.lang.Object r1 = r9.A01
            X.1RV r1 = (X.AnonymousClass1RV) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.00H r0 = r1.A04
            java.lang.Object r1 = X.C18070vi.A0E(r0)
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            int r0 = X.C200510q.A00(r1)
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x00e4:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0018
            java.lang.Object r0 = r2.next()
            X.3MB r0 = (X.AnonymousClass3MB) r0
            X.6RT r1 = r0.BNA()
            X.2Qg r0 = r0.BOg()
            r3.put(r1, r0)
            goto L_0x00e4
        L_0x00fc:
            java.lang.Object r1 = r9.A01
            X.1RV r1 = (X.AnonymousClass1RV) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            java.util.HashSet r3 = X.C17880vN.A12()
            X.00H r0 = r1.A04
            java.util.Iterator r4 = X.C17890vO.A0h(r0)
        L_0x010e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0018
            java.lang.Object r2 = r4.next()
            X.3MB r2 = (X.AnonymousClass3MB) r2
            java.lang.Integer r1 = r2.BOe()
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            if (r1 != r0) goto L_0x010e
            X.6RT r0 = r2.BNA()
            r3.add(r0)
            goto L_0x010e
        L_0x012a:
            java.lang.Object r8 = r9.A01
            X.1zE r8 = (X.C43081zE) r8
            android.graphics.PorterDuffXfermode r0 = X.C43081zE.A0S
            r0 = 0
            X.C18070vi.A0d(r8, r0)
            X.1sh[] r7 = X.C39211sh.values()
            int r6 = r7.length
            int r1 = X.C200610r.A03(r6)
            r0 = 16
            if (r1 >= r0) goto L_0x0143
            r1 = 16
        L_0x0143:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>(r1)
            r5 = 0
        L_0x0149:
            if (r5 >= r6) goto L_0x0018
            r4 = r7[r5]
            int r0 = r4.statusColor
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            android.content.Context r1 = r8.A08
            X.0ve r0 = r8.A0K
            int r0 = X.C43511zv.A00(r1, r0, r4)
            X.C17880vN.A1P(r2, r3, r0)
            int r5 = r5 + 1
            goto L_0x0149
        L_0x0161:
            java.lang.Object r4 = r9.A01
            X.1zE r4 = (X.C43081zE) r4
            android.graphics.PorterDuffXfermode r0 = X.C43081zE.A0S
            r0 = 0
            X.C18070vi.A0d(r4, r0)
            r1 = 1
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>(r1)
            android.graphics.Paint$Style r0 = android.graphics.Paint.Style.STROKE
            r3.setStyle(r0)
            r3.setDither(r1)
            X.1zK r0 = r4.A04
            float r0 = r0.A01
            r3.setStrokeWidth(r0)
            android.graphics.Paint$Cap r0 = android.graphics.Paint.Cap.ROUND
            r3.setStrokeCap(r0)
            X.1si r1 = r4.A05
            boolean r0 = r1 instanceof X.C39231sj
            if (r0 == 0) goto L_0x0018
            X.1sj r1 = (X.C39231sj) r1
            X.1sh r2 = r1.A00
            android.content.Context r1 = r4.A08
            X.0ve r0 = r4.A0K
            int r0 = X.C43511zv.A00(r1, r0, r2)
            r3.setColor(r0)
            return r3
        L_0x019b:
            java.lang.Object r1 = r9.A01
            X.1nq r1 = (X.C36411nq) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0vc r1 = r1.A00
            java.lang.String r0 = "privacy_highlight"
            goto L_0x032b
        L_0x01a9:
            java.lang.Object r1 = r9.A01
            X.1dQ r1 = (X.C30121dQ) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.CyH r3 = new X.CyH
            r3.<init>(r1)
            return r3
        L_0x01b7:
            java.lang.Object r1 = r9.A01
            X.1WC r1 = (X.AnonymousClass1WC) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0vc r1 = r1.A00
            java.lang.String r0 = "confetti_reaction_prefs"
            goto L_0x032b
        L_0x01c5:
            java.lang.Object r1 = r9.A01
            X.1Sh r1 = (X.C26481Sh) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0vc r1 = r1.A00
            java.lang.String r0 = "security_prefs"
            goto L_0x032b
        L_0x01d4:
            java.lang.Object r2 = r9.A01
            X.1Lc r2 = (X.C24641Lc) r2
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            X.0ve r4 = r2.A01
            r0 = 9052(0x235c, float:1.2685E-41)
            X.0vf r3 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r3, r4, r0)
            if (r0 == 0) goto L_0x0205
            X.00H r0 = r2.A02
            java.lang.Object r1 = r0.get()
            X.0vc r1 = (X.C18010vc) r1
            X.00H r0 = r2.A03
            java.lang.Object r0 = r0.get()
            X.11C r0 = (X.AnonymousClass11C) r0
            int r2 = X.C24191Jf.A02(r0, r1)
            r0 = 9751(0x2617, float:1.3664E-41)
            int r1 = X.C18020vd.A00(r3, r4, r0)
            r0 = 1
            if (r2 >= r1) goto L_0x0206
        L_0x0205:
            r0 = 0
        L_0x0206:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x020b:
            java.lang.Object r3 = r9.A01
            X.1Ld r3 = (X.C24651Ld) r3
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            X.1Lc r0 = r3.A02
            X.0ve r2 = r0.A01
            r1 = 7705(0x1e19, float:1.0797E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0228
            X.0vc r1 = r3.A01
            java.lang.String r0 = "status_engagement_daily_preferences_v1"
            goto L_0x032b
        L_0x0228:
            r3 = 0
            return r3
        L_0x022a:
            java.lang.Object r4 = r9.A01
            X.0vd r4 = (X.C18020vd) r4
            r3 = 0
            r0 = 1
            X.1D6[] r2 = new X.AnonymousClass1D6[r0]
            X.4D0 r1 = X.AnonymousClass4D0.FAVORITES
            r0 = 6203(0x183b, float:8.692E-42)
            X.1D6 r0 = A00(r4, r1, r0)
            r2[r3] = r0
            java.util.HashMap r3 = X.AnonymousClass1D7.A07(r2)
            return r3
        L_0x0241:
            java.lang.Object r3 = r9.A01
            X.0vd r3 = (X.C18020vd) r3
            r4 = 0
            r0 = 5
            X.1D6[] r2 = new X.AnonymousClass1D6[r0]
            com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType r1 = com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType.PRESENCE
            r0 = 6205(0x183d, float:8.695E-42)
            X.1D6 r0 = A00(r3, r1, r0)
            r2[r4] = r0
            com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType r1 = com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType.PROFILE_PICTURE
            r0 = 6204(0x183c, float:8.694E-42)
            X.1D6 r1 = A00(r3, r1, r0)
            r0 = 1
            r2[r0] = r1
            com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType r1 = com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType.NEW_USER
            r0 = 7269(0x1c65, float:1.0186E-41)
            X.1D6 r1 = A00(r3, r1, r0)
            r0 = 2
            r2[r0] = r1
            com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType r1 = com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType.LAST_ACTIVE
            r0 = 7270(0x1c66, float:1.0187E-41)
            X.1D6 r1 = A00(r3, r1, r0)
            r0 = 3
            r2[r0] = r1
            com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType r1 = com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType.AREA_CODE
            r0 = 7520(0x1d60, float:1.0538E-41)
            X.1D6 r1 = A00(r3, r1, r0)
            r0 = 4
            r2[r0] = r1
            java.util.HashMap r3 = X.AnonymousClass1D7.A07(r2)
            return r3
        L_0x0284:
            java.lang.Object r4 = r9.A01
            X.0vd r4 = (X.C18020vd) r4
            r3 = 0
            r0 = 2
            X.1D6[] r2 = new X.AnonymousClass1D6[r0]
            X.4D0 r1 = X.AnonymousClass4D0.RECENTLY_ACCEPTED_INVITES
            r0 = 6318(0x18ae, float:8.853E-42)
            X.1D6 r0 = A00(r4, r1, r0)
            r2[r3] = r0
            X.4D0 r1 = X.AnonymousClass4D0.FREQUENTLY_CONTACTED
            r0 = 6319(0x18af, float:8.855E-42)
            X.1D6 r1 = A00(r4, r1, r0)
            r0 = 1
            r2[r0] = r1
            java.util.HashMap r3 = X.AnonymousClass1D7.A07(r2)
            return r3
        L_0x02a6:
            java.lang.Object r4 = r9.A01
            X.0vd r4 = (X.C18020vd) r4
            r3 = 0
            r0 = 2
            X.1D6[] r2 = new X.AnonymousClass1D6[r0]
            com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType r1 = com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType.NEW_USER
            r0 = 7271(0x1c67, float:1.0189E-41)
            X.1D6 r0 = A00(r4, r1, r0)
            r2[r3] = r0
            com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType r1 = com.whatsapp.infra.graphql.generated.suggestedcontacts.enums.GraphQLXWA2SuggestedContactsSignalType.PRESENCE
            r0 = 7274(0x1c6a, float:1.0193E-41)
            X.1D6 r1 = A00(r4, r1, r0)
            r0 = 1
            r2[r0] = r1
            java.util.HashMap r3 = X.AnonymousClass1D7.A07(r2)
            return r3
        L_0x02c8:
            java.lang.Object r1 = r9.A01
            X.1eq r1 = (X.C30991eq) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0vc r1 = r1.A00
            java.lang.String r0 = "time_spent_prefs"
            goto L_0x032b
        L_0x02d6:
            java.lang.Object r1 = r9.A01
            X.1do r1 = (X.C30361do) r1
            X.0vl r0 = X.C30361do.A0C
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0ve r2 = r1.A01
            r1 = 3858(0xf12, float:5.406E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x02ef:
            java.lang.Object r1 = r9.A01
            X.1do r1 = (X.C30361do) r1
            X.0vl r0 = X.C30361do.A0C
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0ve r2 = r1.A01
            r1 = 4929(0x1341, float:6.907E-42)
            X.0vf r0 = X.C18040vf.A02
            int r0 = X.C18020vd.A00(r0, r2, r1)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r0)
            return r3
        L_0x0308:
            java.lang.Object r1 = r9.A01
            X.1dh r1 = (X.C30291dh) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0ve r2 = r1.A00
            r1 = 3858(0xf12, float:5.406E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r0)
            return r3
        L_0x031f:
            java.lang.Object r1 = r9.A01
            X.1lD r1 = (X.C34871lD) r1
            r0 = 0
            X.C18070vi.A0d(r1, r0)
            X.0vc r1 = r1.A01
            java.lang.String r0 = "companion_wfal_prefs"
        L_0x032b:
            android.content.SharedPreferences r3 = r1.A05(r0)
            return r3
        L_0x0330:
            java.lang.Object r2 = r9.A01
            X.1zN r0 = X.C43171zN.A00()
            X.1zP r3 = r0.A01()
            r0 = 1
            r3.A05 = r0
            r0 = 0
            r3.A00(r0)
            java.util.concurrent.CopyOnWriteArraySet r0 = r3.A04
            r0.add(r2)
            return r3
        L_0x0348:
            java.lang.Object r0 = r9.A01
            android.view.View r0 = (android.view.View) r0
            android.content.res.Resources r1 = r0.getResources()
            r0 = 2131169555(0x7f071113, float:1.7953443E38)
            int r0 = r1.getDimensionPixelSize(r0)
            float r0 = (float) r0
            java.lang.Float r3 = java.lang.Float.valueOf(r0)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71013Dl.invoke():java.lang.Object");
    }
}
