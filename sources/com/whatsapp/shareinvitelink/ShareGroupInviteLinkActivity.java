package com.whatsapp.shareinvitelink;

import X.AnonymousClass000;
import X.AnonymousClass001;
import X.AnonymousClass00H;
import X.AnonymousClass00R;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass11C;
import X.AnonymousClass126;
import X.AnonymousClass18K;
import X.AnonymousClass1EC;
import X.AnonymousClass1FB;
import X.AnonymousClass1K1;
import X.AnonymousClass1PU;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass5YZ;
import X.AnonymousClass62O;
import X.AnonymousClass687;
import X.AnonymousClass6ZS;
import X.AnonymousClass6ZZ;
import X.AnonymousClass6nW;
import X.AnonymousClass7AP;
import X.BGK;
import X.C000200d;
import X.C107515Zz;
import X.C108955ca;
import X.C109005cf;
import X.C109305dA;
import X.C114705rq;
import X.C114715rr;
import X.C114725rs;
import X.C126386ce;
import X.C1423279a;
import X.C146527Pl;
import X.C17880vN;
import X.C17890vO;
import X.C17900vP;
import X.C17960vV;
import X.C24262ByL;
import X.C25912CoW;
import X.C29831cw;
import X.C2V;
import X.C36401np;
import X.C72453Mb;
import X.C73283Tl;
import X.C820341t;
import X.C83834Gv;
import X.C84064Hs;
import X.C85894Pd;
import X.C89974dK;
import X.C98844ro;
import X.CWH;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.PorterDuff;
import android.nfc.NfcAdapter;
import android.os.Bundle;
import android.print.PrintAttributes;
import android.print.PrintManager;
import android.text.TextUtils;
import android.view.Menu;
import android.view.MenuItem;
import com.whatsapp.TextEmojiLabel;
import com.whatsapp.util.Log;
import java.util.EnumMap;

public class ShareGroupInviteLinkActivity extends AnonymousClass687 implements AnonymousClass5YZ, C107515Zz {
    public C85894Pd A00;
    public AnonymousClass6ZZ A01;
    public TextEmojiLabel A02;
    public AnonymousClass18K A03;
    public AnonymousClass126 A04;
    public AnonymousClass1EC A05;
    public AnonymousClass1PU A06;
    public C36401np A07;
    public AnonymousClass00H A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public AnonymousClass6nW A0C;
    public AnonymousClass6nW A0D;
    public C114705rq A0E;
    public C114725rs A0F;
    public C114715rr A0G;
    public C73283Tl A0H;
    public boolean A0I;
    public final BroadcastReceiver A0J;
    public final C126386ce A0K;

    public void Bwi(int i, String str, boolean z) {
        A0c(true);
        A2v(false);
        StringBuilder A10 = AnonymousClass000.A10();
        if (str != null) {
            A10.append("invitelink/gotcode/");
            A10.append(str);
            C17900vP.A0n(" recreate:", A10, z);
            AnonymousClass126 r0 = this.A04;
            r0.A1E.put(this.A05, str);
            A0V(this, str);
            if (z) {
                BhQ(2131895302);
                return;
            }
            return;
        }
        C17900vP.A0j("invitelink/failed/", A10, i);
        if (i == 436) {
            CMl(C83834Gv.A00(true, true));
            AnonymousClass126 r02 = this.A04;
            r02.A1E.remove(this.A05);
            A0V(this, (String) null);
            return;
        }
        this.A05.A08(C84064Hs.A00(i, this.A06.A03(this.A05)), 0);
        if (TextUtils.isEmpty(this.A0A)) {
            finish();
        }
    }

    public void CG6() {
        C17900vP.A0n("invitelink/sendgetlink/recreate:", AnonymousClass000.A10(), true);
        A0c(false);
        A2v(true);
        C820341t A002 = this.A00.A00(this, true);
        AnonymousClass1EC r0 = this.A05;
        C17960vV.A07(r0);
        A002.A06(r0);
    }

    public static void A0Q(ShareGroupInviteLinkActivity shareGroupInviteLinkActivity, Integer num) {
        AnonymousClass62O r2 = new AnonymousClass62O();
        r2.A00 = num;
        r2.A01 = Integer.valueOf(shareGroupInviteLinkActivity.A06.A00(shareGroupInviteLinkActivity.A05));
        shareGroupInviteLinkActivity.A03.CC7(r2);
    }

