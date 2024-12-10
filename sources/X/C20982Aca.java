package X;

import com.whatsapp.jid.Jid;
import java.util.Iterator;

/* renamed from: X.Aca  reason: case insensitive filesystem */
public class C20982Aca implements AnonymousClass1O5 {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public C20982Aca(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i) {
        this.A00 = i;
        this.A01 = obj2;
        this.A05 = obj3;
        this.A03 = obj4;
        this.A02 = obj;
        this.A04 = obj5;
    }

    public void BrD(String str) {
        switch (this.A00) {
            case 0:
                C17900vP.A0e("BackupSendMethods/sendGetCipherKey/failed to deliver id=", str, C18070vi.A0K(str));
                return;
            case 1:
                C17900vP.A0e("encb/EncryptedBackupProtocolHelper/sendBeginRegI/onDeliveryFailure id=", str, C18070vi.A0K(str));
                ((AMT) this.A01).Bt2("delivery failure", 3, -1);
                return;
            default:
                AnonymousClass8BY.A0m((C23570Bly) this.A02, "sendRevokeGroupInvites IQ was not delivered: iq=", str, AnonymousClass000.A10());
                return;
        }
    }

    public void Bt9(C29621ca r10, String str) {
        String str2;
        switch (this.A00) {
            case 0:
                C18070vi.A0h(str, r10);
                Iterator A0r = AnonymousClass8BW.A0r(r10, "error");
                while (A0r.hasNext()) {
                    C29621ca A0a = C17880vN.A0a(A0r);
                    if (A0a != null) {
                        String A0Q = A0a.A0Q("code", (String) null);
                        String A0Q2 = A0a.A0Q("text", (String) null);
                        StringBuilder A10 = AnonymousClass000.A10();
                        A10.append("BackupSendMethods/sendGetCipherKey id=");
                        A10.append(str);
                        A10.append(" error=");
                        A10.append(A0Q);
                        A10.append(' ');
                        C17890vO.A1B(A10, A0Q2);
                        if (A0Q != null) {
                            int parseInt = Integer.parseInt(A0Q);
                            byte[] bArr = (byte[]) this.A01;
                            byte[] bArr2 = (byte[]) this.A02;
                            Runnable runnable = (Runnable) this.A04;
                            if (((Integer) this.A03).intValue() != 0) {
                                str2 = "CREATE_IN_MEMORY_KEY";
                            } else {
                                str2 = "CREATE_BACKUP_KEY";
                            }
                            AnonymousClass8BS.A1K((byte[]) null);
                            AnonymousClass8BS.A1K((byte[]) null);
                            AnonymousClass8BS.A1K(bArr);
                            AnonymousClass8BS.A1K(bArr2);
                            StringBuilder A102 = AnonymousClass000.A10();
                            A102.append("BackupSendMethods/handleCreateCipherKeyResponse failed to create a key, creation_mode= ");
                            A102.append(str2);
                            C17900vP.A0i(", error_code=", A102, parseInt);
                            if (runnable != null) {
                                runnable.run();
                            }
                        }
                    }
                }
                return;
            case 1:
                C18070vi.A0h(str, r10);
                AnonymousClass1NU.A00((AMT) this.A01, r10, str);
                return;
            default:
                ((B9K) this.A04).CGB(C60482o6.A00(r10));
                AnonymousClass8BU.A1G(this.A02);
                return;
        }
    }

