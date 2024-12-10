package X;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import com.whatsapp.base.WaDialogFragment;
import com.whatsapp.dialogs.ProgressDialogFragment;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.lang.ref.WeakReference;
import java.util.Collections;

/* renamed from: X.1q2  reason: invalid class name and case insensitive filesystem */
public class C37731q2 implements C36211nW {
    public C34241kA A00;
    public C34241kA A01;
    public AnonymousClass1BI A02;
    public AnonymousClass00H A03;
    public AnonymousClass00H A04;
    public final int A05;
    public final int A06;
    public final AnonymousClass1CJ A07;
    public final C37701pz A08;
    public final AnonymousClass00H A09;
    public final WeakReference A0A;
    public final AnonymousClass1KB A0B;
    public final AnonymousClass11S A0C;
    public final C33251iW A0D;
    public final C32531hL A0E;
    public final C26911Ty A0F;
    public final C34511kb A0G;
    public final C203411t A0H;
    public final AnonymousClass1M9 A0I;
    public final AnonymousClass12E A0J;
    public final C32791hl A0K;
    public final C37691py A0L;
    public final C37681px A0M;
    public final AnonymousClass11P A0N;
    public final C19830z4 A0O;
    public final AnonymousClass1MZ A0P;
    public final AnonymousClass12L A0Q;
    public final AnonymousClass126 A0R;
    public final AnonymousClass1MB A0S;
    public final C32291gx A0T;
    public final AnonymousClass1Nb A0U;
    public final C37721q1 A0V;
    public final C36451nu A0W;
    public final AnonymousClass1DC A0X;
    public final AnonymousClass10I A0Y;
    public final AnonymousClass00H A0Z;
    public final WeakReference A0a;

    public void BvB() {
    }

    public void BvC() {
    }

    private void A00(Menu menu, int i, int i2) {
        menu.add(this.A05, i, 0, i2);
    }