    public static void A0V(ShareGroupInviteLinkActivity shareGroupInviteLinkActivity, String str) {
        String A1H;
        shareGroupInviteLinkActivity.A0A = str;
        if (TextUtils.isEmpty(str)) {
            A1H = null;
        } else {
            A1H = AnonymousClass001.A1H("https://chat.whatsapp.com/", str, AnonymousClass000.A10());
        }
        if (!TextUtils.isEmpty(str)) {
            shareGroupInviteLinkActivity.A01.setText(A1H);
            int i = 2131896089;
            if (shareGroupInviteLinkActivity.A06.A03(shareGroupInviteLinkActivity.A05)) {
                i = 2131896090;
            }
            String A0R = C17890vO.A0R(shareGroupInviteLinkActivity, A1H, 1, 0, i);
            C114725rs r3 = shareGroupInviteLinkActivity.A0F;
            r3.A02 = A0R;
            r3.A01 = C17880vN.A0q(shareGroupInviteLinkActivity, shareGroupInviteLinkActivity.A09, new Object[1], 0, 2131896092);
            shareGroupInviteLinkActivity.A0F.A00 = shareGroupInviteLinkActivity.getString(2131896094);
            shareGroupInviteLinkActivity.A0G.A00 = A0R;
            shareGroupInviteLinkActivity.A0E.A00 = A1H;
            return;
        }
        shareGroupInviteLinkActivity.A0c(false);
        shareGroupInviteLinkActivity.A01.setText(" \n ");
    }

    private void A0c(boolean z) {
        this.A01.setEnabled(z);
        this.A0E.A00.setEnabled(z);
        this.A0D.A00.setEnabled(z);
        this.A0F.A00.setEnabled(z);
        this.A0C.A00.setEnabled(z);
        this.A0G.A00.setEnabled(z);
    }

    public void A2y() {
        if (!this.A0I) {
            this.A0I = true;
            AnonymousClass1K1 A0K2 = C108955ca.A0K(this);
            AnonymousClass10E A0A2 = C109005cf.A0A(A0K2, this);
            AnonymousClass1FB.A0M(A0A2, this);
            AnonymousClass10G r2 = A0A2.A00;
            C109005cf.A0d(A0A2, r2, this);
            C109005cf.A0e(A0A2, r2, this, r2.A5A);
            this.A02 = AnonymousClass3MY.A0Z(A0A2);
            this.A03 = AnonymousClass3MZ.A0e(A0A2);
            this.A01 = (AnonymousClass6ZS) A0K2.A2s.get();
            this.A03 = AnonymousClass3Ma.A0g(A0A2);
            this.A06 = AnonymousClass3MZ.A12(A0A2);
            this.A04 = (AnonymousClass126) A0A2.A4h.get();
            this.A08 = C000200d.A00(A0A2.A9c);
            this.A07 = AnonymousClass3MY.A0e(r2);
            this.A01 = (AnonymousClass6ZZ) A0K2.A3V.get();
            this.A00 = (C85894Pd) A0K2.A3P.get();
        }
    }

    public ShareGroupInviteLinkActivity(int i) {
        this.A0I = false;
        C1423279a.A00(this, 39);
    }

