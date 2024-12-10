package X;

import android.app.Application;
import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.widget.ImageView;
import com.whatsapp.biz.catalog.manager.CatalogManager;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.GetVNameCertificateJob;
import java.net.MalformedURLException;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.3TA  reason: invalid class name */
public class AnonymousClass3TA extends AnonymousClass8FK implements AnonymousClass3M0 {
    public C143887Fe A00;
    public AnonymousClass4O2 A01;
    public AnonymousClass4O2 A02;
    public AnonymousClass5a2 A03;
    public C693536w A04;
    public C693536w A05;
    public Integer A06;
    public Integer A07;
    public Integer A08;
    public Runnable A09 = null;
    public String A0A;
    public boolean A0B;
    public boolean A0C = false;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public final Handler A0G;
    public final AnonymousClass1DS A0H;
    public final AnonymousClass1DT A0I;
    public final AnonymousClass1DT A0J;
    public final AnonymousClass1DT A0K;
    public final AnonymousClass1DT A0L;
    public final AnonymousClass1DT A0M;
    public final AnonymousClass1KB A0N;
    public final AnonymousClass11S A0O;
    public final AnonymousClass181 A0P;
    public final C25001Mm A0Q;
    public final C23651Hc A0R;
    public final C26911Ty A0S;
    public final C36211nW A0T;
    public final C20114A7x A0U;
    public final CatalogManager A0V;
    public final BDO A0W;
    public final AnonymousClass1PM A0X;
    public final C86434Rp A0Y;
    public final AnonymousClass11P A0Z;
    public final C19830z4 A0a;
    public final C18000vb A0b;
    public final C822444b A0c;
    public final C32981i4 A0d;
    public final C18030ve A0e;
    public final AnonymousClass18K A0f;
    public final C32011gU A0g;
    public final AnonymousClass1T6 A0h;
    public final AnonymousClass1OZ A0i;
    public final AnonymousClass1c4 A0j;
    public final C85184Mk A0k;
    public final AnonymousClass1QD A0l;
    public final AnonymousClass4QJ A0m;
    public final C22525BBi A0n;
    public final AnonymousClass3M1 A0o;
    public final C200710s A0p;
    public final AnonymousClass10I A0q;
    public final AnonymousClass00H A0r;
    public final List A0s;

