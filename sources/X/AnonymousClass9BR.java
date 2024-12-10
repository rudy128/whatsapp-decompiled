package X;

import android.app.Activity;
import android.text.Html;
import android.widget.TextSwitcher;
import com.whatsapp.payments.ui.IndiaUpiCheckOrderDetailsActivity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.9BR  reason: invalid class name */
public class AnonymousClass9BR extends A34 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public AnonymousClass9BR(Object obj, Object obj2, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [java.lang.Object, X.9Ml] */
    /* JADX WARNING: type inference failed for: r5v2, types: [java.lang.Object, X.9Ml] */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x01fa, code lost:
        continue;
     */
    /* JADX WARNING: Removed duplicated region for block: B:126:0x0272  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x0282  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x02dd  */
    /* JADX WARNING: Removed duplicated region for block: B:155:0x0321  */
    /* JADX WARNING: Removed duplicated region for block: B:270:0x029b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:277:0x0267 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0267 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x01fa A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:286:0x01fa A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:300:0x01fa A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* bridge */ /* synthetic */ java.lang.Object A0G(java.lang.Object[] r20) {
        /*
            r19 = this;
            r2 = r19
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x04b1;
                case 1: goto L_0x00dc;
                case 2: goto L_0x04a0;
                case 3: goto L_0x0478;
                case 4: goto L_0x0071;
                case 5: goto L_0x0012;
                case 6: goto L_0x03f4;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r2.A01
            X.91U r0 = (X.AnonymousClass91U) r0
            X.1QS r0 = r0.A0Q
            java.util.ArrayList r0 = X.AnonymousClass8BU.A0t(r0)
        L_0x0011:
            return r0
        L_0x0012:
            java.lang.Object r0 = r2.A02
            X.1ca r0 = (X.C29621ca) r0
            X.1ca r1 = X.AnonymousClass8BR.A0j(r0)
            java.lang.Object r0 = r2.A01
            X.8zY r0 = (X.C175958zY) r0
            java.lang.Object r8 = r0.A01
            com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity r8 = (com.whatsapp.payments.ui.IndiaUpiBankAccountDetailsActivity) r8
            X.1QS r0 = r8.A0A
            java.util.ArrayList r7 = X.AnonymousClass8BU.A0t(r0)
            X.AEs r0 = r8.A04
            java.lang.String r0 = r0.A0A
            X.AEs r0 = X.AnonymousClass1KH.A01(r0, r7)
            if (r1 == 0) goto L_0x0011
            X.1ca[] r6 = r1.A02
            if (r6 == 0) goto L_0x0011
            int r5 = r6.length
            r4 = 0
        L_0x0038:
            if (r4 >= r5) goto L_0x0011
            r9 = r6[r4]
            if (r9 == 0) goto L_0x006e
            java.lang.String r2 = "upi"
            java.lang.String r1 = r9.A00
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x006e
            X.8pS r3 = new X.8pS
            r3.<init>()
            X.1KI r2 = r8.A01
            r1 = 3
            r3.A05(r2, r9, r1)
            if (r0 == 0) goto L_0x006e
            X.77e r1 = r3.A02
            if (r1 == 0) goto L_0x0065
            java.lang.Object r1 = r1.A00
            if (r1 == 0) goto L_0x0065
            X.C17960vV.A07(r1)
            java.lang.String r1 = (java.lang.String) r1
            r0.A0B(r1)
        L_0x0065:
            X.1QS r1 = r8.A0A
            X.1KH r1 = X.AnonymousClass8BR.A0R(r1)
            r1.A0M(r7)
        L_0x006e:
            int r4 = r4 + 1
            goto L_0x0038
        L_0x0071:
            java.util.ArrayList r0 = X.AnonymousClass000.A13()
            java.lang.Object r1 = r2.A02
            X.1ca r1 = (X.C29621ca) r1
            X.1ca r1 = X.AnonymousClass8BR.A0j(r1)
            if (r1 == 0) goto L_0x0011
            X.1ca[] r8 = r1.A02
            if (r8 == 0) goto L_0x0011
            java.util.HashSet r7 = X.C17880vN.A12()
            java.lang.Object r1 = r2.A01
            X.8zY r1 = (X.C175958zY) r1
            java.lang.Object r6 = r1.A01
            X.A0S r6 = (X.A0S) r6
            X.1QS r1 = r6.A0D
            java.util.ArrayList r1 = X.AnonymousClass8BU.A0t(r1)
            java.util.Iterator r2 = r1.iterator()
        L_0x0099:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x00a9
            X.AEs r1 = X.AnonymousClass8BR.A0P(r2)
            java.lang.String r1 = r1.A0A
            r7.add(r1)
            goto L_0x0099
        L_0x00a9:
            int r5 = r8.length
            r4 = 0
        L_0x00ab:
            if (r4 >= r5) goto L_0x0011
            r9 = r8[r4]
            if (r9 == 0) goto L_0x00d9
            java.lang.String r2 = "upi"
            java.lang.String r1 = r9.A00
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x00d9
            X.8pS r3 = new X.8pS
            r3.<init>()
            X.1KI r2 = r6.A07
            r1 = 3
            r3.A05(r2, r9, r1)
            java.lang.String r1 = r3.A06
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00d6
            java.lang.String r1 = r3.A06
            boolean r1 = r7.contains(r1)
            r3.A0I = r1
        L_0x00d6:
            r0.add(r3)
        L_0x00d9:
            int r4 = r4 + 1
            goto L_0x00ab
        L_0x00dc:
            java.lang.Object r1 = r2.A01
            X.1oI r1 = (X.C36681oI) r1
            X.9tr r0 = r1.A00
            if (r0 != 0) goto L_0x0198
            X.00H r2 = r1.A0I
            java.lang.Object r0 = r2.get()
            X.11Z r0 = (X.AnonymousClass11Z) r0
            long r12 = r0.A03()
            long r14 = X.C108975cc.A07(r2)
            X.00H r0 = r1.A0H
            java.lang.Object r0 = r0.get()
            X.1HV r0 = (X.AnonymousClass1HV) r0
            X.18O r2 = r0.A00
            X.18Q r0 = X.AnonymousClass18O.A0r
            int r11 = r2.A04(r0)
            X.0zA r2 = r1.A04
            boolean r0 = r2.A07()
            if (r0 == 0) goto L_0x0116
            r2.A03()
            java.lang.String r0 = "isPremiumSubscriptionActive"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0116:
            X.0zA r2 = r1.A02
            boolean r0 = r2.A07()
            if (r0 == 0) goto L_0x0128
            r2.A03()
            java.lang.String r0 = "isEligibleForMetaVerified"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0128:
            r10 = 0
            r6 = 0
            X.9Ml r5 = new X.9Ml
            r5.<init>()
            X.1oE r4 = r1.A07
            X.0ve r3 = r4.A00
            r2 = 3712(0xe80, float:5.202E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r2)
            if (r0 == 0) goto L_0x0141
            X.Ai4 r6 = r4.A01()
        L_0x0141:
            X.1oD r2 = r1.A0A
            boolean r0 = r2.A06()
            if (r0 == 0) goto L_0x017b
            X.Ai4 r7 = r2.A01()
        L_0x014d:
            X.1oF r2 = r1.A08
            boolean r0 = r2.A06()
            if (r0 == 0) goto L_0x0179
            X.Ai4 r8 = r2.A01()
        L_0x0159:
            X.1oG r2 = r1.A09
            boolean r0 = r2.A06()
            if (r0 == 0) goto L_0x0177
            X.Ai4 r9 = r2.A01()
        L_0x0165:
            X.0zA r2 = r1.A01
            boolean r0 = r2.A07()
            if (r0 == 0) goto L_0x017d
            r2.A03()
            java.lang.String r0 = "isProfileEditBannerEnabled"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0177:
            r9 = r10
            goto L_0x0165
        L_0x0179:
            r8 = r10
            goto L_0x0159
        L_0x017b:
            r7 = r10
            goto L_0x014d
        L_0x017d:
            X.1oH r2 = r1.A06
            boolean r0 = r2.A06()
            if (r0 == 0) goto L_0x0189
            X.Ai4 r10 = r2.A01()
        L_0x0189:
            X.00H r0 = r1.A0F
            X.1NP r0 = X.AnonymousClass8BS.A0A(r0)
            r0.A07()
            X.9tr r0 = new X.9tr
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r14)
        L_0x0198:
            X.00H r10 = r1.A0G
            java.lang.Object r9 = r10.get()
            X.9i1 r9 = (X.C188809i1) r9
            r8 = 1
            X.11S r7 = r9.A01
            boolean r1 = r7.A0N()
            if (r1 != 0) goto L_0x01cb
            X.1iq r1 = r9.A03
            X.2Lt r1 = r1.A08()
            if (r1 == 0) goto L_0x01cb
        L_0x01b1:
            r0.A03 = r8
            java.lang.Object r1 = r10.get()
            X.9i1 r1 = (X.C188809i1) r1
            X.0zA r2 = r1.A00
            boolean r1 = r2.A07()
            if (r1 == 0) goto L_0x0011
            r2.A03()
            java.lang.String r0 = "getSmbBannerType"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x01cb:
            X.0zA r2 = r9.A00
            boolean r1 = r2.A07()
            if (r1 == 0) goto L_0x01dd
            r2.A03()
            java.lang.String r0 = "getSmbBannerType"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x01dd:
            int[] r6 = r9.A0I
            int r5 = r6.length
            r4 = 0
            r3 = 0
        L_0x01e2:
            if (r3 >= r5) goto L_0x01fd
            r2 = r6[r3]
            boolean r1 = r7.A0N()
            if (r1 == 0) goto L_0x01ff
            if (r2 == r8) goto L_0x01ff
            r1 = 44
            if (r2 == r1) goto L_0x026e
            r1 = 48
            if (r2 == r1) goto L_0x027e
            int r2 = 11 - r2
            if (r2 == 0) goto L_0x0287
        L_0x01fa:
            int r3 = r3 + 1
            goto L_0x01e2
        L_0x01fd:
            r12 = 0
            goto L_0x0267
        L_0x01ff:
            r12 = 1
            if (r2 == r8) goto L_0x038d
            r12 = 20
            if (r2 == r12) goto L_0x0380
            r12 = 27
            if (r2 == r12) goto L_0x0373
            r1 = 33
            if (r2 == r1) goto L_0x03e8
            r12 = 40
            if (r2 != r12) goto L_0x026e
            X.00H r14 = r9.A05
            int r2 = X.AnonymousClass8BV.A02(r14)
            if (r2 == 0) goto L_0x01fa
            r1 = 4
            if (r2 == r1) goto L_0x01fa
            X.0z4 r2 = r9.A02
            java.lang.String r1 = r2.A0f()
            long r17 = r2.A0U(r1)
            r15 = 0
            int r1 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r1 == 0) goto L_0x01fa
            X.1NP r1 = X.AnonymousClass8BS.A0A(r14)
            android.content.SharedPreferences r2 = r1.A07()
            java.lang.String r1 = "backup_current_banner_type"
            int r11 = r2.getInt(r1, r4)
            if (r11 == 0) goto L_0x01fa
            X.1NP r1 = X.AnonymousClass8BS.A0A(r14)
            android.content.SharedPreferences r2 = r1.A07()
            java.lang.String r1 = "backup_current_banner_shown"
            boolean r1 = r2.getBoolean(r1, r4)
            if (r1 == 0) goto L_0x0267
            X.1NP r13 = X.AnonymousClass8BS.A0A(r14)
            r14.get()
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r1 = "backup_storage_banner_shown_timestamp:"
            java.lang.String r11 = X.AnonymousClass001.A1I(r1, r2, r11)
            r1 = 259200000(0xf731400, double:1.280618154E-315)
            boolean r1 = r13.A0R(r11, r1)
        L_0x0265:
            if (r1 != 0) goto L_0x01fa
        L_0x0267:
            r0.A00 = r12
            if (r12 != 0) goto L_0x01b1
            r8 = 0
            goto L_0x01b1
        L_0x026e:
            r12 = 44
            if (r2 == r12) goto L_0x0321
            r12 = 36
            if (r2 == r12) goto L_0x02f5
            r12 = 37
            if (r2 == r12) goto L_0x03d4
            r1 = 47
            if (r2 == r1) goto L_0x01fa
        L_0x027e:
            r12 = 48
            if (r2 == r12) goto L_0x02dd
            switch(r2) {
                case 11: goto L_0x0287;
                case 12: goto L_0x02c1;
                case 13: goto L_0x029e;
                case 14: goto L_0x02cc;
                default: goto L_0x0285;
            }
        L_0x0285:
            goto L_0x01fa
        L_0x0287:
            long r13 = r0.A06
            long r15 = r0.A05
            X.0z4 r11 = r9.A02
            X.00H r1 = r9.A04
            java.lang.Object r12 = r1.get()
            X.0ve r12 = (X.C18030ve) r12
            boolean r1 = X.C31141f5.A06(r11, r12, r13, r15)
            if (r1 == 0) goto L_0x01fa
            r12 = 11
            goto L_0x0267
        L_0x029e:
            X.0vl r1 = r9.A0F
            java.lang.Object r11 = r1.getValue()
            X.2qY r11 = (X.C61952qY) r11
            X.00H r1 = r9.A0C
            java.lang.Object r2 = r1.get()
            X.18O r2 = (X.AnonymousClass18O) r2
            X.00H r1 = r9.A0E
            java.lang.Object r1 = r1.get()
            X.118 r1 = (X.AnonymousClass118) r1
            android.content.Context r1 = r1.A00
            boolean r1 = r11.A01(r1, r2)
            if (r1 == 0) goto L_0x01fa
            r12 = 13
            goto L_0x0267
        L_0x02c1:
            X.1iq r1 = r9.A03
            X.2Lt r1 = r1.A08()
            if (r1 == 0) goto L_0x01fa
            r12 = 12
            goto L_0x0267
        L_0x02cc:
            X.00H r1 = r9.A0B
            java.lang.Object r1 = r1.get()
            X.9uG r1 = (X.C195979uG) r1
            boolean r1 = r1.A03()
            if (r1 == 0) goto L_0x01fa
            r12 = 14
            goto L_0x0267
        L_0x02dd:
            X.0z4 r1 = r9.A02
            java.lang.String r1 = r1.A0c()
            if (r1 == 0) goto L_0x01fa
            X.00H r1 = r9.A04
            X.0vd r11 = X.C17880vN.A0P(r1)
            r2 = 9876(0x2694, float:1.3839E-41)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r11, r2)
            goto L_0x03e4
        L_0x02f5:
            X.00H r1 = r9.A04
            X.0vd r11 = X.C17880vN.A0P(r1)
            r2 = 3283(0xcd3, float:4.6E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r11, r2)
            if (r1 == 0) goto L_0x01fa
            X.0z4 r1 = r9.A02
            X.00H r11 = r1.A00
            android.content.SharedPreferences r2 = X.C17880vN.A0B(r11)
            java.lang.String r1 = "smb_enforcement_bottomsheet_shown"
            boolean r1 = r2.getBoolean(r1, r4)
            if (r1 == 0) goto L_0x01fa
            android.content.SharedPreferences r2 = X.C17880vN.A0B(r11)
            java.lang.String r1 = "should_show_smb_enforcement_banner"
            boolean r1 = r2.getBoolean(r1, r4)
            goto L_0x03e4
        L_0x0321:
            boolean r1 = r7.A0N()
            if (r1 == 0) goto L_0x01fa
            X.00H r1 = r9.A04
            X.0vd r11 = X.C17880vN.A0P(r1)
            r2 = 5735(0x1667, float:8.036E-42)
            X.0vf r1 = X.C18040vf.A02
            boolean r1 = X.C18020vd.A05(r1, r11, r2)
            if (r1 == 0) goto L_0x01fa
            X.0z4 r11 = r9.A02
            boolean r1 = r11.A2P()
            if (r1 == 0) goto L_0x0353
            X.00H r1 = r9.A07
            java.lang.Object r1 = r1.get()
            X.11Q r1 = (X.AnonymousClass11Q) r1
            android.content.SharedPreferences r2 = X.AnonymousClass11Q.A01(r1)
            java.lang.String r1 = "username_is_set_triggered"
            boolean r1 = r2.getBoolean(r1, r4)
            if (r1 == 0) goto L_0x0267
        L_0x0353:
            android.content.SharedPreferences r2 = X.C17890vO.A0B(r11)
            java.lang.String r1 = "username_chats_ever_existed"
            boolean r1 = r2.getBoolean(r1, r4)
            if (r1 == 0) goto L_0x01fa
            X.00H r1 = r9.A07
            java.lang.Object r1 = r1.get()
            X.11Q r1 = (X.AnonymousClass11Q) r1
            android.content.SharedPreferences r2 = X.AnonymousClass11Q.A01(r1)
            java.lang.String r1 = "username_chats_exist_triggered"
            boolean r1 = r2.getBoolean(r1, r4)
            goto L_0x0265
        L_0x0373:
            X.0vl r1 = r9.A0H
            java.lang.Object r1 = r1.getValue()
            X.6pe r1 = (X.C133876pe) r1
            boolean r1 = r1.A01()
            goto L_0x03e4
        L_0x0380:
            X.00H r1 = r9.A0A
            java.lang.Object r1 = r1.get()
            X.9uG r1 = (X.C195979uG) r1
            boolean r1 = r1.A03()
            goto L_0x03e4
        L_0x038d:
            X.0z4 r2 = r9.A02
            X.00H r13 = r2.A00
            android.content.SharedPreferences r11 = X.C17880vN.A0B(r13)
            java.lang.String r1 = "create_group_tip_count"
            int r11 = r11.getInt(r1, r4)
            android.content.SharedPreferences r13 = X.C17880vN.A0B(r13)
            java.lang.String r1 = "create_group_tip_time"
            long r15 = X.C17890vO.A05(r13, r1)
            X.00H r1 = r9.A08
            java.lang.Object r1 = r1.get()
            X.1Nd r1 = (X.C25161Nd) r1
            boolean r1 = X.C20442ALf.A02(r1, r2)
            if (r1 == 0) goto L_0x01fa
            int r1 = X.C20442ALf.A0B
            if (r11 >= r1) goto L_0x01fa
            r13 = 2592000000(0x9a7ec800, double:1.280618154E-314)
            long r15 = r15 + r13
            X.00H r1 = r9.A0D
            java.lang.Object r1 = r1.get()
            X.11P r1 = (X.AnonymousClass11P) r1
            long r13 = X.AnonymousClass11P.A01(r1)
            int r1 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r1 >= 0) goto L_0x01fa
            X.9iI r1 = X.C22654BId.A1f
            boolean r1 = r1.A00(r2)
            goto L_0x03e4
        L_0x03d4:
            X.5YR r2 = r0.A01
            if (r2 == 0) goto L_0x01fa
            X.00H r1 = r9.A06
            java.lang.Object r1 = r1.get()
            X.1oE r1 = (X.C36641oE) r1
            boolean r1 = r1.A06(r2)
        L_0x03e4:
            if (r1 == 0) goto L_0x01fa
            goto L_0x0267
        L_0x03e8:
            X.0vl r1 = r9.A0G
            r1.getValue()
            X.00H r1 = r9.A04
            r1.get()
            goto L_0x01fa
        L_0x03f4:
            java.lang.Object r0 = r2.A01
            X.91U r0 = (X.AnonymousClass91U) r0
            X.1QS r0 = r0.A0Q
            X.1KH r3 = X.AnonymousClass8BR.A0R(r0)
            r0 = 1
            int[] r4 = new int[r0]
            r8 = 0
            r0 = 3
            r4[r8] = r0
            monitor-enter(r3)
            java.util.ArrayList r7 = X.AnonymousClass000.A13()     // Catch:{ all -> 0x0475 }
            r2 = 1
            r0 = 0
        L_0x040c:
            if (r0 >= r2) goto L_0x041d
            r1 = r4[r0]     // Catch:{ all -> 0x0475 }
            r0 = 12
            int r1 = r1 << r0
            long r0 = (long) r1     // Catch:{ all -> 0x0475 }
            java.lang.String r0 = java.lang.Long.toString(r0)     // Catch:{ all -> 0x0475 }
            r7.add(r0)     // Catch:{ all -> 0x0475 }
            r0 = 1
            goto L_0x040c
        L_0x041d:
            X.2Di r0 = r3.A00     // Catch:{ all -> 0x0475 }
            X.1at r6 = r0.get()     // Catch:{ all -> 0x0475 }
            r0 = r6
            X.1av r0 = (X.C28801av) r0     // Catch:{ all -> 0x046b }
            X.1Ev r2 = r0.A02     // Catch:{ all -> 0x046b }
            r0 = 12
            r4 = 15
            long r4 = r4 << r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()     // Catch:{ all -> 0x046b }
            java.lang.String r0 = "SELECT COUNT(*) as count FROM contacts"
            r1.append(r0)     // Catch:{ all -> 0x046b }
            java.lang.String r0 = X.C60792oc.A00(r7, r4, r8)     // Catch:{ all -> 0x046b }
            java.lang.String r1 = X.AnonymousClass000.A0y(r0, r1)     // Catch:{ all -> 0x046b }
            java.lang.String r0 = "getActivePaymentContactsCount/QUERY_SCHEMA_PAY_CONTACTS_COUNT"
            android.database.Cursor r2 = X.C23141Ev.A00(r2, r1, r0)     // Catch:{ all -> 0x046b }
            boolean r0 = r2.moveToNext()     // Catch:{ all -> 0x045f }
            if (r0 == 0) goto L_0x0451
            java.lang.String r0 = "count"
            long r0 = X.C17890vO.A06(r2, r0)     // Catch:{ all -> 0x045f }
            goto L_0x0453
        L_0x0451:
            r0 = 0
        L_0x0453:
            r2.close()     // Catch:{ all -> 0x046b }
            r6.close()     // Catch:{ all -> 0x0475 }
            monitor-exit(r3)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            return r0
        L_0x045f:
            r1 = move-exception
            if (r2 == 0) goto L_0x046a
            r2.close()     // Catch:{ all -> 0x0466 }
            goto L_0x046a
        L_0x0466:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x046b }
        L_0x046a:
            throw r1     // Catch:{ all -> 0x046b }
        L_0x046b:
            r1 = move-exception
            r6.close()     // Catch:{ all -> 0x0470 }
            goto L_0x0474
        L_0x0470:
            r0 = move-exception
            X.AnonymousClass0DT.A00(r1, r0)     // Catch:{ all -> 0x0475 }
        L_0x0474:
            throw r1     // Catch:{ all -> 0x0475 }
        L_0x0475:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        L_0x0478:
            java.lang.Object r1 = r2.A02
            X.9sf r1 = (X.C195019sf) r1
            X.00H r0 = r1.A03
            X.2u4 r0 = X.C17880vN.A0J(r0)
            X.2mj r0 = X.C64012u4.A01(r0)
            java.lang.String r2 = r0.A01
            if (r2 == 0) goto L_0x049e
            int r0 = r2.length()
            if (r0 == 0) goto L_0x049e
            X.00H r0 = r1.A02
            java.lang.Object r1 = X.C18070vi.A0E(r0)
            X.1cN r1 = (X.C29491cN) r1
            r0 = 0
            X.2rb r0 = r1.A06(r2, r0, r0)
            return r0
        L_0x049e:
            r0 = 0
            return r0
        L_0x04a0:
            java.lang.Object r0 = r2.A01
            X.1RK r0 = (X.AnonymousClass1RK) r0
            java.util.ArrayList r0 = r0.A07()
            boolean r0 = X.C17880vN.A1X(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
        L_0x04b1:
            java.lang.Object r1 = r2.A01
            X.1oI r1 = (X.C36681oI) r1
            X.00H r2 = r1.A0I
            java.lang.Object r0 = r2.get()
            X.11Z r0 = (X.AnonymousClass11Z) r0
            long r12 = r0.A03()
            long r14 = X.C108975cc.A07(r2)
            X.00H r0 = r1.A0H
            java.lang.Object r0 = r0.get()
            X.1HV r0 = (X.AnonymousClass1HV) r0
            X.18O r2 = r0.A00
            X.18Q r0 = X.AnonymousClass18O.A0r
            int r11 = r2.A04(r0)
            X.0zA r2 = r1.A04
            boolean r0 = r2.A07()
            if (r0 == 0) goto L_0x04e7
            r2.A03()
            java.lang.String r0 = "isPremiumSubscriptionActive"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x04e7:
            X.0zA r2 = r1.A02
            boolean r0 = r2.A07()
            if (r0 == 0) goto L_0x04f9
            r2.A03()
            java.lang.String r0 = "isEligibleForMetaVerified"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x04f9:
            r10 = 0
            r6 = 0
            X.9Ml r5 = new X.9Ml
            r5.<init>()
            X.1oE r4 = r1.A07
            X.0ve r3 = r4.A00
            r2 = 3712(0xe80, float:5.202E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r3, r2)
            if (r0 == 0) goto L_0x0512
            X.Ai4 r6 = r4.A01()
        L_0x0512:
            X.1oD r2 = r1.A0A
            boolean r0 = r2.A06()
            if (r0 == 0) goto L_0x054c
            X.Ai4 r7 = r2.A01()
        L_0x051e:
            X.1oF r2 = r1.A08
            boolean r0 = r2.A06()
            if (r0 == 0) goto L_0x054a
            X.Ai4 r8 = r2.A01()
        L_0x052a:
            X.1oG r2 = r1.A09
            boolean r0 = r2.A06()
            if (r0 == 0) goto L_0x0548
            X.Ai4 r9 = r2.A01()
        L_0x0536:
            X.0zA r2 = r1.A01
            boolean r0 = r2.A07()
            if (r0 == 0) goto L_0x054e
            r2.A03()
            java.lang.String r0 = "isProfileEditBannerEnabled"
            java.lang.NullPointerException r0 = X.AnonymousClass000.A0s(r0)
            throw r0
        L_0x0548:
            r9 = r10
            goto L_0x0536
        L_0x054a:
            r8 = r10
            goto L_0x052a
        L_0x054c:
            r7 = r10
            goto L_0x051e
        L_0x054e:
            X.1oH r2 = r1.A06
            boolean r0 = r2.A06()
            if (r0 == 0) goto L_0x055a
            X.Ai4 r10 = r2.A01()
        L_0x055a:
            X.00H r0 = r1.A0F
            X.1NP r0 = X.AnonymousClass8BS.A0A(r0)
            r0.A07()
            X.9tr r0 = new X.9tr
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r14)
            r1.A00 = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9BR.A0G(java.lang.Object[]):java.lang.Object");
    }

    public /* bridge */ /* synthetic */ void A0H(Object obj) {
        C20284AEs A022;
        C170278pb r0;
        switch (this.A00) {
            case 2:
                ((C21132Af0) this.A02).A0B(obj);
                return;
            case 3:
                C62562rb r9 = (C62562rb) obj;
                if (r9 != null) {
                    ((C22445B8d) this.A01).Bko(true, r9.A07, r9.A05, C17880vN.A0I(((C195019sf) this.A02).A02).A08(r9.A06));
                    return;
                }
                ((C22445B8d) this.A01).Bko(false, (String) null, (String) null, (String) null);
                return;
            case 4:
                ArrayList arrayList = (ArrayList) obj;
                BBB bbb = ((A0S) ((C175958zY) this.A01).A01).A01;
                if (bbb != null) {
                    bbb.BmP((A7B) null, arrayList);
                    return;
                }
                return;
            case 5:
                AnonymousClass91y r1 = (AnonymousClass91y) ((C175958zY) this.A01).A01;
                r1.A4c((C20284AEs) obj, false);
                C23520Bik.A01(r1.A00, 2131887942, -1).A08();
                return;
            case 6:
                Long l = (Long) obj;
                if (l.longValue() >= 10) {
                    Activity activity = (Activity) this.A01;
                    if (!activity.isFinishing()) {
                        ((TextSwitcher) this.A02).setText(Html.fromHtml(C17880vN.A0q(activity, l.toString(), AnonymousClass3MW.A1a(), 0, 2131894227)));
                    }
                }
                ((AnonymousClass91K) this.A01).A54(l);
                return;
            case 7:
                List list = (List) obj;
                if (list != null && !list.isEmpty()) {
                    AnonymousClass91T r7 = (AnonymousClass91T) this.A01;
                    C20080A6g a6g = r7.A0O;
                    String str = r7.A0t;
                    boolean z = r7.A0x;
                    String str2 = r7.A0a;
                    Iterator it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            A022 = AnonymousClass8BR.A0P(it);
                            if (!(A022 instanceof AnonymousClass8pN) || (r0 = A022.A08) == null || !((AnonymousClass8pS) r0).A0G || C20080A6g.A02(A022, str) || !a6g.A09(A022, str2, false, z)) {
                            }
                        } else {
                            A022 = AnonymousClass1KH.A02(list);
                        }
                    }
                    r7.A0B = A022;
                }
                C191979nV r4 = (C191979nV) this.A02;
                String str3 = r4.A0M;
                IndiaUpiCheckOrderDetailsActivity indiaUpiCheckOrderDetailsActivity = (IndiaUpiCheckOrderDetailsActivity) this.A01;
                if (str3 == null) {
                    indiaUpiCheckOrderDetailsActivity.C59(r4.A06);
                    return;
                } else {
                    indiaUpiCheckOrderDetailsActivity.A09.A04.A00(new C21432Ajz(this, r4, 25), str3);
                    return;
                }
            default:
                C195759tr r92 = (C195759tr) obj;
                ((C36681oI) this.A01).A00 = r92;
                C72063Km r02 = (C72063Km) this.A02;
                if (r92 != null) {
                    r02.Bqj(r92);
                    return;
                }
                return;
        }
    }
}
