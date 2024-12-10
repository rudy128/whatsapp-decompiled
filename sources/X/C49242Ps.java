package X;

import android.database.Cursor;
import android.net.Uri;
import android.provider.ContactsContract;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2Ps  reason: invalid class name and case insensitive filesystem */
public class C49242Ps extends A34 {
    public final int A00;
    public final AnonymousClass1M9 A01;
    public final C24791Lr A02;
    public final WeakReference A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06 = true;
    public final C37551pj A07;

    public C49242Ps(C37551pj r2, AnonymousClass1M9 r3, C24791Lr r4, C37621pr r5, int i, boolean z, boolean z2) {
        this.A07 = r2;
        this.A00 = i;
        this.A04 = z;
        this.A05 = z2;
        this.A01 = r3;
        this.A03 = new WeakReference(r5);
        this.A02 = r4;
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        long j;
        String str;
        Cursor A032;
        AnonymousClass8CU r2 = this.A02;
        if (r2.isCancelled()) {
            return null;
        }
        ArrayList A13 = AnonymousClass000.A13();
        if (this.A06) {
            AnonymousClass1M9 r0 = this.A01;
            boolean z = this.A05;
            AnonymousClass11B A0O = r0.A08.A0O();
            if (A0O == null) {
                Log.w("contact-mgr-db/wadbhelper/get-contact-nux-suggest-list cr=null");
            } else {
                if (z) {
                    str = "times_contacted!=0";
                } else {
                    str = null;
                }
                try {
                    Uri uri = ContactsContract.CommonDataKinds.Phone.CONTENT_URI;
                    String[] A1Y = C17880vN.A1Y();
                    A1Y[0] = "raw_contact_id";
                    A032 = A0O.A03(uri, A1Y, str, (String[]) null, "times_contacted DESC LIMIT 100");
                    if (A032 != null) {
                        int columnIndexOrThrow = A032.getColumnIndexOrThrow("raw_contact_id");
                        HashSet A12 = C17880vN.A12();
                        while (A032.moveToNext()) {
                            Long A0M = C17890vO.A0M(A032, columnIndexOrThrow);
                            if (A12.add(A0M)) {
                                A13.add(A0M);
                            }
                        }
                        A032.close();
                    }
                } catch (Exception e) {
                    Log.e("contact-mgr-db/unable to query the phone book for frequent contacts sorted by TIMES_CONTACTED", e);
                } catch (Throwable th) {
                    AnonymousClass0DT.A00(th, th);
                }
            }
        }
        if (r2.isCancelled()) {
            return null;
        }
        ArrayList A132 = AnonymousClass000.A13();
        if (this.A05) {
            this.A01.A0o(A132);
        }
        if (r2.isCancelled()) {
            return null;
        }
        ArrayList A133 = AnonymousClass000.A13();
        this.A01.A0m(A133);
        Iterator it = A133.iterator();
        while (it.hasNext()) {
            if (C22971Dz.A0T(C17880vN.A0O(it).A0J)) {
                it.remove();
            }
        }
        A00(A133);
        if (r2.isCancelled()) {
            return null;
        }
        ArrayList A134 = AnonymousClass000.A13();
        int i = 0;
        if (A13.isEmpty() && A132.isEmpty()) {
            Iterator it2 = A133.iterator();
            while (it2.hasNext()) {
                AnonymousClass1E7 A0O2 = C17880vN.A0O(it2);
                if (i >= this.A00) {
                    break;
                } else if (!this.A04 || this.A02.A07(A0O2)) {
                    A134.add(A0O2);
                    i++;
                }
            }
        } else {
            C001100p r22 = new C001100p();
            Iterator it3 = A133.iterator();
            while (it3.hasNext()) {
                AnonymousClass1E7 A0O3 = C17880vN.A0O(it3);
                C59042lf r02 = A0O3.A0H;
                if (r02 == null) {
                    j = 0;
                } else {
                    j = r02.A00;
                }
                r22.A0A(j, A0O3);
            }
            HashSet A122 = C17880vN.A12();
            Iterator it4 = A13.iterator();
            while (it4.hasNext()) {
                Number number = (Number) it4.next();
                if (i >= this.A00) {
                    break;
                }
                AnonymousClass1E7 r1 = (AnonymousClass1E7) r22.A05(number.longValue());
                if (r1 != null && (!this.A04 || this.A02.A07(r1))) {
                    r1.A0m = true;
                    A134.add(r1);
                    A122.add(r1);
                    i++;
                }
            }
            Iterator it5 = A132.iterator();
            while (it5.hasNext()) {
                Number number2 = (Number) it5.next();
                if (i >= this.A00) {
                    break;
                }
                AnonymousClass1E7 r12 = (AnonymousClass1E7) r22.A05(number2.longValue());
                if (r12 != null && (!this.A04 || this.A02.A07(r12))) {
                    r12.A0l = true;
                    A134.add(r12);
                    A122.add(r12);
                    i++;
                }
            }
            Iterator it6 = A133.iterator();
            while (it6.hasNext()) {
                AnonymousClass1E7 A0O4 = C17880vN.A0O(it6);
                if (i >= this.A00) {
                    break;
                } else if ((!this.A04 || this.A02.A07(A0O4)) && A122.add(A0O4)) {
                    A134.add(A0O4);
                    i++;
                }
            }
        }
        Iterator it7 = A134.iterator();
        while (it7.hasNext()) {
            if (C22971Dz.A0T(C17880vN.A0O(it7).A0J)) {
                it7.remove();
            }
        }
        A00(A134);
        return new C19760yx(A134, A133);
        throw th;
    }