    /* JADX WARNING: Removed duplicated region for block: B:58:0x0101  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0W(android.text.Editable r14, X.AnonymousClass1BI r15, X.AnonymousClass00H r16, boolean r17, boolean r18) {
        /*
            r13 = this;
            r8 = r13
            r0 = r17
            r13.A0E = r0
            r0 = r18
            r13.A0D = r0
            X.7Fe r1 = r13.A00
            boolean r0 = r1 instanceof X.C75373hL
            if (r0 == 0) goto L_0x0020
            r0 = r1
            X.3hL r0 = (X.C75373hL) r0
            X.Abv r0 = r0.A00
            if (r0 == 0) goto L_0x001a
            boolean r0 = r0.A00
            if (r0 != 0) goto L_0x0020
        L_0x001a:
            X.4DX r0 = X.AnonymousClass4DX.PAGE_UPDATED
            r13.A04(r1, r0)
        L_0x001f:
            return
        L_0x0020:
            X.1gU r7 = r13.A0g
            java.lang.String r0 = r14.toString()
            java.lang.String r11 = r7.A02(r0)
            r5 = 0
            if (r11 == 0) goto L_0x0046
            java.lang.String r0 = "/"
            boolean r0 = r11.endsWith(r0)
            if (r0 == 0) goto L_0x0041
            int r0 = r11.length()
            int r0 = r0 + -1
            java.lang.String r11 = r11.substring(r5, r0)
            if (r11 == 0) goto L_0x0046
        L_0x0041:
            X.4QJ r0 = r13.A0m
            r0.A00()
        L_0x0046:
            X.4QJ r0 = r13.A0m
            boolean r0 = r0.A00()
            r3 = 0
            if (r0 == 0) goto L_0x0050
            r11 = r3
        L_0x0050:
            java.lang.String r4 = r13.A0A
            r13.A0a(r11)
            if (r11 == 0) goto L_0x012d
            r13.A0b(r3)
            X.7Fe r0 = r13.A00
            if (r0 == 0) goto L_0x0066
            java.lang.String r0 = r0.A0S
            boolean r0 = android.text.TextUtils.equals(r0, r11)
            if (r0 != 0) goto L_0x001f
        L_0x0066:
            boolean r0 = r13.A0D
            if (r0 == 0) goto L_0x0076
            X.1DT r2 = r13.A0M
            X.4DX r1 = X.AnonymousClass4DX.LOADING
            X.4UK r0 = new X.4UK
            r0.<init>(r3, r1, r3)
            r2.A0F(r0)
        L_0x0076:
            X.1i4 r0 = r13.A0d
            boolean r0 = r0.A0J(r11)
            r9 = r15
            r10 = r16
            if (r0 == 0) goto L_0x00cf
            android.net.Uri r0 = android.net.Uri.parse(r11)
            com.whatsapp.jid.PhoneUserJid r0 = X.C32981i4.A06(r0)
            if (r0 == 0) goto L_0x00fb
            r13.A08(r0, r10, r11)
        L_0x008e:
            X.7Fe r0 = r13.A00
            if (r0 != 0) goto L_0x001f
            boolean r0 = r13.A0C
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r0)
            if (r0 == 0) goto L_0x00b8
            if (r4 == 0) goto L_0x00b8
            boolean r0 = r4.contains(r11)
            if (r0 != 0) goto L_0x00a8
            boolean r0 = r11.contains(r4)
            if (r0 == 0) goto L_0x00b8
        L_0x00a8:
            X.0ve r2 = r13.A0e
            r1 = 4054(0xfd6, float:5.681E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x00b8
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r5)
        L_0x00b8:
            boolean r2 = r6.booleanValue()
            java.lang.Runnable r1 = r13.A09
            if (r1 == 0) goto L_0x00c7
            android.os.Handler r0 = r13.A0G
            r0.removeCallbacks(r1)
            r13.A09 = r3
        L_0x00c7:
            r13.A03 = r3
            if (r2 == 0) goto L_0x011c
            r13.A0Y(r15, r10, r11)
            return
        L_0x00cf:
            X.BDO r6 = r13.A0W
            boolean r0 = r6.BgR()
            if (r0 == 0) goto L_0x00f6
            r0 = r6
            X.ANI r0 = (X.ANI) r0
            X.9zF r0 = r0.A06
            boolean r0 = r0.A01(r11)
            if (r0 == 0) goto L_0x00f6
            X.0ve r2 = r13.A0e
            X.181 r1 = r13.A0P
            X.C18070vi.A0o(r2, r7, r1)
            X.3hK r0 = new X.3hK
            r0.<init>(r1, r2, r7, r11)
            r13.A00 = r0
            X.BBi r0 = r13.A0n
            r6.CFZ(r0, r11)
            goto L_0x008e
        L_0x00f6:
            X.0ve r0 = r13.A0e
            X.C18070vi.A0d(r0, r5)
        L_0x00fb:
            boolean r0 = X.C22971Dz.A0V(r15)
            if (r0 == 0) goto L_0x0117
            X.1c4 r0 = r13.A0j
            X.0ve r2 = r0.A02
            r1 = 5287(0x14a7, float:7.409E-42)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            if (r0 == 0) goto L_0x0117
            r1 = 0
        L_0x0110:
            X.4DX r0 = X.AnonymousClass4DX.SMALL_THUMBNAIL_LOADED
            r13.A04(r1, r0)
            goto L_0x008e
        L_0x0117:
            X.7Fe r1 = X.C20016A3i.A00(r11)
            goto L_0x0110
        L_0x011c:
            r12 = 27
            X.AkN r7 = new X.AkN
            r7.<init>(r8, r9, r10, r11, r12)
            r13.A09 = r7
            android.os.Handler r2 = r13.A0G
            r0 = 700(0x2bc, double:3.46E-321)
            r2.postDelayed(r7, r0)
            return
        L_0x012d:
            java.lang.Runnable r1 = r13.A09
            if (r1 == 0) goto L_0x0138
            android.os.Handler r0 = r13.A0G
            r0.removeCallbacks(r1)
            r13.A09 = r3
        L_0x0138:
            r13.A03 = r3
            X.1DT r0 = r13.A0I
            r0.A0F(r3)
            X.1DT r0 = r13.A0M
            r0.A0F(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3TA.A0W(android.text.Editable, X.1BI, X.00H, boolean, boolean):void");
    }

    public void CJU(String str, int i) {
        int i2;
        C200710s r2 = this.A0p;
        if (i == 2) {
            i2 = 10;
        } else {
            i2 = 11;
        }
        r2.execute(new C146817Qs(i2, str, this));
    }

    public void CJV(C693536w r4, String str, int i) {
        int i2;
        C200710s r2 = this.A0p;
        if (i == 2) {
            i2 = 19;
        } else {
            i2 = 20;
        }
        r2.execute(new C21467AkY(this, r4, str, i2));
    }

    public void CJW(C693536w r4, String str, int i) {
        int i2;
        C200710s r2 = this.A0p;
        if (i == 2) {
            i2 = 23;
        } else {
            i2 = 18;
        }
        r2.execute(new C21467AkY(this, r4, str, i2));
    }

    public void CJX(AnonymousClass85B r4, String str, int i) {
        int i2;
        C200710s r2 = this.A0p;
        if (i == 2) {
            i2 = 21;
        } else {
            i2 = 22;
        }
        r2.execute(new C21467AkY(this, r4, str, i2));
    }

    public static void A00(C143887Fe r3, AnonymousClass3TA r4, AnonymousClass4DX r5) {
        String str;
        if (!r4.A0D) {
            r4.A0I.A0E(r3);
        } else if (r3 != null && !r4.A0F) {
            AnonymousClass1DT r2 = r4.A0M;
            try {
                str = r3.A0D();
            } catch (MalformedURLException unused) {
                str = r3.A0S;
            }
            r2.A0E(new AnonymousClass4UK(r3, r5, str));
        }
    }

    public static void A03(C143887Fe r3, AnonymousClass3TA r4, AnonymousClass4DX r5) {
        String str;
        if (!r4.A0D) {
            r4.A0I.A0E(r3);
        } else if (r3 != null) {
            AnonymousClass1DT r2 = r4.A0M;
            try {
                str = r3.A0D();
            } catch (MalformedURLException unused) {
                str = r3.A0S;
            }
            r2.A0E(new AnonymousClass4UK(r3, r5, str));
        }
    }

    private void A04(C143887Fe r4, AnonymousClass4DX r5) {
        String str;
        if (!this.A0D) {
            this.A0I.A0E(r4);
        } else if (r4 != null) {
            AnonymousClass1DT r2 = this.A0M;
            try {
                str = r4.A0D();
            } catch (MalformedURLException unused) {
                str = r4.A0S;
            }
            r2.A0F(new AnonymousClass4UK(r4, r5, str));
        }
    }

    public static void A05(AnonymousClass3TA r2, UserJid userJid) {
        String str;
        if (r2.A00 != null) {
            C42741yf A022 = r2.A0X.A02(userJid);
            if (A022 == null || (str = A022.A08) == null) {
                r2.A0Q.A01(new GetVNameCertificateJob(userJid));
                return;
            }
            C143887Fe r1 = r2.A00;
            r1.A0B = str;
            A03(r1, r2, AnonymousClass4DX.PAGE_UPDATED);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x003b, code lost:
        if (r1 == X.AnonymousClass00R.A0Y) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A06(X.AnonymousClass3TA r5, X.C693536w r6, boolean r7, boolean r8) {
        /*
            X.0ve r2 = r5.A0e
            r1 = 9584(0x2570, float:1.343E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r2, r1)
            r4 = 0
            if (r0 == 0) goto L_0x0036
            X.4O2 r0 = r5.A01
            if (r0 == 0) goto L_0x0036
            if (r7 == 0) goto L_0x001a
            X.1DT r1 = r5.A0K
            X.85B r0 = r0.A01
            r1.A0E(r0)
        L_0x001a:
            if (r8 == 0) goto L_0x0036
            X.4O2 r0 = r5.A01
            X.206 r3 = r0.A00
            if (r3 == 0) goto L_0x0036
            X.36w r2 = r5.A05
            if (r2 == 0) goto L_0x003d
            java.lang.Integer r1 = r5.A07
            java.lang.Integer r0 = X.AnonymousClass00R.A0N
            if (r1 != r0) goto L_0x0039
            X.1DT r1 = r5.A0J
            X.4UP r0 = new X.4UP
            r0.<init>(r3, r2, r6)
            r1.A0E(r0)
        L_0x0036:
            r5.A01 = r4
            return
        L_0x0039:
            java.lang.Integer r0 = X.AnonymousClass00R.A0Y
            if (r1 != r0) goto L_0x0036
        L_0x003d:
            X.1DT r1 = r5.A0J
            X.4UP r0 = new X.4UP
            r0.<init>(r3, r4, r6)
            r1.A0E(r0)
            goto L_0x0036
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3TA.A06(X.3TA, X.36w, boolean, boolean):void");
    }

    public static void A07(AnonymousClass3TA r5, C693536w r6, boolean z, boolean z2) {
        C693536w r4;
        Integer num;
        AnonymousClass4O2 r0 = r5.A02;
        if (r0 != null) {
            if (z) {
                r5.A0L.A0E(r0.A01);
            }
            if (z2 && r5.A02.A00 != null) {
                if (!C18020vd.A05(C18040vf.A02, r5.A0e, 9584) || (r4 = r5.A04) == null || (num = r5.A06) == AnonymousClass00R.A0Y) {
                    r5.A0J.A0E(new AnonymousClass4UP(r5.A02.A00, r6, (C693536w) null));
                } else if (num == AnonymousClass00R.A0N) {
                    r5.A0J.A0E(new AnonymousClass4UP(r5.A02.A00, r6, r4));
                }
            }
        }
        r5.A02 = null;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.3hJ, X.7Fe] */
    private void A08(UserJid userJid, AnonymousClass00H r9, String str) {
        C18030ve r3 = this.A0e;
        C32011gU r2 = this.A0g;
        AnonymousClass181 r1 = this.A0P;
        C18070vi.A0o(r3, r2, r1);
        ? r0 = new C143887Fe(r1, r3, r2, str);
        r0.A00 = userJid;
        this.A00 = r0;
        Application application = this.A00;
        C18070vi.A0z(application, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
        int dimensionPixelSize = application.getResources().getDimensionPixelSize(2131169024);
        AEI A0B2 = this.A0U.A0B(userJid);
        if (A0B2 != null) {
            ((C20005A2v) r9.get()).A04((ImageView) null, A0B2, (B7F) null, new C20489ANa(userJid, this, 0), 2);
            return;
        }
        CatalogManager catalogManager = this.A0V;
        C193429q5 A062 = CatalogManager.A00(catalogManager).A06(userJid);
        if ((A062 == null || A062.A01) && !catalogManager.A02) {
            catalogManager.A0E(userJid, dimensionPixelSize);
        } else {
            this.A0q.CGF(new C70633Bw(this, userJid, 0));
        }
    }

    public void A0S() {
        for (Runnable run : this.A0s) {
            run.run();
        }
        Runnable runnable = this.A09;
        if (runnable != null) {
            this.A0G.removeCallbacks(runnable);
            this.A09 = null;
        }
        this.A03 = null;
    }

    public void A0T() {
        C143887Fe r1 = this.A00;
        if (r1 instanceof C75353hJ) {
            UserJid userJid = ((C75353hJ) r1).A00;
            String A092 = this.A0S.A09(userJid);
            if (A092 != null) {
                this.A00.A0A = A092;
            }
            A05(this, userJid);
        }
    }

    public void A0U() {
        C143887Fe r1;
        if (C18020vd.A05(C18040vf.A02, this.A0e, 9584) && this.A08 == AnonymousClass00R.A0C && this.A06 == AnonymousClass00R.A00 && (r1 = this.A00) != null && r1.A0I != null && this.A0B && !(r1 instanceof C75373hL)) {
            this.A0q.CGF(new C98554rL(this, 17));
        }
    }

    public void A0X(C143887Fe r3) {
        if (this.A08 == AnonymousClass00R.A01 && r3 != null && r3.A0S.equals(this.A0A)) {
            this.A08 = AnonymousClass00R.A0C;
            Integer num = AnonymousClass00R.A00;
            this.A07 = num;
            this.A06 = num;
            this.A00 = r3;
            this.A05 = null;
            this.A04 = null;
        }
    }

    public void A0Y(AnonymousClass1BI r6, AnonymousClass00H r7, String str) {
        if (str != null) {
            if (this.A0d.A0J(str)) {
                PhoneUserJid A062 = C32981i4.A06(Uri.parse(str));
                if (A062 != null) {
                    A08(A062, r7, str);
                    return;
                }
            } else {
                BDO bdo = this.A0W;
                if (!bdo.BgR() || !((ANI) bdo).A06.A01(str)) {
                    C18070vi.A0d(this.A0e, 0);
                } else {
                    C18030ve r3 = this.A0e;
                    C32011gU r2 = this.A0g;
                    AnonymousClass181 r1 = this.A0P;
                    C18070vi.A0o(r3, r2, r1);
                    this.A00 = new C143887Fe(r1, r3, r2, str);
                    bdo.CFZ(this.A0n, str);
                    return;
                }
            }
            A0Z(r6, str);
        }
    }

    public void A0Z(AnonymousClass1BI r12, String str) {
        if (!this.A0m.A00()) {
            this.A03 = new C96534o0(this, SystemClock.elapsedRealtime());
            String str2 = str;
            if (C22971Dz.A0V(r12)) {
                if (C18020vd.A05(C18040vf.A02, this.A0j.A02, 5287)) {
                    C85184Mk r4 = this.A0k;
                    r4.A00.CGF(new C21467AkY(r4, new C96904ob(this, str), str, 44));
                    return;
                }
            }
            AnonymousClass1KB r2 = this.A0N;
            AnonymousClass10I r8 = this.A0q;
            C18000vb r42 = this.A0b;
            AnonymousClass5a2 r7 = this.A03;
            boolean z = this.A0E;
            C18030ve r5 = this.A0e;
            AnonymousClass4WC.A00(r2, new C143887Fe(this.A0P, r5, this.A0g, str), r42, r5, this.A0f, r7, r8, str2, z);
        }
    }

    public void A0a(String str) {
        if (this.A0m.A00()) {
            str = null;
        }
        if (!C42171xk.A00(str, this.A0A)) {
            this.A08 = AnonymousClass00R.A01;
            Integer num = AnonymousClass00R.A00;
            this.A07 = num;
            this.A06 = num;
            this.A0A = str;
            this.A0B = true;
            this.A00 = null;
            this.A05 = null;
            this.A04 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002f, code lost:
        if (r1 == false) goto L_0x0031;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        if (r1 == false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0b(java.lang.String r5) {
        /*
            r4 = this;
            java.lang.String r0 = r4.A0A
            boolean r0 = android.text.TextUtils.equals(r0, r5)
            if (r0 == 0) goto L_0x0035
            r0 = 0
            r4.A0B = r0
            r3 = 0
            r4.A00 = r3
            r4.A05 = r3
            r4.A04 = r3
            X.4O2 r0 = r4.A02
            r2 = 0
            if (r0 == 0) goto L_0x0020
            java.lang.String r0 = r0.A02
            boolean r1 = android.text.TextUtils.equals(r0, r5)
            r0 = 1
            if (r1 != 0) goto L_0x0021
        L_0x0020:
            r0 = 0
        L_0x0021:
            A07(r4, r3, r0, r2)
            X.4O2 r0 = r4.A01
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r0.A02
            boolean r1 = android.text.TextUtils.equals(r0, r5)
            r0 = 1
            if (r1 != 0) goto L_0x0032
        L_0x0031:
            r0 = 0
        L_0x0032:
            A06(r4, r3, r0, r2)
        L_0x0035:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3TA.A0b(java.lang.String):void");
    }

    public boolean A0c() {
        C143887Fe r0 = this.A00;
        if (r0 == null || !TextUtils.equals(this.A0A, r0.A0S) || !this.A00.A0K() || !this.A0B) {
            return false;
        }
        return true;
    }

    public boolean A0d() {
        C143887Fe r1;
        if (this.A08 != AnonymousClass00R.A0C || this.A07 != AnonymousClass00R.A00 || (r1 = this.A00) == null || r1.A0K == null || !this.A0B || (r1 instanceof C75373hL)) {
            return false;
        }
        return true;
    }

    public void A0V(int i) {
        if (A0d()) {
            this.A0q.CGF(new AnonymousClass7RP(this, i, 47));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass3TA(Application application, Handler handler, AnonymousClass1KB r8, AnonymousClass11S r9, AnonymousClass181 r10, C25001Mm r11, C23651Hc r12, C26911Ty r13, C36211nW r14, C20114A7x a7x, CatalogManager catalogManager, BDO bdo, AnonymousClass1PM r18, C86434Rp r19, AnonymousClass11P r20, C19830z4 r21, C18000vb r22, C822444b r23, C32981i4 r24, C18030ve r25, AnonymousClass18K r26, C32011gU r27, AnonymousClass1T6 r28, AnonymousClass1OZ r29, AnonymousClass1c4 r30, C85184Mk r31, AnonymousClass1QD r32, AnonymousClass4QJ r33, AnonymousClass10I r34, AnonymousClass00H r35) {
        super(application);
        AnonymousClass10I r2 = r34;
        C200710s r1 = new C200710s(r2, false);
        Integer num = AnonymousClass00R.A00;
        this.A08 = num;
        this.A07 = num;
        this.A06 = num;
        this.A0F = false;
        this.A03 = null;
        AnonymousClass1DT A0L2 = AnonymousClass3MW.A0L();
        this.A0I = A0L2;
        this.A0M = AnonymousClass3MW.A0L();
        this.A0H = C22791Df.A01(A0L2, C99244sV.A00(this, 21));
        this.A0J = AnonymousClass3MW.A0L();
        this.A0L = AnonymousClass3MW.A0L();
        this.A0K = AnonymousClass3MW.A0L();
        this.A0s = new LinkedList();
        this.A0n = new C97834q8(this);
        this.A0o = new C98024qS(this);
        this.A0Z = r20;
        this.A0e = r25;
        this.A0N = r8;
        this.A0T = r14;
        this.A0q = r2;
        this.A0g = r27;
        this.A0f = r26;
        this.A0P = r10;
        this.A0W = bdo;
        this.A0Q = r11;
        this.A0i = r29;
        this.A0V = catalogManager;
        this.A0d = r24;
        this.A0b = r22;
        this.A0h = r28;
        this.A0j = r30;
        this.A0R = r12;
        this.A0m = r33;
        this.A0U = a7x;
        this.A0X = r18;
        this.A0a = r21;
        this.A0l = r32;
        this.A0S = r13;
        this.A0Y = r19;
        this.A0k = r31;
        this.A0G = handler;
        this.A0c = r23;
        this.A0O = r9;
        this.A0p = r1;
        this.A0r = r35;
    }
}
