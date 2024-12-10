package X;

import android.app.Activity;
import android.os.Build;
import androidx.fragment.app.Fragment;
import com.whatsapp.status.StatusesFragment;
import com.whatsapp.status.playback.MessageReplyActivity;
import com.whatsapp.util.Log;
import java.util.HashMap;

/* renamed from: X.7Em  reason: invalid class name and case insensitive filesystem */
public class C143707Em implements C23501Gn {
    public final int A00;
    public final Object A01;

    public C143707Em(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public void A02() {
        Activity activity = (Activity) this.A01;
        int i = Build.VERSION.SDK_INT;
        int i2 = 2131894434;
        if (i >= 30) {
            i2 = 2131894437;
            if (i < 33) {
                i2 = 2131894436;
            }
        }
        AnonymousClass74O.A08(activity, 2131894435, i2);
    }

    public void C2V() {
        AnonymousClass1FY r3;
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                throw AnonymousClass000.A0n("must not be called");
            case 1:
                Log.i("settings-gdrive/readonly-external-storage-readonly");
                r3 = (AnonymousClass1FY) this.A01;
                i = 2131892322;
                r3.A0C.get();
                i2 = 2131894931;
                if (AnonymousClass11Z.A00()) {
                    i2 = 2131894930;
                    break;
                }
                break;
            case 2:
                throw AnonymousClass000.A0n("ContactUsDebugInfoRepository/must not be called/external-storage-readonly/must not be called");
            case 3:
                throw AnonymousClass000.A0n("must not be called");
            case 4:
                int A012 = A01();
                int A002 = A00();
                ((AnonymousClass74G) this.A01).A0V.BhU(new Object[0], A012, A002);
                return;
            case 5:
                StatusesFragment statusesFragment = (StatusesFragment) this.A01;
                statusesFragment.A11.get();
                int A013 = A01();
                statusesFragment.A11.get();
                int A003 = A00();
                AnonymousClass1FL A1B = statusesFragment.A1B();
                C17960vV.A07(A1B);
                ((AnonymousClass1FR) A1B).BhU(new Object[0], A013, A003);
                return;
            case 6:
                r3 = (AnonymousClass1FY) this.A01;
                HashMap hashMap = MessageReplyActivity.A1v;
                break;
            case 7:
                r3 = (AnonymousClass1FY) this.A01;
                break;
            default:
                throw AnonymousClass000.A0n("must not be called");
        }
        r3.A0C.get();
        i = A01();
        r3.A0C.get();
        i2 = A00();
        C108965cb.A18(r3, i, i2);
    }

