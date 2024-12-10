package X;

import android.view.View;

/* renamed from: X.4do  reason: invalid class name and case insensitive filesystem */
public class C90274do implements View.OnLongClickListener {
    public final int A00;
    public final Object A01;

    public C90274do(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, Object obj, int i) {
        view.setOnLongClickListener(new C90274do(obj, i));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v7, resolved type: X.2CV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: X.2CV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: X.2CW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v16, resolved type: X.2CW} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: X.2CV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: X.2CV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v31, resolved type: X.2CV} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v32, resolved type: X.2CV} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0077, code lost:
        if (r3 == false) goto L_0x0082;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0079, code lost:
        r2.CPY(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x007c, code lost:
        r4.A0A.notifyDataSetChanged();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0082, code lost:
        r2.COH(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00d3, code lost:
        com.whatsapp.calling.dialer.DialerViewModel.A03(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00d6, code lost:
        com.whatsapp.calling.dialer.DialerActivity.A0c(r3, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0123, code lost:
        r1 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0127, code lost:
        if (r1.A0u == false) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x012d, code lost:
        if (r2.A0B() == null) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x012f, code lost:
        r0 = r2.A0B();
        X.C17960vV.A07(r0);
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x013a, code lost:
        if (com.whatsapp.calling.callhistory.view.CallsHistoryFragment.A0C(r0) != false) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x013c, code lost:
        r0 = "CallsHistoryFragmentV2/WaContactViewHolderEventListener/onViewHolderLongClicked action not supported in the middle of a search";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0147, code lost:
        r1 = r0.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x014b, code lost:
        if (r1.A0u == false) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0151, code lost:
        if (r2.A0B() == null) goto L_0x0160;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0153, code lost:
        r0 = r2.A0B();
        X.C17960vV.A07(r0);
        r2 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x015e, code lost:
        if (com.whatsapp.calling.callhistory.view.CallsHistoryFragment.A0C(r0) != false) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0160, code lost:
        r0 = "callsHistoryFragmentV2/WaContactViewHolderEventListener/onContactPhotoLongClicked Ignoring long click";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0162, code lost:
        com.whatsapp.util.Log.i(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0167, code lost:
        com.whatsapp.calling.callhistory.view.CallsHistoryFragment.A07(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:?, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        return true;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onLongClick(android.view.View r6) {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x01ba;
                case 1: goto L_0x01a2;
                case 2: goto L_0x016c;
                case 3: goto L_0x013f;
                case 4: goto L_0x011b;
                case 5: goto L_0x0112;
                case 6: goto L_0x0109;
                case 7: goto L_0x00e5;
                case 8: goto L_0x00dc;
                case 9: goto L_0x00bc;
                case 10: goto L_0x00a5;
                case 11: goto L_0x018f;
                case 12: goto L_0x0032;
                case 13: goto L_0x0086;
                case 14: goto L_0x005f;
                case 15: goto L_0x0046;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r3 = r5.A01
            com.whatsapp.settings.SettingsUserProxyActivity r3 = (com.whatsapp.settings.SettingsUserProxyActivity) r3
            com.whatsapp.settings.SettingsUserProxyViewModel r0 = r3.A0A
            java.lang.String r0 = r0.A02
            boolean r0 = X.AnonymousClass1EG.A0H(r0)
            if (r0 != 0) goto L_0x01d1
            X.3Rj r2 = X.AnonymousClass4a6.A00(r3)
            r0 = 2131894817(0x7f122221, float:1.942445E38)
            r2.A0E(r0)
            r1 = 2131889308(0x7f120c9c, float:1.9413276E38)
            r0 = 16
            X.C73203Rj.A0B(r2, r3, r0, r1)
            r1 = 2131898766(0x7f12318e, float:1.943246E38)
            r0 = 41
            X.C73203Rj.A07(r2, r0, r1)
            X.AnonymousClass3MY.A1G(r2)
        L_0x0030:
            r0 = 1
            return r0
        L_0x0032:
            java.lang.Object r1 = r5.A01
            X.3uP r1 = (X.AnonymousClass3uP) r1
            X.5cR r0 = r1.A0k
            if (r0 == 0) goto L_0x0042
            boolean r0 = r0.Bgu()
            if (r0 == 0) goto L_0x0042
            goto L_0x01d1
        L_0x0042:
            r1.A1r()
            goto L_0x0030
        L_0x0046:
            java.lang.Object r1 = r5.A01
            X.3Zc r1 = (X.C74253Zc) r1
            X.206 r0 = r1.A00
            if (r0 == 0) goto L_0x01d1
            com.whatsapp.gallery.LinksGalleryFragment r4 = r1.A0A
            X.5cR r0 = X.C72453Mb.A0j(r4)
            boolean r3 = r0.Bcq()
            X.5cR r2 = X.C72453Mb.A0j(r4)
            X.206 r0 = r1.A00
            goto L_0x0077
        L_0x005f:
            java.lang.Object r1 = r5.A01
            X.3ZX r1 = (X.AnonymousClass3ZX) r1
            X.21i r0 = r1.A00
            if (r0 == 0) goto L_0x01d1
            com.whatsapp.gallery.DocumentsGalleryFragment r4 = r1.A0B
            X.5cR r0 = X.C72453Mb.A0j(r4)
            boolean r3 = r0.Bcq()
            X.5cR r2 = X.C72453Mb.A0j(r4)
            X.21i r0 = r1.A00
        L_0x0077:
            if (r3 == 0) goto L_0x0082
            r2.CPY(r0)
        L_0x007c:
            X.3XJ r0 = r4.A0A
            r0.notifyDataSetChanged()
            goto L_0x0030
        L_0x0082:
            r2.COH(r0)
            goto L_0x007c
        L_0x0086:
            java.lang.Object r4 = r5.A01
            X.4aY r4 = (X.AnonymousClass4aY) r4
            X.0ve r2 = r4.A3F
            r1 = 8395(0x20cb, float:1.1764E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r3 = 0
            if (r0 == 0) goto L_0x01d1
            X.5tO r2 = r4.A24
            java.lang.Integer r1 = X.AnonymousClass4aY.A09(r4)
            java.lang.Integer r0 = X.AnonymousClass4aY.A0A(r4)
            r2.A0G(r1, r0, r3)
            goto L_0x0030
        L_0x00a5:
            java.lang.Object r3 = r5.A01
            com.whatsapp.calling.dialer.DialerActivity r3 = (com.whatsapp.calling.dialer.DialerActivity) r3
            java.util.ArrayList r0 = com.whatsapp.calling.dialer.DialerActivity.A0I
            com.whatsapp.calling.dialer.DialerViewModel r2 = X.AnonymousClass3MZ.A0X(r3)
            java.lang.StringBuilder r1 = r2.A0C
            int r0 = r1.length()
            if (r0 <= 0) goto L_0x00d6
            r0 = 0
            r1.setLength(r0)
            goto L_0x00d3
        L_0x00bc:
            java.lang.Object r3 = r5.A01
            com.whatsapp.calling.dialer.DialerActivity r3 = (com.whatsapp.calling.dialer.DialerActivity) r3
            java.util.ArrayList r0 = com.whatsapp.calling.dialer.DialerActivity.A0I
            com.whatsapp.calling.dialer.DialerViewModel r2 = X.AnonymousClass3MZ.A0X(r3)
            java.lang.StringBuilder r1 = r2.A0C
            int r0 = r1.length()
            if (r0 != 0) goto L_0x0030
            java.lang.String r0 = "+"
            r1.append(r0)
        L_0x00d3:
            com.whatsapp.calling.dialer.DialerViewModel.A03(r2)
        L_0x00d6:
            r0 = 0
            com.whatsapp.calling.dialer.DialerActivity.A0c(r3, r0)
            goto L_0x0030
        L_0x00dc:
            java.lang.Object r0 = r5.A01
            com.whatsapp.calling.dialer.DialerActivity r0 = (com.whatsapp.calling.dialer.DialerActivity) r0
            com.whatsapp.calling.dialer.DialerActivity.A0V(r0)
            goto L_0x0030
        L_0x00e5:
            java.lang.Object r0 = r5.A01
            X.3mi r0 = (X.C76173mi) r0
            com.whatsapp.calling.participantlist.viewmodel.ParticipantsListViewModel r3 = r0.A00
            if (r3 == 0) goto L_0x0030
            X.3nV r0 = r0.A00
            if (r0 == 0) goto L_0x0030
            X.1BI r2 = r0.A03
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ParticipantsListViewModel/showVoiceCallParticipantMenu "
            X.C17900vP.A0Y(r2, r0, r1)
            boolean r0 = X.C22971Dz.A0d(r2)
            if (r0 == 0) goto L_0x0030
            X.1wy r0 = r3.A0H
            r0.A0F(r2)
            goto L_0x0030
        L_0x0109:
            java.lang.Object r2 = r5.A01
            X.2CW r2 = (X.AnonymousClass2CW) r2
            java.util.List r0 = X.C42011xT.A0I
            X.1mB r0 = r2.A03
            goto L_0x0123
        L_0x0112:
            java.lang.Object r2 = r5.A01
            X.2CW r2 = (X.AnonymousClass2CW) r2
            java.util.List r0 = X.C42011xT.A0I
            X.1mB r0 = r2.A03
            goto L_0x0147
        L_0x011b:
            java.lang.Object r2 = r5.A01
            X.2CV r2 = (X.AnonymousClass2CV) r2
            java.util.List r0 = X.C42011xT.A0I
            X.1mB r0 = r2.A01
        L_0x0123:
            com.whatsapp.calling.callhistory.view.CallsHistoryFragment r1 = r0.A00
            boolean r0 = r1.A0u
            if (r0 == 0) goto L_0x013c
            X.1vq r0 = r2.A0B()
            if (r0 == 0) goto L_0x013c
            X.1vq r0 = r2.A0B()
            X.C17960vV.A07(r0)
            boolean r0 = com.whatsapp.calling.callhistory.view.CallsHistoryFragment.A0C(r0)
            if (r0 != 0) goto L_0x0167
        L_0x013c:
            java.lang.String r0 = "CallsHistoryFragmentV2/WaContactViewHolderEventListener/onViewHolderLongClicked action not supported in the middle of a search"
            goto L_0x0162
        L_0x013f:
            java.lang.Object r2 = r5.A01
            X.2CV r2 = (X.AnonymousClass2CV) r2
            java.util.List r0 = X.C42011xT.A0I
            X.1mB r0 = r2.A01
        L_0x0147:
            com.whatsapp.calling.callhistory.view.CallsHistoryFragment r1 = r0.A00
            boolean r0 = r1.A0u
            if (r0 == 0) goto L_0x0160
            X.1vq r0 = r2.A0B()
            if (r0 == 0) goto L_0x0160
            X.1vq r0 = r2.A0B()
            X.C17960vV.A07(r0)
            boolean r0 = com.whatsapp.calling.callhistory.view.CallsHistoryFragment.A0C(r0)
            if (r0 != 0) goto L_0x0167
        L_0x0160:
            java.lang.String r0 = "callsHistoryFragmentV2/WaContactViewHolderEventListener/onContactPhotoLongClicked Ignoring long click"
        L_0x0162:
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x0030
        L_0x0167:
            com.whatsapp.calling.callhistory.view.CallsHistoryFragment.A07(r2, r1)
            goto L_0x0030
        L_0x016c:
            java.lang.Object r2 = r5.A01
            X.Bq2 r2 = (X.Bq2) r2
            java.util.List r0 = X.C42011xT.A0I
            X.2yP r0 = r2.A00
            if (r0 != 0) goto L_0x017c
            java.lang.String r0 = "CallsHistoryCallItemViewHolder/onViewHolderLongClicked call item is null"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            goto L_0x01d1
        L_0x017c:
            X.1mD r0 = r2.A09
            com.whatsapp.calling.callhistory.view.CallsHistoryFragment r1 = r0.A00
            boolean r0 = r1.A0u
            if (r0 != 0) goto L_0x018a
            java.lang.String r0 = "CallsHistoryFragmentV2/callItemViewHolderEventListener/onViewHolderLongClicked action not supported in the middle of a search"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            goto L_0x01d1
        L_0x018a:
            com.whatsapp.calling.callhistory.view.CallsHistoryFragment.A08(r2, r1)
            goto L_0x0030
        L_0x018f:
            java.lang.Object r2 = r5.A01
            X.4V8 r2 = (X.AnonymousClass4V8) r2
            java.util.List r0 = X.C42011xT.A0I
            X.1Di r1 = r2.A04
            com.whatsapp.jid.GroupJid r0 = r2.A02
            java.lang.Object r0 = r1.invoke(r0)
            boolean r0 = X.AnonymousClass000.A1Y(r0)
            return r0
        L_0x01a2:
            java.lang.Object r1 = r5.A01
            X.3Oo r1 = (X.C72993Oo) r1
            X.3O9 r6 = (X.AnonymousClass3O9) r6
            android.graphics.drawable.Drawable r0 = r6.A01
            if (r0 == 0) goto L_0x01d1
            X.4aN r2 = r1.A03
            int r0 = X.AnonymousClass4aN.A0X
            X.0z4 r1 = r2.A0K
            r0 = 1
            r1.A1J(r0)
            X.AnonymousClass4aN.A02(r6, r2)
            goto L_0x01d1
        L_0x01ba:
            java.lang.Object r1 = r5.A01
            X.3Oo r1 = (X.C72993Oo) r1
            X.3O9 r6 = (X.AnonymousClass3O9) r6
            android.graphics.drawable.Drawable r0 = r6.A01
            if (r0 == 0) goto L_0x01d1
            X.4aN r2 = r1.A03
            int r0 = X.AnonymousClass4aN.A0X
            X.0z4 r1 = r2.A0K
            r0 = 1
            r1.A1J(r0)
            X.AnonymousClass4aN.A01(r6, r2)
        L_0x01d1:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C90274do.onLongClick(android.view.View):boolean");
    }
}
