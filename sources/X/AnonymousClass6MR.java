package X;

import android.net.Uri;
import android.util.Pair;
import com.whatsapp.contact.picker.ContactPickerFragment;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;

/* renamed from: X.6MR  reason: invalid class name */
public final class AnonymousClass6MR extends A34 {
    public final Uri A00;
    public final C678831f A01;
    public final C87814Xd A02;
    public final AnonymousClass1OZ A03;
    public final AnonymousClass00H A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final WeakReference A0A;
    public final boolean A0B;

    public AnonymousClass6MR(Uri uri, ContactPickerFragment contactPickerFragment, C678831f r4, C87814Xd r5, AnonymousClass1OZ r6, AnonymousClass00H r7, String str, String str2, String str3, String str4, String str5, boolean z) {
        C108965cb.A1P(r6, 7, r7);
        C108975cc.A10(r4, 10, r5);
        this.A00 = uri;
        this.A0B = z;
        this.A07 = str;
        this.A08 = str2;
        this.A09 = str3;
        this.A03 = r6;
        this.A04 = r7;
        this.A05 = str4;
        this.A01 = r4;
        this.A06 = str5;
        this.A02 = r5;
        if (str == null && str2 == null) {
            throw AnonymousClass000.A0n("Either `phoneNumber` or `username` must be provided");
        }
        this.A0A = AnonymousClass3MW.A0z(contactPickerFragment);
    }

    public /* bridge */ /* synthetic */ Object A0G(Object[] objArr) {
        Object obj;
        AnonymousClass1D6 A012;
        UserJid userJid;
        C446324e A022;
        Object obj2 = null;
        try {
            this.A03.A0E(32000);
            String str = this.A07;
            if (str != null) {
                Pair A032 = this.A01.A03(AnonymousClass2R1.A0F, (Integer) null, str);
                obj = A032.first;
                obj2 = A032.second;
            } else {
                String str2 = this.A08;
                if (str2 != null) {
                    C19760yx A052 = this.A01.A05(str2, this.A09);
                    if (A052 != null) {
                        A012 = AnonymousClass1D6.A01(C62602rf.A06, A052.A00);
                        C62602rf r4 = (C62602rf) A012.first;
                        C188829i3 r3 = (C188829i3) A012.second;
                        C18070vi.A0b(r4);
                        boolean z = false;
                        if (!(r3 == null || (userJid = r3.A0D) == null || !C42701yb.A01(userJid) || (A022 = ((AnonymousClass1PW) this.A04.get()).A02(userJid)) == null)) {
                            z = A022.A0I;
                        }
                        return new C128366fs(r4, r3, z);
                    }
                    obj = C62602rf.A03;
                }
                return null;
            }
            A012 = AnonymousClass1D6.A01(obj, obj2);
            C62602rf r42 = (C62602rf) A012.first;
            C188829i3 r32 = (C188829i3) A012.second;
            C18070vi.A0b(r42);
            boolean z2 = false;
            z2 = A022.A0I;
            return new C128366fs(r42, r32, z2);
        } catch (C36811oV unused) {
            Log.e("LookupNumberTask/doInBackground/MessageHandlerDisconnectedException");
        }
    }

    public void A0E() {
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A0A.get();
        if (contactPickerFragment != null && contactPickerFragment.A1b()) {
            Log.i("contactpicker/existencecheck/canceled");
            contactPickerFragment.A0t = null;
            contactPickerFragment.A0r.CEx();
        }
    }

