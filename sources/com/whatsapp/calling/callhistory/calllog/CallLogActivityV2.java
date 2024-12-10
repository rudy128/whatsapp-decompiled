package com.whatsapp.calling.callhistory.calllog;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass02B;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass12E;
import X.AnonymousClass1BI;
import X.AnonymousClass1DF;
import X.AnonymousClass1E7;
import X.AnonymousClass1FB;
import X.AnonymousClass1FY;
import X.AnonymousClass1GP;
import X.AnonymousClass1J8;
import X.AnonymousClass1K1;
import X.AnonymousClass1K2;
import X.AnonymousClass1LU;
import X.AnonymousClass1OR;
import X.AnonymousClass1OS;
import X.AnonymousClass1OX;
import X.AnonymousClass1VP;
import X.AnonymousClass1VW;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass3WG;
import X.AnonymousClass3XR;
import X.AnonymousClass4SO;
import X.AnonymousClass4X3;
import X.AnonymousClass4Z9;
import X.AnonymousClass5Af;
import X.AnonymousClass5CR;
import X.AnonymousClass5CS;
import X.AnonymousClass5CT;
import X.AnonymousClass5CU;
import X.AnonymousClass5CV;
import X.AnonymousClass5MG;
import X.AnonymousClass5PO;
import X.AnonymousClass5PR;
import X.C000200d;
import X.C000500i;
import X.C003401n;
import X.C100985Am;
import X.C100995An;
import X.C101005Aq;
import X.C105045Qm;
import X.C123736Vq;
import X.C17880vN;
import X.C18020vd;
import X.C18030ve;
import X.C18040vf;
import X.C18070vi;
import X.C18090vk;
import X.C18100vl;
import X.C18460wS;
import X.C18600wl;
import X.C192619oh;
import X.C195199sx;
import X.C219217x;
import X.C222219b;
import X.C22941Dw;
import X.C22971Dz;
import X.C24521Kq;
import X.C27201Vd;
import X.C28281Zt;
import X.C29431cG;
import X.C30191dX;
import X.C30361do;
import X.C30391dr;
import X.C30451dy;
import X.C36321nh;
import X.C36451nu;
import X.C36931oh;
import X.C37551pj;
import X.C40751vD;
import X.C40811vJ;
import X.C41561wd;
import X.C42141xh;
import X.C43421zm;
import X.C72043Kk;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C73173Rg;
import X.C76873oZ;
import X.C84504Jt;
import X.C84514Ju;
import X.C84524Jv;
import X.C84534Jw;
import X.C87774Wx;
import X.C89444cT;
import X.C90994ey;
import X.C91104f9;
import X.C91374fa;
import X.C93774jW;
import X.C94214kE;
import X.C99274sY;
import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.WaImageButton;
import com.whatsapp.contact.photos.MultiContactThumbnail;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import com.whatsapp.wds.components.actiontile.WDSActionTileGroup;
import java.util.ArrayList;
import java.util.List;

public final class CallLogActivityV2 extends AnonymousClass1FY {
    public View A00;
    public RecyclerView A01;
    public C84504Jt A02;
    public C84514Ju A03;
    public C84524Jv A04;
    public C84534Jw A05;
    public TextEmojiLabel A06;
    public TextEmojiLabel A07;
    public TextEmojiLabel A08;
    public C72043Kk A09;
    public C42141xh A0A;
    public C40751vD A0B;
    public WaImageButton A0C;
    public WaImageButton A0D;
    public CallInfoNestedScrollView A0E;
    public C91104f9 A0F;
    public AnonymousClass3WG A0G;
    public AnonymousClass1VP A0H;
    public C195199sx A0I;
    public C30191dX A0J;
    public AnonymousClass1VW A0K;
    public C27201Vd A0L;
    public MultiContactThumbnail A0M;
    public C219217x A0N;
    public WDSActionTileGroup A0O;
    public AnonymousClass00H A0P;
    public AnonymousClass00H A0Q;
    public AnonymousClass00H A0R;
    public AnonymousClass00H A0S;
    public AnonymousClass00H A0T;
    public AnonymousClass00H A0U;
    public AnonymousClass00H A0V;
    public AnonymousClass00H A0W;
    public AnonymousClass4X3 A0X;
    public C87774Wx A0Y;
    public boolean A0Z;
    public final C18100vl A0a;
    public final C18100vl A0b;
    public final C18100vl A0c;

