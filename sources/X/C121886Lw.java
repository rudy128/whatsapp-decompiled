package X;

import com.whatsapp.jid.UserJid;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: X.6Lw  reason: invalid class name and case insensitive filesystem */
public final class C121886Lw extends A34 {
    public final C25931Qe A00;
    public final WeakReference A01;
    public final WeakReference A02;
    public final boolean A03;
    public final boolean A04;

    public C121886Lw(C25931Qe r2, C126506cq r3, C120906Gm r4, boolean z, boolean z2) {
        C18070vi.A0d(r2, 2);
        this.A00 = r2;
        this.A04 = z;
        this.A03 = z2;
        this.A02 = AnonymousClass3MW.A0z(r4);
        this.A01 = AnonymousClass3MW.A0z(r3);
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        String str;
        AnonymousClass6Gn r4 = (AnonymousClass6Gn) this.A02.get();
        if (r4 == null) {
            return null;
        }
        AnonymousClass206 r3 = r4.A07;
        HashMap A11 = C17880vN.A11();
        if (this.A04) {
            C18070vi.A0d(r3, 0);
            C108985cd.A19(this.A00, r3, AnonymousClass8BG.class, new AnonymousClass25F[1]);
            AnonymousClass8BG A012 = C63892tr.A01(r3);
            if (A012 != null) {
                Iterator it = C1409073n.A03(A012.BMh()).iterator();
                while (it.hasNext()) {
                    AnonymousClass7PX r2 = (AnonymousClass7PX) it.next();
                    String str2 = r2.A05;
                    if (!(str2 == null || str2.length() == 0)) {
                        AnonymousClass1BI r7 = r2.A04;
                        if (r7 instanceof UserJid) {
                            C18070vi.A0z(r7, "null cannot be cast to non-null type com.whatsapp.jid.UserJid");
                            UserJid userJid = (UserJid) r7;
                            A11.put(userJid, new C129226hS(userJid, (C139106yE) null, str2, r2.A01));
                        }
                    }
                }
            }
        }
        if (this.A03) {
            Set entrySet = r4.A0K.A00(r3).A00.entrySet();
            C18070vi.A0X(entrySet);
            Iterator it2 = entrySet.iterator();
            while (it2.hasNext()) {
                Map.Entry A16 = AnonymousClass000.A16(it2);
                long A013 = ((C62452rQ) A16.getValue()).A01(13);
                if (A013 > 0) {
                    C129226hS r0 = (C129226hS) A11.get(A16.getKey());
                    if (r0 != null) {
                        str = r0.A03;
                    } else {
                        str = null;
                    }
                    A11.put(A16.getKey(), new C129226hS((UserJid) A16.getKey(), (C139106yE) null, str, A013));
                }
            }
        }
        ArrayList A10 = C17880vN.A10(A11.values());
        C29391cC.A0H(A10, new C146997Rk((Object) AnonymousClass84Q.A00, 13));
        return A10;
    }