    public void A0F() {
        ContactPickerFragment contactPickerFragment = (ContactPickerFragment) this.A0A.get();
        if (contactPickerFragment != null && contactPickerFragment.A1b()) {
            Log.i("contactpicker/existencecheck/started");
            contactPickerFragment.A0r.CNB(0, 2131895533);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x012d, code lost:
        if (r3.getQueryParameter("src") != null) goto L_0x012f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ void A0H(java.lang.Object r23) {
        /*
            r22 = this;
            r4 = r23
            X.6fs r4 = (X.C128366fs) r4
            r3 = r22
            java.lang.ref.WeakReference r0 = r3.A0A
            java.lang.Object r0 = r0.get()
            com.whatsapp.contact.picker.ContactPickerFragment r0 = (com.whatsapp.contact.picker.ContactPickerFragment) r0
            if (r0 == 0) goto L_0x004b
            boolean r2 = r0.A1b()
            r1 = 1
            if (r2 != r1) goto L_0x004b
            java.lang.String r5 = r3.A07
            if (r5 != 0) goto L_0x0021
            java.lang.String r5 = r3.A08
            if (r5 != 0) goto L_0x0021
            java.lang.String r5 = ""
        L_0x0021:
            boolean r10 = r3.A0B
            X.4Xd r9 = r3.A02
            java.lang.String r8 = r3.A06
            java.lang.String r7 = r3.A05
            android.net.Uri r3 = r3.A00
            r12 = 0
            r0.A0t = r12
            r13 = 0
            if (r4 != 0) goto L_0x004c
            java.lang.StringBuilder r3 = X.AnonymousClass000.A10()
            java.lang.String r2 = "handledeeplink/message-handler/disconnected/"
            X.C17900vP.A0g(r2, r5, r3)
            X.7Bn r6 = r0.A0r
            r4 = 2131889438(0x7f120d1e, float:1.941354E38)
            java.lang.Object[] r3 = new java.lang.Object[r1]
            r3[r13] = r5
        L_0x0043:
            r6.BhU(r3, r13, r4)
        L_0x0046:
            X.7Bn r0 = r0.A0r
            r0.CEx()
        L_0x004b:
            return
        L_0x004c:
            X.2rf r6 = r4.A00
            boolean r2 = r6.A01()
            if (r2 == 0) goto L_0x0292
            X.9i3 r2 = r4.A01
            boolean r6 = X.AnonymousClass000.A1W(r2)
            java.lang.String r5 = "deeplink: user is null"
            X.C17960vV.A0F(r6, r5)
            boolean r5 = android.text.TextUtils.isEmpty(r8)
            if (r5 != 0) goto L_0x019f
            r0.A2x = r8
            r0.A2w = r7
        L_0x0069:
            java.lang.String r5 = "messenger"
            boolean r6 = r5.equals(r7)
            java.lang.String r5 = "source"
            if (r6 == 0) goto L_0x007b
            android.os.Bundle r8 = r0.A27()
            r7 = 6
            r8.putInt(r5, r7)
        L_0x007b:
            int r7 = r2.A04
            if (r7 != r1) goto L_0x0207
            r0.A1D = r9
            X.00H r6 = r0.A2M
            java.lang.Object r7 = r6.get()
            X.6oQ r7 = (X.C133256oQ) r7
            X.4Xd r6 = r0.A1D
            r7.A00(r6)
            X.0ve r7 = r0.A1U
            r6 = 7926(0x1ef6, float:1.1107E-41)
            X.0vf r9 = X.C18040vf.A02
            boolean r6 = X.C18020vd.A05(r9, r7, r6)
            if (r6 == 0) goto L_0x019c
            java.lang.Long r14 = X.C29551cT.A00(r3)
        L_0x009e:
            X.0ve r6 = r0.A1U
            r8 = 9568(0x2560, float:1.3408E-41)
            boolean r6 = X.C18020vd.A05(r9, r6, r8)
            if (r6 == 0) goto L_0x00e0
            android.os.Bundle r7 = r0.A27()
            java.lang.String r6 = "entry_point_conversion_external_source"
            java.lang.String r18 = r7.getString(r6)
            java.lang.String r6 = "entry_point_conversion_external_medium"
            java.lang.String r19 = r7.getString(r6)
            X.00H r6 = r0.A2R
            java.lang.Object r7 = r6.get()
            X.A4F r7 = (X.A4F) r7
            com.whatsapp.jid.UserJid r11 = r2.A0D
            X.9ed r6 = r2.A09
            boolean r21 = X.AnonymousClass000.A1W(r6)
            X.0ve r6 = r7.A01
            boolean r6 = X.C18020vd.A05(r9, r6, r8)
            if (r6 == 0) goto L_0x00e0
            X.10I r6 = r7.A03
            X.Aj5 r15 = new X.Aj5
            r20 = r13
            r17 = r7
            r16 = r11
            r15.<init>(r16, r17, r18, r19, r20, r21)
            r6.CGF(r15)
        L_0x00e0:
            X.4Rg r11 = r0.A1R
            com.whatsapp.jid.UserJid r7 = r2.A0D
            if (r7 == 0) goto L_0x00f0
            X.1M9 r6 = r0.A0f
            boolean r6 = r6.A0z(r7)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r6)
        L_0x00f0:
            java.lang.String r15 = r0.A2v
            android.os.Bundle r6 = r0.A27()
            int r17 = r6.getInt(r5, r1)
            X.1PM r7 = r0.A0j
            com.whatsapp.jid.UserJid r6 = r2.A0D
            X.1yf r6 = r7.A02(r6)
            java.lang.Integer r13 = X.C1408473h.A02(r6)
            r7 = 2
            r16 = r7
            r11.A00(r12, r13, r14, r15, r16, r17)
            com.whatsapp.jid.UserJid r9 = r2.A0D
            android.os.Bundle r6 = r0.A27()
            int r5 = r6.getInt(r5)
            if (r1 != r5) goto L_0x0141
            java.lang.String r13 = "type"
            java.lang.String r5 = r3.getQueryParameter(r13)
            java.lang.String r8 = "custom_url"
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x012f
            java.lang.String r5 = "src"
            java.lang.String r6 = r3.getQueryParameter(r5)
            r5 = 1
            if (r6 == 0) goto L_0x0130
        L_0x012f:
            r5 = 0
        L_0x0130:
            r12 = 5
            r11 = 4
            if (r5 == 0) goto L_0x0176
            X.9oj r8 = r0.A1Q
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
            r8.A00(r9, r6, r5)
        L_0x0141:
            com.whatsapp.jid.UserJid r5 = r2.A0D
            X.1E7 r6 = new X.1E7
            r6.<init>(r5)
            X.10I r8 = r0.A1y
            X.7Pi r5 = new X.7Pi
            r5.<init>(r0, r2, r7)
            r8.CGF(r5)
            com.whatsapp.jid.UserJid r5 = r2.A0D
            boolean r5 = X.C42701yb.A01(r5)
            if (r5 == 0) goto L_0x01a5
            com.whatsapp.contact.picker.viewmodels.ContactPickerViewModel r6 = r0.A0x
            com.whatsapp.jid.UserJid r5 = r2.A0D
            boolean r2 = r4.A02
            X.C18070vi.A0h(r5, r3)
            X.1OX r1 = X.C41561wd.A00(r6)
            r11 = 0
            com.whatsapp.contact.picker.viewmodels.ContactPickerViewModel$validateBot$1 r0 = new com.whatsapp.contact.picker.viewmodels.ContactPickerViewModel$validateBot$1
            r7 = r0
            r8 = r3
            r9 = r6
            r10 = r5
            r12 = r2
            r7.<init>(r8, r9, r10, r11, r12)
            X.AnonymousClass3MX.A1Q(r0, r1)
            return
        L_0x0176:
            java.lang.String r5 = r3.getQueryParameter(r13)
            boolean r5 = r8.equals(r5)
            if (r5 == 0) goto L_0x0141
            java.lang.String r5 = "src"
            java.lang.String r6 = r3.getQueryParameter(r5)
            java.lang.String r5 = "qr"
            boolean r5 = r5.equals(r6)
            if (r5 == 0) goto L_0x0141
            X.9oj r8 = r0.A1Q
            java.lang.Integer r6 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r12)
            r8.A01(r9, r6, r5)
            goto L_0x0141
        L_0x019c:
            r14 = r12
            goto L_0x009e
        L_0x019f:
            r0.A2x = r12
            r0.A2w = r12
            goto L_0x0069
        L_0x01a5:
            if (r10 != 0) goto L_0x0202
            com.whatsapp.jid.UserJid r3 = r2.A0D
            if (r3 == 0) goto L_0x01bb
            java.lang.String r3 = r0.A2u
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x01bb
            java.lang.String r3 = r0.A31
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0202
        L_0x01bb:
            android.content.Context r3 = r0.A1n()
            r5 = 0
            android.content.Intent r4 = X.AnonymousClass1LU.A0C(r3, r5)
            com.whatsapp.jid.UserJid r2 = r2.A0D
            java.lang.String r3 = r2.getRawString()
            java.lang.String r2 = "jid"
            r4.putExtra(r2, r3)
            java.lang.String r2 = "skip_preview"
            r4.putExtra(r2, r5)
            java.lang.String r2 = "number_from_url"
            r4.putExtra(r2, r1)
            java.lang.String r2 = "text_from_url"
            r4.putExtra(r2, r5)
            java.lang.String r3 = "extra_deep_link_session_id"
            java.lang.String r2 = r0.A2v
            r4.putExtra(r3, r2)
            com.whatsapp.contact.picker.ContactPickerFragment.A0E(r4, r0)
            com.whatsapp.contact.picker.ContactPickerFragment.A0D(r4, r0)
            r2 = 335544320(0x14000000, float:6.4623485E-27)
            r4.addFlags(r2)
            X.11P r3 = r0.A16
            java.lang.String r2 = X.C108955ca.A0x(r0)
            X.C60442o2.A00(r4, r3, r2)
            X.7Bn r2 = r0.A0r
            X.8dR r2 = r2.A00
            r2.A3q(r4, r1)
            goto L_0x0046
        L_0x0202:
            com.whatsapp.contact.picker.ContactPickerFragment.A0h(r0, r6)
            goto L_0x0046
        L_0x0207:
            r3 = 2
            if (r7 != r3) goto L_0x026c
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r3 = "handledeeplink/existencesync/user/not-wa/"
            r4.append(r3)
            com.whatsapp.jid.UserJid r3 = r2.A0D
            r4.append(r3)
            X.C17890vO.A0w(r4)
            com.whatsapp.jid.UserJid r2 = r2.A0D
            X.C17960vV.A07(r2)
            java.lang.String r7 = r2.user
            X.0ve r3 = r0.A1U
            r2 = 4691(0x1253, float:6.573E-42)
            X.0vf r4 = X.C18040vf.A02
            boolean r2 = X.C18020vd.A05(r4, r3, r2)
            java.lang.String r5 = ""
            if (r2 == 0) goto L_0x025a
            X.0ve r3 = r0.A1U
            r2 = 12620(0x314c, float:1.7684E-41)
            int r2 = X.C18020vd.A00(r4, r3, r2)
            if (r2 != r1) goto L_0x0258
            java.lang.String r2 = X.AnonymousClass17K.A06(r7)
        L_0x023e:
            X.7Bn r10 = r0.A0r
            r14 = 2131889443(0x7f120d23, float:1.941355E38)
            r15 = 2131888815(0x7f120aaf, float:1.9412276E38)
            X.7Bl r11 = new X.7Bl
            r11.<init>(r0, r2, r6)
            java.lang.Object[] r12 = new java.lang.Object[r1]
            java.lang.String r1 = X.A9B.A0H(r5, r7)
            r12[r13] = r1
            r10.BhT(r11, r12, r13, r14, r15)
            goto L_0x0046
        L_0x0258:
            r2 = r7
            goto L_0x023e
        L_0x025a:
            X.7Bn r4 = r0.A0r
            r3 = 2131889443(0x7f120d23, float:1.941355E38)
            java.lang.Object[] r2 = new java.lang.Object[r1]
            java.lang.String r1 = X.A9B.A0H(r5, r7)
            r2[r13] = r1
            r4.BhU(r2, r13, r3)
            goto L_0x0046
        L_0x026c:
            r3 = 3
            if (r7 != r3) goto L_0x0046
            java.lang.StringBuilder r4 = X.AnonymousClass000.A10()
            java.lang.String r3 = "handledeeplink/existencesync/user/invalid/"
            r4.append(r3)
            java.util.List r3 = r2.A0K
            java.lang.String r3 = X.C17880vN.A0w(r3, r13)
            X.C17890vO.A19(r4, r3)
            X.7Bn r6 = r0.A0r
            r4 = 2131889439(0x7f120d1f, float:1.9413542E38)
            java.lang.Object[] r3 = new java.lang.Object[r1]
            java.util.List r1 = r2.A0K
            java.lang.Object r1 = r1.get(r13)
            r3[r13] = r1
            goto L_0x0043
        L_0x0292:
            int r3 = r6.A00
            if (r3 != 0) goto L_0x02a7
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "handledeeplink/existencesync/network-unavailable/"
            X.C17900vP.A0g(r1, r5, r2)
            r1 = 2131889437(0x7f120d1d, float:1.9413538E38)
        L_0x02a2:
            com.whatsapp.contact.picker.ContactPickerFragment.A0f(r0, r1)
            goto L_0x0046
        L_0x02a7:
            r2 = 4
            if (r3 != r2) goto L_0x02b7
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "handledeeplink/existencesync/failed/try-again-later/"
            X.C17900vP.A0g(r1, r5, r2)
            r1 = 2131889438(0x7f120d1e, float:1.941354E38)
            goto L_0x02a2
        L_0x02b7:
            if (r3 != r1) goto L_0x02c4
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "handledeeplink/existencesync/exisitng request ongoing/"
        L_0x02bf:
            X.C17900vP.A0g(r1, r5, r2)
            goto L_0x0046
        L_0x02c4:
            r1 = 6
            if (r3 != r1) goto L_0x0046
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "handledeeplink/existencesync/exception-occurred/"
            goto L_0x02bf
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6MR.A0H(java.lang.Object):void");
    }
}