    /* JADX WARNING: type inference failed for: r2v3, types: [X.6nW, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r1v7, types: [X.6nW, java.lang.Object] */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AnonymousClass1EC A022 = AnonymousClass1EC.A01.A02(C72453Mb.A0u(this));
        C17960vV.A07(A022);
        this.A05 = A022;
        int i = 2131896093;
        if (this.A06.A03(A022)) {
            i = 2131896076;
        }
        setTitle(i);
        A4f();
        C114715rr A4e = A4e();
        this.A0G = A4e;
        A4e.A04 = new C146527Pl(this, C17880vN.A0k(), 35);
        C114705rq A4c = A4c();
        this.A0E = A4c;
        A4c.A04 = new C146527Pl(this, 1, 35);
        C114725rs A4d = A4d();
        this.A0F = A4d;
        A4d.A04 = new C146527Pl(this, C17880vN.A0j(), 35);
        C89974dK r3 = new C89974dK(this, 29);
        ? obj = new Object();
        obj.A00 = A4b();
        obj.A00(r3, getString(2131895996), 2131232231);
        this.A0C = obj;
        obj.A00.setVisibility(0);
        ? obj2 = new Object();
        this.A0D = obj2;
        obj2.A00 = A4b();
        this.A0D.A00(new C89974dK(this, 30), getString(2131895348), 2131233278);
        this.A0D.A01.setColorFilter(getResources().getColor(2131103172), PorterDuff.Mode.SRC_ATOP);
        this.A0D.A02.setTextColor(getResources().getColor(2131103172));
        AnonymousClass6ZZ r0 = this.A01;
        AnonymousClass1EC r5 = this.A05;
        AnonymousClass10E r02 = r0.A00.A01;
        this.A0H = new C73283Tl(AnonymousClass10E.A4z(r02), r5, AnonymousClass10E.AL1(r02));
        this.A02 = (TextEmojiLabel) findViewById(2131435368);
        boolean A032 = this.A06.A03(this.A05);
        TextEmojiLabel textEmojiLabel = this.A02;
        if (A032) {
            textEmojiLabel.setText(2131891475);
        } else {
            AnonymousClass3Ma.A1L(this.A0E, textEmojiLabel);
            this.A0B = true;
        }
        C17900vP.A0n("invitelink/sendgetlink/recreate:", AnonymousClass000.A10(), false);
        C820341t A002 = this.A00.A00(this, false);
        AnonymousClass1EC r03 = this.A05;
        C17960vV.A07(r03);
        A002.A06(r03);
        ((C29831cw) this.A08.get()).A01(this, this.A0J, new IntentFilter("android.nfc.action.ADAPTER_STATE_CHANGED"), true);
        AnonymousClass126 r04 = this.A04;
        r04.A0Y.registerObserver(this.A0K);
        AnonymousClass7AP.A00(this, this.A0H.A00, 14);
        AnonymousClass7AP.A00(this, this.A0H.A01, 15);
        AnonymousClass7AP.A00(this, this.A0H.A04, 16);
        A4i(this.A05);
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        if (NfcAdapter.getDefaultAdapter(this) != null) {
            menu.add(0, 2131432659, 0, 2131898586);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        super.onDestroy();
        ((C29831cw) this.A08.get()).A02(this.A0J, this);
        AnonymousClass126 r0 = this.A04;
        r0.A0Y.unregisterObserver(this.A0K);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        String str;
        int itemId = menuItem.getItemId();
        if (itemId == 2131432613) {
            StringBuilder A10 = AnonymousClass000.A10();
            A10.append("invitelink/printlink/");
            A10.append(this.A0A);
            A10.append(" jid:");
            C17900vP.A0b(this.A05, A10);
            if (!(this.A05 == null || this.A0A == null)) {
                try {
                    EnumMap enumMap = new EnumMap(C24262ByL.class);
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("whatsapp://chat?code=");
                    CWH cwh = C25912CoW.A00(AnonymousClass00R.A01, AnonymousClass000.A0y(this.A0A, A102), enumMap).A03;
                    String A0q = C17880vN.A0q(this, this.A09, new Object[1], 0, 2131896091);
                    PrintManager printManager = (PrintManager) AnonymousClass11C.A02(this, "print");
                    if (printManager == null) {
                        Log.e("invitelink/print/no-print-manager");
                        return true;
                    }
                    printManager.print(A0q, new BGK(this, cwh, this.A0D, A0q), (PrintAttributes) null);
                    return true;
                } catch (C2V e) {
                    Log.i("invitelink/", e);
                    return true;
                }
            }
        } else if (itemId != 2131432659) {
            return super.onOptionsItemSelected(menuItem);
        } else {
            StringBuilder A103 = AnonymousClass000.A10();
            A103.append("invitelink/writetag/");
            A103.append(this.A0A);
            A103.append(" jid:");
            C17900vP.A0b(this.A05, A103);
            if (!(this.A05 == null || (str = this.A0A) == null)) {
                Intent A0A2 = C17880vN.A0A();
                A0A2.setClassName(getPackageName(), "com.whatsapp.writenfctag.WriteNfcTagActivity");
                A0A2.putExtra("mime", "application/com.whatsapp.join");
                A0A2.putExtra("data", str);
                startActivity(A0A2);
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r1 == false) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onPrepareOptionsMenu(android.view.Menu r4) {
        /*
            r3 = this;
            r0 = 2131432659(0x7f0b14d3, float:1.8487082E38)
            android.view.MenuItem r2 = r4.findItem(r0)
            if (r2 == 0) goto L_0x001a
            android.nfc.NfcAdapter r0 = android.nfc.NfcAdapter.getDefaultAdapter(r3)
            if (r0 == 0) goto L_0x0016
            boolean r1 = r0.isEnabled()
            r0 = 1
            if (r1 != 0) goto L_0x0017
        L_0x0016:
            r0 = 0
        L_0x0017:
            r2.setEnabled(r0)
        L_0x001a:
            boolean r0 = super.onPrepareOptionsMenu(r4)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.shareinvitelink.ShareGroupInviteLinkActivity.onPrepareOptionsMenu(android.view.Menu):boolean");
    }

    public void onResume() {
        super.onResume();
        A0V(this, C17880vN.A0s(this.A05, this.A04.A1E));
        if (this.A0B) {
            C73283Tl r3 = this.A0H;
            r3.A05.CGF(new C98844ro((Object) r3, 45));
        }
    }

    public ShareGroupInviteLinkActivity() {
        this(0);
        this.A0B = false;
        this.A09 = "";
        this.A0J = new C109305dA(this, 6);
        this.A0K = new C126386ce(this);
    }
}
