package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.search.verification.client.SearchActionVerificationClientService;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1cN  reason: invalid class name and case insensitive filesystem */
public final class C29491cN {
    public Long A00;
    public String A01;
    public long A02;
    public AnonymousClass00H A03;
    public final AnonymousClass1L9 A04;
    public final AnonymousClass190 A05;
    public final AnonymousClass11S A06;
    public final C29481cM A07;
    public final AnonymousClass12E A08;
    public final AnonymousClass11P A09;
    public final C19830z4 A0A;
    public final AnonymousClass11O A0B;
    public final C18000vb A0C;
    public final C18030ve A0D;
    public final AnonymousClass10I A0E;
    public final AnonymousClass00H A0F;
    public final AnonymousClass00H A0G;
    public final AnonymousClass00H A0H;
    public final AnonymousClass00H A0I;
    public final AnonymousClass00H A0J;
    public final AnonymousClass00H A0K;
    public final AnonymousClass10b A0L;
    public final AnonymousClass1DC A0M;
    public final AnonymousClass00H A0N;

    public C29491cN(AnonymousClass1L9 r23, AnonymousClass190 r24, AnonymousClass11S r25, C29481cM r26, AnonymousClass12E r27, AnonymousClass11P r28, C19830z4 r29, AnonymousClass11O r30, C18000vb r31, C18030ve r32, AnonymousClass10b r33, AnonymousClass1DC r34, AnonymousClass10I r35, AnonymousClass00H r36, AnonymousClass00H r37, AnonymousClass00H r38, AnonymousClass00H r39, AnonymousClass00H r40, AnonymousClass00H r41, AnonymousClass00H r42, AnonymousClass00H r43) {
        AnonymousClass11P r17 = r28;
        C18070vi.A0d(r17, 1);
        C18030ve r15 = r32;
        C18070vi.A0d(r15, 2);
        AnonymousClass11S r19 = r25;
        C18070vi.A0d(r19, 3);
        AnonymousClass190 r20 = r24;
        C18070vi.A0d(r20, 4);
        AnonymousClass10I r14 = r35;
        C18070vi.A0d(r14, 5);
        AnonymousClass1L9 r21 = r23;
        C18070vi.A0d(r21, 6);
        AnonymousClass12E r18 = r27;
        C18070vi.A0d(r18, 7);
        AnonymousClass00H r9 = r36;
        C18070vi.A0d(r9, 8);
        AnonymousClass1DC r10 = r34;
        C18070vi.A0d(r10, 9);
        C18000vb r12 = r31;
        C18070vi.A0d(r12, 10);
        AnonymousClass00H r8 = r37;
        C18070vi.A0d(r8, 11);
        C19830z4 r16 = r29;
        C18070vi.A0d(r16, 12);
        AnonymousClass00H r7 = r38;
        C18070vi.A0d(r7, 14);
        AnonymousClass10b r11 = r33;
        C18070vi.A0d(r11, 15);
        AnonymousClass00H r6 = r39;
        C18070vi.A0d(r6, 16);
        AnonymousClass11O r13 = r30;
        C18070vi.A0d(r13, 17);
        AnonymousClass00H r5 = r40;
        C18070vi.A0d(r5, 18);
        AnonymousClass00H r4 = r41;
        C18070vi.A0d(r4, 19);
        AnonymousClass00H r3 = r42;
        C18070vi.A0d(r3, 20);
        AnonymousClass00H r2 = r43;
        C18070vi.A0d(r2, 21);
        this.A09 = r17;
        this.A0D = r15;
        this.A06 = r19;
        this.A05 = r20;
        this.A0E = r14;
        this.A04 = r21;
        this.A08 = r18;
        this.A03 = r9;
        this.A0M = r10;
        this.A0C = r12;
        this.A0J = r8;
        this.A0A = r16;
        this.A07 = r26;
        this.A0K = r7;
        this.A0L = r11;
        this.A0N = r6;
        this.A0B = r13;
        this.A0F = r5;
        this.A0G = r4;
        this.A0I = r3;
        this.A0H = r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0049, code lost:
        if (r9 == null) goto L_0x004b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C62562rb A04(X.C62562rb r19, boolean r20, boolean r21, boolean r22) {
        /*
            r18 = this;
            r10 = 0
            r5 = r19
            X.C18070vi.A0d(r5, r10)
            java.lang.String r3 = ""
            r4 = r18
            if (r20 == 0) goto L_0x0060
            X.00H r0 = r4.A0I
            java.lang.Object r2 = r0.get()
            X.A3v r2 = (X.C20026A3v) r2
            java.lang.String r0 = "MultiAccountSharedPrefReader/getLidFromSharedPref"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r1 = X.C19830z4.A06
            X.C18070vi.A0Z(r1)
            java.lang.String r0 = "self_lid"
            java.lang.String r7 = X.C20026A3v.A01(r5, r2, r1, r0)
            if (r7 != 0) goto L_0x0028
            r7 = r3
        L_0x0028:
            if (r21 == 0) goto L_0x005d
            java.lang.String r8 = r4.A07(r5)
            if (r8 != 0) goto L_0x0031
            r8 = r3
        L_0x0031:
            if (r22 == 0) goto L_0x005a
            X.00H r0 = r4.A0I
            java.lang.Object r2 = r0.get()
            X.A3v r2 = (X.C20026A3v) r2
            java.lang.String r0 = "MultiAccountSharedPrefReader/getPushNameFromSharedPref"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.String r1 = "startup_prefs"
            java.lang.String r0 = "push_name"
            java.lang.String r9 = X.C20026A3v.A01(r5, r2, r1, r0)
            if (r9 != 0) goto L_0x004c
        L_0x004b:
            r9 = r3
        L_0x004c:
            r12 = 2033(0x7f1, float:2.849E-42)
            r6 = 0
            r13 = 0
            r17 = r10
            r11 = r10
            r15 = r13
            X.2rb r0 = X.C62562rb.A00(r5, r6, r7, r8, r9, r10, r11, r12, r13, r15, r17)
            return r0
        L_0x005a:
            java.lang.String r3 = r5.A08
            goto L_0x004b
        L_0x005d:
            java.lang.String r8 = r5.A06
            goto L_0x0031
        L_0x0060:
            java.lang.String r7 = r5.A07
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29491cN.A04(X.2rb, boolean, boolean, boolean):X.2rb");
    }

    public final C62562rb A05(String str, String str2) {
        String str3;
        C18070vi.A0d(str, 0);
        C18070vi.A0d(str2, 1);
        Log.i("AccountSwitcher/getAccountForPhoneNumberIfRegistered");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(str2);
        String obj = sb.toString();
        for (C62562rb r9 : A09(false, true, false)) {
            String str4 = r9.A06;
            if (TextUtils.equals(str4, obj) || TextUtils.equals(C63942tw.A04(AnonymousClass17K.A01(C42771yi.A00(), str4)), obj)) {
                str3 = "AccountSwitcher/getAccountForPhoneNumberIfRegistered/phone number matches different format";
            } else if (AnonymousClass1YE.A0A(str4, str, true)) {
                String A0J2 = AnonymousClass1YF.A0J(str, str4);
                int length = A0J2.length();
                int length2 = str2.length();
                if (length == length2) {
                    Log.i("AccountSwitcher/getLidForPhoneNumberIfRegistered/closelyMatches/same length");
                    if (A0J2.equals(str2)) {
                    }
                } else {
                    int abs = Math.abs(length - length2);
                    if (abs > 2) {
                        Log.i("AccountSwitcher/getLidForPhoneNumberIfRegistered/closelyMatches/phone number length difference is greater than 2");
                    } else {
                        String str5 = str2;
                        if (length < length2) {
                            str5 = A0J2;
                        }
                        if (length < length2) {
                            A0J2 = str2;
                        }
                        int i = 0;
                        int i2 = 0;
                        int i3 = 0;
                        while (i < str5.length() && i2 < A0J2.length()) {
                            if (A0J2.charAt(i2) != str5.charAt(i)) {
                                i3++;
                            } else {
                                i++;
                            }
                            i2++;
                        }
                        if (i3 + (A0J2.length() - i2) <= abs) {
                        }
                    }
                }
                str3 = "AccountSwitcher/getAccountForPhoneNumberIfRegistered/phone number closely matches with registered account";
            }
            Log.i(str3);
            return r9;
        }
        return null;
    }

    public final String A08(String str) {
        C18070vi.A0d(str, 0);
        C18000vb r2 = this.A0C;
        Parcelable.Creator creator = PhoneUserJid.CREATOR;
        String A002 = AnonymousClass17K.A00(C42771yi.A00(), C22951Dx.A01(str));
        if (A002 == null) {
            A002 = str;
        }
        String A0G2 = r2.A0G(A002);
        if (A0G2 != null) {
            str = A0G2;
        }
        String replace = str.replace(' ', 160);
        C18070vi.A0X(replace);
        return replace;
    }

    public final void A0D(Context context, int i) {
        StringBuilder sb = new StringBuilder();
        sb.append("AccountSwitcher/maybeSwitchToMostRecentAccount/source : ");
        sb.append(i);
        Log.i(sb.toString());
        this.A0E.CGD(new AnonymousClass9BC(context, i, 0, this), new Void[0]);
    }

    public final boolean A0I(Context context, String str, String str2, String str3, String str4, C18090vk r26, int i, boolean z, boolean z2, boolean z3) {
        AnonymousClass739 r2;
        Boolean bool;
        int i2;
        Context context2 = context;
        C18070vi.A0d(context2, 2);
        C29481cM r9 = this.A07;
        int A002 = r9.A00();
        StringBuilder sb = new StringBuilder();
        sb.append("AccountSwitcher/maybeLaunchAccountSwitchingActivity addAccount:");
        sb.append(z);
        sb.append(", isCall:");
        boolean z4 = z2;
        sb.append(z4);
        sb.append(", source:");
        int i3 = i;
        sb.append(i3);
        sb.append(", shouldAllowSwitchingAccounts:");
        sb.append(A002);
        sb.append(", multiAccountPrimingToken=");
        String str5 = str4;
        sb.append(str5);
        Log.i(sb.toString());
        boolean z5 = true;
        C18090vk r3 = r26;
        if (A002 != 0) {
            if (A002 == 1) {
                Activity A003 = C18050vg.A00(context2);
                if (A003 != null && !AnonymousClass4Yv.A02(A003)) {
                    AnonymousClass00H r5 = r9.A01;
                    long A012 = (C31141f5.A01((AnonymousClass11Z) r5.get(), (C18030ve) r9.A00.get()) - ((AnonymousClass11Z) r5.get()).A02()) + SearchActionVerificationClientService.MS_TO_NS;
                    C73203Rj A004 = AnonymousClass4a6.A00(context2);
                    A004.A0k(context2.getString(2131886370));
                    A004.A0S(context2.getString(2131886367, new Object[]{C88584aA.A02(this.A0C, A012)}));
                    A004.A0Z(new C20153A9p(context2, this, 2), 2131886371);
                    A004.A0X(new AnonymousClass4aq(r3, 11), 2131898766);
                    A004.A0T(true);
                    A004.create().show();
                } else if (r26 != null) {
                    r3.invoke();
                }
                r2 = (AnonymousClass739) this.A0N.get();
                bool = null;
                i2 = 25;
            } else if (A002 != 2) {
                A01(context2, r3, 2131886368, 2131886365);
                r2 = (AnonymousClass739) this.A0N.get();
                bool = null;
                i2 = 24;
            } else {
                A01(context2, r3, 2131886369, 2131886366);
                r2 = (AnonymousClass739) this.A0N.get();
                bool = null;
                i2 = 23;
            }
            r2.A04(bool, i3, i2);
            return false;
        }
        AnonymousClass00H r1 = this.A03;
        if (((AnonymousClass1XL) r1.get()).A04()) {
            ((AnonymousClass1XL) r1.get()).A02(true);
        }
        if (z) {
            C64012u4 r12 = (C64012u4) this.A0F.get();
            boolean A052 = C18020vd.A05(C18040vf.A02, this.A0D, 5840);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("AccountSwitchingDataRepo/setIsCompanionModeEnabled/");
            sb2.append(A052);
            Log.i(sb2.toString());
            C59692mj A013 = C64012u4.A01(r12);
            List list = A013.A03;
            List list2 = A013.A02;
            C64012u4.A08(new C59692mj(A013.A01, list, list2, A013.A00, A013.A05, A052), r12);
            Log.i("AccountSwitcher/clearExistingNotifications");
            ((C27301Vn) this.A0K.get()).BEJ(57, "clearNotificationsBeforeAccountSwitching");
            C57082iV BX3 = ((C31391fU) this.A0J.get()).BX3();
            C19830z4 r6 = this.A0A;
            String A0j = r6.A0j();
            String str6 = BX3.A01;
            long j = BX3.A00;
            int A0E2 = r6.A0E();
            String A014 = this.A0B.A01();
            boolean z6 = false;
            if (A0E2 >= 0) {
                z6 = true;
            }
            C17960vV.A0C(z6);
            Intent intent = new Intent();
            intent.setClassName(context2.getPackageName(), "com.whatsapp.accountswitching.secondaryprocess.AccountSwitchingActivity");
            intent.putExtra("request_type", 1);
            intent.putExtra("device_id", A0j);
            intent.putExtra("phone_id", str6);
            intent.putExtra("phone_id_timestamp", j);
            intent.putExtra("number_of_accounts", A0E2 + 1);
            if (A014 != null) {
                intent.putExtra("account_language", A014);
            }
            if (z3) {
                intent.putExtra("should_open_link_companion", true);
            }
            intent.putExtra("source", i3);
            if (!TextUtils.isEmpty(str5)) {
                intent.putExtra("multi_account_priming_token", str5);
            }
            intent.addFlags(268468224);
            z5 = A02(context2, intent, this);
        } else {
            String str7 = str;
            String str8 = str2;
            if ((str == null || str7.length() == 0) && (str2 == null || str8.length() == 0)) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this.A0E.CGM(new AnonymousClass2PZ(context2, this, str7, str8, str3, i3, z4), new Void[0]);
        }
        if (r26 != null) {
            r3.invoke();
        }
        return z5;
    }

    private final C62562rb A00(String str, String str2) {
        String A002 = this.A0L.A00();
        String str3 = str;
        if (str != null) {
            String A0D2 = this.A06.A0D();
            C18070vi.A0X(A0D2);
            return new C62562rb(A002, str3, str2, A0D2, 0, 0, AnonymousClass11P.A01(this.A09), 0, ((SharedPreferences) this.A0A.A00.get()).getLong("registration_success_time_ms", 0), true, false);
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final C62562rb A03() {
        String str;
        String str2;
        boolean z;
        String str3;
        Log.i("AccountSwitcher/getCurrentAccount");
        AnonymousClass11S r1 = this.A06;
        AnonymousClass1E2 A092 = r1.A09();
        if (A092 != null) {
            str = A092.getRawString();
        } else {
            str = null;
        }
        r1.A0I();
        PhoneUserJid phoneUserJid = r1.A0E;
        if (phoneUserJid != null) {
            str2 = phoneUserJid.user;
        } else {
            str2 = null;
        }
        if (str == null || str.length() == 0) {
            Log.i("AccountSwitcher/getCurrentAccount/lid is null or empty");
            z = true;
        } else {
            z = false;
        }
        if (str2 == null || str2.length() == 0) {
            Log.i("AccountSwitcher/getCurrentAccount/phoneUserJid is null or empty");
        } else if (!z) {
            return A00(str, str2);
        }
        AnonymousClass00H r4 = this.A0A.A00;
        if (!((SharedPreferences) r4.get()).getBoolean("support_ban_appeal_user_banned_from_chat_disconnect", false)) {
            return null;
        }
        Log.i("AccountSwitcher/getCurrentAccount/userBannedFromChatDisconnect");
        Log.i("AccountSwitcher/getBannedCurrentAccount");
        String string = ((SharedPreferences) r4.get()).getString("account_switching_banned_account_lid", (String) null);
        String string2 = ((SharedPreferences) r4.get()).getString("account_switching_banned_account_phone_user_jid", (String) null);
        if (string == null || string.length() == 0) {
            str3 = "AccountSwitcher/getBannedCurrentAccount/lid is null or empty";
        } else if (string2 != null && string2.length() != 0) {
            return A00(string, string2);
        } else {
            str3 = "AccountSwitcher/getBannedCurrentAccount/phoneUserJid is null or empty";
        }
        Log.i(str3);
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x009d, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:?, code lost:
        X.CDX.A00(r5, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a1, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00a4, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        X.CDX.A00(r2, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x00a8, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A07(X.C62562rb r8) {
        /*
            r7 = this;
            java.lang.String r0 = "AccountSwitcher/getJidForInactiveAccount"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            X.00H r0 = r7.A0G
            java.lang.Object r0 = r0.get()
            X.A8T r0 = (X.A8T) r0
            java.io.File r2 = r0.A0A(r8)
            r6 = 0
            java.lang.String r4 = "AccountSwitcher/getJidForInactiveAccount/"
            if (r2 == 0) goto L_0x0038
            boolean r0 = r2.exists()
            if (r0 != 0) goto L_0x0038
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r0 = X.C49842Sd.A00(r8)
            r1.append(r0)
            java.lang.String r0 = ": files dir does not exist"
        L_0x002d:
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r6
        L_0x0038:
            java.lang.String r0 = "me"
            java.io.File r1 = new java.io.File
            r1.<init>(r2, r0)
            boolean r0 = r1.exists()
            if (r0 != 0) goto L_0x0057
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r0 = X.C49842Sd.A00(r8)
            r1.append(r0)
            java.lang.String r0 = ": me file does not exist"
            goto L_0x002d
        L_0x0057:
            r3 = 58
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch:{ 11T | IOException | ClassNotFoundException -> 0x00a9 }
            r2.<init>(r1)     // Catch:{ 11T | IOException | ClassNotFoundException -> 0x00a9 }
            X.1Dq r5 = new X.1Dq     // Catch:{ all -> 0x00a2 }
            r5.<init>(r2)     // Catch:{ all -> 0x00a2 }
            java.lang.Object r1 = r5.readObject()     // Catch:{ all -> 0x009b }
            java.lang.String r0 = "null cannot be cast to non-null type com.whatsapp.Me"
            X.C18070vi.A0z(r1, r0)     // Catch:{ all -> 0x009b }
            com.whatsapp.Me r1 = (com.whatsapp.Me) r1     // Catch:{ all -> 0x009b }
            java.lang.String r0 = r1.jabber_id     // Catch:{ all -> 0x009b }
            if (r0 == 0) goto L_0x0079
            r5.close()     // Catch:{ all -> 0x00a2 }
            r2.close()     // Catch:{ 11T | IOException | ClassNotFoundException -> 0x00a9 }
            return r0
        L_0x0079:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x009b }
            r1.<init>()     // Catch:{ all -> 0x009b }
            r1.append(r4)     // Catch:{ all -> 0x009b }
            java.lang.String r0 = X.C49842Sd.A00(r8)     // Catch:{ all -> 0x009b }
            r1.append(r0)     // Catch:{ all -> 0x009b }
            java.lang.String r0 = " jabber_id is null"
            r1.append(r0)     // Catch:{ all -> 0x009b }
            java.lang.String r0 = r1.toString()     // Catch:{ all -> 0x009b }
            com.whatsapp.util.Log.e((java.lang.String) r0)     // Catch:{ all -> 0x009b }
            r5.close()     // Catch:{ all -> 0x00a2 }
            r2.close()     // Catch:{ 11T | IOException | ClassNotFoundException -> 0x00a9 }
            return r6
        L_0x009b:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x009d }
        L_0x009d:
            r0 = move-exception
            X.CDX.A00(r5, r1)     // Catch:{ all -> 0x00a2 }
            throw r0     // Catch:{ all -> 0x00a2 }
        L_0x00a2:
            r1 = move-exception
            throw r1     // Catch:{ all -> 0x00a4 }
        L_0x00a4:
            r0 = move-exception
            X.CDX.A00(r2, r1)     // Catch:{ 11T | IOException | ClassNotFoundException -> 0x00a9 }
            throw r0     // Catch:{ 11T | IOException | ClassNotFoundException -> 0x00a9 }
        L_0x00a9:
            r2 = move-exception
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r4)
            java.lang.String r0 = X.C49842Sd.A00(r8)
            r1.append(r0)
            r1.append(r3)
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            com.whatsapp.util.Log.e((java.lang.String) r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C29491cN.A07(X.2rb):java.lang.String");
    }

    public final List A09(boolean z, boolean z2, boolean z3) {
        AnonymousClass00H r2 = this.A0F;
        boolean A0K2 = ((C64012u4) r2.get()).A0K();
        C64012u4 r0 = (C64012u4) r2.get();
        if (!A0K2) {
            return r0.A0F();
        }
        List<C62562rb> A0F2 = r0.A0F();
        ArrayList arrayList = new ArrayList(C29351c6.A0C(A0F2, 10));
        for (C62562rb A042 : A0F2) {
            arrayList.add(A04(A042, z, z2, z3));
        }
        return arrayList;
    }

    public final void A0A() {
        String str;
        Log.i("AccountSwitcher/updateBannedAccountSharedPrefs");
        AnonymousClass11S r5 = this.A06;
        if (r5.A09() != null) {
            r5.A0I();
            if (r5.A0E != null) {
                C19830z4 r4 = this.A0A;
                AnonymousClass1E2 A092 = r5.A09();
                String str2 = null;
                if (A092 != null) {
                    str = A092.getRawString();
                } else {
                    str = null;
                }
                C19830z4.A00(r4).putString("account_switching_banned_account_lid", str).apply();
                r5.A0I();
                PhoneUserJid phoneUserJid = r5.A0E;
                if (phoneUserJid != null) {
                    str2 = phoneUserJid.user;
                }
                C19830z4.A00(r4).putString("account_switching_banned_account_phone_user_jid", str2).apply();
                return;
            }
        }
        Log.i("AccountSwitcher/updateBannedAccountSharedPrefs/me manager is null");
    }

    public final void A0B(Activity activity, String str, boolean z) {
        String str2;
        StringBuilder sb = new StringBuilder();
        sb.append("AccountSwitcher/abandonAddAccount/");
        if (str != null) {
            str2 = C60322np.A01(str);
        } else {
            str2 = null;
        }
        sb.append(str2);
        Log.i(sb.toString());
        A02(activity, AnonymousClass1LU.A1Y(activity, str, this.A0B.A01(), this.A0A.A0E(), z), this);
    }

    public final void A0C(Activity activity, boolean z) {
        Log.i("AccountSwitcher/abandonAddAccount");
        A0B(activity, (String) null, z);
    }

    public final boolean A0E() {
        if (this.A0A.A0E() > 0) {
            return true;
        }
        return false;
    }

    public final boolean A0F() {
        C18030ve r3 = this.A0D;
        C18040vf r2 = C18040vf.A02;
        if (!C18020vd.A05(r2, r3, 5840)) {
            AnonymousClass11S r1 = this.A06;
            if ((!r1.A0N() || !A0E()) && r1.A0N()) {
                return false;
            }
        }
        if (C18020vd.A05(r2, r3, 4377) || A0E()) {
            return true;
        }
        return false;
    }

    public final boolean A0G() {
        if (C18020vd.A05(C18040vf.A02, this.A0D, 7582)) {
            return true;
        }
        return false;
    }

    public final boolean A0H() {
        for (C62562rb r0 : ((C64012u4) this.A0F.get()).A0F()) {
            if (r0.A00 > 0) {
                return true;
            }
        }
        return false;
    }

    public static final void A01(Context context, C18090vk r5, int i, int i2) {
        Activity A002 = C18050vg.A00(context);
        if (A002 != null && !AnonymousClass4Yv.A02(A002)) {
            C73203Rj A003 = AnonymousClass4a6.A00(context);
            A003.A0S(context.getString(i2));
            A003.A0k(context.getString(i));
            A003.A0Z(new AnonymousClass4aq(r5, 10), 2131899286);
            A003.A0T(true);
            A003.create().show();
        } else if (r5 != null) {
            r5.invoke();
        }
    }

    public static final boolean A02(Context context, Intent intent, C29491cN r7) {
        if (System.currentTimeMillis() - r7.A02 < C20113A7w.A0L) {
            Log.i("AccountSwitcher/shouldTakeAccountSwitchingAction/ignoring as last action was recently called");
            return false;
        }
        r7.A02 = System.currentTimeMillis();
        r7.A04.A08(context, intent);
        return true;
    }

    public final C62562rb A06(String str, boolean z, boolean z2) {
        Object obj;
        ArrayList arrayList;
        C60322np.A01(str);
        AnonymousClass00H r2 = this.A0F;
        if (!((C64012u4) r2.get()).A0K()) {
            Iterator it = ((C64012u4) r2.get()).A0F().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                obj = it.next();
                if (C18070vi.A18(((C62562rb) obj).A07, str)) {
                    break;
                }
            }
        } else {
            boolean A0K2 = ((C64012u4) r2.get()).A0K();
            C59692mj A012 = C64012u4.A01((C64012u4) r2.get());
            if (A0K2) {
                List<C62562rb> list = A012.A02;
                ArrayList arrayList2 = new ArrayList(C29351c6.A0C(list, 10));
                for (C62562rb A042 : list) {
                    arrayList2.add(A04(A042, true, z, z2));
                }
                arrayList = arrayList2;
            } else {
                arrayList = A012.A02;
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                obj = it2.next();
                if (C18070vi.A18(((C62562rb) obj).A07, str)) {
                    break;
                }
            }
        }
        obj = null;
        return (C62562rb) obj;
    }

    public final boolean A0J(boolean z) {
        if (!A0F() || !A0E() || z) {
            return false;
        }
        return true;
    }
}
