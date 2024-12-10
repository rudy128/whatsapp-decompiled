package X;

import android.content.Context;
import android.text.format.Formatter;
import com.whatsapp.migration.transfer.ui.ChatTransferViewModel;
import com.whatsapp.util.Log;

/* renamed from: X.AWr  reason: case insensitive filesystem */
public class C20736AWr implements C23691Hg {
    public final int A00;
    public final int A01;

    public C20736AWr(int i, int i2) {
        this.A00 = i2;
        this.A01 = i;
    }

    public static void A00(AnonymousClass10T r1, int i, int i2) {
        r1.notifyAllObservers(new C20736AWr(i, i2));
    }

    public final void CGE(Object obj) {
        C20276AEj aEj;
        switch (this.A00) {
            case 0:
                ((BDF) obj).C4X(this.A01);
                return;
            case 1:
                int i = this.A01;
                C97654pp r9 = (C97654pp) obj;
                C17900vP.A0k("CompanionRegistrationHelper/onTooManyLinkedDevicesError ", AnonymousClass3MZ.A19(r9, 1), i);
                AnonymousClass1FU r3 = (AnonymousClass1FU) r9.A01;
                Log.e("InstrumentationAuthActivity/onCompanionRegistrationTooManyLinkedDevices");
                r3.A05.A0J(new AnonymousClass7RM((Object) r3, i, 12));
                return;
            case 2:
                ((C25231Nk) obj).BqN(this.A01);
                return;
            case 3:
                int i2 = this.A01;
                BCU bcu = (BCU) obj;
                C18070vi.A0d(bcu, 1);
                bcu.BlD(i2);
                return;
            case 4:
                int i3 = this.A01;
                BCU bcu2 = (BCU) obj;
                C18070vi.A0d(bcu2, 1);
                bcu2.C24(i3);
                return;
            case 5:
                int i4 = this.A01;
                C185869dH r92 = (C185869dH) obj;
                if (i4 == 0) {
                    Context context = r92.A00;
                    r92.A01.A00(C17890vO.A0R(context, Formatter.formatFileSize(context, AnonymousClass8BV.A05(r92.A02)), 1, 0, 2131890013));
                    return;
                } else if (i4 == 1) {
                    long A05 = AnonymousClass8BV.A05(r92.A02);
                    if (A05 < 10485760) {
                        Context context2 = r92.A00;
                        String formatFileSize = Formatter.formatFileSize(context2, A05);
                        C17900vP.A0f("errorreporter/diskio/diskspace ", formatFileSize, AnonymousClass000.A10());
                        if (formatFileSize != null) {
                            C27321Vq r2 = r92.A01;
                            StringBuilder A10 = AnonymousClass000.A10();
                            C17880vN.A1A(context2, A10, 2131889992);
                            A10.append(" ");
                            r2.A00(AnonymousClass000.A0y(C17890vO.A0R(context2, formatFileSize, 1, 0, 2131890004), A10));
                            return;
                        }
                    }
                    r92.A01.A00(r92.A00.getString(2131889992));
                    return;
                } else if (i4 == 2) {
                    r92.A01.A00(r92.A00.getString(2131892333));
                    return;
                } else if (i4 != 3) {
                    r92.A01.A00(r92.A00.getString(2131890020));
                    return;
                } else {
                    r92.A01.A00(r92.A00.getString(2131890019));
                    return;
                }
            case 6:
                ((BDR) obj).C20(this.A01);
                return;
            case 7:
                ((BDR) obj).onError(this.A01);
                return;
            case 8:
                ((BDR) obj).C1V(this.A01);
                return;
            case 9:
                ((C22561BCu) obj).Btd(this.A01);
                return;
            case 10:
                ((C22561BCu) obj).onError(this.A01);
                return;
            case 11:
                int i5 = this.A01;
                BDJ bdj = (BDJ) obj;
                C18070vi.A0d(bdj, 1);
                ChatTransferViewModel chatTransferViewModel = ((AW8) bdj).A00;
                if (chatTransferViewModel.A0l() && (aEj = chatTransferViewModel.A01) != null) {
                    aEj.A00 = i5;
                    if (chatTransferViewModel.A0m(aEj)) {
                        chatTransferViewModel.A0a();
                        return;
                    } else {
                        chatTransferViewModel.A0Z();
                        return;
                    }
                } else {
                    return;
                }
            default:
                int i6 = this.A01;
                C21141AfC afC = (C21141AfC) obj;
                DRB drb = afC.A02;
                if (drb != null && afC.A0A.get() == 0) {
                    if (i6 == 0) {
                        afC.A06.addCameraErrorListener(afC);
                        afC.A00 = 0;
                        return;
                    }
                    C21141AfC.A01(drb, afC);
                    return;
                }
                return;
        }
    }
}