    public void C7Z(C29621ca r21, String str) {
        AnonymousClass1UI r0;
        String str2;
        C29621ca r14 = r21;
        switch (this.A00) {
            case 0:
                C18070vi.A0d(r14, 1);
                C29621ca A0J = r14.A0J(0);
                C17960vV.A07(A0J);
                C18070vi.A0X(A0J);
                C29621ca.A04(A0J, "crypto");
                String A022 = C29621ca.A02(A0J, "version");
                byte[] bArr = A0J.A0L("code").A01;
                byte[] bArr2 = A0J.A0L("password").A01;
                byte[] bArr3 = (byte[]) this.A01;
                byte[] bArr4 = (byte[]) this.A02;
                Runnable runnable = (Runnable) this.A04;
                int intValue = ((Integer) this.A03).intValue();
                if (intValue != 0) {
                    str2 = "CREATE_IN_MEMORY_KEY";
                } else {
                    str2 = "CREATE_BACKUP_KEY";
                }
                AnonymousClass8BS.A1K(bArr);
                AnonymousClass8BS.A1K(bArr2);
                AnonymousClass8BS.A1K(bArr3);
                AnonymousClass8BS.A1K(bArr4);
                if (A022 == null || bArr == null || bArr2 == null) {
                    StringBuilder A10 = AnonymousClass000.A10();
                    A10.append("BackupSendMethods/handleCreateCipherKeyResponse failed to create a key, creation_mode= ");
                    A10.append(str2);
                    C17900vP.A0i(", error_code=", A10, 0);
                } else {
                    C27341Vs r02 = (C27341Vs) this.A05;
                    if (intValue != 0) {
                        ((AnonymousClass9j8) r02.A01.get()).A00(A022, bArr2, bArr, bArr3, 0);
                    } else {
                        A85.A04(C108945cZ.A0E(r02.A00), A022, bArr, bArr2, bArr3, bArr4);
                    }
                }
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 1:
                String str3 = str;
                char A17 = C18070vi.A17(str3, r14);
                Object obj = this.A03;
                byte[] bArr5 = (byte[]) this.A02;
                AnonymousClass9F7 r8 = (AnonymousClass9F7) this.A04;
                AMT amt = (AMT) this.A01;
                C17900vP.A0f("encb/EncryptedBackupProtocolHelper/beginRegOnSuccess id=", str3, AnonymousClass000.A10());
                try {
                    C108945cZ.A1N(r14);
                    Object obj2 = r8.A00;
                    C62672rm A0s = AnonymousClass8BR.A0s();
                    String[] strArr = new String[2];
                    strArr[0] = "r2";
                    strArr[A17] = "#elementValue";
                    Class<byte[]> cls = byte[].class;
                    byte[] bArr6 = (byte[]) A0s.A04(r14, cls, C108975cc.A0X(), AnonymousClass8BV.A0k(), (Object) null, strArr);
                    if (bArr6 != null) {
                        String[] strArr2 = new String[2];
                        strArr2[0] = "r2_sig";
                        strArr2[A17] = "#elementValue";
                        byte[] bArr7 = (byte[]) A0s.A04(r14, cls, 64L, 64, (Object) null, strArr2);
                        if (bArr7 != null) {
                            String[] strArr3 = new String[2];
                            strArr3[0] = "opaque_c";
                            strArr3[A17] = "#elementValue";
                            Long A0d = AnonymousClass8BV.A0d();
                            Object A042 = A0s.A04(r14, cls, A0d, A0d, (Object) null, strArr3);
                            if (A042 != null) {
                                C197409we r10 = C197409we.A00;
                                if (C21289Aha.A01(r14, A0s, obj2, r10, 38) != null) {
                                    C21285AhW.A00(r14, A0s, r10, 14);
                                    byte[] bArr8 = AnonymousClass1NU.A02;
                                    int length = bArr6.length;
                                    byte[] bArr9 = new byte[(length + 1)];
                                    System.arraycopy(bArr8, 0, bArr9, 0, 1);
                                    System.arraycopy(bArr6, 0, bArr9, 1, length);
                                    if (!A60.A01(bArr9, bArr7, bArr5)) {
                                        C17900vP.A0e("encb/EncryptedBackupProtocolHelper/beginRegOnSuccess/r2 cannot be verified with r2_sig and ed_pub id=", str3, AnonymousClass000.A10());
                                        amt.Bt2("r2 cannot be verified with r2_sig and ed_pub", 2, -1);
                                        return;
                                    }
                                    amt.A00.A02();
                                    amt.A01.CGF(new C21368Aix(amt, bArr6, obj, A042, 33));
                                    return;
                                }
                                r0 = AnonymousClass1O9.A00(A0s);
                            } else {
                                r0 = AnonymousClass1O9.A00(A0s);
                            }
                        } else {
                            r0 = AnonymousClass1O9.A00(A0s);
                        }
                    } else {
                        r0 = AnonymousClass1O9.A00(A0s);
                    }
                    throw r0;
                } catch (AnonymousClass1UI e) {
                    AnonymousClass1NU.A01(amt, e, str3, "beginRegOnSuccess");
                    return;
                }
            default:
                C29621ca A0K = r14.A0K("membership_approval_request");
                B8C b8c = (B8C) this.A05;
                Jid jid = (Jid) this.A03;
                int i = 1;
                if (A0K == null) {
                    i = 0;
                }
                b8c.CGC(jid, i);
                AnonymousClass8BU.A1G(this.A02);
                return;
        }
    }

    public /* synthetic */ C22384B5n CM9(String str) {
        return C20958AcC.A00;
    }
}
