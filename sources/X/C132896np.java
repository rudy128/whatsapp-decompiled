package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: X.6np  reason: invalid class name and case insensitive filesystem */
public final class C132896np {
    public final AnonymousClass118 A00;
    public final C18030ve A01;
    public final AnonymousClass11S A02;
    public final C35541mP A03;
    public final AnonymousClass1LU A04;
    public final AnonymousClass1CM A05;

    public final Intent A00(Bundle bundle, AnonymousClass770 r12, Integer num, String str, String str2, ArrayList arrayList, ArrayList arrayList2, boolean z) {
        Intent A07;
        String str3;
        C18070vi.A0d(str, 1);
        if (z) {
            AnonymousClass11S r0 = this.A02;
            r0.A0I();
            if (r0.A00 != null && this.A05.A04()) {
                if (!C197289wS.A00.contains(str)) {
                    if (C18020vd.A05(C18040vf.A02, this.A01, 9942)) {
                        if (bundle != null) {
                            str3 = bundle.getString("com.whatsapp.support.DescribeProblemActivity.suspendedEntityJid");
                        } else {
                            str3 = null;
                        }
                        Context A0E = C108945cZ.A0E(this.A00);
                        A07 = C17880vN.A0A();
                        A07.setClassName(A0E.getPackageName(), "com.whatsapp.inappsupport.ui.SupportAiActivity");
                        if (r12 != null) {
                            A07.putExtra("com.whatsapp.inappsupport.ui.SupportAiActivity.supportUserContext", r12);
                        }
                        A07.putExtra("com.whatsapp.inappsupport.ui.SupportAiActivity.from", str);
                        if (str3 != null) {
                            A07.putExtra("com.whatsapp.inappsupport.ui.SupportAiActivity.suspendedEntityJid", str3);
                        }
                        if (r12 != null) {
                            str = r12.A01;
                        }
                        this.A03.A02(1, str);
                        return A07;
                    }
                }
                Context context = this.A00.A00;
                A07 = C17880vN.A0A();
                A07.setClassName(context.getPackageName(), "com.whatsapp.inappsupport.ui.ContactUsActivity");
                A07.putExtra("com.whatsapp.inappsupport.ui.ContactUsActivity.from", str);
                A07.putExtra("com.whatsapp.inappsupport.ui.ContactUsActivity.serverStatus", str2);
                if (bundle != null) {
                    Bundle A0D = C17880vN.A0D();
                    String string = bundle.getString("com.whatsapp.support.DescribeProblemActivity.from");
                    String string2 = bundle.getString("com.whatsapp.support.DescribeProblemActivity.serverstatus");
                    String string3 = bundle.getString("com.whatsapp.support.DescribeProblemActivity.emailAddress");
                    String string4 = bundle.getString("com.whatsapp.support.DescribeProblemActivity.description");
                    String string5 = bundle.getString("com.whatsapp.support.DescribeProblemActivity.suspendedEntityJid");
                    if (!TextUtils.isEmpty(string)) {
                        A0D.putString("com.whatsapp.inappsupport.ui.ContactUsActivity.from", string);
                    }
                    if (!TextUtils.isEmpty(string2)) {
                        A0D.putString("com.whatsapp.inappsupport.ui.ContactUsActivity.serverStatus", string2);
                    }
                    if (!TextUtils.isEmpty(string3)) {
                        A0D.putString("com.whatsapp.inappsupport.ui.ContactUsActivity.emailAddress", string3);
                    }
                    if (!TextUtils.isEmpty(string4)) {
                        A0D.putString("com.whatsapp.inappsupport.ui.ContactUsActivity.description", string4);
                    }
                    if (string5 != null) {
                        A0D.putString("com.whatsapp.inappsupport.ui.ContactUsActivity.suspendedEntityJid", string5);
                    }
                    A07.putExtras(A0D);
                }
                if (r12 != null) {
                    A07.putExtra("com.whatsapp.inappsupport.ui.ContactUsActivity.supportUserContext", r12);
                    return A07;
                }
                return A07;
            }
        }
        A07 = C109005cf.A07(this.A00.A00, str, str2);
        if (num != null) {
            A07.putExtra("com.whatsapp.support.DescribeProblemActivity.type", num);
        }
        ArrayList arrayList3 = arrayList;
        if (arrayList != null) {
            A07.putStringArrayListExtra("com.whatsapp.support.DescribeProblemActivity.description.paymentSupportTopicIDs", arrayList3);
        }
        ArrayList arrayList4 = arrayList2;
        if (arrayList2 != null) {
            A07.putStringArrayListExtra("com.whatsapp.support.DescribeProblemActivity.description.paymentSupportTopicTitles", arrayList4);
        }
        if (bundle != null) {
            A07.putExtras(bundle);
            return A07;
        }
        return A07;
    }

    public C132896np(AnonymousClass11S r2, AnonymousClass118 r3, C18030ve r4, C35541mP r5, AnonymousClass1LU r6, AnonymousClass1CM r7) {
        C18070vi.A0w(r4, r2, r7, r5, r3);
        C18070vi.A0d(r6, 6);
        this.A01 = r4;
        this.A02 = r2;
        this.A05 = r7;
        this.A03 = r5;
        this.A00 = r3;
        this.A04 = r6;
    }
}
