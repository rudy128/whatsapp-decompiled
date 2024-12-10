package X;

/* renamed from: X.7BO  reason: invalid class name */
public class AnonymousClass7BO implements C28519E5j {
    public final int A00;
    public final Object A01;

    public AnonymousClass7BO(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0107  */
    /* JADX WARNING: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Bn1(int r7, boolean r8) {
        /*
            r6 = this;
            int r0 = r6.A00
            switch(r0) {
                case 0: goto L_0x0030;
                case 1: goto L_0x014a;
                case 2: goto L_0x00ef;
                case 3: goto L_0x00ae;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r6.A01
            com.whatsapp.status.playback.MessageReplyActivity r3 = (com.whatsapp.status.playback.MessageReplyActivity) r3
            if (r8 == 0) goto L_0x0030
            android.widget.GridLayout r0 = r3.A09
            java.lang.String r1 = "hasAvatar="
            r5 = 4
            if (r0 != 0) goto L_0x0031
            X.00H r0 = r3.A19
            X.6ue r2 = X.C108945cZ.A0p(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r1)
            X.00H r0 = r3.A17
            boolean r0 = X.C108975cc.A1I(r0)
            java.lang.String r1 = X.AnonymousClass3MY.A0r(r1, r0)
            java.lang.String r0 = "failed_to_select_reaction_tab_null_avatar_grid"
        L_0x0028:
            r2.A02(r5, r0, r1)
        L_0x002b:
            android.graphics.Bitmap r0 = r3.A01
            com.whatsapp.status.playback.MessageReplyActivity.A0s(r0, r3)
        L_0x0030:
            return
        L_0x0031:
            android.widget.GridLayout r2 = r3.A0A
            if (r2 != 0) goto L_0x004c
            X.00H r0 = r3.A19
            X.6ue r2 = X.C108945cZ.A0p(r0)
            java.lang.StringBuilder r1 = X.AnonymousClass000.A11(r1)
            X.00H r0 = r3.A17
            boolean r0 = X.C108975cc.A1I(r0)
            java.lang.String r1 = X.AnonymousClass3MY.A0r(r1, r0)
            java.lang.String r0 = "failed_to_select_reaction_tab_null_emoji_grid"
            goto L_0x0028
        L_0x004c:
            r0 = 2131430352(0x7f0b0bd0, float:1.8482403E38)
            r1 = 8
            r4 = 0
            if (r7 != r0) goto L_0x0076
            r2.setVisibility(r4)
            android.widget.GridLayout r0 = r3.A09
            r0.setVisibility(r1)
            android.widget.FrameLayout r0 = r3.A08
            com.whatsapp.status.playback.MessageReplyActivity.A0t(r0, r3)
            java.lang.Integer r0 = X.AnonymousClass00R.A00
            r3.A1W = r0
            X.0z4 r0 = r3.A0A
            java.lang.String r2 = "EMOJI"
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "status_reactions_type_selected_tab"
            X.C17880vN.A1E(r1, r0, r2)
            com.whatsapp.status.playback.MessageReplyActivity.A10(r3, r5)
            goto L_0x002b
        L_0x0076:
            r0 = 2131428000(0x7f0b02a0, float:1.8477632E38)
            if (r7 != r0) goto L_0x002b
            r2.setVisibility(r1)
            android.widget.GridLayout r0 = r3.A09
            r0.setVisibility(r4)
            X.00H r0 = r3.A1B
            java.lang.Object r2 = r0.get()
            com.whatsapp.status.playback.avatar.AvatarReactionRepository r2 = (com.whatsapp.status.playback.avatar.AvatarReactionRepository) r2
            boolean r1 = r3.A4e()
            X.6oi r0 = r3.A1m
            java.lang.ref.WeakReference r0 = X.AnonymousClass3MW.A0z(r0)
            r2.A01(r0, r1)
            java.lang.Integer r0 = X.AnonymousClass00R.A01
            r3.A1W = r0
            X.0z4 r0 = r3.A0A
            java.lang.String r2 = "AVATAR"
            android.content.SharedPreferences$Editor r1 = X.C19830z4.A00(r0)
            java.lang.String r0 = "status_reactions_type_selected_tab"
            X.C17880vN.A1E(r1, r0, r2)
            com.whatsapp.status.playback.MessageReplyActivity.A10(r3, r4)
            goto L_0x002b
        L_0x00ae:
            java.lang.Object r3 = r6.A01
            com.whatsapp.newsletter.ui.reactions.NewsletterReactionsSheet r3 = (com.whatsapp.newsletter.ui.reactions.NewsletterReactionsSheet) r3
            r0 = 2131434360(0x7f0b1b78, float:1.8490532E38)
            if (r7 != r0) goto L_0x00d1
            com.google.android.material.button.MaterialButton r1 = r3.A01
            X.6RL r2 = X.AnonymousClass6RL.A02
        L_0x00bb:
            if (r1 == 0) goto L_0x00c6
            r0 = 0
            if (r8 == 0) goto L_0x00c3
            r0 = 2131232931(0x7f0808a3, float:1.8081985E38)
        L_0x00c3:
            r1.setIconResource(r0)
        L_0x00c6:
            if (r8 == 0) goto L_0x0030
            X.5iq r1 = r3.A09
            if (r1 != 0) goto L_0x00db
            X.AnonymousClass3MW.A1H()
            r0 = 0
            throw r0
        L_0x00d1:
            r0 = 2131434361(0x7f0b1b79, float:1.8490534E38)
            if (r7 != r0) goto L_0x0030
            com.google.android.material.button.MaterialButton r1 = r3.A02
            X.6RL r2 = X.AnonymousClass6RL.A03
            goto L_0x00bb
        L_0x00db:
            X.1DT r0 = r1.A04
            java.lang.Object r0 = r0.A06()
            X.6rG r0 = (X.C134856rG) r0
            if (r0 == 0) goto L_0x0030
            java.util.List r0 = r0.A01
            int r0 = r0.indexOf(r2)
            r1.A0T(r0)
            return
        L_0x00ef:
            java.lang.Object r2 = r6.A01
            com.whatsapp.expressionstray.search.ExpressionsSearchView r2 = (com.whatsapp.expressionstray.search.ExpressionsSearchView) r2
            if (r8 == 0) goto L_0x0030
            r0 = 2131430352(0x7f0b0bd0, float:1.8482403E38)
            if (r7 != r0) goto L_0x0126
            com.whatsapp.expressionstray.search.ExpressionsSearchViewModel r1 = X.C108965cb.A0N(r2)
            X.5zR r0 = X.C117235zR.A00
        L_0x0100:
            r1.A0T(r0)
        L_0x0103:
            com.whatsapp.WaEditText r2 = r2.A0B
            if (r2 == 0) goto L_0x0030
            r0 = 2131431146(0x7f0b0eea, float:1.8484013E38)
            r1 = 2131890775(0x7f121257, float:1.9416251E38)
            if (r7 == r0) goto L_0x0122
            r0 = 2131428000(0x7f0b02a0, float:1.8477632E38)
            r1 = 2131886867(0x7f120313, float:1.9408325E38)
            if (r7 == r0) goto L_0x0122
            r0 = 2131435784(0x7f0b2108, float:1.849342E38)
            r1 = 2131890260(0x7f121054, float:1.9415207E38)
            if (r7 != r0) goto L_0x0122
            r1 = 2131896531(0x7f1228d3, float:1.9427926E38)
        L_0x0122:
            r2.setHint(r1)
            return
        L_0x0126:
            r0 = 2131431146(0x7f0b0eea, float:1.8484013E38)
            if (r7 != r0) goto L_0x0132
            com.whatsapp.expressionstray.search.ExpressionsSearchViewModel r1 = X.C108965cb.A0N(r2)
            X.5zS r0 = X.C117245zS.A00
            goto L_0x0100
        L_0x0132:
            r0 = 2131428000(0x7f0b02a0, float:1.8477632E38)
            if (r7 != r0) goto L_0x013e
            com.whatsapp.expressionstray.search.ExpressionsSearchViewModel r1 = X.C108965cb.A0N(r2)
            X.5zQ r0 = X.C117225zQ.A00
            goto L_0x0100
        L_0x013e:
            r0 = 2131435784(0x7f0b2108, float:1.849342E38)
            if (r7 != r0) goto L_0x0103
            com.whatsapp.expressionstray.search.ExpressionsSearchViewModel r1 = X.C108965cb.A0N(r2)
            X.5zT r0 = X.C117255zT.A00
            goto L_0x0100
        L_0x014a:
            java.lang.Object r0 = r6.A01
            com.whatsapp.expressionstray.ExpressionsTrayView r0 = (com.whatsapp.expressionstray.ExpressionsTrayView) r0
            com.whatsapp.expressionstray.ExpressionsTrayView.A08(r0, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7BO.Bn1(int, boolean):void");
    }
}
