package X;

import com.facebook.simplejni.NativeHolder;
import com.whatsapp.jid.GroupJid;
import com.whatsapp.jid.Jid;
import com.whatsapp.jid.PhoneUserJid;
import com.whatsapp.jid.UserJid;
import com.whatsapp.jobqueue.job.GeneratePrivacyTokenJob;
import com.whatsapp.wamsys.JniBridge;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.AcW  reason: case insensitive filesystem */
public class C20978AcW implements AnonymousClass1O5 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C20978AcW(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A03 = obj4;
        this.A04 = obj3;
        this.A02 = obj;
    }

    public void BrD(String str) {
        switch (this.A00) {
            case 0:
                C17900vP.A0e("encb/EncryptedBackupProtocolHelper/sendBeginLoginIq/onDeliveryFailure id=", str, C18070vi.A0K(str));
                ((AMT) this.A01).Bt2("delivery failure", 3, -1);
                return;
            case 1:
                ((C30391dr) this.A02).resumeWith(AUE.A00);
                return;
            case 2:
                C17900vP.A0f("GroupXmppMethods/sendJoinGroupByCode/onDeliveryFailure; iq=", str, AnonymousClass000.A10());
                AnonymousClass8BY.A0m((C23570Bly) this.A02, "joinGroupByCode IQ was not delivered: iq=", str, AnonymousClass000.A10());
                return;
            case 3:
                C17900vP.A0f("GroupXmppMethods/sendRevokeGroupInvites/onDeliveryFailure; iq=", str, AnonymousClass000.A10());
                AnonymousClass8BY.A0m((C23570Bly) this.A02, "sendRevokeGroupInvites IQ was not delivered: iq=", str, AnonymousClass000.A10());
                return;
            default:
                C18070vi.A0d(str, 0);
                ((C26981Ug) this.A01).BrC(new AnonymousClass9L7(str));
                return;
        }
    }

    public void Bt9(C29621ca r8, String str) {
        Integer num;
        int i;
        switch (this.A00) {
            case 0:
                C18070vi.A0h(str, r8);
                AnonymousClass1NU.A00((AMT) this.A01, r8, str);
                return;
            case 1:
                C18070vi.A0d(r8, 1);
                int A09 = r8.A0L("error").A09("code");
                C30391dr r5 = (C30391dr) this.A02;
                Integer[] A002 = AnonymousClass00R.A00(6);
                int length = A002.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        num = A002[i2];
                        switch (num.intValue()) {
                            case 1:
                                i = 404;
                                break;
                            case 2:
                                i = 423;
                                break;
                            case 3:
                                i = 429;
                                break;
                            case 4:
                                i = 500;
                                break;
                            case 5:
                                i = 1;
                                break;
                            default:
                                i = 401;
                                break;
                        }
                        if (i != A09) {
                            i2++;
                        }
                    } else {
                        num = AnonymousClass00R.A0j;
                    }
                }
                r5.resumeWith(new AUG(num));
                return;
            case 2:
                ((B9K) this.A03).CGB(C60482o6.A00(r8));
                break;
            case 3:
                C183169Xf r0 = (C183169Xf) this.A04;
                if (r0 != null) {
                    r0.A00.A00 = C60482o6.A00(r8);
                    break;
                }
                break;
            default:
                C18070vi.A0h(str, r8);
                ((C26981Ug) this.A01).BrC(new C122936Sm(r8, str));
                return;
        }
        AnonymousClass8BU.A1G(this.A02);
    }

    public void C7Z(C29621ca r21, String str) {
        AnonymousClass1UI th;
        long j;
        byte[] bArr;
        AnonymousClass9Y2 r11;
        int i;
        C30391dr r1;
        Object obj;
        C179659Iv r5;
        B8C b8c;
        Jid A0F;
        int i2;
        C29621ca r14 = r21;
        switch (this.A00) {
            case 0:
                String str2 = str;
                int A17 = C18070vi.A17(str2, r14);
                byte[] bArr2 = (byte[]) this.A02;
                C20121A8g a8g = (C20121A8g) this.A03;
                C167358g3 r2 = (C167358g3) this.A01;
                C17900vP.A0f("encb/EncryptedBackupProtocolHelper/beginLoginOnSuccess id=", str2, AnonymousClass000.A10());
                try {
                    C29621ca A032 = C20121A8g.A03(r14, a8g);
                    C62672rm A0s = AnonymousClass8BR.A0s();
                    String[] strArr = new String[2];
                    strArr[0] = "l2";
                    strArr[A17] = "#elementValue";
                    Class<byte[]> cls = byte[].class;
                    byte[] bArr3 = (byte[]) A0s.A04(r14, cls, C108975cc.A0X(), AnonymousClass8BV.A0k(), (Object) null, strArr);
                    if (bArr3 != null) {
                        String[] strArr2 = new String[2];
                        strArr2[0] = "l2_sig";
                        strArr2[A17] = "#elementValue";
                        byte[] bArr4 = (byte[]) A0s.A04(r14, cls, 64L, 64, (Object) null, strArr2);
                        if (bArr4 != null) {
                            C197409we r10 = C197409we.A00;
                            if (C21289Aha.A00(A032, r10, 37).BCF(r14, A0s) != null) {
                                C21285AhW ahW = new C21285AhW(r10, 9);
                                C18070vi.A0d(ahW, A17);
                                if (ahW.BCF(r14, A0s) != null) {
                                    C21285AhW.A00(r14, A0s, r10, 10);
                                    String[] strArr3 = new String[A17];
                                    strArr3[0] = "count";
                                    A0s.A02(r14, new C21285AhW(r10, 11), strArr3);
                                    String[] strArr4 = new String[A17];
                                    strArr4[0] = "backoff";
                                    AnonymousClass9CX r112 = (AnonymousClass9CX) A0s.A02(r14, new C21285AhW(r10, 12), strArr4);
                                    String[] strArr5 = new String[A17];
                                    strArr5[0] = "max_attempts";
                                    A0s.A02(r14, new C21285AhW(r10, 13), strArr5);
                                    if (r112 != null) {
                                        j = r112.A00;
                                    } else {
                                        j = 0;
                                    }
                                    byte[] bArr5 = AnonymousClass1NU.A01;
                                    int length = bArr3.length;
                                    byte[] bArr6 = new byte[(length + 1)];
                                    System.arraycopy(bArr5, 0, bArr6, 0, A17);
                                    System.arraycopy(bArr3, 0, bArr6, A17, length);
                                    if (!A60.A01(bArr6, bArr4, bArr2)) {
                                        C17900vP.A0e("encb/EncryptedBackupProtocolHelper/beginLoginOnSuccess/l2 cannot be verified with l2_sig and ed_pub id=", str2, AnonymousClass000.A10());
                                        r2.Bt2("l2 cannot be verified with l2_sig and ed_pub", 2, -1);
                                        return;
                                    }
                                    int i3 = (int) j;
                                    r2.A00.A02();
                                    Object obj2 = r2.A0B;
                                    synchronized (obj2) {
                                        try {
                                            bArr = r2.A06;
                                            r11 = r2.A04;
                                            i = r2.A01;
                                        } catch (Throwable th2) {
                                            while (true) {
                                                th = th2;
                                            }
                                        }
                                    }
                                    C17960vV.A07(r11);
                                    C17960vV.A07(bArr);
                                    AnonymousClass9Y0 r8 = new AnonymousClass9Y0((NativeHolder) JniBridge.jvidispatchOIOOO(100000, r11.A00, bArr, bArr3));
                                    JniBridge.getInstance();
                                    NativeHolder nativeHolder = r8.A00;
                                    int jvidispatchIIO = (int) JniBridge.jvidispatchIIO(A17, 64, nativeHolder);
                                    if (jvidispatchIIO == -1) {
                                        r2.A08.BtE(8, i - 1, i3);
                                        return;
                                    } else if (jvidispatchIIO != 0) {
                                        B71 b71 = r2.A08;
                                        StringBuilder A10 = AnonymousClass000.A10();
                                        A10.append("WESOpaqueClientCreateLoginFinish failed with WESOpaqueStatusType=");
                                        A10.append(jvidispatchIIO);
                                        A10.toString();
                                        b71.BtE(4, -1, -1);
                                        return;
                                    } else {
                                        JniBridge.getInstance();
                                        byte[] bArr7 = (byte[]) JniBridge.jvidispatchOIO(0, 67, nativeHolder);
                                        synchronized (obj2) {
                                            try {
                                                r2.A03 = r8;
                                                r2.A07 = bArr7;
                                                r2.A00 = 2;
                                            } catch (Throwable th3) {
                                                while (true) {
                                                    th = th3;
                                                }
                                            }
                                        }
                                        r2.A00();
                                        return;
                                    }
                                } else {
                                    th = AnonymousClass1O9.A00(A0s);
                                }
                            } else {
                                th = AnonymousClass1O9.A00(A0s);
                            }
                        } else {
                            th = AnonymousClass1O9.A00(A0s);
                        }
                    } else {
                        th = AnonymousClass1O9.A00(A0s);
                    }
                    throw th;
                } catch (AnonymousClass1UI e) {
                    AnonymousClass1NU.A01(r2, e, str2, "beginLoginOnSuccess");
                    return;
                }
            case 1:
                C18070vi.A0d(r14, 1);
                Jid A0G = r14.A0G(GroupJid.class, "from");
                C195349tC r7 = (C195349tC) this.A03;
                boolean A18 = C18070vi.A18(A0G, r7.A01);
                C17960vV.A0F(A18, "Group Jid in request and response don't match.");
                if (A18) {
                    C29621ca A0L = r14.A0L("membership_requests_action").A0L(((C179639It) this.A01).value).A0L("participant");
                    Jid A0G2 = A0L.A0G(UserJid.class, "jid");
                    Jid A0F2 = A0L.A0F(PhoneUserJid.class, "phone_number");
                    if (C22971Dz.A0T(A0G2) && A0F2 != null) {
                        ((C31661fv) ((C187279fY) this.A04).A04.get()).A01(C108975cc.A0h(A0G2, A0F2));
                    }
                    boolean A182 = C18070vi.A18(A0G2, r7.A04);
                    C17960vV.A0F(A182, "Requester Jid in request and response don't match.");
                    if (A182) {
                        String A022 = C29621ca.A02(A0L, "error");
                        if (A022 == null) {
                            r1 = (C30391dr) this.A02;
                            obj = AUF.A00;
                            r1.resumeWith(obj);
                            return;
                        }
                        int parseInt = Integer.parseInt(A022);
                        C179659Iv[] values = C179659Iv.values();
                        int length2 = values.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 < length2) {
                                r5 = values[i4];
                                if (r5.value != parseInt) {
                                    i4++;
                                }
                            } else {
                                r5 = C179659Iv.A02;
                            }
                        }
                        C187279fY r4 = (C187279fY) this.A04;
                        r4.A00.CGF(new AnonymousClass7R0(r5, r7, r4, 0));
                        ((C30391dr) this.A02).resumeWith(new AUD(r5));
                        return;
                    }
                }
                r1 = (C30391dr) this.A02;
                obj = AUE.A00;
                r1.resumeWith(obj);
                return;
            case 2:
                C29621ca A0I = r14.A0I();
                String str3 = A0I.A00;
                if ("group".equals(str3)) {
                    b8c = (B8C) this.A04;
                    A0F = A0I.A0F(AnonymousClass1EC.class, "jid");
                    i2 = 0;
                } else if ("membership_approval_request".equals(str3)) {
                    b8c = (B8C) this.A04;
                    A0F = A0I.A0F(AnonymousClass1EC.class, "jid");
                    i2 = 1;
                } else {
                    StringBuilder A102 = AnonymousClass000.A10();
                    A102.append("Connection/sendJoinGroupByCode unrecognized node:");
                    A102.append(r14);
                    AnonymousClass1UI A012 = AnonymousClass1UI.A01(AnonymousClass001.A1H(" tag:", str3, A102));
                    ((C23570Bly) this.A02).A03((Object) null);
                    throw A012;
                }
                b8c.CGC(A0F, i2);
                ((C23570Bly) this.A02).A03((Object) null);
                return;
            case 3:
                AnonymousClass1F8 r6 = new AnonymousClass1F8();
                C201210x r52 = new C201210x();
                List A0R = r14.A0L("revoke").A0R("participant");
                HashMap A11 = C17880vN.A11();
                Iterator it = A0R.iterator();
                while (it.hasNext()) {
                    C29621ca A0a = C17880vN.A0a(it);
                    Jid A0F3 = A0a.A0F(UserJid.class, "jid");
                    Jid A0F4 = A0a.A0F(PhoneUserJid.class, "phone_number");
                    if (C22971Dz.A0T(A0F3) && A0F4 != null) {
                        A11.put(A0F3, A0F4);
                    }
                    String A023 = C29621ca.A02(A0a, "error");
                    if (A0F3 != null) {
                        if (A023 != null) {
                            try {
                                r52.put(A0F3, C108955ca.A0l(A023));
                            } catch (Exception unused) {
                            }
                        } else {
                            r6.add((Object) A0F3);
                        }
                    }
                }
                C199410f build = r6.build();
                C201110w build2 = r52.build();
                AnonymousClass126 r62 = (AnonymousClass126) ((AnonymousClass12M) this.A01).A06.get();
                r62.A0k.CGF(new C21468AkZ(build2, r62, this.A03, A11, build, 24));
                C183169Xf r12 = (C183169Xf) this.A04;
                if (r12 != null) {
                    C18070vi.A0d(build2, 1);
                    AnonymousClass9BZ r0 = r12.A00;
                    r0.A02 = build;
                    r0.A01 = build2;
                }
                AnonymousClass8BU.A1G(this.A02);
                return;
            default:
                C25111Mx r53 = ((GeneratePrivacyTokenJob) this.A04).A00;
                if (r53 == null) {
                    C18070vi.A11("privacyTokenManager");
                    throw null;
                }
                r53.A0A((UserJid) this.A03, C17880vN.A05(this.A02));
                ((C26981Ug) this.A01).BrF((Object) null);
                return;
        }
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
