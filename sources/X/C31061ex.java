package X;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.1ex  reason: invalid class name and case insensitive filesystem */
public class C31061ex {
    public final AnonymousClass1KB A00;
    public final AnonymousClass11P A01;
    public final AnonymousClass118 A02;
    public final AnonymousClass121 A03;
    public final AnonymousClass1KH A04;
    public final C18030ve A05;
    public final AnonymousClass1QL A06;
    public final C31051ew A07;
    public final AnonymousClass1QD A08;
    public final AnonymousClass1QJ A09;
    public final AnonymousClass1QO A0A;
    public final AnonymousClass1QS A0B;
    public final C31041ev A0C;
    public final AnonymousClass1QE A0D = AnonymousClass1QE.A00("PaymentsActionManager", "network", "COMMON");
    public final C30941el A0E;
    public final AnonymousClass1PP A0F;
    public final C30951em A0G;
    public final AnonymousClass00H A0H;
    public final AnonymousClass00H A0I;
    public final AnonymousClass11S A0J;
    public final AnonymousClass181 A0K;
    public final C30931ek A0L;
    public final C220418j A0M;
    public final AnonymousClass00H A0N = C221618v.A00(AnonymousClass16J.class);
    public final AnonymousClass00H A0O;

    public C29621ca A04(AnonymousClass1KJ r11, AnonymousClass1KN r12, String str) {
        AnonymousClass1KJ r5 = r11;
        BD1 A002 = A00(r11, this);
        String str2 = ((AnonymousClass1KL) r5).A06;
        C18070vi.A0W(str2);
        int BPo = A002.BPo(str2);
        return A05(r5, str, BPo, (long) ((int) (r12.A00.doubleValue() * ((double) BPo))));
    }