    /* JADX WARNING: Removed duplicated region for block: B:38:0x00f6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0H(java.lang.Object r16) {
        /*
            r15 = this;
            r3 = r16
            X.0yx r3 = (X.C19760yx) r3
            java.lang.ref.WeakReference r0 = r15.A03
            java.lang.Object r6 = r0.get()
            X.1pr r6 = (X.C37621pr) r6
            if (r6 == 0) goto L_0x01c4
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            r8 = 0
            r6.A00 = r8
            com.whatsapp.conversationslist.ConversationsFragment r0 = r6.A06
            android.view.View r1 = r0.A0B
            X.1FL r9 = r0.A1B()
            if (r1 == 0) goto L_0x01bf
            if (r9 == 0) goto L_0x01bf
            boolean r0 = r9.isFinishing()
            if (r0 != 0) goto L_0x01bf
            r0 = 2131429627(0x7f0b08fb, float:1.8480932E38)
            android.view.View r5 = r1.findViewById(r0)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            java.lang.Object r0 = r3.A00
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L_0x009a
            java.util.List r2 = X.C29431cG.A0q(r0)
        L_0x003a:
            java.lang.String r1 = "null cannot be cast to non-null type java.util.ArrayList<com.whatsapp.data.WAContact>{ kotlin.collections.TypeAliasesKt.ArrayList<com.whatsapp.data.WAContact> }"
            X.C18070vi.A0z(r2, r1)
            java.util.ArrayList r2 = (java.util.ArrayList) r2
            X.C18070vi.A0b(r5)
            java.lang.Object r0 = r3.A01
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L_0x004e
            java.util.List r8 = X.C29431cG.A0q(r0)
        L_0x004e:
            X.C18070vi.A0z(r8, r1)
            java.util.ArrayList r8 = (java.util.ArrayList) r8
            boolean r0 = r6 instanceof X.AnonymousClass2DK
            if (r0 == 0) goto L_0x0187
            r4 = r6
            X.2DK r4 = (X.AnonymousClass2DK) r4
            int r1 = r2.size()
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r7 = r1
            r3 = 0
            r13 = 0
        L_0x0066:
            if (r13 >= r1) goto L_0x009c
            java.lang.Object r14 = r2.get(r13)
            X.1E7 r14 = (X.AnonymousClass1E7) r14
            X.1Me r11 = r4.A00
            r0 = -1
            java.lang.String r0 = r11.A0T(r14, r0)
            java.lang.String r12 = android.text.Html.escapeHtml(r0)
            r10.add(r12)
            int[] r0 = X.AnonymousClass2DK.A05
            r0 = r0[r13]
            android.view.View r11 = r5.findViewById(r0)
            android.widget.ImageView r11 = (android.widget.ImageView) r11
            X.1pZ r0 = r4.A01
            r0.A07(r11, r14)
            if (r11 == 0) goto L_0x0097
            r11.setVisibility(r3)
            r0 = 0
            r11.setOnClickListener(r0)
            r11.setContentDescription(r12)
        L_0x0097:
            int r13 = r13 + 1
            goto L_0x0066
        L_0x009a:
            r2 = r8
            goto L_0x003a
        L_0x009c:
            int[] r2 = X.AnonymousClass2DK.A05
            r0 = 5
            if (r7 >= r0) goto L_0x00b1
            r0 = r2[r7]
            android.view.View r2 = r5.findViewById(r0)
            if (r2 == 0) goto L_0x00ae
            r0 = 8
            r2.setVisibility(r0)
        L_0x00ae:
            int r7 = r7 + 1
            goto L_0x009c
        L_0x00b1:
            r7 = 1
            int r11 = r8.size()
            r12 = 3
            int r0 = java.lang.Math.min(r1, r12)
            int r11 = r11 - r0
            r8 = 2
            if (r11 <= 0) goto L_0x0136
            if (r1 == 0) goto L_0x0176
            android.content.res.Resources r9 = r9.getResources()
            if (r1 == r7) goto L_0x0124
            if (r1 == r8) goto L_0x010c
            r2 = 2131755306(0x7f10012a, float:1.9141488E38)
            r0 = 4
            java.lang.Object[] r1 = new java.lang.Object[r0]
            java.lang.Object r0 = r10.get(r3)
            r1[r3] = r0
            java.lang.Object r0 = r10.get(r7)
            r1[r7] = r0
            java.lang.Object r0 = r10.get(r8)
            r1[r8] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r1[r12] = r0
        L_0x00e7:
            java.lang.String r1 = r9.getQuantityString(r2, r11, r1)
        L_0x00eb:
            r0 = 2131434210(0x7f0b1ae2, float:1.8490227E38)
            android.view.View r2 = r5.findViewById(r0)
            android.widget.TextView r2 = (android.widget.TextView) r2
            if (r2 == 0) goto L_0x01a3
            android.text.Spanned r0 = android.text.Html.fromHtml(r1)
            r2.setText(r0)
            r2.setVisibility(r3)
            r1 = 38
            X.48f r0 = new X.48f
            r0.<init>(r4, r1)
            r2.setOnClickListener(r0)
            goto L_0x01a3
        L_0x010c:
            r2 = 2131755307(0x7f10012b, float:1.914149E38)
            java.lang.Object[] r1 = new java.lang.Object[r12]
            java.lang.Object r0 = r10.get(r3)
            r1[r3] = r0
            java.lang.Object r0 = r10.get(r7)
            r1[r7] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r1[r8] = r0
            goto L_0x00e7
        L_0x0124:
            r2 = 2131755305(0x7f100129, float:1.9141486E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Object r0 = r10.get(r3)
            r1[r3] = r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r1[r7] = r0
            goto L_0x00e7
        L_0x0136:
            if (r1 == 0) goto L_0x0176
            if (r1 == r7) goto L_0x016a
            if (r1 == r8) goto L_0x0158
            r2 = 2131893142(0x7f121b96, float:1.9421052E38)
            java.lang.Object[] r1 = new java.lang.Object[r12]
            java.lang.Object r0 = r10.get(r3)
            r1[r3] = r0
            java.lang.Object r0 = r10.get(r7)
            r1[r7] = r0
            java.lang.Object r0 = r10.get(r8)
            r1[r8] = r0
        L_0x0153:
            java.lang.String r1 = r9.getString(r2, r1)
            goto L_0x00eb
        L_0x0158:
            r2 = 2131893143(0x7f121b97, float:1.9421054E38)
            java.lang.Object[] r1 = new java.lang.Object[r8]
            java.lang.Object r0 = r10.get(r3)
            r1[r3] = r0
            java.lang.Object r0 = r10.get(r7)
            r1[r7] = r0
            goto L_0x0153
        L_0x016a:
            r2 = 2131893134(0x7f121b8e, float:1.9421036E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.Object r0 = r10.get(r3)
            r1[r3] = r0
            goto L_0x0153
        L_0x0176:
            android.content.res.Resources r9 = r9.getResources()
            r2 = 2131755304(0x7f100128, float:1.9141483E38)
            java.lang.Object[] r1 = new java.lang.Object[r7]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r11)
            r1[r3] = r0
            goto L_0x00e7
        L_0x0187:
            r4 = r6
            X.1ps r4 = (X.C37631ps) r4
            r3 = 0
            r1 = 1
            X.C18070vi.A0d(r5, r1)
            r0 = 2
            X.C18070vi.A0d(r2, r0)
            r0 = 3
            X.C18070vi.A0d(r8, r0)
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L_0x01a7
            r4.A06(r1)
        L_0x01a0:
            r4.A03(r3)
        L_0x01a3:
            r0 = 1
            r6.A01 = r0
            return
        L_0x01a7:
            r4.A06(r3)
            int r0 = r8.size()
            r4.A05(r9, r2, r0)
            int r0 = r2.size()
            if (r0 <= r1) goto L_0x01a0
            int r0 = r8.size()
            r4.A04(r5, r9, r2, r0)
            goto L_0x01a3
        L_0x01bf:
            java.lang.String r0 = "conversations/updateNuxView: NUX view cannot be updated"
            com.whatsapp.util.Log.w((java.lang.String) r0)
        L_0x01c4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C49242Ps.A0H(java.lang.Object):void");
    }

    private void A00(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            UserJid userJid = (UserJid) AnonymousClass1E7.A01(C17880vN.A0O(it));
            if (userJid != null && this.A07.A0P(userJid)) {
                it.remove();
            }
        }
    }
}