    public void A01() {
        UserJid userJid;
        if (this.A02 != null) {
            this.A0J.A0D((Integer) null);
            AnonymousClass1E7 A0H2 = this.A0I.A0H(this.A02);
            if (A0H2.A0C() && (userJid = (UserJid) A0H2.A06(UserJid.class)) != null) {
                this.A0F.A0F(this, userJid, (String) null);
            }
            this.A0V.A02();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:61:0x0147  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0186  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01ac  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A02(android.view.Menu r7, X.AnonymousClass1BI r8, boolean r9, boolean r10) {
        /*
            r6 = this;
            java.lang.ref.WeakReference r0 = r6.A0A
            java.lang.Object r2 = r0.get()
            android.content.Context r2 = (android.content.Context) r2
            if (r2 == 0) goto L_0x002b
            r6.A02 = r8
            X.1M9 r0 = r6.A0I
            X.1E7 r3 = r0.A0H(r8)
            boolean r0 = X.C22971Dz.A0c(r8)
            if (r0 == 0) goto L_0x002c
            X.126 r0 = r6.A0R
            java.util.Set r0 = r0.A1F
            boolean r0 = r0.contains(r8)
            if (r0 != 0) goto L_0x002b
            r2 = 2131432554(0x7f0b146a, float:1.8486869E38)
            r1 = 2131889303(0x7f120c97, float:1.9413266E38)
        L_0x0028:
            r6.A00(r7, r2, r1)
        L_0x002b:
            return
        L_0x002c:
            X.1kb r4 = r6.A0G
            boolean r0 = r4.A0Q(r8)
            if (r0 == 0) goto L_0x0051
            X.2lf r0 = r3.A0H
            if (r0 != 0) goto L_0x0041
            r1 = 2131432555(0x7f0b146b, float:1.848687E38)
            r0 = 2131888255(0x7f12087f, float:1.941114E38)
            r6.A00(r7, r1, r0)
        L_0x0041:
            android.os.Parcelable$Creator r0 = X.AnonymousClass1EC.CREATOR
            X.1EC r0 = X.C42941yz.A00(r8)
            X.C17960vV.A07(r0)
            r2 = 2131432556(0x7f0b146c, float:1.8486873E38)
            r1 = 2131890178(0x7f121002, float:1.941504E38)
            goto L_0x0028
        L_0x0051:
            boolean r0 = X.C22971Dz.A0N(r8)
            if (r0 != 0) goto L_0x0060
            r1 = 2131432553(0x7f0b1469, float:1.8486867E38)
            r0 = 2131886507(0x7f1201ab, float:1.9407595E38)
            r6.A00(r7, r1, r0)
        L_0x0060:
            X.2lf r0 = r3.A0H
            if (r0 != 0) goto L_0x0204
            boolean r0 = X.C22971Dz.A0e(r8)
            if (r0 == 0) goto L_0x01cb
            r3 = 2131432555(0x7f0b146b, float:1.848687E38)
            r0 = r8
            com.whatsapp.jid.GroupJid r0 = (com.whatsapp.jid.GroupJid) r0
            boolean r0 = r4.A0R(r0)
            if (r0 == 0) goto L_0x01bd
            r1 = 2131886667(0x7f12024b, float:1.940792E38)
        L_0x0079:
            r6.A00(r7, r3, r1)
        L_0x007c:
            boolean r0 = X.C22971Dz.A0e(r8)
            if (r0 == 0) goto L_0x01ac
            android.os.Parcelable$Creator r0 = X.AnonymousClass1EC.CREATOR
            X.1EC r1 = X.C42941yz.A00(r8)
            X.C17960vV.A07(r1)
            X.1MZ r0 = r6.A0P
            boolean r0 = r0.A0J(r1)
            if (r0 == 0) goto L_0x01a4
            r3 = 2131432556(0x7f0b146c, float:1.8486873E38)
            X.1CJ r0 = r6.A07
            boolean r0 = r0.A0R(r1)
            r1 = 2131890191(0x7f12100f, float:1.9415067E38)
            if (r0 == 0) goto L_0x00a4
            r1 = 2131890178(0x7f121002, float:1.941504E38)
        L_0x00a4:
            r6.A00(r7, r3, r1)
            X.00H r3 = r6.A0Z
            java.lang.Object r0 = r3.get()
            X.1rO r0 = (X.C38501rO) r0
            boolean r0 = r0.A07()
            if (r0 == 0) goto L_0x00c4
            r3.get()
            r1 = 2131432591(0x7f0b148f, float:1.8486944E38)
            r3.get()
            r0 = 2131891989(0x7f121715, float:1.9418714E38)
            r6.A00(r7, r1, r0)
        L_0x00c4:
            X.1CJ r3 = r6.A07
            boolean r0 = r3.A0Q(r8)
            boolean r4 = X.C22971Dz.A0N(r8)
            if (r0 == 0) goto L_0x0186
            r1 = 2131432569(0x7f0b1479, float:1.84869E38)
            r0 = 2131897267(0x7f122bb3, float:1.9429419E38)
            if (r4 == 0) goto L_0x00db
            r0 = 2131897265(0x7f122bb1, float:1.9429415E38)
        L_0x00db:
            r6.A00(r7, r1, r0)
        L_0x00de:
            X.1px r0 = r6.A0M
            boolean r0 = r0.A03(r8)
            if (r0 == 0) goto L_0x00fb
            boolean r4 = r3.A0S(r8)
            r1 = 2131432558(0x7f0b146e, float:1.8486877E38)
            r0 = 2131888161(0x7f120821, float:1.941095E38)
            if (r4 == 0) goto L_0x00f8
            r1 = 2131432572(0x7f0b147c, float:1.8486905E38)
            r0 = 2131888162(0x7f120822, float:1.9410952E38)
        L_0x00f8:
            r6.A00(r7, r1, r0)
        L_0x00fb:
            if (r10 == 0) goto L_0x011a
            X.0z4 r5 = r6.A0O
            boolean r1 = X.AnonymousClass1Q0.A03(r5, r3, r8)
            X.1Nb r0 = r6.A0U
            X.1yM r0 = r0.A0a(r8)
            boolean r0 = r0.A0A()
            if (r0 != 0) goto L_0x014f
            if (r1 != 0) goto L_0x014f
            r1 = 2131432563(0x7f0b1473, float:1.8486887E38)
            r0 = 2131891999(0x7f12171f, float:1.9418734E38)
            r6.A00(r7, r1, r0)
        L_0x011a:
            boolean r0 = r3.A0Q(r8)
            if (r0 != 0) goto L_0x013b
            if (r9 == 0) goto L_0x013b
            X.1Nb r0 = r6.A0U
            X.1yM r0 = r0.A0a(r8)
            boolean r2 = r0.A0S
            r1 = 2131432566(0x7f0b1476, float:1.8486893E38)
            r0 = 2131892004(0x7f121724, float:1.9418744E38)
            if (r2 == 0) goto L_0x0138
            r1 = 2131432574(0x7f0b147e, float:1.848691E38)
            r0 = 2131892018(0x7f121732, float:1.9418772E38)
        L_0x0138:
            r6.A00(r7, r1, r0)
        L_0x013b:
            int r0 = r3.A03(r8)
            r2 = 2131432561(0x7f0b1471, float:1.8486883E38)
            r1 = 2131891883(0x7f1216ab, float:1.9418499E38)
            if (r0 == 0) goto L_0x0028
            r2 = 2131432560(0x7f0b1470, float:1.848688E38)
            r1 = 2131891882(0x7f1216aa, float:1.9418497E38)
            goto L_0x0028
        L_0x014f:
            r0 = 2131892017(0x7f121731, float:1.941877E38)
            java.lang.String r0 = r2.getString(r0)
            android.text.SpannableString r4 = new android.text.SpannableString
            r4.<init>(r0)
            boolean r0 = X.AnonymousClass1Q0.A03(r5, r3, r8)
            if (r0 == 0) goto L_0x017c
            r1 = 2130970337(0x7f0406e1, float:1.7549381E38)
            r0 = 2131101306(0x7f06067a, float:1.7815018E38)
            int r0 = X.AnonymousClass1YL.A00(r2, r1, r0)
            int r0 = X.C19740yt.A00(r2, r0)
            android.text.style.ForegroundColorSpan r2 = new android.text.style.ForegroundColorSpan
            r2.<init>(r0)
            int r1 = r4.length()
            r0 = 0
            r4.setSpan(r2, r0, r1, r0)
        L_0x017c:
            r2 = 2131432573(0x7f0b147d, float:1.8486907E38)
            int r1 = r6.A05
            r0 = 0
            r7.add(r1, r2, r0, r4)
            goto L_0x011a
        L_0x0186:
            if (r4 == 0) goto L_0x0190
            r1 = 2131432549(0x7f0b1465, float:1.8486859E38)
            r0 = 2131886724(0x7f120284, float:1.9408035E38)
            goto L_0x00db
        L_0x0190:
            boolean r0 = r3.A0P(r8)
            if (r0 == 0) goto L_0x00de
            boolean r0 = r3.A0S(r8)
            if (r0 != 0) goto L_0x00de
            r1 = 2131432549(0x7f0b1465, float:1.8486859E38)
            r0 = 2131886726(0x7f120286, float:1.9408039E38)
            goto L_0x00db
        L_0x01a4:
            r3 = 2131432554(0x7f0b146a, float:1.8486869E38)
            r1 = 2131889303(0x7f120c97, float:1.9413266E38)
            goto L_0x00a4
        L_0x01ac:
            boolean r0 = X.C22971Dz.A0N(r8)
            r3 = 2131432554(0x7f0b146a, float:1.8486869E38)
            r1 = 2131889290(0x7f120c8a, float:1.941324E38)
            if (r0 == 0) goto L_0x00a4
            r1 = 2131889310(0x7f120c9e, float:1.941328E38)
            goto L_0x00a4
        L_0x01bd:
            boolean r0 = r4.A0Q(r8)
            r1 = 2131891001(0x7f121339, float:1.941671E38)
            if (r0 == 0) goto L_0x0079
            r1 = 2131888255(0x7f12087f, float:1.941114E38)
            goto L_0x0079
        L_0x01cb:
            boolean r0 = X.C22971Dz.A0N(r8)
            if (r0 == 0) goto L_0x01d9
            r3 = 2131432555(0x7f0b146b, float:1.848687E38)
            r1 = 2131891715(0x7f121603, float:1.9418158E38)
            goto L_0x0079
        L_0x01d9:
            X.11S r0 = r6.A0C
            boolean r0 = r0.A0N()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x007c
            X.12L r0 = r6.A0Q
            boolean r0 = X.C42761yh.A01(r0, r8)
            if (r0 != 0) goto L_0x007c
            X.1MB r0 = r6.A0S
            boolean r0 = r0.A03(r8)
            if (r0 != 0) goto L_0x007c
            r1 = 2131432546(0x7f0b1462, float:1.8486853E38)
            r0 = 2131898687(0x7f12313f, float:1.9432299E38)
            r6.A00(r7, r1, r0)
            r3 = 2131432547(0x7f0b1463, float:1.8486855E38)
            r1 = 2131886477(0x7f12018d, float:1.9407534E38)
            goto L_0x0079
        L_0x0204:
            r3 = 2131432552(0x7f0b1468, float:1.8486865E38)
            r1 = 2131897875(0x7f122e13, float:1.9430652E38)
            goto L_0x0079
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C37731q2.A02(android.view.Menu, X.1BI, boolean, boolean):void");
    }

    public boolean A03(MenuItem menuItem, Fragment fragment, AnonymousClass1FL r19) {
        AnonymousClass1EC A052;
        WaDialogFragment BP0;
        AnonymousClass1FL r6 = r19;
        AnonymousClass1GP r4 = (AnonymousClass1GP) this.A0a.get();
        if (!(r4 == null || this.A02 == null || menuItem.getGroupId() != this.A05)) {
            if (menuItem.getItemId() == 2131432552) {
                AnonymousClass1E7 A0H2 = this.A0I.A0H(this.A02);
                if (A0H2.A0H != null) {
                    Jid A062 = A0H2.A06(UserJid.class);
                    C17960vV.A07(A062);
                    r6.startActivity(AnonymousClass1LU.A1D(r6, (UserJid) A062, (Integer) null, true, true));
                }
            } else if (menuItem.getItemId() == 2131432554) {
                C37681px r3 = this.A0M;
                AnonymousClass1BI r2 = this.A02;
                r3.A08.A01(r2, new AnonymousClass3AM(r4, r3, r2));
                return true;
            } else {
                Fragment fragment2 = fragment;
                if (menuItem.getItemId() == 2131432556) {
                    AnonymousClass1BI r22 = this.A02;
                    Parcelable.Creator creator = AnonymousClass1EC.CREATOR;
                    AnonymousClass1EC A002 = C42941yz.A00(r22);
                    if (A002 != null) {
                        C34511kb r23 = this.A0G;
                        if (r23.A0Q(A002)) {
                            BP0 = this.A0M.A03.BP0(A002);
                        } else if (!r23.A0R(A002) || (A052 = r23.A05(A002)) == null) {
                            C37681px r32 = this.A0M;
                            ProgressDialogFragment A003 = ProgressDialogFragment.A00(2131894782, 2131895077);
                            A003.A2F(r4, (String) null);
                            AnonymousClass10I r1 = r32.A09;
                            C34591kk r9 = r32.A07;
                            r1.CGD(new AnonymousClass2PS(new C91224fL(r4, A003, A002, 1), fragment2, r32.A02, r9, Collections.singleton(A002)), new Object[0]);
                            return true;
                        } else {
                            BP0 = this.A0M.A03.BP0(A052);
                        }
                        BP0.A2F(r4, "conversations_fragment_action_tag");
                        return true;
                    }
                } else if (menuItem.getItemId() == 2131432546) {
                    AnonymousClass1E7 A0H3 = this.A0I.A0H(this.A02);
                    C36451nu r5 = this.A0W;
                    if (C18020vd.A05(C18040vf.A02, r5.A00, 913)) {
                        AnonymousClass1GP r7 = r6.A03.A00.A03;
                        AnonymousClass1BI r12 = this.A02;
                        r5.A05(r6, r7, (C30191dX) this.A03.get(), (C219217x) this.A04.get(), this.A0O, A0H3, r12);
                        r6.A03.A00.A03.A0t(new AnonymousClass7A5(r6, this, 2), r6, "request_bottom_sheet_fragment");
                    } else {
                        Intent A022 = r5.A02(A0H3, this.A02, true);
                        C17960vV.A07(r6);
                        A022.setComponent(A022.resolveActivity(r6.getPackageManager()));
                        if (A022.getComponent() != null) {
                            fragment2.startActivityForResult(A022, this.A06);
                        } else {
                            Log.w("conversations/context system contact list could not found");
                            this.A0B.A08(2131897310, 0);
                            return true;
                        }
                    }
                    this.A0V.A06(true, 7);
                    return true;
                } else if (menuItem.getItemId() == 2131432547) {
                    try {
                        fragment2.startActivityForResult(this.A0W.A02(this.A0I.A0H(this.A02), this.A02, false), this.A06);
                        this.A0V.A06(false, 7);
                        return true;
                    } catch (ActivityNotFoundException unused) {
                        this.A0B.A08(2131886448, 0);
                        return true;
                    }
                } else if (menuItem.getItemId() == 2131432566) {
                    return this.A0L.A00(this.A02);
                } else {
                    if (menuItem.getItemId() == 2131432574) {
                        C37691py r42 = this.A0L;
                        AnonymousClass1BI r33 = this.A02;
                        C18070vi.A0d(r33, 0);
                        r42.A05.CGF(new C70633Bw(r42, r33, 8));
                        return true;
                    } else if (menuItem.getItemId() == 2131432563) {
                        AnonymousClass4Z1.A02(C32961i2.CHAT_LIST_SCREEN, Collections.singleton(this.A02)).A2C(r4, (String) null);
                        return true;
                    } else if (menuItem.getItemId() == 2131432573) {
                        AnonymousClass1BI r34 = this.A02;
                        if (AnonymousClass1Q0.A03(this.A0O, this.A07, r34)) {
                            AnonymousClass1Q0.A01(r6, r6.findViewById(2131434659), this.A0D, this.A02, 0);
                            return true;
                        }
                        this.A0Y.CGF(new C70573Bq(this, 0));
                        return true;
                    } else if (menuItem.getItemId() == 2131432549) {
                        this.A0M.A02(this.A02, 0);
                        return true;
                    } else if (menuItem.getItemId() == 2131432569) {
                        C37681px r24 = this.A0M;
                        r24.A06.A08(this.A02, 0, false, false);
                        return true;
                    } else if (menuItem.getItemId() == 2131432560) {
                        this.A0K.A00(this.A02, 3, 4, true, true, false);
                        this.A0T.A08();
                        return true;
                    } else if (menuItem.getItemId() == 2131432561) {
                        this.A0K.A02(this.A02, true);
                        return true;
                    } else if (menuItem.getItemId() == 2131432553) {
                        this.A0E.A05(this.A0I.A0H(this.A02));
                        return true;
                    } else if (menuItem.getItemId() == 2131432555) {
                        AnonymousClass1E7 A0H4 = this.A0I.A0H(this.A02);
                        if (C22971Dz.A0N(A0H4.A0J)) {
                            C17960vV.A07(r6);
                            r6.startActivity(AnonymousClass1LU.A12(r6, A0H4.A0J, true), (Bundle) null);
                            return true;
                        }
                        AnonymousClass1BI r43 = this.A02;
                        if (C22971Dz.A0e(r43)) {
                            C34511kb r25 = this.A0G;
                            if (r25.A0R((GroupJid) r43)) {
                                AnonymousClass1EC A053 = r25.A05((AnonymousClass1EC) this.A02);
                                if (A053 == null || !this.A0H.CAq(r6, r6.findViewById(2131434659), A053)) {
                                    return false;
                                }
                                return true;
                            }
                        }
                        if (this.A0G.A0Q(this.A02)) {
                            this.A0H.CAo(r6, r6.findViewById(2131434659), (GroupJid) this.A02);
                            return true;
                        }
                        Intent A13 = AnonymousClass1LU.A13(r6, A0H4.A0J, true, false, true);
                        C60442o2.A00(A13, this.A0N, r6.getClass().getSimpleName());
                        r6.startActivity(A13, (Bundle) null);
                        return true;
                    } else {
                        int itemId = menuItem.getItemId();
                        AnonymousClass00H r26 = this.A0Z;
                        r26.get();
                        if (itemId != 2131432591 || !((C38501rO) r26.get()).A07()) {
                            if (menuItem.getItemId() == 2131432558) {
                                if ((r6 instanceof AnonymousClass1FY) && this.A02 != null) {
                                    C31191fA r52 = (C31191fA) this.A09.get();
                                    AnonymousClass1FY r62 = (AnonymousClass1FY) r6;
                                    AnonymousClass1BI r44 = this.A02;
                                    C76853oX r35 = new C76853oX(r44);
                                    C34241kA r27 = this.A01;
                                    if (r27 == null) {
                                        r27 = new C93754jU(this, 6);
                                        this.A01 = r27;
                                    }
                                    r52.A0C(r62, r35, r27, r44, 1);
                                    return true;
                                }
                            } else if (menuItem.getItemId() == 2131432572) {
                                if ((r6 instanceof AnonymousClass1FY) && this.A02 != null) {
                                    C31191fA r53 = (C31191fA) this.A09.get();
                                    AnonymousClass1FY r63 = (AnonymousClass1FY) r6;
                                    C76833oV r45 = new C76833oV(this.A02);
                                    C34241kA r28 = this.A00;
                                    if (r28 == null) {
                                        r28 = new C93754jU(this, 5);
                                        this.A00 = r28;
                                    }
                                    r53.A0A(r63, r45, r28, 4);
                                    return true;
                                }
                            }
                        } else if (this.A02 != null) {
                            ((C38501rO) r26.get()).A05(r4, this.A02, 5, (AnonymousClass1OS) null);
                            return true;
                        }
                    }
                }
            }
            return true;
        }
        return false;
    }

    public C37731q2(Context context, AnonymousClass1GP r3, AnonymousClass1KB r4, AnonymousClass11S r5, C33251iW r6, C32531hL r7, C26911Ty r8, C34511kb r9, C203411t r10, AnonymousClass1M9 r11, AnonymousClass12E r12, C32791hl r13, C37691py r14, C37681px r15, AnonymousClass11P r16, C19830z4 r17, AnonymousClass1CJ r18, AnonymousClass1MZ r19, AnonymousClass12L r20, AnonymousClass126 r21, AnonymousClass1MB r22, C37701pz r23, C32291gx r24, AnonymousClass1Nb r25, C37721q1 r26, C36451nu r27, AnonymousClass1DC r28, AnonymousClass10I r29, AnonymousClass00H r30, AnonymousClass00H r31, int i, int i2) {
        this.A0A = new WeakReference(context);
        this.A0a = new WeakReference(r3);
        this.A0N = r16;
        this.A0B = r4;
        this.A0Z = r30;
        this.A0C = r5;
        this.A0Y = r29;
        this.A07 = r18;
        this.A0D = r6;
        this.A0Q = r20;
        this.A0I = r11;
        this.A0X = r28;
        this.A08 = r23;
        this.A0R = r21;
        this.A0V = r26;
        this.A0U = r25;
        this.A0E = r7;
        this.A0W = r27;
        this.A0J = r12;
        this.A09 = r31;
        this.A0T = r24;
        this.A0O = r17;
        this.A0G = r9;
        this.A0L = r14;
        this.A0F = r8;
        this.A0K = r13;
        this.A0H = r10;
        this.A0P = r19;
        this.A0M = r15;
        this.A0S = r22;
        this.A06 = i;
        this.A05 = i2;
    }
}