    public void A0B(C33661jB r16, BD1 bd1) {
        SharedPreferences sharedPreferences;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new AnonymousClass1MD("version", 3));
        arrayList.add(new AnonymousClass1MD("action", "get-methods"));
        C30931ek r1 = this.A0L;
        if (r1.A01() != null) {
            arrayList.add(new AnonymousClass1MD("device-id", r1.A01()));
        }
        C53692cw r8 = new C53692cw(new C56942iH((AnonymousClass1MD[]) arrayList.toArray(new AnonymousClass1MD[0])));
        C30941el r3 = this.A0E;
        synchronized (r3) {
            sharedPreferences = r3.A00;
            if (sharedPreferences == null) {
                sharedPreferences = r3.A01.A05("com.whatsapp_payment_sync_preferences");
                r3.A00 = sharedPreferences;
            }
        }
        String string = sharedPreferences.getString(r8.A01.A00(), (String) null);
        if (string != null) {
            arrayList.add(new AnonymousClass1MD("instance-id", string));
        }
        C29621ca r11 = new C29621ca("account", (AnonymousClass1MD[]) arrayList.toArray(new AnonymousClass1MD[0]));
        BD1 bd12 = bd1;
        BD4 BRb = bd12.BRb();
        if (BRb != null) {
            BRb.COK();
        }
        C33661jB r4 = r16;
        A0I(new AnonymousClass2LV(this.A02.A00, r4, (C33711jG) this.A0I.get(), this, bd12, r8, this.A00, string), r11, "get", 0);
    }

    public void A0C(C33661jB r11, C29621ca r12) {
        Context context = this.A02.A00;
        AnonymousClass1KB r3 = this.A00;
        C175428yh r0 = new C175428yh(context, (C33711jG) this.A0I.get(), r3, r11, this, 2);
        A0I(r0, r12, "set", C20113A7w.A0L);
    }

    public void A0D(C33661jB r11, C29621ca r12) {
        Context context = this.A02.A00;
        AnonymousClass1KB r3 = this.A00;
        C175428yh r0 = new C175428yh(context, (C33711jG) this.A0I.get(), r3, r11, this, 1);
        A0I(r0, r12, "set", C20113A7w.A0L);
    }

    public void A0F(C33661jB r15, C178819Eo r16) {
        AnonymousClass00H r1 = this.A0H;
        String A0B2 = ((AnonymousClass1OZ) r1.get()).A0B();
        AnonymousClass9F6 r0 = new AnonymousClass9F6(r16, A0B2);
        Context context = this.A02.A00;
        AnonymousClass1KB r3 = this.A00;
        ((AnonymousClass1OZ) r1.get()).A0I(new C175428yh(context, (C33711jG) this.A0I.get(), r3, r15, this, 0), (C29621ca) r0.A00, A0B2, 204, 0);
    }

    public static BD1 A00(AnonymousClass1KJ r2, C31061ex r3) {
        C63572tK A022 = r3.A09.A02();
        A022.getClass();
        C57312is A042 = r3.A0B.A04(A022.A03);
        A042.getClass();
        String str = ((AnonymousClass1KL) r2).A06;
        C18070vi.A0W(str);
        BD1 A002 = A042.A00(str);
        A002.getClass();
        return A002;
    }

    public String A06() {
        return ((AnonymousClass1OZ) this.A0H.get()).A0B();
    }

    public void A08(C22442B7y b7y, C29621ca r11, boolean z) {
        ArrayList A052 = this.A0G.A05(r11.A0K("account"));
        C22442B7y b7y2 = b7y;
        if (A052 == null || A052.isEmpty()) {
            AnonymousClass1QS r0 = this.A0B;
            AnonymousClass1QS.A00(r0);
            A5I a5i = r0.A00;
            C17960vV.A07(a5i);
            C17960vV.A07(a5i);
            AnonymousClass10I r8 = a5i.A03;
            r8.CGD(new C170228ow(b7y2, a5i, a5i.A01, a5i.A02, r8), new Void[0]);
        } else if (AnonymousClass1KH.A05(A052)) {
            AnonymousClass1QS r02 = this.A0B;
            AnonymousClass1QS.A00(r02);
            A5I a5i2 = r02.A00;
            C17960vV.A07(a5i2);
            C17960vV.A07(a5i2);
            a5i2.A05(b7y, A052);
        } else if (z) {
            A0A((C33661jB) null);
            return;
        } else {
            return;
        }
        A0K(A052);
        this.A08.A0C();
    }

    @Deprecated
    public void A0A(C33661jB r2) {
        A0B(r2, this.A0B.A06());
    }

    public void A0H(AnonymousClass1O5 r8, C29621ca r9, String str, long j) {
        ((AnonymousClass1OZ) this.A0H.get()).A0I(r8, r9, str, 204, j);
    }

    public void A0J(AnonymousClass1O5 r10, C29621ca r11, String str, String str2, long j) {
        AnonymousClass00H r3 = this.A0H;
        String A0B2 = ((AnonymousClass1OZ) r3.get()).A0B();
        ((AnonymousClass1OZ) r3.get()).A0I(r10, new C29621ca(r11, "iq", new AnonymousClass1MD[]{new AnonymousClass1MD((Jid) C173438v4.A00, "to"), new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str), new AnonymousClass1MD((String) PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B2), new AnonymousClass1MD("xmlns", str2)}), A0B2, 204, j);
    }

    public void A0K(ArrayList arrayList) {
        AnonymousClass1QD r0;
        boolean z;
        if (arrayList != null && arrayList.size() > 0) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C20284AEs aEs = (C20284AEs) it.next();
                if ((aEs instanceof AnonymousClass8pK) && aEs.A01 == 2) {
                    r0 = this.A08;
                    z = true;
                    break;
                }
            }
            r0.A03().edit().putBoolean("payments_card_can_receive_payment", z).apply();
        }
        r0 = this.A08;
        z = false;
        r0.A03().edit().putBoolean("payments_card_can_receive_payment", z).apply();
    }

    public boolean A0M(AnonymousClass1KN r24, AEX aex, UserJid userJid, AnonymousClass206 r27) {
        AnonymousClass1QE r4;
        StringBuilder sb;
        if (!this.A0A.A04(0)) {
            r4 = this.A0D;
            sb = new StringBuilder();
            sb.append("requestPayment is not enabled for country: ");
            sb.append(this.A09.A02());
        } else {
            AnonymousClass206 r2 = r27;
            AnonymousClass1BI r3 = r2.A0v.A00;
            UserJid userJid2 = userJid;
            if (r3 != null && (!C22971Dz.A0e(r3) || userJid != null)) {
                AnonymousClass1KN r10 = r24;
                if (r24 != null) {
                    AnonymousClass1QJ r6 = this.A09;
                    C63572tK A022 = r6.A02();
                    C17960vV.A07(A022);
                    AnonymousClass1KJ r0 = A022.A02;
                    BD1 A002 = A00(r0, this);
                    AnonymousClass11S r32 = this.A0J;
                    r32.A0I();
                    AnonymousClass1E8 r33 = r32.A0D;
                    C17960vV.A07(r33);
                    String str = ((AnonymousClass1KL) r6.A01()).A06;
                    C18070vi.A0W(str);
                    AnonymousClass1KJ A012 = r6.A01();
                    AnonymousClass1PP r34 = this.A0F;
                    String A003 = AnonymousClass1PP.A00(r34.A00, r34.A01, false);
                    String str2 = r6.A02().A03;
                    int BZ3 = A002.BZ3();
                    C20128A8n a8n = C20128A8n.$redex_init_class;
                    AW0 A023 = C20128A8n.A02(A012, r10, userJid2, (UserJid) r33.A0J, str, A003, str2, 10, 11, C196679vS.A00(str2), BZ3, 0, -1);
                    A023.A0B(aex);
                    AnonymousClass8pG BdL = A002.BdL();
                    BD1 A004 = A00(r0, this);
                    String str3 = ((AnonymousClass1KL) r0).A06;
                    C18070vi.A0W(str3);
                    int BPo = A004.BPo(str3);
                    long doubleValue = (long) ((int) (r10.A00.doubleValue() * ((double) BPo)));
                    if (BPo <= 0) {
                        BPo = 1;
                    }
                    C17960vV.A07(r0);
                    BdL.A00 = C196669vR.A00(r0, BPo, doubleValue);
                    A023.A0A = BdL;
                    r2.A0I = AnonymousClass11P.A01(this.A01);
                    AnonymousClass25B.A03(r2, new AnonymousClass25E(A023, "UNSET"));
                    long j = r2.A0I;
                    A023.A05 = j;
                    A023.A02 = 12;
                    AnonymousClass8pG r42 = A023.A0A;
                    this.A0B.A06().BWW();
                    A023.A09(r42, j + 604800000);
                    return true;
                }
            }
            r4 = this.A0D;
            sb = new StringBuilder();
            sb.append("requestPayment found null or empty args jid: ");
            sb.append(r3);
            sb.append(" receiver: ");
            sb.append(userJid2);
        }
        r4.A06(sb.toString());
        return false;
    }

    public C31061ex(AnonymousClass1KB r4, AnonymousClass11S r5, AnonymousClass181 r6, AnonymousClass11P r7, AnonymousClass118 r8, AnonymousClass121 r9, AnonymousClass1KH r10, C18030ve r11, AnonymousClass1QL r12, C31051ew r13, AnonymousClass1QD r14, AnonymousClass1QJ r15, AnonymousClass1QO r16, AnonymousClass1QS r17, C31041ev r18, C30941el r19, C30931ek r20, AnonymousClass1PP r21, C30951em r22, C220418j r23, AnonymousClass00H r24, AnonymousClass00H r25, AnonymousClass00H r26) {
        this.A02 = r8;
        this.A01 = r7;
        this.A05 = r11;
        this.A00 = r4;
        this.A0J = r5;
        this.A0K = r6;
        this.A04 = r10;
        this.A0H = r24;
        this.A0L = r20;
        this.A0B = r17;
        this.A03 = r9;
        this.A0M = r23;
        this.A0F = r21;
        this.A08 = r14;
        this.A06 = r12;
        this.A0O = r25;
        this.A0E = r19;
        this.A0G = r22;
        this.A0A = r16;
        this.A09 = r15;
        this.A0C = r18;
        this.A0I = r26;
        this.A07 = r13;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [X.2r3, java.lang.Object] */
    public ARR A01(AnonymousClass1KJ r6, AnonymousClass1KN r7) {
        BD1 A002 = A00(r6, this);
        String str = ((AnonymousClass1KL) r6).A06;
        C18070vi.A0W(str);
        int BPo = A002.BPo(str);
        int doubleValue = (int) (r7.A00.doubleValue() * ((double) BPo));
        ? obj = new Object();
        obj.A02 = r6;
        obj.A00 = BPo;
        obj.A01 = (long) doubleValue;
        return obj.A00();
    }

    public AW0 A02(AnonymousClass1KJ r5, AnonymousClass1KN r6, C20284AEs aEs, AnonymousClass8pG r8, AEX aex, AnonymousClass206 r10, String str, String str2, boolean z) {
        if (!A0L(r5, r6, aEs, r8, aex, r10, str, str2, z)) {
            return null;
        }
        this.A03.BBY(r10);
        AnonymousClass16J r3 = (AnonymousClass16J) this.A0N.get();
        String str3 = r10.A0v.A01;
        AW0 A002 = AnonymousClass25B.A00(r10);
        synchronized (r3) {
            if (A002 != null) {
                r3.A02.put(str3, A002);
            }
        }
        this.A0C.A01(aex, r10);
        AW0 A003 = AnonymousClass25B.A00(r10);
        C17960vV.A07(A003);
        return A003;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c4, code lost:
        r1.A08 = r3.A0K;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00c8, code lost:
        if (r10 != false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00ca, code lost:
        if (r9 == false) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00d0, code lost:
        if (r3.A0L() == false) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d2, code lost:
        r1.A07 = "captured";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00da, code lost:
        if (r3.A03() != null) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00e0, code lost:
        if (r3.A02() == null) goto L_0x00e6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00e2, code lost:
        r1.A03 = r3.A08;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00e6, code lost:
        if (r9 == false) goto L_0x00ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e8, code lost:
        r1.A06 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ea, code lost:
        r11.A03.CQw(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00f2, code lost:
        if (r1 != null) goto L_0x00c4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.AW0 A03(X.C29621ca r12) {
        /*
            r11 = this;
            java.lang.String r0 = "service"
            r4 = 0
            java.lang.String r2 = r12.A0Q(r0, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 != 0) goto L_0x0013
            X.1QS r0 = r11.A0B
            r0.A05(r2)
        L_0x0013:
            X.1em r0 = r11.A0G
            X.AW0 r3 = r0.A03(r4, r12)
            if (r3 != 0) goto L_0x001c
            return r4
        L_0x001c:
            java.lang.String r0 = "is_p2m_hybrid"
            java.lang.String r0 = r12.A0Q(r0, r4)
            java.lang.String r1 = "1"
            boolean r10 = r1.equals(r0)
            java.lang.String r0 = "is_hpp"
            java.lang.String r0 = r12.A0Q(r0, r4)
            boolean r9 = r1.equals(r0)
            java.lang.String r0 = "P2M_LITE"
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x003e
            if (r10 != 0) goto L_0x003e
            if (r9 == 0) goto L_0x00ef
        L_0x003e:
            java.lang.String r0 = "order"
            X.1ca r1 = r12.A0K(r0)
            if (r1 == 0) goto L_0x00ef
            java.lang.String r0 = "id"
            java.lang.String r7 = r1.A0Q(r0, r4)
            java.lang.String r0 = "message_id"
            java.lang.String r5 = r1.A0Q(r0, r4)
            boolean r0 = android.text.TextUtils.isEmpty(r5)
            if (r0 != 0) goto L_0x00ef
            X.1BI r2 = r3.A0C
            r0 = 0
            X.205 r1 = new X.205
            r1.<init>(r2, r5, r0)
            X.00H r0 = r11.A0O
            java.lang.Object r0 = r0.get()
            X.2lL r0 = (X.C58842lL) r0
            X.00H r0 = r0.A00
            X.206 r2 = X.AnonymousClass1W2.A01(r1, r0)
            r8 = r2
            X.21K r8 = (X.AnonymousClass21K) r8
            if (r8 == 0) goto L_0x00ef
            X.AEt r6 = r8.BPK()
            if (r6 == 0) goto L_0x00ef
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x00f0
            int r1 = r6.A00
            r0 = 7
            if (r1 != r0) goto L_0x00f0
            X.ADa r0 = r6.A04
            if (r0 == 0) goto L_0x00f0
            X.0ve r5 = r11.A05
            r1 = 8355(0x20a3, float:1.1708E-41)
            X.0vf r0 = X.C18040vf.A02
            boolean r0 = X.C18020vd.A05(r0, r5, r1)
            if (r0 == 0) goto L_0x00f0
            X.21L r8 = (X.AnonymousClass21L) r8
            java.util.List r0 = r8.A17()
            if (r0 == 0) goto L_0x00f0
            java.util.Iterator r5 = r0.iterator()
        L_0x00a0:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00f0
            java.lang.Object r1 = r5.next()
            X.206 r1 = (X.AnonymousClass206) r1
            boolean r0 = r1 instanceof X.AnonymousClass21K
            if (r0 == 0) goto L_0x00a0
            X.21K r1 = (X.AnonymousClass21K) r1
            X.AEt r0 = r1.BPK()
            if (r0 == 0) goto L_0x00a0
            X.AEn r1 = r0.A02
            if (r1 == 0) goto L_0x00a0
            java.lang.String r0 = r1.A0K
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x00a0
        L_0x00c4:
            java.lang.String r0 = r3.A0K
            r1.A08 = r0
            if (r10 != 0) goto L_0x00cc
            if (r9 == 0) goto L_0x00ea
        L_0x00cc:
            boolean r0 = r3.A0L()
            if (r0 == 0) goto L_0x00ea
            java.lang.String r0 = "captured"
            r1.A07 = r0
            X.BDa r0 = r3.A03()
            if (r0 != 0) goto L_0x00e2
            X.BDa r0 = r3.A02()
            if (r0 == 0) goto L_0x00e6
        L_0x00e2:
            X.BDa r0 = r3.A08
            r1.A03 = r0
        L_0x00e6:
            if (r9 == 0) goto L_0x00ea
            r1.A06 = r4
        L_0x00ea:
            X.121 r0 = r11.A03
            r0.CQw(r2)
        L_0x00ef:
            return r3
        L_0x00f0:
            X.AEn r1 = r6.A02
            if (r1 == 0) goto L_0x00ef
            goto L_0x00c4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31061ex.A03(X.1ca):X.AW0");
    }

    public C29621ca A05(AnonymousClass1KJ r4, String str, int i, long j) {
        BD1 A002 = A00(r4, this);
        if (i <= 0) {
            i = 1;
        }
        C17960vV.A07(r4);
        return new C29621ca(A002.BV4(C196669vR.A00(r4, i, j)), str, (AnonymousClass1MD[]) null);
    }

    /* JADX WARNING: Removed duplicated region for block: B:46:0x0184  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x018e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String A07(X.A7B r10, java.util.List r11) {
        /*
            r9 = this;
            X.C17960vV.A07(r11)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.util.Iterator r3 = r11.iterator()
        L_0x000c:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0040
            java.lang.Object r1 = r3.next()
            X.0yx r1 = (X.C19760yx) r1
            java.lang.Object r0 = r1.A00     // Catch:{ UnsupportedEncodingException -> 0x0037 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ UnsupportedEncodingException -> 0x0037 }
            r4.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0037 }
            java.lang.String r0 = "="
            r4.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0037 }
            java.lang.Object r1 = r1.A01     // Catch:{ UnsupportedEncodingException -> 0x0037 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ UnsupportedEncodingException -> 0x0037 }
            java.lang.String r0 = X.C19620yd.A0A     // Catch:{ UnsupportedEncodingException -> 0x0037 }
            java.lang.String r0 = java.net.URLEncoder.encode(r1, r0)     // Catch:{ UnsupportedEncodingException -> 0x0037 }
            r4.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0037 }
            java.lang.String r0 = "&"
            r4.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0037 }
            goto L_0x000c
        L_0x0037:
            r2 = move-exception
            X.1QE r1 = r9.A0D
            java.lang.String r0 = "httpRequestFBToken threw while encoding query: "
            r1.A0A(r0, r2)
            goto L_0x000c
        L_0x0040:
            java.lang.String r2 = r4.toString()
            r3 = 0
            java.lang.String r1 = "https://secure.facebook.com/payments/generate_token"
            java.net.URL r0 = new java.net.URL     // Catch:{ MalformedURLException -> 0x0192 }
            r0.<init>(r1)     // Catch:{ MalformedURLException -> 0x0192 }
            java.net.URLConnection r4 = r0.openConnection()     // Catch:{ IOException -> 0x0170, all -> 0x018b }
            boolean r0 = r4 instanceof javax.net.ssl.HttpsURLConnection     // Catch:{ IOException -> 0x0170, all -> 0x018b }
            if (r0 == 0) goto L_0x0161
            javax.net.ssl.HttpsURLConnection r4 = (javax.net.ssl.HttpsURLConnection) r4     // Catch:{ IOException -> 0x0170, all -> 0x018b }
            java.lang.String r0 = "POST"
            r4.setRequestMethod(r0)     // Catch:{ IOException -> 0x015f }
            X.18j r0 = r9.A0M     // Catch:{ IOException -> 0x015f }
            X.9AA r0 = r0.A00()     // Catch:{ IOException -> 0x015f }
            r4.setSSLSocketFactory(r0)     // Catch:{ IOException -> 0x015f }
            r0 = 15000(0x3a98, float:2.102E-41)
            r4.setConnectTimeout(r0)     // Catch:{ IOException -> 0x015f }
            r0 = 30000(0x7530, float:4.2039E-41)
            r4.setReadTimeout(r0)     // Catch:{ IOException -> 0x015f }
            java.lang.String r1 = "Content-Length"
            int r0 = r2.length()     // Catch:{ IOException -> 0x015f }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ IOException -> 0x015f }
            r4.setRequestProperty(r1, r0)     // Catch:{ IOException -> 0x015f }
            java.lang.String r1 = "Content-Type"
            java.lang.String r0 = "application/x-www-form-urlencoded"
            r4.setRequestProperty(r1, r0)     // Catch:{ IOException -> 0x015f }
            java.lang.String r1 = "User-Agent"
            java.lang.String r0 = "curl/7.49.1"
            r4.setRequestProperty(r1, r0)     // Catch:{ IOException -> 0x015f }
            java.lang.String r1 = "Accept-Encoding"
            java.lang.String r0 = "identity"
            r4.setRequestProperty(r1, r0)     // Catch:{ IOException -> 0x015f }
            r0 = 1
            r4.setDoInput(r0)     // Catch:{ IOException -> 0x015f }
            r4.setDoOutput(r0)     // Catch:{ IOException -> 0x015f }
            r4.connect()     // Catch:{ IOException -> 0x015f }
            X.181 r8 = r9.A0K     // Catch:{ IOException -> 0x015f }
            r0 = 14
            java.lang.Integer r7 = java.lang.Integer.valueOf(r0)     // Catch:{ IOException -> 0x015f }
            java.io.OutputStream r0 = r4.getOutputStream()     // Catch:{ IOException -> 0x015f }
            X.9He r1 = new X.9He     // Catch:{ IOException -> 0x015f }
            r1.<init>(r8, r0, r3, r7)     // Catch:{ IOException -> 0x015f }
            java.lang.String r5 = X.C19620yd.A0A     // Catch:{ IOException -> 0x015f }
            byte[] r0 = r2.getBytes(r5)     // Catch:{ IOException -> 0x015f }
            r1.write(r0)     // Catch:{ IOException -> 0x015f }
            r1.flush()     // Catch:{ IOException -> 0x015f }
            X.1QE r2 = r9.A0D     // Catch:{ IOException -> 0x015f }
            java.lang.String r0 = "httpRequestFBToken connecting to URL: https://secure.facebook.com/payments/generate_token"
            r2.A06(r0)     // Catch:{ IOException -> 0x015f }
            int r6 = r4.getResponseCode()     // Catch:{ IOException -> 0x015f }
            r0 = 200(0xc8, float:2.8E-43)
            if (r6 != r0) goto L_0x0131
            java.io.InputStream r0 = r4.getInputStream()     // Catch:{ IOException -> 0x015f }
            X.9Hb r1 = new X.9Hb     // Catch:{ IOException -> 0x015f }
            r1.<init>(r8, r0, r3, r7)     // Catch:{ IOException -> 0x015f }
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x015f }
            r0.<init>(r1, r5)     // Catch:{ IOException -> 0x015f }
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ IOException -> 0x015f }
            r5.<init>(r0)     // Catch:{ IOException -> 0x015f }
            r0 = 1024(0x400, float:1.435E-42)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x015f }
            r1.<init>(r0)     // Catch:{ IOException -> 0x015f }
            java.lang.String r0 = r5.readLine()     // Catch:{ IOException -> 0x015f }
        L_0x00e4:
            if (r0 == 0) goto L_0x00ee
            r1.append(r0)     // Catch:{ IOException -> 0x015f }
            java.lang.String r0 = r5.readLine()     // Catch:{ IOException -> 0x015f }
            goto L_0x00e4
        L_0x00ee:
            java.lang.String r5 = r1.toString()     // Catch:{ IOException -> 0x015f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x015f }
            r1.<init>()     // Catch:{ IOException -> 0x015f }
            java.lang.String r0 = "httpRequestFBToken got response code: "
            r1.append(r0)     // Catch:{ IOException -> 0x015f }
            r1.append(r6)     // Catch:{ IOException -> 0x015f }
            java.lang.String r0 = " response: "
            r1.append(r0)     // Catch:{ IOException -> 0x015f }
            r1.append(r5)     // Catch:{ IOException -> 0x015f }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x015f }
            X.AnonymousClass1QE.A02(r2, r3, r0)     // Catch:{ IOException -> 0x015f }
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x011e }
            r1.<init>(r5)     // Catch:{ JSONException -> 0x011e }
            java.lang.String r0 = "token"
            java.lang.String r0 = r1.optString(r0, r3)     // Catch:{ JSONException -> 0x011e }
            r4.disconnect()
            return r0
        L_0x011e:
            r1 = move-exception
            java.lang.String r0 = "httpRequestFBToken threw json exception in response: "
            r2.A0A(r0, r1)     // Catch:{ IOException -> 0x015f }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x015f }
            r0 = 2
            r10.A00 = r0     // Catch:{ IOException -> 0x015f }
            r10.A07 = r1     // Catch:{ IOException -> 0x015f }
            r4.disconnect()
            return r3
        L_0x0131:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x015f }
            r1.<init>()     // Catch:{ IOException -> 0x015f }
            java.lang.String r0 = "httpRequestFBToken got unsuccessful http response code while getting token: "
            r1.append(r0)     // Catch:{ IOException -> 0x015f }
            r1.append(r6)     // Catch:{ IOException -> 0x015f }
            java.lang.String r0 = r1.toString()     // Catch:{ IOException -> 0x015f }
            r2.A06(r0)     // Catch:{ IOException -> 0x015f }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x015f }
            r1.<init>()     // Catch:{ IOException -> 0x015f }
            java.lang.String r0 = "Unsuccessful HTTP response code"
            r1.append(r0)     // Catch:{ IOException -> 0x015f }
            r1.append(r6)     // Catch:{ IOException -> 0x015f }
            java.lang.String r1 = r1.toString()     // Catch:{ IOException -> 0x015f }
            r0 = 2
            r10.A00 = r0     // Catch:{ IOException -> 0x015f }
            r10.A07 = r1     // Catch:{ IOException -> 0x015f }
            r4.disconnect()
            return r3
        L_0x015f:
            r2 = move-exception
            goto L_0x0172
        L_0x0161:
            X.1QE r1 = r9.A0D     // Catch:{ IOException -> 0x0170, all -> 0x018b }
            java.lang.String r0 = "httpRequestFBToken failed to connect with a https connection: https://secure.facebook.com/payments/generate_token"
            r1.A06(r0)     // Catch:{ IOException -> 0x0170, all -> 0x018b }
            java.lang.String r1 = ""
            r0 = 4
            r10.A00 = r0     // Catch:{ IOException -> 0x0170, all -> 0x018b }
            r10.A07 = r1     // Catch:{ IOException -> 0x0170, all -> 0x018b }
            return r3
        L_0x0170:
            r2 = move-exception
            r4 = r3
        L_0x0172:
            X.1QE r1 = r9.A0D     // Catch:{ all -> 0x0188 }
            java.lang.String r0 = "httpRequestFBToken connection response threw: "
            r1.A0A(r0, r2)     // Catch:{ all -> 0x0188 }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x0188 }
            r0 = 2
            r10.A00 = r0     // Catch:{ all -> 0x0188 }
            r10.A07 = r1     // Catch:{ all -> 0x0188 }
            if (r4 == 0) goto L_0x0187
            r4.disconnect()
        L_0x0187:
            return r3
        L_0x0188:
            r0 = move-exception
            r3 = r4
            goto L_0x018c
        L_0x018b:
            r0 = move-exception
        L_0x018c:
            if (r3 == 0) goto L_0x0191
            r3.disconnect()
        L_0x0191:
            throw r0
        L_0x0192:
            r2 = move-exception
            X.1QE r1 = r9.A0D
            java.lang.String r0 = "httpRequestFBToken threw while building url "
            r1.A0A(r0, r2)
            java.lang.String r1 = r2.toString()
            r0 = 3
            r10.A00 = r0
            r10.A07 = r1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C31061ex.A07(X.A7B, java.util.List):java.lang.String");
    }

    public void A09(AnonymousClass1KN r2, AEX aex, UserJid userJid, AnonymousClass206 r5) {
        if (A0M(r2, aex, userJid, r5)) {
            this.A03.BBY(r5);
        }
    }

    public void A0E(C33661jB r5, C29621ca r6, String str, String str2) {
        C29621ca r0;
        if (TextUtils.isEmpty(str2)) {
            str2 = AnonymousClass1PP.A00(this.A0J, this.A01, false);
        }
        AnonymousClass1MD[] r3 = {new AnonymousClass1MD("action", "remove-credential"), new AnonymousClass1MD("credential-id", str), new AnonymousClass1MD("version", "2"), new AnonymousClass1MD("nonce", str2)};
        if (r6 != null) {
            r0 = new C29621ca(r6, "account", r3);
        }
        A0C(r5, r0);
    }

    public void A0G(AnonymousClass1O5 r8, C29621ca r9, String str) {
        A0J(r8, r9, str, "w:pay", C20113A7w.A0L);
    }

    public void A0I(AnonymousClass1O5 r8, C29621ca r9, String str, long j) {
        A0J(r8, r9, str, "w:pay", j);
    }

    public boolean A0L(AnonymousClass1KJ r34, AnonymousClass1KN r35, C20284AEs aEs, AnonymousClass8pG r37, AEX aex, AnonymousClass206 r39, String str, String str2, boolean z) {
        AnonymousClass1QE r2;
        StringBuilder sb;
        int i;
        char c;
        String str3;
        C20284AEs aEs2;
        String str4;
        C20284AEs aEs3 = aEs;
        AnonymousClass11S r0 = this.A0J;
        r0.A0I();
        AnonymousClass1E8 r13 = r0.A0D;
        C17960vV.A07(r13);
        ArrayList arrayList = null;
        if (!this.A0A.A04(0)) {
            r2 = this.A0D;
            sb = new StringBuilder();
            sb.append("sendPayment is not enabled for country: ");
            sb.append(this.A09.A02());
        } else {
            AnonymousClass206 r7 = r39;
            AnonymousClass1BI r9 = r7.A0v.A00;
            if (r9 == null || (C22971Dz.A0e(r9) && r7.A0H() == null)) {
                r2 = this.A0D;
                sb = new StringBuilder();
                sb.append("sendPayment found null or empty args jid: ");
                sb.append(r9);
                sb.append(" receiver: ");
                sb.append(r7.A0H());
                sb.append(" payment methods: ");
            } else {
                AnonymousClass1KN r11 = r35;
                if (!r11.A00()) {
                    this.A0D.A06("sendPayment not sending payment; got invalid amount");
                    return false;
                }
                AnonymousClass1KJ r8 = r34;
                BD1 A002 = A00(r8, this);
                BD1 A003 = A00(r8, this);
                String str5 = ((AnonymousClass1KL) r8).A06;
                C18070vi.A0W(str5);
                int BPo = A003.BPo(str5);
                BigDecimal bigDecimal = r11.A00;
                long doubleValue = (long) ((int) (bigDecimal.doubleValue() * ((double) BPo)));
                if (BPo <= 0) {
                    BPo = 1;
                }
                C17960vV.A07(r8);
                ARR A004 = C196669vR.A00(r8, BPo, doubleValue);
                AnonymousClass8pG r6 = r37;
                C17960vV.A07(r6);
                r6.A00 = A004;
                if (r6.A02 != null) {
                    i = 2;
                } else {
                    i = 0;
                    if (z) {
                        i = 1;
                    }
                }
                try {
                    AnonymousClass1QE r5 = this.A0D;
                    r5.A06("sendPayment building payment to send amount");
                    UserJid userJid = (UserJid) r13.A0J;
                    if (C22971Dz.A0e(r9)) {
                        r9 = r7.A0H();
                    }
                    C22941Dw r02 = UserJid.Companion;
                    UserJid A012 = C22941Dw.A01(r9);
                    AnonymousClass1QJ r31 = this.A09;
                    C63572tK A022 = r31.A02();
                    C17960vV.A07(A022);
                    String str6 = A022.A03;
                    int BZ3 = A002.BZ3();
                    C20128A8n a8n = C20128A8n.$redex_init_class;
                    int i2 = 1;
                    if (z) {
                        i2 = 100;
                    }
                    AW0 A023 = C20128A8n.A02(r8, r11, userJid, A012, str5, (String) null, str6, i2, 401, C196679vS.A00(str6), BZ3, i, -1);
                    A023.A0B(aex);
                    AnonymousClass1KH r17 = this.A04;
                    ArrayList A0B2 = r17.A0B();
                    if (A0B2.size() <= 0) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("sendPayment not sending payment; got no methods: ");
                        sb2.append(A0B2);
                        r5.A06(sb2.toString());
                        c = 7;
                    } else {
                        Iterator it = r17.A0B().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                aEs2 = null;
                                break;
                            }
                            aEs2 = (C20284AEs) it.next();
                            if (aEs2.A01 == 1) {
                                break;
                            }
                        }
                        if (aEs2 != null && !TextUtils.isEmpty(aEs2.A0A)) {
                            int A052 = aEs2.A05();
                            if (A052 != r31.A02().A00) {
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("sendPayment not sending payment; primary methods type ");
                                sb3.append(A052);
                                sb3.append(" does not match primary account type for country: ");
                                sb3.append(r31.A02().A00);
                                r5.A06(sb3.toString());
                                c = 3;
                            } else if (A052 != 3) {
                                StringBuilder sb4 = new StringBuilder();
                                sb4.append("sendPayment not sending payment; primary method type unsupported: ");
                                sb4.append(A052);
                                r5.A06(sb4.toString());
                                c = 6;
                            } else {
                                AnonymousClass8pP r15 = (AnonymousClass8pP) aEs2;
                                AnonymousClass1KN A0C2 = r15.A0C();
                                if (!A0C2.A00()) {
                                    StringBuilder sb5 = new StringBuilder();
                                    sb5.append("sendPayment not sending payment; got invalid balance: ");
                                    sb5.append(A0C2);
                                    r5.A06(sb5.toString());
                                    c = 5;
                                } else {
                                    ArrayList arrayList2 = new ArrayList(2);
                                    BigDecimal bigDecimal2 = A0C2.A00;
                                    if (bigDecimal2.compareTo(bigDecimal) >= 0) {
                                        arrayList2.add(new C185879dI(r11, r15, 1));
                                    } else {
                                        BigDecimal bigDecimal3 = BigDecimal.ZERO;
                                        if (bigDecimal2.compareTo(bigDecimal3) > 0) {
                                            arrayList2.add(new C185879dI(A0C2, r15, 1));
                                        }
                                        BigDecimal subtract = bigDecimal.subtract(bigDecimal2);
                                        if (subtract.compareTo(bigDecimal3) > 0) {
                                            if (!(aEs == null && (aEs3 = r17.A07()) == null) && !TextUtils.isEmpty(aEs3.A0A)) {
                                                C63572tK A024 = r31.A02();
                                                if (C137476vW.A01(A024.A09, aEs3.A05())) {
                                                    arrayList2.add(new C185879dI(new AnonymousClass1KN(subtract, bigDecimal.scale()), aEs3, 1));
                                                }
                                            }
                                            StringBuilder sb6 = new StringBuilder();
                                            sb6.append("sendPayment not sending payment; got invalid secondary methods with insufficient balance: ");
                                            sb6.append(A0C2);
                                            str4 = sb6.toString();
                                        }
                                    }
                                    if (arrayList2.size() <= 0) {
                                        r5.A06("sendPayment found 0 sources");
                                        c = 11;
                                    } else {
                                        c = 0;
                                        arrayList = arrayList2;
                                        StringBuilder sb7 = new StringBuilder();
                                        sb7.append("findSourcesForTransfer returning sources: ");
                                        sb7.append(arrayList2);
                                        sb7.append(" for amount");
                                        r5.A06(sb7.toString());
                                    }
                                }
                            }
                        } else if (r31.A02().A08) {
                            if (!(aEs == null && (aEs3 = r17.A07()) == null) && !TextUtils.isEmpty(aEs3.A0A)) {
                                C63572tK A025 = r31.A02();
                                if (C137476vW.A01(A025.A09, aEs3.A05())) {
                                    arrayList = new ArrayList(1);
                                    arrayList.add(new C185879dI(r11, aEs3, 1));
                                    c = 0;
                                    StringBuilder sb8 = new StringBuilder();
                                    sb8.append("PAY PaymentsActionManager:findSourcesForTransfer found no legacy primary but found primary: ");
                                    sb8.append(arrayList);
                                    sb8.append(" for amount");
                                    Log.i(sb8.toString());
                                }
                            }
                            str4 = "sendPayment not sending payment; got invalid primary methods and no legacy primary methods";
                        } else {
                            StringBuilder sb9 = new StringBuilder();
                            sb9.append("sendPayment not sending payment; got null primary methods or empty credential id: ");
                            sb9.append(aEs2);
                            r5.A06(sb9.toString());
                            c = 4;
                        }
                        r5.A06(str4);
                        c = 9;
                    }
                    A023.A0M = str;
                    A023.A0K = str2;
                    A023.A06 = r6.A0B();
                    if (c == 0) {
                        A023.A0D(arrayList);
                        A023.A0A = r6;
                        if (A023.A0N.size() == 1) {
                            r7.A0d((AnonymousClass1BI) null);
                            A023.A0H = ((C185879dI) A023.A0N.get(0)).A01.A0A;
                            r7.A0I = AnonymousClass11P.A01(this.A01);
                            if (C20128A8n.A08(A023.A0K)) {
                                str3 = A023.A0K;
                            } else {
                                str3 = "UNSET";
                            }
                            AnonymousClass25B.A03(r7, new AnonymousClass25E(A023, str3));
                            A023.A05 = r7.A0I;
                            return true;
                        }
                        r5.A06("PaymentsActionManager sendPayment could not send. no correct sources found.");
                        return false;
                    }
                    return false;
                } catch (Exception e) {
                    this.A0D.A0A("sendPayment blew up creating transaction info: ", e);
                    return false;
                }
            }
        }
        r2.A06(sb.toString());
        return false;
    }
}
