package com.whatsapp.settings;

import X.AnonymousClass000;
import X.AnonymousClass00H;
import X.AnonymousClass10E;
import X.AnonymousClass10G;
import X.AnonymousClass112;
import X.AnonymousClass11P;
import X.AnonymousClass11Q;
import X.AnonymousClass179;
import X.AnonymousClass18K;
import X.AnonymousClass1BI;
import X.AnonymousClass1FB;
import X.AnonymousClass1HF;
import X.AnonymousClass1J8;
import X.AnonymousClass1K1;
import X.AnonymousClass1M9;
import X.AnonymousClass1PS;
import X.AnonymousClass1QL;
import X.AnonymousClass1QO;
import X.AnonymousClass1QS;
import X.AnonymousClass1YE;
import X.AnonymousClass3MW;
import X.AnonymousClass3MX;
import X.AnonymousClass3MY;
import X.AnonymousClass3MZ;
import X.AnonymousClass3Ma;
import X.AnonymousClass46t;
import X.C000200d;
import X.C110885hR;
import X.C1604688p;
import X.C17880vN;
import X.C17890vO;
import X.C17960vV;
import X.C18000vb;
import X.C196199uc;
import X.C221618v;
import X.C23321Fo;
import X.C23581Gv;
import X.C24661Le;
import X.C24671Lf;
import X.C25491Ok;
import X.C26261Rl;
import X.C26281Rn;
import X.C27131Uv;
import X.C27641Ww;
import X.C30391dr;
import X.C31191fA;
import X.C35511mM;
import X.C37311pJ;
import X.C41561wd;
import X.C54882er;
import X.C58812lI;
import X.C62332rE;
import X.C72273Lh;
import X.C72453Mb;
import X.C72473Md;
import X.C72483Me;
import X.C81263yx;
import X.C87824Xf;
import X.C91034f2;
import X.C92144gp;
import X.C94174kA;
import X.C96774oO;
import X.C98844ro;
import android.content.Intent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.SwitchCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class SettingsPrivacy extends AnonymousClass46t implements C23321Fo {
    public int A00;
    public View A01;
    public View A02;
    public View A03;
    public View A04;
    public View A05;
    public View A06;
    public View A07;
    public View A08;
    public View A09;
    public View A0A;
    public View A0B;
    public View A0C;
    public View A0D;
    public ProgressBar A0E;
    public TextView A0F;
    public TextView A0G;
    public TextView A0H;
    public TextView A0I;
    public TextView A0J;
    public TextView A0K;
    public TextView A0L;
    public TextView A0M;
    public TextView A0N;
    public TextView A0O;
    public TextView A0P;
    public SwitchCompat A0Q;
    public SwitchCompat A0R;
    public C26261Rl A0S;
    public C31191fA A0T;
    public C24671Lf A0U;
    public C25491Ok A0V;
    public C37311pJ A0W;
    public AnonymousClass11Q A0X;
    public C24661Le A0Y;
    public C26281Rn A0Z;
    public AnonymousClass1PS A0a;
    public AnonymousClass18K A0b;
    public C27131Uv A0c;
    public AnonymousClass1QL A0d;
    public AnonymousClass1QO A0e;
    public AnonymousClass1QS A0f;
    public C62332rE A0g;
    public SettingsPrivacyCameraEffectsViewModel A0h;
    public SettingsRowPrivacyLinearLayout A0i;
    public C35511mM A0j;
    public AnonymousClass00H A0k;
    public AnonymousClass00H A0l;
    public AnonymousClass00H A0m;
    public AnonymousClass00H A0n;
    public AnonymousClass00H A0o;
    public AnonymousClass00H A0p;
    public AnonymousClass00H A0q;
    public AnonymousClass00H A0r;
    public AnonymousClass00H A0s;
    public AnonymousClass00H A0t;
    public AnonymousClass00H A0u;
    public AnonymousClass00H A0v;
    public AnonymousClass00H A0w;
    public AnonymousClass00H A0x;
    public AnonymousClass00H A0y;
    public String A0z;
    public boolean A10;
    public boolean A11;
    public final C1604688p A12;
    public final C23581Gv A13;
    public final Map A14;
    public final Set A15;
    public final C72273Lh A16;
    public volatile boolean A17;

    public SettingsPrivacy() {
        this(0);
        this.A0n = C221618v.A00(AnonymousClass179.class);
        this.A13 = new C94174kA(this, 9);
        this.A16 = new C96774oO(this, 3);
        this.A12 = new C92144gp(this, 0);
        this.A10 = false;
        this.A14 = C17880vN.A11();
        this.A15 = C17880vN.A12();
        this.A17 = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001e, code lost:
        r8 = ((X.AnonymousClass179) r10.A0n.get()).A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x002c, code lost:
        if (r8.containsKey(r11) == false) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        r0 = X.C17880vN.A0s(r11, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0032, code lost:
        if (r0 == null) goto L_0x0037;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0034, code lost:
        A0t(r10, r11, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0037, code lost:
        r3 = new X.AnonymousClass49L(r4, r5, r10, r7, r8, r9);
        r2 = r5.A00();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0045, code lost:
        if (r2.A02.A00 <= 0) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0047, code lost:
        r2.A09(r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004a, code lost:
        r2.A0A(r10, new X.C91514fo(r3, r2, r10, 11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0096, code lost:
        r5 = (X.C60112nP) r0.get();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x009e, code lost:
        r2 = X.C63682tW.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00a1, code lost:
        if (r9 >= 3) goto L_0x00ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a3, code lost:
        A0t(r10, r11, getString(r2[r9]));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ac, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00ad, code lost:
        r1 = X.AnonymousClass000.A10();
        r1.append("Received privacy value ");
        r1.append(r9);
        X.C17890vO.A1B(r1, " with no available single-setting text");
        A0t(r10, r11, getString(r2[0]));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00c8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r5 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0010, code lost:
        r9 = r10.A0S.A00(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r9 == 3) goto L_0x001c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001a, code lost:
        if (r9 != 6) goto L_0x009e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001c, code lost:
        if (r5 == null) goto L_0x009e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0u(java.lang.String r11) {
        /*
            r10 = this;
            r4 = r10
            r7 = r11
            android.widget.TextView r0 = r10.A0V(r11)
            if (r0 == 0) goto L_0x0054
            int r0 = r11.hashCode()
            switch(r0) {
                case -892481550: goto L_0x008c;
                case -309425751: goto L_0x0081;
                case 111007: goto L_0x0076;
                case 3314326: goto L_0x006b;
                case 506363330: goto L_0x0060;
                case 1531715286: goto L_0x0055;
                default: goto L_0x000f;
            }
        L_0x000f:
            r5 = 0
        L_0x0010:
            X.1Rl r0 = r10.A0S
            int r9 = r0.A00(r11)
            r0 = 3
            if (r9 == r0) goto L_0x001c
            r0 = 6
            if (r9 != r0) goto L_0x009e
        L_0x001c:
            if (r5 == 0) goto L_0x009e
            X.00H r0 = r10.A0n
            java.lang.Object r0 = r0.get()
            X.179 r0 = (X.AnonymousClass179) r0
            java.util.Map r8 = r0.A00
            boolean r0 = r8.containsKey(r11)
            if (r0 == 0) goto L_0x0037
            java.lang.String r0 = X.C17880vN.A0s(r11, r8)
            if (r0 == 0) goto L_0x0037
            A0t(r10, r11, r0)
        L_0x0037:
            X.49L r3 = new X.49L
            r6 = r10
            r3.<init>(r4, r5, r6, r7, r8, r9)
            X.1wy r2 = r5.A00()
            X.00q r0 = r2.A02
            int r0 = r0.A00
            if (r0 <= 0) goto L_0x004a
            r2.A09(r10)
        L_0x004a:
            r1 = 11
            X.4fo r0 = new X.4fo
            r0.<init>(r3, r2, r10, r1)
            r2.A0A(r10, r0)
        L_0x0054:
            return
        L_0x0055:
            java.lang.String r0 = "stickers"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.00H r0 = r10.A0w
            goto L_0x0096
        L_0x0060:
            java.lang.String r0 = "groupadd"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.00H r0 = r10.A0p
            goto L_0x0096
        L_0x006b:
            java.lang.String r0 = "last"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.00H r0 = r10.A0r
            goto L_0x0096
        L_0x0076:
            java.lang.String r0 = "pix"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.00H r0 = r10.A0s
            goto L_0x0096
        L_0x0081:
            java.lang.String r0 = "profile"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.00H r0 = r10.A0u
            goto L_0x0096
        L_0x008c:
            java.lang.String r0 = "status"
            boolean r0 = r11.equals(r0)
            if (r0 == 0) goto L_0x000f
            X.00H r0 = r10.A0k
        L_0x0096:
            java.lang.Object r5 = r0.get()
            X.2nP r5 = (X.C60112nP) r5
            goto L_0x0010
        L_0x009e:
            int[] r2 = X.C63682tW.A00
            r0 = 3
            if (r9 >= r0) goto L_0x00ad
            r0 = r2[r9]
            java.lang.String r0 = r10.getString(r0)
            A0t(r10, r11, r0)
            return
        L_0x00ad:
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Received privacy value "
            r1.append(r0)
            r1.append(r9)
            java.lang.String r0 = " with no available single-setting text"
            X.C17890vO.A1B(r1, r0)
            r0 = 0
            r0 = r2[r0]
            java.lang.String r0 = r10.getString(r0)
            A0t(r10, r11, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsPrivacy.A0u(java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008a, code lost:
        r2 = X.C63682tW.A02(r3, java.lang.Math.max(0, r6));
        X.C62332rE.A00(r4.A0g, true);
        r4.A0S.A02(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x009e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000f, code lost:
        r2 = X.AnonymousClass000.A10();
        r2.append("Unrecognized preference: ");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001c, code lost:
        throw X.AnonymousClass001.A12(r1, r2);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C5k(int r5, int r6) {
        /*
            r4 = this;
            r0 = 2
            if (r5 == r0) goto L_0x009f
            r0 = 3
            if (r5 != r0) goto L_0x00a3
            java.lang.String r1 = "privacy_status"
        L_0x0008:
            int r0 = r1.hashCode()
            switch(r0) {
                case -1977700443: goto L_0x001d;
                case -1926138227: goto L_0x0028;
                case -1643403859: goto L_0x0033;
                case -1038662714: goto L_0x003e;
                case -385074228: goto L_0x0049;
                case 897320682: goto L_0x0054;
                case 1017061513: goto L_0x005f;
                case 1111967332: goto L_0x006a;
                case 1503723624: goto L_0x0075;
                case 1626211481: goto L_0x0080;
                default: goto L_0x000f;
            }
        L_0x000f:
            java.lang.StringBuilder r2 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Unrecognized preference: "
            r2.append(r0)
            java.lang.IllegalArgumentException r0 = X.AnonymousClass001.A12(r1, r2)
            throw r0
        L_0x001d:
            java.lang.String r0 = "privacy_profile_photo"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            java.lang.String r3 = "profile"
            goto L_0x008a
        L_0x0028:
            java.lang.String r0 = "privacy_last_seen"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            java.lang.String r3 = "last"
            goto L_0x008a
        L_0x0033:
            java.lang.String r0 = "privacy_stickers"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            java.lang.String r3 = "stickers"
            goto L_0x008a
        L_0x003e:
            java.lang.String r0 = "read_receipts_enabled"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            java.lang.String r3 = "readreceipts"
            goto L_0x008a
        L_0x0049:
            java.lang.String r0 = "privacy_calladd"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            java.lang.String r3 = "calladd"
            goto L_0x008a
        L_0x0054:
            java.lang.String r0 = "privacy_online"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            java.lang.String r3 = "online"
            goto L_0x008a
        L_0x005f:
            java.lang.String r0 = "privacy_status"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            java.lang.String r3 = "status"
            goto L_0x008a
        L_0x006a:
            java.lang.String r0 = "privacy_setting_messages_brigading"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            java.lang.String r3 = "messages"
            goto L_0x008a
        L_0x0075:
            java.lang.String r0 = "privacy_pix"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            java.lang.String r3 = "pix"
            goto L_0x008a
        L_0x0080:
            java.lang.String r0 = "privacy_groupadd"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x000f
            java.lang.String r3 = "groupadd"
        L_0x008a:
            r0 = 0
            int r0 = java.lang.Math.max(r0, r6)
            java.lang.String r2 = X.C63682tW.A02(r3, r0)
            X.2rE r1 = r4.A0g
            r0 = 1
            X.C62332rE.A00(r1, r0)
            X.1Rl r0 = r4.A0S
            r0.A02(r3, r2)
            return
        L_0x009f:
            java.lang.String r1 = "privacy_profile_photo"
            goto L_0x0008
        L_0x00a3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsPrivacy.C5k(int, int):void");
    }

    private View A0Q() {
        View view = this.A0A;
        if (view != null) {
            return view;
        }
        ViewStub A0H2 = AnonymousClass3MX.A0H(this, 2131434068);
        A0H2.setInflatedId(2131434067);
        int i = 2131626589;
        if (AnonymousClass1J8.A02(this.A0E)) {
            i = 2131626590;
        }
        View A0G2 = AnonymousClass3MY.A0G(A0H2, i);
        this.A0A = A0G2;
        return A0G2;
    }

    private String A0c(long j) {
        C18000vb r4;
        int i;
        Object[] objArr;
        long j2;
        if (j != 0) {
            if (j == 60000) {
                r4 = this.A00;
                i = 2131755019;
                objArr = new Object[1];
                C17880vN.A1T(objArr, 1, 0);
                j2 = 1;
            } else if (j == 1800000) {
                r4 = this.A00;
                i = 2131755019;
                objArr = new Object[1];
                C17880vN.A1T(objArr, 30, 0);
                j2 = 30;
            }
            return r4.A0K(objArr, i, j2);
        }
        return getString(2131886672);
    }

    public static void A0d(SettingsPrivacy settingsPrivacy) {
        String str;
        int i;
        C196199uc BPW;
        int size;
        if (settingsPrivacy.A0J != null) {
            if (!AnonymousClass3MW.A0V(settingsPrivacy.A0m).A0N() || !AnonymousClass3MW.A0V(settingsPrivacy.A0m).A0M.get()) {
                i = 2131887189;
            } else {
                int size2 = settingsPrivacy.A15.size();
                if (settingsPrivacy.A0e.A03() && settingsPrivacy.A0d.A0F() && (BPW = settingsPrivacy.A0f.A06().BPW()) != null && BPW.A03()) {
                    synchronized (BPW) {
                        size = BPW.A09.size();
                    }
                    size2 += size;
                }
                if (size2 > 0) {
                    str = String.valueOf(size2);
                    settingsPrivacy.A0J.setText(str);
                }
                i = 2131892980;
            }
            str = settingsPrivacy.getString(i);
            settingsPrivacy.A0J.setText(str);
        }
    }

    public static void A0q(SettingsPrivacy settingsPrivacy) {
        ArrayList A112;
        String string;
        C27131Uv r9 = settingsPrivacy.A0c;
        synchronized (r9.A0U) {
            Map A062 = C27131Uv.A06(r9);
            A112 = C72453Mb.A11(A062);
            long A012 = AnonymousClass11P.A01(r9.A0D);
            Iterator A0l2 = C17890vO.A0l(A062);
            while (A0l2.hasNext()) {
                C54882er r5 = (C54882er) A0l2.next();
                if (C27131Uv.A0G(r5.A01, A012)) {
                    AnonymousClass1M9 r3 = r9.A0A;
                    AnonymousClass1BI r0 = r5.A02.A00;
                    C17960vV.A07(r0);
                    A112.add(r3.A0E(r0));
                }
            }
        }
        if (A112.size() > 0) {
            C18000vb r52 = settingsPrivacy.A00;
            long size = (long) A112.size();
            Object[] A1a = AnonymousClass3MW.A1a();
            AnonymousClass000.A1L(A1a, A112.size());
            string = r52.A0K(A1a, 2131755217, size);
        } else {
            string = settingsPrivacy.getString(2131891759);
        }
        TextView textView = settingsPrivacy.A0M;
        if (textView != null) {
            textView.setText(string);
        }
    }

    public static void A0s(SettingsPrivacy settingsPrivacy, Integer num, Integer num2) {
        C81263yx r1 = new C81263yx();
        r1.A00 = num2;
        r1.A01 = num;
        settingsPrivacy.A0b.CC4(r1);
    }

    public void A2y() {
        if (!this.A11) {
            this.A11 = true;
            AnonymousClass1K1 A0K2 = C72473Md.A0K(this);
            AnonymousClass10E r2 = A0K2.AAQ;
            C72483Me.A0q(r2, this);
            AnonymousClass10G r3 = r2.A00;
            AnonymousClass1FB.A0K(r2, r3, this, r3.A45);
            AnonymousClass1FB.A0L(r2, r3, this, r3.A5A);
            this.A0x = AnonymousClass3MW.A0s(r2);
            this.A0b = AnonymousClass3Ma.A0g(r2);
            this.A0Y = (C24661Le) r2.AAJ.get();
            this.A0T = AnonymousClass3MY.A0S(r2);
            this.A0f = AnonymousClass3MZ.A0z(r2);
            this.A0m = C000200d.A00(r2.A0x);
            this.A0U = AnonymousClass3Ma.A0S(r2);
            this.A0V = AnonymousClass3MZ.A0h(r2);
            this.A0g = (C62332rE) r2.A70.get();
            this.A0d = (AnonymousClass1QL) r2.A7z.get();
            this.A0k = C000200d.A00(A0K2.A00);
            this.A0e = AnonymousClass3Ma.A0q(r2);
            this.A0S = (C26261Rl) r2.A8j.get();
            this.A0c = (C27131Uv) r2.A5p.get();
            this.A0q = C000200d.A00(r2.A5T);
            this.A0s = C000200d.A00(A0K2.A5T);
            this.A0Z = (C26281Rn) r2.A3S.get();
            this.A0w = C000200d.A00(A0K2.A5s);
            this.A0p = C000200d.A00(r3.ABr);
            this.A0r = C000200d.A00(A0K2.A4V);
            this.A0o = C000200d.A00(r2.AKT);
            this.A0u = C000200d.A00(A0K2.A5Y);
            this.A0X = (AnonymousClass11Q) r2.A2T.get();
            this.A0a = (AnonymousClass1PS) r2.A3T.get();
            this.A0l = C000200d.A00(r2.A0Y);
            this.A0j = (C35511mM) r2.A4L.get();
            this.A0y = C000200d.A00(r2.AC9);
            this.A0v = C000200d.A00(A0K2.A5o);
            this.A0t = C000200d.A00(A0K2.A5X);
            this.A0W = (C37311pJ) A0K2.A4y.get();
        }
    }

    public void A4b() {
        boolean A2U;
        C98844ro.A02(this.A05, this, 8);
        A0u("groupadd");
        A0u("last");
        A0u("status");
        A0u("profile");
        C58812lI r4 = (C58812lI) this.A0S.A06.get("readreceipts");
        if (r4 != null) {
            A2U = AnonymousClass1YE.A08("all", r4.A00);
        } else {
            A2U = this.A0A.A2U();
        }
        int i = 0;
        this.A0i.setEnabled(AnonymousClass000.A1X(r4));
        ProgressBar progressBar = this.A0E;
        int i2 = 4;
        if (r4 != null) {
            i2 = 0;
        }
        progressBar.setVisibility(i2);
        SwitchCompat switchCompat = this.A0R;
        if (r4 != null) {
            i = 4;
        }
        switchCompat.setVisibility(i);
        if (r4 == null) {
            this.A0R.setChecked(A2U);
        }
        int i3 = 2131894933;
        if (A2U) {
            i3 = 2131894934;
        }
        if (AnonymousClass112.A07()) {
            AnonymousClass1HF.A0o(this.A0R, getResources().getString(i3));
        }
        A0u("stickers");
        A0u("pix");
    }

    public void CBt(String str) {
        if (str.equals("camera_effects_dialog")) {
            SettingsPrivacyCameraEffectsViewModel settingsPrivacyCameraEffectsViewModel = this.A0h;
            AnonymousClass3MX.A1Q(new SettingsPrivacyCameraEffectsViewModel$onOptOutConfirmed$1(settingsPrivacyCameraEffectsViewModel, (C30391dr) null), C41561wd.A00(settingsPrivacyCameraEffectsViewModel));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:86:0x0631, code lost:
        if (r1 > 180) goto L_0x0538;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r23) {
        /*
            r22 = this;
            r13 = r22
            r0 = r23
            super.onCreate(r0)
            r0 = 2131895971(0x7f1226a3, float:1.942679E38)
            r13.setTitle(r0)
            r0 = 2131626572(0x7f0e0a4c, float:1.8880384E38)
            r13.setContentView((int) r0)
            boolean r4 = X.C72473Md.A1T(r13)
            X.1It r1 = X.AnonymousClass3MW.A0N(r13)
            java.lang.Class<com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel> r0 = com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel.class
            X.1J2 r0 = r1.A00(r0)
            com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel r0 = (com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel) r0
            r13.A0h = r0
            X.1DS r1 = r0.A00
            r0 = 25
            X.C91614fy.A00(r13, r1, r0)
            com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel r0 = r13.A0h
            X.1DS r1 = r0.A01
            r0 = 26
            X.C91614fy.A00(r13, r1, r0)
            com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel r0 = r13.A0h
            X.1wy r2 = r0.A03
            r0 = 27
            X.4fy r1 = new X.4fy
            r1.<init>(r13, r0)
            r0 = 0
            X.C18070vi.A0d(r2, r0)
            r2.A09(r13)
            r2.A0A(r13, r1)
            X.0ve r1 = r13.A0E
            r0 = 3815(0xee7, float:5.346E-42)
            X.0vf r3 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r3, r1, r0)
            r2 = 0
            if (r0 == 0) goto L_0x0666
            X.0ve r1 = r13.A0E
            r0 = 9578(0x256a, float:1.3422E-41)
            boolean r0 = X.C18020vd.A05(r3, r1, r0)
            if (r0 == 0) goto L_0x0666
        L_0x0061:
            r13.A10 = r4
            r0 = 2131433778(0x7f0b1932, float:1.8489351E38)
            android.view.ViewStub r4 = X.AnonymousClass3MX.A0G(r13, r0)
            X.0ve r0 = r13.A0E
            boolean r1 = X.AnonymousClass1J8.A06(r0)
            r0 = 2131626574(0x7f0e0a4e, float:1.8880388E38)
            if (r1 == 0) goto L_0x0078
            r0 = 2131627597(0x7f0e0e4d, float:1.8882463E38)
        L_0x0078:
            android.view.View r1 = X.AnonymousClass3MY.A0G(r4, r0)
            boolean r0 = r1 instanceof com.whatsapp.wds.components.list.header.WDSSectionHeader
            if (r0 == 0) goto L_0x0088
            com.whatsapp.wds.components.list.header.WDSSectionHeader r1 = (com.whatsapp.wds.components.list.header.WDSSectionHeader) r1
            r0 = 2131894506(0x7f1220ea, float:1.9423819E38)
            r1.setHeaderText((int) r0)
        L_0x0088:
            r0 = 2131431952(0x7f0b1210, float:1.8485648E38)
            android.view.View r1 = X.C110885hR.A0A(r13, r0)
            r13.A07 = r1
            r0 = 2131434761(0x7f0b1d09, float:1.8491345E38)
            r6 = 2131434761(0x7f0b1d09, float:1.8491345E38)
            android.widget.TextView r1 = X.AnonymousClass3MW.A0J(r1, r0)
            r4 = 0
            r1.setVisibility(r2)
            r0 = 2131896030(0x7f1226de, float:1.942691E38)
            r1.setText(r0)
            android.view.View r1 = r13.A07
            r0 = 2131434760(0x7f0b1d08, float:1.8491343E38)
            r5 = 2131434760(0x7f0b1d08, float:1.8491343E38)
            android.widget.TextView r0 = X.AnonymousClass3MW.A0J(r1, r0)
            r13.A0L = r0
            r0.setVisibility(r2)
            java.util.Map r7 = r13.A14
            java.lang.String r1 = "last"
            java.lang.String r0 = "online"
            r7.put(r1, r0)
            r0 = 2131434163(0x7f0b1ab3, float:1.8490132E38)
            android.view.View r0 = X.C110885hR.A0A(r13, r0)
            r13.A0C = r0
            android.widget.TextView r1 = X.C72453Mb.A0V(r0, r6)
            r0 = 2131895987(0x7f1226b3, float:1.9426823E38)
            r1.setText(r0)
            android.view.View r0 = r13.A0C
            android.widget.TextView r0 = X.AnonymousClass3MW.A0J(r0, r5)
            r13.A0O = r0
            r0.setVisibility(r2)
            r0 = 2131427361(0x7f0b0021, float:1.8476336E38)
            android.view.View r0 = X.C110885hR.A0A(r13, r0)
            r13.A01 = r0
            android.widget.TextView r7 = X.C72453Mb.A0V(r0, r6)
            X.0ve r1 = r13.A0E
            r0 = 4921(0x1339, float:6.896E-42)
            boolean r1 = X.C18020vd.A05(r3, r1, r0)
            r0 = 2131895984(0x7f1226b0, float:1.9426816E38)
            if (r1 == 0) goto L_0x00fa
            r0 = 2131896820(0x7f1229f4, float:1.9428512E38)
        L_0x00fa:
            r7.setText(r0)
            android.view.View r0 = r13.A01
            android.widget.TextView r0 = X.AnonymousClass3MW.A0J(r0, r5)
            r13.A0G = r0
            r0 = 2131435681(0x7f0b20a1, float:1.8493211E38)
            android.view.View r0 = X.C110885hR.A0A(r13, r0)
            r13.A0D = r0
            android.widget.TextView r1 = X.C72453Mb.A0V(r0, r6)
            r0 = 2131895991(0x7f1226b7, float:1.942683E38)
            r1.setText(r0)
            android.view.View r0 = r13.A0D
            android.widget.TextView r0 = X.AnonymousClass3MW.A0J(r0, r5)
            r13.A0P = r0
            boolean r0 = X.AnonymousClass3MX.A1V(r13)
            r7 = 8
            if (r0 == 0) goto L_0x0145
            X.11Q r0 = r13.A0X
            android.content.SharedPreferences r1 = X.AnonymousClass11Q.A01(r0)
            java.lang.String r0 = "post_status_in_companion"
            boolean r0 = r1.getBoolean(r0, r2)
            if (r0 == 0) goto L_0x0140
            X.0ve r1 = r13.A0E
            r0 = 4905(0x1329, float:6.873E-42)
            boolean r0 = X.C18020vd.A05(r3, r1, r0)
            if (r0 != 0) goto L_0x0145
        L_0x0140:
            android.view.View r0 = r13.A0D
            r0.setVisibility(r7)
        L_0x0145:
            r0 = 2131433870(0x7f0b198e, float:1.8489538E38)
            android.view.View r0 = X.C110885hR.A0A(r13, r0)
            r13.A09 = r0
            X.0ve r1 = r13.A0E
            r0 = 12355(0x3043, float:1.7313E-41)
            boolean r0 = X.C18020vd.A05(r3, r1, r0)
            boolean r1 = X.AnonymousClass000.A1O(r0)
            android.view.View r0 = r13.A09
            if (r1 == 0) goto L_0x0661
            android.widget.TextView r1 = X.C72453Mb.A0V(r0, r6)
            r0 = 2131893593(0x7f121d59, float:1.9421967E38)
            r1.setText(r0)
            android.view.View r0 = r13.A09
            android.widget.TextView r0 = X.AnonymousClass3MW.A0J(r0, r5)
            r13.A0N = r0
        L_0x0170:
            r0 = 2131432142(0x7f0b12ce, float:1.8486033E38)
            android.view.View r0 = X.C110885hR.A0A(r13, r0)
            r13.A08 = r0
            android.widget.TextView r1 = X.C72453Mb.A0V(r0, r6)
            r0 = 2131895985(0x7f1226b1, float:1.9426818E38)
            r1.setText(r0)
            android.view.View r0 = r13.A08
            android.widget.TextView r0 = X.AnonymousClass3MW.A0J(r0, r5)
            r13.A0M = r0
            android.view.View r1 = r13.A08
            boolean r0 = X.AnonymousClass3MX.A1V(r13)
            int r0 = X.C72453Mb.A01(r0)
            r1.setVisibility(r0)
            X.00H r0 = r13.A0l
            java.lang.Object r7 = r0.get()
            X.6y1 r7 = (X.C138986y1) r7
            X.0ve r1 = r7.A00
            r0 = 5979(0x175b, float:8.378E-42)
            boolean r0 = X.C18020vd.A05(r3, r1, r0)
            if (r0 == 0) goto L_0x01e6
            X.00H r0 = r7.A01
            java.lang.Object r0 = r0.get()
            X.1Uk r0 = (X.C27021Uk) r0
            boolean r0 = r0.A01()
            if (r0 == 0) goto L_0x01e6
            r0 = 2131428001(0x7f0b02a1, float:1.8477634E38)
            X.1bI r7 = X.C72453Mb.A0r(r13, r0)
            android.view.View r1 = r7.A02()
            r0 = 34
            X.C90094dW.A00(r1, r13, r0)
            android.view.View r0 = r7.A02()
            android.widget.TextView r1 = X.C72453Mb.A0V(r0, r6)
            r0 = 2131886900(0x7f120334, float:1.9408392E38)
            r1.setText(r0)
            android.view.View r0 = r7.A02()
            android.widget.TextView r0 = X.AnonymousClass3MW.A0J(r0, r5)
            r13.A0I = r0
            r0.setVisibility(r2)
            r7.A04(r2)
        L_0x01e6:
            r0 = 2131428786(0x7f0b05b2, float:1.8479226E38)
            android.view.View r0 = X.C110885hR.A0A(r13, r0)
            r13.A04 = r0
            r0 = 2131428787(0x7f0b05b3, float:1.8479228E38)
            android.view.View r0 = X.C110885hR.A0A(r13, r0)
            androidx.appcompat.widget.SwitchCompat r0 = (androidx.appcompat.widget.SwitchCompat) r0
            r13.A0Q = r0
            android.view.View r1 = r13.A04
            com.whatsapp.settings.SettingsPrivacyCameraEffectsViewModel r0 = r13.A0h
            boolean r0 = r0.A05
            int r0 = X.C72453Mb.A07(r0)
            r1.setVisibility(r0)
            android.view.View r7 = r13.A04
            r0 = 2131428788(0x7f0b05b4, float:1.847923E38)
            android.widget.TextView r1 = X.AnonymousClass3MW.A0J(r7, r0)
            r0 = 2131887875(0x7f120703, float:1.941037E38)
            r1.setText(r0)
            r1 = 2131887872(0x7f120700, float:1.9410363E38)
            java.lang.Object[] r0 = X.AnonymousClass3MW.A1a()
            java.lang.String r9 = "learn-more"
            java.lang.String r20 = X.C17880vN.A0q(r13, r9, r0, r2, r1)
            r0 = 2131428785(0x7f0b05b1, float:1.8479224E38)
            com.whatsapp.TextEmojiLabel r17 = X.AnonymousClass3MX.A0V(r7, r0)
            X.0ve r8 = r13.A0E
            X.1KB r7 = r13.A05
            X.1L9 r15 = r13.A01
            X.11C r1 = r13.A08
            java.lang.String r0 = "https://faq.whatsapp.com/8066655820111615/"
            android.net.Uri r14 = android.net.Uri.parse(r0)
            r16 = r7
            r18 = r1
            r19 = r8
            r21 = r9
            X.C26302CxJ.A0K(r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r0 = 2131430090(0x7f0b0aca, float:1.8481871E38)
            android.view.View r1 = X.C110885hR.A0A(r13, r0)
            r13.A05 = r1
            r0 = 2131430093(0x7f0b0acd, float:1.8481877E38)
            android.widget.TextView r0 = X.AnonymousClass3MW.A0J(r1, r0)
            r13.A0F = r0
            android.view.View r1 = r13.A05
            X.00H r0 = r13.A0o
            java.lang.Object r0 = r0.get()
            X.2ij r0 = (X.C57222ij) r0
            boolean r0 = r0.A00()
            int r0 = X.C72453Mb.A07(r0)
            r1.setVisibility(r0)
            r0 = 2131431237(0x7f0b0f45, float:1.8484198E38)
            android.view.View r0 = X.C110885hR.A0A(r13, r0)
            r13.A06 = r0
            android.widget.TextView r1 = X.C72453Mb.A0V(r0, r6)
            r0 = 2131895981(0x7f1226ad, float:1.942681E38)
            r1.setText(r0)
            android.view.View r0 = r13.A06
            android.widget.TextView r0 = X.AnonymousClass3MW.A0J(r0, r5)
            r13.A0K = r0
            X.0ve r0 = r13.A0E
            boolean r0 = X.AnonymousClass3MX.A1W(r0)
            if (r0 == 0) goto L_0x0635
            r0 = 2131429494(0x7f0b0876, float:1.8480662E38)
            X.1bI r7 = X.C72453Mb.A0r(r13, r0)
            android.view.View r0 = r7.A02()
            android.widget.TextView r1 = X.C72453Mb.A0V(r0, r6)
            r0 = 2131893347(0x7f121c63, float:1.9421468E38)
            r1.setText(r0)
            android.view.View r0 = r7.A02()
            android.widget.TextView r1 = X.C72453Mb.A0V(r0, r5)
            r0 = 2131893345(0x7f121c61, float:1.9421464E38)
            r1.setText(r0)
            r7.A04(r2)
            r1 = 47
        L_0x02b5:
            X.4dW r0 = new X.4dW
            r0.<init>(r13, r1)
            r7.A05(r0)
            X.10I r1 = r13.A05
            r0 = 10
            X.C98844ro.A02(r1, r13, r0)
            r0 = 2131434381(0x7f0b1b8d, float:1.8490574E38)
            android.view.View r0 = X.C110885hR.A0A(r13, r0)
            com.whatsapp.settings.SettingsRowPrivacyLinearLayout r0 = (com.whatsapp.settings.SettingsRowPrivacyLinearLayout) r0
            r13.A0i = r0
            r0 = 2131434382(0x7f0b1b8e, float:1.8490576E38)
            android.view.View r0 = X.C110885hR.A0A(r13, r0)
            androidx.appcompat.widget.SwitchCompat r0 = (androidx.appcompat.widget.SwitchCompat) r0
            r13.A0R = r0
            r0 = 2131434383(0x7f0b1b8f, float:1.8490578E38)
            android.view.View r0 = X.C110885hR.A0A(r13, r0)
            android.widget.ProgressBar r0 = (android.widget.ProgressBar) r0
            r13.A0E = r0
            r0 = 2131434380(0x7f0b1b8c, float:1.8490572E38)
            X.C110885hR.A0A(r13, r0)
            X.00H r0 = r13.A0A
            java.lang.Object r0 = r0.get()
            X.1XL r0 = (X.AnonymousClass1XL) r0
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x0330
            r0 = 2131435050(0x7f0b1e2a, float:1.8491931E38)
            X.1bI r8 = X.C72453Mb.A0r(r13, r0)
            android.view.View r0 = r8.A02()
            android.widget.TextView r7 = X.C72453Mb.A0V(r0, r6)
            r0 = 2131895990(0x7f1226b6, float:1.9426829E38)
            r1 = 2131895990(0x7f1226b6, float:1.9426829E38)
            r7.setText(r0)
            android.view.View r0 = r8.A02()
            android.widget.TextView r0 = X.AnonymousClass3MW.A0J(r0, r5)
            r13.A0H = r0
            r0.setVisibility(r2)
            android.widget.TextView r0 = r13.A0H
            r0.setText(r1)
            r1 = 46
            X.4dW r0 = new X.4dW
            r0.<init>(r13, r1)
            r8.A05(r0)
            r8.A04(r2)
        L_0x0330:
            X.1fA r0 = r13.A0T
            X.11S r0 = r0.A04
            boolean r0 = r0.A0N()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x035b
            r0 = 2131429046(0x7f0b06b6, float:1.8479754E38)
            X.1bI r7 = X.C72453Mb.A0r(r13, r0)
            android.view.View r0 = X.AnonymousClass3MY.A0I(r7, r2)
            android.widget.TextView r1 = X.C72453Mb.A0V(r0, r6)
            r0 = 2131888157(0x7f12081d, float:1.9410941E38)
            r1.setText(r0)
            r1 = 30
            X.4dW r0 = new X.4dW
            r0.<init>(r13, r1)
            r7.A05(r0)
        L_0x035b:
            r0 = 2131428762(0x7f0b059a, float:1.8479178E38)
            android.view.View r0 = X.C110885hR.A0A(r13, r0)
            r13.A03 = r0
            android.widget.TextView r1 = X.C72453Mb.A0V(r0, r6)
            r0 = 2131887859(0x7f1206f3, float:1.9410337E38)
            r1.setText(r0)
            android.view.View r0 = r13.A03
            android.widget.TextView r1 = X.C72453Mb.A0V(r0, r5)
            r0 = 2131896145(0x7f122751, float:1.9427143E38)
            r1.setText(r0)
            r0 = 2131427692(0x7f0b016c, float:1.8477007E38)
            android.view.View r0 = X.C110885hR.A0A(r13, r0)
            r13.A02 = r0
            android.widget.TextView r1 = X.C72453Mb.A0V(r0, r6)
            r0 = 2131886557(0x7f1201dd, float:1.9407696E38)
            r1.setText(r0)
            android.view.View r0 = r13.A02
            android.widget.TextView r1 = X.C72453Mb.A0V(r0, r5)
            r0 = 2131886556(0x7f1201dc, float:1.9407694E38)
            r1.setText(r0)
            r0 = 2131434071(0x7f0b1a57, float:1.8489946E38)
            android.view.View r1 = X.C110885hR.A0A(r13, r0)
            r13.A0B = r1
            r0 = 2131435305(0x7f0b1f29, float:1.8492448E38)
            android.widget.TextView r1 = X.AnonymousClass3MW.A0J(r1, r0)
            r0 = 2131894756(0x7f1221e4, float:1.9424326E38)
            r1.setText(r0)
            android.view.View r1 = r13.A0B
            r0 = 2131435304(0x7f0b1f28, float:1.8492446E38)
            android.widget.TextView r1 = X.AnonymousClass3MW.A0J(r1, r0)
            r0 = 2131894755(0x7f1221e3, float:1.9424324E38)
            r1.setText(r0)
            android.view.View r1 = r13.A0B
            boolean r0 = r13.A10
            int r0 = X.C72453Mb.A07(r0)
            r1.setVisibility(r0)
            r0 = 2131434069(0x7f0b1a55, float:1.8489942E38)
            android.view.View r1 = X.C110885hR.A0A(r13, r0)
            boolean r0 = r13.A10
            if (r0 != 0) goto L_0x03d6
            r4 = 8
        L_0x03d6:
            r1.setVisibility(r4)
            r13.A4b()
            android.content.Intent r4 = r13.getIntent()
            java.lang.String r1 = "entry_point"
            r0 = -1
            int r0 = r4.getIntExtra(r1, r0)
            r13.A00 = r0
            android.view.View r1 = r13.A07
            r0 = 32
            X.C90094dW.A00(r1, r13, r0)
            android.view.View r1 = r13.A0C
            r0 = 37
            X.C90094dW.A00(r1, r13, r0)
            android.view.View r1 = r13.A01
            r0 = 38
            X.C90094dW.A00(r1, r13, r0)
            android.view.View r1 = r13.A09
            r0 = 39
            X.C90094dW.A00(r1, r13, r0)
            android.view.View r1 = r13.A0D
            r0 = 40
            X.C90094dW.A00(r1, r13, r0)
            android.view.View r1 = r13.A08
            r0 = 41
            X.C90094dW.A00(r1, r13, r0)
            android.view.View r1 = r13.A04
            r0 = 42
            X.C90094dW.A00(r1, r13, r0)
            android.view.View r1 = r13.A03
            r0 = 43
            X.C90094dW.A00(r1, r13, r0)
            android.view.View r1 = r13.A02
            r0 = 44
            X.C90094dW.A00(r1, r13, r0)
            android.view.View r1 = r13.A0B
            r0 = 45
            X.C90094dW.A00(r1, r13, r0)
            android.view.View r1 = r13.A06
            r0 = 33
            X.C90094dW.A00(r1, r13, r0)
            X.00H r0 = r13.A0o
            java.lang.Object r0 = r0.get()
            X.2ij r0 = (X.C57222ij) r0
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x04b3
            android.view.View r0 = r13.A05
            r0.setVisibility(r2)
            android.view.View r1 = r13.A05
            r0 = 35
            X.C90094dW.A00(r1, r13, r0)
            android.view.View r5 = r13.A05
            X.1PS r0 = r13.A0a
            int r4 = r0.A00()
            X.1zj r1 = X.C43391zj.A00
            r0 = 1
            java.lang.String r1 = r1.A09(r13, r4, r2, r0)
            android.widget.TextView r0 = r13.A0F
            r0.setText(r1)
            X.1Rn r0 = r13.A0Z
            X.1PS r0 = r0.A04
            X.1DT r1 = r0.A00
            r0 = 24
            X.C91614fy.A00(r13, r1, r0)
            r0 = 2131430021(0x7f0b0a85, float:1.8481731E38)
            android.view.ViewStub r4 = X.AnonymousClass3MX.A0G(r13, r0)
            X.0ve r0 = r13.A0E
            boolean r1 = X.AnonymousClass1J8.A06(r0)
            r0 = 2131626573(0x7f0e0a4d, float:1.8880386E38)
            if (r1 == 0) goto L_0x0484
            r0 = 2131627597(0x7f0e0e4d, float:1.8882463E38)
        L_0x0484:
            android.view.View r4 = X.AnonymousClass3MY.A0G(r4, r0)
            boolean r0 = r4 instanceof com.whatsapp.wds.components.list.header.WDSSectionHeader
            if (r0 == 0) goto L_0x0495
            r1 = r4
            com.whatsapp.wds.components.list.header.WDSSectionHeader r1 = (com.whatsapp.wds.components.list.header.WDSSectionHeader) r1
            r0 = 2131889528(0x7f120d78, float:1.9413722E38)
            r1.setHeaderText((int) r0)
        L_0x0495:
            r0 = 2131430092(0x7f0b0acc, float:1.8481875E38)
            X.AnonymousClass1HF.A06(r5, r0)
            r0 = 2131430091(0x7f0b0acb, float:1.8481873E38)
            X.AnonymousClass1HF.A06(r5, r0)
            r0 = 2131430088(0x7f0b0ac8, float:1.8481867E38)
            android.view.View r1 = X.C110885hR.A0A(r13, r0)
            r4.setVisibility(r2)
            android.widget.TextView r0 = r13.A0F
            r0.setVisibility(r2)
            r1.setVisibility(r2)
        L_0x04b3:
            com.whatsapp.settings.SettingsRowPrivacyLinearLayout r1 = r13.A0i
            r0 = 36
            X.C90094dW.A00(r1, r13, r0)
            X.0z4 r4 = r13.A0A
            X.11P r1 = r13.A05
            X.0ve r0 = r13.A0E
            X.4NZ r11 = new X.4NZ
            r11.<init>(r1, r4, r0)
            X.0z4 r10 = r11.A00
            java.lang.String r1 = "privacy_checkup_banner_last_seen_timestamp"
            long r4 = r10.A0W(r1)
            r6 = -1
            int r0 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0610
            r10.A1i(r1)
        L_0x04d6:
            X.00H r4 = r10.A00
            android.content.SharedPreferences r1 = X.C17880vN.A0B(r4)
            java.lang.String r0 = "privacy_checkup_banner_dismiss"
            int r1 = r1.getInt(r0, r2)
            r0 = 3
            if (r1 >= r0) goto L_0x0538
            X.0ve r1 = r11.A01
            r0 = 3815(0xee7, float:5.346E-42)
            boolean r0 = X.C18020vd.A05(r3, r1, r0)
            if (r0 == 0) goto L_0x0538
            android.content.SharedPreferences r2 = X.C17880vN.A0B(r4)
            java.lang.String r1 = "privacy_checkup_banner_max_cool_off_days"
            r0 = -1
            r2.getInt(r1, r0)
            r1 = 604800000(0x240c8400, double:2.988109026E-315)
            java.lang.String r0 = "privacy_checkup_banner_cool_off_timestamp"
            boolean r0 = r10.A2b(r0, r1)
            r0 = r0 ^ 1
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0538
            X.00H r0 = r13.A0t
            java.lang.Object r1 = r0.get()
            X.6zO r1 = (X.C139756zO) r1
            r0 = 1
            r1.A01(r0)
            r0 = 17
            X.786 r4 = new X.786
            r4.<init>(r13, r11, r0)
            r0 = 18
            X.786 r3 = new X.786
            r3.<init>(r13, r11, r0)
            android.view.View r2 = r13.A0Q()
            boolean r0 = r2 instanceof com.whatsapp.settings.SettingsRowBanner
            if (r0 == 0) goto L_0x05dd
            com.whatsapp.settings.SettingsRowBanner r2 = (com.whatsapp.settings.SettingsRowBanner) r2
            r0 = 2131232066(0x7f080542, float:1.808023E38)
            r2.setIcon(r0)
            r2.setOnClickListener(r3)
            r2.setOnCloseClickListener(r4)
        L_0x0538:
            X.1Rl r1 = r13.A0S
            r0 = 0
            r1.A01(r0)
            X.1Rn r0 = r13.A0Z
            r0.A00()
            X.1Lf r1 = r13.A0U
            X.1Gv r0 = r13.A13
            r1.registerObserver(r0)
            X.1Rl r1 = r13.A0S
            X.88p r0 = r13.A12
            r1.observeUntilDestroy(r0, r13)
            X.1Uv r0 = r13.A0c
            X.3Lh r1 = r13.A16
            java.util.List r0 = r0.A0W
            r0.add(r1)
            android.content.Intent r1 = r13.getIntent()
            java.lang.String r0 = "target_setting"
            java.lang.String r2 = r1.getStringExtra(r0)
            java.lang.String r0 = "read_receipts_enabled"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0581
            com.whatsapp.settings.SettingsRowPrivacyLinearLayout r0 = r13.A0i
            r0.A00()
            r1 = 8
            android.view.View r0 = r13.A0A
            if (r0 == 0) goto L_0x0581
            android.view.View r0 = r13.A0Q()
            r0.setVisibility(r1)
            A0r(r13)
        L_0x0581:
            java.lang.String r0 = "privacy_groupadd"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x05a3
            X.00H r0 = r13.A0x
            android.content.Intent r2 = X.AnonymousClass3MZ.A06(r0)
            java.lang.String r1 = r13.getPackageName()
            java.lang.String r0 = "com.whatsapp.group.GroupAddPrivacyActivity"
            r2.setClassName(r1, r0)
            r0 = 2
        L_0x0599:
            r13.startActivityForResult(r2, r0)
        L_0x059c:
            java.lang.String r0 = X.C72453Mb.A0w(r13)
            r13.A0z = r0
            return
        L_0x05a3:
            java.lang.String r0 = "privacy_profile_photo"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x05b9
            X.00H r0 = r13.A0x
            android.content.Intent r1 = X.AnonymousClass3MZ.A06(r0)
            java.lang.String r0 = "com.whatsapp.profile.ProfilePhotoPrivacyActivity"
            android.content.Intent r2 = r1.setClassName(r13, r0)
            r0 = 6
            goto L_0x0599
        L_0x05b9:
            java.lang.String r0 = "privacy_checkup"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x059c
            X.00H r0 = r13.A0x
            r0.get()
            r3 = 5
            android.content.Intent r2 = X.C17880vN.A0A()
            java.lang.String r1 = r13.getPackageName()
            java.lang.String r0 = "com.whatsapp.privacy.checkup.PrivacyCheckupHomeActivity"
            r2.setClassName(r1, r0)
            java.lang.String r0 = "ENTRY_POINT"
            r2.putExtra(r0, r3)
            r13.startActivity(r2)
            goto L_0x059c
        L_0x05dd:
            boolean r0 = r2 instanceof com.whatsapp.wds.components.banners.WDSBanner
            if (r0 == 0) goto L_0x0538
            com.whatsapp.wds.components.banners.WDSBanner r2 = (com.whatsapp.wds.components.banners.WDSBanner) r2
            X.4XT r1 = new X.4XT
            r1.<init>()
            r0 = 2131232066(0x7f080542, float:1.808023E38)
            X.AnonymousClass4AC.A00(r1, r0)
            r0 = 2131894739(0x7f1221d3, float:1.9424291E38)
            r1.A01 = r0
            r0 = 2131894738(0x7f1221d2, float:1.942429E38)
            android.text.Spanned r0 = X.AnonymousClass4W6.A00(r13, r0)
            X.AnonymousClass4XT.A00(r2, r1, r0)
            boolean r0 = X.C22891Dp.A02
            if (r0 != 0) goto L_0x060c
            r2.A08()
        L_0x0604:
            r2.setOnClickListener(r3)
            r2.setOnDismissListener((android.view.View.OnClickListener) r4)
            goto L_0x0538
        L_0x060c:
            r2.A07()
            goto L_0x0604
        L_0x0610:
            long r0 = java.lang.System.currentTimeMillis()
            X.00H r12 = r10.A00
            android.content.SharedPreferences r6 = X.C17880vN.A0B(r12)
            java.lang.String r9 = "privacy_checkup_banner_max_display_days"
            r8 = -1
            r6.getInt(r9, r8)
            r7 = 180(0xb4, float:2.52E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r7)
            int r1 = X.A87.A00(r6, r0, r4)
            android.content.SharedPreferences r0 = X.C17880vN.A0B(r12)
            r0.getInt(r9, r8)
            if (r1 <= r7) goto L_0x04d6
            goto L_0x0538
        L_0x0635:
            r0 = 2131428225(0x7f0b0381, float:1.8478088E38)
            X.1bI r7 = X.C72453Mb.A0r(r13, r0)
            android.view.View r0 = r7.A02()
            android.widget.TextView r1 = X.AnonymousClass3MW.A0J(r0, r6)
            r0 = 2131887189(0x7f120455, float:1.9408978E38)
            r1.setText(r0)
            r1.setVisibility(r2)
            android.view.View r0 = r7.A02()
            android.widget.TextView r0 = X.AnonymousClass3MW.A0J(r0, r5)
            r13.A0J = r0
            r0.setVisibility(r2)
            r7.A04(r2)
            r1 = 31
            goto L_0x02b5
        L_0x0661:
            r0.setVisibility(r7)
            goto L_0x0170
        L_0x0666:
            r4 = 0
            goto L_0x0061
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsPrivacy.onCreate(android.os.Bundle):void");
    }

    private TextView A0V(String str) {
        switch (str.hashCode()) {
            case -892481550:
                if (str.equals("status")) {
                    return this.A0G;
                }
                return null;
            case -309425751:
                if (str.equals("profile")) {
                    return this.A0O;
                }
                return null;
            case 111007:
                if (str.equals("pix")) {
                    return this.A0N;
                }
                return null;
            case 3314326:
                if (str.equals("last")) {
                    return this.A0L;
                }
                return null;
            case 506363330:
                if (str.equals("groupadd")) {
                    return this.A0K;
                }
                return null;
            case 1531715286:
                if (str.equals("stickers")) {
                    return this.A0I;
                }
                return null;
            default:
                return null;
        }
    }

    public static void A0r(SettingsPrivacy settingsPrivacy) {
        int A012 = AnonymousClass3MW.A01(settingsPrivacy.getResources(), 2131165471);
        View A0A2 = C110885hR.A0A(settingsPrivacy, 2131429510);
        ViewGroup.MarginLayoutParams A0B2 = AnonymousClass3MW.A0B(A0A2);
        C27641Ww.A06(A0A2, settingsPrivacy.A00, A0B2.leftMargin, A012, A0B2.rightMargin, A0B2.bottomMargin);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A0t(com.whatsapp.settings.SettingsPrivacy r6, java.lang.String r7, java.lang.String r8) {
        /*
            android.widget.TextView r4 = r6.A0V(r7)
            if (r4 != 0) goto L_0x0018
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "Tried to put text for privacy category "
            r1.append(r0)
            r1.append(r7)
            java.lang.String r0 = " with no subtitle text view"
            X.C17890vO.A1A(r1, r0)
            return
        L_0x0018:
            r5 = 0
            r4.setVisibility(r5)
            java.util.Map r0 = r6.A14
            java.lang.String r1 = X.C17880vN.A0s(r7, r0)
            if (r1 == 0) goto L_0x004d
            X.1Rl r0 = r6.A0S
            int r2 = r0.A00(r1)
            if (r2 < 0) goto L_0x004b
            int[] r1 = X.C63682tW.A00
            r0 = 3
            if (r2 >= r0) goto L_0x004b
            r0 = r1[r2]
            java.lang.String r3 = r6.getString(r0)
        L_0x0037:
            boolean r0 = r8.equals(r3)
            if (r0 != 0) goto L_0x004d
            r2 = 2131895978(0x7f1226aa, float:1.9426804E38)
            java.lang.Object[] r1 = X.AnonymousClass3MX.A1b(r8, r5)
            r0 = 1
            r1[r0] = r3
            X.AnonymousClass3MY.A0y(r6, r4, r1, r2)
            return
        L_0x004b:
            r3 = r8
            goto L_0x0037
        L_0x004d:
            r4.setText(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whatsapp.settings.SettingsPrivacy.A0t(com.whatsapp.settings.SettingsPrivacy, java.lang.String, java.lang.String):void");
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0) {
            C98844ro.A02(this.A05, this, 8);
        } else if (i == 2 || i == 6) {
            finish();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C27131Uv r0 = this.A0c;
        r0.A0W.remove(this.A16);
        this.A0U.unregisterObserver(this.A13);
        this.A0h.A03.A09(this);
    }

    public void onRestart() {
        super.onRestart();
        this.A0z = null;
    }

    public void onResume() {
        String string;
        super.onResume();
        if (!this.A17) {
            A0d(this);
        }
        A0q(this);
        if (this.A0H != null) {
            if (this.A0A.A2T()) {
                string = A0c(this.A0A.A0Q());
            } else {
                string = getString(2131886671);
            }
            this.A0H.setText(string);
        }
        A4b();
        ((C87824Xf) this.A0v.get()).A02(this.A00, "privacy", this.A0z);
    }

    public SettingsPrivacy(int i) {
        this.A11 = false;
        C91034f2.A00(this, 20);
    }
}
