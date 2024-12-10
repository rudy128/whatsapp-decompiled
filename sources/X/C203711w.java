package X;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.whatsapp.jid.DeviceJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.util.Log;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;

/* renamed from: X.11w  reason: invalid class name and case insensitive filesystem */
public class C203711w extends AnonymousClass10T implements C201511a {
    public int A00;
    public int A01 = 0;
    public int A02;
    public long A03;
    public C53262cF A04;
    public C53272cG A05;
    public DeviceJid A06;
    public C42521yJ A07;
    public UserJid A08;
    public AnonymousClass2BI A09;
    public Runnable A0A;
    public Runnable A0B;
    public Runnable A0C;
    public Runnable A0D;
    public Runnable A0E;
    public String A0F;
    public byte[] A0G;
    public byte[] A0H;
    public final Handler A0I = new Handler(Looper.getMainLooper());
    public final C22701Cw A0J;
    public final AnonymousClass11S A0K;
    public final C47942Ko A0L;
    public final C26671Ta A0M;
    public final C47922Km A0N;
    public final C31301fL A0O;
    public final C22871Dn A0P;
    public final C56782i1 A0Q;
    public final AnonymousClass11R A0R;
    public final AnonymousClass11Q A0S;
    public final AnonymousClass11C A0T;
    public final AnonymousClass11P A0U;
    public final AnonymousClass118 A0V;
    public final C19830z4 A0W;
    public final AnonymousClass1P3 A0X;
    public final C22611Cn A0Y;
    public final C24751Ln A0Z;
    public final AnonymousClass1RK A0a;
    public final C26331Rs A0b;
    public final AnonymousClass19D A0c;
    public final C23641Hb A0d;
    public final C25011Mn A0e;
    public final C30261de A0f;
    public final C27001Ui A0g;
    public final A15 A0h;
    public final AnonymousClass10I A0i;
    public final AnonymousClass00H A0j;
    public final AnonymousClass00H A0k;
    public final AnonymousClass00H A0l;
    public final AnonymousClass00H A0m;
    public final AnonymousClass00H A0n;
    public final AnonymousClass00H A0o;
    public final AnonymousClass00H A0p;
    public final AnonymousClass00H A0q;
    public final AnonymousClass00H A0r;
    public final List A0s = new ArrayList();
    public final AtomicReference A0t = new AtomicReference((Object) null);
    public final AnonymousClass1RI A0u;
    public final AnonymousClass18O A0v;
    public final C26811To A0w;
    public final C18030ve A0x;
    public final AnonymousClass18K A0y;
    public final AnonymousClass1LU A0z;
    public final AnonymousClass1OZ A10;

    public static synchronized void A02(C203711w r2) {
        synchronized (r2) {
            Runnable runnable = r2.A0B;
            if (runnable != null) {
                r2.A0i.CEz(runnable);
            }
            r2.A01 = 0;
            r2.A04 = null;
            r2.A0F = null;
            r2.A0t.set((Object) null);
            r2.A0H = null;
        }
    }

    public synchronized void A04() {
        Log.i("companion/registration/cancelling link code registration");
        ((C219017v) this.A0o.get()).A0F(false, 16);
        A02(this);
        this.A0P.A01(0);
    }

    public synchronized void A05() {
        if (this.A0P.A02()) {
            A06();
            this.A06 = null;
            this.A0G = null;
            this.A02 = -1;
            this.A00 = -1;
            this.A03 = 0;
            this.A08 = null;
            this.A04 = null;
            this.A0F = null;
            this.A0t.set((Object) null);
            this.A0H = null;
            notifyAllObservers(new AnonymousClass7KX(14));
        }
    }

    public synchronized void A06() {
        C22871Dn r1 = this.A0P;
        if (r1.A02()) {
            Log.i("companion/registration/reset");
            r1.A01(0);
            A01(this);
            Runnable runnable = this.A0E;
            if (runnable != null) {
                this.A0i.CEz(runnable);
            }
            Runnable runnable2 = this.A0D;
            if (runnable2 != null) {
                this.A0i.CEz(runnable2);
            }
            Runnable runnable3 = this.A0A;
            if (runnable3 != null) {
                this.A0i.CEz(runnable3);
            }
            ((C219017v) this.A0o.get()).A0F(false, 16);
        }
    }