    public void C2W() {
        switch (this.A00) {
            case 0:
                throw AnonymousClass000.A0n("must not be called");
            case 1:
                Log.i("settings-gdrive/readonly-external-storage-readonly-permission");
                A02();
                return;
            case 2:
                throw AnonymousClass000.A0n("ContactUsDebugInfoRepository/must not be called/external-storage-readonly/permission denied/");
            case 3:
                throw AnonymousClass000.A0n("must not be called");
            case 4:
                ((AnonymousClass74G) this.A01).A0V.BhU(new Object[0], 2131886637, 2131894421);
                return;
            case 5:
                AnonymousClass1FL A1B = ((Fragment) this.A01).A1B();
                C17960vV.A07(A1B);
                ((AnonymousClass1FR) A1B).BhU(new Object[0], 2131886637, 2131894421);
                return;
            case 8:
                throw AnonymousClass000.A0n("must not be called");
            default:
                C108965cb.A18((AnonymousClass1FU) this.A01, 2131886637, 2131894421);
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x005b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a2, code lost:
        r2.A0C.get();
        r1 = A01();
        r2.A0C.get();
        X.C108965cb.A18(r2, r1, A00());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00b7, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        X.C17890vO.A1A(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0058, code lost:
        X.AnonymousClass4Yv.A01(r1, r0);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void C9R() {
        /*
            r5 = this;
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x0044;
                case 1: goto L_0x004d;
                case 2: goto L_0x001c;
                case 3: goto L_0x0030;
                case 4: goto L_0x005c;
                case 5: goto L_0x0071;
                case 6: goto L_0x0097;
                case 7: goto L_0x009e;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r2 = r5.A01
            X.6MN r2 = (X.AnonymousClass6MN) r2
            r0 = -2
            r2.A00 = r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "contactsupporttask/externalstorage/avail external storage not calculated, state="
            r1.append(r0)
            java.lang.String r0 = r2.A01
        L_0x0018:
            X.C17890vO.A1A(r1, r0)
            return
        L_0x001c:
            java.lang.Object r2 = r5.A01
            X.6jg r2 = (X.C130586jg) r2
            r0 = -2
            r2.A00 = r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "ContactUsDebugInfoRepository/error-external-storage-unavailable/state="
            r1.append(r0)
            java.lang.String r0 = r2.A01
            goto L_0x0018
        L_0x0030:
            java.lang.Object r2 = r5.A01
            X.6MO r2 = (X.AnonymousClass6MO) r2
            r0 = -2
            r2.A00 = r0
            java.lang.StringBuilder r1 = X.AnonymousClass000.A10()
            java.lang.String r0 = "searchSupportTask/externalStorage/avail external storage not calculated, state="
            r1.append(r0)
            java.lang.String r0 = r2.A04
            goto L_0x0018
        L_0x0044:
            java.lang.Object r0 = r5.A01
            X.99j r0 = (X.C1775899j) r0
            android.app.Activity r1 = r0.A01
            r0 = 107(0x6b, float:1.5E-43)
            goto L_0x0058
        L_0x004d:
            java.lang.String r0 = "settings-gdrive/external-storage-unavailable"
            com.whatsapp.util.Log.i((java.lang.String) r0)
            java.lang.Object r1 = r5.A01
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 602(0x25a, float:8.44E-43)
        L_0x0058:
            X.AnonymousClass4Yv.A01(r1, r0)
            return
        L_0x005c:
            java.lang.Object r4 = r5.A01
            X.74G r4 = (X.AnonymousClass74G) r4
            int r3 = A01()
            int r2 = A00()
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            X.1FU r0 = r4.A0V
            r0.BhU(r1, r3, r2)
            return
        L_0x0071:
            java.lang.Object r4 = r5.A01
            com.whatsapp.status.StatusesFragment r4 = (com.whatsapp.status.StatusesFragment) r4
            X.00H r0 = r4.A11
            r0.get()
            int r3 = A01()
            X.00H r0 = r4.A11
            r0.get()
            int r2 = A00()
            r0 = 0
            java.lang.Object[] r1 = new java.lang.Object[r0]
            X.1FL r0 = r4.A1B()
            X.C17960vV.A07(r0)
            X.1FR r0 = (X.AnonymousClass1FR) r0
            r0.BhU(r1, r3, r2)
            return
        L_0x0097:
            java.lang.Object r2 = r5.A01
            X.1FY r2 = (X.AnonymousClass1FY) r2
            java.util.HashMap r0 = com.whatsapp.status.playback.MessageReplyActivity.A1v
            goto L_0x00a2
        L_0x009e:
            java.lang.Object r2 = r5.A01
            X.1FY r2 = (X.AnonymousClass1FY) r2
        L_0x00a2:
            X.00H r0 = r2.A0C
            r0.get()
            int r1 = A01()
            X.00H r0 = r2.A0C
            r0.get()
            int r0 = A00()
            X.C108965cb.A18(r2, r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C143707Em.C9R():void");
    }

    public void C9S() {
        String str;
        int i;
        switch (this.A00) {
            case 0:
                Activity activity = ((C1775899j) this.A01).A01;
                int i2 = Build.VERSION.SDK_INT;
                if (i2 < 30) {
                    i = 2131894462;
                } else {
                    i = 2131894465;
                    if (i2 < 33) {
                        i = 2131894464;
                    }
                }
                AnonymousClass74O.A09(activity, 2131894463, i, 200);
                return;
            case 1:
                Log.i("settings-gdrive/external-storage-unavailable-permission");
                A02();
                return;
            case 2:
                ((C130586jg) this.A01).A00 = -2;
                str = "ContactUsDebugInfoRepository/error-external-storage-unavailable/permission denied";
                break;
            case 3:
                ((AnonymousClass6MO) this.A01).A00 = -2;
                str = "searchSupportTask/externalStorage/avail external storage not calculated, permission denied";
                break;
            case 4:
                ((AnonymousClass74G) this.A01).A0V.BhU(new Object[0], 2131886637, 2131894421);
                return;
            case 5:
                AnonymousClass1FL A1B = ((Fragment) this.A01).A1B();
                C17960vV.A07(A1B);
                ((AnonymousClass1FR) A1B).BhU(new Object[0], 2131886637, 2131894421);
                return;
            case 8:
                ((AnonymousClass6MN) this.A01).A00 = -2;
                str = "contactsupporttask/externalstorage/avail external storage not calculated, permission denied";
                break;
            default:
                C108965cb.A18((AnonymousClass1FU) this.A01, 2131886637, 2131894421);
                return;
        }
        Log.i(str);
    }

    public static int A00() {
        if (AnonymousClass11Z.A00()) {
            return 2131894957;
        }
        return 2131894958;
    }

    public static int A01() {
        if (AnonymousClass11Z.A00()) {
            return 2131894959;
        }
        return 2131894960;
    }
}