    /* JADX WARNING: Removed duplicated region for block: B:51:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0123  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x017e  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0185  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0H(java.lang.Object r14) {
        /*
            r13 = this;
            java.util.List r14 = (java.util.List) r14
            java.lang.ref.WeakReference r0 = r13.A02
            java.lang.Object r1 = r0.get()
            java.lang.ref.WeakReference r0 = r13.A01
            java.lang.Object r0 = r0.get()
            X.6cq r0 = (X.C126506cq) r0
            if (r1 == 0) goto L_0x016c
            if (r14 == 0) goto L_0x016c
            if (r0 == 0) goto L_0x016c
            X.6Gm r3 = r0.A00
            X.0z4 r0 = r3.A05
            boolean r12 = r0.A2U()
            X.6Gk r2 = r3.A0B
            X.72l r5 = r2.A0A
            if (r5 == 0) goto L_0x00ac
            r8 = 0
            com.whatsapp.WaTextView r9 = r5.A0B
            X.0z4 r0 = r5.A0E
            boolean r0 = r0.A2U()
            r6 = 1
            r4 = 0
            if (r0 == 0) goto L_0x0050
            X.0vb r11 = r5.A0F
            r10 = 2131755491(0x7f1001e3, float:1.9141863E38)
            int r0 = r14.size()
            long r0 = (long) r0
            java.lang.Object[] r7 = new java.lang.Object[r6]
            X.C108985cd.A1S(r14, r7, r8)
            java.lang.String r0 = r11.A0K(r7, r10, r0)
        L_0x0044:
            r9.setText(r0)
            X.5l5 r7 = r5.A03
            if (r7 != 0) goto L_0x005c
            X.AnonymousClass3MW.A1B()
        L_0x004e:
            r0 = 0
            throw r0
        L_0x0050:
            android.content.Context r1 = r9.getContext()
            r0 = 2131897969(0x7f122e71, float:1.9430842E38)
            java.lang.String r0 = r1.getString(r0)
            goto L_0x0044
        L_0x005c:
            boolean r0 = r7.A09
            if (r0 == 0) goto L_0x01f9
            java.util.List r1 = r7.A00
            X.5jf r0 = new X.5jf
            r0.<init>(r1, r14)
            X.Cl4 r0 = X.C25367CeS.A00(r0)
            r7.A00 = r14
            r0.A02(r7)
        L_0x0070:
            android.widget.TextView r1 = r5.A08
            boolean r0 = r14.isEmpty()
            int r0 = X.C72453Mb.A07(r0)
            r1.setVisibility(r0)
            boolean r0 = r5.A0R
            if (r0 == 0) goto L_0x01ea
            androidx.recyclerview.widget.RecyclerView r7 = r5.A09
            int r4 = r7.getPaddingLeft()
            int r1 = r7.getPaddingTop()
            int r0 = r7.getPaddingRight()
            r7.setPadding(r4, r1, r0, r8)
        L_0x0092:
            X.5jJ r0 = r5.A0L
            if (r0 == 0) goto L_0x00a3
            X.1DT r0 = r0.A04
            java.lang.Object r0 = r0.A06()
            java.util.Map r0 = (java.util.Map) r0
            if (r0 == 0) goto L_0x00a3
            X.C1406672l.A02(r5, r0)
        L_0x00a3:
            r5.A04 = r6
            boolean r0 = r5.A0Q
            if (r0 != 0) goto L_0x00ac
            X.C1406672l.A01(r5)
        L_0x00ac:
            android.widget.TextView r1 = r2.A08
            r5 = 8
            r4 = 0
            if (r1 == 0) goto L_0x00ba
            int r0 = X.C72453Mb.A07(r12)
            r1.setVisibility(r0)
        L_0x00ba:
            android.widget.TextView r7 = r2.A08
            if (r7 == 0) goto L_0x00da
            boolean r0 = r3.A0V
            X.0vb r9 = r3.A06
            if (r0 == 0) goto L_0x01db
            r8 = 2131755303(0x7f100127, float:1.9141481E38)
            int r0 = r14.size()
            long r0 = (long) r0
            java.lang.Object[] r6 = X.AnonymousClass3MW.A1a()
            X.C108985cd.A1S(r14, r6, r4)
            java.lang.String r0 = r9.A0K(r6, r8, r0)
        L_0x00d7:
            r7.setText(r0)
        L_0x00da:
            boolean r8 = r3.A0V
            if (r8 == 0) goto L_0x01d7
            android.view.ViewGroup r7 = r2.A06
        L_0x00e0:
            int r11 = r14.size()
            if (r7 == 0) goto L_0x0109
            X.0vb r10 = r3.A06
            r9 = 2131755491(0x7f1001e3, float:1.9141863E38)
            long r0 = (long) r11
            java.lang.Object[] r6 = X.AnonymousClass3MW.A1a()
            X.C17880vN.A1T(r6, r11, r4)
            java.lang.String r0 = r10.A0K(r6, r9, r0)
            r7.setContentDescription(r0)
            r0 = 2131892384(0x7f1218a0, float:1.9419515E38)
            X.AnonymousClass1Y5.A02(r7, r0)
            int r0 = r7.getVisibility()
            if (r0 == 0) goto L_0x0117
            r7.setVisibility(r4)
        L_0x0109:
            android.view.animation.AlphaAnimation r6 = X.C72463Mc.A0Q()
            r0 = 120(0x78, double:5.93E-322)
            r6.setDuration(r0)
            if (r7 == 0) goto L_0x0117
            r7.startAnimation(r6)
        L_0x0117:
            r1 = 2131232323(0x7f080643, float:1.8080752E38)
            if (r12 == 0) goto L_0x011f
            r1 = 2131232413(0x7f08069d, float:1.8080935E38)
        L_0x011f:
            X.1bI r9 = r2.A0C
            if (r9 == 0) goto L_0x0146
            X.0ve r7 = r3.A0L
            r6 = 7497(0x1d49, float:1.0506E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r7, r6)
            if (r0 == 0) goto L_0x0146
            X.206 r0 = r3.A07
            X.8BG r0 = X.C63892tr.A01(r0)
            if (r0 == 0) goto L_0x01d2
            int r0 = r0.BXt()
            if (r0 <= 0) goto L_0x01d2
            android.view.View r0 = r9.A02()
            com.airbnb.lottie.LottieAnimationView r0 = (com.airbnb.lottie.LottieAnimationView) r0
            r0.A04()
        L_0x0146:
            if (r8 == 0) goto L_0x017a
            X.0vl r0 = r3.A0F
            boolean r0 = X.C72453Mb.A1a(r0)
            if (r0 != 0) goto L_0x016d
            android.widget.ImageView r0 = r2.A07
            if (r0 == 0) goto L_0x0157
            r0.setImageResource(r1)
        L_0x0157:
            android.widget.ImageView r0 = r2.A07
            if (r0 == 0) goto L_0x015e
            r0.setVisibility(r4)
        L_0x015e:
            com.whatsapp.contact.FacepileView r0 = r2.A09
        L_0x0160:
            if (r0 == 0) goto L_0x0165
            r0.setVisibility(r5)
        L_0x0165:
            android.view.ViewGroup r0 = r2.A02()
            r0.requestLayout()
        L_0x016c:
            return
        L_0x016d:
            boolean r0 = r14.isEmpty()
            if (r0 == 0) goto L_0x0189
            com.whatsapp.contact.FacepileView r0 = r2.A09
            if (r0 == 0) goto L_0x017a
            r0.setVisibility(r5)
        L_0x017a:
            android.widget.ImageView r0 = r2.A07
            if (r0 == 0) goto L_0x0181
            r0.setImageResource(r1)
        L_0x0181:
            android.widget.ImageView r0 = r2.A07
            if (r0 == 0) goto L_0x0165
            r0.setVisibility(r4)
            goto L_0x0165
        L_0x0189:
            com.whatsapp.contact.FacepileView r10 = r2.A09
            if (r10 == 0) goto L_0x0165
            int r1 = r14.size()
            r0 = 3
            if (r1 <= r0) goto L_0x0195
            r1 = 3
        L_0x0195:
            r10.setContactsSize(r1)
            int r0 = r10.A02
            java.util.List r0 = X.C29431cG.A0v(r14, r0)
            java.util.Iterator r9 = r0.iterator()
            r1 = 0
        L_0x01a3:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x01cc
            java.lang.Object r0 = r9.next()
            int r8 = r1 + 1
            if (r1 >= 0) goto L_0x01b6
            X.AnonymousClass1ZU.A0B()
            goto L_0x004e
        L_0x01b6:
            X.6hS r0 = (X.C129226hS) r0
            com.whatsapp.WaImageView r7 = r10.A04(r1)
            if (r7 == 0) goto L_0x01ca
            X.1pZ r6 = r3.A04
            com.whatsapp.jid.UserJid r1 = r0.A02
            X.1E7 r0 = new X.1E7
            r0.<init>(r1)
            r6.A07(r7, r0)
        L_0x01ca:
            r1 = r8
            goto L_0x01a3
        L_0x01cc:
            r10.setVisibility(r4)
            android.widget.ImageView r0 = r2.A07
            goto L_0x0160
        L_0x01d2:
            r9.A04(r5)
            goto L_0x0146
        L_0x01d7:
            android.view.ViewGroup r7 = r2.A08
            goto L_0x00e0
        L_0x01db:
            java.text.NumberFormat r6 = r9.A0L()
            int r0 = r14.size()
            long r0 = (long) r0
            java.lang.String r0 = r6.format(r0)
            goto L_0x00d7
        L_0x01ea:
            androidx.recyclerview.widget.RecyclerView r1 = r5.A09
            boolean r0 = X.AnonymousClass000.A1a(r14)
            if (r0 != 0) goto L_0x01f4
            r4 = 8
        L_0x01f4:
            r1.setVisibility(r4)
            goto L_0x0092
        L_0x01f9:
            r7.A00 = r14
            r7.notifyDataSetChanged()
            goto L_0x0070
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C121886Lw.A0H(java.lang.Object):void");
    }
}