    public CallLogActivityV2() {
        this(0);
        this.A0a = C99274sY.A00(new AnonymousClass5CV(this), new AnonymousClass5CU(this), new AnonymousClass5MG(this), AnonymousClass3MW.A15(CallLogActivityViewModel.class));
        Integer num = AnonymousClass00R.A0C;
        this.A0b = AnonymousClass1DF.A00(num, new AnonymousClass5CR(this));
        this.A0c = AnonymousClass1DF.A00(num, new AnonymousClass5CT(this));
    }

    public static final void A0V(CallLogActivityV2 callLogActivityV2) {
        CallLogActivityV2 callLogActivityV22 = callLogActivityV2;
        CallLogActivityViewModel A0R2 = AnonymousClass3MY.A0R(callLogActivityV2);
        Integer num = A0R2.A0N;
        Boolean bool = A0R2.A0M;
        C36321nh r0 = GroupJid.Companion;
        ((C192619oh) A0R2.A0I.get()).A01(C36321nh.A00(A0R2.A0F), bool, num, 47);
        AnonymousClass00H r02 = callLogActivityV2.A0U;
        if (r02 == null) {
            C18070vi.A11("nativeContactGateKeeperLazy");
            throw null;
        } else if (AnonymousClass3MX.A0g(r02).A05()) {
            callLogActivityV2.A0c(true);
        } else {
            callLogActivityV22.CMx((Integer) null, 2131886468, 2131892464, 2131890163, (Integer) null, "calllog/dialog-add-contact", (String) null, (Object[]) null);
        }
    }