    public synchronized void A09(UserJid userJid, boolean z) {
        Log.i("companion/registration/link-code/start");
        int i = 10;
        if (z) {
            i = 14;
        }
        this.A0P.A01(i);
        this.A08 = userJid;
        A00(this);
    }

    public synchronized void A0A(String str, boolean z, boolean z2) {
        String str2;
        this.A0y.CHJ(true);
        C29491cN r4 = (C29491cN) this.A0j.get();
        Log.i("AccountSwitcher/updateLoggedOutCompanionAccountSharedPrefs");
        AnonymousClass11S r3 = r4.A06;
        r3.A0I();
        if (r3.A0D != null) {
            C19830z4 r1 = r4.A0A;
            r3.A0I();
            AnonymousClass1E8 r0 = r3.A0D;
            if (r0 != null) {
                C19830z4.A00(r1).putString("account_switching_logged_out_phone_number", AnonymousClass17K.A02(r0)).apply();
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else {
            Log.e("AccountSwitcher/updateLoggedOutCompanionAccountSharedPrefs/meContact is null");
        }
        if (r3.A09() != null) {
            C19830z4 r12 = r4.A0A;
            AnonymousClass1E2 A092 = r3.A09();
            if (A092 != null) {
                str2 = A092.getRawString();
            } else {
                str2 = null;
            }
            C19830z4.A00(r12).putString("account_switching_logged_out_lid", str2).apply();
        } else {
            Log.e("AccountSwitcher/updateLoggedOutCompanionAccountSharedPrefs/myLid is null");
        }
        if (z) {
            C21132Af0 af0 = new C21132Af0();
            af0.A09(new AnonymousClass3AV(this, str, z2));
            C66692ya r13 = new C66692ya(af0, this, 3);
            this.A0M.registerObserver(r13);
            af0.A09(new C98284qs(this, r13, 3));
            C26811To r2 = this.A0w;
            C17960vV.A0D(r2.A07.A0N());
            C46022Co r14 = (C46022Co) ((C58862lN) r2.A0a.get()).A00("sentinel");
            if (r14 != null) {
                C17960vV.A0D(r14.A00.A0N());
                r2.A0N(C46022Co.A00(r14, false));
                r2.A0I();
            }
            this.A0i.CGv(new C146437Pc(af0, 13), TimeUnit.SECONDS.toMillis((long) this.A0v.A04(AnonymousClass18O.A13)));
        } else {
            this.A0I.post(new AnonymousClass7RK(27, (Object) this, z2));
        }
    }

    public static void A00(C203711w r5) {
        C54492eE r0;
        C53272cG r1;
        int intValue;
        try {
            AnonymousClass1P3 r4 = r5.A0X;
            if (r4.A0Y()) {
                r0 = r4.A0J();
            } else {
                r0 = (C54492eE) ((C25581Ot) r5.A0q.get()).A00.submit(new C21490Akz(r4, 8)).get();
            }
            if (r4.A0Y()) {
                r1 = r4.A01.A03();
            } else {
                r1 = (C53272cG) ((C25581Ot) r5.A0q.get()).A00.submit(new C21490Akz(r4, 4)).get();
            }
            r5.A05 = r1;
            if (r4.A0Y()) {
                intValue = r4.A06.A02();
            } else {
                intValue = ((Number) ((C25581Ot) r5.A0q.get()).A00.submit(new C21490Akz(r4, 9)).get()).intValue();
            }
            ((C219017v) r5.A0o.get()).A0D(new C54412e6(r0, r5.A05.A01.A00.A00, A8G.A03(intValue)));
            ((C191849nI) r5.A0m.get()).A00();
            ((C191839nH) r5.A0l.get()).A00();
        } catch (InterruptedException | ExecutionException e) {
            Log.e("companion/registration/failed to load keys for sending");
            r5.A0h.A02("companion_fetch_registration_keys_failed", e.getMessage());
            r5.A05();
        }
    }

    public static void A01(C203711w r4) {
        Runnable runnable = r4.A0C;
        if (runnable != null) {
            r4.A0i.CEz(runnable);
        }
        Runnable runnable2 = r4.A0B;
        if (runnable2 != null) {
            r4.A0i.CEz(runnable2);
        }
        List<Runnable> list = r4.A0s;
        for (Runnable CEz : list) {
            r4.A0i.CEz(CEz);
        }
        list.clear();
    }

    public static synchronized void A03(C203711w r30, boolean z) {
        A15 a15;
        String str;
        String str2;
        String str3;
        String str4;
        C203711w r8 = r30;
        synchronized (r8) {
            Log.i("companion/registration/companion-hello/start");
            C22871Dn r2 = r8.A0P;
            int A002 = r2.A00();
            if (A002 == 10 || A002 == 14) {
                r2.A01(11);
                byte[] bArr = new byte[5];
                C22691Cv.A00().nextBytes(bArr);
                byte[] bArr2 = new byte[32];
                C22691Cv.A00().nextBytes(bArr2);
                byte[] bArr3 = new byte[16];
                C22691Cv.A00().nextBytes(bArr3);
                String A003 = C60732oW.A00(bArr);
                if (A003 != null) {
                    r8.A0F = A003;
                    r8.A04 = C63962tz.A00();
                    SecretKey A082 = C17970vW.A08("PBKDF2WithHmacSHA256", bArr2, r8.A0F.toCharArray(), A7Y.A0F, 256);
                    try {
                        byte[] bArr4 = r8.A04.A01.A00;
                        Cipher instance = Cipher.getInstance("AES/CTR/NoPadding");
                        instance.init(1, A082, new IvParameterSpec(bArr3));
                        byte[] A052 = A8G.A05(bArr2, bArr3, instance.doFinal(bArr4));
                        AnonymousClass00H r5 = r8.A0k;
                        ((C58492km) r5.get()).A00().intValue();
                        String A022 = r8.A0V.A02(2131891669, Build.VERSION.RELEASE);
                        C56782i1 r302 = r8.A0Q;
                        UserJid userJid = r8.A08;
                        byte[] bArr5 = r8.A0J.A0E().A02.A01;
                        int intValue = ((C58492km) r5.get()).A00().intValue();
                        if (intValue == 0) {
                            str3 = "e";
                        } else if (intValue != 2) {
                            str3 = "d";
                        } else {
                            str3 = "f";
                        }
                        boolean z2 = !z;
                        C145917Nc r15 = new C145917Nc(r8, 8);
                        C145917Nc r7 = new C145917Nc(r8, 9);
                        Log.i("companion/registration/send-link-code-companion-reg-companion-hello");
                        AnonymousClass1OZ r28 = r302.A00;
                        String A0B2 = r28.A0B();
                        if (z2) {
                            str4 = "true";
                        } else {
                            str4 = "false";
                        }
                        C29591cX r0 = new C29591cX("link_code_pairing_nonce");
                        r0.A01 = new byte[0];
                        C29621ca A032 = r0.A03();
                        C18070vi.A0d(userJid, 2);
                        C18070vi.A0d(A052, 3);
                        C18070vi.A0d(A022, 6);
                        List asList = Arrays.asList(new String[]{"false", "true"});
                        C18070vi.A0X(asList);
                        C29591cX r6 = new C29591cX("iq");
                        r6.A04(new AnonymousClass1MD("xmlns", "md"));
                        r6.A04(new AnonymousClass1MD((Jid) C173438v4.A00, "to"));
                        r6.A04(new AnonymousClass1MD(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "set"));
                        if (C29601cY.A04(A0B2, 0, 9007199254740991L, false)) {
                            r6.A04(new AnonymousClass1MD(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A0B2));
                        }
                        C29591cX r12 = new C29591cX("link_code_companion_reg");
                        r12.A04(new AnonymousClass1MD("stage", "companion_hello"));
                        r12.A04(new AnonymousClass1MD((Jid) userJid, "jid"));
                        r12.A08(str4, "should_show_push_notification", asList);
                        r12.A05(A032);
                        C29591cX r02 = new C29591cX("link_code_pairing_wrapped_companion_ephemeral_pub");
                        C29601cY.A02(A052, -9007199254740991L, 9007199254740991L);
                        r02.A01 = A052;
                        r12.A05(r02.A03());
                        C29591cX r52 = new C29591cX("companion_server_auth_key_pub");
                        byte[] bArr6 = bArr5;
                        C29601cY.A02(bArr6, -9007199254740991L, 9007199254740991L);
                        r52.A01 = bArr6;
                        r12.A05(r52.A03());
                        C29591cX r3 = new C29591cX("companion_platform_id");
                        if (C29601cY.A04(str3, 0, 9007199254740991L, false)) {
                            r3.A07(str3);
                        }
                        r12.A05(r3.A03());
                        C29591cX r32 = new C29591cX("companion_platform_display");
                        if (C29601cY.A04(A022, 0, 9007199254740991L, false)) {
                            r32.A07(A022);
                        }
                        r12.A05(r32.A03());
                        r6.A05(r12.A03());
                        r28.A0N(new C20993Acl(r15, r302, r7, 7), r6.A03(), A0B2, 364, 0);
                        r8.notifyAllObservers(new AnonymousClass7KZ(r8.A0F, 1));
                    } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
                        Log.e("companion/registration/companion-hello/failed to encrypt companion ADV public key");
                        a15 = r8.A0h;
                        str = "companion_hello_failed_encryption";
                        str2 = e.getMessage();
                    }
                } else {
                    Log.e("companion/registration/companion-hello/convert to base32 string failed");
                    a15 = r8.A0h;
                    str = "companion_hello_failed_base32_conv";
                    str2 = null;
                    a15.A02(str, str2);
                    r8.A05();
                }
            } else {
                Log.e("companion/registration/companion-hello/invalid state");
            }
        }
    }

    public /* bridge */ /* synthetic */ void A07(AnonymousClass6UT r1) {
        super.registerObserver(r1);
    }

    public /* bridge */ /* synthetic */ void A08(AnonymousClass6UT r1) {
        super.unregisterObserver(r1);
    }

    public C203711w(C22701Cw r4, AnonymousClass1RI r5, AnonymousClass11S r6, AnonymousClass18O r7, C47942Ko r8, C26671Ta r9, C47922Km r10, C26811To r11, C31301fL r12, C22871Dn r13, AnonymousClass11R r14, AnonymousClass11Q r15, AnonymousClass11C r16, AnonymousClass11P r17, AnonymousClass118 r18, C19830z4 r19, AnonymousClass1P3 r20, C22611Cn r21, C24751Ln r22, AnonymousClass1RK r23, C26331Rs r24, AnonymousClass19D r25, C18030ve r26, C23641Hb r27, AnonymousClass18K r28, AnonymousClass1LU r29, AnonymousClass1OZ r30, C25011Mn r31, C30261de r32, C27001Ui r33, A15 a15, AnonymousClass10I r35, AnonymousClass00H r36, AnonymousClass00H r37, AnonymousClass00H r38, AnonymousClass00H r39, AnonymousClass00H r40, AnonymousClass00H r41, AnonymousClass00H r42, AnonymousClass00H r43, AnonymousClass00H r44, C18140vp r45) {
        super(new C18150vq((Object) null, r45));
        this.A0U = r17;
        this.A0x = r26;
        this.A0K = r6;
        this.A0V = r18;
        this.A0i = r35;
        this.A0y = r28;
        this.A0e = r31;
        this.A0v = r7;
        this.A0w = r11;
        this.A0J = r4;
        this.A0n = r36;
        this.A0L = r8;
        AnonymousClass1OZ r1 = r30;
        this.A10 = r1;
        this.A0o = r37;
        this.A0q = r38;
        this.A0T = r16;
        this.A0j = r39;
        this.A0c = r25;
        this.A0Z = r22;
        this.A0X = r20;
        this.A0l = r44;
        this.A0g = r33;
        this.A0b = r24;
        this.A0r = r40;
        this.A0W = r19;
        this.A0R = r14;
        this.A0h = a15;
        this.A0a = r23;
        this.A0p = r41;
        this.A0M = r9;
        this.A0f = r32;
        this.A0N = r10;
        this.A0O = r12;
        this.A0Y = r21;
        this.A0k = r42;
        this.A0m = r43;
        this.A0S = r15;
        this.A0P = r13;
        this.A0d = r27;
        this.A0u = r5;
        this.A0z = r29;
        this.A0Q = new C56782i1(r1);
    }
}
