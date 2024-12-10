package X;

import com.whatsapp.report.activity.banreport.BanReportViewModel;
import com.whatsapp.util.Log;
import java.io.IOException;
import java.util.List;

/* renamed from: X.7I7  reason: invalid class name */
public class AnonymousClass7I7 implements C1606989o {
    public final int A00;
    public final Object A01;

    public static Object A00(AnonymousClass7I7 r1, Object obj) {
        C18070vi.A0d(obj, 0);
        return r1.A01;
    }

    public AnonymousClass7I7(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static Object A01(AnonymousClass7IB r1, C71053Dp r2, int i) {
        r1.CBv(new AnonymousClass7I7(r2, i));
        return r2.A00();
    }

    public void BE5(C138506xC r8) {
        C30391dr r2;
        Object obj;
        Throwable th;
        switch (this.A00) {
            case 0:
                C18070vi.A0d(r8, 0);
                String str = (String) r8.A03.A00;
                C135926sz r0 = (C135926sz) this.A01;
                if (str != null) {
                    C133786pU r02 = r0.A00;
                    C19995A2i a2i = r02.A00;
                    boolean z = r02.A04;
                    a2i.A01(r02.A01, r02.A02, r02.A03, str, z);
                    return;
                }
                r0.A00.A01(new Exception("Null Payload"));
                return;
            case 1:
                String A002 = C138506xC.A00(r8);
                C127166du r22 = (C127166du) r8.A03.A00;
                if (r22 != null) {
                    C30391dr r1 = (C30391dr) this.A01;
                    if (r22.A00.isEmpty()) {
                        Log.e("ImagineAnimateRepository/Empty data returned by server");
                    }
                    r1.resumeWith(r22);
                }
                if (A002 != null) {
                    r2 = (C30391dr) this.A01;
                    th = new C122786Rx(A002);
                    break;
                } else {
                    return;
                }
            case 2:
                String A003 = C138506xC.A00(r8);
                C127166du r23 = (C127166du) r8.A03.A00;
                if (r23 != null) {
                    C30391dr r12 = (C30391dr) this.A01;
                    if (r23.A00.isEmpty()) {
                        Log.e("ImagineEditRepository/Empty data returned by server");
                    }
                    r12.resumeWith(r23);
                }
                if (A003 != null) {
                    r2 = (C30391dr) this.A01;
                    th = new C122796Ry(A003);
                    break;
                } else {
                    return;
                }
            case 3:
                String A004 = C138506xC.A00(r8);
                C127166du r24 = (C127166du) r8.A03.A00;
                if (r24 != null) {
                    C30391dr r13 = (C30391dr) this.A01;
                    if (r24.A00.isEmpty()) {
                        Log.e("ImagineFlashRepository/Empty data returned by server");
                    }
                    r13.resumeWith(r24);
                }
                if (A004 != null) {
                    r2 = (C30391dr) this.A01;
                    th = new C122806Rz(A004);
                    break;
                } else {
                    return;
                }
            case 4:
                String A005 = C138506xC.A00(r8);
                C127176dv r25 = (C127176dv) r8.A03.A00;
                if (r25 != null) {
                    C30391dr r14 = (C30391dr) this.A01;
                    if (r25.A00.isEmpty()) {
                        Log.e("ImagineIntentsRepository/Empty data returned by server");
                    }
                    r14.resumeWith(r25);
                }
                if (A005 != null) {
                    r2 = (C30391dr) this.A01;
                    th = new AnonymousClass6S2(A005);
                    break;
                } else {
                    return;
                }
            case 5:
                String A006 = C138506xC.A00(r8);
                C125826bk r26 = (C125826bk) r8.A03.A00;
                if (r26 != null) {
                    C30391dr r15 = (C30391dr) this.A01;
                    if (!r26.A00) {
                        Log.e("ImagineReportRepository/Data returns as false");
                    } else {
                        r15.resumeWith(r26);
                    }
                }
                if (A006 != null) {
                    r2 = (C30391dr) this.A01;
                    th = new AnonymousClass6S0(A006);
                    break;
                } else {
                    return;
                }
            case 6:
                C18070vi.A0d(r8, 0);
                Exception exc = (Exception) r8.A04.A00();
                if (exc == null) {
                    List list = (List) r8.A03.A00;
                    if (list != null) {
                        C30391dr r16 = (C30391dr) this.A01;
                        if (list.isEmpty()) {
                            exc = new AnonymousClass6S6();
                        } else {
                            r16.resumeWith(list);
                            return;
                        }
                    } else {
                        return;
                    }
                }
                Bsw(exc);
                return;
            case 7:
                ((C30391dr) A00(this, r8)).resumeWith(r8);
                return;
            case 8:
                r2 = (C30391dr) A00(this, r8);
                obj = new AnonymousClass67F(r8);
                break;
            case 9:
                AnonymousClass3MX.A1K(((BanReportViewModel) this.A01).A02, 4);
                return;
            case 10:
                C144607Hy r03 = (C144607Hy) this.A01;
                BanReportViewModel banReportViewModel = r03.A01;
                int i = r03.A00 + 1;
                C17890vO.A0D().postDelayed(new AnonymousClass7RM((Object) banReportViewModel, i, 38), ((long) i) * 5000);
                return;
            default:
                ((C1606989o) A00(this, r8)).BE5(r8);
                return;
        }
        obj = new AnonymousClass1IU(th);
        r2.resumeWith(obj);
    }

    public void BrB(IOException iOException) {
        Object A002;
        C30391dr r1;
        Object r0;
        switch (this.A00) {
            case 0:
                C17900vP.A0Y(iOException, "AgeVerificationBloksFetcherHelper/onDeliveryFail ", C18070vi.A0K(iOException));
                ((C135926sz) this.A01).A00.A00(iOException);
                return;
            case 7:
                A002 = A00(this, iOException);
                break;
            case 8:
                r1 = (C30391dr) A00(this, iOException);
                r0 = new AnonymousClass67D(iOException);
                break;
            case 9:
                Bsw(iOException);
                return;
            case 10:
                AnonymousClass3MX.A1K(((C144607Hy) this.A01).A01.A02, 1);
                return;
            case 11:
                ((C1606989o) A00(this, iOException)).BrB(iOException);
                return;
            default:
                C18070vi.A0d(iOException, 0);
                iOException.getMessage();
                A002 = this.A01;
                break;
        }
        r1 = (C30391dr) A002;
        r0 = C108945cZ.A1J(iOException);
        r1.resumeWith(r0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003e, code lost:
        X.AnonymousClass3MX.A1K(r0.A02, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0044, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000e, code lost:
        r1 = (X.C30391dr) r1;
        r0 = X.C108945cZ.A1J(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0014, code lost:
        r1.resumeWith(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void Bsw(java.lang.Exception r3) {
        /*
            r2 = this;
            int r0 = r2.A00
            switch(r0) {
                case 0: goto L_0x0045;
                case 1: goto L_0x0005;
                case 2: goto L_0x0005;
                case 3: goto L_0x0005;
                case 4: goto L_0x0005;
                case 5: goto L_0x0005;
                case 6: goto L_0x0005;
                case 7: goto L_0x0024;
                case 8: goto L_0x0018;
                case 9: goto L_0x003a;
                case 10: goto L_0x0033;
                case 11: goto L_0x0029;
                default: goto L_0x0005;
            }
        L_0x0005:
            r0 = 0
            X.C18070vi.A0d(r3, r0)
            r3.getMessage()
            java.lang.Object r1 = r2.A01
        L_0x000e:
            X.1dr r1 = (X.C30391dr) r1
            X.1IU r0 = X.C108945cZ.A1J(r3)
        L_0x0014:
            r1.resumeWith(r0)
            return
        L_0x0018:
            java.lang.Object r1 = A00(r2, r3)
            X.1dr r1 = (X.C30391dr) r1
            X.67E r0 = new X.67E
            r0.<init>(r3)
            goto L_0x0014
        L_0x0024:
            java.lang.Object r1 = A00(r2, r3)
            goto L_0x000e
        L_0x0029:
            java.lang.Object r0 = A00(r2, r3)
            X.89o r0 = (X.C1606989o) r0
            r0.Bsw(r3)
            return
        L_0x0033:
            java.lang.Object r0 = r2.A01
            X.7Hy r0 = (X.C144607Hy) r0
            com.whatsapp.report.activity.banreport.BanReportViewModel r0 = r0.A01
            goto L_0x003e
        L_0x003a:
            java.lang.Object r0 = r2.A01
            com.whatsapp.report.activity.banreport.BanReportViewModel r0 = (com.whatsapp.report.activity.banreport.BanReportViewModel) r0
        L_0x003e:
            X.1DT r1 = r0.A02
            r0 = 1
            X.AnonymousClass3MX.A1K(r1, r0)
            return
        L_0x0045:
            java.lang.StringBuilder r1 = X.C18070vi.A0K(r3)
            java.lang.String r0 = "AgeVerificationBloksFetcherHelper/onError "
            X.C17900vP.A0Y(r3, r0, r1)
            java.lang.Object r0 = r2.A01
            X.6sz r0 = (X.C135926sz) r0
            X.6pU r0 = r0.A00
            r0.A01(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass7I7.Bsw(java.lang.Exception):void");
    }
}