    public int A31() {
        return 78318969;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0093, code lost:
        r9.A0T(r5, r11, r12, r13, r14, false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0098, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ae, code lost:
        r0 = "voipUXResponsivenessLogger";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0118, code lost:
        X.C18070vi.A11(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x011b, code lost:
        throw null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A4b(X.AnonymousClass4DJ r17, X.AnonymousClass4SR r18) {
        /*
            r16 = this;
            r8 = 0
            r13 = 1
            r2 = r18
            X.C18070vi.A0d(r2, r13)
            int r0 = r17.ordinal()
            r11 = 0
            r5 = r16
            switch(r0) {
                case 0: goto L_0x00b1;
                case 1: goto L_0x0099;
                case 2: goto L_0x0083;
                case 3: goto L_0x0108;
                case 4: goto L_0x0051;
                case 5: goto L_0x0051;
                case 6: goto L_0x0072;
                case 7: goto L_0x0012;
                case 8: goto L_0x007a;
                default: goto L_0x0011;
            }
        L_0x0011:
            return
        L_0x0012:
            java.lang.String r0 = r2.A05
            if (r0 == 0) goto L_0x0011
            boolean r4 = r2.A09
            r2 = 2131887686(0x7f120646, float:1.9409986E38)
            if (r4 == 0) goto L_0x0020
            r2 = 2131887685(0x7f120645, float:1.9409984E38)
        L_0x0020:
            java.lang.Object[] r1 = new java.lang.Object[r13]
            java.lang.String r0 = X.AnonymousClass74H.A07(r0, r4)
            java.lang.String r3 = X.AnonymousClass3Ma.A10(r5, r0, r1, r8, r2)
            int r1 = android.os.Build.VERSION.SDK_INT
            r0 = 22
            r2 = 2
            if (r1 >= r0) goto L_0x0042
            X.00H r0 = r5.A0S
            if (r0 == 0) goto L_0x010c
            java.lang.Object r1 = r0.get()
            X.A4u r1 = (X.A4u) r1
            X.62u r0 = X.AnonymousClass74H.A02(r11, r2, r2, r4)
            r1.A03(r0)
        L_0x0042:
            r0 = 2131887683(0x7f120643, float:1.940998E38)
            java.lang.String r0 = r5.getString(r0)
            android.content.Intent r0 = X.AnonymousClass74H.A00(r5, r3, r0, r2, r4)
            r5.startActivity(r0)
            return
        L_0x0051:
            java.lang.String r1 = r2.A05
            if (r1 == 0) goto L_0x0011
            boolean r0 = r2.A09
            java.lang.String r0 = X.AnonymousClass74H.A07(r1, r0)
            android.net.Uri r3 = android.net.Uri.parse(r0)
            X.1VP r2 = r5.A0H
            if (r2 == 0) goto L_0x0116
            X.1vD r0 = r5.A0B
            if (r0 == 0) goto L_0x010f
            r0.A03()
            X.1KB r1 = r5.A05
            r0 = 13
            X.C63982u1.A06(r3, r5, r1, r2, r0)
            return
        L_0x0072:
            java.lang.String r0 = "An operation is not implemented."
            X.6Rw r1 = new X.6Rw
            r1.<init>(r0)
            throw r1
        L_0x007a:
            com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel r9 = X.AnonymousClass3MY.A0R(r5)
            java.util.List r12 = r2.A07
            r14 = 1
            r13 = 0
            goto L_0x0093
        L_0x0083:
            X.9sx r0 = r5.A0I
            if (r0 == 0) goto L_0x00ae
            r0.A01()
            com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel r9 = X.AnonymousClass3MY.A0R(r5)
            java.util.List r12 = r2.A07
            X.4cT r11 = r2.A03
            r14 = 0
        L_0x0093:
            r10 = r5
            r15 = r8
            r9.A0T(r10, r11, r12, r13, r14, r15)
            return
        L_0x0099:
            X.9sx r0 = r5.A0I
            if (r0 == 0) goto L_0x00ae
            r0.A01()
            com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel r4 = X.AnonymousClass3MY.A0R(r5)
            java.util.List r7 = r2.A07
            X.4cT r6 = r2.A03
            r10 = r8
            r9 = r8
            r4.A0T(r5, r6, r7, r8, r9, r10)
            return
        L_0x00ae:
            java.lang.String r0 = "voipUXResponsivenessLogger"
            goto L_0x0118
        L_0x00b1:
            com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel r6 = X.AnonymousClass3MY.A0R(r5)
            java.util.List r0 = r2.A07
            java.lang.Object r8 = X.C29431cG.A0b(r0)
            X.1E7 r8 = (X.AnonymousClass1E7) r8
            X.C18070vi.A0d(r8, r13)
            X.1BI r9 = r8.A0J
            if (r9 != 0) goto L_0x00ca
            java.lang.String r0 = "CallLogActivityViewModel/navigateToConversation/Cannot navigate to null Jid"
            com.whatsapp.util.Log.w((java.lang.String) r0)
            return
        L_0x00ca:
            X.00H r0 = r6.A0I
            java.lang.Object r4 = r0.get()
            X.9oh r4 = (X.C192619oh) r4
            java.lang.Integer r3 = r6.A0N
            r0 = 44
            java.lang.Integer r2 = java.lang.Integer.valueOf(r0)
            java.lang.Boolean r1 = r6.A0M
            com.whatsapp.jid.GroupJid r0 = X.AnonymousClass3MW.A0f(r9)
            r4.A01(r0, r1, r3, r2)
            X.00H r0 = r6.A0L
            X.1fA r7 = X.AnonymousClass3MW.A0Y(r0)
            boolean r0 = r7.A0L()
            if (r0 == 0) goto L_0x0104
            boolean r0 = r7.A0M(r9)
            if (r0 == 0) goto L_0x0104
            X.3oZ r1 = new X.3oZ
            r1.<init>(r9, r13)
            X.4jY r4 = new X.4jY
            r4.<init>(r5, r6, r7, r8, r9)
            r0 = 5
            r7.A0A(r5, r1, r4, r0)
            return
        L_0x0104:
            com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel.A08(r5, r6, r9)
            return
        L_0x0108:
            A0V(r5)
            return
        L_0x010c:
            java.lang.String r0 = "callingWamEventHelper"
            goto L_0x0118
        L_0x010f:
            java.lang.String r0 = "upgrade"
            X.C18070vi.A11(r0)
            r1 = 0
            throw r1
        L_0x0116:
            java.lang.String r0 = "callsManager"
        L_0x0118:
            X.C18070vi.A11(r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callhistory.calllog.CallLogActivityV2.A4b(X.4DJ, X.4SR):void");
    }

    public void BkF(String str) {
        C18070vi.A0d(str, 0);
        if (str.equals("calllog/dialog-add-contact")) {
            A0c(false);
        }
    }

    public void C81(AnonymousClass02B r3) {
        C18070vi.A0d(r3, 0);
        super.C81(r3);
        C91104f9 r0 = this.A0F;
        if (r0 == null) {
            C18070vi.A11("callLogActivityActionMode");
            throw null;
        }
        AnonymousClass1FY r1 = r0.A01;
        C28281Zt.A05(r1, AnonymousClass4Z9.A01(r1, false));
    }

    public void C82(AnonymousClass02B r2) {
        C18070vi.A0d(r2, 0);
        super.C82(r2);
        C91104f9 r0 = this.A0F;
        if (r0 == null) {
            C18070vi.A11("callLogActivityActionMode");
            throw null;
        } else {
            C72473Md.A0o(r0.A01);
        }
    }

    public void CBt(String str) {
        C18070vi.A0d(str, 0);
        if (str.equals("calllog/dialog-add-contact")) {
            A0c(true);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        boolean z = true;
        if (i == 1 || i == 2) {
            if (i2 != -1) {
                z = false;
            }
            A0d(z);
            return;
        }
        super.onActivityResult(i, i2, intent);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        C18070vi.A0d(menu, 0);
        AnonymousClass4X3 r3 = this.A0X;
        if (r3 == null) {
            C18070vi.A11("callLogActivityMenuOptions");
            throw null;
        }
        C18100vl r1 = this.A0a;
        boolean A0d = C22971Dz.A0d(((CallLogActivityViewModel) r1.getValue()).A0F);
        boolean z = ((CallLogActivityViewModel) r1.getValue()).A0b;
        if (!z) {
            menu.add(0, 2131432598, 0, 2131892000).setIcon(2131233235).setAlphabeticShortcut('n').setShowAsAction(2);
        }
        menu.add(0, 2131432537, 0, 2131888327).setIcon(2131231847);
        if (A0d) {
            if ((!r3.A00.A0N()) && !z) {
                menu.add(0, 2131432524, 0, 2131898687);
            }
            menu.add(0, 2131432645, 0, 2131897273);
            menu.add(0, 2131432532, 0, 2131887168);
        }
        C40811vJ.A0B(r3.A05);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        C18090vk r0;
        AnonymousClass1BI r02;
        C18070vi.A0d(menuItem, 0);
        AnonymousClass4X3 r2 = this.A0X;
        if (r2 == null) {
            C18070vi.A11("callLogActivityMenuOptions");
            throw null;
        }
        AnonymousClass1E7 r5 = (AnonymousClass1E7) AnonymousClass3MY.A0R(this).A0V.getValue();
        int itemId = menuItem.getItemId();
        if (itemId == 16908332) {
            r0 = r2.A0A;
        } else if (itemId == 2131432537) {
            r0 = r2.A0C;
        } else if (itemId == 2131432598) {
            if (r5 == null) {
                return true;
            }
            AnonymousClass1BI r7 = r5.A0J;
            if (r7 == null) {
                Log.w("CallLogActivityMenuOptions/navigateToConversation/Cannot navigate to null Jid");
                return true;
            }
            AnonymousClass00H r1 = r2.A07;
            if (!AnonymousClass3MW.A0Y(r1).A0L() || !AnonymousClass3MW.A0Y(r1).A0M(r7)) {
                AnonymousClass4X3.A00(r2, r7);
                return true;
            }
            AnonymousClass3MW.A0Y(r1).A0A(r2.A01, new C76873oZ(r7, true), new C93774jW(r2, r5, r7), 5);
            return true;
        } else if (itemId == 2131432524) {
            r0 = r2.A09;
        } else if (itemId == 2131432645) {
            C37551pj r12 = r2.A02;
            AnonymousClass1FY r03 = r2.A01;
            if (r5 != null) {
                r12.A0H(r03, r5, "call_log_block", true);
                return true;
            }
            throw AnonymousClass000.A0k("Required value was null.");
        } else {
            boolean z = false;
            if (itemId == 2131432532) {
                if (r5 != null && r5.A0C()) {
                    z = true;
                }
                C22941Dw r04 = UserJid.Companion;
                if (r5 != null) {
                    r02 = r5.A0J;
                } else {
                    r02 = null;
                }
                UserJid A012 = C22941Dw.A01(r02);
                if (A012 == null) {
                    throw AnonymousClass000.A0n("Required value was null.");
                } else if (z) {
                    AnonymousClass1FY r52 = r2.A01;
                    r2.A08.get();
                    r52.startActivity(AnonymousClass1LU.A1E(r52, A012, "biz_call_log_block", true, C18020vd.A05(C18040vf.A02, r2.A05, 6185), false, false));
                    return true;
                } else {
                    AnonymousClass4SO BGI = r2.A03.BGI(A012, "call_log_block");
                    BGI.A05 = true;
                    BGI.A04 = true;
                    r2.A01.CMl(C123736Vq.A00(BGI.A00()));
                    return true;
                }
            } else if (itemId != 2131432534) {
                return false;
            } else {
                r0 = r2.A0B;
            }
        }
        r0.invoke();
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0062, code lost:
        if (r2 == false) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0040, code lost:
        if (r4.A0B() == false) goto L_0x0042;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPrepareOptionsMenu(android.view.Menu r7) {
        /*
            r6 = this;
            r0 = 0
            X.C18070vi.A0d(r7, r0)
            X.4X3 r5 = r6.A0X
            if (r5 != 0) goto L_0x000f
            java.lang.String r0 = "callLogActivityMenuOptions"
            X.C18070vi.A11(r0)
            r0 = 0
            throw r0
        L_0x000f:
            X.0vl r1 = r6.A0a
            java.lang.Object r0 = r1.getValue()
            com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel r0 = (com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel) r0
            X.1G4 r0 = r0.A0V
            java.lang.Object r4 = r0.getValue()
            X.1E7 r4 = (X.AnonymousClass1E7) r4
            java.lang.Object r0 = r1.getValue()
            com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel r0 = (com.whatsapp.calling.callhistory.calllog.CallLogActivityViewModel) r0
            boolean r1 = r0.A0V()
            r0 = 2131432537(0x7f0b1459, float:1.8486834E38)
            X.C72453Mb.A19(r7, r0, r1)
            r0 = 2131432524(0x7f0b144c, float:1.8486808E38)
            android.view.MenuItem r2 = r7.findItem(r0)
            r3 = 0
            if (r2 == 0) goto L_0x0046
            if (r4 == 0) goto L_0x0042
            boolean r1 = r4.A0B()
            r0 = 0
            if (r1 != 0) goto L_0x0043
        L_0x0042:
            r0 = 1
        L_0x0043:
            r2.setVisible(r0)
        L_0x0046:
            X.1pj r1 = r5.A02
            X.1Dw r0 = com.whatsapp.jid.UserJid.Companion
            if (r4 == 0) goto L_0x007b
            X.1BI r0 = r4.A0J
        L_0x004e:
            com.whatsapp.jid.UserJid r0 = X.C22941Dw.A01(r0)
            boolean r2 = r1.A0P(r0)
            r0 = 2131432645(0x7f0b14c5, float:1.8487053E38)
            android.view.MenuItem r1 = r7.findItem(r0)
            if (r1 == 0) goto L_0x0068
            if (r4 == 0) goto L_0x0064
            r0 = 1
            if (r2 != 0) goto L_0x0065
        L_0x0064:
            r0 = 0
        L_0x0065:
            r1.setVisible(r0)
        L_0x0068:
            r0 = 2131432532(0x7f0b1454, float:1.8486824E38)
            android.view.MenuItem r0 = r7.findItem(r0)
            if (r0 == 0) goto L_0x0079
            if (r4 == 0) goto L_0x0076
            if (r2 != 0) goto L_0x0076
            r3 = 1
        L_0x0076:
            r0.setVisible(r3)
        L_0x0079:
            r0 = 1
            return r0
        L_0x007b:
            r0 = 0
            goto L_0x004e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.calling.callhistory.calllog.CallLogActivityV2.onPrepareOptionsMenu(android.view.Menu):boolean");
    }

    public static final void A0Q(CallLogActivityV2 callLogActivityV2) {
        AnonymousClass00H r0 = callLogActivityV2.A0R;
        if (r0 != null) {
            C18100vl r4 = callLogActivityV2.A0a;
            Integer num = ((CallLogActivityViewModel) r4.getValue()).A0N;
            Integer A0g = AnonymousClass3MY.A0g();
            Boolean bool = ((CallLogActivityViewModel) r4.getValue()).A0M;
            C36321nh r02 = GroupJid.Companion;
            ((C192619oh) r0.get()).A01(C36321nh.A00(((CallLogActivityViewModel) r4.getValue()).A0F), bool, num, A0g);
            callLogActivityV2.finish();
            return;
        }
        C18070vi.A11("callInfoJourneyLoggerLazy");
        throw null;
    }

    private final void A0c(boolean z) {
        IllegalArgumentException illegalArgumentException;
        Object value = AnonymousClass3MY.A0R(this).A0V.getValue();
        if (value != null) {
            AnonymousClass1E7 r12 = (AnonymousClass1E7) value;
            AnonymousClass00H r0 = this.A0Q;
            if (r0 != null) {
                C36451nu r6 = (C36451nu) r0.get();
                boolean z2 = z;
                if (!z || !AnonymousClass3Ma.A1Y(r6)) {
                    try {
                        AnonymousClass1BI r02 = r12.A0J;
                        if (r02 != null) {
                            startActivityForResult(r6.A02(r12, r02, z2), C72453Mb.A04(z2 ? 1 : 0));
                        } else {
                            illegalArgumentException = AnonymousClass000.A0k("Required value was null.");
                            throw illegalArgumentException;
                        }
                    } catch (ActivityNotFoundException | SecurityException e) {
                        Log.w("calllog/opt system contact list could not found", e);
                        CMx((Integer) null, 2131886448, 2131899286, (Integer) null, (Integer) null, "calllog/dialog-activity-not-found", (String) null, (Object[]) null);
                        return;
                    }
                } else {
                    AnonymousClass1GP supportFragmentManager = getSupportFragmentManager();
                    AnonymousClass1BI r13 = r12.A0J;
                    if (r13 != null) {
                        C219217x r10 = this.A0N;
                        if (r10 != null) {
                            C30191dX r9 = this.A0J;
                            if (r9 != null) {
                                r6.A05(this, supportFragmentManager, r9, r10, this.A0A, r12, r13);
                                getSupportFragmentManager().A0t(new C91374fa(this, 2), this, "request_bottom_sheet_fragment");
                            } else {
                                C18070vi.A11("contactAccessHelper");
                            }
                        } else {
                            C18070vi.A11("waPermissionsHelper");
                        }
                        illegalArgumentException = null;
                        throw illegalArgumentException;
                    }
                    illegalArgumentException = AnonymousClass000.A0k("Required value was null.");
                    throw illegalArgumentException;
                }
                AnonymousClass00H r03 = this.A0P;
                if (r03 != null) {
                    AnonymousClass3MW.A0m(r03).A06(z2, 1);
                    return;
                }
                C18070vi.A11("addContactLogUtilLazy");
                illegalArgumentException = null;
                throw illegalArgumentException;
            }
            C18070vi.A11("addToContactsUtilLazy");
            throw null;
        }
        throw AnonymousClass000.A0k("Required value was null.");
    }

    private final void A0d(boolean z) {
        String str;
        if (z) {
            AnonymousClass00H r0 = this.A0T;
            if (r0 != null) {
                ((AnonymousClass12E) r0.get()).A0D((Integer) null);
            } else {
                str = "contactSyncMethodsLazy";
                C18070vi.A11(str);
                throw null;
            }
        }
        AnonymousClass00H r02 = this.A0P;
        if (r02 != null) {
            C72453Mb.A1O(r02);
            return;
        }
        str = "addContactLogUtilLazy";
        C18070vi.A11(str);
        throw null;
    }

    public void A2y() {
        if (!this.A0Z) {
            this.A0Z = true;
            AnonymousClass1K1 A0K2 = C72473Md.A0K(this);
            AnonymousClass10E r1 = A0K2.AAQ;
            C72483Me.A0q(r1, this);
            AnonymousClass10G r2 = r1.A00;
            AnonymousClass1FB.A0K(r1, r2, this, r2.A45);
            AnonymousClass1FB.A0L(r1, r2, this, r2.A5A);
            this.A02 = (C84504Jt) A0K2.A3p.get();
            this.A0P = C000200d.A00(r1.A0F);
            this.A0Q = C000200d.A00(r1.A0G);
            this.A0R = C000200d.A00(r2.A0p);
            this.A03 = (C84514Ju) A0K2.A3r.get();
            this.A04 = (C84524Jv) A0K2.A3s.get();
            this.A05 = (C84534Jw) A0K2.A3t.get();
            this.A0S = C000200d.A00(r1.A1k);
            this.A0H = AnonymousClass3MZ.A0W(r1);
            this.A0J = (C30191dX) r1.A2b.get();
            this.A0K = AnonymousClass3MZ.A0e(r1);
            this.A0L = AnonymousClass3MZ.A0i(r1);
            this.A0T = C000200d.A00(r1.A2k);
            this.A0U = C000200d.A00(r1.A72);
            this.A0V = AnonymousClass3MX.A11(r1);
            this.A09 = AnonymousClass3MZ.A0T(r2);
            this.A0B = C72453Mb.A0d(r1);
            this.A0I = (C195199sx) r1.ABV.get();
            this.A0W = AnonymousClass3MW.A0s(r1);
            this.A0N = AnonymousClass3Ma.A0b(r1);
        }
    }

    public void A3K() {
        AnonymousClass00H r0 = this.A0V;
        if (r0 != null) {
            C18100vl r02 = C30361do.A0C;
            ((C30361do) C18070vi.A0E(r0)).A02((AnonymousClass1BI) null, 15);
            return;
        }
        C18070vi.A11("navigationTimeSpentManagerLazy");
        throw null;
    }

    public void onCreate(Bundle bundle) {
        List list;
        List list2;
        C89444cT r1;
        AnonymousClass1OX A002;
        AnonymousClass1OS callLogActivityViewModel$retrieveContactInfoForAdhocCalls$1$1;
        super.onCreate(bundle);
        Integer num = AnonymousClass00R.A01;
        C18100vl A003 = AnonymousClass1DF.A00(num, new AnonymousClass5PO(this, "is_call_info_optimized"));
        C18100vl A004 = AnonymousClass1DF.A00(num, new AnonymousClass5PR(this, "jid"));
        ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("calls");
        if (parcelableArrayListExtra != null) {
            list = C29431cG.A0q(parcelableArrayListExtra);
        } else {
            list = null;
        }
        if (A004.getValue() == null && list == null) {
            Log.e("CallLogActivityV2/onCreate jid and callLogKeys are null");
            finish();
            return;
        }
        AnonymousClass1BI A022 = AnonymousClass1BI.A00.A02(AnonymousClass3MW.A0y(A004));
        C003401n supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.A0W(true);
            setTitle(2131887628);
            if (C72453Mb.A1a(A003)) {
                setContentView(2131624443);
                this.A0O = (WDSActionTileGroup) AnonymousClass3MY.A0C(this, 2131428701);
                this.A08 = (TextEmojiLabel) AnonymousClass3MY.A0C(this, 2131429562);
            } else {
                setContentView(2131624442);
                this.A0C = (WaImageButton) AnonymousClass3MY.A0C(this, 2131428646);
                this.A0D = (WaImageButton) AnonymousClass3MY.A0C(this, 2131436740);
                this.A07 = (TextEmojiLabel) AnonymousClass3MY.A0C(this, 2131429560);
            }
            this.A0M = (MultiContactThumbnail) AnonymousClass3MY.A0C(this, 2131433801);
            C72043Kk r4 = this.A09;
            if (r4 != null) {
                this.A0A = r4.BGE(this, (TextEmojiLabel) findViewById(2131429556));
                this.A06 = (TextEmojiLabel) AnonymousClass3MY.A0C(this, 2131429556);
                if (!AnonymousClass1J8.A09(this.A0E)) {
                    C42141xh r2 = this.A0A;
                    if (r2 == null) {
                        C18070vi.A11("contactNameViewController");
                        throw null;
                    }
                    C43421zm.A04(r2.A01);
                }
                this.A01 = (RecyclerView) AnonymousClass3MY.A0H(this, 2131432215);
                C84504Jt r9 = this.A02;
                if (r9 != null) {
                    C18100vl r11 = this.A0a;
                    C100995An r6 = new C100995An(r11.getValue(), 1);
                    C100985Am A16 = AnonymousClass3MW.A16(r11.getValue(), 2);
                    C101005Aq r5 = new C101005Aq(r11.getValue());
                    C100995An r42 = new C100995An(r11.getValue(), 2);
                    AnonymousClass10E r8 = r9.A00.A01;
                    AnonymousClass3WG r13 = new AnonymousClass3WG(C000500i.A00(r8.Ao9), this, AnonymousClass3MZ.A0e(r8), (C94214kE) this.A0c.getValue(), AnonymousClass10E.A6Q(r8), AnonymousClass10E.A8r(r8), C000200d.A00(r8.A2j), A16, r6, r42, r5);
                    this.A0G = r13;
                    RecyclerView recyclerView = this.A01;
                    if (recyclerView == null) {
                        C18070vi.A11("recyclerView");
                        throw null;
                    }
                    recyclerView.setAdapter(r13);
                    RecyclerView recyclerView2 = this.A01;
                    if (recyclerView2 == null) {
                        C18070vi.A11("recyclerView");
                        throw null;
                    }
                    recyclerView2.A0r(new AnonymousClass3XR(getResources().getDimensionPixelSize(2131165662)));
                    C84534Jw r43 = this.A05;
                    if (r43 != null) {
                        if (A022 != null) {
                            list2 = C18070vi.A0M(A022);
                        } else {
                            list2 = C18460wS.A00;
                        }
                        AnonymousClass10E r44 = r43.A00.A01;
                        C87774Wx r62 = new C87774Wx(AnonymousClass3Ma.A0S(r44), AnonymousClass3MY.A0Y(r44), list2);
                        this.A0Y = r62;
                        r62.A00 = new AnonymousClass5CS(this);
                        r62.A04.registerObserver(r62.A03);
                        r62.A02.registerObserver(r62.A01);
                        C84514Ju r92 = this.A03;
                        if (r92 != null) {
                            AnonymousClass5Af r82 = new AnonymousClass5Af(this, 4);
                            AnonymousClass5Af r7 = new AnonymousClass5Af(this, 5);
                            AnonymousClass5Af r63 = new AnonymousClass5Af(this, 6);
                            AnonymousClass5Af r52 = new AnonymousClass5Af(this, 7);
                            AnonymousClass10E r45 = r92.A00.A01;
                            C18030ve A8r = AnonymousClass10E.A8r(r45);
                            this.A0F = new C91104f9(this, (C24521Kq) r45.ABc.get(), AnonymousClass10E.A6Q(r45), A8r, r82, r7, r63, r52);
                            C84524Jv r46 = this.A04;
                            if (r46 != null) {
                                AnonymousClass5Af r10 = new AnonymousClass5Af(this, 0);
                                AnonymousClass5Af r83 = new AnonymousClass5Af(this, 1);
                                AnonymousClass5Af r64 = new AnonymousClass5Af(this, 2);
                                AnonymousClass5Af r53 = new AnonymousClass5Af(this, 3);
                                AnonymousClass1K2 r3 = r46.A00;
                                AnonymousClass10E r93 = r3.A01;
                                AnonymousClass00H A005 = C000200d.A00(r93.A0E);
                                C18030ve A8r2 = AnonymousClass10E.A8r(r93);
                                AnonymousClass00H A006 = C000200d.A00(r93.A25);
                                AnonymousClass00H A007 = C000200d.A00(r93.A24);
                                this.A0X = new AnonymousClass4X3(AnonymousClass10E.A17(r93), this, (C37551pj) r93.A0x.get(), (C36931oh) r3.A00.A3o.get(), (C24521Kq) r93.ABc.get(), A8r2, A005, A006, A007, AnonymousClass3MW.A0s(r93), r10, r83, r64, r53);
                                Integer A0w = AnonymousClass3MW.A0w(AnonymousClass1OR.A00, new CallLogActivityV2$initObservables$1(this, (C30391dr) null), AnonymousClass3MZ.A0H(this));
                                AnonymousClass3MY.A1K(this, ((CallLogActivityViewModel) r11.getValue()).A01, new C105045Qm(this), 18);
                                CallLogActivityViewModel callLogActivityViewModel = (CallLogActivityViewModel) r11.getValue();
                                AnonymousClass1OX A008 = C41561wd.A00(callLogActivityViewModel);
                                C18600wl r47 = callLogActivityViewModel.A0R;
                                if (list == null) {
                                    C30451dy.A02(A0w, r47, new CallLogActivityViewModel$retrieveCallLogs$1(callLogActivityViewModel, (C30391dr) null), A008);
                                } else {
                                    C30451dy.A02(A0w, r47, new CallLogActivityViewModel$retrieveCallLogsWithKeys$1(callLogActivityViewModel, list, (C30391dr) null), A008);
                                }
                                if (A004.getValue() != null) {
                                    A002 = C41561wd.A00(callLogActivityViewModel);
                                    callLogActivityViewModel$retrieveContactInfoForAdhocCalls$1$1 = new CallLogActivityViewModel$retrieveContactInfo$1(callLogActivityViewModel, (C30391dr) null);
                                } else {
                                    if (!(list == null || (r1 = (C89444cT) C29431cG.A0c(list)) == null)) {
                                        A002 = C41561wd.A00(callLogActivityViewModel);
                                        callLogActivityViewModel$retrieveContactInfoForAdhocCalls$1$1 = new CallLogActivityViewModel$retrieveContactInfoForAdhocCalls$1$1(callLogActivityViewModel, r1, (C30391dr) null);
                                    }
                                    BVe().A09(new C73173Rg(this, 0), this);
                                    A39(this.A00, this.A05);
                                    return;
                                }
                                C30451dy.A02(A0w, r47, callLogActivityViewModel$retrieveContactInfoForAdhocCalls$1$1, A002);
                                BVe().A09(new C73173Rg(this, 0), this);
                                A39(this.A00, this.A05);
                                return;
                            }
                            C18070vi.A11("callLogActivityMenuOptionsFactory");
                            throw null;
                        }
                        C18070vi.A11("callLogActivityActionModeFactory");
                        throw null;
                    }
                    C18070vi.A11("callLogActivityObserversFactory");
                    throw null;
                }
                C18070vi.A11("adapterFactory");
                throw null;
            }
            C18070vi.A11("textEmojiLabelViewControllerFactory");
            throw null;
        }
        throw C17880vN.A0g();
    }

    public static final void A03(Bundle bundle, CallLogActivityV2 callLogActivityV2, String str) {
        C18070vi.A0j(str, bundle);
        if (str.equals("request_bottom_sheet_fragment")) {
            callLogActivityV2.A0d(bundle.getBoolean("is_contact_saved"));
        }
        callLogActivityV2.getSupportFragmentManager().A0u("request_bottom_sheet_fragment");
    }

    public C222219b A33() {
        C222219b A33 = super.A33();
        C72483Me.A10(A33, this);
        return A33;
    }

    public void onDestroy() {
        super.onDestroy();
        C87774Wx r2 = this.A0Y;
        if (r2 == null) {
            C18070vi.A11("callLogActivityObservers");
            throw null;
        }
        r2.A04.unregisterObserver(r2.A03);
        r2.A02.unregisterObserver(r2.A01);
    }

    public CallLogActivityV2(int i) {
        this.A0Z = false;
        C90994ey.A00(this, 25);
    }
}
